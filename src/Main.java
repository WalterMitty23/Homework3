public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        byte theFirstOne = 126;
        System.out.println("TASK1 значение переменной theFirstOne с типом byte = " + theFirstOne);
        short theSecondOne = 32766;
        System.out.println("TASK1 значение переменной theSecondOne с типом short = " + theSecondOne);
        int theThirdOne = 2147000;
        System.out.println("TASK1 значение переменной theThirdOne с типом int = " + theThirdOne);
        long theLastOne = 666L;
        System.out.println("TASK1 значение переменной theLastOne с типом long = " + theLastOne);
        float floating = 2.5f;
        System.out.println("TASK1 значение переменной floating с типом float = " + floating);
        double moreThanFloat = 3.5;
        System.out.println("TASK1 значение переменной moreThanFloat с типом double = " + moreThanFloat);
    }
    public static void task2() {
        byte theFirstOne = 67;
        System.out.println("TASK2 значение переменной theFirstOne с типом byte = " + theFirstOne);
        short theSecondOne = -159;
        System.out.println("TASK2 значение переменной theSecondOne с типом short = " + theSecondOne);
        short anotherShort = 569;
        System.out.println("TASK2 значение переменной anotherShort с типом short = " + anotherShort);
        int theThirdOne = 27897;
        System.out.println("TASK2 значение переменной theThirdOne с типом int = " + theThirdOne);
        long theLastOne = 987678965549L;
        System.out.println("TASK2 значение переменной theLastOne с типом long = " + theLastOne);
        float floating = 27.12f;
        System.out.println("TASK2 значение переменной floating с типом float = " + floating);
        double moreThanFloat = 2.786;
        System.out.println("TASK2 значение переменной moreThanFloat с типом double = " + moreThanFloat);
    }
    public static void task3() {
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalAmountOfPaper = 480;
        int paperPerStudent = totalAmountOfPaper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("TASK3 На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
    }
    public static void task4() {
        byte time = 2;
        byte bottles = 16;
        short twentyMinutes = 20;
        int bottlesPer20Minutes = (twentyMinutes / time) * bottles;
        System.out.println("TASK4 За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        int minutesPerDay = 24 * 60;
        int bottlesPerDay = (minutesPerDay / time) * bottles;
        System.out.println("TASK4 За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        int bottlesPer3Days =  bottlesPerDay * 3;
        System.out.println("TASK4 За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        long bottlesPer1Month = bottlesPerDay * 30;
        System.out.println("TASK4 За 1 месяц машина произвела " + bottlesPer1Month + " штук бутылок");
    }
    public static void task5() {
        byte totalAmOfPaint = 120;
        byte whitePaintCan = 2;
        byte brownpaintCan = 4;
        byte paintPerClass = (byte) (whitePaintCan + brownpaintCan);
        byte classQuantity = (byte) (totalAmOfPaint / paintPerClass);
        int whitePaintNedeed = whitePaintCan * classQuantity;
        int brownPaintNeeded = brownpaintCan * classQuantity;
        System.out.println("TASK5 В школе, где " + classQuantity + " классов, нужно " + whitePaintNedeed + " банок белой краски и " + brownPaintNeeded + " банок коричневой краски");
    }
    public static void task6() {
        byte bananaWeight = 80;
        byte bananaQuantity = 5;
        byte milkPackage = 105;
        byte milkQuantity = 2;
        byte iceCream = 100;
        byte iceCreamQuantity = 2;
        byte eggs = 70;
        byte eggsQuantity = 4;
        short breakfastGm = (short) (bananaWeight * bananaQuantity + milkPackage * milkQuantity + iceCreamQuantity * iceCream + eggsQuantity * eggs);
        float breakfastKg = breakfastGm / 1000f;
        System.out.println("TASK6 " + breakfastGm + " грамм & " + breakfastKg + " килограмм");
    }
    public static void task7() {
        byte totalLossKg = 7;
        short totalLossGm = (short) (totalLossKg * 1000);
        short lossPerDay250 = 250;
        short losPerDay500 = 500;
        short daysIf250 = (short) (totalLossGm / lossPerDay250);
        System.out.println("TASK7 Уйдет " + daysIf250 + " дней на похудение, если спортсмен будет терять каждый день по 250 грамм");
        short daysIf500 = (short) (totalLossGm / losPerDay500);
        System.out.println("TASK7 Уйдет " + daysIf500 + " на похудение, если спортсмен будет терять каждый день по 500 грамм");
        short mean = (short) ((daysIf500 + daysIf250) / 2);
        System.out.println("TASK7 Уйдет " + mean + " день на похудение в среднем");
    }
    public static void task8() {
        byte promotion = 10;
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float percentage = (100 + promotion) / 100f;
        float mashasWageAfterBoost = masha * percentage;
        float denissWageAfterBoost = denis * percentage;
        float kristinasWageAfterBoost = kristina * percentage;
        int mashasRevenuePerYearBefore = masha * 12;
        int denissRevenuePerYearBefore = denis * 12;
        int kristinasRevenuerPerYearBefore = kristina * 12;
        float mashasRevenuePerYearAfter = mashasRevenuePerYearBefore * percentage;
        float denissRevenuePerYearAfter = denissRevenuePerYearBefore * percentage;
        float kristinasRevenuerPerYearAfter = kristinasRevenuerPerYearBefore * percentage;
        float mashasBoostPerYear = mashasRevenuePerYearAfter - mashasRevenuePerYearBefore;
        float denissBoostPerYear = denissRevenuePerYearAfter - denissRevenuePerYearBefore;
        float kristinasBoostPerYear = kristinasRevenuerPerYearAfter - kristinasRevenuerPerYearBefore;
        System.out.println("TASK8 Маша теперь получает " + mashasWageAfterBoost + " рублей. Годовой доход вырос на " + mashasBoostPerYear + " рублей");
        System.out.println("TASK8 Денис теперь получает " + denissWageAfterBoost + " рублей. Годовой доход вырос на " + denissBoostPerYear + " рублей");
        System.out.println("TASK8 Кристина теперь получает " + kristinasWageAfterBoost + " рублей. Годовой доход вырос на " + kristinasBoostPerYear + " рублей");
    }
}