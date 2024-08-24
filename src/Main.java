public class Main {
    public static void main(String[] args) {
        int days = 10;
        if (days == 0) {
            System.out.println("Желаем приятной поездки!");
        } else {
            for (; days > 0; days--)
                System.out.println("До конца поездки осталось " + days + " дней");
        }
        System.out.println("Путишествие окончено. Пора домой!");
    }
}