package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Escalador;

public class EscaladorGoToPosition extends CommandBase {
    Escalador escalador;
    int setPoint;

    public EscaladorGoToPosition(Escalador escalador, int setPoint){
        this.escalador = escalador;
        this.setPoint = setPoint;

        addRequirements(escalador);
    }

    @Override
    public void execute() {
        escalador.setPosition(setPoint);
    }

    @Override
    public boolean isFinished() {
        return escalador.isAtSetpoint();
    }
}
