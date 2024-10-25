package com.xworkz.casting2;

public class GovernmentRunner
{
    public void validateTicket(PublicServent servant) {
        System.out.println("validate ticket in Railways");
        servant.protectIPC();
        if (servant instanceof PoliceOfficer) {
            PoliceOfficer po = (PoliceOfficer) servant;
            po.controlCrime();
        }
        if (servant instanceof Inspector) {
            Inspector isp = (Inspector) servant;
            isp.controlCrime();
            isp.controlStation();
        }
        if (servant instanceof TrafficPolice) {
            TrafficPolice tp = (TrafficPolice) servant;
            tp.controlCrime();
            tp.controlTraffic();
        }
        if (servant instanceof TicketCollector) {
            TicketCollector tc = (TicketCollector) servant;
            tc.checkTicket();
        }
    }
}


