package com.example.stringandint;

public class Demo {
    public static void main(String[] args) {
        Player carlosPlayer = new Player();
        System.out.println(carlosPlayer.getHandleName());
        carlosPlayer.handleName = "Carlos";
        System.out.println(carlosPlayer.getHandleName());
        carlosPlayer.lives = 20;
        carlosPlayer.level = 1;
        carlosPlayer.score = 0;

        Player triniPlayer = new Player();
        triniPlayer.handleName = "Trinidad";
        triniPlayer.setHandleName("Trinidad");
        System.out.println(triniPlayer.getHandleName());

        Enemy enemy = new Enemy("test enemy",10, 3);
        enemy.showInfo();
        enemy.takeDamage(3);
        enemy.showInfo();

        Troll uglyTroll = new Troll("Ugly Troll");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(30);


    }
}
