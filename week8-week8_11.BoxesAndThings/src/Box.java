/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Jeffrey
 */
public class Box implements ToBeStored {
    private double maxWeight;
    private double weight;
    private ArrayList<ToBeStored> storage;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.weight = 0;
        this.storage = new ArrayList<ToBeStored>();
    }
    
    public double weight() {
        double weight = 0;
        for (ToBeStored stored : storage) {
            weight += stored.weight();
        }
        return weight;
    }
    
    public void add(ToBeStored toStore) {
        if (toStore.weight() + weight() <= this.maxWeight) {
            storage.add(toStore);
        }
    }
    
    public String toString() {
        return "Box: " + storage.size() + " things, total weight " + 
                this.weight() + " kg";
    }
}
