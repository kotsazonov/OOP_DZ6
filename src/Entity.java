class Entity implements PersonalData {
    private String name;
    private String inn;

    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    public String getName() { return name; }

    @Override
    public String getINN() { return inn; }

    @Override
    public String toString() { return String.format("%s; %s.", name, inn); }
}
