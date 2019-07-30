package com.driver;

import com.operations.BasicOperators;
import com.operations.InputValidation;
import com.operations.TangentOperator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * CalculatorUI Class.
 * Includes main() method of the program.
 * @author Vikram
 * @version 1.0.0
 */
public class CalculatorUI extends JFrame implements ActionListener {

  static JFrame frame;
  static JTextField tf = null;
  static JLabel errLabel = null;
  /**
   * Constructor of CalculatorUI class.
   */

  public CalculatorUI() {
    getContentPane().setLayout(null);
    frame = new JFrame("Calculator");
    tf = new JTextField();
    errLabel = new JLabel("");
  }
  /**
   * This is the main() method of the program.
   * Entry point of the Execution of the whole program.
   * GUI is defined here.
   *
   * @param args , String array
   */

  public static void main(String[] args) {

    final CalculatorUI calui = new CalculatorUI();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    JPanel panel = new JPanel();
    tf.setBounds(48, 31, 155, 37);
    frame.getContentPane().add(tf);
    tf.setColumns(10);

    JButton add = new JButton("+");
    add.addActionListener(calui);
    add.setBounds(48, 81, 69, 25);
    frame.getContentPane().add(add);
    add.addActionListener(calui);

    JButton subtract = new JButton("-");
    subtract.setBounds(200, 81, 69, 25);
    frame.getContentPane().add(subtract);
    subtract.addActionListener(calui);
    JButton multiply = new JButton("*");
    multiply.setBounds(48, 200, 69, 25);
    frame.getContentPane().add(multiply);
    multiply.addActionListener(calui);
    JButton divide = new JButton("/");
    divide.setBounds(200, 200, 69, 25);
    frame.getContentPane().add(divide);
    divide.addActionListener(calui);
    JButton tan = new JButton("tan");
    tan.addActionListener(calui);
    tan.setBounds(120, 150, 69, 25);
    frame.getContentPane().add(tan);
    JButton equal = new JButton("=");
    equal.setBounds(215, 37, 48, 25);
    frame.getContentPane().add(equal);
    equal.addActionListener(calui);

    errLabel.setBounds(400, 400, 69, 45);
    frame.getContentPane().add(errLabel);

    frame.setVisible(true);
  }
  /**
   * This function invokes when any button is pressed.
   *
   * @param e , ActionEvent
   */

  @Override
  public void actionPerformed(ActionEvent e) {

    String s = e.getActionCommand();
    String input = tf.getText();
    String res = "";
    if (s.equals("=")) {
      res = BasicOperators.equal(input);
    }
    if (s.equals("+")) {
      res = BasicOperators.add(input);
    }
    if (s.equals("-")) {
      res = BasicOperators.subtract(input);
    }
    if (s.equals("*")) {
      res = BasicOperators.multiply(input);
    }
    if (s.equals("/")) {
      res = BasicOperators.divide(input);
    }
    if (s.equals("tan")) {
      errLabel.setText("");

      boolean isValid = InputValidation.validateInput(input);
      if (isValid) {
        double angle = Double.parseDouble(input);
        double tan = TangentOperator.tangent(angle);
        res = BasicOperators.roundOff(tan) + "";
      } else {
        try {

          double x = Double.parseDouble(input);
          errLabel.setText("Math Error");

        } catch (Exception ex) {
          errLabel.setText("WRONG INPUT, PROVIDE INPUT IN ANGLES");
        }
      }
    }

    tf.setText(res);
  }
}
