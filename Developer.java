

public class Developer extends Employee{
    private String grades;

    public Developer(){}

    public Developer(String name, int age, int zp, String grades) {
        super(name, age, zp);
        this.grades = grades;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }
    @Override
    void info(){
        System.out.println("Developer");
        super.info();
        System.out.println("Ранг программиста:"+grades);
    }
    void writeCode(){
        System.out.println("Пишу код на дому");
    }

    @Override
    public void goToDayOff() {
        System.out.println("Дикрет");
    }

    @Override
    public void goToVacation() {
        System.out.println("I am going to bootcamp");
    }
}
