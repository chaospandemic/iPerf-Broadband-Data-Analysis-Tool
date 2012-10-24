package iperfnoise;
/**
 * Write a description of class test here.
 * 
 * @author Donald Willis 
 * @version 0.0.3 alpha
 */
import java.io.*;

public class Iperfnoise
{
    public static void main(String[] args) throws Exception{
        System.out.println ("Starting the Iperf on Wireless Noise Calculator");
        System.out.println ("Author: Donald Willis\n");
        System.out.println ("Starting to Parse Iperf data");
        Parse.process();
       
        System.out.println ("\nStarting to sort throughput data");
        
        Sort sort = new Sort();
        sort.it(); 

     }
}

