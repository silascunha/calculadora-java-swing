/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.StrategyPattern;

import application.StrategyPattern.CalculationStrategy;

/**
 *
 * @author DELL
 */
public class ConcreteStrategySubstraction implements CalculationStrategy {

    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
    
}
