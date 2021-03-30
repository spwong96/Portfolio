package com.company;

import javax.swing.*;
import java.awt.event.*;

public class Calculator {

    private double value1 = 0.0;
    private double value2 = 0.0;
    private double answer = 0.0;
    private char math_operator;

    private JPanel Calculator;
    private JTextField textField;
    private JButton btnDec;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnFive;
    private JButton btnTwo;
    private JButton btnZero;
    private JButton btnNine;
    private JButton btnSix;
    private JButton btnThree;
    private JButton btnEqual;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMult;
    private JButton btnDiv;
    private JButton btnClear;

    private void getOperator(String btnText) {
        math_operator = btnText.charAt(0);
        value1 = Double.parseDouble(textField.getText());
        textField.setText("");
    }

    public Calculator() {
        //KEYSTROKE RECOGNITION
        InputMap inMap = Calculator.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap action = Calculator.getActionMap();

        //Clear
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1 = 0;
                value2 = 0;

                textField.setText("");
            }
        });

        inMap.put(KeyStroke.getKeyStroke("C"),"Clear");
        action.put("Clear",new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                value1 = 0;
                value2 = 0;

                textField.setText("");
            }
        });

        //Zero
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textField.getText() + btnZero.getText();
                textField.setText(btnZeroText);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0,0),"Zero");
        inMap.put(KeyStroke.getKeyStroke("0"),"Zero");

        action.put("Zero",new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String btnZeroText = textField.getText() + btnZero.getText();
                textField.setText(btnZeroText);
            }
        });

        //One
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField.getText() + btnOne.getText();
                textField.setText(btnOneText);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1,0),"One");
        inMap.put(KeyStroke.getKeyStroke("1"),"One");

        action.put("One",new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String btnOneText = textField.getText() + btnOne.getText();
                textField.setText(btnOneText);
            }
        });

        //Two
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textField.getText() + btnTwo.getText();
                textField.setText(btnTwoText);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2,0),"Two");
        inMap.put(KeyStroke.getKeyStroke("2"),"Two");

        action.put("Two",new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String btnTwoText = textField.getText() + btnTwo.getText();
                textField.setText(btnTwoText);
            }
        });

        //Three
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textField.getText() + btnThree.getText();
                textField.setText(btnThreeText);
            }
        });
        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3,0),"Three");
        inMap.put(KeyStroke.getKeyStroke("3"),"Three");

        action.put("Three",new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String btnThreeText = textField.getText() + btnThree.getText();
                textField.setText(btnThreeText);
            }
        });

        //Four
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textField.getText() + btnFour.getText();
                textField.setText(btnFourText);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4,0),"Four");
        inMap.put(KeyStroke.getKeyStroke("4"),"Four");

        action.put("Four",new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String btnFourText = textField.getText() + btnFour.getText();
                textField.setText(btnFourText);
            }
        });

        //Five
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textField.getText() + btnFive.getText();
                textField.setText(btnFiveText);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5,0),"Five");
        inMap.put(KeyStroke.getKeyStroke("5"),"Five");

        action.put("Five",new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String btnFiveText = textField.getText() + btnFive.getText();
                textField.setText(btnFiveText);
            }
        });

        //Six
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textField.getText() + btnSix.getText();
                textField.setText(btnSixText);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6,0),"Six");
        inMap.put(KeyStroke.getKeyStroke("6"),"Six");

        action.put("Six",new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String btnSixText = textField.getText() + btnSix.getText();
                textField.setText(btnSixText);
            }
        });

        //Seven
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textField.getText() + btnSeven.getText();
                textField.setText(btnSevenText);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7,0),"Seven");
        inMap.put(KeyStroke.getKeyStroke("7"),"Seven");

        action.put("Seven",new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String btnSevenText = textField.getText() + btnSeven.getText();
                textField.setText(btnSevenText);
            }
        });

        //Eight
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textField.getText() + btnEight.getText();
                textField.setText(btnEightText);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8,0),"Eight");
        inMap.put(KeyStroke.getKeyStroke("8"),"Eight");

        action.put("Eight",new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String btnEightText = textField.getText() + btnEight.getText();
                textField.setText(btnEightText);
            }
        });

        //Nine
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textField.getText() + btnNine.getText();
                textField.setText(btnNineText);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9,0),"Nine");
        inMap.put(KeyStroke.getKeyStroke("9"),"Nine");

        action.put("Nine",new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String btnNineText = textField.getText() + btnNine.getText();
                textField.setText(btnNineText);
            }
        });

        //Decimal
        btnDec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDecText = textField.getText();

                if(textField.getText().equals("")) {
                    textField.setText("0.");
                } else if(textField.getText().contains(".")) {
                    btnDec.setEnabled(false);
                }
                else {
                    textField.setText(btnDecText + btnDec.getText());
                }
                btnDec.setEnabled(true);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD, 0), "Decimal");
        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, 0), "Decimal");

        action.put("Decimal", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDecText = textField.getText();

                if(textField.getText().equals("")) {
                    textField.setText("0.");
                } else if(textField.getText().contains(".")) {
                    btnDec.setEnabled(false);
                }
                else {
                    textField.setText(btnDecText + btnDec.getText());
                }
                btnDec.setEnabled(true);
            }
        });

        //Plus
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0), "Plus");
        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, KeyEvent.SHIFT_DOWN_MASK), "Plus");

        action.put("Plus", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });

        //Minus
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, 0), "Minus");
        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0), "Minus");

        action.put("Minus", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });

        //Multiply
        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMult.getText();
                getOperator(button_text);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0), "Multiply");
        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_8, KeyEvent.SHIFT_DOWN_MASK), "Multiply");

        action.put("Multiply", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMult.getText();
                getOperator(button_text);
            }
        });

        //Divide
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDiv.getText();
                getOperator(button_text);
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0), "Divide");
        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SLASH,0), "Divide");

        action.put("Divide", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDiv.getText();
                getOperator(button_text);
            }
        });

        //Equals
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (answer == Double.parseDouble(textField.getText())) {
                    value1 = answer;

                } else {
                    value2 = Double.parseDouble(textField.getText());
                }
                switch (math_operator) {
                    case '+':
                        answer = value1 + value2;
                        break;

                    case '-':
                        answer = value1 - value2;
                        break;

                    case '/':
                        answer = value1 / value2;
                        break;

                    case '*':
                        answer = value1 * value2;
                        break;
                }
            }
        });

        inMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "Enter");

        action.put("Enter", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(answer == Double.parseDouble(textField.getText())) {
                    value1 = answer;

                } else {
                    value2 = Double.parseDouble(textField.getText());
                }
                switch(math_operator) {
                    case '+':
                        answer = value1 + value2;
                        break;

                    case '-':
                        answer = value1 - value2;
                        break;

                    case '/':
                        answer = value1 / value2;
                        break;

                    case '*':
                        answer = value1 * value2;
                        break;
                }

                textField.setText(Double.toString(answer));

                System.out.println("Value 1: " + value1);
                System.out.println("Operator: " + math_operator);
                System.out.println("Value 2: " + value2);
                System.out.println("Answer: " + answer + "\n");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
