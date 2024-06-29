import java.util.*;
public class NumberGame
{
    Scanner in = new Scanner(System.in);
    int tattempt = 0;
    public int number(int random)
    {
        int input,n=0,randnum,attempt=0;
        randnum = random;
        while(n<6)
        {
          System.out.print("Guess the number:");
          input = in.nextInt();
          if(randnum == input)
          {
            System.out.println("You have guessed the correct answer!");
            attempt++;
            break;
          }
          else if(randnum > input)
          {
            System.out.println("Your Guess is too Low!");
          }
          else
          {
            System.out.println("Your Guess is too High!");
          }
          n++;
        }
        if(n == 6)
        {
            System.out.println("Sorry! You have Used 6 attempts.The number is:"+randnum);
        }
        return attempt;
    }
    public void nextGame()
    {
        while(true)
        {
            System.out.println("Do you want to play (y/n):");
            char choice = in.next().charAt(0);
            if(choice == 'y')
            {
                Random rand1 = new Random();
                int randnum1 = rand1.nextInt(100);
                tattempt += number(randnum1);
            }
            else if(choice == 'n')
            {
                System.out.println("Thank you for Playing!");
                System.out.println("You have Won "+tattempt+" times!");
                break;
            }
            else
            {
                System.out.println("Invlid choice please enter either y/n");
            }
        }
    }
    public static void main(String args[])
    {
        NumberGame game = new NumberGame();
        System.out.println("You have to Guess the number in 6 attempts");
        game.nextGame();
    }
}