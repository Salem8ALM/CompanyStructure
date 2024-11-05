package company;

public class Main {
    public static void main(String[] args) {
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");
        Director salem = new Director("salem","tech",999999.1, 5);
        Engineer osama = new Engineer("Osama","cyber",500,new String[]{
                "ROM piracy", "installing illegal software"
        });
        SalesPerson fajri = new SalesPerson("Fajri", "sales",2.750, 1);



        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(salem);
        System.out.println(osama);
        System.out.println(fajri);

    }
}