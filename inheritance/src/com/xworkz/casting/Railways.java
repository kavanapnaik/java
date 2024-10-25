package com.xworkz.casting;

public class Railways
{
    void validateTicket(PublicServant servant)
    {
        System.out.println("Railways........");
        servant.protectIPC();
        if (servant instanceof TicketCollector)
        {
            TicketCollector ticketCollector= (TicketCollector)servant;
            System.out.println("servent is instance of Ticket collector");
            ticketCollector.checkTicket();
        }
        if (servant instanceof PoliceOfficer)
        {
            PoliceOfficer policeOfficer= (PoliceOfficer)servant;
            System.out.println("servent is instance of PoliceOfficer");
            policeOfficer.controlCrime();
        }
    }
}
