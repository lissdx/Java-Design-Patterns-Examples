package compaund.observer.example;

import compaund.observer.impl.AbstractDuckFactory;
import compaund.observer.impl.AbstractDuckGooseFactory;
import compaund.observer.impl.CountingDuckFactory;
import compaund.observer.impl.DuckFactory;
import compaund.observer.impl.DuckGooseFactory;
import compaund.observer.impl.Flock;
import compaund.observer.impl.GooseFactory;
import compaund.observer.impl.QuackCounter;
import compaund.observer.impl.Quackologist;
import compaund.observer.interfaces.QuackableIF;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractDuckGooseFactory gooseFactory = new DuckGooseFactory(new GooseFactory());

        duckSimulator.simulateFlock(duckFactory, gooseFactory);
    }

    void simulate(QuackableIF duck) {
        duck.quack();
    }

    private void simulateFlock(AbstractDuckFactory duckFactory, AbstractDuckGooseFactory gooseFactory) {

        Flock flockOfDucks = new Flock();
        Quackologist quackologist = new Quackologist();

        flockOfDucks.add(duckFactory.createRedHatDuck());
        flockOfDucks.add(duckFactory.createDuckCall());
        flockOfDucks.add(duckFactory.createRubberDuck());
        flockOfDucks.add(gooseFactory.createDuckGoose());

        Flock flockOfMallarDuck = new Flock();
        flockOfMallarDuck.add(duckFactory.createMallarDuck());
        flockOfMallarDuck.add(duckFactory.createMallarDuck());
        flockOfMallarDuck.add(duckFactory.createMallarDuck());
        flockOfMallarDuck.add(duckFactory.createMallarDuck());

        flockOfDucks.add(flockOfMallarDuck);

        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("The ducks quacked [ " + QuackCounter.getNumberOfQuacks() + " ] times");
    }

}
