/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.lang.Math;

public class PairOfDice implements Dice{
    public Integer dice1;
    public Integer dice2;

    public PairOfDice() {
        this.dice1 =(int)(Math.random()*6+1);
        this.dice2 =(int)(Math.random()*6+1);
    }

    public Integer getDice1() {
        return dice1;
    }

    public Integer getDice2() {
        return dice2;
    }

    @Override
    public void roll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
