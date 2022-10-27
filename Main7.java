import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Specialist specialist = new Specialist("Роман",25,56000,3);
        Specialist specialist1 = new Specialist("Иван",20,30000,5);
        Specialist specialist2 = new Specialist("Дорн",23,32000,6);

//        specialist.info();
//        specialist1.info();
//        specialist2.info();
//        specialist.workWithClients();
//        specialist1.workWithClients();
//        specialist2.workWithClients();

//        specialist.goToDayOff();
//        specialist1.goToDayOff();
//        specialist2.goToDayOff();


        Developer developer = new Developer("Роман",32,45000,"Middle");
        Developer developer1 = new Developer("Иван",20,30000,"Junior");
        Developer developer2 = new Developer("Гора",26,20000,"Junior");
        Developer developer3 = new Developer("Гора",26,20000,"Junior");

//        developer.info();
//        developer1.info();
//        developer2.info();
//        developer3.info();
//        developer.writeCode();
//        developer1.writeCode();
//        developer2.writeCode();

//        developer.goToDayOff();
//        developer1.goToDayOff();
//        developer2.goToDayOff();
//        developer3.goToDayOff();

        Manager manager = new Manager("Чоп",31,15000,true);
        Manager manager1 = new Manager("Кип",11,40000,false);

//        manager.info();
//        manager1.info();
//        manager.writeProcedures();
//        manager1.writeProcedures();
//        manager.goToDayOff();
//        manager1.goToDayOff();

        CEO ceo = new CEO("Ип",31,15000,true,true);
//        ceo.info();
//        ceo.goPublic();
//        ceo.goToDayOff();
//        ceo.goToVacation();



        Employee[] emp = {specialist,specialist1,specialist2,developer,developer1,developer2,developer3,manager,
                manager1,ceo};

        for (Employee s:emp) {
            s.info();
            s.goToVacation();

        }

//        Employee[] emp = {specialist,manager,ceo}; // в цикле обьявить знакомство
//        for (int i = 0; i < emp.length ; i++) {
//            System.out.println("Кем вы являетесь?");
//            String iam = scn.next();
//            if(iam.equals("specialist")){
//            specialist.info();
//            }else if(iam.equals("manager")){
//            manager.info();
//            }else if(iam.equals("ceo")){
//            ceo.info();
//            }else{
//            System.out.println("Такого сотрудника нет!");
//            break;
//            }
//
//        }
    }
}






//      System.out.println("Кем вы являетесь?");
//              String iam = scn.next();
//              System.out.print("Представьтесь пожалуйста! " );
//              String name = scn.next();
//              specialist.setName(name);
//              specialist.getName();
//              System.out.println(specialist.getName());
//              System.out.print("Ваш возраст? " );
//              int age = scn.nextInt();
//              specialist.setAge(age);
//              specialist.getAge();
//              System.out.println(specialist.getAge());
//              System.out.print("Ваше зп " );
//              int zp = scn.nextInt();
//              specialist.setZp(zp);
//              specialist.getZp();
//              System.out.println(specialist.getZp());
//              if(iam.equals("specialist")){
//              System.out.print("Ваш уровень " );
//              int levels = scn.nextInt();
//              specialist.setLevels(levels);
//              specialist.getLevels();
//              System.out.println(specialist.getLevels());
//              }else if(iam.equals("manager")){
//              System.out.print("У вас есть акции? " );
//              boolean hasStocks = scn.nextBoolean();
//              manager.setHasStocks(hasStocks);
//              manager.getHasStocks();
//              System.out.println(manager.getHasStocks());
//              } else if (iam.equals("CEO")) {
//              System.out.print("У вас есть машина " );
//              boolean car = scn.nextBoolean();
//              ceo.setHasStocks(car);
//              ceo.getHasCompanyCar();
//              System.out.println(ceo.getHasCompanyCar());
//              }else{
//              System.out.println("Такого сотрудника нет");
//              break;
//              }