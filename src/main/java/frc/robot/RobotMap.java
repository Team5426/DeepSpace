package frc.robot;

public class RobotMap {

    public static double DEADBAND_MIN = -0.1;
    public static double DEADBAND_MAX = 0.1;
    public static double SCAN_SPEED = 0.5;

    // Robot has trouble turning in place on carpet so
    // giving it some forward power helps it move.
    public static double SCAN_SPEED_HELPER = 0.1;
    public static double SCAN_SPEED_TURN = 0.55;
}
