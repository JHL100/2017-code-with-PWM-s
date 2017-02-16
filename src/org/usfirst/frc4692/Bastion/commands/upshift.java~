
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class upshift extends Command {
    public upshift() {
        requires(Robot.shift);
    }
    protected void initialize() {
    	Robot.shift.up();
    }
    protected void execute() {
    	Robot.shift.up();
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
