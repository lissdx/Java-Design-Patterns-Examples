
public class Amplifier {

    final String description;
    Tuner        tuner;
    DVDPlayer    dvd;

    public Amplifier(final String description) {
        this.description = description;
    }

    // CdPlayer cd;
    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setSurroundSound() {
        System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }

    public void setDVD(DVDPlayer dvd) {
        System.out.println(description + " setting DVD player to " + dvd);
        this.dvd = dvd;
    }
    
    public String toString() {
        return description;
    }
}
