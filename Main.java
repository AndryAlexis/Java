// Import required packages from olympicGames
import olympicGames.*;

/**
 * Main class to demonstrate the Olympic Games management system
 */
public class Main {
    public static void main(String[] args) {
        // Create a new country - Spain
        Country spain = new Country("Spain");

        // Create two athletes representing Spain
        Athlete juan = new Athlete("Juan", spain);
        Athlete ana = new Athlete("Ana", spain);

        // Create medals to award to athletes
        Medal goldMedal = new Medal(Medal.Type.GOLD);
        Medal silverMedal = new Medal(Medal.Type.SILVER);

        // Award medals to athletes
        juan.addMedal(goldMedal);  // Juan wins gold
        ana.addMedal(goldMedal);   // Ana wins gold
        ana.addMedal(silverMedal); // Ana also wins silver

        // Add athletes to Spain's roster
        spain.addAthlete(juan);
        spain.addAthlete(ana);

        // Display all the country's values
        System.out.println("\n Spain: " + spain);

        // Display all the athletes' values
        System.out.println("\n Spain's athletes: " + spain.getAthletes());

        // Display the total number of athletes
        System.out.println("\n Total number of athletes: " + spain.getAthletes().size());

        // Display all the medals' values
        System.out.println("\n Spain's athletes medals: " + spain.getAthletesMedals());

        // Display the total number of medals
        System.out.println("\n Total number of medals: " + spain.getAthletesMedals().size());
    }
}
