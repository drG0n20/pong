package rpg_text_game;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //Game variables
        String[] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        //Player variables
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50; //Percentage

        boolean ruuning = true;

        System.out.println("Welcome to the Dungeone");

        GAME:
        while (ruuning) {
            System.out.println("---------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + "appeared! #\n");

            while (enemyHealth > 0) {
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would You like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink a Bear");
                System.out.println("\t3. Run!!!!");

                String input = in.nextLine();
                if (input.equals("1")) {
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;
                } else if (input.equals("2")) {

                } else if (input.equals("3")) {

                }
            }
        }
    }
}
