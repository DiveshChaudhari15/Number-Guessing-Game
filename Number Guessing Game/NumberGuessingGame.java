import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        String play = "yes";
        int round = 0, TotalScore = 0, TotalTries = 0;
        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("              **WELCOME THE NUMBER GUESSING GAME**                 ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        System.out.println("                       ***|||LET'S PLAY|||***                      ");
        System.out.println();
        System.out.println("Choose A Number Between 1 To 100. Guess The Number Within 5 Tries");
          while(play.equals("yes"))
          {
             ++round;
             int guess, i, k = 5,tries = 0, score = 5;
             Random rand = new Random();
             int number = rand.nextInt(100);
             for(i=0;i<k;i++)
             {
                System.out.println();
                System.out.println("Guess The Number:");
                  guess = sc.nextInt();
                  if(number == guess)
                  {
                    tries++;
                    System.out.println("Congratulations! You Guessed The Number....");
                    System.out.println();
                      TotalTries += tries;
                      TotalScore += score;
                    System.out.println();
                    System.out.println("Would You Like To Play Again? Yes or No :");
                        play = sc.next().toLowerCase();
                        break;
                  }
                  else if(number > guess && i!=k-1)
                  {
                     System.out.println("The Number Is Greater Than :" +guess);
                     tries++;
                     score--;
                  }
                  else
                  {
                     System.out.println("The Number Is less Than :"  +guess);
                     tries++;
                     score--;
                  }
             }
             if(i==k)
             {
                System.out.println("You Have Exhausted 5 Tries.");
                System.out.println("The Number Was" +number);
                  TotalTries += tries;
                  TotalScore += score;
                  result(tries,score);
                System.out.println();
                System.out.println("Would You Like To Play Again? Yes or No :");
                         play = sc.next().toLowerCase();
             }
            
          }
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("                       ***|||SCOREBOARD|||***                        ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|  ROUNDS  |   TOTAL_TRIES   |  TOTAL_SCORE   |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|    "+round+"    |     "+TotalTries+"    |     "+TotalScore+"      |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------");
        }
        static void result(int tries, int score)
        {
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("|   tries   |   score   }");
        System.out.println("-----------------------------------");
        System.out.println("|   "+tries+"   |   "+score+"   |");
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");  
        }
    }
