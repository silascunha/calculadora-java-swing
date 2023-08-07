/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import application.StrategyPattern.CalculationContext;
import application.StrategyPattern.ConcreteStrategyAddition;
import application.StrategyPattern.ConcreteStrategyDivision;
import application.StrategyPattern.ConcreteStrategyMultiplication;
import application.StrategyPattern.ConcreteStrategySubstraction;

/**
 *
 * @author DELL
 */
public class BasicCalculator implements CalculatorType{

    @Override
    public double calculate(double a, double b, Character c) {
        CalculationContext context = new CalculationContext();
        switch (c) {
            case '+':
                context.setStrategy(new ConcreteStrategyAddition());
                return context.executeCalculationStrategy(a, b);
            case '-':
                context.setStrategy(new ConcreteStrategySubstraction());
                return context.executeCalculationStrategy(a, b);
            case '*':
                 context.setStrategy(new ConcreteStrategyMultiplication());
                 return context.executeCalculationStrategy(a, b);
            case '/':
                 context.setStrategy(new ConcreteStrategyDivision());
                 return context.executeCalculationStrategy(a, b);
            default:
                return b;
        }}
    
}
