package pl.dreem.decorator;

class BasicCarWithWheels implements Car{

    private final Car car;

    public BasicCarWithWheels(final Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return new StringBuilder().append(car.getDescription())
                                  .append(" ")
                                  .append("with wheels.")
                                  .toString();
    }
}
