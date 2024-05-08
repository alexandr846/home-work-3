public class Main {
    public static void main(String[] args) {
        System.out.println("Hello teacher!!!");
        System.out.println("Задача-1");
        int pots = 2;
        System.out.println("Горшки " + pots + " шт");
        byte expandedClay = 20;
        System.out.println("Керамзит " + expandedClay + " кг");
        short guotextile = 10;
        System.out.println("Геотекстиль " + guotextile + " м");
        long fertileSoil = 23;
        System.out.println("Плодородный грунт " + fertileSoil + " кг");
        float fertilizer = 8;
        System.out.println("Удобрение " + fertilizer + " гр");
        double pallet = 2;
        System.out.println("Поддон " + pallet + " шт");

        System.out.println("Задача-2");
       int a = 569;
       byte b = 67;
       short c = -159;
       long d = 987678965549L;
       double e = 2.786;
        double f = 27.12;
       short g = 27897;

        System.out.println("Задача-3");
        byte LyudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        short paper = 480;
        int allClasses = LyudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna;
        int expensed = paper/allClasses;
        System.out.println    ("На каждого ученика расчитано " + expensed + " листов бумаги");

        System.out.println("Задача-4");
        byte speedMachine = 16;
        byte time1 = 20;
        short time2 = 1440;
        short time3 = 4320;
        int time4 = 44640;
        int speedTime = speedMachine/2;
        int one = time1 * speedTime;
        System.out.println("За " + time1 + " машина произвела " + one + " штук бутылок");
        int two = time2 * speedTime;
        System.out.println("За " + time2 + " машина произвела " + two + " штук бутылок");
        int three = time3 * speedTime;
        System.out.println("За " + time3 + " машина произвела " + three + " штук бутылок");
        int four = time4 * speedTime;
        System.out.println("За " + time4 + " машина произвела " + four + " штук бутылок");

        System.out.println("Задача-5");
        byte canPaint = 120;
        byte clas = (byte) (canPaint/6);
        byte whitePaint = 20 * 2;
        byte brownPaint = 20 * 4;
        System.out.println("В школе где 20 классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        System.out.println("Задача-6");
        int bananas = 80 * 5;
        int milk = 105 * 2;
        int iceCreamsundae = 100 * 2;
        int egg = 70 * 4;
        int totalWeight = bananas + milk + iceCreamsundae + egg;
        float allGrams = totalWeight / 1000;
        System.out.println("Масса одного завтрака - " + totalWeight + " граммов, или " + allGrams + " килограммов ");

        System.out.println("Задача-7");
        int needtoresetKg = 7;
        int minweightlossGramm = 250;
        int maxweightlossGramm = 500;
        int targetGramm = needtoresetKg * 1000;
        int ifMin = targetGramm / minweightlossGramm;
        int ifMax = targetGramm / maxweightlossGramm;
        int averageDays = (ifMin + ifMax) / 2;
        System.out.println(" Если спортсмен будет терять каждый день по 250 грамм - " + ifMin + " дней ");
        System.out.println(" Если спортсмен будет терять каждый день по 500 грамм - " + ifMax + " дней ");
        System.out.println(" Если в среднем - " + averageDays + " день ");


        System.out.println("Задача - 8");
        int workingM = 67760;
        int workingD = 83690;
        int workingK = 76230;
        int workgrownM = workingM / 100 * 10;
        int workgrownD = workingD / 100 * 10;
        int workgrownK = workingK / 100 * 10;
        int elevatedM = workingM + workgrownM;
        int elevatedD = workingD + workgrownD;
        int elevatedK = workingK + workgrownK;
        int workingnextyearM = workgrownM * 12;
        int workingnextyearD = workgrownD * 12;
        int workingnextyearK = workgrownK * 12;
        System.out.println("Маша теперь получает " + elevatedM + " рублей. Годовой доход вырос на " + workingnextyearM + " рублей");
        System.out.println("Денис теперь получает " + elevatedD + " рублей . Годовой доход вырос на " + workingnextyearD + " рублей");
        System.out.println("Крестина теперь получает " + elevatedK + " рублей . Годовой доход вырос на " + workingnextyearK + " рублей");
























    }
}