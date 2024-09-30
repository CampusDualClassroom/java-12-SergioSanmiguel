package com.campusdual.classroom;

public class Exercise12 {


    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", "Gasolina");
        System.out.println("Tacometro en 0: " + myCar.isTachometerEqualToZero());
        myCar.start();
        myCar.start();
        myCar.stop();
        myCar.accelerate();
        for (int i = 0; i < 15; i++){
            myCar.accelerate();
        }
        while (myCar.speedometer > 0){
            myCar.brake();
            myCar.turnAngleOfWheels(20);
            myCar.turnAngleOfWheels(50);
            myCar.setReverse(true);
            myCar.showDetails();
        }

    }
        }















