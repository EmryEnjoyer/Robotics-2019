package org.usfirst.frc.team6189.robot.Commands;

import org.usfirst.frc.team6189.robot.io;
import org.usfirst.frc.team6189.robot.Subsystems.RobotDrive;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command{
	
	public RobotDrive drive;
	public Drive() {

		super("Drive");
		
		drive = RobotDrive.getInstance();
		requires(drive);
		
	}
	@Override
	protected void initialize() {		
	}
	@Override
	protected void execute() {
		System.out.println("Ravioli");
		drive.Drive(io.Left, io.Right);
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
