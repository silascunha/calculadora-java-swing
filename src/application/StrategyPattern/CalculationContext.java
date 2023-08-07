/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.StrategyPattern;

/**
 *
 * @author DELL
 */
public class CalculationContext {
    
    private CalculationStrategy strategy;
    public CalculationContext(){
    }
    
    public void setStrategy(CalculationStrategy strategy){
        this.strategy = strategy;
    }
    
    public double executeCalculationStrategy(double a, double b){
        
            return strategy.calculate(a, b);
        
        
    }
}
