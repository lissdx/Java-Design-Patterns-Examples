package duck.example.test;

import java.util.ArrayList;
import java.util.List;

import duck.example.impl.AbstractDuckFactory;
import duck.example.impl.AbstractDuckGooseFactory;
import duck.example.impl.AbstractGooseFactory;
import duck.example.impl.CountingDuckFactory;
import duck.example.impl.DuckCall;
import duck.example.impl.DuckGooseFactory;
import duck.example.impl.Flock;
import duck.example.impl.Goose;
import duck.example.impl.GooseAdapter;
import duck.example.impl.GooseFactory;
import duck.example.impl.MallarDuck;
import duck.example.impl.QuackCounter;
import duck.example.impl.RedHatDuck;
import duck.example.impl.RubberDuck;
import duck.example.interfaces.HonkableIF;
import duck.example.interfaces.QuackableIF;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractDuckGooseFactory gooseFactory = new DuckGooseFactory( new GooseFactory());
        
        //duckSimulator.simulate( duckFactory, gooseFactory );               
        duckSimulator.simulateFlock( duckFactory, gooseFactory );
    }
    
    void simulate( QuackableIF duck ){
        duck.quack();
    }

    private void simulateFlock(AbstractDuckFactory duckFactory, AbstractDuckGooseFactory gooseFactory) {
        
        Flock flockOfDucks = new Flock();
        flockOfDucks.add( duckFactory.createRedHatDuck());
        flockOfDucks.add( duckFactory.createDuckCall());
        flockOfDucks.add( duckFactory.createRubberDuck());
        flockOfDucks.add( gooseFactory.createDuckGoose());
        
        Flock flockOfMallarDuck = new Flock();
        flockOfMallarDuck.add( duckFactory.createMallarDuck());
        flockOfMallarDuck.add( duckFactory.createMallarDuck());
        flockOfMallarDuck.add( duckFactory.createMallarDuck());
        flockOfMallarDuck.add( duckFactory.createMallarDuck());
            
        flockOfDucks.add( flockOfMallarDuck );
        
        simulate( flockOfDucks );
        simulate( flockOfMallarDuck );
        //System.out.println("The ducks quacked [ " + QuackCounter.getNumberOfQuacks() + " ] times");        
    }
    
    private void simulate(AbstractDuckFactory duckFactory, AbstractDuckGooseFactory gooseFactory) {
        //List<QuackableIF> quackableList = craeteQuackableList();
        List<QuackableIF> quackableList = craeteQuackableList( duckFactory, gooseFactory );
        
        QuackCounter.resetQuackCounter();
        for( QuackableIF duck : quackableList ){
            simulate( duck );
        }
        
        System.out.println("The ducks quacked [ " + QuackCounter.getNumberOfQuacks() + " ] times");        
    }

    private List<QuackableIF> craeteQuackableList(AbstractDuckFactory duckFactory, AbstractDuckGooseFactory gooseFactory) {
        List<QuackableIF> quackableList = new ArrayList<>();

        quackableList.add( duckFactory.createMallarDuck());
        quackableList.add( duckFactory.createRedHatDuck());
        quackableList.add( duckFactory.createDuckCall());
        quackableList.add( duckFactory.createRubberDuck());
        quackableList.add( gooseFactory.createDuckGoose());
        
        return quackableList;
    }
        
    private java.util.List<QuackableIF> craeteQuackableListWithCounters() {
        List<QuackableIF> quackableList = new ArrayList<>();
        //QuackableIF holdQuackable;
        quackableList.add( new QuackCounter( new MallarDuck()));
        quackableList.add( new QuackCounter( new RedHatDuck()));
        quackableList.add( new QuackCounter( new DuckCall()));
        quackableList.add( new QuackCounter( new RubberDuck()));
        quackableList.add( new GooseAdapter( new Goose()));
        
        return quackableList;
    }    
    
    @SuppressWarnings("unused")
    private void simulate() {
        //List<QuackableIF> quackableList = craeteQuackableList();
        List<QuackableIF> quackableList = craeteQuackableListWithCounters( );
        
        QuackCounter.resetQuackCounter();
        for( QuackableIF duck : quackableList ){
            simulate( duck );
        }
        
        System.out.println("The ducks quacked [ " + QuackCounter.getNumberOfQuacks() + " ] times");
        
    }
    
    @SuppressWarnings("unused")
    private java.util.List<QuackableIF> craeteQuackableList() {
        List<QuackableIF> quackableList = new ArrayList<>();
        //QuackableIF holdQuackable;
        quackableList.add( new MallarDuck());
        quackableList.add( new RedHatDuck());
        quackableList.add( new DuckCall());
        quackableList.add( new RubberDuck());
        quackableList.add( new GooseAdapter( new Goose()));
        
        return quackableList;
    }
    
}
