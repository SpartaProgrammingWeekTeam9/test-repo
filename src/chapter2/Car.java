package chapter2;

public class Car {
        private final double value;

        public Car(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        // 덧셈
        public Car add(Car other) {
            return new Car(this.value + other.value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
