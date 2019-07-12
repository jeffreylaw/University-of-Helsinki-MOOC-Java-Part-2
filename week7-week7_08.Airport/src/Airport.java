/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Jeffrey
 */
public class Airport {
    private HashMap<String, Plane> planes;
    private ArrayList<Flight> flights;
    
    public Airport() {
        this.planes = new HashMap<String, Plane>();
        this.flights = new ArrayList<Flight>();
    }
    
    public void addPlane(String id, int capacity) {
        Plane plane = new Plane(id, capacity);
        this.planes.put(id, plane);
    }
    
    public void addFlight(String id, String depCode, String destCode) {
        if (planes.containsKey(id)) {
            for (String key : planes.keySet()) {
                if (key.equals(id)) {
                    Plane plane  = planes.get(key);
                    Flight flight = new Flight(plane, depCode, destCode);
                    flights.add(flight);
                }
            }
        }
    }
    
    public void printPlane(String id) {
        if (planes.containsKey(id)) {
            for (String key : planes.keySet()) {
                if (key.equals(id)) {
                    System.out.println(planes.get(key));
                }
            }
        }
    }
    
    public void printPlanes() {
        for (String key : planes.keySet()) {
            System.out.println(planes.get(key));
        }
    }
    
    public void printFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
