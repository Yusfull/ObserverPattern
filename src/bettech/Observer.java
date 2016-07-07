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
public interface Observer {
    
     void update(Observable o, Object arg);
     void onDayStart(int start);
     int onHourChange(int hour);
     void dayEnd(int end);
    
}
