package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem {

  private DoubleSolenoid elevator;

  private int level;

  public Elevator() {
    elevator = new DoubleSolenoid(1, 6, 7);

    this.level = 1;
  }

  public void raise() {
    elevator.set(Value.kForward);
  }

  public void descend() {
    elevator.set(Value.kReverse);
  }

  public void setLevel(int target) {
    this.level = target;
  }

  public int getLevel() {
    return level;
  }

  @Override
  public void initDefaultCommand() {

  }
}
