package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.subsystems.Elevador;
import org.firstinspires.ftc.teamcode.subsystems.Intake;

public class ElevadorDefault extends CommandBase {
    Elevador elevator;
    Intake intake;
    GamepadEx gamepad;

    public ElevadorDefault(Elevador elevator, GamepadEx gamepad, Intake intake){
        this.elevator = elevator;
        this.intake = intake;
        this.gamepad = gamepad;

        addRequirements(elevator, intake);
    }

    @Override
    public void execute() {
        //Por poder
/*
        if(gamepad.getTrigger(GamepadKeys.Trigger.RIGHT_TRIGGER) > .5){
            elevator.setPower(1);
        }else if(gamepad.getTrigger(GamepadKeys.Trigger.RIGHT_TRIGGER) > 0){
            elevator.setPower(0);
        }
        if (gamepad.getTrigger(GamepadKeys.Trigger.LEFT_TRIGGER) > .5){
            elevator.setPower(-1);
        }else if(gamepad.getTrigger(GamepadKeys.Trigger.LEFT_TRIGGER) > 0){
            elevator.setPower(0);
        }

 */





        //Por posiciones
        if(gamepad.getTrigger(GamepadKeys.Trigger.RIGHT_TRIGGER) > .5){
            //CommandScheduler.getInstance().schedule(new InstantCommand(intake::servoA));
            CommandScheduler.getInstance().schedule(new ElevadorGoToPosition(elevator, 1180));
        }

        if (gamepad.getTrigger(GamepadKeys.Trigger.LEFT_TRIGGER) > .5){
            //CommandScheduler.getInstance().schedule(new InstantCommand(intake::servoA));
            CommandScheduler.getInstance().schedule(new ElevadorGoToPosition(elevator, 0));
        }

        if(elevator.isAtSetpoint()){
            intake.dejar();
        }

        if(gamepad.getButton(GamepadKeys.Button.RIGHT_BUMPER)){

        }









    }
}
