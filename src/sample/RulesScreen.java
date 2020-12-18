package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RulesScreen {

    private IBudgetManager budgetManager;

    public RulesScreen(IBudgetManager budgetManager) {
        this.budgetManager = budgetManager;
    }

    private ITransactionManager transactionManagerManager;

    public RulesScreen(ITransactionManager transactionManager) {
        this.budgetManager = budgetManager;
    }

    private JFrame frame = createFrame();


    public RulesScreen() {

        JLabel lbl1 = new JLabel("Права");
        frame.setLayout(null);
        frame.add(lbl1);
        lbl1.setBounds(250,50, 100, 25);

        JButton btnBack = new JButton("Назад");


        btnBack.setBounds(200, 220, 170, 25);


        frame.setLayout(null);

        frame.add(btnBack);

        btnBack.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                OperationScreen  di = new OperationScreen();
                di.show();
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
