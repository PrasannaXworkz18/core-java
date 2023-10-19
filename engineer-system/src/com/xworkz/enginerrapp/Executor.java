package com.xworkz.enginerrapp;

import com.xworkz.enginerrapp.engineer.CsEngineer;
import com.xworkz.enginerrapp.engineer.Engineeer;
import com.xworkz.enginerrapp.engineer.MarineEngineer;

public class Executor {
    public static void main(String[] args) {

        //upcasting
        Engineeer engineeer=new Engineeer();

        //down casting
        CsEngineer csEngineer = (CsEngineer) engineeer;
        csEngineer.softwareDevelopment();

        Engineeer engineeer1 = new Engineeer();

        //down casting
        MarineEngineer marineEngineer = (MarineEngineer) engineeer1;
        marineEngineer.enjoying();
    }
}