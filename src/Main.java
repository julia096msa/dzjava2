public class Main {

    public static void main(String[] args) {
        int amount = 2500;
        int bonus = amount / 20;

        System.out.println("Сумма покупки: " + amount + " руб.");
        System.out.println("Ваш бонус: " + bonus + " миль");

        int result = amount / bonus;
    }
}
