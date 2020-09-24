package javalearning;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car nissan = new Car();
        System.out.println("The model is " + porsche.getModel());
        porsche.setModel("california911");
        System.out.println("The model is " + porsche.getModel());

        Account nicksAccount = new Account();
        Account maoMaoAccount = new Account("12341234", 100, "maoMao", "234@234.com", "123123123");

        System.out.println(nicksAccount.getBalance());
        System.out.println(nicksAccount.getCustomerEmailAddress());
        System.out.println(nicksAccount.getCustomerName());
        System.out.println(nicksAccount.getNumber());
        System.out.println(nicksAccount.getCustomerPhoneNumber());

        nicksAccount.withdrawal(100);

        nicksAccount.deposit(50);
        nicksAccount.withdrawal(100);

        nicksAccount.deposit(100);
        nicksAccount.withdrawal(100);
    }
}
