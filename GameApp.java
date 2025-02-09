package strategyPattern;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character player;

        System.out.println("Choose a character: (1) Knight, (2) Wizard, (3) Archer");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                player = new Knight();
                System.out.println("You chose: Knight");
                break;
            case 2:
                player = new Wizard();
                System.out.println("You chose: Wizard");
                break;
            case 3:
                player = new Archer();
                System.out.println("You chose: Archer");
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Knight.");
                player = new Knight();
        }

        if (player instanceof Knight) {
            System.out.println("\nChoose an attack strategy: (1) Swing Sword");
            int attackChoice = scanner.nextInt();
            if (attackChoice == 1) player.setAttackStrategy(new SwingSword());
        } else if (player instanceof Wizard) {
            System.out.println("\nChoose an attack strategy: (1) Cast Spell");
            int attackChoice = scanner.nextInt();
            if (attackChoice == 1) player.setAttackStrategy(new CastSpell());
        } else if (player instanceof Archer) {
            System.out.println("\nChoose an attack strategy: (1) Shoot Arrow");
            int attackChoice = scanner.nextInt();
            if (attackChoice == 1) player.setAttackStrategy(new ShootArrow());
        }

        if (player instanceof Knight) {
            System.out.println("\nChoose a defense strategy: (1) Shield, (2) Dodge, (3) Magic Barrier");
            int defenseChoice = scanner.nextInt();
            switch (defenseChoice) {
                case 1:
                    player.setDefenseStrategy(new Shield());
                    break;
                case 2:
                    player.setDefenseStrategy(new Dodge());
                    break;
                case 3:
                    player.setDefenseStrategy(new CreateBarrier());
                    break;
                default:
                    System.out.println("Invalid choice! Keeping default defense strategy.");
            }
        } else if (player instanceof Wizard) {
            System.out.println("\nChoose a defense strategy: (1) Magic Barrier");
            int defenseChoice = scanner.nextInt();
            if (defenseChoice == 1) player.setDefenseStrategy(new CreateBarrier());
        } else if (player instanceof Archer) {
            System.out.println("\nChoose a defense strategy: (1) Dodge");
            int defenseChoice = scanner.nextInt();
            if (defenseChoice == 1) player.setDefenseStrategy(new Dodge());
        }

        System.out.println("\nFinal Actions for " + player.getClass().getSimpleName() + ":");
        player.performAttack();
        player.performDefend();

        scanner.close();
    }
}