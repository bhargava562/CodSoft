//Bhargava A CodSoft Task 2

import java.util.*;

public class studentgradecalculator {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        //array for subject names
        String []subjects = {"Language","English","Mathematics","Science","Social Science"};
        
        int i,totalmarks=0,marks;
        double averagemarks;

        char overallgrade;
        System.out.println("Grade Calculator\n");
        
        //taking inputs and calculating total
        for(i=0;i<5;i++)
        {
            System.out.print("Enter your "+subjects[i]+" marks: ");
            marks = ob.nextInt();
            totalmarks+=marks;
        }

        //calculating averagemarks
        averagemarks = totalmarks/5.0;

        //calculating grade
        if(averagemarks>90)
        {
            overallgrade='A';
        }
        else if(averagemarks>70)
        {
            overallgrade='B';
        }
        else if(averagemarks>50)
        {
            overallgrade='C';
        }
        else if(averagemarks>40)
        {
            overallgrade='D';
        }
        else {
            overallgrade='F';
        }
        
        System.out.println("\nYour Total Marks: "+totalmarks);
        System.out.println("Your Average Percentage: "+averagemarks);
        System.out.println("Your Grade: "+overallgrade);

        ob.close();
    }    
}
