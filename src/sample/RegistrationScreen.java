package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationScreen {
    private JFrame frame = createFrame();


    public RegistrationScreen() {

        JLabel lbl1 = new JLabel("Логин");
        JLabel lbl2 = new JLabel("Пароль");

        JTextField tx1 = new JTextField();
        JTextField tx2 = new JTextField();

        lbl1.setBounds(100,50, 100, 25);
        lbl2.setBounds(100,110, 100, 25);
        tx1.setBounds(100, 80, 100, 30);
        tx2.setBounds(100, 140,100, 30);


        frame.add(tx1);
        frame.add(tx2);
        frame.add(lbl1);
        frame.add(lbl2);


        JButton btnOK = new JButton("OK");
        JButton btnBack = new JButton("Назад");


        btnOK.setBounds(100, 180, 170, 25);
        btnBack.setBounds(100, 220, 170, 25);


        frame.setLayout(null);


        //frame.add(btnBack);
        frame.add(btnOK);

        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                FrontUIController.frame.setVisible(true);
            }
        });



    }

    public void show() {
        frame.setVisible(true);
    }

    JFrame createFrame() {
        JFrame JFrame = new JFrame();
        JFrame.setSize(500, 400);
        JFrame.setLocationRelativeTo(null);
        JFrame.setResizable(false);
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JFrame.setVisible(true);
        return JFrame;
    }
}
