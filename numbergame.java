import java.util.*;

public class numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Number Game!\n");
        System.out.println("Here are the Rules of the Game:\n");
        System.out.println("1. A number will be generated in the range 1-100.");
        System.out.println("2. You will have to Guess the number that is Generated.");
        System.out.println("3. The Number of Chances will be given according to the Level you Choose.");
        System.out.println("4. You Will get 100 Score if guessed at the 1st Chance.");
        System.out.println("5. Your Score will be Cut by 5 for every Chances you take.");
        System.out.println("6. Your Number of Chances will be According to your Choice of Level.");
        System.out.println("7. You can Choose between Easy,Medium and Hard levels.");
        System.out.println("8. Easy: 15 Chances, Medium: 10 Chance, Hard: 5 Chances.\n");
        int opt,n=0,score=0,roundswon=0,roundsplayed=0;
        boolean validchoice,again;
        do{
            roundsplayed++;
            again=false;
            do{
                validchoice=false;
                System.out.println("Press 1 to Start the Game in Easy Mode");
                System.out.println("Press 2 to Start the Game in Medium Mode");
                System.out.println("Press 3 to Start the Game in Hard Mode\n");
                opt=sc.nextInt();
                switch(opt){
                    case 1:
                    n=15;
                    System.out.println("\nLet's start the Game!\n");
                    System.out.println("\nYou Have "+n+" Chances to Guess the Number\n");
                    validchoice=true;
                    break;
                    case 2:
                    n=10;
                    System.out.println("\nLet's start the Game!\n");
                    System.out.println("\nYou Have "+n+" Chances to Guess the Number\n");
                    validchoice=true;
                    break;
                    case 3:
                    n=5;
                    System.out.println("\nLet's start the Game!\n");
                    System.out.println("\nYou Have "+n+" Chances to Guess the Number\n");
                    validchoice=true;
                    break;
                    default:
                    System.out.println("\nEnter a valid choice!\n");
                    break;
                }
            }while(!validchoice);
            int i=1,user;
            int currentscore=100;
            Random ran = new Random();
            int comp = ran.nextInt(100)+1;
            System.out.print("A Number is Generated for You\n\nNow guess and Enter a number: ");
            do{
                user = sc.nextInt();
                if(user==comp){
                    System.out.println("\nCongratulations! You Have Won the Game.\n");
                    roundswon++;
                    break;
                }
                else{
                    currentscore-=5;
                    if(user<comp){
                        int d = comp-user;
                        if(d>0 && d<=5){
                            System.out.println("\nYou are Close but just a Little low from the Generated Number\n");
                        }
                        else if(d>=6 && d<=25){
                            System.out.println("\nYou are Closer but Lower from the Generated Number\n");
                        }
                        else{
                            System.out.println("\nYou are too Far and Lower from the Generated Number\n");
                        }
                    }
                    else{
                        int d = user-comp;
                        if(d>0 && d<=5){
                            System.out.println("\nYou are too Close but Little High from the Generated Number\n");
                        }
                        else if(d>=6 && d<=25){
                            System.out.println("\nYou are Closer but Higher from the Generated Number\n");
                        }
                        else{
                            System.out.println("\nYou are too Far and Higher from the Generated Number\n");
                        }
                    }
                }
                System.out.println(n-i+" Chances left\n");
                if(i!=n){
                    System.out.print("Try Again and Guess a number: ");
                }
                i++;
            }while(i<=n);
            if(i>n){
                currentscore=0;
                System.out.println("\nYou Have Lost the game!\n\nThe Correct Number was: "+comp);
            }
            score+=currentscore;
            System.out.println("Current Score = "+currentscore);
            System.out.println("Total Score = "+score+"\n");
            System.out.println("Total Rounds Played = "+roundsplayed+"\nTotal Rounds Won = "+roundswon+"\n");
            System.out.println("Press 1 to Play Again.");
            System.out.println("Press 2 to Quit the Game.\n");
            opt=sc.nextInt();
            do{
                validchoice=false;
                switch(opt){
                    case 1:
                    validchoice=true;
                    again=true;
                    System.out.println();
                    break;
                    case 2:
                    validchoice=true;
                    again=false;
                    System.out.println("\nThanks for playing the Game!\nKindly Visit Again :)\n");
                    break;
                    default:
                    System.out.println("\nEnter a valid choice\n");
                }
            }while(!validchoice);
        }while(again);
        sc.close();
    }
}
