package com.xworkz.overriding2;

public class TvsFactory extends Factory
{
    void scooter()
    {
        System.out.println("TvsFactory produces scooters.");
    }

    // Overriding methods

    void manufacture()
    {
        System.out.println("TvsFactory is manufacturing.");
    }

    void dispose()
    {
        System.out.println("TvsFactory disposing waste.");
    }

    void power()
    {
        System.out.println("TvsFactory power is on.");
    }

    void start()
    {
        System.out.println("TvsFactory started.");
    }

    void run()
    {
        System.out.println("TvsFactory is running.");
    }
}

