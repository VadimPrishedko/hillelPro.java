package dto;

public class Student {
    private int id;
    private String fio;
    private String group;
    private int hours;

    public Student(int id, String fio, String group, int hours) {
        this.id = id;
        this.fio = fio;
        this.group = group;
        this.hours = hours;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
