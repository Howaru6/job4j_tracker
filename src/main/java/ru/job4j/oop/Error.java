package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = true;
        this.status = 404;
        this.message = "Все плохо";
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
