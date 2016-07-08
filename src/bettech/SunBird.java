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
public class SunBird implements java.util.Observer, Subject {
    
    @Override
    public void update(Observable o, Object arg) {
        
        System.out.println(onDayStart((Integer) arg));
        System.out.println("FLOWER: " + onHourChange((Integer)arg));
        
    }
     /*
      * every hour the sunbird randomly selects a flower to feed on
      */
    @Override
    public int onHourChange(int timer) {
        int flowerTracker = 0;
        int maxFlowers = 12;
        int minFlowers = 1;
        System.out.println("HOUR CHANGE: " + timer);
        Random random = new Random();
        int picker = random.nextInt(maxFlowers - minFlowers + 1) + minFlowers;
        if (picker != flowerTracker) {
            return picker;
        }else{
            picker = random.nextInt(maxFlowers - minFlowers + 1) + minFlowers;
        }
        
        return picker;
    }
    
    /*
     * this method recieves an hour of the day so as to tell the bird to wake up its feeding time
     */    

    /**
     *
     * @param hour
     * @return
     */
    
    @Override
    public int onDayStart(int hour) {
        
        if (hour < 1) {
            System.out.println("DAY START: " + hour);            
        } else {
            //System.out.println("HOUR CHANGE: " + onHourChange(hour));
        }        
        return hour;
    }
    
    /*
     * method mainly to tell the sunbird to go to sleep
     */
    @Override
    public void onDayEnd(int end){
        if(end >= 22){
            
        }
        
    }

    
}
