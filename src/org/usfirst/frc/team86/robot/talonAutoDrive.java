package org.usfirst.frc.team86.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class talonAutoDrive {
	
	private TalonSRX left1;
	private TalonSRX left2;
	private TalonSRX right1;
	private TalonSRX right2;
	
	public double ticksPerRevolution;
	public double wheelCircumference;
	public double distanceValue;
	
	public talonAutoDrive(TalonSRX left1, TalonSRX left2, TalonSRX right1, TalonSRX right2) {
		this.left1 = left1;
		this.left2 = left2;
		this.right1 = right1;
		this.right2 = right2;
		
		left2.set(ControlMode.Follower, left1.getDeviceID());
		right2.set(ControlMode.Follower, right1.getDeviceID());
		
		left1.set(ControlMode.Position, 0);
		right1.set(ControlMode.Position, 0);
	}
	
	public void drive() {
		left1.set(ControlMode.Position, ticksPerRevolution * (distanceValue / wheelCircumference));
		right1.set(ControlMode.Position, ticksPerRevolution * (distanceValue / wheelCircumference));
	}
	
	public double getTicksPerRevolution() {
		return ticksPerRevolution;
	}
 	
	public void setTicksPerRevolution(double ticksPerRevolution) {
		this.ticksPerRevolution = ticksPerRevolution;
	}
	
	public double getWheelSize() {
		return wheelCircumference;
	}
	
	//Wheel size in inches
	public void setWheelSize(double diameter) {
		this.wheelCircumference = Math.PI * diameter;
	}
	
	public double getDistanceValue() {
		return distanceValue;
	}
	
	//Distance in inches
	public void setDistanceValue(double distanceValue) {
		this.distanceValue = distanceValue;
	}
	
}
