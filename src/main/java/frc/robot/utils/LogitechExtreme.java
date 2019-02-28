package frc.robot.utils;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class LogitechExtreme extends Joystick {

    public JoystickButton BUTTON_TRIGGER;
    public JoystickButton BUTTON_THUMB;
    public JoystickButton BUTTON_3;
    public JoystickButton BUTTON_4;
    public JoystickButton BUTTON_5;
    public JoystickButton BUTTON_6;
    public JoystickButton BUTTON_7;
    public JoystickButton BUTTON_8;
    public JoystickButton BUTTON_9;
    public JoystickButton BUTTON_10;
    public JoystickButton BUTTON_11;
    public JoystickButton BUTTON_12;

    public LogitechExtreme(int port) {
        super(port);

        BUTTON_TRIGGER = new JoystickButton(this, 1);
        BUTTON_THUMB = new JoystickButton(this, 2);
        BUTTON_3 = new JoystickButton(this, 3);
        BUTTON_4 = new JoystickButton(this, 4);
        BUTTON_5 = new JoystickButton(this, 5);
        BUTTON_6 = new JoystickButton(this, 6);
        BUTTON_7 = new JoystickButton(this, 7);
        BUTTON_8 = new JoystickButton(this, 8);
        BUTTON_9 = new JoystickButton(this, 9);
        BUTTON_10 = new JoystickButton(this, 10);
        BUTTON_11 = new JoystickButton(this, 11);
        BUTTON_12 = new JoystickButton(this, 12);
    }

    public double getTwist() {
        return this.getRawAxis(2);
    }
}
