public class actualadapter implements adpaterforuk {
    private forUS models;

    public actualadapter ( forUS model ) {
        this.models = model;
    }

    private double mph2kmh ( double speed ) {
        return Math.round(speed * 1.60934);
    }

    private double dollar2pound ( double currency ) {
        return Math.round(currency*0.73);
    }

    @Override
    public double getSpeed () {
        return mph2kmh( models.getSpeed() );
    }

    @Override
    public double getRange () {
        return mph2kmh( models.getRange() );
    }

    @Override
    public double get0to60 () {
        return models.get0to60();
    }

    @Override
    public double getprice () {
        return dollar2pound(models.getprice() );
    }
}
