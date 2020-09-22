package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBosshealt(700);
        boss.setBossdamage(200);
        boss.setBossdefense("Magical");
        System.out.println("bosshealt" + "--" + boss.getBosshealt());
        System.out.println("bossdamage" + "--" + boss.getBossdamage());
        System.out.println("bossdefense" + "--" + boss.getBossdefense());
        for (Hero hero : createHeroes()) {
            System.out.println(hero.getDamage());
            System.out.println(hero.getHerohealt());
            System.out.println(hero.getSuperobbility());
        }
        System.out.println();

    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(800, 270, "Magical");
        Hero hero2 = new Hero(500, 300, "Kinetic");
        Hero hero3 = new Hero(400, 230, "Physical");
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }

}