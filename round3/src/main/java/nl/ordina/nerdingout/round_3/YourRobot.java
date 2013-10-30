package nl.ordina.nerdingout.round_3;

import robocode.AdvancedRobot;

import java.awt.*;

public class YourRobot extends AdvancedRobot {

    @Override
    public void run() {
        setBodyColor(Color.BLACK);
        setGunColor(Color.BLACK);
        setRadarColor(Color.BLACK);
        setScanColor(Color.BLACK);

        while(true) {
            turnRadarLeft(360);
        }
    }
}
