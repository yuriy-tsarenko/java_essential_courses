package com.java_essential.ZinchenkoVika.varycheva.homework.hw6.task2;

public class Distance {

    private final double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public static class Converter {

        private static double factor;

        public enum Length {
            KILOMETER(1000),
            CM(0.01),
            MILE(1609.344);

            private final double factor;

            Length(double factor) {
                this.factor = factor;
            }

            public double getFactor() {
                return factor;
            }
        }

        public Converter(Length length) {
            switch (length) {
                case CM:
                    factor = Length.CM.getFactor();
                    break;
                case KILOMETER:
                    factor = Length.KILOMETER.getFactor();
                    break;
                case MILE:
                    factor = Length.MILE.getFactor();
                    break;
            }
        }

        public static double convertFromMeter(double meter) {
            return (meter / factor);
        }

        public static double convertToMeter(double meter) {
            return (meter * factor);
        }
    }
}
