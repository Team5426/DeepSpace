package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Gripper extends Subsystem {

  private DoubleSolenoid gripper;
  private DoubleSolenoid fingers;

  private DigitalInput hatchSwitch;

  public Gripper() {
    gripper = new DoubleSolenoid(1, 2, 3);
    fingers = new DoubleSolenoid(1, 4, 5);

    hatchSwitch = new DigitalInput(5);
  }

  public void setFingers(Value value) {
    fingers.set(value);
  }

  public void setGripper(Value value) {
    gripper.set(value);
  }

  public Value getFingersValue() {
    return fingers.get();
  }

  public Value getGripperValue() {
    return gripper.get();
  }

  public void release() {
    gripper.set(Value.kForward);
  }

  public boolean getHatchSwitch() {
    return hatchSwitch.get();
  }

  @Override
  public void initDefaultCommand() {
  }
}
