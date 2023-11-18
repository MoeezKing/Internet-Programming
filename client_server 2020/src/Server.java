import java.net.*;
import java.io.*;
import java.util.*;

public class Server{
    public static void main(String[] args)throws Exception{
        ServerSocket server=new ServerSocket(1221);
        Socket client=server.accept();
        System.out.println("client connected");

        ObjectInputStream input=new ObjectInputStream( client.getInputStream());
        Request request=(Request) input.readObject();

        String str=request.getStr();
        Map<Character,Integer> map=countMaximum(str);
        Respond respond=new Respond(map);

        ObjectOutputStream output=new ObjectOutputStream(client.getOutputStream());
        output.writeObject(respond);
        output.flush();

        client.close();
        server.close();
   }
    public static Map<Character, Integer> countMaximum(String str){
        char[] string=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();

        int max=1;
        for(char c:string){
            if(c==' ')
                continue;

            if(map.containsKey(c)){
                int value=map.get(c)+1;
                map.replace(c,value);

                if(value>max)
                    max=value;
            }else{
                map.put(c,1);
            }
        }

        char[] keys=new char[map.size()];
        int i=0;
        for(char c:map.keySet()){
            keys[i]=c;
            i++;
        }
        for(char c:keys){
            if(map.containsKey(c) && map.get(c)<max)
                map.remove(c);
        }
        return map;
    }
}