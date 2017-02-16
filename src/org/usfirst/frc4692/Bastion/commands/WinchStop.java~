
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class WinchStop extends Command {
    public WinchStop() {
        requires(Robot.winch);
    }
    protected void initialize() {
    	Robot.winch.stop();
    }
    protected void execute() {
    	Robot.winch.stop();
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
