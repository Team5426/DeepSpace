package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class CommandFingers extends CommandBase {
  public CommandFingers() {
    requires(gripper);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    if (gripper.getFingersValue().equals(Value.kReverse)) {
      gripper.setFingers(Value.kForward);
    }

    else {
      gripper.setFingers(Value.kReverse);
    }
  }

  @Override
  protected boolean isFinished() {
    return true;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}
