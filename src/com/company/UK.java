package com.company;

import javax.swing.*;

public class UK {
    static void GlobalPowerIndex() {
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Power Index #");
        String input = JOptionPane.showInputDialog("Guess UK:s ranking Power index from 1-10?" +
                "\n1 being the top ranked and 10 is the lowest.");
        int answer = Integer.parseInt(input); //Convert the String variable to an int and push it to the if statement.
        System.out.println("Your answer was: " + input + "!");
        if (answer == 8) {
            JOptionPane.showMessageDialog(null, "Congratulations, you guessed the right answer!");
            JOptionPane.showMessageDialog(null, "\nFor 2020, UK is ranked 8 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.1717 (0.0000 considered 'perfect').");
            System.out.println("Congratulations, you guessed the right answer");
        } else {
            JOptionPane.showMessageDialog(null, "sorry, wrong answer!");
            JOptionPane.showMessageDialog(null, "\nFor 2020, UK is ranked 8 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.1717 (0.0000 considered 'perfect').");
            System.out.println("Sorry wrong answer!");
        }
    }

    /**
     * Values derived from the CIA World Factbook 2020.
     */
    static void ManPower() {
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Man power #");
        int totalPopulation = 65_105_246;
        int availableManpower = 29_948_413;
        int fitForService = 23_958_731;
        int totalMilitaryPower = 275_660;
        int activePersonnel = 192_660;
        int reservePersonnel = 83_000;
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
        int tanks = 227;
        int armoredVehicles = 5_000;
        int selfPropelledArtillery = 89;
        int towedArtillery = 126;
        int rocketProjectors = 35;
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
        int totalStrength = 733;
        int fighters = 133;
        int dedicatedAttack = 15;
        int transport = 44;
        int trainers = 241;
        int specialMission = 28;
        int helicopters = 312;
        int attackHelicopters = 49;
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
        int totalAssets = 88;
        int airCraftCarriers = 2;
        int destroyers = 6;
        int frigates = 13;
        int corvettes = 0;
        int submarines = 10;
        int patrol = 22;
        int mineWarfare = 13;
        System.out.println("\t> Total Assets: " + totalAssets + "\n\t> Air Craft Carriers: " + airCraftCarriers + "\n\t> Destroyers: " + destroyers
                + "\n\t> Frigates: " + frigates + "\n\t> Corvettes: " + corvettes + "\n\t> Submarines: " + submarines
                + "\n\t> Patrol: " + patrol + "\n\t> Mine Warfare: " + mineWarfare);
    }
}
