package com.company;

import javax.swing.*;

public class UK {
    static void GlobalPowerIndex(){
        System.out.println("--------------------------------------" + "\n--------------------------------------");
        System.out.println("\t\t  # Power Index #");
        String input = JOptionPane.showInputDialog("Guess UK:s ranking Power index from 1-10?" +
                "\n1 being the top ranked and 10 is the lowest.");
        int answer = Integer.parseInt(input); //Convert the String variable to an int and push it to the if statement.
        System.out.println("Your answer was: " + input + "!");
        if (answer == 8){
            JOptionPane.showMessageDialog(null,"Congratulations, you guessed the right answer!");
            JOptionPane.showMessageDialog(null,"\nFor 2020, UK is ranked 8 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.1717 (0.0000 considered 'perfect').");
            System.out.println("Congratulations, you guessed the right answer");
        }
        else {
            JOptionPane.showMessageDialog(null,"sorry, wrong answer!");
            JOptionPane.showMessageDialog(null,"\nFor 2020, UK is ranked 8 of 138 out of the countries considered for the annual GFP review." +
                    "\nIt holds a PwrIndx* rating of 0.1717 (0.0000 considered 'perfect').");
            System.out.println("Sorry wrong answer!");
        }
    }
}