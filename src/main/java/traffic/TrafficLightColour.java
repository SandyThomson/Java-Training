package main.java.traffic;

//An enumeration of the colors of a traffic light. 
enum TrafficLightColour {
	RED(1000), RED_YELLOW(500), GREEN(1000), YELLOW(1000);
	
	private int delay;
	private TrafficLightColour(int delay) {
		this.delay = delay;
	}
	
	public int getDelay(){
		return this.delay;
	}
}
