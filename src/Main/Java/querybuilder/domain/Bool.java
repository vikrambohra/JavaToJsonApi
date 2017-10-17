package Main.Java.querybuilder.domain;

public class Bool {

    private Must must;
    private Should should;

    public Bool(){
    }

    public void setMust(Must must){
        this.must = must;
    }

    public void setShould(Should should){
        this.should = should;
    }

    public Must getMust() {
        return must;
    }

    public Should getShould() {
        return should;
    }
}
