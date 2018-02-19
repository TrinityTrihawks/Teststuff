package org.usfirst.frc.team4215.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AnalogUltrasonic extends Subsystem {

    AnalogInput ultrasonic1;
    
    public AnalogUltrasonic(){
    	this.ultrasonic1 = new AnalogInput(0);
    }
    double range;
    public void ultrasonicRead() {
    	range = (ultrasonic1.getVoltage()/0.0048828)/5; // Supplied / Volts per inch
    	SmartDashboard.putNumber("Ultrasonic", range);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

