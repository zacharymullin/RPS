import java.util.Scanner;

public class RPS
{
    public static int wins = 0;
    public static int losses = 0;
    public static int draws = 0;
    public static String plays[] = {"Paper", "Rock", "Scissors"};

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = "y";
        int cpuPlay;
        int humanPlay;

        System.out.println("RPS");
        System.out.println("***********************");
        System.out.println("");
        while(input.equals("y")){
            cpuPlay = (int) (Math.random()*3+1);
            System.out.println("What do you play? 1 - Paper, 2 - Rock, 3 - Scissors");
            humanPlay = sc.nextInt();
            if(humanPlay > 3 || humanPlay < 1) System.out.println("Invalid input.");
            else if(humanPlay == cpuPlay) draw(cpuPlay, humanPlay);
            else if(humanPlay == 3 && cpuPlay == 1 ) win(cpuPlay, humanPlay);
            else if(cpuPlay == 3 && humanPlay == 1) loss(cpuPlay, humanPlay);
            else if(humanPlay < cpuPlay) win(cpuPlay, humanPlay);
            else if(cpuPlay < humanPlay) loss(cpuPlay, humanPlay);
            System.out.println("Play again? [y/n]");
            input = sc.next();
        }
        System.out.println("Wins: " + wins + " Losses: " + losses + " Draws: " + draws);
    }

    public static void win(int cpu, int human){
        wins++;
        System.out.println("I played " + plays[cpu - 1] + ". You played " + plays[human - 1] + ". You win.");   
    }

    public static void loss(int cpu, int human){
        losses++;
        System.out.println("I played " + plays[cpu - 1] + ". You played " + plays[human - 1] + ". I win.");   
    }

    public static void draw(int cpu, int human){
        draws++;
        System.out.println("I played " + plays[cpu - 1] + ". You played " + plays[human - 1] + ". A draw.");
    }
}
