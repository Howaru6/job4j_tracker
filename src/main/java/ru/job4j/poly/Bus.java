package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Пробег");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Пассажиров в транспорте " + number);
    }

    @Override
    public double refuel(double fuel) {
        return fuel *  54.13;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.passengers(15);
        bus.refuel(25);
    }
}
