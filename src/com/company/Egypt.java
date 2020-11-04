package com.company;

import javax.swing.*;

public class Egypt {
    static void GlobalPowerIndex() {
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Power Index #");
        String input = JOptionPane.showInputDialog("Guess Egypt:s ranking Power index from 1-10?" +
                "\n1 being the top ranked and 10 is the lowest.");
        int answer = Integer.parseInt(input); //Convert the String variable to an int and push it to the if statement.
        System.out.println("Your answer was: " + input + "!");
        if (answer == 9) {
            JOptionPane.showMessageDialog(null, "Congratulations, you guessed the right answer!");
            JOptionPane.showMessageDialog(null, "\nFor 2020, Egypt is ranked 9 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.1872 (0.0000 considered 'perfect').");
            System.out.println("Congratulations, you guessed the right answer");
        } else {
            JOptionPane.showMessageDialog(null, "sorry, wrong answer!");
            JOptionPane.showMessageDialog(null, "\nFor 2020, Egypt is ranked 9 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.1872 (0.0000 considered 'perfect').");
            System.out.println("Sorry wrong answer!");
        }
    }

    /**
     * Values derived from the CIA World Factbook 2020.
     */
    static void ManPower() {
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Man power #");
        int totalPopulation = 99_413_317;
        int availableManpower = 42_946_553;
        int fitForService = 36_075_104;
        int totalMilitaryPower = 920_000;
        int activePersonnel = 440_000;
        int reservePersonnel = 480_000;
        System.out.println("\t> Total Population: " + totalPopulation + "\n\t> Available Manpower: " + availableManpower + "\n\t> Fit for Service: " + fitForService
                + "\n\t> Total Military Power: " + totalMilitaryPower + "\n\t> Active Personnel: " + activePersonnel + "\n\t> Reserve Personnel: " + reservePersonnel);
    }

    /**
     * 'Tanks' value includes Main Battle Tanks, light tanks, and tank destroyers.
     * 'Armored Vehicles' value includes APCs, IFVs, MRAPs, and Armored Cars.
     * 'Rocket Projectors include only self-propelled forms.
     */
    static void LandForces() {
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Land Forces #");
        int tanks = 4_295;
        int armoredVehicles = 11_700;
        int selfPropelledArtillery = 1_139;
        int towedArtillery = 2_189;
        int rocketProjectors = 1_084;
        System.out.println("\t> Tanks: " + tanks + "\n\t> Armored Vehicle: " + armoredVehicles + "\n\t> Self Propelled ARtillery: " + selfPropelledArtillery
                + "\n\t> Towed Artillery: " + towedArtillery + "\n\t> Rocket Projectors: " + rocketProjectors);
    }

    /**
     * Total Aircraft Strength value includes both fixed-wing and rotorcraft platforms from all branches of service.
     * UAVs are not included in the total.
     * 'Attack' value constitutes attack types.
     * 'Transports' value includes only fixed-wing aircraft while all rotorcraft are represented under the 'Helicopters' value.
     * 'Special-Mission' value does not take aerial tankers into account.
     */
    static void AirPower() {
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Air Power #");
        int totalStrength = 1_054;
        int fighters = 215;
        int dedicatedAttack = 88;
        int transport = 59;
        int trainers = 387;
        int specialMission = 11;
        int helicopters = 294;
        int attackHelicopters = 81;
        System.out.println("\t> Total Strength: " + totalStrength + "\n\t> Fighters: " + fighters + "\n\t> Dedicated Attackers: " + dedicatedAttack
                + "\n\t> Transport: " + transport + "\n\t> Trainers: " + trainers + "\n\t> Special Mission: " + specialMission
                + "\n\t> Helicopters: " + helicopters + "\n\t> Attack Helicopters: " + attackHelicopters);
    }


    /**
     * 'Total Assets' value includes all possible/available vessels including auxiliaries.
     * 'Aircraft Carriers' value includes traditional carriers as well as Helicopter Carriers.
     * 'Submarines' value includes diesel-electric and nuclear-powered types.
     */
    static void NavalPower() {
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Air Power #");
        int totalAssets = 316;
        int airCraftCarriers = 2;
        int destroyers = 0;
        int frigates = 7;
        int corvettes = 7;
        int submarines = 8;
        int patrol = 45;
        int mineWarfare = 31;
        System.out.println("\t> Total Assets: " + totalAssets + "\n\t> Air Craft Carriers: " + airCraftCarriers + "\n\t> Destroyers: " + destroyers
                + "\n\t> Frigates: " + frigates + "\n\t> Corvettes: " + corvettes + "\n\t> Submarines: " + submarines
                + "\n\t> Patrol: " + patrol + "\n\t> Mine Warfare: " + mineWarfare);
    }

}
