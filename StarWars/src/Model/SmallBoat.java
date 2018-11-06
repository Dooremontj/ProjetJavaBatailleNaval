package Model;

import java.util.ArrayList;
import java.util.Random;

public class SmallBoat extends Boat {

    public SmallBoat() {
        super();
        super.setResistance(1);
        super.setCapacityMove(2);
        this.type = BoatType.SMALL;
        super.setSHOOT20POURCENT(2);
        super.setSHOOT50POURCENT(0);
    }

    @Override
    public double getIntegrity() {
        return ((double) this.getResistance() / 1) * 100;
    }

    @Override
    public ArrayList<Position> shoot(ArrayList<Position> possiblePositions, Army playerWaiting) {
        ArrayList<Position> res = new ArrayList();
        for (Position p : possiblePositions) {
            if (Army.positionInArmy(p, playerWaiting)) {
                res.add(p);
            }
        }
        Random rand = new Random();
        ArrayList<Position> boatselect = new ArrayList();
        boatselect.add(res.get(rand.nextInt(res.size())));
        return boatselect;
    }
}

//    @Override
//    public int shootRange() {
//        int rand = probability();
//        if (rand > 0 && rand <= 50) {
//            return 0;
//        } else if (rand > 50 && rand <= 80) {
//            return 1;
//        } else {
//            return 2;
//        }
//    }

