package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class CommandGripper extends CommandBase {
  public CommandGripper() {
    requires(gripper);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    if (gripper.getGripperValue().equals(Value.kForward)) {
      gripper.setGripper(Value.kReverse);
    }

    else {
      gripper.setGripper(Value.kForward);
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
