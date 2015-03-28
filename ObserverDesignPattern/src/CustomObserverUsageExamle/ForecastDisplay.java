package CustomObserverUsageExamle;

import CustomObserver.Utils.AbstractObserver;
import CustomObserver.Utils.ObservableIF;

public class ForecastDisplay extends AbstractObserver<WeatherData> implements DisplayElementIF {
	
	private static final float DEFAULT_PRESSURE_VALUE = 29.92f;
	private static final String DEFAULT_IMPROVING_WEATHER_MSG = "Improving weather on the way!";
	private static final String DEFAULT_SAME_WEATHER_MSG = "More of the same";
	private static final String DEFAULT_COOLER_RAINY_WEATHER_MSG = "Watch out for cooler, rainy weather";
	
	private float currentPressure = DEFAULT_PRESSURE_VALUE;
	private float lastPressure = DEFAULT_PRESSURE_VALUE;
	
	private String newWeaterStatus = "";

	public ForecastDisplay(ObservableIF<WeatherData> subject) {
		super(subject);
	}

	protected void doOnUpdate(WeatherData data) {
		lastPressure = (currentPressure <= 0) ? data.getPressure() : currentPressure;
		currentPressure = data.getPressure();

		if (currentPressure > lastPressure) {
			newWeaterStatus = DEFAULT_IMPROVING_WEATHER_MSG;
		} else if (currentPressure == lastPressure) {
			newWeaterStatus = DEFAULT_SAME_WEATHER_MSG;
		} else if (currentPressure < lastPressure) {
			newWeaterStatus = DEFAULT_COOLER_RAINY_WEATHER_MSG;
		}

		display();
	}

	@Override
	public void display() {
		//System.out.println("ForecastDisplay -----------------------------------------");
		System.out.println("Forecast : " + newWeaterStatus);
		//System.out.println("---------------------------------------------------------");
	}
}