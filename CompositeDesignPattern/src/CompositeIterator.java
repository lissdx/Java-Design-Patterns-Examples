import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

    // private final Iterator<? extends MenuComponent> iterator;
    private final Stack<Iterator<? extends MenuComponent>> stack;

    public CompositeIterator(Iterator<? extends MenuComponent> iterator) {
        stack = new Stack<>();
        stack.push(iterator);
        // this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<? extends MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<? extends MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            if (component.isComposite()) {
                stack.push(component.createIterator());
            } 
            return component;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
