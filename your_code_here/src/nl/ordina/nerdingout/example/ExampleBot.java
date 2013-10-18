package nl.ordina.nerdingout.example;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class ExampleBot extends AdvancedRobot {

    public void run() {
        setBodyColor(Color.RED);
        setGunColor(Color.RED);
        setRadarColor(Color.RED);

        while (true) {
            turnRadarLeft(360);
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        setTurnGunTowardsOpponent(event.getBearing());
    }

    private void setTurnGunTowardsOpponent(double opponentsBearing) {
    	
        // do something to turn the gun towards the opponent
        // make sure you are swinging the shortest way!
    }

    double getDegreesBetweenGunAndOpponentBearing(double ownHeading, double ownGunHeading, double opponentsBearing) {
        // Maybe first translate the opponents relative bearing to absolute degrees (like the heading)?

        // Calculate the difference in degrees.
        // Watch the corner cases! What if the difference is more then -180 or 180?

        return 0;
    }

    double fromBearingToDegrees(double ownHeading, double bearing) {
        // try to translate the relative bearing to absolute degrees
        // Watch the corner cases! What if the difference slips under 0 or higher then 360?

        return 0;
    }
}
