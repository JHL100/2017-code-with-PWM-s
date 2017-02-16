
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class Gearin extends Command {
	public Gearin() {
        requires(Robot.gear);
    }
    protected void initialize() {
    	Robot.gear.gearin();
    }
    protected void execute() {
    	Robot.gear.gearin();
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    	Robot.gear.gearstop();
    }
    protected void interrupted() {
    }
}
