import java.util.Date;

public class Transaction {
    private long Id;
    private Date transactionDate;
    private Number fromAccount;
    private Number toAccount;
    private double amount;
    private int status;
    private String content;
    private String errorReason;

    public Transaction() {
    }

    public Transaction(long id, Date transactionDate, Number fromAccount, Number toAccount, double amount, int status, String content, String errorReason) {
        Id = id;
        this.transactionDate = transactionDate;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.status = status;
        this.content = content;
        this.errorReason = errorReason;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Number getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Number fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Number getToAccount() {
        return toAccount;
    }

    public void setToAccount(Number toAccount) {
        this.toAccount = toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }
}
