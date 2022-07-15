import java.util.Scanner;

public class Constructor {

    public static class BankAccount {
        private long accountNumber;
        private long balance;
        private String customerName;
        private String email;
        private long phoneNumber;

        public BankAccount(String customerName, long accountNumber, String email, long phoneNumber, long balance) {

            // When using subclasses, setters may not always work
            // Hence this approach is sometimes better

            this.customerName = customerName;
            this.accountNumber = accountNumber;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.balance = balance;

            // this.setCustomerName(customerName);
            // this.setAccountNumber(accountNumber);
            // this.setEmail(email);
            // this.setPhoneNumber(phoneNumber);
            // this.setBalance(balance);
        }

        public void setAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public void setBalance(long balance) {
            this.balance = balance;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public long getAccountNumber() {
            return this.accountNumber;
        }

        public long getBalance() {
            return this.balance;
        }

        public String getCustomerName() {
            return this.customerName;
        }

        public String getEmail() {
            return this.email;
        }

        public long getPhoneNumber() {
            return this.phoneNumber;
        }

        public void deposit(long amount) {
            if (amount < 0) {
                System.out.println("Please Enter Correct Amount!");
                return;
            }
            this.balance = this.balance + amount;
            System.out.println(amount + " Deposited.");
            System.out.println("Current Account Balance Is " + this.balance);

        }

        public void withdraw(long amount) {
            if (amount < 0) {
                System.out.println("Please Enter Correct Amount!");
                return;
            }
            if (this.balance < amount) {
                System.out.println("Insufficient Fund.");
                System.out.println("Current Account Balance Is " + this.balance);
                return;
            } else {
                this.balance = this.balance - amount;
                System.out.println(amount + " Withdrawn.");
                System.out.println("Current Account Balance Is " + this.balance);
            }
        }

    }

    public static class VipCustomer {
        private static final long DEFAULT_CREDIT_LIMIT = 1000;

        private String customerName;
        private long creditLimit;
        private String emailAddress;

        public VipCustomer(String customerName) {
            this(customerName, DEFAULT_CREDIT_LIMIT, "NIL");
        }

        public VipCustomer(String customerName, String emailAddress) {
            this(customerName, DEFAULT_CREDIT_LIMIT, emailAddress);
        }

        public VipCustomer(String customerName, long creditLimit, String emailAddress) {
            this.customerName = customerName;
            this.creditLimit = creditLimit;
            this.emailAddress = emailAddress;
        }

        public String getCustomerName() {
            return this.customerName;
        }

        public long getCreditLimit() {
            return this.creditLimit;
        }

        public String getEmailAddress() {
            return this.emailAddress;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String customerName = "", email = "";
        long accountNumber = 0, phoneNumber = 0;

        System.out.println("Enter Your Name: ");
        customerName = scanner.nextLine();
        System.out.println("Enter Account Number: ");
        boolean hasNextLong = scanner.hasNextLong();
        if (hasNextLong) {
            accountNumber = scanner.nextLong();
            scanner.nextLine();
        }

        System.out.println("Enter Your Email: ");
        email = scanner.nextLine();

        System.out.println("Enter Phone Number: ");
        hasNextLong = scanner.hasNextLong();
        if (hasNextLong) {
            phoneNumber = scanner.nextLong();
            scanner.nextLine();
        }

        BankAccount account = new BankAccount(customerName, accountNumber, email, phoneNumber, 0);

        boolean continueIteration = true;

        System.out.println("Hello Mr " + account.customerName);
        System.out.println("Your Account Number Is " + account.accountNumber);
        System.out.println("Your Email ID Is " + account.email);
        System.out.println("Your Mobile Number Is " + account.phoneNumber);

        while (continueIteration) {
            System.out.println("Enter 1 For Withdrawal.");
            System.out.println("Enter 2 For Deposit.");
            System.out.println("Enter -1 For Exit.");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Amount To Withdraw: ");
                    hasNextLong = scanner.hasNextLong();
                    if (hasNextLong) {
                        long withdraw = scanner.nextLong();
                        scanner.nextLine();
                        account.withdraw(withdraw);
                    }
                    continue;
                case 2:
                    System.out.println("Enter Amount To Deposit: ");
                    hasNextLong = scanner.hasNextLong();
                    if (hasNextLong) {
                        long deposit = scanner.nextLong();
                        scanner.nextLine();
                        account.deposit(deposit);
                    }
                    continue;
                case -1:
                    continueIteration = false;
                    continue;
                default:
                    continueIteration = false;
                    continue;
            }
        }

        System.out.println("Your Last Account Balance Is " + account.balance);
        System.out.println("Have A Nice Day!");
        scanner.close();
    }
}