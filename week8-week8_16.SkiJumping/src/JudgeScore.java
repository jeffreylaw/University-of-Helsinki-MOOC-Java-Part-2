/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Jeffrey
 */
public class JudgeScore {
    private int[] votes;
    private Random rand;
    
    
    public JudgeScore() {
        this.votes = new int[5];
        this.rand = new Random();
    }
    
    public void generateVotes() {
        for (int i = 0; i < 5; i++) {
            votes[i] = rand.nextInt(11) + 10;
        }
    } 
    
    public int[] getVotes() {
        return votes;
    }

    public void printVotes() {
        System.out.println("    judge votes: " + Arrays.toString(votes));
    }
    
    public int score() {
        Arrays.sort(votes);
//        System.out.println("Votes" + Arrays.toString(votes));
        return votes[1] + votes[2] + votes[3];
    }
}
