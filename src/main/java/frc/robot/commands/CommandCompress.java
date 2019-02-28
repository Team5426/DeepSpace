package frc.robot.commands;

public class CommandCompress extends CommandBase {
  public CommandCompress() {
    requires(compressor);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    if (!compressor.isFull() && !compressor.isRunning()) {
      compressor.start();
    }

    else {
      compressor.stop();
    }
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
