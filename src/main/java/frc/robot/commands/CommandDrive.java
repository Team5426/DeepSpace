package frc.robot.commands;

public class CommandDrive extends CommandBase {
  public CommandDrive() {
    requires(drive);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    drive.drive();
    drive.scanForTape();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}
