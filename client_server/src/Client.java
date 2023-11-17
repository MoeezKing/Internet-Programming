import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws Exception{
        Socket client=new Socket("localhost",1234);

        String s="My number is 3520203761483";
        Request request=new Request(s);

        ObjectOutputStream output=new ObjectOutputStream(client.getOutputStream());
        output.writeObject(request);
        output.flush();

        ObjectInputStream input=new ObjectInputStream(client.getInputStream());
        Respond respond=(Respond) input.readObject();

        System.out.println("number of digits are "+respond.getCount());

        client.close();
    }
}
