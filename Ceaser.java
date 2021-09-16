import java.io.*;

public class Ceaser{
    public static void main(String[]args){

        //this is the input in and out of the program
        InputStream in = System.in;
        OutputStream out = System.out;
        InputStream caveat = System.in;
        
        int shift = Integer.parseInt(args[0]);
        int i = 0;
        try{
            //this does the comparisom operation
            while(( i = in.read()) != -1){
                i = (i + shift) %255;
                out.write(i);
            }
            out.close();
        }catch(IOException e){
            System.out.print(e);
        }
    }
}
