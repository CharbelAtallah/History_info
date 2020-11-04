package com.company;

import javax.swing.*;

public class Brazil {
    static void GlobalPowerIndex() {
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Power Index #");
        String input = JOptionPane.showInputDialog("Guess Brazil:s ranking Power index from 1-10?" +
                "\n1 being the top ranked and 10 is the lowest.");
        int answer = Integer.parseInt(input); //Convert the String variable to an int and push it to the if statement.
        System.out.println("Your answer was: " + input + "!");
        if (answer == 10) {
            JOptionPane.showMessageDialog(null, "Congratulations, you guessed the right answer!");
            JOptionPane.showMessageDialog(null, "\nFor 2020, Brazil is ranked 10 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.1988 (0.0000 considered 'perfect').");
            System.out.println("Congratulations, you guessed the right answer");
        } else {
            JOptionPane.showMessageDialog(null, "sorry, wrong answer!");
            JOptionPane.showMessageDialog(null, "\nFor 2020, Brazil is ranked 10 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.1988 (0.0000 considered 'perfect').");
            System.out.println("Sorry wrong answer!");
        }
    }

    /**
     * Values derived from the CIA World Factbook 2020.
     */
    static void ManPower() {
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Man power #");
        int totalPopulation = 208_846_892;
        int availableManpower = 107_764_996;
        int fitForService = 84_595_522;
        int totalMilitaryPower = 1_674_500;
        int activePersonnel = 334_500;
        int reservePersonnel = 1_340_000;
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
        int tanks = 437;
        int armoredVehicles = 1_820;
        int selfPropelledArtillery = 132;
        int towedArtillery = 565;
        int rocketProjectors = 84;
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
        int totalStrength = 715;
        int fighters = 43;
        int dedicatedAttack = 78;
        int transport = 126;
        int trainers = 198;
        int specialMission = 24;
        int helicopters = 242;
        int attackHelicopters = 12;
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
        int totalAssets = 112;
        int airCraftCarriers = 0;
        int destroyers = 0;
        int frigates = 7;
        int corvettes = 2;
        int submarines = 6;
        int patrol = 22;
        int mineWarfare = 5;
        System.out.println("\t> Total Assets: " + totalAssets + "\n\t> Air Craft Carriers: " + airCraftCarriers + "\n\t> Destroyers: " + destroyers
                + "\n\t> Frigates: " + frigates + "\n\t> Corvettes: " + corvettes + "\n\t> Submarines: " + submarines
                + "\n\t> Patrol: " + patrol + "\n\t> Mine Warfare: " + mineWarfare);
    }


}
