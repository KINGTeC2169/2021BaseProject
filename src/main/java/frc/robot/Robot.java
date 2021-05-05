/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2020 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import com.revrobotics.CANSparkMaxLowLevel;
import frc.robot.Controls;
import frc.robot.subsystems.DriveSub;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.Joystick;
import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  @Override
  public void robotInit() {
    System.out.println("robotInit function Test");

  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
    System.out.println("TeleopInit Test");
  }

  @Override
  public void teleopPeriodic() {
    System.out.println("TeleopPeriodic Test");
    Joystick leftJoy = new Joystick(0);
    Joystick rightJoy = new Joystick(1);

    CANSparkMax sparkMax1 = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax2 = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax3 = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax4 = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax5 = new CANSparkMax(5, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax6 = new CANSparkMax(6, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax7 = new CANSparkMax(7, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax8 = new CANSparkMax(8, CANSparkMaxLowLevel.MotorType.kBrushless);

    double speed = -leftJoy.getRawAxis(1) * 0.6;
    double turn = rightJoy.getRawAxis(2) * 0.3;
    double left = speed + turn;
    double right = speed - turn;

    sparkMax1.set(left);
    sparkMax2.set(left);
    sparkMax3.set(left);
    sparkMax4.set(left);
    sparkMax5.set(left);
    sparkMax6.set(left);
    sparkMax7.set(left);
    sparkMax8.set(left);
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
