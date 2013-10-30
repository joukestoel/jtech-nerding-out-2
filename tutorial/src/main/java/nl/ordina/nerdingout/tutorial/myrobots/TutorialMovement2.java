package nl.ordina.nerdingout.tutorial.myrobots;

import robocode.AdvancedRobot;
import robocode.HitWallEvent;

public class TutorialMovement2 extends AdvancedRobot {

    @Override
    public void run() {
        ahead(Double.POSITIVE_INFINITY);
    }

    @Override
    public void onHitWall(HitWallEvent e) {
        // put code to follow the wall here
    }

}
