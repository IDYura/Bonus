public class Main {
    public static void main(String[] args) {
        int cashAccount = 100;
        int cashReplenishment = 1100;

        int bonus;
        if (cashReplenishment > 1000) {
            bonus = cashReplenishment / 100;
        } else {
            bonus = 0;
        }
        int amount = cashAccount + cashReplenishment + bonus;
        System.out.println("Итоговый счет " + amount);
        System.out.println("Бонус " + bonus);
    }
}