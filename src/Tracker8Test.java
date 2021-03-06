import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.Delay;
import lejos.nxt.*;


public class Tracker8Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float wheelDiameter =  5.6f;
	    float trackWidth = 11.4f;
	    LightSensor leftEye = new LightSensor(SensorPort.S4);
	    LightSensor rightEye = new LightSensor(SensorPort.S1);
	    
	    
		DifferentialPilot pilot = new DifferentialPilot(wheelDiameter, trackWidth, Motor.A, Motor.C);
		Tracker8 t1 = new Tracker8 (pilot, leftEye, rightEye);
		Delay.msDelay(1000);
		LCD.clear();
		t1.calibrate();
		t1.trackLine();
		
	}

}