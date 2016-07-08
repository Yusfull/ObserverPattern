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
public class TestObserver {
    public static void main(String[] args) {
        
        Sun sunObservable = new Sun();
        Flower flower = new Flower();
        SunBird sunBird = new SunBird();
        
        sunObservable.addObserver(flower);
        sunObservable.addObserver(sunBird);
        sunObservable.send();
    }
    
}
