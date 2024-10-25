package com.xworkz.overriding2;

public class Main2
{
        public static void main(String[] args) {
            TataFactory tataFactory1 = new TataFactory();
            HondaFactory hondaFactory1 = new HondaFactory();
            HyundaiFactory hyundaiFactory1 = new HyundaiFactory();
            TvsFactory tvsFactory1 = new TvsFactory();

            tataFactory1.manufacture();
            tataFactory1.dispose();
            tataFactory1.power();
            tataFactory1.start();
            tataFactory1.run();
            tataFactory1.car();
            System.out.println("********************************");


            hondaFactory1.manufacture();
            hondaFactory1.dispose();
            hondaFactory1.power();
            hondaFactory1.start();
            hondaFactory1.run();
            hondaFactory1.bike();
            System.out.println("********************************");



            hyundaiFactory1.manufacture();
            hyundaiFactory1.dispose();
            hyundaiFactory1.power();
            hyundaiFactory1.start();
            hyundaiFactory1.run();
            hyundaiFactory1.truck();
            System.out.println("********************************");


            tvsFactory1.manufacture();
            tvsFactory1.dispose();
            tvsFactory1.power();
            tvsFactory1.start();
            tvsFactory1.run();
            tvsFactory1.scooter();

        }
    }


