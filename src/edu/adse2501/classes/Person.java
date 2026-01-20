package edu.adse2501.classes;

import java.time.LocalDate;

/**
 * The abstract class {@code Person} represents a person with common attributes
 * or properties such as names, birthdays, gender(binary) and nationality.
 * It provides a basic structure for its subclasses and includes getters &
 * setters for these attributes.
 * The class also defines an abstract method {@code getPersonRole} that must be 
 * implemented by any concrete class.
 * 
 * <p>This class can be extended by other classes that represent more specific 
 * types of persons or people (e.g. Student, Employee) by providing additional
 * attributes or behaviours.
 * </p>
 * 
 * @author todoi
 */
public abstract class Person
{
    /**
     * The person's full name(s)
     */
    protected String names;
    
    /**
     * The persons date of birth represented as a {@code LocalDate}
     */
    protected LocalDate birthDate;
    
    /**
     * The persons gender represented as a character(eg 'M'for male and 'F' for 
     * female)
     */
    protected char gender;
    
    /**
     * The persons nationality
     */
    protected String nationality;
    
    //==============================================
    //CONSTRUCTORS
    //==============================================
    /**
     * Default constructor for the {@code Person} class.
     * <p> Initializes the object with no specific values for the fields.
     * This constructor can be used for subclasses that will set values later
     * using the setters
     * <p>
     */
    public Person(){}
    
    /**
     * Parameterized constructor for the {@code Person} class.
     * 
     * @param names the person's full name(s).
     * @param birthDate the person's date of birth as a {@code LocalDate}.
     * @param gender the person's gender represented as a char.
     * @param nationality the person's nationality.
     */
    public Person(String names, LocalDate birthDate, char gender, String nationality)    
    {
        this.names = names;
        this.birthDate = birthDate;
        this.gender = gender;
        this.nationality = nationality;
    }

    //==============================================
    //GETTERS & SETTERS
    //==============================================
    /**
     * RETRIEVE THE PERSONS FULL NAME(s)
     * 
     * @return the persons full name(s)
     */
    public String getNames()
    {
        return names;
    }

    /**
     * Sets the persons full name
     * 
     * @param name sets the persons name as a string
     */
    public void setNames(String names)
    {
        this.names = names;
    }
    
    /**
     * Retrieve the persons full datE of birth
     * 
     * @return the persns date of birth as a {@code LocalDate}
     */
    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    /**
     * Sets the persons date of birth
     * 
     * @param LocalDate sets the persons birthdate as a {@code LocalDate}
     */
    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }

    /**
     * Retrieve the persons gender
     * 
     * @return  the persons gender as a char
     */
    public char getGender()
    {
        return gender;
    }

    /**
     * Sets the persons gender
     * 
     * @param gender sets the persons gender as a char ('M':Male, 'F':Female)
     */
    public void setGender(char gender)
    {
        this.gender = gender;
    }

    /**
     * Retrieve the persons nationality
     * 
     * @return  the persons nationality as a string
     */
    public String getNationality()
    {
        return nationality;
    }

    /**
     * Sets the persons nationality
     * 
     * @param nationality sets the persons nationality as a string
     */
    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }
    
    /**
     * Returns the role of the person(eg "Student", "Employee", "Customer").
     * Each subclass must provide its own role.
     * 
     * @return the role of the person as a string.
     */
    
    public abstract String getPersonRole();

    /**
     * Returns a formatted string representation of the person's details.
     * 
     * @return the person's details
     */
    @Override
    public String toString()
    {
        return String.format(
                "Role: %s" +
                "\nName(s): %s" +
                "\nBirth Date: %s" +
                "\nGender: %s" +
                "\nNationality: ",
                getPersonRole(),
                getNames(),
                birthDate,
                (getGender() == 'm' || getGender() == 'M') ? "Male":"Female",
                nationality
                   
        );
    }
    
}
