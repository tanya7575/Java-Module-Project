import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек разделить счет");
        while (true) {
            int people = scanner.nextInt();
            if (people > 1) {
                System.out.println(people + "человек");
                break;
            } else if (people == 1) {
                System.out.println("Ошибка.Введите количество заново");
            } else {
                System.out.println("Ошибка.Введите количество>1");
            }
        }

        String addProduct;
        double priceProduct;
        while (true) {
            System.out.println("Введите название товара");
            String nameProduct = scanner.next();

            System.out.println("Ведите цену товара в формате: рубли.копейки");
            priceProduct = scanner.nextDouble();

            // будем выводить "вода 10.30 рублей"?
            // будем проверять на ошибки эту строку?



            calculate calculate = new calculate();// ???
            calculate.addProduct (new product(priceProduct,nameProduct));

            System.out.println(new product + "Товар успешно добавлен"  );// взять из класса addProduct или new?

            System.out.println("Добавить еще один товар или введите `Завершить`");
            addProduct = scanner.next();
            String finish = new String("Завершить");
            if (addProduct.equalsIgnoreCase(finish) == true) {
                break;
            }
        }
        String addProductList = "%s %.2f";
        System.out.println(String.format(addProductList, addProduct, priceProduct));
        // будем выводить общий список всех добавленных товаров
        // будем использовать \n выводе общего списка?
    }
}

        // sum addProduct = ???
        // падежи














