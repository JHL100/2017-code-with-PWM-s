
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class downshift extends Command {
    public downshift() {
        requires(Robot.shift);
    }
    protected void initialize() {
    	Robot.shift.down();
    }
    protected void execute() {
    	Robot.shift.down();
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    	Robot.shift.Stop();
    }
    protected void interrupted() {
    }
}
