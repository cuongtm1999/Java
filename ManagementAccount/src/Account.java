public class Account {
    private long Id;
    private String accountNumber;
    private String accountName;
    private double balance;
    private int status;

    public Account() {
    }

    public Account(long id, String accountNumber, String accountName, double balance, int status) {
        Id = id;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.status = status;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
