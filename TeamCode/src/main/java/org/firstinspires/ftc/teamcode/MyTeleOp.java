package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp
public class BrandonTeleOp extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();

        telemetry.addLine("Robot is running");
        telemetry.update();

        ElapsedTime elapsedTime = new ElapsedTime();
        elapsedTime.reset();

        while (opModeIsActive()) {

            // Round it off to two decimal places
            double roundedTime = Math.round(elapsedTime.time() * 100.) / 100.;

            // Print the time to telemetry
            telemetry.addLine("Current time: " + roundedTime);
            telemetry.update();
        }
    }
}
