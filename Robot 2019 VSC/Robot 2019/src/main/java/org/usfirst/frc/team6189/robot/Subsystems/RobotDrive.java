package org.usfirst.frc.team6189.robot.Subsystems;

import org.usfirst.frc.team6189.robot.RobotMap;
import org.usfirst.frc.team6189.robot.Commands.Drive;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
public class RobotDrive extends Subsystem{
	/*
	 * This is an array. THink about it like a varible that holds
	 * a bunch of other varibles. It makes it easier whenever you want to control the drive to
	 * be able to say Drive[0] instead of LeftDriveBackMotor, etc
	 * Since we don't know how we want to control the robot, we'll just leave this class for now
	 */
	private static RobotDrive instance;

	public static RobotDrive getInstance(){

		if(instance == null){
			instance = new RobotDrive();
			instance.setDefaultCommand(new Drive());
			System.out.println("Ravioli");
		}
		
		return instance;
	}
	 


	//Making a default drive like last year (I don't really like this method, but it works)
	public void Drive(double LeftDrive, double RightDrive) {
		
		
		System.out.println(RightDrive + " " + LeftDrive);
		
	}
	@Override
	public void initDefaultCommand(){
		new Drive();
		this.setDefaultCommand(new Drive());

	}
}
