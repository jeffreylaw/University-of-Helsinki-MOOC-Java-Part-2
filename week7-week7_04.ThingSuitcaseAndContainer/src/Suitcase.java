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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing) {
        if (thing.getWeight() + this.totalWeight() <= this.maxWeight) {
            things.add(thing);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Thing thing : this.things) {
            weight += thing.getWeight();
        }
        return weight;
    }
    
    public void printThings() {
        for (Thing thing : this.things) {
            System.out.println(thing);
        }
    }
    
    public Thing heaviestThing() {
        if (this.things.size() <= 0) {
            return null;
        }
        Thing heaviest = this.things.get(0);
        for (int i = 1; i < this.things.size(); i++) {
            if (this.things.get(i).getWeight() > heaviest.getWeight()) {
                heaviest = this.things.get(i);
            }
        }
        return heaviest;
    }
    
    public String toString() {
        String check = "";
        if (this.things.size() == 0) {
            check = "empty";
        } else if (this.things.size() == 1) {
            check = "thing";
        } else {
            check = "things";
        }
        return this.things.size() + " " + check + " (" 
                + this.totalWeight() + " kg)";
    }
}
