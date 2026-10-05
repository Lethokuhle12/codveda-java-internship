package com.lethokuhle;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
  

        try{
            Scanner file = new Scanner(new File("input.txt"));
            

                 int lineCount=0,totalWords=0;
                 String[] words;

                while(file.hasNextLine()){



                    String line = file.nextLine();
                    if(!line.trim().isEmpty()){
                        lineCount++;
                        words=line.trim().split("\\s+");
                        totalWords+=words.length;

                    }

                }
                FileWriter writer = new FileWriter("output.txt");

                writer.write("File Analytics"
                          +"\n----------------\n"
                          +"Lines: "+lineCount
                          +"\nWords :"+totalWords);
                System.out.println("File analytics output.txt was successfully created for you to view");
               
                writer.close();

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException io){

            System.out.println(io.getMessage());
        }
        


        
    }
}
