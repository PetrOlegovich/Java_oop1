import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Person person = new Person("Petr", 25);
        Person person1 = new Person("Vasya", 3);
        Person person2 = new Person("Masha",22);
        Person person3 = new Person("Misha", 40);
        Person person4 = new Person("Lena", 41);
        Person person5 = new Person("Oleg", 42);
        Person person6 = new Person("Nastya",39);
        Person person7 = new Person("Slava",62);
        Person person8 = new Person("Olga",63);
        Person person9 = new Person("Kostya",65);
        Person person10 = new Person("Nina",66);
        Person person11 = new Person("Zevs", 70);
        Person person12 = new Person("Karina", 61);
        Person person13 = new Person("Gena", 68);
        Person person14 = new Person("Anna", 80);

        Kids kid = new Kids(person1, Status.children);
        Parents parents = new Parents(person, Status.parents);
        Parents parents1 = new Parents(person2, Status.parents);
        Grand grand = new Grand(person3, Status.grand);
        Grand grand1 = new Grand(person4,Status.grand);
        Grand grand2 = new Grand(person5,Status.grand);
        Grand grand3 = new Grand(person6,Status.grand);
        GreatGrand greatGrand = new GreatGrand(person7,Status.greatGrand);
        GreatGrand greatGrand1 = new GreatGrand(person8,Status.greatGrand);
        GreatGrand greatGrand2 = new GreatGrand(person9,Status.greatGrand);
        GreatGrand greatGrand3 = new GreatGrand(person10,Status.greatGrand);
        GreatGrand greatGrand4 = new GreatGrand(person11,Status.greatGrand);
        GreatGrand greatGrand5 = new GreatGrand(person12,Status.greatGrand);
        GreatGrand greatGrand6 = new GreatGrand(person13,Status.greatGrand);
        GreatGrand greatGrand7 = new GreatGrand(person14,Status.greatGrand);


        Scanner scan = new Scanner(System.in);
        while(true) {
            String ggg = "Нет информации";
            System.out.println("\n------------------------------------------------\n" +
                    "Для просмотра доступных команд наберите:    kom\n" +
                    "для выхода наберите :                       exit\n" +
                    "------------------------------------------------");
            String text = scan.nextLine();
            try {
                if (text.equals("exit")) {
                    break;
                }
                if(text.equals("kom")){
                    System.out.println("\n------------------------------------------------\n" +
                            "информация про внука:        info-v\n" +
                            "про родителей:               info-p\n" +
                            "про бабушек и дедушек:       info-g\n" +
                            "про ПраБабушек и ПраДедушек: info-gg\n" +
                            "информация про семейку :     info\n");
                }
                if (text.equals("info-v")) {
                    System.out.printf("%s  \nРодители: %s и %s \n",kid, parents, parents1);
                }
                if (text.equals("info-p")) {
                    System.out.printf("%s \nРодители: %s %s\n%s \nРодители: %s %s\nДети: %s\n",
                            parents, grand2,grand3,parents1,grand,grand1,kid);
                }
                if (text.equals("info-g")) {
                    System.out.printf("%s \nРодители: %s %s\n%s \nРодители: %s %s\nДети: %s\n%s \nРодители: %s %s\n" +
                            "%s \nРодители: %s %s\nДети: %s\nОбщие Внуки: %s\n",grand2,greatGrand,greatGrand1,
                            grand3,greatGrand2,greatGrand3,parents,grand,greatGrand4,greatGrand5,grand1,greatGrand6,
                            greatGrand7,parents1,kid);
                }
                if (text.equals("info-gg")) {
                    System.out.printf("%s, Родители: %s\n%s, Родители: %s\nДети: %s\n%s, Родители: %s\n" +
                            "%s, Родители: %s\nДети:  %s\nОбщие внуки: %s\n%s, Родители: %s\n%s, Родители: %s\nДети: %s\n" +
                            "%s, Родители: %s\n%s, Родители: %s\nДети:  %s\nОбщие внуки: %s\n" +
                            "ВСЕОБЩИЕ правнуки: %s",greatGrand,ggg,greatGrand1,ggg,grand2,greatGrand2,ggg,greatGrand3,ggg,
                            grand3,parents,greatGrand4,ggg,greatGrand5,ggg,grand,greatGrand6,ggg,greatGrand7,ggg,
                            grand1,parents1,kid);
                }
                if (text.equals("info")) {
                    System.out.println("Самый мелкий : Vitya\n" +
                            "Его родители : Petr and Masha\n" +
                            "Его Бабушки и Дедушки : Oleg, Nastya, Misha and Lena \n" +
                            "и Прабабушки и Прадедушки : Slava, Olga, Kostya, Nina, Zevs, Karina, Gena and Anna \n" +
                            "остальные родственники работали в КГБ. Информация Засекречена!");
                }
            } catch (Exception e) {
                System.out.println("ошибка . проверь что ввел ");
            }

        }

    }
}
