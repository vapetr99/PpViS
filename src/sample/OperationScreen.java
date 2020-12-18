package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationScreen {

    private IBudgetManager budgetManager;

    public OperationScreen(IBudgetManager budgetManager) {
        this.budgetManager = budgetManager;
    }
    private JFrame frame = createFrame();
    public OperationScreen() {

        JLabel lbl1 = new JLabel("Баланс");
        JLabel lbl2 = new JLabel("Общий баланс");

        JTextField tx1 = new JTextField();
        JTextField tx2 = new JTextField();

        lbl1.setBounds(300,50, 100, 25);
        lbl2.setBounds(300,110, 100, 25);
        tx1.setBounds(300, 80, 100, 30);
        tx2.setBounds(300, 140,100, 30);


        frame.add(tx1);
        frame.add(tx2);
        frame.add(lbl1);
        frame.add(lbl2);


        JButton btnRule = new JButton("Права");
        JButton btnHistory = new JButton("История");
        JButton btnOperation = new JButton("Операции");
        JButton btnExit = new JButton("Выход");

        btnRule.setBounds(100, 50, 170, 25);
        btnOperation.setBounds(100, 100, 170, 25);
        btnHistory.setBounds(100, 150, 170, 25);
        btnExit.setBounds(100, 200, 170, 25);

        frame.setLayout(null);


        frame.add(btnOperation);
        frame.add(btnRule);
        frame.add(btnHistory);
        frame.add(btnExit);

        btnOperation.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                BudgetOperationScreen  di = new BudgetOperationScreen();
                di.show();
            }
        });

        btnRule.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                RulesScreen  di = new RulesScreen();
                di.show();
            }
        });


        btnHistory.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                HistoryScreen  di = new HistoryScreen();
                di.show();
            }
        });


        btnExit.addActionListener(new ActionListener() {

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
