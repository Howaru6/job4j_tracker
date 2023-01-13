package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        active = true;
        status = 404;
        message = "Все плохо";
    }

    public void printInfo(boolean active, int status, String message) {
        System.out.println("Ошибка активна: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение ошибки: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo(true, 404, "Все плохо");

    }
}
