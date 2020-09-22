package com.company;

public class Hero {
    private int herohealt;
    private int damage;
    private String superobbility;

    public Hero(int herohealt, int damage, String superobbility) {
        this.herohealt = herohealt;
        this.damage = damage;
        this.superobbility = superobbility;
    }

    public Hero(int herohealt, int damage) {
        this.herohealt = herohealt;
        this.damage = damage;
    }

    public int getHerohealt() {
        return herohealt;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperobbility() {
        return superobbility;
    }

}
