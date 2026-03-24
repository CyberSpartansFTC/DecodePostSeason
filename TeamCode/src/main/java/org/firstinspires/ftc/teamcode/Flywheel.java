package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.bylazar.configurables.annotations.Configurable;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import dev.nextftc.control.ControlSystem;
import dev.nextftc.control.builder.ControlSystemBuilder;
import dev.nextftc.control.feedback.PIDCoefficients;
import dev.nextftc.ftc.NextFTCOpMode;
import dev.nextftc.hardware.impl.MotorEx;

@TeleOp
@Configurable
public class Flywheel extends NextFTCOpMode {

    private MotorEx flywheelMotor;
    private ControlSystem controller;
    public static PIDCoefficients coefficients;

    @Override
    public void onInit() {
        flywheelMotor = new MotorEx("flywheel");
        coefficients = new PIDCoefficients(0,0,0);
        controller = ControlSystem.builder()
                .posPid(coefficients)
                .build();
    }

    @Override
    public void onStartButtonPressed() {

    }

    @Override
    public void onUpdate() {
        super.onUpdate();
    }
}