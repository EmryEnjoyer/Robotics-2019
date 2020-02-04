package org.usfirst.frc.team6189.robot;

import edu.wpi.first.wpilibj.drive.Vector2d;

public class Utility {
	
	public static double[] Steering(double x, double y) {
		
		double dist = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
		double dirRight = Math.atan2(y/dist, x/dist) * (180/Math.PI);
		Vector2d vec = new Vector2d(x * Math.cos(dirRight + Math.PI/2), -y * Math.cos(dirRight + Math.PI/2));
		vec = new Vector2d(vec.x / 2, vec.y/2);
		double[] Coord = {vec.x, vec.y};
		return Coord;
	}
	
}
