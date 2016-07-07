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
public class Flower implements java.util.Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("open flower: " + (Integer)arg);
    }


    public void onDayStart(int start) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int onHourChange(int hour) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void dayEnd(int end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
