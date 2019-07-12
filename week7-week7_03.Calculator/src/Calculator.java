/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey
 */
public class Calculator {
    private Reader reader;
    private int numOfOperations;
    
    public Calculator() {
        this.reader = new Reader();
    }
    
    public void start() {
      while (true) {
          System.out.print("command: ");
          String command = reader.readString();
          if (command.equals("end")) {
              break;
          }

          if (command.equals("sum")) {
              sum();
          } else if (command.equals("difference")) {
              difference();
          } else if (command.equals("product")) {
              product();
          }
      }

      statistics();
  }
    
    private void sum() {
        int[] array = readInput();
        int sum = array[0] + array[1];
        System.out.println("sum of the values " + sum + "\n");
        
        numOfOperations++;
    }
    
    private void difference() {
        int[] array = readInput();
        int difference = array[0] - array[1];
        System.out.println("difference of the values " + difference + "\n");    
        
        numOfOperations++;
    }
    
    private void product() {
        int[] array = readInput();
        int product = array[0] * array[1];
        System.out.println("product of the values " + product + "\n");
        
        numOfOperations++;
    }
    
    private int[] readInput() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();   
        int[] array = {value1, value2};
        return array;
    }
    
    private void statistics() {
        System.out.println("Calculations done " + this.numOfOperations);
    }
        
}
