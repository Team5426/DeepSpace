package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.OI;
import frc.robot.RobotMap;
import frc.robot.commands.CommandDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Drive extends Subsystem {

  private WPI_VictorSPX LEFT_REAR;
  private WPI_VictorSPX LEFT_FRONT;
  private WPI_VictorSPX RIGHT_REAR;
  private WPI_VictorSPX RIGHT_FRONT;

  private SpeedControllerGroup LEFT;
  private SpeedControllerGroup RIGHT;

  private DifferentialDrive drive;

  private DigitalInput changeMe1;
  private DigitalInput changeMe2;
  private DigitalInput changeMe3;
  private DigitalInput changeMe4;

  public Drive() {
    LEFT_REAR = new WPI_VictorSPX(3);
    LEFT_FRONT = new WPI_VictorSPX(4);
    RIGHT_REAR = new WPI_VictorSPX(1);
    RIGHT_FRONT = new WPI_VictorSPX(5);

    LEFT = new SpeedControllerGroup(LEFT_REAR, LEFT_FRONT);
    RIGHT = new SpeedControllerGroup(RIGHT_REAR, RIGHT_FRONT);

    drive = new DifferentialDrive(LEFT, RIGHT);
    drive.setSafetyEnabled(false);

    changeMe1 = new DigitalInput(0);
    changeMe2 = new DigitalInput(1);
    changeMe3 = new DigitalInput(2);
    changeMe4 = new DigitalInput(3);
  }

  public void drive() {
    double xAxis = OI.getLControllerXAxis();
    double yAxis = OI.getLControllerYAxis();
    double leftTrigger = OI.getLeftTrigger();
    double rightTrigger = OI.getRightTrigger();

    // Drive Logic
    if (xAxis == 0 || yAxis == 0) {
      // If joystick not being used, drive
      // using trigger values;
      drive.arcadeDrive(leftTrigger / 2, rightTrigger / 2);
    }

    else {
      // Drive with joystick value
      drive.arcadeDrive(yAxis * -1, xAxis);
    }
  }

  public void scanForTape() {
    double twist = OI.getXControllerTwist();

    // Scan Logic
    if (twist == 1) {
      if (changeMe1.get() && changeMe2.get()) {
        drive.arcadeDrive(RobotMap.SCAN_SPEED, 0);
      }

      else {
        drive.arcadeDrive(RobotMap.SCAN_SPEED_HELPER, RobotMap.SCAN_SPEED_TURN);
      }
    }

    else if (twist == -1) {
      if (changeMe3.get() && changeMe4.get()) {
        drive.arcadeDrive(RobotMap.SCAN_SPEED, 0);
      }

      else {
        drive.arcadeDrive(RobotMap.SCAN_SPEED_HELPER, -RobotMap.SCAN_SPEED_TURN);
      }
    }
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new CommandDrive());
  }
}
