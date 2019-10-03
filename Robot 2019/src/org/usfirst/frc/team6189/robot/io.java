package org.usfirst.frc.team6189.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;

public class io {
	public static double Left;
	public static double Right;
	public static Joystick LeftStick = new Joystick(0);
	public static Joystick RightStick = new Joystick(1);
	public io() {
		
	}
	public static void Check() {
		
		Left = LeftStick.getY();
		Right = RightStick.getY();
	}
}
