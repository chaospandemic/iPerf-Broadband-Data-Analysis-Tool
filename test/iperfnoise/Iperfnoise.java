package iperfnoise;
/**
 * Write a description of class test here.
 * 
 * @author Donald Willis 
 * @version 0.0.1
 */
import java.io.*;
//this is used to pass text filenames
import java.util.Scanner;
//this is used for our regular expressions
import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Iperfnoise
{
    public static void main(String[] args)throws IOException  {

    
       //System.out.print("Please enter a file to parse. The file extension must be in .txt format\n");
       Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("text.txt")));
            String filename = "nothing";
            while (s.hasNext()) {
                filename = s.next();
                //System.out.println(filename);
                output output = new output();
                try{
                output.throughput(filename);
            }
                catch(Exception exc){
                System.out.println ("could not pass file");
                }
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }

     }
}

