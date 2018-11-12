/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_2069817_2071517;

/**
 *
 * @author danielcarvalho
 */
public abstract class  FightingForce {

    protected int attackValue;
    protected int defenseValue;

    public FightingForce() {
        attackValue = 0;
        defenseValue = 0;
    }

    public FightingForce(int attackValue, int defenseValue) {
        this.attackValue = attackValue;
        this.defenseValue = defenseValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getDefenseValue() {
        return defenseValue;
    }
    
    public abstract int attack();
    public abstract int defense();
    

    @Override
    public String toString() {
         return  getAttackValue() + ", " + getDefenseValue();
    }
    
    
    
    
}
