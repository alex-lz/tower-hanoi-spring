package com.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class HanoiMovements {
	
    private static List<Hanoi> Records;
    private static HanoiMovements regd = null;
    private HanoiMovements() {
        Records = new ArrayList<Hanoi>();
    }
    
    public static HanoiMovements getInstance() {
        if(regd == null) {
            regd = new HanoiMovements();
            return regd;
        } else {
        	Records.clear();
        	System.out.println(" => Tower of Hanoi - Movements List");
            return regd;
        }
    }  
    
    // Java recursive function to solve tower of hanoi puzzle 
    static void towerOfHanoi(int n, char from_tower, char to_tower, char aux_tower, int A, int B, int C) 
    { 

    	Hanoi hanoi = new Hanoi();
    	hanoi.setDisk(n);
    	hanoi.setSource(from_tower);
    	hanoi.setDestination(to_tower);

        if (n == 1) 
        { 
            System.out.println("Move disk 1 from Tower " +  from_tower + " to Tower " + to_tower); 
            Records.add(hanoi);
            return; 
        } 
        towerOfHanoi(n-1, from_tower, aux_tower, to_tower, A, B, C); 
        System.out.println("Move disk " + n + " from Tower " +  from_tower + " to Tower " + to_tower); 
        Records.add(hanoi);
        towerOfHanoi(n-1, aux_tower, to_tower, from_tower, A, B, C); 
    } 
    
    public List<Hanoi> getMovements(int Num) {
    	towerOfHanoi(Num, 'A', 'C', 'B', Num, 0, 0);  // A, B and C are names of towers
        return Records;
    }
    
}
