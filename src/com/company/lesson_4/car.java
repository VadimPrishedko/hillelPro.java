package com.company.lesson_4;

public class car {
    int volumeTank;
    int balanceTank;
    int fuelСonsumption;

    public car() {
    }

    public car(int volumeTank, int balanceTank, int fuelСonsumption) {
        this.volumeTank = volumeTank;
        this.balanceTank = balanceTank;
        this.fuelСonsumption = fuelСonsumption;
    }
    public int toFullTank(){
        return volumeTank - balanceTank;
    }
    public int remainingFuelOnArrival(int path){
        int temp = balanceTank - (path*fuelСonsumption/100);
        return temp;
    }
    public int travelExpenses(int path){
        int temp = (path*fuelСonsumption/100) - balanceTank;
        return temp;
    }

    public int getVolumeTank() {
        return volumeTank;
    }

    public void setVolumeTank(int volumeTank) {
        this.volumeTank = volumeTank;
    }

    public int getBalanceTank() {
        return balanceTank;
    }

    public void setBalanceTank(int balanceTank) {
        this.balanceTank = balanceTank;
    }

    public int getFuelСonsumption() {
        return fuelСonsumption;
    }

    public void setFuelСonsumption(int fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }
}
