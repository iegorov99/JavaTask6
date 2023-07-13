public class HomeTask6 {
    // Реализуйте класс Cat, включающий в себя от трех полей и от двух методов, определяющих базовый функционал класса(за основу можно взять наработки с семинара). 
    // Создать два экземпляра класса Cat и вывести информацию о них на экран.

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.nikname = "Барсик";
        cat1.breed = "Мейн-Кун";
        cat1.color = "Белый";
        cat1.age = 6;
        cat1.weight = 6.2;
        cat1.gender = "Самец";
        cat1.catOwner = "Антон";
        cat1.vaccination = true;


        Cat cat2 = new Cat();
        cat2.nikname = "Сара";
        cat2.breed = "Шотландскдская вислоухая";
        cat2.color = "Тёмно-серый";
        cat2.age = 2;
        cat2.weight = 5.2;
        cat2.gender = "Самка";
        cat2.catOwner = "Иван";
        cat2.vaccination = false;


        System.out.println(cat1);
        System.out.println();
        System.out.println(cat1);
        System.out.println();

        System.out.println(Cat.competitions(cat1.age, cat1.vaccination));
        System.out.println();
        System.out.println(Cat.competitions(cat2.age, cat2.vaccination));
        System.out.println();

        cat1.doVaccination();
        System.out.println();
        cat2.doVaccination();
    }
}
