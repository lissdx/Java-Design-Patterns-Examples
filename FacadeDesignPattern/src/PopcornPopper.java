
public class PopcornPopper {

    final String description;

    public PopcornPopper(final String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void pop() {
        System.out.println(description + " popping popcorn!");
    }

    public String toString() {
        return description;
    }
}
