/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import application.StrategyPattern.CalculationContext;
import application.StrategyPattern.CalculationStrategy;
import application.StrategyPattern.ConcreteStrategyAddition;
import application.StrategyPattern.ConcreteStrategyDivision;
import application.StrategyPattern.ConcreteStrategyMultiplication;
import application.StrategyPattern.ConcreteStrategySubstraction;

/**
 *
 * @author DELL
 */
public abstract class CalculatorFactory {
     public abstract CalculatorType createCalculator(CalculationStrategy strategy);
}
