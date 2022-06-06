package com.company.Lesson_6;


import static com.company.Lesson_6.SubscribersList.subscribers;

public class SubscriberServiceImpl implements SubscriberService {

    /**
     * сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
     */
    @Override
    public void timeLocalCalls(int cityTimeMin) {
        System.out.println("сведения об абонентах, у которых время внутригородских разговоров превышает заданное; - " + cityTimeMin);
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCityTimeMin() > cityTimeMin) {
                System.out.println(subscriber.toString());
            }
        }
    }

    /**
     * сведения об абонентах, которые пользовались междугородней связью;
     */
    @Override
    public void usedLongDistanceCalls() {
        System.out.println("сведения об абонентах, которые пользовались междугородней связью;");
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getTimeLongDistanceCallsMin() > 0) {
                System.out.println(subscriber.toString());
            }
        }
    }

    /**
     * сведения об абонентах ФИО, номер телефона, баланс у который первая бука фамилии передается как параметр.
     */
    @Override
    public void searchFirstLetter(String surname) {
        System.out.println("сведения об абонентах ФИО, номер телефона, баланс у который первая бука фамилии передается как параметр; - " + surname);
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getSurname().charAt(0) == surname.charAt(0)) {
                System.out.println("ФИО - " + subscriber.getSurname() + " " + subscriber.getName() + " " + subscriber.getPatronymic() + ", номер телефона " + ", баланс " + String.format("%.2f",subscriber.getBalance()) );
            }
        }
    }

    /**
     * суммарное потребление трафика интернета для определенного города
     */

    @Override
    public void totalInternetTrafficConsumption(String city) {
        System.out.println("суммарное потребление трафика интернета для определенного города; - " + city);
        int totalTraffic = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCity() == city) {
                totalTraffic += subscriber.getInternetTraffic();
            }
        }
        System.out.println("суммарное потребление трафика - " + totalTraffic);
    }

    /**
     * количество абонентов с отрицательны балансом;
     */
    @Override
    public void negativeBalance() {
        System.out.println("количество абонентов с отрицательны балансом;");
        int count = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getBalance() < 0) {
                count++;
            }
        }
        System.out.println("количество абонентов с отрицательны балансом " + count);
    }
}
