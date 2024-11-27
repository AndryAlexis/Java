package olympicGames;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an athlete participating in Olympic Games.
 * Manages athlete's personal information and medals won.
 */
public class Athlete {
    // Name of the athlete
    private String name;
    // Country the athlete represents
    private Country country;
    // List of medals won by this athlete
    private List<Medal> medals = new ArrayList<>();

    /**
     * Creates a new Athlete with the specified name and country.
     * @param name The name of the athlete
     * @param country The country the athlete represents
     */
    public Athlete(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    /**
     * Adds a medal to the athlete's collection.
     * @param medal The medal to add
     */
    public void addMedal(Medal medal) {
        medals.add(medal);
    }

    /**
     * Gets the name of the athlete.
     * @return The athlete's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the athlete.
     * @param name The new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the country this athlete represents.
     * @return The athlete's country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the country this athlete represents.
     * @param country The new country
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * Gets the list of medals won by this athlete.
     * @return List of medals
     */
    public List<Medal> getMedals() {
        return medals;
    }

    /**
     * Sets the list of medals for this athlete.
     * @param medals The new list of medals
     */
    public void setMedals(List<Medal> medals) {
        this.medals = medals;
    }

    /**
     * Returns a string representation of the athlete.
     * @return String containing athlete's name, country and number of medals
     */
    public String toString() {
        return "Athlete {" + "name='" + name + '\'' + ", country=" + country.getName() + ", medals=" + medals + '}';
    }
}
