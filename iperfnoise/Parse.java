package iperfnoise;


import java.io.*;
//this is used to pass text filenames
import java.util.Scanner;
//this is used for our regular expressions
import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * This class processes the Iperf data from seconds 1.0-10.0 and creates 20 output files, one for each second on the west server, and one for each second for the east server
 * 
 * @author Donald Willis
 * @version 0.0.3 alpha
 */
public class Parse
{
    public static void process() throws IOException{
        Scanner s = null;

        FileWriter fw = new FileWriter("temp\\west0-1thoughputdata.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        FileWriter efw = new FileWriter("temp\\east0-1throughputdata.txt");
        BufferedWriter ebw = new BufferedWriter(efw); 
        
        //
        //The try statement reads filenames from inputfile.txt, then processes every file for the regular expression, its broken up by east and west server and by seconds
        //the output of this code creates 2 files for every second of processed data regardless of how many files are pulled from the inputfile.txt
        //Each second of throughput data parsing is separated by commenting to increase readability.
        //
        
        //
        //This block processes the 0-1 second data
        //
        try {
            s = new Scanner(new BufferedReader(new FileReader("inputfile.txt")));
            String filename = "nothing";
            while (s.hasNext()) {
                filename = s.next();
               

                FileReader fr = new FileReader("input\\"+filename);
                BufferedReader br = new BufferedReader(fr);

                String lineString = null;
                //gets the fist set of data on WEST Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  0.0- 1.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                    //System.out.println ("iteration: " + x);
                }

                //this gets the first set of throughput data to the EAST Server  
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  0.0- 1.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }

                //This gets the second set of data to the West Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  0.0- 1.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                }
                //This gets the second set of data to the EAST Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  0.0- 1.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }
                
                try{    
                

                }
                catch(Exception exc){
                    System.out.println ("could not pass file");
                }
            }
        } finally {
            if (s != null) {
                System.out.println ("Finished processing 0-1 second data");
                s.close();
            }
        }
        
        //
        //This block processes the 1-2 second data
        //
        
        s = null;

        fw = new FileWriter("temp\\west1-2thoughputdata.txt");
        bw = new BufferedWriter(fw);
        efw = new FileWriter("temp\\east1-2throughputdata.txt");
        ebw = new BufferedWriter(efw); 
        
        //
        //The try statement reads filenames from inputfile.txt, then processes every file for the regular expression, its broken up by east and west server and by seconds
        //the output of this code creates 2 files for every second of processed data regardless of how many files are pulled from the inputfile.txt
        //
        

        try {
            s = new Scanner(new BufferedReader(new FileReader("inputfile.txt")));
            String filename = "nothing";
            while (s.hasNext()) {
                filename = s.next();
                

                FileReader fr = new FileReader("input\\"+filename);
                BufferedReader br = new BufferedReader(fr);

                String lineString = null;
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  1.0- 2.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                    //System.out.println ("iteration: " + x);
                }

                //this gets the first set of throughput data to the EAST Server  
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  1.0- 2.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }

                //This gets the second set of data to the West Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  1.0- 2.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                }
                //This gets the second set of data to the EAST Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  1.0- 2.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }
                
