package com.Calculator;
import java.awt.EventQueue;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.util.ArrayList;

public class Calculator2 {
    public class Calculator extends JFrame {

        private ArrayList<JButton> numbers;   // holds numerical buttons
        private ArrayList<JButton> operations; // holds math operation buttons
        private ArrayList<JButton> aux;      // holds equals, clear and delete buttons

        private JTextField answerField;   // text field which displays current operands/answer

        // panels for numerical,  math operation and auxillary buttons
        private JPanel numberPanel, functionPanel, answerPanel;

        private double op1, op2;  // numerical value of each operand
        private String op1Str, op2Str; // current String value of each operand
        private String operation;  // current math operation

        // true if value is set, false if not
        private boolean op1HasValue, op2HasValue, operationHasValue;

        private String answer;   // holds current equation

        public Calculator() {
            super("Java Calculator");
            setLayout(new GridLayout(1, 3));

            op1HasValue = op2HasValue = operationHasValue = false;
            answer = "";
            op1Str = "";
            op2Str = "";

            //create panels
            numberPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            functionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            answerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

            //add number buttons to panel
            numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(new JButton("" + i));
                numberPanel.add(numbers.get(i));
            }
            // also add decimal point button
            numbers.add(new JButton("."));
            numberPanel.add(numbers.get(10));

            // add function buttons to panel
            operations = new ArrayList<>();
            operations.add(new JButton("+"));
            operations.add(new JButton("-"));
            operations.add(new JButton("*"));
            operations.add(new JButton("/"));

            for (JButton button : operations)
                functionPanel.add(button);


            // add auxillary buttons to panel
            aux = new ArrayList<>();
            aux.add(new JButton("\u21D0"));
            aux.add(new JButton("Clr"));
            aux.add(new JButton("="));

            for (JButton button : aux)
                functionPanel.add(button);


            // add text field to panel
            answerField = new JTextField(15);
            answerField.setEditable(false);
            answerPanel.add(answerField);

            add(numberPanel);
            add(functionPanel);
            add(answerPanel);

            // add button listeners
            myHandler handler = new myHandler();

            for (JButton button : numbers)
                button.addActionListener(handler);

            for (JButton button : operations)
                button.addActionListener(handler);

            for (JButton button : aux)
                button.addActionListener(handler);

        }

        private class myHandler implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                if ((event.getActionCommand()).equals("Clr")) {
                    op1HasValue = op2HasValue = operationHasValue = false;
                    op1Str = "";
                    op2Str = "";
                    operation = "";
                    answer = "";
                    answerField.setText("");
                } else if ((event.getActionCommand()).equals("\u21D0")) {
                    if (!operationHasValue) {
                        if (!op1Str.isEmpty()) {
                            op1Str = op1Str.substring(0, op1Str.length() - 1);
                            answer = answer.substring(0, answer.length() - 1);
                            if (op1Str.isEmpty())
                                op1HasValue = false;
                            answerField.setText(answer);
                        }
                    } else if (operationHasValue && !op2HasValue) {
                        operation = "";
                        operationHasValue = false;
                        answer = answer.substring(0, answer.length() - 3);
                        answerField.setText(answer);
                    } else {
                        op2Str = op2Str.substring(0, op2Str.length() - 1);
                        answer = answer.substring(0, answer.length() - 1);
                        if (op2Str.isEmpty())
                            op2HasValue = false;
                        answerField.setText(answer);
                    }
                }  // wait for integer input event, add integer to operand #1
                else if ((!op1HasValue || !operationHasValue) && (numbers.contains((JButton) event.getSource()))) {
                    answer = answer + event.getActionCommand();
                    answerField.setText(answer);
                    op1Str = op1Str + event.getActionCommand();
                    op1HasValue = true;
                }   // wait for operation input event, save operand #1
                else if (!operationHasValue && op1HasValue && operations.contains((JButton) event.getSource())) {
                    op1 = Double.parseDouble(op1Str);
                    answerField.setText(answer + " " + event.getActionCommand() + " ");
                    answer = answer + " " + event.getActionCommand() + " ";
                    operation = event.getActionCommand();
                    operationHasValue = true;
                }   // wait for integer input event, add integer to operand #2
                else if (operationHasValue && numbers.contains((JButton) event.getSource())) {
                    answer = answer + event.getActionCommand();
                    answerField.setText(answer);
                    op2Str = op2Str + event.getActionCommand();
                    op2HasValue = true;
                }  // wait for equals sign input event, save operand #2, calculate answer
                else if (op1HasValue && op2HasValue && operationHasValue && (event.getActionCommand()).equals("=")) {
                    op2 = Double.parseDouble(op2Str);

                    if (operation.equals("+"))
                        answerField.setText("" + (op1 + op2));
                    else if (operation.equals("-"))
                        answerField.setText("" + (op1 - op2));
                    else if (operation.equals("*"))
                        answerField.setText("" + (op1 * op2));
                    else if (operation.equals("/"))
                        answerField.setText("" + (op1 / op2));

                    answer = "";
                    op1HasValue = op2HasValue = operationHasValue = false;
                }
            }
        }
    }
}
