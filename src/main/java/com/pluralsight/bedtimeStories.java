package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class bedtimeStories {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader(("goldilocks.txt"));
            FileReader fileReader2 = new FileReader(("hansel_and_gretel.txt"));
            FileReader fileReader3 = new FileReader(("mary_had_a_little_lamb.txt"));

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
            BufferedReader bufferedReader3 = new BufferedReader(fileReader3);

            String line;
            int number = 1;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(number + ". " + line);
                number++;
            }
            fileReader.close();
            bufferedReader.close();
            //End of number 1


            String line2;
            int number2 = 1;

            while ((line2 = bufferedReader2.readLine()) != null){
                System.out.println(number2 + ". " + line2);
                number2++;
            }
            fileReader2.close();
            bufferedReader2.close();
            //End of number 2

            String line3;
            int number3 = 1;

            while ((line3 = bufferedReader.readLine()) != null){
                System.out.println(number3 + ". " + line3);
                number3++;
            }
            fileReader3.close();
            bufferedReader3.close();


        }
        catch (Exception e) {
            System.out.println("Something is wrong.");
        }
    }

}
