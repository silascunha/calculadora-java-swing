/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import java.util.Properties;

/**
 *
 * @author silas
 */
public class Program extends javax.swing.JFrame {

    /**
     * Creates new form Program
     */
    private List<JButton> buttons = new ArrayList<>();
    private static String selectedTheme;
    private static final String THEME_PATH = "theme.properties";

    public Program() {
        initComponents();

        buttons.add(numberButton0);
        buttons.add(numberButton1);
        buttons.add(numberButton2);
        buttons.add(numberButton3);
        buttons.add(numberButton3);
        buttons.add(numberButton4);
        buttons.add(numberButton5);
        buttons.add(numberButton6);
        buttons.add(numberButton7);
        buttons.add(numberButton8);
        buttons.add(numberButton9);
        buttons.add(buttonC);
        buttons.add(buttonPlus);
        buttons.add(buttonMinus);
        buttons.add(buttonDivision);
        buttons.add(buttonPoint);
        buttons.add(buttonMultiplication);
        buttons.add(buttonEquals);

        try ( InputStream input = new FileInputStream(THEME_PATH)) {

            Properties prop = new Properties();
            prop.load(input);
            selectedTheme = prop.getProperty("selected-theme");
            if (selectedTheme.equals("0")) {
                themeDefault.setSelected(true);
            } else {
                themeDark.setSelected(true);
            }
            chooseTheme(selectedTheme);

        } catch (IOException e) {
            System.out.println("Trying to create properties file.");
            try (OutputStream output = new FileOutputStream(THEME_PATH)) {
                Properties prop = new Properties();
                prop.setProperty("selected-theme", "0");
                prop.store(output, null);
                selectedTheme = "0";
                
            } catch (IOException e2) {
                System.out.println("Error: "+ e.getMessage());
            }
        }
    }

    //Número que será gerado nas ações dos botões
    public double numberVal = 0.0;
    public boolean nextNumber;
    public char option = ' ';

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        backgroundPane = new javax.swing.JPanel();
        resultPane = new javax.swing.JPanel();
        fieldResult = new javax.swing.JTextField();
        numbersPane = new javax.swing.JPanel();
        numberButton7 = new javax.swing.JButton();
        numberButton8 = new javax.swing.JButton();
        numberButton9 = new javax.swing.JButton();
        numberButton4 = new javax.swing.JButton();
        numberButton5 = new javax.swing.JButton();
        numberButton6 = new javax.swing.JButton();
        numberButton1 = new javax.swing.JButton();
        numberButton2 = new javax.swing.JButton();
        numberButton3 = new javax.swing.JButton();
        buttonPoint = new javax.swing.JButton();
        numberButton0 = new javax.swing.JButton();
        buttonEquals = new javax.swing.JButton();
        optionsPane = new javax.swing.JPanel();
        buttonC = new javax.swing.JButton();
        buttonPlus = new javax.swing.JButton();
        buttonMinus = new javax.swing.JButton();
        buttonMultiplication = new javax.swing.JButton();
        buttonDivision = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        themeDefault = new javax.swing.JRadioButtonMenuItem();
        themeDark = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        backgroundPane.setBackground(new java.awt.Color(216, 216, 216));
        backgroundPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultPane.setBackground(new java.awt.Color(216, 216, 216));

