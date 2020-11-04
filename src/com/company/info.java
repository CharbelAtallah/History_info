package com.company;

import javax.swing.*;

public class info {
    static void GlobalPowerIndex(){
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Power Index #");
        String input = JOptionPane.showInputDialog("Guess XXX:s ranking Power index from 1-10?" +
                "\n1 being the top ranked and 10 is the lowest.");
        int answer = Integer.parseInt(input); //Convert the String variable to an int and push it to the if statement.
        System.out.println("Your answer was: " + input + "!");
        if (answer == 000){
            JOptionPane.showMessageDialog(null,"Congratulations, you guessed the right answer!");
            JOptionPane.showMessageDialog(null,"\nFor 2020, XXXX is ranked X of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of XX (0.0000 considered 'perfect').");
            System.out.println("Congratulations, you guessed the right answer");
        }
        else {
            JOptionPane.showMessageDialog(null,"sorry, wrong answer!");
            JOptionPane.showMessageDialog(null,"\nFor 2020, XXXX is ranked X of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of X.XXX (0.0000 considered 'perfect').");
            System.out.println("Sorry wrong answer!");
        }
    }


    /**
     * Values derived from the CIA World Factbook 2020.
     */
    static void ManPower() {
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Man power #");
        int totalPopulation = 000_000_000;
        int availableManpower = 000_000_000;
        int fitForService = 000_000_000;
        int totalMilitaryPower = 000_000;
        int activePersonnel = 000_000;
        int reservePersonnel = 000_000;
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
        int tanks = 000_000;
        int armoredVehicles = 000_000;
        int selfPropelledArtillery = 000;
        int towedArtillery = 000;
        int rocketProjectors = 000;
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
        int totalStrength = 0_0;
        int fighters = 000;
        int dedicatedAttack = 00;
        int transport = 00;
        int trainers = 000;
        int specialMission = 000;
        int helicopters = 000;
        int attackHelicopters = 000;
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
        int totalAssets = 000;
        int airCraftCarriers = 000;
        int destroyers = 000;
        int frigates = 000;
        int corvettes = 000;
        int submarines = 000;
        int patrol = 000;
        int mineWarfare = 000;
        System.out.println("\t> Total Assets: " + totalAssets + "\n\t> Air Craft Carriers: " + airCraftCarriers + "\n\t> Destroyers: " + destroyers
                + "\n\t> Frigates: " + frigates + "\n\t> Corvettes: " + corvettes + "\n\t> Submarines: " + submarines
                + "\n\t> Patrol: " + patrol + "\n\t> Mine Warfare: " + mineWarfare);
    }
}
