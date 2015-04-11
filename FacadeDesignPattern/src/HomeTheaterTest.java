
public class HomeTheaterTest {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier( "Top-O-Line Amplifier" );
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amplifier);
        DVDPlayer dvd =  new DVDPlayer("Top-O-Line DVD Player", amplifier);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLight theaterLight = new TheaterLight("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popcornPopper = new PopcornPopper("Popcorn Popper");
        
        HomeTheaterFacade homeTheater = new HomeTheaterFacade( amplifier, tuner, dvd, projector, theaterLight, screen, popcornPopper);
        homeTheater.watchMovie("Riders of the Lost Ark");
        homeTheater.endMovie();
    }

}
