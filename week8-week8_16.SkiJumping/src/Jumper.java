/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Jeffrey
 */
public class Jumper implements Comparable<Jumper> {
    private String name;
    private int points;
    private Random rand;
    private int lastJumpLength;
    
    public Jumper(String name, int points) {
        this.name = name;
        this.points = 0;
        this.rand = new Random();
    }
    
    public Jumper(String name) {
        this(name, 0);
    }
    
    public int getLastJumpLength() {
        return this.lastJumpLength;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void jump() {
        int jumpLength = rand.nextInt(61) + 60;
        lastJumpLength = jumpLength;
        points += jumpLength;
        System.out.println("    length: " + jumpLength);
    }
    
    public void addPoints(int points) {
        this.points += points;
    }
    
    public String toString() {
        return this.name + " (" + this.points + " points)";
    }
    
    public int compareTo(Jumper jumper) {
        return this.points - jumper.points;
    }
}
