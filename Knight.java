package strategyPattern;

public class Knight extends Character {
    public Knight() {
        super(new SwingSword(), new Shield());  // Default strategies
    }
}