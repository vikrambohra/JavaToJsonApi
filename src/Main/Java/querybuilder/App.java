package Main.Java.querybuilder;

import Main.Java.querybuilder.domain.Query;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

    public static void main(String[] args){
        System.out.println("Begin building..... ");
        Query.QueryBuilder builder = new Query.QueryBuilder();
        Query query = builder.bool().mustMatch("item","Milk").mustMatch("item_type", "Dairy").bool().shouldMatch("fei", "shz")
                .build();

        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(query));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
