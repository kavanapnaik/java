package com.xworkz.casting2;

public class RailwaysRunner
{
    public static void main(String[] args) {
        Railways rail=new Railways();
        PublicServent ps=new PublicServent();
        rail.validateTicket(ps);
        System.out.println("================");

        PoliceOfficer po =new PoliceOfficer();
        rail.validateTicket(po);
        System.out.println("=================");

        Inspector ins=new Inspector();
        rail.validateTicket(ins);
        System.out.println("===================");

        TrafficPolice tp=new TrafficPolice();
        rail.validateTicket(tp);
        System.out.println("===================");

        TicketCollector tc=new TicketCollector();
        rail.validateTicket(tc);
    }
}
