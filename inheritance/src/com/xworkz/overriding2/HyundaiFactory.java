package com.xworkz.overriding2;

public class HyundaiFactory extends Factory
{
    void truck()
    {
        System.out.println("HyundaiFactory produces trucks.");
    }

    // Overriding methods

    void manufacture()
    {
        System.out.println("HyundaiFactory is manufacturing.");
    }

    void dispose()
    {
        System.out.println("HyundaiFactory disposing waste.");
    }

    void power()
    {
        System.out.println("HyundaiFactory power is on.");
    }

    void start()
    {
        System.out.println("HyundaiFactory started.");
    }

    void run()
    {
        System.out.println("HyundaiFactory is running.");
    }
}
