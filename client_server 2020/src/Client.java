import java.net.*;
import java.io.*;
import java.util.*;

public class Client{
    public static void main(String[] args)throws Exception{
        Socket client=new Socket("localhost",1221);
        System.out.println("server connected");

        String str="I love Pakistan";
        Request request=new Request(str);

        ObjectOutputStream output=new ObjectOutputStream(client.getOutputStream());
        output.writeObject(request);
        output.flush();

        ObjectInputStream input=new ObjectInputStream(client.getInputStream());
        Respond respond=(Respond)input.readObject();

        Map<Character,Integer> map=respond.getMap();

        System.out.println("Maximum characters are as follow");
        for(char c:map.keySet()){
            System.out.println(c+":"+map.get(c));
        }
        client.close();
    }
}
