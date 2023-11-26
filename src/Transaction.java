class Transaction<T extends Account> {
    private final T from;
    private final T to;
    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute() {
        if (from.getAmount() >= amount) {
            System.out.printf("Транзакция проведена успешно на сумму: %.2f $\n", amount);
            System.out.printf("Счёт списания: #%s; %.2f $ \nСчёт зачисления: %s\n",
                    from.getData(), from.getAmount(), to.getData());
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);
        } else {
            System.out.println("Операция невозможна. Недостаточно средств на счёте.");
        }
    }
}