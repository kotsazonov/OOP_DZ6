class Person implements PersonalData {
    private String fio;
    private String inn;

    public Person(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }

    public String getFio() { return fio; }

    @Override
    public String getINN() { return inn; }

    @Override
    public String toString() { return String.format("%s; %s.", fio, inn); }
}