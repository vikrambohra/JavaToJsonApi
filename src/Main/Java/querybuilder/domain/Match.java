package Main.Java.querybuilder.domain;

public class Match {

    private String attribute;
    private String value;

    public Match(String attribute, String value){
        this.attribute = attribute;
        this.value = value;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getValue() {
        return value;
    }
}
