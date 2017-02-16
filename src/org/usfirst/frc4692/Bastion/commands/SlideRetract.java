
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class SlideRetract extends Command {
    public SlideRetract() {
        requires(Robot.gear);
    }
    protected void initialize() {
    	Robot.gear.Retract();
    }
    protected void execute() {
    	Robot.gear.Retract();
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
