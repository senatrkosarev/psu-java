package com.skosarev.lab02.part1.task3;

public class Name {
    private final String name;
    private final String surname;
    private final String patronymic;

    public Name(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (surname != null) {
            sb.append(surname).append(" ");
        }
        if (name != null) {
            sb.append(name).append(" ");
        }
        if (patronymic != null) {
            sb.append(patronymic);
        }

        if (sb.isEmpty()) {
            return "Неизвестное имя";
        }

        if (sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
