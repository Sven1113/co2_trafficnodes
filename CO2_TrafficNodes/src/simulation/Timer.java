package simulation;

import java.util.ArrayList;
import java.util.List;

public class Timer {

	long currentTime;
	long endTime;
	
	List<TimeComponent> timeComponents = new ArrayList<TimeComponent>();
	
	public Timer() {
		// TODO Auto-generated constructor stub
	}
	
	public Timer(long endTime) {
		// TODO Auto-generated constructor stub
	}
	
	public void update(){
		for(TimeComponent timeComponent : timeComponents){
			timeComponent.update();
			System.out.println(String.format("Current time %s", currentTime));
			currentTime++;
		}
	}
	
}
