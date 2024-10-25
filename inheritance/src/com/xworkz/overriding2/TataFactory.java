package com.xworkz.overriding2;

public class TataFactory extends Factory
{
    void car()
    {
        System.out.println("TataFactory produces cars.");
    }

    // Overriding methods

    void manufacture()
    {
        System.out.println("TataFactory is manufacturing.");
    }

    void dispose()
    {
        System.out.println("TataFactory disposing waste.");
    }
    void power()
    {
        System.out.println("TataFactory power is on.");
    }
    void start()
    {
        System.out.println("TataFactory started.");
    }

    void run()
    {
        System.out.println("TataFactory is running.");
    }
}

