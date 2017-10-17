package Main.Java.querybuilder.builder;

import Main.Java.querybuilder.domain.Bool;
import Main.Java.querybuilder.domain.Must;
import Main.Java.querybuilder.domain.Should;

public class MyFirstQueryBuilder{

    private Bool bool;

    public MyFirstQueryBuilder bool(){
        this.bool = new Bool();
        return this;
    }

    public MyFirstQueryBuilder mustMatch(String attribute, String value){
        Must must = new Must(attribute, value);
        bool.setMust(must);
        return this;
    }

    public MyFirstQueryBuilder shouldMatch(String attribute, String value){
        Should should = new Should(attribute, value);
        bool.setShould(should);
        return this;
    }

}
