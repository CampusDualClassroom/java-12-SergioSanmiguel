package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

public Car() {
    this.brand = "Unknown";
    this.model = "Unknown";
    this.fuel = "Unknown";
}
    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }
    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }
    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }
    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehiculo acendido");
        }else {
            System.out.println("O vehiculo xa esta acendido");
        }
    }
    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehiculo apagado");
        }else {
            System.out.println("Non se pode apagar o vehiculo, primero ten que estar detido");
        }
    }
    public void accelerate() {
        if (this.speedometer < MAX_SPEED) {
            this.speedometer += 10;
            if (this.speedometer > MAX_SPEED) {
                this.speedometer = MAX_SPEED;
            }
            System.out.println("Acelerando. Velocidad actual: " + this.speedometer + "km/h");
        } else {
            System.out.println("No se puede superar la velocidad máxima de: " + MAX_SPEED + "km/h");
        }
    }
    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 10;
            if (this.speedometer < 0) {
                this.speedometer = 0;
            }
            System.out.println("Frenando velocidad: " + this.speedometer + "km/h");
        } else {
            System.out.println("El coche ya esta detenido");
        }
    }
    public void turnAngleOfWheels(int angle) {
        if (angle >= -45 && angle <= 45) {
            this.wheelsAngle = angle;
            System.out.println("Angulo de las ruedas ajustado a: " + this.wheelsAngle + "grados");
        } else {
            if (angle > 45) {
                this.wheelsAngle = 45;
            }else {
                this.wheelsAngle = -45;
            }
            System.out.println("No se puede girar las ruedas mas de 45 grados o menos de 45 grados");
        }
    }


    public void setReverse(boolean reverse) {
        if (this.speedometer == 0) {
            this.reverse = reverse;
            if (reverse) {
                this.gear = "R";
                System.out.println("Marcha atras puesta");
            } else {
                this.gear = "N";
                System.out.println("Marcha atras desactivada");
            }
        } else {
            System.out.println("No se puede poner marcha atras si el coche esta en movimiento");
        }
    }
    public void showDetails() {
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Combustible: " + this.fuel);
        System.out.println("Velocidad actual: " + this.speedometer + "km/h");
        System.out.println("Tacometro: " + this.tachometer + "RPM");
        System.out.println("Angulo de las ruedas: " + this.wheelsAngle + "grados");
        System.out.println("Marcha: " + (this.reverse ? "R" : this.gear));
    }


}

