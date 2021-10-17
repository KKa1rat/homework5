package com.company;

public class Hero {
   private int health;
   private String ability;
   private int damage;

    public Hero(int health, String ability ) {
        this.health = health;
        this.ability = ability;
    }
    public Hero(int health, String ability, int damage){
        this.health = health;
        this.ability = ability;
        this.damage = damage;
    }
    public int getHealth (){
        return health;
    }
    public String getAbility(){
        return ability;
    }
    public int getDamage() {
        return damage;
    }
}
