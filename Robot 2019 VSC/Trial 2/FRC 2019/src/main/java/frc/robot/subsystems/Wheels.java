/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */

public class Wheels extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static Wheels instance;
  public Spark leftFront = new Spark(RobotMap.leftMotorFront);
  public Spark leftBack = new Spark(RobotMap.leftMotorBack);
  public Spark right = new Spark(RobotMap.righTMotor);
  public static double Speed = .75;
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    
  }

  public void DriveWheels(double left, double right){
      if(Math.abs(left) > 0.34){  
      leftFront.setSpeed(left * (Math.abs(Speed) - 0.34) * (Speed / Math.abs(Speed)));
        leftBack.setSpeed(left * (Math.abs(Speed) - 0.34) * (Speed / Math.abs(Speed)));
  } else{
    leftFront.setSpeed(left * 0);
        leftBack.setSpeed(left * 0);

  }
        this.right.setSpeed(right * Speed);
    System.out.println(left + " " + right);
    
  }
}
