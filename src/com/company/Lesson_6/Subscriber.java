package com.company.Lesson_6;

public class Subscriber {
    private int id;
    private  String surname;
    private  String name;
    private String patronymic;
    private String city;
    private String telephone;
    private String contractNumber;
    private double balance;
    private  int cityTimeMin;
    private  int timeLongDistanceCallsMin;
    private  int internetTraffic;

    public Subscriber() {
    }

    public Subscriber(int id, String surname, String name, String patronymic, String city, String telephone, String contractNumber, double balance, int cityTimeMin, int timeLongDistanceCallsMin, int internetTraffic) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.city = city;
        this.telephone = telephone;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.cityTimeMin = cityTimeMin;
        this.timeLongDistanceCallsMin = timeLongDistanceCallsMin;
        this.internetTraffic = internetTraffic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCityTimeMin() {
        return cityTimeMin;
    }

    public void setCityTimeMin(int cityTimeMin) {
        this.cityTimeMin = cityTimeMin;
    }

    public int getTimeLongDistanceCallsMin() {
        return timeLongDistanceCallsMin;
    }

    public void setTimeLongDistanceCallsMin(int timeLongDistanceCallsMin) {
        this.timeLongDistanceCallsMin = timeLongDistanceCallsMin;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", city='" + city + '\'' +
                ", telephone='" + telephone + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", balance=" + balance +
                ", cityTimeMin=" + cityTimeMin +
                ", timeLongDistanceCallsMin=" + timeLongDistanceCallsMin +
                ", internetTraffic=" + internetTraffic +
                '}';
    }
}
