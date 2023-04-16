// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int amount = 100; // изначальная сумма на счету клиента
        int refill = 1002; // сумма пополнения счёта

        int bonus = 0;
        if (refill > 1000) {
            bonus = refill / 100;
        }

        int finalAmount = amount + refill + bonus;
        System.out.println("Баланс:" + finalAmount);
        System.out.println("Бонус:" + bonus);
    }
}