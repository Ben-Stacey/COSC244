package Lab2;

import java.io.*;
                                                                                                                                                                                                                                             
   public class Byte{                                                                                                                                                                                                                        
       public static void main(String[]args){                                                                                                                                                                                                
           InputStream in = System.in;                                                                                                                                                                                                       
           OutputStream out = System.out;                                                                                                                                                                                                    
           try{                                                                                                                                                                                                                              
               int content = 0;                                                                                                                                                                                                              
               while((content=in.read()) != -1){                                                                                                                                                                                             
                  out.write(content);                                                                                                                                                                                                       
              }                                                                                                                                                                                                                             
          }catch(IOException e){                                                                                                                                                                                                            
              System.out.print(e);                                                                                                                                                                                                          
          }                                                                                                                                                                                                                                 
      }                                                                                                                                                                                                                                     
  } 