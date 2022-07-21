import java.util.ArrayList;

public class CodingExercise45 {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
        bank.listCustomers("Adelaide", true);
    }
}

class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public String getBankName() {
        return bankName;
    }

    public boolean addBranch(String branchName) {
        if (this.findBranch(branchName) != null) {
            return false;
        }
        this.branches.add(new Branch(branchName));
        if (this.findBranch(branchName) != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch currentBranch = this.findBranch(branchName);
        if (currentBranch == null) {
            return false;
        }
        return currentBranch.newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch currentBranch = this.findBranch(branchName);
        if (currentBranch == null) {
            return false;
        }
        return currentBranch.addCustomerTransaction(customerName, transaction);
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equals(branchName)) {
                return this.branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean isPrintTransaction) {
        Branch currentBranch = this.findBranch(branchName);
        if (currentBranch == null) {
            return false;
        }

        ArrayList<Customer> branchCustomerList = new ArrayList<Customer>(currentBranch.getCustomers());
        System.out.println("Customer details for branch " + branchName);
        for (int i = 0; i < branchCustomerList.size(); i++) {
            System.out.println("Customer: " + branchCustomerList.get(i).getName() + "[" + (i + 1) + "]");
            if (isPrintTransaction) {
                System.out.println("Transactions");
                for (int j = 0; j < branchCustomerList.get(i).getTransactions().size(); j++) {
                    System.out
                            .println("[" + (j + 1) + "] Amount " + branchCustomerList.get(i).getTransactions().get(j));
                }
            }
        }

        return true;
    }
}

class Branch {
    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getName() {
        return this.branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (this.findCustomer(customerName) != null) {
            return false;
        }
        customers.add(new Customer(customerName, initialTransaction));
        if (this.findCustomer(customerName) != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer currentCustomer = findCustomer(customerName);
        if (currentCustomer != null) {
            currentCustomer.getTransactions().add(transaction);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getName().equals(customerName)) {
                return this.customers.get(i);
            }
        }
        return null;
    }
}

class Customer {
    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String customerName, double initialTransaction) {
        this.customerName = customerName;
        this.transactions.add(initialTransaction);
    }

    public String getName() {
        return this.customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }
}
