package mypack;

public class BankAccount {

    private double solde = 250000.100;

    public void deposit(double amount) {
        this.solde += amount;
    }

    public void withdraw(double amount) {
        this.solde -= amount;
    }

    public void transfert(BankAccount account, double amount) {
        account.deposit(amount);
        this.withdraw(amount);
    }

    public double getSolde() {
        return this.solde;
    }
    


    public static void main(String[] args) {
        BankAccount Account1 = new BankAccount();
        BankAccount Account2 = new BankAccount();

        System.out.println("Solde initial du compte 1\n" + Account1.getSolde());
        System.out.println("Solde initial du compte 2\n" + Account2.getSolde());
        Account1.deposit(150000);
        System.out.println("Depôt de 150000 sur le compte 1");
        System.out.println("Nouveau Solde du compte 1\n" + Account1.getSolde());
        System.out.println("Virement de 200000 au compte 2");
        Account1.transfert(Account2, 200000);
        System.out.println("Nouveau Solde du compte 1\n" + Account1.getSolde());
        System.out.println("Nouveau Solde du compte 2\n" + Account2.getSolde());
        
    }
    
}
