package net.mgvyshinskiy.designpatterns.gof.adapter;

public class BigBadBoss {
    public static void doThings(Boss boss) throws InterruptedException {
        boss.beGentleWithSecretary();

        Thread.sleep(1500);

        boss.thinkHigh();
    }
}
