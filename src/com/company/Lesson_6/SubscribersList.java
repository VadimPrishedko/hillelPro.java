package com.company.Lesson_6;

import java.util.Random;

public class SubscribersList {

    public static Subscriber[] subscribers = new Subscriber[10];

    public static void getSubscribersList() {

        final String[] SURNAME = {"Kalmanovich", "Dalvarysky", "Kamenechny", "Hamenetsky",
                "Kaminar", "Daminsky", "Hanter", "Kantor", "Kantorovich", "Peysakhovich"};

        final String[] NAMES = {"Pirate", "Bolivar", "Cristo", "Mike",
                "Jack", "Tonny", "Lucie", "Greene", "Luke", "Nick"};


        final String[] CITY = {"Dnepr", "Kiev", "Odessa", "Kharkiv",
                "Dnepr", "Kiev", "Odessa", "Kharkiv", "Dnepr", "Kiev"};

        Random random = new Random();

        for (int i = 0; i < subscribers.length; i++) {
            String telephone = String.valueOf(random.nextInt(111111111, 999999999));
            String contractNumber = String.valueOf(random.nextInt(2000, 2006));

            double balance = random.nextDouble(-50, 200);
            int cityTimeMin = random.nextInt(0, 500);
            int timeLongDistanceCallsMin = random.nextInt(0, 10);
            int internetTraffic = random.nextInt(0, 1000);
            subscribers[i] = new Subscriber(i, SURNAME[i], NAMES[i], SURNAME[i], CITY[i], telephone, contractNumber, balance, cityTimeMin, timeLongDistanceCallsMin, internetTraffic);

            System.out.println(subscribers[i]);
        }


    }



}
