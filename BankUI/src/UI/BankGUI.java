package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankGUI extends JFrame {

    JFrame bankFrame = new JFrame("Hello");
    JLabel bankLabel = new JLabel("Welcome to Curry Bank");
    JTextArea bankArea = new JTextArea("Dear Customer which account do you want to use");
    JButton bankButton = new JButton("Current Account");
    
    JButton bankButton2 = new JButton("Savings Account");

    JFrame CurrentAccount = new JFrame("Welcome to your Current Please Make your Transaction");

    JButton Currentaccount = new JButton("Withdrawl");
    JButton getCurrentaccount = new JButton("Deposit");

    JTextField CurrentAmount = new JTextField("Amount");
    JTextField CurrentPin = new JTextField("Insert Pin");
    JFrame SavingsAccount = new JFrame("Welcome to your Savings Please Make your Transaction");
    JButton Savingsaccount = new JButton("Withdrawl");
    JButton getSavingsaccount = new JButton("Deposit");
    JTextField SavingsAmount = new JTextField("Amount");
    JTextField SavingsPin = new JTextField("Insert PIn");



    public void mainUI(){
        bankFrame.add(bankArea);
        bankFrame.add(bankLabel);
        bankFrame.add(bankButton);
        bankFrame.add(bankButton2);

        CurrentAccount.add(Currentaccount);
        CurrentAccount.add(getCurrentaccount);
        CurrentAccount.add(CurrentAmount);
        CurrentAccount.add(CurrentPin);

        bankFrame.setSize(200,300);
        bankFrame.setLayout(new FlowLayout(FlowLayout.TRAILING));
        bankFrame.setVisible(true);
        
      Currentaccount1.add(CurrentAmount);
        Currentaccount1.add(Currentaccount2);

        Savingsaccount1.add(SavingsAmount);
        Savingsaccount1.add(Savingsaccount2);

        Currentaccount3.add(CurrentAmount1);
        Currentaccount3.add(Currentaccount4);

        Savingsaccount3.add(SavingsAmount1);
        Savingsaccount3.add(Savingsaccount4);


;
        
       bankButton.addActionListener(e -> {

           CurrentAccount.setSize(200, 300);
           CurrentAccount.setLayout(new FlowLayout(FlowLayout.CENTER));
           CurrentAccount.setVisible(true);
       });
       bankButton2.addActionListener(e -> {
           SavingsAccount.setSize(200,300);
           SavingsAccount.setLayout(new FlowLayout(FlowLayout.CENTER));
           SavingsAccount.setVisible(true);
       });
        Currentaccount.addActionListener(e -> {
            Currentaccount1.setLayout(new FlowLayout(FlowLayout.CENTER));
            Currentaccount1.setSize(200, 300);
            Currentaccount1.setVisible(true);


        });
        Savingsaccount.addActionListener(e -> {
            Savingsaccount1.setSize(200, 300);
            Savingsaccount1.setLayout(new FlowLayout(FlowLayout.CENTER));
            Savingsaccount1.setVisible(true);


        });
        getCurrentaccount.addActionListener(e ->{
            Currentaccount3.setSize(200, 300);
            Currentaccount3.setLayout(new FlowLayout(FlowLayout.CENTER));
            Currentaccount3.setVisible(true);
        });
        getSavingsaccount.addActionListener(e ->{
            Savingsaccount3.setSize(200, 300);
            Savingsaccount3.setLayout(new FlowLayout(FlowLayout.CENTER));
            Savingsaccount3.setVisible(true);
        });



    }
}
