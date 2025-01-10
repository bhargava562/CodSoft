//Bhargava A codsoft Task 1.

//importing util package for random class
import java.util.*;

//main class
public class numberguessing {
    public static void main(String[] args) {
        //instantiating both classes
        Random num = new Random();
        Scanner ob = new Scanner(System.in);

        int usernum,randnum,userattempts=50,flag=0;
        do
        {
            System.out.println("Number of Moves Remaining: "+userattempts);
            System.out.print("Enter the Number: ");
            usernum = ob.nextInt();
            //setting bound to 101 for 0-100
            randnum = num.nextInt(101);
    
            //checking
            if(usernum==randnum)
            {
                System.out.println("Hurray!...You Guessed it Correct\n");
                flag=1;
                break;
            }
            else if(usernum>randnum)
            {
                System.out.println("Your guess is High... Try Again!\n");
            }
            else {
                System.out.println("Your Guess is low... Try again\n");
            }

            //decrease the moves
            userattempts--;
        }
        while(usernum!=randnum && userattempts>0);
    
    //if number is not guessed and out of moves
     if(flag==0)
        {
            System.out.println("Game Over\n");
        System.out.println("Oops!.. You are Out of Moves Try Again.\n");
        }
        ob.close();
    }
}
