package sample;

public class Injector {
    public void init() {

        FrontUIController frontUIController = new FrontUIController();

        RegistrationScreen registrationScreen = new RegistrationScreen();

        LoginScreen loginScreen = new LoginScreen();

        RulesScreen rulesScreen = new RulesScreen();

        OperationScreen operationScreen = new OperationScreen();

        BudgetOperationScreen budgetOperationScreen = new BudgetOperationScreen();

        HistoryScreen historyScreen = new HistoryScreen();


        frontUIController.show();

    }
}
