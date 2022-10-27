public class Manager extends Employee{
    private boolean hasStocks;

    public Manager(){}

    public Manager(String name, int age, int zp, boolean hasStocks) {
        super(name, age, zp);
        this.hasStocks = hasStocks;
    }

//    public boolean isHasStocks() {
//
//        return hasStocks;
//    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public boolean getHasStocks() {
        return hasStocks;
    }

    void info(){
        System.out.println("Manager");
        super.info();
        System.out.println("Акции:"+hasStocks);
    }
    void writeProcedures(){
        System.out.println("пишу процедуры на дому");
    }

    @Override
    public void goToDayOff() {
        System.out.println("Больничный");
    }

    @Override
    public void goToVacation() {
        System.out.println("I am going to Monaco");
    }
}
