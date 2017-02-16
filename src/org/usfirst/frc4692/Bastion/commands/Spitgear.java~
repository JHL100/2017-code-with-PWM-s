
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class Spitgear extends Command {
	public Spitgear() {
        requires(Robot.gear);
    }
    protected void initialize() {
    	Robot.gear.gearout();
    }
    protected void execute() {
    	Robot.gear.gearout();
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
