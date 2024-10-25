package com.xworkz.casting;
public class Main
{
        public static void main (String[] args)
        {
         // Creating copies
        Government government = new Government();
        PoliceStation policeStation = new PoliceStation();
        Railways railways = new Railways();
        PublicServant publicServant = new PublicServant();
        PoliceOfficer policeOfficer = new PoliceOfficer();
        Inspector inspector = new Inspector();
        TrafficPolice trafficPolice = new TrafficPolice();
        TicketCollector ticketCollector = new TicketCollector();
        //  run method
        government.run(publicServant);
        government.run(policeOfficer);
        government.run(inspector);
        government.run(trafficPolice);
        government.run(ticketCollector);
        //justice method
        policeStation.justice(policeOfficer);
        policeStation.justice(inspector);
        policeStation.justice(trafficPolice);
        //validateTicket method
        railways.validateTicket(ticketCollector);
    }
    }
