package Model;

import java.util.ArrayList;
import java.util.Random;

public abstract class Boat {

    private int capacityMove;
    private int resistance;
    private Position pos = null;
    BoatType type;
    Color col = Color.BLACK;
    private int SHOOT50POURCENT;
    private int SHOOT20POURCENT;

    public int shootRange() {
        int rand = probability();
        if (rand > 0 && rand <= 50) {
            return 0;
        } else if (rand > 50 && rand <= 80) {
            return 1;
        } else {
            return 2;
        }
    }
    
    public abstract  ArrayList<Position> shoot(ArrayList<Position> possiblePositions, Army playerWaiting);

    public int getSHOOT50POURCENT() {
        return SHOOT50POURCENT;
    }

    public void setSHOOT50POURCENT(int SHOOT50POURCENT) {
        this.SHOOT50POURCENT = SHOOT50POURCENT;
    }

    public int getSHOOT20POURCENT() {
        return SHOOT20POURCENT;
    }

    public void setSHOOT20POURCENT(int SHOOT20POURCENT) {
        this.SHOOT20POURCENT = SHOOT20POURCENT;
    }

    
    
    public abstract double getIntegrity();

    public int getCapacityMove() {
        return capacityMove;
    }

    public int getResistance() {
        return resistance;
    }

    public Position getPos() {
        return pos;
    }

    public BoatType getType() {
        return type;
    }

    public Color getCol() {
        return col;
    }

    public void setCapacityMove(int capaciteMove) {
        this.capacityMove = capaciteMove;
    }

    public void setResistance(int resistance) {
        this.resistance += resistance;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public void setCol(Color col) {
        this.col = col;
    }

    public int probability() {
        int res = new Random().nextInt();
        while (res < 0) {
            res = new Random().nextInt();
        }
        return (res % 100) + 1;
    }
}
