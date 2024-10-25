package com.xworkz.overriding2;

public class HondaFactory extends Factory
{
    void bike()
    {
        System.out.println("HondaFactory produces bikes.");
    }

    // Overriding methods

    void manufacture()
    {
        System.out.println("HondaFactory is manufacturing.");
    }

    void dispose()
    {
        System.out.println("HondaFactory disposing waste.");
    }

    void power()
    {
        System.out.println("HondaFactory power is on.");
    }
    void start()
    {
        System.out.println("HondaFactory started.");
    }

    void run()
    {
        System.out.println("HondaFactory is running.");
    }
}
