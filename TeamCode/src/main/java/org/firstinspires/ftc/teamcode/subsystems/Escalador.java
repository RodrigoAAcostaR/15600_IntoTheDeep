package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class Escalador extends SubsystemBase {
    private DcMotorEx escalador;
    private Telemetry telemetry;
    private HardwareMap hardwareMap;

    private ServoEx launcher;

    public Escalador(HardwareMap hardwareMap, Telemetry telemetry){
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;

        escalador = hardwareMap.get(DcMotorEx.class, "escalador");
        escalador.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        escalador.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        launcher = new SimpleServo(hardwareMap, "launcher", 0, 180, AngleUnit.DEGREES);

    }

    public void setPower(double power){
        escalador.setPower(power);
    }

    public void setPosition(int pos){
        escalador.setPower(1);
        escalador.setTargetPosition(pos);
        escalador.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public void launch(){
        launcher.turnToAngle(150);
    }

    public void setLaunch(){
        launcher.turnToAngle(25);
    }

    public void open(){
        launcher.turnToAngle(0);
    }

    public boolean isAtSetpoint() {
        boolean isAtPosition = escalador.getCurrentPosition() - escalador.getTargetPosition() < escalador.getTargetPositionTolerance();
        return isAtPosition;
    }

    @Override
    public void periodic(){
        telemetry.addData("Escalador: ", escalador.getCurrentPosition());
    }

}
