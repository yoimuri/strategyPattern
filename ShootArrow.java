package strategyPattern;

public class ShootArrow implements AttackStrategy {
    public void attack() {
        System.out.println("Shooting an arrow!");
    }
}