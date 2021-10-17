package com.company;

import javax.sound.midi.SoundbankResource;
import java.lang.annotation.Target;

//System.out.println(createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage() + " " +
//                    createHeroes()[i].getAbility());

public class Main {

    public static void main(String[] args) {


        Boss boss = new Boss();
        boss.setDamage(12);
        boss.setHealth(100);
        boss.setProtection("Magic");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getProtection());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println( + createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage() + " " +
                    createHeroes()[i].getAbility());
        }
    }

    public static Hero[] createHeroes() {
        Hero spider = new Hero(212, "Magic ", 65);
        Hero kaaa = new Hero(550, "Jump");
        Hero iron = new Hero(200, "Jeleso", 222);
        Hero[] heroes = {spider, kaaa, iron};
        return heroes;
    }
}
