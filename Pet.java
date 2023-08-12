/**
 * Represents a pet with name, age, location, and type.
 */
public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    public Pet() {
        // Empty constructor
    }

    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    // Get methods

    /**
     * Get the name of the pet.
     * @return The name of the pet.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the age of the pet.
     * @return The age of the pet.
     */
    public int getAge() {
        return age;
    }

    /**
     * Get the type of the pet.
     * @return The type of the pet.
     */
    public String getType() {
        return type;
    }

    // Set methods

    /**
     * Set the name of the pet.
     * @param name The new name of the pet.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the age of the pet.
     * @param age The new age of the pet.
     */
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }

    /**
     * Set the location of the pet.
     * @param location The new location of the pet.
     */
    public void setLocation(String location) {
        this.location = location;
    }
}
