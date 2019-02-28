package frc.robot.commands;

public class CommandElevator extends CommandBase {
  private int target;

  public CommandElevator(int target) {
    requires(elevator);

    this.target = target;
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    if (elevator.getLevel() < this.target) {
      // If current level is less than target level, raise the elevator
      elevator.raise();
    }

    else if (elevator.getLevel() > this.target) {
      // If it's lower, then lower it
      elevator.descend();
    }

    // Update the elevator level to the target level
    elevator.setLevel(target);
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
