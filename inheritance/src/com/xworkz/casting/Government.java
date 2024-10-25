package com.xworkz.casting;

public class Government
{
    void run(PublicServant servant)
    {
        System.out.println("Government.......");
        servant.protectIPC();
        if(servant instanceof PoliceOfficer)
        {
            PoliceOfficer policeOfficer=(PoliceOfficer) servant;
            policeOfficer.controlCrime();
        }
        if(servant instanceof Inspector)
        {
            Inspector inspector=(Inspector) servant;
            inspector.controlStation();
        }

    }
}
