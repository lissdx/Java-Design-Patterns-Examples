package CustomObserverUsageExamle;

import CustomObserver.Utils.AbstractObserver;
import CustomObserver.Utils.ObservableIF;

//
public class CurrentConditionsDisplay extends AbstractObserver<WeatherData> implements DisplayElementIF{
	private float temperature = 0;
	private float humidity = 0;
	
	public CurrentConditionsDisplay(ObservableIF<WeatherData> subject) {
		super(subject);
	}

	@Override
	// Here we get new updated data after any updates
	// in rObservable
	protected void doOnUpdate(WeatherData data) {
		this.temperature = data.getTemperature();
		this.humidity = data.getHumidity();		
		display();
	}

	@Override
	public void display() {
		//System.out.println("CurrentConditionsDisplay -------------------------------");
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
		//System.out.println("--------------------------------------------------------");		
		
	}
}
