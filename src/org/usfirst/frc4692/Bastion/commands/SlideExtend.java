
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class SlideExtend extends Command { 
	public SlideExtend() {
        requires(Robot.gear);
    }
    protected void initialize() {
    	Robot.gear.Extend();
    }
    protected void execute() {
    	Robot.gear.Extend();
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    	Robot.gear.Stop();
    }
    protected void interrupted() {
    }
}
