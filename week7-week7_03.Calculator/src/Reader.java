/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Jeffrey
 */
public class Reader {
    private Scanner scan;
    
    public Reader() {
        this.scan = new Scanner(System.in);
    }
    
    public String readString() {
        return scan.nextLine().toLowerCase();
    }
    
    public int readInteger() {
        return Integer.parseInt(scan.nextLine());
    }
}
