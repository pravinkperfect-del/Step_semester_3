package main.java.Session7_Encapsulation.class_problems;

class Locker {
    private String code;
    private final int number;

    Locker(int number, String code) {
        this.number = number;
        this.code = code;
    }

    int getNumber() {
        return number;
    }

    void changeCode(String oldCode, String newCode) {
        if (code.equals(oldCode)) {
            code = newCode;
        }
    }
}

public class LockerCode {
    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");
        l.changeCode("1234", "5678");
        l.changeCode("0000", "9999");
        System.out.println("Locker " + l.getNumber() + " code changed successfully");
    }
}