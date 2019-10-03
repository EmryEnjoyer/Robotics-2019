package org.usfirst.frc.team6189.robot.Commands;

import org.usfirst.frc.team6189.robot.io;
import org.usfirst.frc.team6189.robot.Subsystems.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command{
	public RobotDrive drive;
	public Drive(RobotDrive drive) {
		super("Drive");
		this.drive = drive;
		requires(drive);
		
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	protected void initialize() {		
	}
	protected void execute() {
		drive.Drive(io.Left, io.Right);
	}
}
