package com.jfs.OOPS;

public class Bike
{
    private String color;
    private int maxSpeed;
    public void bikeSpecifications()
    {
        System.out.println("Bike Color= "+color + " Max Speed= " + maxSpeed);
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
}


class Pulsar extends Bike
{
    Engine pulsarEngine = new Engine();  // has-a relationship
    public void pulsarStartDemo()
    {
        pulsarEngine.start();
    }

    public void pulsarStopDemo()
    {
        pulsarEngine.stop();
    }
}

class Engine
{
    public void start()
    {
        System.out.println("Started:");
    }
    public void stop()
    {
        System.out.println("Stopped:");
    }
}

class TestDemo
{
    public static void main(String[] args)
    {
        Pulsar myPulsar = new Pulsar();
        myPulsar.setColor("BLACK");
        myPulsar.setMaxSpeed(150);
        myPulsar.bikeSpecifications();
        myPulsar.pulsarStartDemo();
    }
}

