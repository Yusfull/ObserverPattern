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
        
        for (int i = 0; i < 10; i++) {
            
        }
        System.out.println((Integer)arg);
    }


    public void onDayStart(int start) {
        System.out.println("Open");
    }


    public void dayEnd(int end) {
        if (end> 22) {
            System.out.println("Close:" + end);
        }
        
    }
    
}
