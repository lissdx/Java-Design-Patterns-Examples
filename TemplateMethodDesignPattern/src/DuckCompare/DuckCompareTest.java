package DuckCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuckCompareTest {
    public static void main(String[] args) {
        List<Duck> duckList = new ArrayList<>();
        
        duckList.add(new Duck("Daffy", 8));
        duckList.add(new Duck("Dewey", 2));
        duckList.add(new Duck("Howard", 7));
        duckList.add(new Duck("Louie", 2));
        duckList.add(new Duck("Donald", 10));
        duckList.add(new Duck("Huey", 2));
        
        System.out.println("Before sorting : ");
        for( Duck holdDuck : duckList ){
            System.out.println(holdDuck.toString());
        }
        System.out.println("After sorting : ");
        Collections.sort(duckList);
        for( Duck holdDuck : duckList ){
            System.out.println(holdDuck.toString());
        }        
    }
}
