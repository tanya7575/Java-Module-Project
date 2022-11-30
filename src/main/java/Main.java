import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек разделить счет");
       int people;
        while (true) {
             people = scanner.nextInt();
            if (people > 1) {
                System.out.println(people + "человек");
                break;
            } else if (people == 1) {
                System.out.println("Ошибка.Введите количество заново");
            } else {
                System.out.println("Ошибка.Введите количество>1");
            }
        }
        Calculate calculate = new Calculate(people); // что не так с people?

        while (true) {
            System.out.println("Введите название товара");
            String name = scanner.next();

            System.out.println("Ведите цену товара в формате: рубли.копейки");
            double price = scanner.nextDouble();

            calculate.addProduct (new Product(name,price));// пересмотреть

            System.out.printf("%sТовар успешно добавлен%n", new Product);// пересмотреть формат

            System.out.println("Добавить еще один товар или введите `Завершить`");
            String finish = scanner.next();
            if (finish.equalsIgnoreCase("Завершить")) {
                break;
            }
        }
       double sum = Calculate.getSum();
       double result = sum/people;
       Format format = new Format();
       System.out.println(Calculate.listProduct);
       System.out.println("к оплате:" + format.round(result) + format.padeg(result));
    }
}

















