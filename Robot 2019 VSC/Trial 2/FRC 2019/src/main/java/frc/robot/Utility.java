/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Add your docs here.
 */
public class Utility {
    public static double[] Steering(double x, double y) {
        double powLeft = -Math.sin((x * Math.PI)/2);
        double powRight = Math.sin((x * Math.PI)/2);
        if((powLeft <= 0.3  && powLeft >= -0.3) || (powRight <= 0.3 && powRight >= -0.3)){
            powLeft = y;
            powRight = y;

        }
        if(powLeft > 1){
            powLeft = 1;

        }
        if(powLeft <-1){
            powLeft = -1;

        }
        if(powRight > 1){
            powRight = 1;

        }
        if(powRight < -1){
            powRight = -1;

        }
        double[] Coord = {-powLeft, powRight};
		return Coord;
	}
}
