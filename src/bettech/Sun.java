/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bettech;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

/**
 *
 * @author Eusuph
 */
public class Sun extends Observable {
    private List<Observer> observersList = new ArrayList<>();

    int counter;
    int dayCount = 24;
    int midDay = 12;



    void onDayEnd(int end) {
        System.out.println("DAY END: " + end);
    }

    public List<Observer> getObserversList() {
        return observersList;
    }

    public void setObserversList(List<Observer> observersList) {
        this.observersList = observersList;
    }
    
    

    void send() {

        for (counter = 0; counter < dayCount; counter++) {
            if (counter < midDay) {
                setChanged();
                notifyObservers(counter);
                try {
                    Thread.sleep(midDay);
                } catch (Exception e) {
                    System.out.println("Error Occured.");
                }
            } else {
                onDayEnd(midDay - 2);
            }
        }

    }
    

}
