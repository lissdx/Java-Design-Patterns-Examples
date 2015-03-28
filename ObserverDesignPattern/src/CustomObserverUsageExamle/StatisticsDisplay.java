package CustomObserverUsageExamle;

import CustomObserver.Utils.AbstractObserver;
import CustomObserver.Utils.ObservableIF;

public class StatisticsDisplay extends AbstractObserver<WeatherData> implements DisplayElementIF {
	private float tempMax = 0;
	private float tempAvg = 0;
	private float tempMin = 0;
	private float tempSum = 0;
	private float tempCnt = 0;

	public StatisticsDisplay(ObservableIF<WeatherData> subject) {
		super(subject);
	}

	@Override
	protected void doOnUpdate( WeatherData data ) {
		float tmp = data.getTemperature();
		
		if( tempMax < tmp ){
			tempMax = tmp;
		}
		
		if( tempMin > tmp || tempMin <= 0){
			tempMin = tmp;
		}
		
		tempSum += tmp;
		tempAvg = tempSum / ++tempCnt;
		display();
	}

	@Override
	public void display() {
		System.out.println( "Avg/Max/Min temperature : " + this.tempAvg + "/" + this.tempMax + "/" + this.tempMin );		
	}

}
