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
public class SunBird implements java.util.Observer{

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("Flower:" + onHourChange((Integer) arg));

    }

    public int onHourChange(int timer) {
        int maxFlowers = 12;
        int minFlowers = 1;
        Random random = new Random();
        int picker = random.nextInt(maxFlowers - minFlowers + 1) + minFlowers;
        return picker;
    }

  

}
