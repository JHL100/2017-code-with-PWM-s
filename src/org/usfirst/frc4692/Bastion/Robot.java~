
package org.usfirst.frc4692.Bastion;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc4692.Bastion.commands.Autonomous;
import org.usfirst.frc4692.Bastion.subsystems.*;

public class Robot extends IterativeRobot {

    Command Autonomous;
    private CameraServer camera;
    public static OI oi;
    public static drivetrain drivetrain;
    public static Winch winch;
    public static Ballstuff ballstuff;
    public static Gear gear;
    public static shift shift;
    
    public void robotInit() {
    RobotMap.init();
    	shift = new shift();
        drivetrain = new drivetrain();
        winch = new Winch();
        ballstuff = new Ballstuff();
        gear = new Gear();
        Autonomous = new Autonomous();
        oi = new OI();  
        camera = CameraServer.getInstance();
		camera.startAutomaticCapture();

    }
    public void disabledInit(){
    }
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }
    public void autonomousInit() {
        if (Autonomous != null) Autonomous.start();
    }
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }
    public void teleopInit() {
        if (Autonomous != null) Autonomous.cancel();
    }
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    public void testPeriodic() {
        LiveWindow.run();
    }
}
