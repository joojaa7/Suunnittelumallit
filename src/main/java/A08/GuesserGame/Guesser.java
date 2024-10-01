package A08.GuesserGame;

import A08.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Guesser extends Game {

    private final List<Player> playerList = new ArrayList<>();

    private final Random random = new Random();

    private final Scanner scanner = new Scanner(System.in);

    private final int CORRECT_GUESSES = 1;

    private Player winner;

    @Override
    public void initializeGame(int players){
        for (int i = 0; i < players; i++){
            playerList.add(new Player(String.valueOf(i)));
        }
    }

    @Override
    public boolean endOfGame(){
        for (Player player : playerList){
            if (player.getCorrectGuesses() == CORRECT_GUESSES){
                winner = player;
                return true;
            }
        }
        return false;
    }

    @Override
    public void playSingleTurn(int player){
        System.out.println("Your turn player " + playerList.get(player).getId());
        System.out.println("Guess a number between 1 and 6.");
        int die = random.nextInt(1, 7);
        int guess = Integer.parseInt(scanner.nextLine());
        System.out.println("The die rolled: " + die + ".");
        if (guess == die){
            System.out.println("Congratulations.");
            playerList.get(player).setCorrectGuesses();
            System.out.println(playerList.get(player).getId() + " has " + playerList.get(player).getCorrectGuesses() + " correct guesses.");
        }
        else {
            System.out.println("Unlucky.");
            playerList.get(player).setWrongGuesses();
        }

    }

    @Override
    public void displayWinner(){
        System.out.println("The winner is: ");
        System.out.println("    " + winner.getId());
        System.out.println("With " + winner.getCorrectGuesses() / ( (double) winner.getWrongGuesses() + winner.getCorrectGuesses() ) * 100 + "% accuracy.");
    }

}
