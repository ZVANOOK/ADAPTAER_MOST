package Spaceship;

import Spaceship.Operations.MovableAdapterGenerator;

public class Main {
    public static void main(String[] args) {
        String adapterClassName = "MovableAdapter";
        String interfaceName = "Spaceship.Operations.IMovable";

        String generatedAdapter = MovableAdapterGenerator.generateAdapter(adapterClassName, interfaceName);
        System.out.println("Генерируемый адаптер: " + generatedAdapter);
    }
}
