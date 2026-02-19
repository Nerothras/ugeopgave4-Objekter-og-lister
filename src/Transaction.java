import java.util.ArrayList;

public class Transaction {

    public class Transaction {
        String owner;
        double balance;
        ArrayList<Transaction> transactions;

        public Transaction(String type, double amount) {
            this.owner = owner;
            this.balance = startBalance;
            this.transactions = new ArrayList<>();

        }

        public String toString() {
            return type + ": " + amount + " kr";
        }
    }

}
