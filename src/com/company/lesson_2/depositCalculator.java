package com.company.lesson_2;

public class depositCalculator {

    public static void calculator(String cash, String rate, String term) {
        System.out.println("Deposit amount " + cash + ", rate " + rate + ", term " + term);
        double capitalizedAmount = Double.parseDouble(cash);
        int months = Integer.parseInt(term) * 12;
        double rateMonths = Double.parseDouble(rate) / 12;
        double income = 0.0;
        String temp = "";
        int j = 1;
        for (int i = 0; i < months; i++) {
            income += capitalizedAmount * (rateMonths / 100);
            capitalizedAmount += capitalizedAmount * (rateMonths / 100);

            if ((i + 1) % 12 == 0) {
                temp +="accumulated amount for " +j+" year = "+String.format("%.2f", capitalizedAmount)+" UAH,"+" earned "+String.format("%.2f", income)+"\n";
                j++;
            }

        }

        System.out.println(temp);

    }
}