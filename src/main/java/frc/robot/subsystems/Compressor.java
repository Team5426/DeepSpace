package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Compressor extends Subsystem {

  private edu.wpi.first.wpilibj.Compressor compressor;

  public Compressor() {
    compressor = new edu.wpi.first.wpilibj.Compressor(0);

    compressor.setClosedLoopControl(false);
  }

  public void start() {
    compressor.start();
  }

  public void stop() {
    compressor.stop();
  }

  public boolean isRunning() {
    return compressor.enabled();
  }

  public boolean isFull() {
    return compressor.getPressureSwitchValue();
  }

  @Override
  public void initDefaultCommand() {

  }
}
