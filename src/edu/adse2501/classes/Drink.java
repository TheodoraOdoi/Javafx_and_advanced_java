package edu.adse2501.classes;

import java.time.LocalDate;

/**
 *
 * @author user
 */
public class Drink {
    protected String name;
    protected float volume;

    public Drink(String apple_Juice, float par, String apple, LocalDate plusDays) { 
        this.name = ""; 
        this.volume = 0.0f; 
    }

    public Drink(String name, float volume) {
        this.name = name;
        this.volume = volume;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the volume
     */
    public float getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(float volume) {
        this.volume = volume;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return String.format("""
                             Drink Details
                             --------------------------------------------------
                             Name: %s
                             Volume in Liters: %.2f
                             --------------------------------------------------
                             """, this.getName(), this.getVolume());
    }
}

