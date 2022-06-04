package com.company.Lesson_4;

public class TripCalculation {
    int price;


    public TripCalculation(int price) {
        this.price = price;
        calc(price);
    }

    public static void calc(int price) {
        int volumeTank = 50;
        int balanceTank = 20;
        int fuelСonsumption = 10;

        int priceCalc = 0;
        final int KRIVOYEOZERODISTANCE = 179;
        final int KZHASHKOVDISTANCE = 153;
        final int DISTANCE = 476;


        Сar car = new Сar(volumeTank, balanceTank, fuelСonsumption);
        System.out.println("fuel consumption " + car.travelExpenses(DISTANCE) + "L, the cost of travel " + (car.travelExpenses(DISTANCE) * price) + " UAH");

        Сar carKrivoyeOzeroD = new Сar(volumeTank, car.remainingFuelOnArrival(KRIVOYEOZERODISTANCE), fuelСonsumption);
        priceCalc += car.travelExpenses(DISTANCE) * price;
        System.out.println("refueling at Krivoye Ozero " + carKrivoyeOzeroD.toFullTank() + "L");
        carKrivoyeOzeroD.setBalanceTank(volumeTank);

        Сar carKzhashkov = new Сar(volumeTank, carKrivoyeOzeroD.remainingFuelOnArrival(KZHASHKOVDISTANCE), fuelСonsumption);
        priceCalc += carKzhashkov.travelExpenses(DISTANCE) * price;
        System.out.println("refueling at Kzhashkov " + carKzhashkov.toFullTank() + "L");
        carKzhashkov.setBalanceTank(volumeTank);

        Сar carFinish = new Сar(volumeTank, carKzhashkov.remainingFuelOnArrival(KZHASHKOVDISTANCE), fuelСonsumption);

        System.out.println("spent on refueling " + priceCalc + "UAH");
        System.out.println("remaining fuel at destination " + carFinish.getBalanceTank() + "L");


    }
}
