package olympicGames;

/**
 * Represents an Olympic medal that can be awarded to athletes.
 * Manages the type (gold, silver, bronze) of the medal.
 */
public class Medal {
    
    /**
     * Enumeration of possible medal types in Olympic Games.
     * GOLD - First place
     * SILVER - Second place 
     * BRONZE - Third place
     */
    public static enum Type {
        GOLD, SILVER, BRONZE;
    } 

    // The type of this medal (gold, silver or bronze)
    private Type type;

    /**
     * Creates a new Medal of the specified type.
     * @param type The type of medal (GOLD, SILVER or BRONZE)
     */
    public Medal(Type type) {
        this.type = type;
    }

    /**
     * Gets the type of this medal.
     * @return The medal type
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the type of this medal.
     * @param type The new medal type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Returns a string representation of the medal.
     * @return String containing the medal type
     */
    public String toString() {
        return "Medal {" + "type=" + type + '}';
    }
}
