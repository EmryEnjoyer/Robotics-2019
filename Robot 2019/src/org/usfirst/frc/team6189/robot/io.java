package org.usfirst.frc.team6189.robot;

import edu.wpi.first.wpilibj.XboxController;

public class io {
	public static final int ControllerID = 0;
	public static final int StickX = 0;
	public static final int StickY = 1;

	
	public static double Left = 0;
	public static double Right = 0;
	public static XboxController controller = new XboxController(ControllerID);
	
	public io() {
		
	}
	public static void Check() {
		double[] coord = Utility.Steering(StickX, StickY);
		Left = coord[0];
		Right = coord[1];
	}
}
