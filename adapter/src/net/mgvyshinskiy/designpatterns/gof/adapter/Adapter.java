package net.mgvyshinskiy.designpatterns.gof.adapter;

public class Adapter {
    public static void main(String[] args) throws InterruptedException {
        BossAdapter adapter = new BossAdapter(new EskiYabanTurpu());

        BigBadBoss.doThings(adapter);
    }
}
