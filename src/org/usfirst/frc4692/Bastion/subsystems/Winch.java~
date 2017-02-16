
package org.usfirst.frc4692.Bastion.subsystems;
import org.usfirst.frc4692.Bastion.RobotMap;
import org.usfirst.frc4692.Bastion.commands.*;
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Winch extends Subsystem {
    private final static CANTalon wheel = RobotMap.winchWheel;
    private final static CANTalon wheel1 = RobotMap.winchWheel1;
    public void initDefaultCommand() {
    	setDefaultCommand(new WinchStop());
    }
    	public void up() {
    		wheel.set(1.0);
    		wheel1.set(1.0);
    }
    	public void stop() {
    		wheel.set(0);
    		wheel1.set(0);
    }
}
