
package org.usfirst.frc.team86.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	public talonAutoDrive driveAuto;
	
	private TalonSRX left1;
	private TalonSRX left2;
	private TalonSRX right1;
	private TalonSRX right2;

	@Override
	public void robotInit() {
		
	}

	@Override
	public void autonomousInit() {
		driveAuto = new talonAutoDrive(left1, left2, right1, right2);
		driveAuto.setTicksPerRevolution(80);
		driveAuto.setWheelSize(6);
		driveAuto.setDistanceValue(60);
	}

	@Override
	public void autonomousPeriodic() {
		driveAuto.drive();
	}

	@Override
	public void teleopPeriodic() {
	}

	@Override
	public void testPeriodic() {
	}
}
