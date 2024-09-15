package A07;

import java.util.Scanner;

public class Player {

    private Level level;
    private final String name;
    private int exp;
    private int hp = 5;
    private final Scanner scanner = new Scanner(System.in);
    private boolean gameOver = false;

    public Player(String name){
        level = new Novice(this);
        this.name = name;
    }

    public void start(){
        while (!gameOver){
            level.action();
        }
        System.out.println("Game over.");
    }

    public void gainExp(){
        System.out.println("You gain 5 experience points.");
        exp += 5;
    }

    public int getExp(){
        return exp;
    }

    public void gainHp(){
        System.out.println("You gain 5 hitpoints.");
        hp += 5;
    }

    public int getHp(){
        return hp;
    }

    public void combat(){
        exp += 10;
        hp -= 5;
        System.out.println("You gain 10 experience points but lose 5 hitpoints.");
    }

    public void setLevel(Level level){
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String play(){
        System.out.println("Name: " + name);
        System.out.println("Level: " + level.getClass().getSimpleName());
        System.out.println("Hitpoints: " + hp);
        System.out.println("Experience: " + exp);
        System.out.println("Choose an action:");
        System.out.println("T = train, M = meditate, F = fight");

        return scanner.nextLine().toUpperCase();
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
