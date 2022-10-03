//Guesser Game App
//This is simple guesser game app.

import java.util.Scanner;
class Guesser
{
    int gnum;
    
    int guessingNum()
    {
        System.out.println("Guesser, Guess a number :");
        Scanner scan = new Scanner(System.in);
        gnum=scan.nextInt();
        return gnum;
    }
}

class Player
{
    int pnum;
    
    int predictingNum()
    {
        System.out.println("Player, Predict a number :");
        Scanner scan = new Scanner(System.in);
        pnum=scan.nextInt();
        return pnum;
    }
}

class Umpire
{
    int numGuesser;
    int numPlayer1;
    int numPlayer2;
    int numPlayer3;
    
    void collectingNumGuesser()
    {
        Guesser g= new Guesser();
        numGuesser=g.guessingNum();
    }
    
    void collectingNumPlayers()
    {
        Player p1= new Player();
        Player p2= new Player();
        Player p3= new Player();
        numPlayer1=p1.predictingNum();
        numPlayer2=p2.predictingNum();
        numPlayer3=p3.predictingNum();
        
    }
    
    void compare()
    {
    if(numPlayer1==numGuesser)
    {
    System.out.println("Player 1 Wins!");
    }
    else if(numPlayer2==numGuesser)
    {
    System.out.println("Player 2 Wins!");
    }
    else if(numPlayer2==numGuesser)
    {
    System.out.println("Player 3 Wins!");
    }
    else
    {
    System.out.println("Game Lost,Try again!");
    }
}
}
    
class Main
{
    public static void main(String[] args)
    {
        Umpire u= new Umpire();
        u.collectingNumGuesser();
        u.collectingNumPlayers();
        u.compare();
    }
}

