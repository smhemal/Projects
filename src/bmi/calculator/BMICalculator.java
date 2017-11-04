/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi.calculator;

/**
 *
 * @author MERC-LAB-01
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Hight = 1.67;
        double weight = 77;
        double BMI = weight/(Hight*Hight); 
        System.out.println("BMI = " + BMI);  
        System.out.println("You Obes  := " + (BMI > 25));
                
    }
    
}

