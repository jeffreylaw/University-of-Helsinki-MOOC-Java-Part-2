/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author Jeffrey
 */
public class JumperInterface {
    private Map<Jumper, String> jumpersInfo;
    private ArrayList<Jumper> jumpers;
    private Scanner scan;
    
    public JumperInterface(Scanner scan) {
        this.jumpersInfo = new HashMap<Jumper, String>();
        this.jumpers = new ArrayList<Jumper>();
        this.scan = scan;
    }
    
    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        addJumpersInterface();
        jumpInterface();
    }
    
    public void addJumpersInterface() {
            while (true) {
            System.out.print("  Participant name: ");
            String input = scan.nextLine();
            if (input.trim().isEmpty()) {
                break;
            }
            Jumper jump = new Jumper(input);
            jumpers.add(jump);
            jumpersInfo.put(jump, "jump lengths: ");
        }
        System.out.println();
        
        System.out.println("The tournament begins!\n");
            
    }
    
    public void printJumpers() {
        for (Jumper jumper : jumpers) {
            System.out.println(jumper);
        }
    }
    
    public void printJumpingOrder() {
        for (int i = 0; i < jumpers.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + jumpers.get(i));
        }
        System.out.println();
    }
    
    public void jumpInterface() {
        JudgeScore judgeScore = new JudgeScore();
        int roundNumber = 1;
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String input = scan.nextLine();
            if (!input.trim().equals("jump")) {
                break;
            }
            
            System.out.println("Round " + roundNumber + "\n");
            
            System.out.println("Jumping order:");
            if (roundNumber > 1) {
                Collections.sort(jumpers);
            }
            printJumpingOrder();
            
            /*
            After printing jump, begin round with jump + judge votes
            */
            System.out.println("Results of round " + roundNumber);
            for (int i = 0; i < jumpers.size(); i++) {
                System.out.println("  " + jumpers.get(i).getName());
                jumpers.get(i).jump();
                judgeScore.generateVotes();
                judgeScore.printVotes();
                jumpers.get(i).addPoints(judgeScore.score());
                String length = jumpers.get(i).getLastJumpLength() + "m";
                jumpersInfo.put(jumpers.get(i), 
                        jumpersInfo.get(jumpers.get(i)) + " " +  length);
            }
            
            
            
            
            
            
            roundNumber++;
            System.out.println();
        }
        System.out.println("Thanks!\n");
        System.out.println("Tournament results: ");
        results();
    }
    
    public void results() {
        System.out.println("Position    Name");
        int position = 1;
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        for (Jumper jumper : this.jumpers) {
            System.out.print(position + "           ");
            System.out.println(jumper);
            System.out.print("            ");
            System.out.println(jumpersInfo.get(jumper));
            position++;
        }
        
        /* Results unsorted */
//        for (Jumper jumper : jumpersInfo.keySet()) {
//            System.out.print(position + "           ");
//            System.out.println(jumper);
//            System.out.print("            ");
//            System.out.println(jumpersInfo.get(jumper));
//            position++;
//        }
    }
}
