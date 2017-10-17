package Main.Java.querybuilder.domain;


public class Query {

    private Bool bool;

    public Query(QueryBuilder builder){
        this.bool = builder.bool;
    }

    public Bool getBool() {
        return bool;
    }

    public static class QueryBuilder {

        private Bool bool;

        public QueryBuilder bool(){
            bool = new Bool();
            return this;
        }

        public QueryBuilder mustMatch(String attribute, String value){
            Must must = new Must(attribute, value);
            bool.setMust(must);
            return this;
        }

        public QueryBuilder shouldMatch(String attribute, String value){
            Should should = new Should(attribute, value);
            bool.setShould(should);
            return this;
        }

        public Query build(){
            return new Query(this);
        }

    }
}
