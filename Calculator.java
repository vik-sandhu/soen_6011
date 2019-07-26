/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 *
 * @author vi_ing
 */


    

public class Calculator {

	
	
	public static double tanget(double x)
	{
		double tan = 0.0;
		if(x>180 || x < 0)
		{
			if(x > 180)
			{
				x = x - ((int)x/180)*180;
			}
			if(x < 0)
			{
				x = x + (((int)x/180)+1)*180;
			}			
		}
		
		if(x>90)
		{
			x = -1*(180 - x);
		}
		
		double r = ( x * 22/7.0)/180 ; 
		
		double a = (1/3.0)*Math.pow(r,3.0) ; 
		double b = (2/15.0)*Math.pow(r, 5);
		double c = (17/315.0)*Math.pow(r, 7);
		tan = r + a + b + c ; 
		
		
		return tan;
	}
	
	public static void main(String args[]) {
	
	JFrame frame = new JFrame("Tangent Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300, 300);
	JPanel panel = new JPanel(); 
        JLabel label = new JLabel("Tan");
        JTextField tf = new JTextField(16); 
        JButton find = new JButton("Tan");        
        panel.add(BorderLayout.EAST,label); 
        panel.add(BorderLayout.EAST,tf);
        panel.add(BorderLayout.WEST,find);
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        
        JPanel resPanel = new JPanel(); 
        JLabel resMessage = new JLabel("");
        resPanel.add(resMessage);
        frame.getContentPane().add(BorderLayout.CENTER,resPanel);
          
        JPanel errPanel = new JPanel(); 
        JLabel erMessage = new JLabel("");
        errPanel.add(erMessage);
        frame.getContentPane().add(BorderLayout.SOUTH,errPanel);
        
        frame.setVisible(true);

        find.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				erMessage.setText("");
				String angle = tf.getText();
				try {
					double x = Double.parseDouble(angle);
					if(x != 0 && x%90 == 0.0)
					{
						resMessage.setText("Math Error");
					}else if(x == 45 || x==-45)
					{
						resMessage.setText("1");
					}
                                        else {
						double tan = tanget(x);
						resMessage.setText(tan + "");
					}
				}catch(Exception ex)
				{
					resMessage.setText("WRONG INPUT..Please provide angle in degrees.");
				}
				
			}
		});
	}
	
}

