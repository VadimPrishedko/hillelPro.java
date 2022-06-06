package com.company.Lesson_6;

public class Run {
    public static void main(String[] args) {
        new SubscribersList().getSubscribersList();
        new SubscriberServiceImpl().timeLocalCalls(400);
        new SubscriberServiceImpl().usedLongDistanceCalls();
        new SubscriberServiceImpl().searchFirstLetter("D");
        new SubscriberServiceImpl().totalInternetTrafficConsumption("Dnepr");
        new SubscriberServiceImpl().negativeBalance();
    }
}
