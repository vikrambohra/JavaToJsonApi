package Main.Java.querybuilder.domain;

import java.util.ArrayList;
import java.util.List;

public class Must {

    private List<Match> matches;
    private Bool bool;

    public Must(){
        matches = new ArrayList<Match>();
        bool = new Bool();
    }

    public Must(String attribute, String value){
        matches = new ArrayList<Match>();
        addMatch(attribute, value);
        bool = new Bool();
    }


    public void addMatch(String attibute, String value){
        addMatch(new Match(attibute, value));
    }

    public void addMatch(Match match){
        matches.add(match);
    }

    public List<Match> getMatches() {
        return matches;
    }

    public Bool getBool() {
        return bool;
    }

}
