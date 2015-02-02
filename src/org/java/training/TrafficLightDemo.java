package org.java.training;

public class TrafficLightDemo {
	enum TrafficLight {
		RED(12_000), GREEN(10_000), AMBER(2_000);

		public final int delay;
		TrafficLight(int delay) { this.delay = delay; }

		public static TrafficLight next(TrafficLight current) {
			return TrafficLight.values()[(current.ordinal() + 1) % TrafficLight.values().length];
		}
	}
	
	public static void main(String[] args) {
		LightSwitcher switcher = new LightSwitcher(TrafficLight.GREEN);
		
		for(int i = 0; i < 9; ++i) {
			System.out.printf("Traffic Light [%s]%n", switcher.lightState());
			switcher.awaitChange();
		}
		
		switcher.stop();
	}
	
	static class LightSwitcher implements Runnable {
		private TrafficLight light;
		private boolean running = true;
		private boolean changed = false;
		
		public LightSwitcher(TrafficLight light) {
			this.light = light;
			new Thread(this).start();
		}
		
		public LightSwitcher() {
			this(TrafficLight.RED);
		}

		public void run() {
			while(running) {
				try {
					Thread.sleep(light.delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				changeColour();
			}
		}
		
		public synchronized void changeColour() {
			light = TrafficLight.next(light);
			changed = true;
			notify();
		}
		
		public synchronized void awaitChange() {
			try {
				while(!changed) wait();
				changed = false;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public synchronized TrafficLight lightState() {
			return light;
		}
		
		public synchronized void stop() {
			running = false;
		}
	}

}
