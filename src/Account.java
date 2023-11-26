abstract class Account<T extends PersonalData> {
    private T data;
    private double amount;

    public Account(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    public void setAmount(double amount) { this.amount = amount; }

    public T getData() { return data; }

    public double getAmount() { return amount; }

    @Override
    public String toString() { return String.format("Клиент: %s\nБаланс на счёте: %s$", data, amount); }
}
