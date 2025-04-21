package com.xworkz.ball;

import com.xworkz.ball.ball.Ball;
import com.xworkz.ball.football.Football;

public class BallRunner {
    public static void main(String[] args) {

        Ball ball = new Ball();
        ball.validateBallDetails();
        ball.ballMaterial();
        ball.ballSize();
        ball.ballColor();
        ball.ballUses();
        ball.madeIn();


        Football football = new Football();
        football.validateBallDetails();
        football.ballMaterial();
        football.ballSize();
        football.ballColor();
        football.ballUses();
        football.madeIn();
        football.footballType();
        football.numberOfPanels();
        football.airPressure();
        football.officialWeight();
        football.suitableSurface();


        Ball polyBall = new Football();
        polyBall.validateBallDetails();
        polyBall.ballMaterial();
        polyBall.ballSize();
        polyBall.ballColor();
        polyBall.ballUses();
        polyBall.madeIn();
    }
}
