public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int replenishmentAmount = 100;
        int limit = 1000;
        int bonus;
        if (replenishmentAmount < limit) {
            bonus = 0;
        } else {
            bonus = replenishmentAmount / 100;
        }
        int finalAmount = initialAmount + replenishmentAmount + bonus;
        System.out.println(finalAmount);
        System.out.println(bonus);
    }
}
