package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.CommandElevator;
import frc.robot.commands.CommandFingers;
import frc.robot.commands.CommandGripper;
import frc.robot.utils.LogitechController;
import frc.robot.utils.LogitechExtreme;

public class OI {

    private static LogitechController lController;
    private static LogitechExtreme xController;

    public static void init() {
        lController = new LogitechController(0);
        xController = new LogitechExtreme(1);

        xController.BUTTON_TRIGGER.whenPressed(new CommandGripper());
        xController.BUTTON_THUMB.whenPressed(new CommandFingers());
        xController.BUTTON_7.whenPressed(new CommandElevator(1));
        xController.BUTTON_8.whenPressed(new CommandElevator(2));
    }

    public static LogitechController getLController() {
        return lController;
    }

    public static LogitechExtreme getXController() {
        return xController;
    }

    public static double getLControllerXAxis() {
        return processDeadband(lController.getLeftAxisX());
    }

    public static double getLControllerYAxis() {
        return processDeadband(lController.getLeftAxisY());
    }

    public static double getXControllerTwist() {
        return xController.getTwist();
    }

    public static double getLeftTrigger() {
        return lController.getLeftTrigger();
    }

    public static double getRightTrigger() {
        return lController.getRightTrigger();
    }

    public static double processDeadband(double value) {
        if (value < RobotMap.DEADBAND_MIN || value > RobotMap.DEADBAND_MAX) {
            value = 0;
        }

        return value;
    }
}
