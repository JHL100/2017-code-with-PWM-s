
package org.usfirst.frc4692.Bastion.subsystems;
import org.usfirst.frc4692.Bastion.RobotMap;
import org.usfirst.frc4692.Bastion.commands.*;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Ballstuff extends Subsystem {
    private final Talon spitpick = RobotMap.ballstuffSpitpick;
    private final Talon agitator = RobotMap.ballstuffAgitator;
    private final DoubleSolenoid Hood = RobotMap.toggleHood;
    public void initDefaultCommand() {
    	setDefaultCommand(new stop());
    }
    	public void beltup() {
    		spitpick.set(1.0);
    	}
    	public void agitator(){
    		agitator.set(1.0);
    	}
    	public void beltstop() {
    		spitpick.set(0);
    		agitator.set(0);
    		Hood.set(DoubleSolenoid.Value.kOff);
    	}
    	public void Extend(){
    		Hood.set(DoubleSolenoid.Value.kForward);
    	}
    	public void Retract(){
    		Hood.set(DoubleSolenoid.Value.kReverse);
    	}
}
