package org.usfirst.frc.team6189.robot.Subsystems;

import org.usfirst.frc.team6189.robot.RobotMap;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6189.robot.Commands.Drive;
public class RobotDrive extends Subsystem{
	/*
	 * This is an array. THink about it like a varible that holds
	 * a bunch of other varibles. It makes it easier whenever you want to control the drive to
	 * be able to say Drive[0] instead of LeftDriveBackMotor, etc
	 * Since we don't know how we want to control the robot, we'll just leave this class for now
	 */
	PWMVictorSPX[] Drive = new PWMVictorSPX[] 
			{new PWMVictorSPX(RobotMap.LeftDriveFront), 
			new PWMVictorSPX(RobotMap.LeftDriveBack),
			new PWMVictorSPX(RobotMap.RightDriveFront),
			new PWMVictorSPX(RobotMap.RightDriveBack)};
	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new Drive(this));
	}
	//Making a default drive like last year (I don't really like this method, but it works)
	public void Drive(double LeftDrive, double RightDrive) {
		
		Drive[0].set(LeftDrive);
		Drive[1].set(LeftDrive);
		Drive[2].set(RightDrive);
		Drive[3].set(RightDrive);
	}
}
