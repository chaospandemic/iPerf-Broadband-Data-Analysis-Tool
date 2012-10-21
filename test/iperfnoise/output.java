package iperfnoise;
/**
 * Write a description of class regex here.
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

class output {
  
  public static void throughput(String filename) throws Exception {
      //This starts processing the data for 0-1 sec
        //this gets the first set of throughput data to the WEST Server
      FileReader fr = new FileReader("input\\"+filename);
      BufferedReader br = new BufferedReader(fr);
      FileWriter fw = new FileWriter("output\\west0-1"+filename);
      BufferedWriter bw = new BufferedWriter(fw);
      
      
      String lineString = null;
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  0.0- 1.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
            //System.out.println ("iteration: " + x);
            }
      
      FileWriter efw = new FileWriter("output\\east0-1"+filename);
      BufferedWriter ebw = new BufferedWriter(efw);
            
      //this gets the first set of throughput data to the EAST Server  
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  0.0- 1.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
           
      //This gets the second set of data to the West Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  0.0- 1.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
        }
        //This gets the second set of data to the EAST Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  0.0- 1.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
              bw.close();
              fw.close();
              br.close();
              fr.close();
              ebw.close();
              efw.close();
              
              
            //This starts processing the data for 1-2 sec 
                     
      fr = new FileReader("input\\"+filename);
      br = new BufferedReader(fr);
      fw = new FileWriter("output\\west1-2"+filename);
      bw = new BufferedWriter(fw);
      
      
      lineString = null;
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  1.0- 2.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
            //System.out.println ("iteration: " + x);
            }
      
      efw = new FileWriter("output\\east1-2"+filename);
      ebw = new BufferedWriter(efw);
            
      //this gets the first set of throughput data to the EAST Server  
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  1.0- 2.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
           
      //This gets the second set of data to the West Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  1.0- 2.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
        }
        //This gets the second set of data to the EAST Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  1.0- 2.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
              bw.close();
              fw.close();
              br.close();
              fr.close();
              ebw.close();
              efw.close();
            //end process 1-2 sec
  
  
  //This starts processing the data for 2-3 sec 
                     
      fr = new FileReader("input\\"+filename);
      br = new BufferedReader(fr);
      fw = new FileWriter("output\\west2-3"+filename);
      bw = new BufferedWriter(fw);
      
      
      lineString = null;
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  2.0- 3.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
            //System.out.println ("iteration: " + x);
            }
      
      efw = new FileWriter("output\\east2-3"+filename);
      ebw = new BufferedWriter(efw);
            
      //this gets the first set of throughput data to the EAST Server  
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  2.0- 3.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
           
      //This gets the second set of data to the West Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  2.0- 3.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
        }
        //This gets the second set of data to the EAST Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  2.0- 3.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
              bw.close();
              fw.close();
              br.close();
              fr.close();
              ebw.close();
              efw.close();
            //end process 2-3 sec
  
  
  //This starts processing the data for 3-4 sec 
                     
      fr = new FileReader("input\\"+filename);
      br = new BufferedReader(fr);
      fw = new FileWriter("output\\west3-4"+filename);
      bw = new BufferedWriter(fw);
      
      
      lineString = null;
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  3.0- 4.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
            //System.out.println ("iteration: " + x);
            }
      
      efw = new FileWriter("output\\east3-4"+filename);
      ebw = new BufferedWriter(efw);
            
      //this gets the first set of throughput data to the EAST Server  
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  3.0- 4.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
           
      //This gets the second set of data to the West Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  3.0- 4.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
        }
        //This gets the second set of data to the EAST Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  3.0- 4.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
              bw.close();
              fw.close();
              br.close();
              fr.close();
              ebw.close();
              efw.close();
            //end process 3-4 sec

            //This starts processing the data for 4-5 sec 
                     
      fr = new FileReader("input\\"+filename);
      br = new BufferedReader(fr);
      fw = new FileWriter("output\\west3-4"+filename);
      bw = new BufferedWriter(fw);
      
      
      lineString = null;
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  4.0- 5.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
            //System.out.println ("iteration: " + x);
            }
      
      efw = new FileWriter("output\\east4-5"+filename);
      ebw = new BufferedWriter(efw);
            
      //this gets the first set of throughput data to the EAST Server  
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  4.0- 5.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
           
      //This gets the second set of data to the West Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  4.0- 5.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
        }
        //This gets the second set of data to the EAST Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  4.0- 5.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
              bw.close();
              fw.close();
              br.close();
              fr.close();
              ebw.close();
              efw.close();
            //end process 4-5 sec  
         
            //This starts processing the data for 3-4 sec 
                     
      fr = new FileReader("input\\"+filename);
      br = new BufferedReader(fr);
      fw = new FileWriter("output\\west5-6"+filename);
      bw = new BufferedWriter(fw);
      
      
      lineString = null;
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  5.0- 6.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
            //System.out.println ("iteration: " + x);
            }
      
      efw = new FileWriter("output\\east5-6"+filename);
      ebw = new BufferedWriter(efw);
            
      //this gets the first set of throughput data to the EAST Server  
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  5.0- 6.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
           
      //This gets the second set of data to the West Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  5.0- 6.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
        }
        //This gets the second set of data to the EAST Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  5.0- 6.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
              bw.close();
              fw.close();
              br.close();
              fr.close();
              ebw.close();
              efw.close();
            //end process 5-6 sec
            
            //This starts processing the data for 6-7 sec 
                     
      fr = new FileReader("input\\"+filename);
      br = new BufferedReader(fr);
      fw = new FileWriter("output\\west6-7"+filename);
      bw = new BufferedWriter(fw);
      
      
      lineString = null;
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  6.0- 7.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
            //System.out.println ("iteration: " + x);
            }
      
      efw = new FileWriter("output\\east6-7"+filename);
      ebw = new BufferedWriter(efw);
            
      //this gets the first set of throughput data to the EAST Server  
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  6.0- 7.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
           
      //This gets the second set of data to the West Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  6.0- 7.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
        }
        //This gets the second set of data to the EAST Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  6.0- 7.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
              bw.close();
              fw.close();
              br.close();
              fr.close();
              ebw.close();
              efw.close();
            //end process 6-7 sec
            
            //This starts processing the data for 7-8 sec 
                     
      fr = new FileReader("input\\"+filename);
      br = new BufferedReader(fr);
      fw = new FileWriter("output\\west7-8"+filename);
      bw = new BufferedWriter(fw);
      
      
      lineString = null;
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  7.0- 8.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
            //System.out.println ("iteration: " + x);
            }
      
      efw = new FileWriter("output\\east7-8"+filename);
      ebw = new BufferedWriter(efw);
            
      //this gets the first set of throughput data to the EAST Server  
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  7.0- 8.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
           
      //This gets the second set of data to the West Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  7.0- 8.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
        }
        //This gets the second set of data to the EAST Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  7.0- 8.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
              bw.close();
              fw.close();
              br.close();
              fr.close();
              ebw.close();
              efw.close();
            //end process 7-8 sec
            
            //This starts processing the data for 8-9 sec 
                     
      fr = new FileReader("input\\"+filename);
      br = new BufferedReader(fr);
      fw = new FileWriter("output\\west8-9"+filename);
      bw = new BufferedWriter(fw);
      
      
      lineString = null;
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  8.0- 9.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
            //System.out.println ("iteration: " + x);
            }
      
      efw = new FileWriter("output\\east8-9"+filename);
      ebw = new BufferedWriter(efw);
            
      //this gets the first set of throughput data to the EAST Server  
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  8.0- 9.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
           
      //This gets the second set of data to the West Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  8.0- 9.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
        }
        //This gets the second set of data to the EAST Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  8.0- 9.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
              bw.close();
              fw.close();
              br.close();
              fr.close();
              ebw.close();
              efw.close();
            //end process 8-9 sec
            
            //This starts processing the data for 9-10 sec 
                     
      fr = new FileReader("input\\"+filename);
      br = new BufferedReader(fr);
      fw = new FileWriter("output\\west9-10_"+filename);
      bw = new BufferedWriter(fw);
      
      
      lineString = null;
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 2: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  9.0- 10.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
            //System.out.println ("iteration: " + x);
            }
      
      efw = new FileWriter("output\\east9-10_"+filename);
      ebw = new BufferedWriter(efw);
            
      //this gets the first set of throughput data to the EAST Server  
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 4: Iperf TCP West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  9.0- 10.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
           
      //This gets the second set of data to the West Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 5: Iperf TCP East....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  9.0- 10.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              bw.write(lineString);
              bw.newLine();
            }
        }
        //This gets the second set of data to the EAST Server
      while((lineString= br.readLine())!= null && !lineString.equals("Starting Test 6: Ping West....")){
          
          Pattern pattern = 
          Pattern.compile("\\[  [0-6]]\\  9.0- 10.0 sec.*[1-9]..*[0-9]*.[0-9][0-9] Kbits/sec");
          Matcher matcher = pattern.matcher(lineString);
          if(matcher .matches()){
              ebw.write(lineString);
              ebw.newLine();
            }
        }
              bw.close();
              fw.close();
              br.close();
              fr.close();
              ebw.close();
              efw.close();
            //end process 9-10 sec
        }
}