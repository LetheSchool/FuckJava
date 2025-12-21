package cyrenehoney.L8Q4;

public class GameOne extends DiceGame {
    
    public GameOne() {
        System.out.println("Starting Game 1");
    }

    @Override
    public void play() {
        var moveCount = 0;
        while (getScore() < 100) {
            moveCount++;
            var d1 = rollDice();
            int d2 = rollDice();
            var currentTurnScore = d1 + d2;

            System.out.printf("Turn %d: Rolled %d & %d. ", moveCount, d1, d2);

            while (d1 == d2) {
                System.out.print("Double");
                setScore(getScore() + currentTurnScore); 

                d1 = rollDice();
                d2 = rollDice();
                currentTurnScore = d1 + d2;
                System.out.printf("Rolled %d & %d. ", d1, d2);
            }

            setScore(getScore() + currentTurnScore);
            System.out.println("Total Score: " + getScore());
        }
        System.out.println("Final Score: " + getScore());
    }
}