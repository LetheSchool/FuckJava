package cyrenehoney.L8Q4;

import lombok.Getter;
import lombok.Setter;
import java.util.Random;

@Getter @Setter
public abstract class DiceGame {
    protected int score;
    protected Random random;

    public DiceGame() {
        this.score = 0;
        this.random = new Random();
    }

    public int rollDice() {
        return random.nextInt(6) + 1;
    }

    public abstract void play();
}