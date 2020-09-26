/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Locale;
import javax.swing.JTextField;

/**
 *
 * @author silas
 */
public class ControllerNumeros {
    
    /**
     *
     * @param value1
     * @param strValue2
     * @param option
     * @return
     */
    public static double calculate(double value1, String strValue2, Character option) {
        double value2 = Double.parseDouble(strValue2);
        
        switch (option) {
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            case '/':
                return value1 / value2;
            default:
                return value2;
        }
        
    }

    public static boolean numbersButtons(JTextField field, String number, boolean nextNumber) {
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
    
    public static boolean hasDecimalPoint(double numberVal) {
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
