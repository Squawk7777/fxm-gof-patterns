package net.mgvyshinskiy.designpatterns.gof.adapter;

public class BossAdapter implements Boss {
    private EskiYabanTurpu unpronounceableStuff;

    public BossAdapter(EskiYabanTurpu badass) {
        unpronounceableStuff = badass;
    }

    @Override
    public void beGentleWithSecretary() {
        unpronounceableStuff.araSekreteri();
    }

    @Override
    public void thinkHigh() {
        unpronounceableStuff.paraAl();
    }
}
