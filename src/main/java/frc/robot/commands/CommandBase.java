package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Compressor;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.Gripper;

public abstract class CommandBase extends Command {

  public static Drive drive;
  public static Gripper gripper;
  public static Elevator elevator;
  public static Compressor compressor;

  public static void init() {
    drive = new Drive();
    gripper = new Gripper();
    elevator = new Elevator();
    compressor = new Compressor();
  }
}
