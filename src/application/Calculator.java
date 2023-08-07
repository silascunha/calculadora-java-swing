/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import application.StrategyPattern.CalculationContext;
import application.StrategyPattern.CalculationStrategy;
import application.StrategyPattern.ConcreteStrategyAddition;
import application.StrategyPattern.ConcreteStrategyDivision;
import application.StrategyPattern.ConcreteStrategyMultiplication;
import application.StrategyPattern.ConcreteStrategySubstraction;
import java.util.Locale;
import javax.swing.JTextField;

/**
 *
 * @author silas
 */
public class Calculator {
    CalculationContext context;
    private static Calculator instance;
    private CalculatorType calculatorType;
    
    
    public double calculate(double value1, String strValue2, Character option) {
        calculatorType = new BasicCalculator();
        double value2 = Double.parseDouble(strValue2);
        return calculatorType.calculate(value1, Double.valueOf(strValue2), option);
        
    }
    
    private Calculator(){
        this.context = new CalculationContext();
    }
    
    public static Calculator getInstance(){
        instance = new Calculator();
        return instance;
    }

    public boolean numbersButtons(JTextField field, String number, boolean nextNumber) {
        if (field.getText().equals("0")) {
            field.setText(number);
        } else {
            if (nextNumber) {
                field.setText(number);
                return false;
            }
            else {
                field.setText(field.getText() + number);
            }
           
        }
        return false;
    }
    
    public boolean hasDecimalPoint(double numberVal) {
        String aux = String.valueOf(numberVal);
        
        if (aux.contains(".")) {
            String replace = aux.replace('.', ',');
            String[] vect = replace.split(",");
            if (vect[1].equals("0")) return false;
            else return true;
        }
        return false;
    }
    
}
