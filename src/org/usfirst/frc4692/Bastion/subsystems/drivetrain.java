
package org.usfirst.frc4692.Bastion.subsystems;
import org.usfirst.frc4692.Bastion.RobotMap;
import org.usfirst.frc4692.Bastion.commands.*;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

	public class drivetrain extends Subsystem {

		private double autoSpeed = 0.5;//autoSpeed is set at .5, meaning the motors will run at 50%
		public double runTimeForward = 1.0;
		public double runTimeBackward = 1.0; //This code is for autonomous, and the values are in seconds. values can be changed to whatever we need.
		@SuppressWarnings("unused")
		private final Talon right = RobotMap.drivetrainright;
		@SuppressWarnings("unused")
		private final Talon left = RobotMap.drivetrainleft;
		private final RobotDrive drive = RobotMap.drivetrainDrive;

		public void initDefaultCommand() {
			setDefaultCommand(new DriveWithJoysticks());
	}
		public void takeJoystickInputs(Joystick joystick1, Joystick joystick2) {
			drive.tankDrive(joystick1, joystick2);
	}
		public void driveStraight(double d) {
			drive.drive(3.0, 3.0);
    }
    	public void driveforward() {
    		drive.setLeftRightMotorOutputs(-3.0,3.0);
    }
    	public void driveForward(){
    		drive.tankDrive(autoSpeed, autoSpeed);//autoSpeed is a command for autonomous that runs the motors
	}
    	public void driveBackward(){   
    		drive.tankDrive(-autoSpeed, -autoSpeed);//negative values make the motors run in reverse
	}
    	public void stop(){
    		drive.tankDrive(0, 0);
	}
}


