package Model;

import java.util.ArrayList;

public class BigBoat extends Boat {

    public BigBoat() {
        super();
        super.setResistance(2);
        super.setCapacityMove(1);
        this.type = BoatType.BIG;
        super.setSHOOT20POURCENT(0);
        super.setSHOOT50POURCENT(2);
    }

    @Override
    public double getIntegrity() {
        return ((double) this.getResistance() / 2) * 100;
    }
    
    @Override
    public ArrayList<Position> shoot (ArrayList<Position> possiblePositions, Army playerWaiting){
         ArrayList<Position> res = new ArrayList();
        for (Position p : possiblePositions) {
            if (Army.positionInArmy(p, playerWaiting))
                     res.add(p);
        }
        return res;
    }   
    
//    @Override
//    public int shootRange() {
//        int rand = probability();
//        if (rand > 0 && rand <= 50) {
//            return 2;
//        } else if (rand > 50 && rand <= 80) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }

}
