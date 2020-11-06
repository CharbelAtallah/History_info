package com.company;

import javax.swing.*;

public class India {
    static void GlobalPowerIndex() {
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tIndia" + "\n--------------------------------------");
        System.out.println("\t\t  # Power Index #");
        String input = JOptionPane.showInputDialog("Guess India:s ranking Power index from 1-10?" +
                "\n1 being the top ranked and 10 is the lowest.");
        int answer = Integer.parseInt(input); //Convert the String variable to an int and push it to the if statement.
        System.out.println("Your answer was: " + input + "!");
        if (answer == 4) {
            JOptionPane.showMessageDialog(null, "Congratulations, you guessed the right answer!");
            JOptionPane.showMessageDialog(null, "\nFor 2020, India is ranked 4 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.0953 (0.0000 considered 'perfect').");
            System.out.println("Congratulations, you guessed the right answer");
        } else {
            JOptionPane.showMessageDialog(null, "sorry, wrong answer!");
            JOptionPane.showMessageDialog(null, "\nFor 2020, India is ranked 4 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.0953 (0.0000 considered 'perfect').");
            System.out.println("Sorry wrong answer!");
        }
    }


    /**
     * Values derived from the CIA World Factbook 2020.
     */
    static void ManPower() {
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tIndia" + "\n--------------------------------------");
        System.out.println("\t\t  # Man power #");
        int totalPopulation = 1_296_834_042;
        int availableManpower = 622_480_340;
        int fitForService = 494_249_390;
        int totalMilitaryPower = 3_544_000;
        int activePersonnel = 1_444_000;
        int reservePersonnel = 2_100_000;
        System.out.printf("\n\t> Total Population: %,d \n\t> Available Manpower %,d \n\t> Fit for Service: %,d \n\t> Total Military Power: %,d \n\t> Active Personnel: %,d \n\t> Reserve Personnel: %,d" ,
                totalPopulation,availableManpower,fitForService,totalMilitaryPower,activePersonnel,reservePersonnel);
    }

    /**
     * 'Tanks' value includes Main Battle Tanks, light tanks, and tank destroyers.
     * 'Armored Vehicles' value includes APCs, IFVs, MRAPs, and Armored Cars.
     * 'Rocket Projectors include only self-propelled forms.
     */
    static void LandForces() {
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tIndia" + "\n--------------------------------------");
        System.out.println("\t\t  # Land Forces #");
        int tanks = 4_292;
        int armoredVehicles = 8_686;
        int selfPropelledArtillery = 235;
        int towedArtillery = 4_060;
        int rocketProjectors = 266;
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
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tIndia" + "\n--------------------------------------");
        System.out.println("\t\t  # Air Power #");
        int totalStrength = 2_123;
        int fighters = 538;
        int dedicatedAttack = 172;
        int transport = 250;
        int trainers = 359;
        int specialMission = 77;
        int helicopters = 722;
        int attackHelicopters = 23;
        System.out.printf("\n\t> Total Strength: %,d \n\t> Fighters: %,d \n\t> Dedicated Attackers: %,d \n\t> Transport: %,d \n\t> Trainers: %,d \n\t> Special Mission: %,d \n\t> Helicopters: %,d \n\t> Attack Helicopters: %,d" ,
                totalStrength, fighters, dedicatedAttack, transport, trainers, specialMission, helicopters, attackHelicopters);
    }

    /**
     * 'Total Assets' value includes all possible/available vessels including auxiliaries.
     * 'Aircraft Carriers' value includes traditional carriers as well as Helicopter Carriers.
     * 'Submarines' value includes diesel-electric and nuclear-powered types.
     */
    static void NavalPower() {
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tIndia" + "\n--------------------------------------");
        System.out.println("\t\t  # Naval Power #");
        int totalAssets = 285;
        int airCraftCarriers = 1;
        int destroyers = 10;
        int frigates = 13;
        int corvettes = 19;
        int submarines = 16;
        int patrol = 139;
        int mineWarfare = 3;
        System.out.printf("\n\t> Total Assets: %,d \n\t> Air Craft Carriers: %,d \n\t> Destroyers: %,d \n\t> Frigates: %,d \n\t> Corvettes: %,d \n\t> Submarines: %,d \n\t> Mine Warfare: %,d",
                totalAssets , airCraftCarriers , destroyers , frigates , corvettes , submarines , patrol , mineWarfare);
    }
}
