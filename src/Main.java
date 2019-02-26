
class Account {
    void print_account() {
        System.out.println("Account");
    }

}

class Savings extends Account {
    void print_savings() {
        System.out.println("Savings");
    }

}

class Rates extends Account {
    void print_rates() {
        System.out.println("Rates");
    }
}

class Balance extends Account {
    void print_balance() {
        System.out.println("Balance");
    }
}


class Main {
    public static void main(String[] args) {
        Savings savings = new Savings();
        savings.print_account();
        savings.print_savings();
        Rates rates = new Rates();
        rates.print_account();
        rates.print_rates();
        Balance balance = new Balance();
        balance.print_account();
        balance.print_balance();
    }
}