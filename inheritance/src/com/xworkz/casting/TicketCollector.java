package com.xworkz.casting;

public class TicketCollector extends PublicServant
{
    public void protectIPC()
    {
        System.out.println("TicketCollector protects IPC.");
    }

    void checkTicket()
    {
        System.out.println("TicketCollector checks tickets.");
    }
}
