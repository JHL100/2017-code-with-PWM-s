
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class Flipdown extends Command {
    public Flipdown() {
        requires(Robot.ballstuff);
    }
    protected void initialize() {
    	Robot.ballstuff.Retract();
    	Robot.ballstuff.beltup();
    }
    protected void execute() {
    	Robot.ballstuff.Retract();	
    	Robot.ballstuff.beltup();
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
