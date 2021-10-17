package com.company;

public class Boss {
    private int health;
    private String protection;
    private int damage;

    public void setHealth(int health) {
        if (health < 0) {
            System.out.println("Wrong number");
        } else {
            this.health = health;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    public String getProtection() {
        return protection;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }
}


