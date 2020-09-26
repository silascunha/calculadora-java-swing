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
