package abcleague;

import java.io.FileReader;
import java.util.Random;
import java.util.Arrays;
import com.opencsv.CSVReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class ABCleague {

  //create fixtures function
    //weekends match block
    public static void createFixtures(List<List<String>> records)
    {
                 for (int i = 1; i < records.size(); i++)
                {
                        for (int j = i+1; j < records.size(); j++)
                        {
                            int leg = 1;                                
                           if(records.get(i) != records.get(j))
                            {
                               //make match fix
                               System.out.println(records.get(i)
                               +"vs"+records.get(j)+" "+"Leg"+leg);
                            }
                           leg++;
                        }
             
                }
                //leg 2 fixtures
               
                 for (int i = 1; i < records.size(); i++)
                {
                        for (int j = i+1; j < records.size(); j++)
                        {
                            int leg = 2;                                
                           if(records.get(i) != records.get(j))
                            {
                               //make match fix
                               System.out.println(records.get(i)
                               +"vs"+records.get(j)+" "+"Leg"+leg);
                            }
                           leg++;
                        }
               }
    }
    public static void weekendFixtures(List<List<String>> records)
    {
        /*int num = 0,o = 0,r=9;
        int weekendFixture = 1;
       Collections.shuffle(records);
       
             for (int i = 0; i < 9; i++)
             {
                        for (int j =i+1;j<90; j++)
                        {
                              System.out.println("Weekend No."+weekendFixture);
                              System.out.println(records.get(i).get(0)+" vs "+records.get(j).get(0)+" Stadium: "+records.get(i).get(0));
                              System.out.println(records.get(i).get(0)+" vs "+records.get(j).get(0)+" Stadium: "+records.get(j).get(0));
                              weekendFixture++;
                              r--;
                              o++;
                        }
                       
               }*/  
             
    }  
    public static void samplingArray(List<List<String>> records)
    {
        String[] localMatches = new String[5];
        String[] ordinary;
        int derby = 1;
        int count = 1;//leg specs
       
        for(int i = 0;i<records.size()-1;i++)
        {
            for(int j = i+1;j<records.size();j++)
            {
                if(records.get(i).get(1) == records.get(j).get(1))
                {
                    System.out.println("Derby Number: "+derby);
                    System.out.println(records.get(i).get(0)+" vs "+records.get(j).get(0)+" "+" Stadium: "+ records.get(i).get(2)+
                            "\n");
                    System.out.println(records.get(j).get(0)+" vs "+records.get(i).get(0)+" Stadium: "+ records.get(j).get(2)+
                            "\n");
                    System.out.println("-------------------Premier---League-----------------------WEEKEND----"+count);
                }
                else
                {
                   
                    System.out.println("WEEKEND "+count);
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    System.out.println("\n"+records.get(i).get(0)+" vs "+records.get(j).get(0)+"      "+" Stadium: "+ records.get(i).get(2)
                            );
                    System.out.println("\n"+records.get(j).get(0)+" vs "+records.get(i).get(0)+"      "+" Stadium: "+ records.get(j).get(2)+
                            "\n");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------------------------------------------- \n");
                    
                }
                count++;
            }
        }
    }
    //identify the derbies
    public static void derbiesIdentify(List<List<String>> records)
    {
        int number = 1;
        System.out.println("------------------DERBIES--------------------NO-:-"+number);
        for(int i = 0;i<records.size();i++)
        {
           
        }
       
    }
    //my main function
    public static void main(String[] args)
    {
     
         List<List<String>> records = new ArrayList<>();
        String COMMA_DELIMITER = ",";
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Caleb Nyaga Thuku\\Desktop\\teams.csv")))
        {
            String line;
            while ((line = br.readLine()) != null)
                 {
                    String[] values = line.split(COMMA_DELIMITER);
                    records.add(Arrays.asList(values));
                }
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      //for loop for output of the csv file data that we want to use
            for(int i = 0; i < records.size(); i++)
                 {  
                 System.out.print(records.get(i).get(0) +  " ");
                 System.out.print(records.get(i).get(1) + " ");
                 System.out.print(records.get(i).get(2) + " ");
                 System.out.println("");
                }  
             System.out.println("CSV read complete \n");
                //loop through the array and identify the clubs with the same hometown.
               //identify derbies
                // System.out.println(array1[0]);
             //createFixtures(records);
            samplingArray(records);
        }
}