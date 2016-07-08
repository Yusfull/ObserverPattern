/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bettech;

/**
 *
 * @author Eusuph
 */
public interface Subject {
    
     int onDayStart(int start);
     int onHourChange(int hour);
     void onDayEnd(int end);
}
