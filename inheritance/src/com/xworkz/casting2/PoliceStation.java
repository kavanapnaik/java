package com.xworkz.casting2;

public class PoliceStation
{
    public void justice(PoliceOfficer officer)
    {
        System.out.println("justice in Police station");
        officer.protectIPC();
        officer.controlCrime();
        if (officer instanceof Inspector)
        {
            Inspector ins=(Inspector) officer;
            ins.controlStation();
        }
        if (officer instanceof TrafficPolice)
        {
            TrafficPolice tp=(TrafficPolice) officer;
            tp.controlTraffic();
        }
    }
}
