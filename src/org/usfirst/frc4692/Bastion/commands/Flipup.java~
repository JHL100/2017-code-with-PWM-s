
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class Flipup extends Command {

    public Flipup() {
        requires(Robot.ballstuff);
    }
    protected void initialize() {
    	Robot.ballstuff.Extend();
    	Robot.ballstuff.beltup();
    	Robot.ballstuff.agitator();
    }
    protected void execute() {
    	Robot.ballstuff.Extend();
    	Robot.ballstuff.beltup();
    	Robot.ballstuff.agitator();
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    	Robot.ballstuff.beltstop();
    }
    protected void interrupted() {
    }
}
