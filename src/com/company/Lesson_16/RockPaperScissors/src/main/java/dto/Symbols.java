package dto;

public enum Symbols {
    Rock("❍"),
    Scissors("✄"),
    Paper("❏");

    private final String value;

    Symbols(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
