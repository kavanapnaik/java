package com.xworkz.overriding;

public class OrionMall extends Mall
{
    void movieTheater()
    {
        System.out.println("OrionMall has a movie theater.");
    }

    // Overriding methods

    void open()
    {
        System.out.println("OrionMall is open.");
    }

    void close()
    {
        System.out.println("OrionMall is closed.");
    }

    void elevator()
    {
        System.out.println("OrionMall elevator in operation.");
    }

    void security()
    {
        System.out.println("OrionMall security is active.");
    }
}
