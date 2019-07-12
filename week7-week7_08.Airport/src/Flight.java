/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey
 */
public class Flight {
    private Plane plane;
    private String departureCode;
    private String destinationCode;
    
    public Flight(Plane plane, String departureCode, String destinationCode) {
        this.plane = plane;
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
    }
    
    public Plane getPlane() {
        return this.plane;
    }
    
    public String getDepatureCode() {
        return this.departureCode;
    }
    
    public String getDestinationCode() {
        return this.destinationCode;
    }
    
    public String toString() {
        return this.plane.toString() + " (" 
                + this.departureCode 
                + "-" + this.destinationCode + ")";
    }
}
