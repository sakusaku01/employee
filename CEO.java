public class CEO extends Manager{
    private boolean hasCompanyCar;

    public CEO(){}

    public CEO(String name, int age, int zp, boolean hasStocks, boolean hasCompanyCar) {
        super(name, age, zp, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean getHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    @Override
    public String toString() {
        return "Машина CEO=" + hasCompanyCar;
    }
    void info(){
        System.out.println("CEO");
        super.info();
        System.out.println("Машина:"+hasCompanyCar);
    }
    void goPublic(){
        System.out.println("Работаю на IPO на дому");
    }

    @Override
    public void goToDayOff() {
        System.out.println("Свадьба");
    }

    @Override
    public void goToVacation() {
        System.out.println("I am going to HavaiI");
    }
}
