import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек разделить счет");
        while (true) { //цикл если кол меньшеилиравно1
            int people = scanner.nextInt();
            if (people <= 1) {
                System.out.println("Ошибка");
                break;
            } else {
                System.out.println(people + "человек");
                break;
            }
        }
    }
// класс товар
    System.out.println("Введите название товара");
    System.out.println("Ведите цену товара в формате: рублей.копеек");//как написать 10.45 ?

    public class product {
        String nameProduct = scanner.next(); // вводит пользов??
        double productPrice = scanner.nextDouble(); // вводит пользов??

            if ( double productPrice >0){ // цикл если цена товара отрицательная
            System.out.println("Ошибка");
            break;

        }else{
            System.out.println(nameProduct + double productPrice); // дописать рублей.копеек
        }
        System.out.println("Товар успешно добавлен");

            // завершить
        String finish = "Завершить"; // про завершить не поняла, то ли пользователь должен ввести слово завершить и мы сравниваем его чкркз equal
        while(true){
            // про общий список продутов, надо отдельно писать объект?

            String productListTotal = "nameProduct %s, double productPrice %.2f рублей";
            System.out.println(String.format(productListTotal,next(), nextDouble())); // как правильно про next?
        }
        }
        double productTotalAmount();
    // в общий сумму указать сумму по списку+новый введенный товар?
    double result = double productTotalAmount/int people

        }

