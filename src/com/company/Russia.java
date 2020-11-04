package com.company;

import javax.swing.*;

public class Russia {
    //TODO fixa om resultaten för varje
    static void GlobalPowerIndex(){
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Power Index #");
        String input = JOptionPane.showInputDialog("Guess Russia:s ranking Power index from 1-10?" +
                "\n1 being the top ranked and 10 is the lowest.");
        int answer = Integer.parseInt(input); //Convert the String variable to an int and push it to the if statement.
        System.out.println("Your answer was: " + input + "!");
        if (answer == 2){
            JOptionPane.showMessageDialog(null,"Congratulations, you guessed the right answer!");
        JOptionPane.showMessageDialog(null,"\nFor 2020, Russia is ranked 2 of 138 out of the countries considered for the annual GFP review." +
                "\nIt holds a PwrIndx* rating of 0.0681 (0.0000 considered 'perfect').");
        System.out.println("Congratulations, you guessed the right answer");
        }
        else {
        JOptionPane.showMessageDialog(null,"sorry, wrong answer!");
        JOptionPane.showMessageDialog(null,"\nFor 2020, Russia is ranked 2 of 138 out of the countries considered for the annual GFP review." +
                "\nIt holds a PwrIndx* rating of 0.0681 (0.0000 considered 'perfect').");
        System.out.println("Sorry wrong answer!");
        }

    }

    static void ManPower() {
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Man power #");
        int totalPopulation = 142_122_776;
        int availableManpower = 69_640_160;
        int fitForService = 46_658_907;
        int totalMilitaryPower = 3_013_628;
        int activePersonnel = 1_013_628;
        int reservePersonnel = 2_000_000;
        System.out.println("\t> Total Population: " + totalPopulation + "\n\t> Available Manpower: " + availableManpower + "\n\t> Fit for Service: " + fitForService
                + "\n\t> Total Military Power: " + totalMilitaryPower + "\n\t> Active Personnel: " + activePersonnel + "\n\t> Reserve Personnel: " + reservePersonnel);
    }
//TODO fixa så att alla nummer fixas med decimaler


    static void LandForces(){
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Land Forces #");
        int tanks = 12_950;
        int armoredVehicles = 27_038;
        int selfPropelledArtillery = 6_083;
        int towedArtillery = 4_465;
        int rocketProjectors = 3_860;
        System.out.println("\t> Tanks: " + tanks + "\n\t> Armored Vehicle: " + armoredVehicles + "\n\t> Self Propelled ARtillery: " + selfPropelledArtillery
                + "\n\t> Towed Artillery: " + towedArtillery + "\n\t> Rocket Projectors: " + rocketProjectors);
    }

    static void AirPower(){
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Air Power #");
        int totalStrength = 4_163;
        int fighters = 873;
        int dedicatedAttack = 742;
        int transport = 424;
        int trainers = 497;
        int specialMission = 127;
        int helicopters = 1_522;
        int attackHelicopters = 531;
        System.out.println("\t> Total Strength: " + totalStrength + "\n\t> Fighters: " + fighters + "\n\t> Dedicated Attackers: " + dedicatedAttack
                + "\n\t> Transport: " + transport + "\n\t> Trainers: " + trainers + "\n\t> Special Mission: " + specialMission
                + "\n\t> Helicopters: " + helicopters + "\n\t> Attack Helicopters: " + attackHelicopters);
    }

    /**
     * 'Total Assets' value includes all possible/available vessels including auxiliaries.
     * 'Aircraft Carriers' value includes traditional carriers as well as Helicopter Carriers.
     * 'Submarines' value includes diesel-electric and nuclear-powered types.
     */
    static void NavalPower(){
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Air Power #");
        int totalAssets = 603;
        int airCraftCarriers = 1;
        int destroyers = 16;
        int frigates = 16;
        int corvettes = 79;
        int submarines = 62;
        int patrol = 41;
        int mineWarfare = 48;
        System.out.println("\t> Total Assets: " + totalAssets + "\n\t> Air Craft Carriers: " + airCraftCarriers + "\n\t> Destroyers: " + destroyers
                + "\n\t> Frigates: " + frigates + "\n\t> Corvettes: " + corvettes + "\n\t> Submarines: " + submarines
                + "\n\t> Patrol: " + patrol + "\n\t> Mine Warfare: " + mineWarfare);
    }
}
