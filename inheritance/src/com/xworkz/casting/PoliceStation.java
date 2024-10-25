package com.xworkz.casting;

public class PoliceStation
{
    void justice(PoliceOfficer officer)
    {
        System.out.println("Justice........");
        officer.controlCrime();
        officer.protectIPC();

        if(officer instanceof Inspector)
        {
            Inspector inspector=(Inspector) officer;
            inspector.controlStation();
        }
        if(officer instanceof TrafficPolice)
        {
            TrafficPolice trafficPolice=(TrafficPolice) officer;
            trafficPolice.controlTraffic();
        }
    }
}
