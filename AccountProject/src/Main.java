public class Main {
    public static void main(String[] args) {
        DepitAccount dpt1 = new DepitAccount();
        DepitAccount dpt2 = new DepitAccount(25);
        CreditAccount cA1 = new CreditAccount();
        LoanAccount lA = new LoanAccount();

        dpt1.deposit(100);
        dpt1.withdraw(25);
        System.out.println(dpt1.toString());

        dpt2.deposit(100);
        dpt2.withdraw(25);
        System.out.println(dpt2.toString());

        cA1.deposit(150);
        cA1.withdraw(5000);
        System.out.println(cA1.toString());

        System.out.println(lA.toString());
        lA.deposit(120020);




    }
}