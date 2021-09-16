import java.io.*;
import java.util.*;
import java.lang.*;

public class program2{
    public static void main(String[]args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = System.out;
        StringBuilder str;
        try{
            String content = in.readLine();
            while(content != null){
                str = new StringBuilder(content).reverse();
                System.out.println(str.toString());
                content = in.readLine();
            }
        }catch(IOException e){
            System.out.print(e);
        }
    }
}
