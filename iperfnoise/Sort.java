package iperfnoise;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Write a description of class Sort here.
 * 
 * @author Donald Willis
 * @version 0.0.3 alpha
 */
public class Sort
{

    /**
     * Constructor for objects of class Sort
     */
    public void it() throws Exception
    {

        ArrayList<String> rows = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader("crap.txt"));

        String s;
        while((s = reader.readLine())!=null)
            rows.add(s);

        Collections.sort(rows);

        FileWriter writer = new FileWriter("crapoutput.txt");
        for(String cur: rows)
            writer.write(cur+"\n");

        reader.close();
        writer.close();

    }
}
