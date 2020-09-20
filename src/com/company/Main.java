package com.company;

public class Main {


    public static void main(String[] args) {
        Boss boss= new Boss();
        boss.setBosshealt(700);
        boss.setBossdamage(200);
        boss.setBossdefense("Magical");
        System.out.println("bosshealt" + "--" + boss.getBosshealt());
        System.out.println("bossdamage" + "--" + boss.getBossdamage());
        System.out.println("bossdefense" + "--" + boss.getBossdefense());


    }
}
