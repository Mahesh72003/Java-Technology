package com.xworkz.methodoverride44;

public class Rugby extends Activity {
    @Override
    public void start() {
        System.out.println("Rugby match has kicked off.");
    }

    @Override
    public void pause() {
        System.out.println("Rugby match is temporarily halted.");
    }

    @Override
    public void resume() {
        System.out.println("Rugby match is back on.");
    }

    @Override
    public void stop() {
        System.out.println("Rugby match has ended.");
    }

    @Override
    public void info() {
        System.out.println("This is a full-contact team sport called Rugby.");
    }
}