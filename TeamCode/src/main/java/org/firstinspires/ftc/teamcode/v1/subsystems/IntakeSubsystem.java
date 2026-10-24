package org.firstinspires.ftc.teamcode.v1.subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.RobotLog;

import org.firstinspires.ftc.teamcode.v1.config.IntakeConfig;
import org.firstinspires.ftc.teamcode.v1.hardware.RobotHardware;
import org.firstinspires.ftc.teamcode.v1.services.PedroPathingConstants;

public class IntakeSubsystem {
    private final RobotHardware hardware;

    public IntakeSubsystem(HardwareMap hardwareMap, RobotHardware hardware) {
        this.hardware = hardware;
    };
    public void initialize(){


    };

    public void start(){
        DcMotorEx frontMotor = hardware.getIntakeFront();
        DcMotorEx intakeMotor = hardware.getIntakeMotor();

        if (frontMotor != null) {
            frontMotor.setPower(IntakeConfig.INTAKE_POWER);
        }
        if (intakeMotor != null) {
            intakeMotor.setPower(IntakeConfig.INTAKE_POWER);
        }
    };

    public void stop(){
        DcMotorEx frontMotor = hardware.getIntakeFront();
        DcMotorEx intakeMotor = hardware.getIntakeMotor();

        if (frontMotor != null) {
            frontMotor.setPower(0);
        }
        if (intakeMotor != null) {
            intakeMotor.setPower(0);
        }
    };
}
