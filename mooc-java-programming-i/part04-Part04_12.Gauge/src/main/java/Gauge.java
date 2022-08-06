/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davba
 */
public class Gauge {

    private int value;

    public Gauge() {

    }
    
    public void increase() {
        if (value < 5) {
            this.value++;
        }
    }
    
    public void decrease() {
        if (value > 0) {
            this.value--;
        }
    }
    
    public int value() {
        return this.value;
    }
    
    public boolean full() {
        if (value == 5) {
            return true;
        } else {
            return false;
        }
    }
}
