public class HomeTheaterFacade {
    final Amplifier     amplifier;
    final Tuner         tuner;
    final DVDPlayer     dvd;
    final Projector     projector;
    final TheaterLight  theaterLight;
    final Screen        screen;
    final PopcornPopper popcornPopper;

    public HomeTheaterFacade( final Amplifier amplifier, 
                              final Tuner tuner, 
                              final DVDPlayer dvd, 
                              final Projector projector, 
                              final TheaterLight theaterLight, 
                              final Screen screen, 
                              final PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvd = dvd;
        this.projector = projector;
        this.theaterLight = theaterLight;
        this.screen = screen;
        this.popcornPopper = popcornPopper;        
    }
    
    public void watchMovie( final String movie ) {
        System.out.println("Get ready to watch a movie ...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLight.dim( 10 );
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.setDVD( dvd );
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvd.on();
        dvd.play( movie );
    }
    
    public void endMovie( ) {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theaterLight.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }    
}
