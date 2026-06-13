package AbstractClasses;

abstract class Account {
    String name;
    double balance;

    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // concerete methods
    final void deposit(double amt) {
        balance += amt;
    }

    abstract void withdraw(double amt);

    @Override
    public String toString() {

        return "Name is : " + name + " balance is : " + balance;
    }

}

