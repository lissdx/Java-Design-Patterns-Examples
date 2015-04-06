package object_example.test;

import object_example.adapter.DuckAdapter;
import object_example.impl.MallardDuck;
import object_example.interfaces.TurkeyIF;

public class TurkeyTest {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		TurkeyIF duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<10;i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}