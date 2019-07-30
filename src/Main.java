import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Main {

    int[][]playground = new playground[8000][5];//after that all buckets are already all 0
    static int counter = 0;
    int opNumberA, opNumberB;

    
    public static void main (String[] args)
        {

            int PC1 = (double to int) Math.random()*8000;
            int PC2 = (double to int) Math.random()*8000;

//read text file
public class ReadFile{
    
        String filePath = "D:/aa.txt";
        FileInputStream fin = new FileInputStream(filePath);
        InputStreamReader reader = new InputStreamReader(fin);
        BufferedReader buffReader = new BufferedReader(reader);
        String strTmp = "";
        while((strTmp = buffReader.readLine())!=null){
            System.out.println(strTmp);
        }
        buffReader.close();
   
}

//record player1 player2 and their first instruction numbers opNumberA, opNumberB

//prevent overwrite
            if(opNumberA + opNumberB > 8000)
            {
                System.out.println("error");
            }
            while( PC1 + opNumberA < PC2 && PC1 - opNumberB > PC2 )
            {
                 PC1 = (double to int) Math.random()*8000;
                 PC2 = (double to int) Math.random()*8000;
            }

//do initialization 
            Instruction instruction = new Instruction();
            instruction.translation(PC1);
            instruction.translation(PC2);

//start the game
            do{
//1   return the address of pointer pc1
                PC1 = instruction.play(PC1);
//2   return the address of pointer pc2
                PC2 = instruction.play(PC2);

                counter ++;
            }while (counter<20000 || both not meet DAT 0)

            if(counter == 20000)
            {
                System.out.println("no winner this round");
            }
            else if(player2 meet DAT 0)
            {
                System.out.println("winner is player 1");

//at the place player 2 meet DAT 0   output the front and back 5 buckets’ strings
                for(int i= PC1 - 5; i < PC1 + 5; i++)
                {
                    for(int j=0; j<5;j++)
                    {
                        System.out.println(conversion.playground[i][j]);

                    }
                }
            }
        else if(player1 meet DAT 0)
            {
                System.out.println("winner is player 2");

//at the place player 1 meet DAT 0   output the front and back 5 buckets’ strings
                for(int i= PC2 - 5; i < PC2 + 5; i++)
                {
                    for(int j=0; j<5;j++)
                    {
                        System.out.println(conversion.playground[i][j]);
                    }
                }
            }

        }
}












import org.jetbrains.annotations.NotNull;

public class Instruction {
    int mov(@NotNull int array[][], int current_location)
    {

        switch(array[current_location ][1]*10+array [current_location][3] )
        {
            case 0:array [current_location +array [current_location ][4]]=array [current_location +array [current_location ][2]];
                break;
            case 1:array [current_location +array [current_location ][4] +array [array [current_location ][4] ][4]]=array [current_location+ array [current_location ][2] +array [array [current_location ][2]][2]];
                break;
            case 10:array [current_location +array [current_location ][4]]=array [current_location +array [current_location ][2]];
                break;
            case 11:array [current_location +array [current_location ][4] +array [array [current_location ][4] ][4]]=array [current_location+ array [current_location ][2] +array [array [current_location ][2]][2]];
                break;
            case 20:array [current_location +array [current_location ][4]][4]=array[current_location ][2];
                break;
            case 21:array [current_location +array [array [current_location ][4] ][4]][4]=array[current_location ][2] ;
                break;
            default:  System.out.println("no calculation");
                break;

        }
        return current_location +1;
    }
    int add(@NotNull int array[][], int current_location)
    {
        switch(array[current_location ][1]*10+array [current_location][3] )
        {

        }
        return current_location +1;
    }
    int get()
}


