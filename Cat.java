public class Cat{
    String nikname;
    String breed;
    String color;
    int age;
    double weight;
    String gender;
    String catOwner;
    Boolean vaccination;

    @Override
    public String toString() {
        return String.format("Кличка :%s Порода: %s Окрас: %s \nВозраст: %d Вес: %f Пол: %s \nИмя владельца: %s", nikname, breed, color, age, weight, gender, catOwner);
    }

    
    static Boolean competitions(int age, boolean vaccination) {
        return vaccination && age < 5;
    }

    public void doVaccination()  {
        if (vaccination) System.out.println("Прививка не требуется.");
        else System.out.println("Нужно сделать прививку!");
    }
    
}