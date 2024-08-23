
//Allow two users to play rock paper scissors and keep a count:
//the number of ties
//the number of wins per player
//the total number of times played

//import statement
import java.util.Scanner;

public class RPS {

    static void playGame(String play1, String play2){
        //This method actually simulates the game of rock paper scissors.
        
        //Scanner object
        Scanner scan = new Scanner(System.in);

        //variables
        int counTie = 0;
        int play1_Wins = 0;
        int play2_Wins = 0;
        int countTotal = 0;
        String response;

        System.out.println("\nTo play this game , enter the words 'rock', 'paper'," +
        "\nor 'scissors' in all lowercase when asked.\n");


        do{

            System.out.println(play1 + ", what will you play: 'rock', 'paper', or 'scissors' ?\nEnter the word below: ");
            String play1_ans = scan.nextLine().toLowerCase();

            if (!play1_ans.equalsIgnoreCase("rock") && !play1_ans.equalsIgnoreCase("paper") && !play1_ans.equalsIgnoreCase("scissors")){
                System.out.println("ERROR - Invalid input entered!");
                break;
                
            }
            System.out.println(play2 + ", what will you play: 'rock', 'paper', or 'scissors' ?\nEnter the word below:");
            String play2_ans = scan.nextLine().toLowerCase();

            if (!play2_ans.equalsIgnoreCase("rock") && !play2_ans.equalsIgnoreCase("paper") && !play2_ans.equalsIgnoreCase("scissors")){
                System.out.println("ERROR - Invalid input entered!");
                break;

            }

            if(play1_ans.equals(play2_ans)){
                System.out.println("It's a tie!\nNo points for either player!!");
                counTie +=1;
                countTotal+=1;

            }else if(play1_ans.equalsIgnoreCase("rock")){

                if(play2_ans.equalsIgnoreCase("paper")){
                    System.out.println(play2 + " wins! Paper beats rock!");
                    play2_Wins++;
                    countTotal+=1;

                }else if(play2_ans.equalsIgnoreCase("scissors")){
                    System.out.println(play2 + " wins! Rock beats scissors!");
                    play1_Wins++;
                    countTotal+=1;

                }

            }else if (play1_ans.equalsIgnoreCase("paper")){

                if(play2_ans.equalsIgnoreCase("rock")){
                    System.out.println(play1 + " wins! Paper beats rock!");
                    play1_Wins++;
                    countTotal+=1;

                }else if (play2_ans.equalsIgnoreCase("scissors")){
                    System.out.println(play2 + " wins! Scissors beats paper!");
                    play2_Wins++;
                    countTotal+=1;

                }

            }else if(play1_ans.equalsIgnoreCase("scissors")){    
                
                if(play2_ans.equalsIgnoreCase("paper")){
                    System.out.println(play1 + " wins! Scissors beats paper!");
                    play1_Wins++;
                    countTotal+=1;

                }else if(play2_ans.equalsIgnoreCase("rock")){
                    System.out.println(play2 + " wins! Rock beats scissors!");
                    play2_Wins++;
                    countTotal+=1;


                }

            }

            System.out.println("\nWould you like to play again?\nEnter Y for YES or N for NO: ");
            response = scan.nextLine().toUpperCase();

            if(response.equals("N")){
                System.out.println("\nYou chose to end the game. Here are the results: ");
                System.out.println("Total Games Played: " + countTotal);
                System.out.println("Number of Ties: " + counTie);
                System.out.println("Number of times " + play1 + " has won: " + play1_Wins);
                System.out.println("Number of times " + play2 + " has won: " + play2_Wins);
                break;

            }

        }while(response.equals("Y"));


        //close scanner
        scan.close();

    }
    

    public static void main(String[] args) {

        //Scanner object
        Scanner scan = new Scanner(System.in);

        //variables
        String player1;
        String player2;

        System.out.println("Enter your name player 1: ");
        player1 = scan.nextLine();

        System.out.println("\nEnter your name player 2: ");
        player2 = scan.nextLine();

        //method
        playGame(player1, player2);

        //close scanner
        scan.close();

        
    }
    
}
