public class UKclient {
    private forUS modelS;
    private forUS model_3;
    private forUS modelX;
    private forUS modelY;

    public UKclient () {
        this.modelS = new models();
        this.model_3 = new model3();
        this.modelX = new modelx();
        this.modelY = new modely();
    }

    private String info( forUS model, adpaterforuk model_S ) {
        String modelSinfo = model.getName() + "\nTop Speed (kmh): " + model_S.getSpeed() + "\nRange (kmh): " + model_S.getRange();
        String modelSinfo2 = "\n0 to 60 (sec): " + model_S.get0to60() + "\nPrice: £" + model_S.getprice();
        return modelSinfo+modelSinfo2;
    }

    public String modelSinfo () {
        adpaterforuk modelS_uk = new actualadapter(this.modelS);
        return info ( this.modelS, modelS_uk );
    }

    public String model3info () {
        adpaterforuk model3_uk = new actualadapter(this.model_3);
        return info ( this.model_3, model3_uk );
    }

    public String modelXinfo () {
        adpaterforuk modelX_uk = new actualadapter(this.modelX);
        return info ( this.modelX, modelX_uk );
    }

    public String modelYinfo () {
        adpaterforuk modelY_uk = new actualadapter(this.modelY);
        return info ( this.modelY, modelY_uk );
    }



}
