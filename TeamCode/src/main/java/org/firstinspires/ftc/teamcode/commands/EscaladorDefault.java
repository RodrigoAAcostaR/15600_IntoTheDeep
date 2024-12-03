package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.subsystems.Escalador;

public class EscaladorDefault extends CommandBase {
    Escalador escalador;
    GamepadEx gamepad;


    public EscaladorDefault(Escalador escalador, GamepadEx gamepad){
        this.escalador = escalador;
        this.gamepad = gamepad;

        addRequirements(escalador);
    }

    @Override
    public void execute() {

        //Posiciones
        if(gamepad.getTrigger(GamepadKeys.Trigger.RIGHT_TRIGGER) > .5){
            CommandScheduler.getInstance().schedule(new EscaladorGoToPosition(escalador, 4500));
        }


        if (gamepad.getTrigger(GamepadKeys.Trigger.LEFT_TRIGGER) > .5){
            CommandScheduler.getInstance().schedule(new EscaladorGoToPosition(escalador, 0));
        }
        /*

        if(gamepad.getTrigger(GamepadKeys.Trigger.RIGHT_TRIGGER) > .5){
            escalador.setPower(1);
        }else if(gamepad.getTrigger(GamepadKeys.Trigger.RIGHT_TRIGGER) > 0){
            escalador.setPower(0);
        }

        if (gamepad.getTrigger(GamepadKeys.Trigger.LEFT_TRIGGER) > .5){
            escalador.setPower(-1);
        }else if(gamepad.getTrigger(GamepadKeys.Trigger.LEFT_TRIGGER) > 0){
            escalador.setPower(0);
        }

         */

    }

}
