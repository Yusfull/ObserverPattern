/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bettech;

import java.util.Observable;

import java.util.Random;

/**
 *
 * @author Eusuph
 */
public class SunBird implements java.util.Observer {
    
    @Override
    public void update(Observable o, Object arg) {
        
        System.out.println(onDayStart((Integer) arg));
        System.out.println("FLOWER: " + onHourChange((Integer)arg));
        
    }
     /*
      * every hour the sunbird randomly selects a flower to feed on
      */
    public int onHourChange(int timer) {
        int maxFlowers = 12;
        int minFlowers = 1;
        Random random = new Random();
        int picker = random.nextInt(maxFlowers - minFlowers + 1) + minFlowers;
        return picker;
    }
    
    /*
     * this method recieves an hour of the day so as to tell the bird to wake up its feeding time
     */    
    public int onDayStart(int hour) {
        
        if (hour < 1) {
            System.out.println("DAY START: " + hour);            
        } else {
            System.out.println("HOUR CHANGE: " + onHourChange(hour));
        }        
        return hour;
    }
    
    /*
     * method mainly to tell the sunbird to go to sleep
     */
    public void onDayEnd(int end){
        if(end >= 22){
            
        }
        
    }
    
}
