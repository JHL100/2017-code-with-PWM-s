
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class driveforward extends Command {
	Timer drive = new Timer();
    public driveforward() {
        requires(Robot.drivetrain);
    }
    protected void initialize() {
    	drive.start();
    }
    protected void execute() {
    	Robot.drivetrain.driveStraight(3.0);
    }
    protected boolean isFinished() {
        return (drive.get()>2);
    }
    protected void end() {
    	Robot.drivetrain.driveStraight(0);
    }
    protected void interrupted() {
    }
}
