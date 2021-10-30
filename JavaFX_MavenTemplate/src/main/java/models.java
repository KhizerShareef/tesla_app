public class models implements forUS {
    // model name
    private String model_name = "MODEL S";

    // getter for the model name
    public String getName () {
        return this.model_name;
    }
    // model specs
    // top speed
    public double getSpeed () {
        //mph
        return 200;
    }
    // EV range
    public double getRange () {
        //miles
        return 396;
    }
    // 0 - 60 in secs
    public double get0to60() {
        //0to60 in secs
        return 1.99;
    }
    // model price in usd
    public double getprice() {
        // usd
        return 129990;
    }
}
