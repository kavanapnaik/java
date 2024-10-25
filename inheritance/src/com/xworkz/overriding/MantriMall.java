package com.xworkz.overriding;

public class MantriMall extends Mall
{
    void cafetArea()
    {
        System.out.println("MantriMall has a cafetArea.");
    }

    // Overriding methods

    void open()
    {
        System.out.println("MantriMall is open.");
    }

    void close()
    {
        System.out.println("MantriMall is closed.");
    }

    void elevator()
    {
        System.out.println("MantriMall elevator in operation.");
    }

    void security()
    {
        System.out.println("MantriMall security is active.");
    }
}