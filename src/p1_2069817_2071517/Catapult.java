/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_2069817_2071517;

import java.util.Random;

/**
 *
 * @author danielcarvalho
 */
public class Catapult extends FightingForce{

    public Catapult() {
        super();
    } 
    
    public Catapult(int attackValue, int defenseValue) {
        super(100, 1);
    }
  
    @Override
      public int attack(){
        Random randomNumber = new Random();
        int attack = randomNumber.nextInt(this.attackValue);
        return attack;
      }
      
    @Override
      public int defense(){
        int defense = this.defenseValue;
        return defense;
      }
    }