                try{    
                    

                }
                catch(Exception exc){
                    System.out.println ("could not pass file");
                }
            }
        } finally {
            if (s != null) {
                System.out.println ("Finished processing 1-2 second data");
                s.close();
            }
        }
        
        
        //
        //This block processes the 2-3 second data
        //
        
        s = null;

        fw = new FileWriter("temp\\west2-3thoughputdata.txt");
        bw = new BufferedWriter(fw);
        efw = new FileWriter("temp\\east2-3throughputdata.txt");
        ebw = new BufferedWriter(efw); 
        
        //
        //The try statement reads filenames from inputfile.txt, then processes every file for the regular expression, its broken up by east and west server and by seconds
        //the temp of this code creates 2 files for every second of processed data regardless of how many files are pulled from the inputfile.txt
        //
        

        try {
            s = new Scanner(new BufferedReader(new FileReader("inputfile.txt")));
            String filename = "nothing";
            while (s.hasNext()) {
                filename = s.next();
                

                FileReader fr = new FileReader("input\\"+filename);
                BufferedReader br = new BufferedReader(fr);

                String lineString = null;
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  2.0- 3.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                    //System.out.println ("iteration: " + x);
                }

                //this gets the first set of throughput data to the EAST Server  
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  2.0- 3.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }

                //This gets the second set of data to the West Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  2.0- 3.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                }
                //This gets the second set of data to the EAST Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  2.0- 3.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }
                
                try{    

                }
                catch(Exception exc){
                    System.out.println ("could not pass file");
                }
            }
        } finally {
            if (s != null) {
                System.out.println ("Finished processing 2-3 second data");
                s.close();
            }
        }

        
        //
        //This block processes the 3-4 second data
        //
        
        s = null;

        fw = new FileWriter("temp\\west3-4thoughputdata.txt");
        bw = new BufferedWriter(fw);
        efw = new FileWriter("temp\\east3-4throughputdata.txt");
        ebw = new BufferedWriter(efw); 
        
        //
        //The try statement reads filenames from inputfile.txt, then processes every file for the regular expression, its broken up by east and west server and by seconds
        //the output of this code creates 2 files for every second of processed data regardless of how many files are pulled from the inputfile.txt
        //
        

        try {
            s = new Scanner(new BufferedReader(new FileReader("inputfile.txt")));
            String filename = "nothing";
            while (s.hasNext()) {
                filename = s.next();
                

                FileReader fr = new FileReader("input\\"+filename);
                BufferedReader br = new BufferedReader(fr);

                String lineString = null;
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  3.0- 4.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                    //System.out.println ("iteration: " + x);
                }

                //this gets the first set of throughput data to the EAST Server  
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  3.0- 4.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }

                //This gets the second set of data to the West Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  3.0- 4.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                }
                //This gets the second set of data to the EAST Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  3.0- 4.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }
                
                try{    

                }
                catch(Exception exc){
                    System.out.println ("could not pass file");
                }
            }
        } finally {
            if (s != null) {
                System.out.println ("Finished processing 3-4 second data");
                s.close();
            }
        }
        
        
        //
        //This block processes the 4-5 second data
        //
        
        s = null;

        fw = new FileWriter("temp\\west4-5thoughputdata.txt");
        bw = new BufferedWriter(fw);
        efw = new FileWriter("temp\\east4-5throughputdata.txt");
        ebw = new BufferedWriter(efw); 
        
        //
        //The try statement reads filenames from inputfile.txt, then processes every file for the regular expression, its broken up by east and west server and by seconds
        //the output of this code creates 2 files for every second of processed data regardless of how many files are pulled from the inputfile.txt
        //
        

        try {
            s = new Scanner(new BufferedReader(new FileReader("inputfile.txt")));
            String filename = "nothing";
            while (s.hasNext()) {
                filename = s.next();
                

                FileReader fr = new FileReader("input\\"+filename);
                BufferedReader br = new BufferedReader(fr);

                String lineString = null;
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  4.0- 5.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                    //System.out.println ("iteration: " + x);
                }

                //this gets the first set of throughput data to the EAST Server  
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  4.0- 5.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }

                //This gets the second set of data to the West Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  4.0- 5.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                }
                //This gets the second set of data to the EAST Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  4.0- 5.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }
                
                try{    

                }
                catch(Exception exc){
                    System.out.println ("could not pass file");
                }
            }
        } finally {
            if (s != null) {
                System.out.println ("Finished processing 4-5 second data");
                s.close();
            }
        }
        
        
        //
        //This block processes the 5-6 second data
        //
        
        s = null;

        fw = new FileWriter("temp\\west5-6thoughputdata.txt");
        bw = new BufferedWriter(fw);
        efw = new FileWriter("temp\\east5-6throughputdata.txt");
        ebw = new BufferedWriter(efw); 
        
        //
        //The try statement reads filenames from inputfile.txt, then processes every file for the regular expression, its broken up by east and west server and by seconds
        //the output of this code creates 2 files for every second of processed data regardless of how many files are pulled from the inputfile.txt
        //
        

        try {
            s = new Scanner(new BufferedReader(new FileReader("inputfile.txt")));
            String filename = "nothing";
            while (s.hasNext()) {
                filename = s.next();
                

                FileReader fr = new FileReader("input\\"+filename);
                BufferedReader br = new BufferedReader(fr);

                String lineString = null;
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  5.0- 6.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                    //System.out.println ("iteration: " + x);
                }

                //this gets the first set of throughput data to the EAST Server  
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  5.0- 6.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }

                //This gets the second set of data to the West Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  5.0- 6.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                }
                //This gets the second set of data to the EAST Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  5.0- 6.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }
                
                try{    

                }
                catch(Exception exc){
                    System.out.println ("could not pass file");
                }
            }
        } finally {
            if (s != null) {
                System.out.println ("Finished processing 5-6 second data");
                s.close();
            }
        }
        
        
        //
        //This block processes the 6-7 second data
        //
        
        s = null;

        fw = new FileWriter("temp\\west6-7thoughputdata.txt");
        bw = new BufferedWriter(fw);
        efw = new FileWriter("temp\\east6-7throughputdata.txt");
        ebw = new BufferedWriter(efw); 
        
        //
        //The try statement reads filenames from inputfile.txt, then processes every file for the regular expression, its broken up by east and west server and by seconds
        //the output of this code creates 2 files for every second of processed data regardless of how many files are pulled from the inputfile.txt
        //
        

        try {
            s = new Scanner(new BufferedReader(new FileReader("inputfile.txt")));
            String filename = "nothing";
            while (s.hasNext()) {
                filename = s.next();
                

                FileReader fr = new FileReader("input\\"+filename);
                BufferedReader br = new BufferedReader(fr);

                String lineString = null;
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  6.0- 7.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                    //System.out.println ("iteration: " + x);
                }

                //this gets the first set of throughput data to the EAST Server  
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  6.0- 7.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }

                //This gets the second set of data to the West Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  6.0- 7.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                }
                //This gets the second set of data to the EAST Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  6.0- 7.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }
                
                try{    

                }
                catch(Exception exc){
                    System.out.println ("could not pass file");
                }
            }
        } finally {
            if (s != null) {
                System.out.println ("Finished processing 6-7 second data");
                s.close();
            }
        }
        
        
        //
        //This block processes the 7-8 second data
        //
        
        s = null;

        fw = new FileWriter("temp\\west7-8thoughputdata.txt");
        bw = new BufferedWriter(fw);
        efw = new FileWriter("temp\\east7-8throughputdata.txt");
        ebw = new BufferedWriter(efw); 
        
        //
        //The try statement reads filenames from inputfile.txt, then processes every file for the regular expression, its broken up by east and west server and by seconds
        //the output of this code creates 2 files for every second of processed data regardless of how many files are pulled from the inputfile.txt
        //
        

        try {
            s = new Scanner(new BufferedReader(new FileReader("inputfile.txt")));
            String filename = "nothing";
            while (s.hasNext()) {
                filename = s.next();
                

                FileReader fr = new FileReader("input\\"+filename);
                BufferedReader br = new BufferedReader(fr);

                String lineString = null;
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  7.0- 8.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                    //System.out.println ("iteration: " + x);
                }

                //this gets the first set of throughput data to the EAST Server  
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  7.0- 8.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }

                //This gets the second set of data to the West Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  7.0- 8.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                }
                //This gets the second set of data to the EAST Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  7.0- 8.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }
                
                try{    

                }
                catch(Exception exc){
                    System.out.println ("could not pass file");
                }
            }
        } finally {
            if (s != null) {
                System.out.println ("Finished processing 7-8 second data");
                s.close();
            }
        }
        
        
        //
        //This block processes the 8-9 second data
        //
        
        s = null;

        fw = new FileWriter("temp\\west8-9thoughputdata.txt");
        bw = new BufferedWriter(fw);
        efw = new FileWriter("temp\\east8-9throughputdata.txt");
        ebw = new BufferedWriter(efw); 
        
        //
        //The try statement reads filenames from inputfile.txt, then processes every file for the regular expression, its broken up by east and west server and by seconds
        //the output of this code creates 2 files for every second of processed data regardless of how many files are pulled from the inputfile.txt
        //
        

        try {
            s = new Scanner(new BufferedReader(new FileReader("inputfile.txt")));
            String filename = "nothing";
            while (s.hasNext()) {
                filename = s.next();
                

                FileReader fr = new FileReader("input\\"+filename);
                BufferedReader br = new BufferedReader(fr);

                String lineString = null;
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  8.0- 9.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                    //System.out.println ("iteration: " + x);
                }

                //this gets the first set of throughput data to the EAST Server  
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  8.0- 9.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }

                //This gets the second set of data to the West Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  8.0- 9.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                }
                //This gets the second set of data to the EAST Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  8.0- 9.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }
                
                try{    

                }
                catch(Exception exc){
                    System.out.println ("could not pass file");
                }
            }
        } finally {
            if (s != null) {
                System.out.println ("Finished processing 8-9 second data");
                s.close();
            }
        }
        
        
         //
        //This block processes the 8-9 second data
        //
        
        s = null;

        fw = new FileWriter("temp\\west9-10thoughputdata.txt");
        bw = new BufferedWriter(fw);
        efw = new FileWriter("temp\\east9-10throughputdata.txt");
        ebw = new BufferedWriter(efw); 
        
        //
        //The try statement reads filenames from inputfile.txt, then processes every file for the regular expression, its broken up by east and west server and by seconds
        //the output of this code creates 2 files for every second of processed data regardless of how many files are pulled from the inputfile.txt
        //
        

        try {
            s = new Scanner(new BufferedReader(new FileReader("inputfile.txt")));
            String filename = "nothing";
            while (s.hasNext()) {
                filename = s.next();
                

                FileReader fr = new FileReader("input\\"+filename);
                BufferedReader br = new BufferedReader(fr);

                String lineString = null;
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  9.0-10.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                    //System.out.println ("iteration: " + x);
                }

                //this gets the first set of throughput data to the EAST Server  
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  9.0-10.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }

                //This gets the second set of data to the West Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  9.0-10.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        bw.write(matcher.group(1));
                        bw.newLine();
                    }
                }
                //This gets the second set of data to the EAST Server
                while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){

                    Pattern pattern = 
                        Pattern.compile("\\[  [0-6]]\\  9.0-10.0 sec.*[1-9].*KBytes\\s*(.*Kbits/sec)");
                    Matcher matcher = pattern.matcher(lineString);
                    if(matcher .matches()){
                        ebw.write(matcher.group(1));
                        ebw.newLine();
                    }
                }
                
                try{    

                }
                catch(Exception exc){
                    System.out.println ("could not pass file");
                }
            }
        } finally {
            if (s != null) {
                System.out.println ("Finished processing 9-10 second data");
                s.close();
            }
        }
    }
}