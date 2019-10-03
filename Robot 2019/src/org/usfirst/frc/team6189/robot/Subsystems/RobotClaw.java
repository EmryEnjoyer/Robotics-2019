package org.usfirst.frc.team6189.robot.Subsystems;

import org.usfirst.frc.team6189.robot.RobotMap;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class RobotClaw extends Subsystem{
	
	PWMVictorSPX ArmPitch = new PWMVictorSPX(RobotMap.ArmPitch);
	@Override
	public void initDefaultCommand() {
	}
	public void Open() {}
	public void Raise() {
		ArmPitch.set(-1);
	}
	public void Lower() {
		
		ArmPitch.set(1);
		
	}

}
