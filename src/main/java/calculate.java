public class calculate {
        int people;
        double sum = 0;




    void addProduct(String nameProduct,double priceProduct){ //Передали атрибуты из product
            sum = sum + priceProduct;

            String listProduct = "Добавленные товары:"+ "\n" + nameProduct;
            System.out.println(listProduct + "в заказе");
            System.out.println("Общая сумма всех добавленных товаров:" + sum);
        }
    }