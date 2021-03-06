package org.usfirst.frc.team4003.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	public static final int LEFTFRONTDRIVEMOTOR = 0;
	public static final int LEFTBACKDRIVEMOTOR = 1;
	public static final int RIGHTFRONTDRIVEMOTOR = 2;
	public static final int RIGHTBACKDRIVEMOTOR = 3;
	public static final int SHOOTER0 = 15; // top shooter
	public static final int SHOOTER1 = 23; // bottom shooter
	public static final int CONVEYOR = 4;
}
