package com.xworkz.ball;

import com.xworkz.ball.ball.Ball;
import com.xworkz.ball.football.Football;

public class BallRunner {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.validateBallDetails();

        Football football = new Football();
        football.validateBallDetails();
    }
}
