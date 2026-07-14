package File_Handing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class First_File {
    public static void main(String a[])  {

        //code to create new file
        File my=new File("purvish.txt");

        try {

            my.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




        //code to write file
        try {
            FileWriter fileWriter=new FileWriter("purvish.txt");
            fileWriter.write("Jay Mahakaal");
            fileWriter.write("Har Har Mahadev");
            fileWriter.write("Shree Mahakali maa\n purvish");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        //Reading a file
        try {
            Scanner sc=new Scanner(my);
            while (sc.hasNextLine())
            {
                String s=sc.nextLine();
                System.out.println(s);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



        //File to deleted
        if(my.delete())
        {
            System.out.println("FILE IS DELETED" + my.getName());
        }else{
            System.out.println("Error is there bro");
        }




    }


}