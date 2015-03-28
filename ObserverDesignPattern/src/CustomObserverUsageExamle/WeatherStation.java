package CustomObserverUsageExamle;

public class WeatherStation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WeatherObservable weatherObservable = new WeatherObservable();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay( weatherObservable );
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay( weatherObservable );
		ForecastDisplay forecastDisplay = new ForecastDisplay( weatherObservable );
		//
		weatherObservable.setMeasurements(80, 65, 30.4f);
		weatherObservable.setMeasurements(82, 70, 29.2f);
		weatherObservable.setMeasurements(78, 90, 29.2f);
	}
}
