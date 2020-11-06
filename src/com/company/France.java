package com.company;

import javax.swing.*;

public class France {
    static void GlobalPowerIndex() {
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tFrance" + "\n--------------------------------------");
        System.out.println("\t\t  # Power Index #");
        String input = JOptionPane.showInputDialog("Guess France:s ranking Power index from 1-10?" +
                "\n1 being the top ranked and 10 is the lowest.");
        int answer = Integer.parseInt(input); //Convert the String variable to an int and push it to the if statement.
        System.out.println("Your answer was: " + input + "!");
        if (answer == 7) {
            JOptionPane.showMessageDialog(null, "Congratulations, you guessed the right answer!");
            JOptionPane.showMessageDialog(null, "\nFor 2020, France is ranked 7 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.1702 (0.0000 considered 'perfect').");
            System.out.println("Congratulations, you guessed the right answer");
        } else {
            JOptionPane.showMessageDialog(null, "sorry, wrong answer!");
            JOptionPane.showMessageDialog(null, "\nFor 2020, France is ranked 7 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.1702 (0.0000 considered 'perfect').");
            System.out.println("Sorry wrong answer!");
        }
    }

    /**
     * Values derived from the CIA World Factbook 2020.
     */
    static void ManPower() {
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tFrance" + "\n--------------------------------------");
        System.out.println("\t\t  # Man power #");
        int totalPopulation = 67_364_357;
        int availableManpower = 30_111_868;
        int fitForService = 23_818_487;
        int totalMilitaryPower = 451_635;
        int activePersonnel = 268_000;
        int reservePersonnel = 183_635;
        System.out.printf("\n\t> Total Population: %,d \n\t> Available Manpower %,d \n\t> Fit for Service: %,d \n\t> Total Military Power: %,d \n\t> Active Personnel: %,d \n\t> Reserve Personnel: %,d" ,
                totalPopulation,availableManpower,fitForService,totalMilitaryPower,activePersonnel,reservePersonnel);
    }

    /**
     * 'Tanks' value includes Main Battle Tanks, light tanks, and tank destroyers.
     * 'Armored Vehicles' value includes APCs, IFVs, MRAPs, and Armored Cars.
     * 'Rocket Projectors include only self-propelled forms.
     */
    static void LandForces() {
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tFrance" + "\n--------------------------------------");
        System.out.println("\t\t  # Land Forces #");
        int tanks = 528;
        int armoredVehicles = 6_028;
        int selfPropelledArtillery = 109;
        int towedArtillery = 12;
        int rocketProjectors = 13;
        System.out.printf( "\n\t> Tanks: %,d \n\t> Armored Vehicle: %,d \n\t> Self Propelled Artillery: %,d \n\t> Towed Artillery: %,d \n\t> Rocket Projectors: %,d" ,
                tanks,armoredVehicles,selfPropelledArtillery,towedArtillery,rocketProjectors);
    }

    /**
     * Total Aircraft Strength value includes both fixed-wing and rotorcraft platforms from all branches of service.
     * UAVs are not included in the total.
     * 'Attack' value constitutes attack types.
     * 'Transports' value includes only fixed-wing aircraft while all rotorcraft are represented under the 'Helicopters' value.
     * 'Special-Mission' value does not take aerial tankers into account.
     */
    static void AirPower() {
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tFrance" + "\n--------------------------------------");
        System.out.println("\t\t  # Air Power #");
        int totalStrength = 1_229;
        int fighters = 269;
        int dedicatedAttack = 0;
        int transport = 121;
        int trainers = 187;
        int specialMission = 45;
        int helicopters = 589;
        int attackHelicopters = 62;
        System.out.printf("\n\t> Total Strength: %,d \n\t> Fighters: %,d \n\t> Dedicated Attackers: %,d \n\t> Transport: %,d \n\t> Trainers: %,d \n\t> Special Mission: %,d \n\t> Helicopters: %,d \n\t> Attack Helicopters: %,d" ,
                totalStrength, fighters, dedicatedAttack, transport, trainers, specialMission, helicopters, attackHelicopters);
    }

    /**
     * 'Total Assets' value includes all possible/available vessels including auxiliaries.
     * 'Aircraft Carriers' value includes traditional carriers as well as Helicopter Carriers.
     * 'Submarines' value includes diesel-electric and nuclear-powered types.
     */
    static void NavalPower() {
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tFrance" + "\n--------------------------------------");
        System.out.println("\t\t  # Naval Power #");
        int totalAssets = 180;
        int airCraftCarriers = 4;
        int destroyers = 11;
        int frigates = 11;
        int corvettes = 0;
        int submarines = 9;
        int patrol = 17;
        int mineWarfare = 17;
        System.out.printf("\n\t> Total Assets: %,d \n\t> Air Craft Carriers: %,d \n\t> Destroyers: %,d \n\t> Frigates: %,d \n\t> Corvettes: %,d \n\t> Submarines: %,d \n\t> Mine Warfare: %,d",
                totalAssets , airCraftCarriers , destroyers , frigates , corvettes , submarines , patrol , mineWarfare);
    }
}
