package pl.dreem.adapter;

class CentimetersClassAdapterImpl extends FacadeMeters implements CentimetersAdapter {

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
        return new Meters(Math.multiplyExact(getMeters().getValue(), multiple));
    }
}
