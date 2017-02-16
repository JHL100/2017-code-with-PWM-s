
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class DriveWithJoysticks extends Command {
	public DriveWithJoysticks() {
    	requires(Robot.drivetrain);
    }
    protected void initialize() {
    }
    protected void execute() {
    	Robot.drivetrain.takeJoystickInputs(Robot.oi.getJoystick1(), Robot.oi.getJoystick2()); 
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    	Robot.drivetrain.stop();
    }
    protected void interrupted() {
    	end();
    }
}
