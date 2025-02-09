package strategyPattern;

public class Wizard extends Character {
    public Wizard() {
        super(new CastSpell(), new CreateBarrier());
    }
}