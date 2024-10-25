package com.xworkz.casting2;

public class PoliceStationRunner
{
        public static void main(String[] args) {
            PoliceStation ps=new PoliceStation();
            PoliceOfficer po=new PoliceOfficer();
            ps.justice(po);
            System.out.println("=================");

            Inspector ins=new Inspector();
            ps.justice(ins);
            System.out.println("===================");

            TrafficPolice tp=new TrafficPolice();
            ps.justice(tp);
        }
    }


