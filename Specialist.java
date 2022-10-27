public class Specialist extends Employee{
    private int levels;

    public Specialist() {
    }

    public Specialist(String name, int age, int zp, int levels) {
        super(name, age, zp);
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    void info(){
        System.out.println("Specialist");
        super.info();
        System.out.println("Уровень:"+levels);
    }
    void workWithClients(){
        System.out.println("Вас приветстует компания...");
    }

    @Override
    public void goToDayOff() {
        System.out.println("Ремонт дома");
    }

    @Override
    public void goToVacation() {
        System.out.println("I am going to Moskow");
    }
}
