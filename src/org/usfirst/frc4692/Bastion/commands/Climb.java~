
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class Climb extends Command {
    public Climb() {
        requires(Robot.winch);
    }
    protected void initialize() {
    	Robot.winch.up();
    }
    protected void execute() {
    	Robot.winch.up();
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    	Robot.winch.stop();
    }
    protected void interrupted() {
    }
}
