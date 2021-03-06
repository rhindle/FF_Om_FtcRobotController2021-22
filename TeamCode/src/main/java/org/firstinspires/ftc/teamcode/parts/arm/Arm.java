package org.firstinspires.ftc.teamcode.parts.arm;

import org.firstinspires.ftc.teamcode.base.Robot;
import org.firstinspires.ftc.teamcode.base.part.RobotPart;
import org.firstinspires.ftc.teamcode.other.Utils;
import org.firstinspires.ftc.teamcode.other.task.Task;
import org.firstinspires.ftc.teamcode.other.task.TaskManager;
import org.firstinspires.ftc.teamcode.parts.intake.Intake;

public class Arm extends RobotPart {

	public Arm(Robot robot, ArmHardware hardware, ArmSettings settings) {
		super(robot, hardware, settings);
	}

	public Arm(Robot robot){
		super(robot, new ArmHardware(), new ArmSettings());
	}


	/////////////////////
	//RobotPart Methods//
	/////////////////////
	@Override
	public void onConstruct() {

	}

	@Override
	public void onInit() {

	}

	@Override
	public void onStart() {

	}

	@Override
	public void onPause() {

	}

	@Override
	public void onUnpause() {

	}

	@Override
	public void onRunLoop(short runMode) {
	}

	@Override
	public void onAddTelemetry() {

	}

	@Override
	public void onStop() {

	}

	/////////
	//other//
	/////////
	public enum ArmPosition{
		FLAT((short) 0),
		DUMP((short) 1),
		F_DUMP((short) 2),
		CRADLE((short) 3);

		short value;

		ArmPosition(short value){
			this.value = value;
		}
	}
}
