import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.*;


public class Calibrate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float wheelDiameter =  5.6f;
	    float trackWidth = 11.4f;
	    LightSensor leftEye = new LightSensor(SensorPort.S4);
	    LightSensor rightEye = new LightSensor(SensorPort.S1);
	    
	    
		DifferentialPilot pilot = new DifferentialPilot(wheelDiameter, trackWidth, Motor.A, Motor.C);
		Tracker t1 = new Tracker (pilot, leftEye, rightEye);
		t1.calibrate();
		//t1.trackLine();

	}

}
