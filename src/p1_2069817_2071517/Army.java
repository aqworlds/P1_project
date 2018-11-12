/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_2069817_2071517;

import java.util.ArrayList;

/**
 *
 * @author danielcarvalho
 */
public class Army{
    
    private ArrayList<FightingForce> attackList;
    private ArrayList<FightingForce> defenseList;

    public Army(int catapultas) {
        this.attackList =  new ArrayList<FightingForce>();
        this.defenseList =  new ArrayList<FightingForce>();
        
        for (int i = 0; i < catapultas; i++) {
             this.attackList.add(new Catapult(14, 24));
        }
       
                
    }
    
    public int attack(){
        int damage = 0;
        for (FightingForce attackForce : attackList) {
            damage += attackForce.attack();
        }
        return damage;
    }
    
//    public int defense(damage){
//        for (FightingForce defenseForce : defenseList) {
//            damage -= defenseForce.defense();
//        }
//    }
    
    
    
}
