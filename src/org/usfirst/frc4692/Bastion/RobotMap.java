
package org.usfirst.frc4692.Bastion;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap {
    public static AnalogInput rangefinder;
    public static Talon drivetrainleft;
    public static Talon drivetrainright;
    public static RobotDrive drivetrainDrive;
    public static Talon winchWheel;
    public static Talon winchWheel1;
    public static Talon ballstuffSpitpick;
    public static Talon ballstuffAgitator;
    public static DoubleSolenoid toggleHood;
    public static DoubleSolenoid gearSlide;
    public static DoubleSolenoid gearSpit;
    public static DoubleSolenoid shiftshifter;

    public static void init() {
        rangefinder = new AnalogInput(0);
        LiveWindow.addSensor("Drivetrain", "rangefinder", rangefinder);
        drivetrainleft = new Talon(2);
        LiveWindow.addActuator("Drivetrain", "left", drivetrainleft);
        drivetrainright = new Talon(3);
        LiveWindow.addActuator("Drivetrain", "right", drivetrainright);  
        drivetrainDrive = new RobotDrive(drivetrainleft, drivetrainright);
        drivetrainDrive.setSafetyEnabled(true);
        drivetrainDrive.setExpiration(0.1);
        drivetrainDrive.setSensitivity(0.5);
        drivetrainDrive.setMaxOutput(1.0);
        winchWheel = new Talon(4);
        LiveWindow.addActuator("Winch", "Wheel", winchWheel);
        winchWheel1 = new Talon(5);
        LiveWindow.addActuator("Winch", "Wheel1", winchWheel1);
        ballstuffAgitator = new Talon(6);
        LiveWindow.addActuator("Ballstuff", "Spitpick", ballstuffAgitator);
        ballstuffSpitpick = new Talon(7);
        LiveWindow.addActuator("Ballstuff", "Agitator", ballstuffSpitpick);
        toggleHood = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("Toggle", "Hood", toggleHood);
        gearSlide = new DoubleSolenoid(0, 2, 3);
        LiveWindow.addActuator("Gear", "Slide", gearSlide);  
        gearSpit = new DoubleSolenoid(0, 4, 5);
        LiveWindow.addActuator("Gear", "Spit", gearSpit);
        shiftshifter = new DoubleSolenoid(0, 6, 7);
        LiveWindow.addActuator("shift", "shifter", shiftshifter);
    }
}
