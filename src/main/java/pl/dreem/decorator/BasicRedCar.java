package pl.dreem.decorator;

class BasicRedCar implements Car {

    private final Car car;

    public BasicRedCar(final Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return new StringBuilder().append(car.getDescription())
                .append(" ")
                .append("in red color.")
                .toString();
    }
}
