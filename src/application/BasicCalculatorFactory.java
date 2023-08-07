/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import application.StrategyPattern.CalculationStrategy;

/**
 *
 * @author DELL
 */
public class BasicCalculatorFactory extends CalculatorFactory{

    public CalculatorType createCalculator(CalculationStrategy strategy) {
        Calculator calculator = Calculator.getInstance();
        calculator.context.setStrategy(strategy);
        return new BasicCalculator();
    }
    
}
