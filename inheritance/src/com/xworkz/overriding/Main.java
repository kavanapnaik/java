package com.xworkz.overriding;

public class Main
{
        public static void main(String[] args)
        {
            Mall mall1=new Mall();
            OrionMall orionMall1 = new OrionMall();
            LuluMall luluMall1 = new LuluMall();
            MantriMall mantriMall1 = new MantriMall();

            mall1.open();
            mall1.close();
            mall1.elevator();
            mall1.security();
            System.out.println("******************************");


            orionMall1.open();
            orionMall1.close();
            orionMall1.elevator();
            orionMall1.security();
            orionMall1.movieTheater();
            System.out.println("******************************");


            luluMall1.open();
            luluMall1.close();
            luluMall1.elevator();
            luluMall1.security();
            luluMall1.foodCourt();
            System.out.println("******************************");

            mantriMall1.open();
            mantriMall1.close();
            mantriMall1.elevator();
            mantriMall1.security();
            mantriMall1.cafetArea();


        }
    }


