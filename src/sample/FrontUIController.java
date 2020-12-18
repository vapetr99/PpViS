package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrontUIController {

    private LoginScreen loginScreen;
    private RegistrationScreen registrationScreen;
    private RulesScreen rulesScreen;
    private OperationScreen operationScreen;
    private BudgetOperationScreen budgetOperationScreen;
    private HistoryScreen historyScreen;

   // public FrontUIController(LoginScreen loginScreen) {
   //     this.loginScreen = loginScreen;
   // }

    public FrontUIController(HistoryScreen historyScreen) {
        this.historyScreen = historyScreen;
    }

    public FrontUIController(BudgetOperationScreen budgetOperationScreen) {
        this.budgetOperationScreen = budgetOperationScreen;
    }

    public FrontUIController(OperationScreen operationScreen) {
        this.operationScreen = operationScreen;
    }

    public FrontUIController(RulesScreen rulesScreen) {
        this.rulesScreen = rulesScreen;
    }

    public FrontUIController(RegistrationScreen registrationScreen) {
        this.registrationScreen = registrationScreen;
    }



    static JFrame frame = createFrame();
    private boolean save;

    public FrontUIController() {
        save = false;


        JLabel label= new JLabel("Менеджер семейного бюджета");

        JButton btnAutorization = new JButton("Авторизация");
        JButton btnRegistration = new JButton("Регистрация");


        btnAutorization.setBounds(70, 100, 160, 25);
        btnRegistration.setBounds(270, 100, 160, 25);
        label.setBounds(150, 50, 200, 25);


        frame.setLayout(null);

        frame.add(label);
        frame.add(btnAutorization);
        frame.add(btnRegistration);



        btnRegistration.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               RegistrationScreen  di = new RegistrationScreen();
               di.show();
            }
        });

        btnAutorization.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 LoginScreen di = new LoginScreen();
                di.show();
            }
        });


    }
    public void show() {
        frame.setVisible(true);
    }

    static JFrame createFrame() {
        JFrame JFrame = new JFrame();
        JFrame.setSize(500, 400);
        JFrame.setLocationRelativeTo(null);
        JFrame.setResizable(false);
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JFrame.setVisible(true);
        return JFrame;
    }




}
