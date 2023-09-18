public class Main {
    public static void main(String[] args) {

        int amount = 10;// количество рублей для одной бонусной мили

        int ticket1 = 27658; // стоимость первого билета
        int ticket2 = 34570; // стоимость второго билета
        int ticket3 = 67000; // стоимость третьего билета
        int ticket4 = 99999; // стоимость четвертого билета
        int ticket5 = 128400; // стоимость пятого билета

        System.out.println("Стоимость пяти билетов одной дружной компании:");
        System.out.println((ticket1 / amount) + " количество бонусных миль за первый билет");
        System.out.println((ticket2 / amount) + " количество бонусных миль за второй билет");
        System.out.println((ticket3 / amount) + " количество бонусных миль за третий билет");
        System.out.println((ticket4 / amount) + " количество бонусных миль за четвертый билет");
        System.out.println((ticket5 / amount) + " количество бонусных миль за пятый билет");

    }
}