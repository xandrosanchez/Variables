public class Main {
    public static void main(String[] args) {
        //Первое задание

        var box1 = 1;
        int box2 = 1;
        byte box3 = 1;
        short box4 = 1;
        long box5 = 1L;
        float box6 = 1f;
        double box7 = 1;
        boolean box8 = true;

        //Второе задание

        float weight_boxer1 = 78.2f;
        float weight_boxer2 = 82.7f;

        System.out.println(weight_boxer1 + weight_boxer2);
        System.out.println(Math.abs(weight_boxer1 - weight_boxer2));

        //Третье задание

        double banan = 80;
        double milk = 105;
        double ice_cream = 100;
        double egg = 70;
        double weight = 0;

        weight = banan * 5 + milk * 2 + ice_cream * 2 + egg * 4;
        System.out.println(weight);
        System.out.println(weight/1000);

        //Четвертое задание

        int extra_weight = 7000;
        int slowly = 250;
        int fast = 500;
        int medium = (extra_weight/slowly + extra_weight/fast)/2;

        System.out.println(extra_weight/slowly);
        System.out.println(extra_weight/fast);
        System.out.println(medium);

        //Пятое задание

        double Masha = 67760;
        double Denis = 83690;
        double Kristina = 76230;
        double operation = 0;

        operation = (Masha * 1.1 * 12 - Masha * 12);
        System.out.println("Маша теперь получает" + Masha * 1.1 + "рублей. Годовой доход вырос на " + operation);
        operation = (Denis * 1.1 * 12 - Denis * 12);
        System.out.println("Денис теперь получает" + Denis * 1.1 + "рублей. Годовой доход вырос на " + operation);
        operation = (Kristina * 1.1 * 12 - Kristina * 12);
        System.out.println("Кристина теперь получает" + Kristina * 1.1 + "рублей. Годовой доход вырос на " + operation);
    }
}