        fieldResult.setEditable(false);
        fieldResult.setBackground(new java.awt.Color(204, 204, 204));
        fieldResult.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        fieldResult.setForeground(new java.awt.Color(0, 0, 0));
        fieldResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fieldResult.setText("0");
        fieldResult.setPreferredSize(new java.awt.Dimension(260, 60));
        fieldResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldResultActionPerformed(evt);
            }
        });
        resultPane.add(fieldResult);

        backgroundPane.add(resultPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 301, 70));

        numbersPane.setBackground(new java.awt.Color(216, 216, 216));
        numbersPane.setPreferredSize(new java.awt.Dimension(200, 200));
        numbersPane.setLayout(new java.awt.GridLayout(4, 4));

        numberButton7.setBackground(new java.awt.Color(204, 204, 204));
        numberButton7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numberButton7.setForeground(new java.awt.Color(0, 0, 0));
        numberButton7.setText("7");
        numberButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numberButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton7ActionPerformed(evt);
            }
        });
        numbersPane.add(numberButton7);

        numberButton8.setBackground(new java.awt.Color(204, 204, 204));
        numberButton8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numberButton8.setForeground(new java.awt.Color(0, 0, 0));
        numberButton8.setText("8");
        numberButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numberButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton8ActionPerformed(evt);
            }
        });
        numbersPane.add(numberButton8);

        numberButton9.setBackground(new java.awt.Color(204, 204, 204));
        numberButton9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numberButton9.setForeground(new java.awt.Color(0, 0, 0));
        numberButton9.setText("9");
        numberButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numberButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton9ActionPerformed(evt);
            }
        });
        numbersPane.add(numberButton9);

        numberButton4.setBackground(new java.awt.Color(204, 204, 204));
        numberButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numberButton4.setForeground(new java.awt.Color(0, 0, 0));
        numberButton4.setText("4");
        numberButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numberButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton4ActionPerformed(evt);
            }
        });
        numbersPane.add(numberButton4);

        numberButton5.setBackground(new java.awt.Color(204, 204, 204));
        numberButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numberButton5.setForeground(new java.awt.Color(0, 0, 0));
        numberButton5.setText("5");
        numberButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numberButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton5ActionPerformed(evt);
            }
        });
        numbersPane.add(numberButton5);

        numberButton6.setBackground(new java.awt.Color(204, 204, 204));
        numberButton6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numberButton6.setForeground(new java.awt.Color(0, 0, 0));
        numberButton6.setText("6");
        numberButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numberButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton6ActionPerformed(evt);
            }
        });
        numbersPane.add(numberButton6);

        numberButton1.setBackground(new java.awt.Color(204, 204, 204));
        numberButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numberButton1.setForeground(new java.awt.Color(0, 0, 0));
        numberButton1.setText("1");
        numberButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numberButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton1ActionPerformed(evt);
            }
        });
        numbersPane.add(numberButton1);

        numberButton2.setBackground(new java.awt.Color(204, 204, 204));
        numberButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numberButton2.setForeground(new java.awt.Color(0, 0, 0));
        numberButton2.setText("2");
        numberButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numberButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton2ActionPerformed(evt);
            }
        });
        numbersPane.add(numberButton2);

        numberButton3.setBackground(new java.awt.Color(204, 204, 204));
        numberButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numberButton3.setForeground(new java.awt.Color(0, 0, 0));
        numberButton3.setText("3");
        numberButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numberButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton3ActionPerformed(evt);
            }
        });
        numbersPane.add(numberButton3);

        buttonPoint.setBackground(new java.awt.Color(204, 204, 204));
        buttonPoint.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonPoint.setForeground(new java.awt.Color(0, 0, 0));
        buttonPoint.setText(".");
        buttonPoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPointActionPerformed(evt);
            }
        });
        numbersPane.add(buttonPoint);

        numberButton0.setBackground(new java.awt.Color(204, 204, 204));
        numberButton0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numberButton0.setForeground(new java.awt.Color(0, 0, 0));
        numberButton0.setText("0");
        numberButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numberButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton0ActionPerformed(evt);
            }
        });
        numbersPane.add(numberButton0);

        buttonEquals.setBackground(new java.awt.Color(204, 204, 204));
        buttonEquals.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonEquals.setForeground(new java.awt.Color(0, 0, 0));
        buttonEquals.setText("=");
        buttonEquals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqualsActionPerformed(evt);
            }
        });
        numbersPane.add(buttonEquals);

        backgroundPane.add(numbersPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 230, 300));

        optionsPane.setBackground(new java.awt.Color(216, 216, 216));
        optionsPane.setLayout(new java.awt.GridLayout(5, 0));

        buttonC.setBackground(new java.awt.Color(204, 204, 204));
        buttonC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonC.setForeground(new java.awt.Color(0, 0, 0));
        buttonC.setText("C");
        buttonC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCActionPerformed(evt);
            }
        });
        optionsPane.add(buttonC);

        buttonPlus.setBackground(new java.awt.Color(204, 204, 204));
        buttonPlus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonPlus.setForeground(new java.awt.Color(0, 0, 0));
        buttonPlus.setText("+");
        buttonPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlusActionPerformed(evt);
            }
        });
        optionsPane.add(buttonPlus);

        buttonMinus.setBackground(new java.awt.Color(204, 204, 204));
        buttonMinus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonMinus.setForeground(new java.awt.Color(0, 0, 0));
        buttonMinus.setText("-");
        buttonMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMinusActionPerformed(evt);
            }
        });
        optionsPane.add(buttonMinus);

        buttonMultiplication.setBackground(new java.awt.Color(204, 204, 204));
        buttonMultiplication.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonMultiplication.setForeground(new java.awt.Color(0, 0, 0));
        buttonMultiplication.setText("x");
        buttonMultiplication.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiplicationActionPerformed(evt);
            }
        });
        optionsPane.add(buttonMultiplication);

        buttonDivision.setBackground(new java.awt.Color(204, 204, 204));
        buttonDivision.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonDivision.setForeground(new java.awt.Color(0, 0, 0));
        buttonDivision.setText("÷");
        buttonDivision.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivisionActionPerformed(evt);
            }
        });
        optionsPane.add(buttonDivision);

        backgroundPane.add(optionsPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 96, 60, 290));

        jMenu1.setText("Opções");

        jMenu3.setText("Tema");

        buttonGroup1.add(themeDefault);
        themeDefault.setSelected(true);
        themeDefault.setText("Padrão");
        themeDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themeDefaultActionPerformed(evt);
            }
        });
        jMenu3.add(themeDefault);

        buttonGroup1.add(themeDark);
        themeDark.setText("Dark");
        themeDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themeDarkActionPerformed(evt);
            }
        });
        jMenu3.add(themeDark);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backgroundPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backgroundPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldResultActionPerformed

    }//GEN-LAST:event_fieldResultActionPerformed

    private void numberButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton1ActionPerformed
        nextNumber = NumbersChecking.numbersButtons(fieldResult, "1", nextNumber);
    }//GEN-LAST:event_numberButton1ActionPerformed

    private void buttonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqualsActionPerformed
        if (!fieldResult.getText().equals("0") && fieldResult.getText() != null) {
            String strValue2 = fieldResult.getText();
            numberVal = NumbersChecking.calculate(numberVal, strValue2, option);
            if (NumbersChecking.hasDecimalPoint(numberVal)) {
                fieldResult.setText(String.valueOf(numberVal));
            } else {
                fieldResult.setText(String.valueOf((int) numberVal));
            }
            option = '=';
            nextNumber = true;
        }
    }//GEN-LAST:event_buttonEqualsActionPerformed

    private void buttonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCActionPerformed
        fieldResult.setText("0");
        numberVal = 0.0;
    }//GEN-LAST:event_buttonCActionPerformed

    private void numberButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton2ActionPerformed
        nextNumber = NumbersChecking.numbersButtons(fieldResult, "2", nextNumber);
    }//GEN-LAST:event_numberButton2ActionPerformed

    private void numberButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton3ActionPerformed
        nextNumber = NumbersChecking.numbersButtons(fieldResult, "3", nextNumber);
    }//GEN-LAST:event_numberButton3ActionPerformed

    private void numberButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton4ActionPerformed
        nextNumber = NumbersChecking.numbersButtons(fieldResult, "4", nextNumber);
    }//GEN-LAST:event_numberButton4ActionPerformed

    private void numberButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton5ActionPerformed
        nextNumber = NumbersChecking.numbersButtons(fieldResult, "5", nextNumber);
    }//GEN-LAST:event_numberButton5ActionPerformed

    private void numberButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton6ActionPerformed
        nextNumber = NumbersChecking.numbersButtons(fieldResult, "6", nextNumber);
    }//GEN-LAST:event_numberButton6ActionPerformed

    private void numberButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton7ActionPerformed
        nextNumber = NumbersChecking.numbersButtons(fieldResult, "7", nextNumber);
    }//GEN-LAST:event_numberButton7ActionPerformed

    private void numberButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton8ActionPerformed
        nextNumber = NumbersChecking.numbersButtons(fieldResult, "8", nextNumber);
    }//GEN-LAST:event_numberButton8ActionPerformed

    private void numberButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton9ActionPerformed
        nextNumber = NumbersChecking.numbersButtons(fieldResult, "9", nextNumber);
    }//GEN-LAST:event_numberButton9ActionPerformed

    private void numberButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton0ActionPerformed
        nextNumber = NumbersChecking.numbersButtons(fieldResult, "0", nextNumber);
    }//GEN-LAST:event_numberButton0ActionPerformed

    private void buttonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlusActionPerformed
        if (!fieldResult.getText().equals("0") && fieldResult.getText() != null) {
            String strValue2 = fieldResult.getText();
            numberVal = NumbersChecking.calculate(numberVal, strValue2, option);
            if (NumbersChecking.hasDecimalPoint(numberVal)) {
                fieldResult.setText(String.valueOf(numberVal));
            } else {
                fieldResult.setText(String.valueOf((int) numberVal));
            }
            option = '+';
            nextNumber = true;
        }
    }//GEN-LAST:event_buttonPlusActionPerformed

    private void themeDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themeDefaultActionPerformed
        if (!selectedTheme.equals("0")) {
            chooseTheme("0");
        }
    }//GEN-LAST:event_themeDefaultActionPerformed

    private void themeDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themeDarkActionPerformed
        if (!selectedTheme.equals("1")) {
            chooseTheme("1");
        }
    }//GEN-LAST:event_themeDarkActionPerformed

    private void buttonPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPointActionPerformed
        if (fieldResult.getText().equals("0") || nextNumber) {
            fieldResult.setText("0.");
            nextNumber = false;
        } else if (!fieldResult.getText().contains(".")) {
            fieldResult.setText(fieldResult.getText() + ".");
        }
    }//GEN-LAST:event_buttonPointActionPerformed

    private void buttonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinusActionPerformed
        if (!fieldResult.getText().equals("0") && fieldResult.getText() != null) {
            String strValue2 = fieldResult.getText();
            numberVal = NumbersChecking.calculate(numberVal, strValue2, option);
            if (NumbersChecking.hasDecimalPoint(numberVal)) {
                fieldResult.setText(String.valueOf(numberVal));
            } else {
                fieldResult.setText(String.valueOf((int) numberVal));
            }
            option = '-';
            nextNumber = true;
        }
    }//GEN-LAST:event_buttonMinusActionPerformed

    private void buttonMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultiplicationActionPerformed
        if (!fieldResult.getText().equals("0") && fieldResult.getText() != null) {
            String strValue2 = fieldResult.getText();
            numberVal = NumbersChecking.calculate(numberVal, strValue2, option);
            if (NumbersChecking.hasDecimalPoint(numberVal)) {
                fieldResult.setText(String.valueOf(numberVal));
            } else {
                fieldResult.setText(String.valueOf((int) numberVal));
            }
            option = '*';
            nextNumber = true;
        }
    }//GEN-LAST:event_buttonMultiplicationActionPerformed

    private void buttonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivisionActionPerformed
        if (!fieldResult.getText().equals("0") && fieldResult.getText() != null) {
            String strValue2 = fieldResult.getText();
            numberVal = NumbersChecking.calculate(numberVal, strValue2, option);
            if (NumbersChecking.hasDecimalPoint(numberVal)) {
                fieldResult.setText(String.valueOf(numberVal));
            } else {
                fieldResult.setText(String.valueOf((int) numberVal));
            }
            option = '/';
            nextNumber = true;
        }
    }//GEN-LAST:event_buttonDivisionActionPerformed

    private void chooseTheme(String theme) {
        if (theme.equals("0")) {
            for (JButton b : buttons) {
                b.setBackground(new Color(204, 204, 204));
                b.setForeground(new Color(0, 0, 0));
            }
            fieldResult.setBackground(new Color(204, 204, 204));
            fieldResult.setForeground(new Color(0, 0, 0));
            backgroundPane.setBackground(new Color(216, 216, 216));
            numbersPane.setBackground(new Color(216, 216, 216));
            resultPane.setBackground(new Color(216, 216, 216));
            optionsPane.setBackground(new Color(216, 216, 216));

            try (OutputStream output = new FileOutputStream(THEME_PATH)) {
                Properties prop = new Properties();
                prop.setProperty("selected-theme", "0");
                prop.store(output, null);
                selectedTheme = prop.getProperty("selected-theme");
            } catch (IOException e) {
                System.out.println("Error to open file: " + e.getMessage());
            }
        }
        if (theme.equals("1")) {
            for (JButton b : buttons) {
                b.setBackground(new Color(10, 10, 10));
                b.setForeground(new Color(230, 230, 230));
            }
            fieldResult.setBackground(new Color(55, 55, 55));
            fieldResult.setForeground(new Color(230, 230, 230));
            backgroundPane.setBackground(new Color(45, 45, 45));
            numbersPane.setBackground(new Color(45, 45, 45));
            resultPane.setBackground(new Color(45, 45, 45));
            optionsPane.setBackground(new Color(45, 45, 45));

            try ( OutputStream output = new FileOutputStream(THEME_PATH)) {
                Properties prop = new Properties();
                prop.setProperty("selected-theme", "1");
                prop.store(output, null);
                selectedTheme = prop.getProperty("selected-theme");
            } catch (IOException e) {
                System.out.println("Error to open file: " + e.getMessage());
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new Program().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPane;
    private javax.swing.JButton buttonC;
    private javax.swing.JButton buttonDivision;
    private javax.swing.JButton buttonEquals;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonMinus;
    private javax.swing.JButton buttonMultiplication;
    private javax.swing.JButton buttonPlus;
    private javax.swing.JButton buttonPoint;
    private javax.swing.JTextField fieldResult;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton numberButton0;
    private javax.swing.JButton numberButton1;
    private javax.swing.JButton numberButton2;
    private javax.swing.JButton numberButton3;
    private javax.swing.JButton numberButton4;
    private javax.swing.JButton numberButton5;
    private javax.swing.JButton numberButton6;
    private javax.swing.JButton numberButton7;
    private javax.swing.JButton numberButton8;
    private javax.swing.JButton numberButton9;
    private javax.swing.JPanel numbersPane;
    private javax.swing.JPanel optionsPane;
    private javax.swing.JPanel resultPane;
    private javax.swing.JRadioButtonMenuItem themeDark;
    private javax.swing.JRadioButtonMenuItem themeDefault;
    // End of variables declaration//GEN-END:variables

}
