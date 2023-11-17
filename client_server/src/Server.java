import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket server=new ServerSocket(1234);
        Socket client=server.accept();

        ObjectInputStream input=new ObjectInputStream(client.getInputStream());
        Request request= (Request) input.readObject();

        String str=request.getStr();
        int digits=countDigits(str);

        Respond respond=new Respond(digits);

        ObjectOutputStream output=new ObjectOutputStream(client.getOutputStream());
        output.writeObject(respond);
        output.flush();

        client.close();
        server.close();
    }
    public static int countDigits(String str){
        char[] ch=str.toCharArray();
        char[] digits={'0','1','2','3','4','5','6','7','8','9'};

        int count =0;

        for(char dg:digits){
            for(char c:ch){
                if(dg==c)
                    count++;
            }
        }

        return count;
    }
}
