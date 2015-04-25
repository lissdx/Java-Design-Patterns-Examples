package duck.example.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import duck.example.interfaces.QuackableIF;

public class Flock implements QuackableIF {
    private final ArrayList<QuackableIF> quackableList;
    
    public Flock() {
        quackableList = new ArrayList<>();
    }
    
    public Flock( Collection<QuackableIF> quackableCollection) {
        quackableList = new ArrayList<>( quackableCollection );
    }
    
    public void add( final QuackableIF duck) {
        this.quackableList.add( duck );
    }
    
    @Override
    public void quack() {
        Iterator<QuackableIF> iterator = quackableList.iterator();
        while (iterator.hasNext()) {
            QuackableIF duck = (QuackableIF) iterator.next();
            duck.quack();
        }

    }

}
