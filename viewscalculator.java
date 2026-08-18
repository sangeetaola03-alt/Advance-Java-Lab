import javax.swing.*;
import java.awt.event.*;

public class viewscalculator extends JFrame {

    // Labels
    JLabel a, b, result;

    // Text Fields
    JTextField txta, txtb, txtresult;

    // Buttons
    JButton ADD, SUB, MULTI, DIV;

    // Constructor
    public viewscalculator() {

        setTitle("Calculator");
        setSize(450, 350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // First Number
        a = new JLabel("Enter First Number:");
        a.setBounds(30, 30, 150, 30);
        add(a);

        txta = new JTextField();
        txta.setBounds(180, 30, 150, 30);
        add(txta);

        // Second Number
        b = new JLabel("Enter Second Number:");
        b.setBounds(30, 80, 150, 30);
        add(b);

        txtb = new JTextField();
        txtb.setBounds(180, 80, 150, 30);
        add(txtb);

        // Result
        result = new JLabel("Result:");
        result.setBounds(30, 130, 150, 30);
        add(result);

        txtresult = new JTextField();
        txtresult.setBounds(180, 130, 150, 30);
        txtresult.setEditable(false);
        add(txtresult);

        // Buttons
        ADD = new JButton("+");
        ADD.setBounds(30, 200, 70, 40);
        add(ADD);

        SUB = new JButton("-");
        SUB.setBounds(110, 200, 70, 40);
        add(SUB);

        MULTI = new JButton("*");
        MULTI.setBounds(190, 200, 70, 40);
       
        add(MULTI);

        DIV = new JButton("/");
        DIV.setBounds(270, 200, 70, 40);
        
        add(DIV);





        setVisible(true);
    }

}
