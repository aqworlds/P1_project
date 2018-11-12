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
public class Infantry extends FightingForce{

    public Infantry() {
        super();
    }
    public Infantry(int attackValue, int defenseValue) {
        super(attackValue, defenseValue);
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

//    @Override
//    public String toString() {
//        return "(" + getAttackValue() + ", " + getDefenseValue();
//    }
      
      
    }
