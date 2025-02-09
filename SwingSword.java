package strategyPattern;

public class SwingSword implements AttackStrategy {
    public void attack() {
        System.out.println("Attacking with a sword!");
    }
}