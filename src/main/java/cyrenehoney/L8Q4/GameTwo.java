package cyrenehoney.L8Q4;

public class GameTwo extends DiceGame {

    public GameTwo() {
        System.out.println("Starting Game 2");
    }

    @Override
    public void play() {
        var moveCount = 0;
        while (getScore() != 100) {
            moveCount++;
            var d1 = rollDice();
            var currentTurnScore = d1;

            System.out.printf("Turn %d: Rolled %d. ", moveCount, d1);

            if (d1 == 6) {
                System.out.print("6 rolling again");
                var d2 = rollDice();
                System.out.printf("Rolled %d. ", d2);

                if (d2 == 6) {
                    System.out.print("Double 6 hahahaha score 0");
                    currentTurnScore = 0;
                } else {
                    currentTurnScore += d2;
                }
            }

            if (getScore() + currentTurnScore > 100) {
                System.out.println("Score > 100, ignored.");
            } else {
                setScore(getScore() + currentTurnScore);
                System.out.println("Total Score: " + getScore());
            }
        }
        System.out.println("Total moves: " + moveCount);
    }
}