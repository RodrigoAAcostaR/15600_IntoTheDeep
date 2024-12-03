package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Elevador;

public class ElevadorGoToPosition extends CommandBase {
    Elevador elevator;
    int setPoint;

    public ElevadorGoToPosition(Elevador elevator, int setPoint){
        this.elevator = elevator;
        this.setPoint = setPoint;

        addRequirements(elevator);
    }

    @Override
    public void execute() {
        elevator.setPosition(1, setPoint);
    }

    @Override
    public boolean isFinished() {
        return elevator.isAtSetpoint();
    }


}
