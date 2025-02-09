package strategyPattern;

public class CastSpell implements AttackStrategy {
    public void attack() {
        System.out.println("Casting a spell!");
    }
}