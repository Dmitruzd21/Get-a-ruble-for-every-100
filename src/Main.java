public class Main {
    public static void main(String[] args) {
        int initialamount = 100;
        int replenishmentamount = 100;
        int limit = 1000;
        int bonus;
        if (replenishmentamount < limit) {
            bonus = 0;
        } else {
            bonus = replenishmentamount / 100;
        }
        int finalamount = initialamount + replenishmentamount + bonus;
        System.out.println(finalamount);
        System.out.println(bonus);
    }
}
