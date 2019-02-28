package frc.robot.utils;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class LogitechController extends Joystick {

    public JoystickButton BUTTON_A;
    public JoystickButton BUTTON_B;
    public JoystickButton BUTTON_X;
    public JoystickButton BUTTON_Y;
    public JoystickButton BUTTON_START;
    public JoystickButton BUTTON_BACK;
    public JoystickButton BUMPER_LEFT;
    public JoystickButton BUMPER_RIGHT;

    public LogitechController(int port) {
        super(port);

        BUTTON_A = new JoystickButton(this, 1);
        BUTTON_B = new JoystickButton(this, 2);
        BUTTON_X = new JoystickButton(this, 3);
        BUTTON_Y = new JoystickButton(this, 4);
        BUMPER_LEFT = new JoystickButton(this, 5);
        BUMPER_RIGHT = new JoystickButton(this, 6);
        BUTTON_START = new JoystickButton(this, 8);
        BUTTON_BACK = new JoystickButton(this, 7);
    }

    public double getLeftAxisX() {
        return this.getRawAxis(0);
    }

    public double getLeftAxisY() {
        return this.getRawAxis(1);
    }

    public double getRightAxisX() {
        return this.getRawAxis(4);
    }

    public double getRightAxisY() {
        return this.getRawAxis(5);
    }

    public double getLeftTrigger() {
        return this.getRawAxis(2);
    }

    public double getRightTrigger() {
        return this.getRawAxis(3);
    }
}
