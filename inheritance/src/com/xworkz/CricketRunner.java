package com.xworkz;

public class CricketRunner
{
    public static void main(String[] args)
    {
        Cricket cricket1=new Cricket();
        cricket1.schedule();
        cricket1.agreement();

        Cricket cricket2=new IPLCricket();
        cricket2.schedule();

        if(cricket2 instanceof IPLCricket)
        {
            System.out.println("Referenece is IPLCricket");
            IPLCricket castedIPLCricket=(IPLCricket) cricket2;
            castedIPLCricket.priceMoney();
        }
    }
}
