public class Format {
    String padeg(double priceProduct) {
        double padeg = Math.floor(priceProduct); //переменная падеж
        if (padeg == 1) {
            String rubl = "рубль";
            return rubl;
        } else if (padeg == 2 || padeg == 3 || padeg == 4) {
            String rubl = "рубля";
            return rubl;
        } else {
            String rubl = "рублей";
            return rubl;
        }
    }
    String round(double result) { // метод округление
        return String.format("%.2f", result);
    }
}

