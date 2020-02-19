package com.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class HanoiMovements {
	
    private static List<Hanoi> carRecords;
    private static HanoiMovements carregd = null;
    //private static Hanoi hanoi = new Hanoi();;
    private HanoiMovements() {
        carRecords = new ArrayList<Hanoi>();
    }
    
    public static HanoiMovements getInstance() {
        if(carregd == null) {
            carregd = new HanoiMovements();
            return carregd;
        } else {
        	carRecords.clear();
        	System.out.println();
            return carregd;
        }
    }  
    
    // Java recursive function to solve tower of hanoi puzzle 
    static void towerOfHanoi(int n, char from_tower, char to_tower, char aux_tower) 
    { 
    	Hanoi hanoi = new Hanoi();
    	hanoi.setDisk(n);
    	hanoi.setSource(from_tower);
    	hanoi.setDestinacion(to_tower);
        if (n == 1) 
        { 
            System.out.println("Move disk 1 from Tower " +  from_tower + " to Tower " + to_tower); 
            carRecords.add(hanoi);
            return; 
        } 
        towerOfHanoi(n-1, from_tower, aux_tower, to_tower); 
        System.out.println("Move disk " + n + " from Tower " +  from_tower + " to Tower " + to_tower); 
        carRecords.add(hanoi);
        towerOfHanoi(n-1, aux_tower, to_tower, from_tower); 
    } 
    
    public List<Hanoi> getCarRecords(int Num) {
    	towerOfHanoi(Num, 'A', 'C', 'B');  // A, B and C are names of towers
        return carRecords;
    }
    
}
