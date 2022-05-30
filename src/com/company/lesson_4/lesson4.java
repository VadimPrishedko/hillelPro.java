package com.company.lesson_4;

public class lesson4 {
    int price;


    public lesson4(int price) {
        this.price = price;
        calc(price);
    }

    public static void calc(int price) {
        int volumeTank = 50;
        int balanceTank = 20;
        int fuelСonsumption = 10;

//
//        this.price = price;

        int priceCalc = 0;
        int krivoyeOzeroDistance = 179;
        int kzhashkovDistance = 153;
        int distance = 476;


        car car = new car(volumeTank, balanceTank, fuelСonsumption);
        System.out.println("fuel consumption " + car.travelExpenses(distance) + "L, the cost of travel " + (car.travelExpenses(distance) * price) + " UAH");

        car carKrivoyeOzeroD = new car(volumeTank, car.remainingFuelOnArrival(krivoyeOzeroDistance), fuelСonsumption);
        priceCalc += car.travelExpenses(distance) * price;
        System.out.println("refueling at Krivoye Ozero " + carKrivoyeOzeroD.toFullTank() + "L");
        carKrivoyeOzeroD.setBalanceTank(volumeTank);

        car carKzhashkov = new car(volumeTank, carKrivoyeOzeroD.remainingFuelOnArrival(kzhashkovDistance), fuelСonsumption);
        priceCalc += carKzhashkov.travelExpenses(distance) * price;
        System.out.println("refueling at Kzhashkov " + carKzhashkov.toFullTank() + "L");
        carKzhashkov.setBalanceTank(volumeTank);

        car carFinish = new car(volumeTank, carKzhashkov.remainingFuelOnArrival(kzhashkovDistance), fuelСonsumption);

        System.out.println("spent on refueling " + priceCalc + "UAH");
        System.out.println("remaining fuel at destination " + carFinish.getBalanceTank() + "L");


    }
}
