/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bettech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Eusuph
 */
public class Sun extends Observable {

    int total = 0;
    int counter;
    int dayCount = 24;
    int midDay = 12;

    void send() {

        for (counter = 0; counter < dayCount; counter++) {

            if (counter < midDay) {
                setChanged();
                notifyObservers(counter);
                total++;
                try {
                    Thread.sleep(1000);

                } catch (Exception e) {
                    System.out.println("Error Occured.");
                }
                System.out.println("EXIT: " + Thread.activeCount());
            }

        }

    }

}
