/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bettech;

import java.util.Observable;


/**
 *
 * @author Eusuph
 */
public class Flower implements java.util.Observer, Subject{

    @Override
    public void update(Observable o, Object arg) {
        int flowerVisitState = 0;
        for (int i = 0; i < 12; i++) {
            flowerVisitState++;
        }
        
    }


    @Override
    public int onDayStart(int start) {
       System.out.println("Open"); 
       return start;
    }

    /**
     *
     * @param end
     */
    @Override
    public void onDayEnd(int end) {
        if (end> 22) {
            System.out.println("Close:" + end);
        }
        
    }

    /**
     *
     * @param hour
     * @return
     */
    @Override
    public int onHourChange(int hour) {
        return hour;
    }
    
}
