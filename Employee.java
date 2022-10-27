public abstract class Employee implements EmployeeService {
    private String name;
    private int age;
    private int zp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getZp() {
        return zp;
    }

    public void setZp(int zp) {
        this.zp = zp;
    }

    public Employee() {
    }

    public Employee(String name, int age, int zp) {
        this.name = name;
        this.age = age;
        this.zp = zp;
    }

    void info(){
        System.out.println("Имя:" + name+"\n"+"Возраст:" +age+"\n"+"ЗП:"+zp);
    }
    public abstract void goToDayOff();


//    @Override
//    public String toString() {
//        return "Имя=" + name + '\n' +
//                "Возраст=" + age +
//                "ЗП=" + zp;
//    }
}
