package olympicGames;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a country participating in Olympic Games.
 * Manages a list of athletes and their medals.
 */
public class Country {
    // Name of the country
    private String name;
    // List of athletes representing this country
    private List<Athlete> athletes = new ArrayList<>();

    /**
     * Creates a new Country with the specified name.
     * @param name The name of the country
     */
    public Country(String name) {
        this.name = name;
    }

    /**
     * Adds an athlete to represent this country.
     * @param athlete The athlete to add
     */
    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    /**
     * Removes the most recently added athlete from the country's roster.
     */
    public void removeLastAthlete() {
        athletes.remove(athletes.size() - 1);
    }

    /**
     * Gets the name of the country.
     * @return The country name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the country.
     * @param name The new country name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the list of athletes representing this country.
     * @return List of athletes
     */
    public List<Athlete> getAthletes() {
        return athletes;
    }

    /**
     * Sets the list of athletes representing this country.
     * @param athletes The new list of athletes
     */
    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    /**
     * Gets a list of all medals won by athletes from this country.
     * @return List of all medals won
     */
    public List<Medal> getAthletesMedals() {
        List<Medal> medals = new ArrayList<>();
        for (Athlete athlete : athletes) {
            medals.addAll(athlete.getMedals());
        }
        return medals;
    }

    /**
     * Returns a string representation of the country.
     * @return String containing country name and number of athletes
     */
    public String toString() {
        return "Country {" + "name='" + name + '\'' + ", athletes=" + athletes + '}';
    }
}
