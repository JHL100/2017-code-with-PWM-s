
package org.usfirst.frc4692.Bastion.subsystems;
import org.usfirst.frc4692.Bastion.RobotMap;
import org.usfirst.frc4692.Bastion.commands.*;
import edu.wpi.first.wpilibj.DoubleSolenoid;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Gear extends Subsystem {
    private final DoubleSolenoid slide = RobotMap.gearSlide;
    private final DoubleSolenoid spit = RobotMap.gearSpit;
    public void initDefaultCommand() {
    	setDefaultCommand(new Gearin());
    }
    	public void Extend(){
    		slide.set(DoubleSolenoid.Value.kForward);
    }
        public void Retract(){
    		slide.set(DoubleSolenoid.Value.kReverse);
    }
    	public void Stop(){
    		slide.set(DoubleSolenoid.Value.kOff);
    }	
    	public void gearout(){
    		spit.set(DoubleSolenoid.Value.kForward);
    }
        public void gearin(){
        	spit.set(DoubleSolenoid.Value.kReverse);
    }
        public void gearstop(){
        	spit.set(DoubleSolenoid.Value.kOff);
    }
}
