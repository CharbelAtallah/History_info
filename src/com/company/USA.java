package com.company;

import javax.swing.*;

/**
 * Creates a program that integrate with the user, let the user choose between 3 different categories. Man power, Land forces, Air power and Naval power.
 * As well the global index power.
 * use 10 top countries in each category.
 */

public class USA {
    //TODO Skapa metoder för 3 länder för varje klass
    //TODO Varje land ska ha olika instansvariabler exempelvis


    static void GlobalPowerIndex() {
        System.out.println("\n--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Power Index #");
        String input = JOptionPane.showInputDialog("Guess USA:s ranking Power index from 1-10?" +
                "\n1 being the top ranked and 10 is the lowest.");
        int answer = Integer.parseInt(input); //Convert the String variable to an int and push it to the if statement.
        System.out.println("Your answer was: " + input + "!");
        if (answer >= 2) {
            JOptionPane.showMessageDialog(null, "sorry, wrong answer!");
            JOptionPane.showMessageDialog(null, "\nFor 2020, United States is ranked 1 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.0606 (0.0000 considered 'perfect').");
            System.out.println("Sorry wrong answer!");
        } else {
            JOptionPane.showMessageDialog(null, "Congratulations, you guessed the right answer!");
            JOptionPane.showMessageDialog(null, "\nFor 2020, United States is ranked 1 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.0606 (0.0000 considered 'perfect').");
            System.out.println("Congratulations, you guessed the right answer");
        }

    }

    /**
     * Values derived from the CIA World Factbook 2020.
     */
    static void ManPower() {
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tUSA" + "\n--------------------------------------");
        System.out.println("\t\t  # Man power #");
        int totalPopulation = 329_256_465;
        int availableManpower = 144_872_845;
        int fitForService = 119_664_970;
        int totalMilitaryPower = 2_260_000;
        int activePersonnel = 1_400_000;
        int reservePersonnel = 860_000;
        System.out.printf("\n\t> Total Population: %,d \n\t> Available Manpower %,d \n\t> Fit for Service: %,d \n\t> Total Military Power: %,d \n\t> Active Personnel: %,d \n\t> Reserve Personnel: %,d" ,
                totalPopulation,availableManpower,fitForService,totalMilitaryPower,activePersonnel,reservePersonnel);
    }


    /**
     * 'Tanks' value includes Main Battle Tanks, light tanks, and tank destroyers.
     * 'Armored Vehicles' value includes APCs, IFVs, MRAPs, and Armored Cars.
     * 'Rocket Projectors include only self-propelled forms.
     */
    static void LandForces() {
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tUSA" + "\n--------------------------------------");
        System.out.println("\t\t  # Land Forces #");
        int tanks = 6_289;
        int armoredVehicles = 39_253;
        int selfPropelledArtillery = 1_465;
        int towedArtillery = 2_740;
        int rocketProjectors = 1_366;
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
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tUSA" + "\n--------------------------------------");
        System.out.println("\t\t  # Air Power #");
        int totalStrength = 13_264;
        int fighters = 2_085;
        int dedicatedAttack = 715;
        int transport = 945;
        int trainers = 2_643;
        int specialMission = 742;
        int helicopters = 5_768;
        int attackHelicopters = 987;
        System.out.printf("\n\t> Total Strength: %,d \n\t> Fighters: %,d \n\t> Dedicated Attackers: %,d \n\t> Transport: %,d \n\t> Trainers: %,d \n\t> Special Mission: %,d \n\t> Helicopters: %,d \n\t> Attack Helicopters: %,d" ,
                totalStrength, fighters, dedicatedAttack, transport, trainers, specialMission, helicopters, attackHelicopters);
    }

    /**
     * 'Total Assets' value includes all possible/available vessels including auxiliaries.
     * 'Aircraft Carriers' value includes traditional carriers as well as Helicopter Carriers.
     * 'Submarines' value includes diesel-electric and nuclear-powered types.
     */
    static void NavalPower() {
        System.out.println("\n--------------------------------------" + "\n\t\t\t\tUSA" + "\n--------------------------------------");
        System.out.println("\t\t  # Naval Power #");
        int totalAssets = 490;
        int airCraftCarriers = 20;
        int destroyers = 91;
        int frigates = 0;
        int corvettes = 19;
        int submarines = 66;
        int patrol = 13;
        int mineWarfare= 11;
        System.out.printf("\n\t> Total Assets: %,d \n\t> Air Craft Carriers: %,d \n\t> Destroyers: %,d \n\t> Frigates: %,d \n\t> Corvettes: %,d \n\t> Submarines: %,d \n\t> Mine Warfare: %,d",
                totalAssets , airCraftCarriers , destroyers , frigates , corvettes , submarines , patrol , mineWarfare);
    }
}




