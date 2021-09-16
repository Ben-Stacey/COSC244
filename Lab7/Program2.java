package Lab7;
import java.io.*;
import java.net.*;
import java.util.*;

public class Program2{
    private PrintWriter output;
    private BufferedReader input;
    private Date date = new Date();

    public Program2(Socket socket) throws Exception{
        output = new PrintWriter(socket.getOutputStream(), true);
        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    //recieves the information
    public void startReceiving() throws Exception{
        while(true){
            String line;
            System.err.println(">>Them: ");
            if((line = input.readLine()) != null){
                System.out.println(line);
            }
            Scanner stdin = new Scanner(System.in);
            System.out.println(">>You: " );
            if(stdin.hasNextLine()){
                output.println(stdin.nextLine());
            }
        }
    }

    //sends the information
    public void startSending() throws Exception{
        while(true){
            Scanner stdin = new Scanner(System.in);
            System.out.println(">>You: " );
            if(stdin.hasNextLine()){
                output.println(stdin.nextLine());
            }
            String line;
            System.err.println(">>Them: ");
            if((line = input.readLine()) != null){
                System.out.println(line);
            }
            
        }
    }

    //does the socket connection
    public static void main(String[] args){
        Socket socket = null;
        try{
            int port = Integer.parseInt(args[0]);
            if(args.length > 1){
                socket = new Socket(args[1], port);
                System.err.println("Connected to " + args[1] + " on port " + port);
                Program2 example = new Program2(socket);
                example.startSending();
            }else{
                ServerSocket serverSocket = new ServerSocket(port);
                System.err.println("Waitin for someone to connect");
                socket = serverSocket.accept();
                System.err.println("Accepted connection on port " + port);
                Program2 example = new Program2(socket);
                example.startReceiving();
            }
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("\nUsage: java Program1 <port> [host]");
        }
    }
}
