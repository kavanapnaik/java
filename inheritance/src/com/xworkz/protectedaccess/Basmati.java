package com.xworkz.protectedaccess;

public class Basmati extends Rice
{

    public Basmati(String variety)
    {
        super(variety);
    }

    public void displayVariety()
    {
        System.out.println("Rice Variety: " + variety);
    }

    public static void main(String[] args)
    {
        Basmati basmati = new Basmati("Basmati Rice");
        basmati.displayVariety();
    }
}

