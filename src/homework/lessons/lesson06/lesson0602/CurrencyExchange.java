package homework.lessons.lesson06.lesson0602;

/*Код  За единиц  Валюты                   Рублей РФ
-----------------------------------------------------
AUD  1          Австралийский доллар     44,9883
GBP  1          Фунт стерлингов          86,8429
BYR  10000      Белорусский рубль        39,7716 */

public class CurrencyExchange {
    public static void main(String[] args) {

        double USD = 2.65;
        double EUR = 3.5;
        double RUB = 3.25;

        System.out.printf("%-6s%-12s%-25s%-8s%-4s%n", "Код", "За единиц", "Валюты", "Рублей", "BYN");
        System.out.printf("%.55s%n", "----------------------------------------------------------------------");
        System.out.printf("%-6s%-12d%-25s%-8.2f%n", "USD", 1, "Американский доллар", USD);
        System.out.printf("%-6s%-12d%-25s%-8.2f%n", "EUR", 1, "Евро", EUR);
        System.out.printf("%-6s%-12d%-25s%-8.2f%n", "RUB", 100, "Российский рубль", RUB);
    }
}
