public class Calculate {
    int people; // переменная

    public static String listProduct;
    static double sum = 0; // переменная общая сумма всех товаров

    void addProduct(double price, String name) { //метод добпалени в лист
        sum = sum + price;

        String listProduct = "Добавленные товары:" + "\n" + name;
        System.out.println(listProduct);
        System.out.println("Общая сумма всех добавленных товаров:" + sum);
    }
        public static double getSum() { // метод get для
            return sum;
        }


}
