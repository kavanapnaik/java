package com.xworkz.overriding;

public class LuluMall extends Mall
{
    void foodCourt()
    {
        System.out.println("LuluMall has a food court.");
    }

    // Overriding methods

    void open()
    {
        System.out.println("LuluMall is open.");
    }

    void close()
    {
        System.out.println("LuluMall is closed.");
    }

    void elevator()
    {
        System.out.println("LuluMall elevator in operation.");
    }

    void security()
    {
        System.out.println("LuluMall security is active.");
    }
}