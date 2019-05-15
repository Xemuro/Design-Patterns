package pl.dreem.adapter;

class CentimetersObjectAdapterImpl implements CentimetersAdapter{

    FacadeMeters meters = new FacadeMeters();

    @Override
    public Meters get100Centimeters() {
        return convertToCentimeters(1);
    }

    @Override
    public Meters get200Centimeters() {
        return convertToCentimeters(2);
    }

    @Override
    public Meters get300Centimeters() {
        return convertToCentimeters(3);
    }

    private Meters convertToCentimeters(int multiple){
        return new Meters(Math.multiplyExact(meters.getMeters().getValue(), multiple));
    }
}
