
package org.usfirst.frc4692.Bastion.subsystems;
import org.usfirst.frc4692.Bastion.RobotMap;
import org.usfirst.frc4692.Bastion.commands.*;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class shift extends Subsystem {
    private final DoubleSolenoid shifter = RobotMap.shiftshifter;
    
    public void initDefaultCommand() {
        setDefaultCommand(new downshift());
    }
	public void up(){
		shifter.set(DoubleSolenoid.Value.kForward);
	}
    public void down(){
		shifter.set(DoubleSolenoid.Value.kReverse);
    }
	public void Stop(){
		shifter.set(DoubleSolenoid.Value.kOff);
    }
}

