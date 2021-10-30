public class USclient {
    private forUS modelS;
    private forUS model_3;
    private forUS modelX;
    private forUS modelY;

    public USclient () {
        this.modelS = new models();
        this.model_3 = new model3();
        this.modelX = new modelx();
        this.modelY = new modely();
    }

    private String info( forUS model ) {
        String modelSinfo = model.getName() + "\nTop Speed (mph): " + model.getSpeed() + "\nRange (mph): " + model.getRange();
        String modelSinfo2 = "\n0 to 60 (sec): " + model.get0to60() + "\nPrice: $" + model.getprice();
        return modelSinfo+modelSinfo2;
    }

    public String modelSinfo () {
        return info ( this.modelS );
    }

    public String model3info () {
        return info ( this.model_3 );
    }

    public String modelXinfo () {
        return info ( this.modelX );
    }

    public String modelYinfo () {
        return info ( this.modelY);
    }


}
