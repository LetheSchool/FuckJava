package cyrenehoney.T8Q2;

import lombok.Getter;

@Getter
public class Organism {
    private int initialSize;
    private int growthRate;

    public Organism(int initialSize, int growthRate) {
        this.initialSize = initialSize;
        this.growthRate = growthRate;
    }
}
