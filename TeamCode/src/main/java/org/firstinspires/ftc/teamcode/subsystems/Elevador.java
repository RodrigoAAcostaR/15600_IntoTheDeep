package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class Elevador extends SubsystemBase {
    private DcMotorEx elevator;
    private ServoEx auto;
    private Telemetry telemetry;
    private HardwareMap hardwareMap;

    public Elevador(HardwareMap hardwareMap, Telemetry telemetry) {
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;

        auto = new SimpleServo(hardwareMap, "auto", 0, 180, AngleUnit.DEGREES);
        elevator = hardwareMap.get(DcMotorEx.class, "elevador");
        elevator.setDirection(DcMotorSimple.Direction.REVERSE);
        elevator.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        elevator.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        recall();
    }

    public void setPosition(double power, int pos) {
        elevator.setPower(power);
        elevator.setTargetPosition(pos);
        elevator.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public void setPower(double power) {
        elevator.setPower(power);
    }

    public void leave(){
        auto.turnToAngle(180);
    }

    public void recall(){
        auto.turnToAngle(55);
    }

    public void mid(){
        auto.turnToAngle(80);
    }

    public boolean isAtSetpoint() {
        boolean isAtPosition = elevator.getCurrentPosition() - elevator.getTargetPosition() < elevator.getTargetPositionTolerance();
        return isAtPosition;
    }

    @Override
    public void periodic(){
        telemetry.addData("Elevador: ", elevator.getCurrentPosition());
    }
}
