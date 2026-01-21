package edu.adse2501.sess01_java_util_apis;

import edu.adse2501.classes.Student;
import edu.adse2501.util.Spacer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Java class that demonstrate some of the concrete classes that implement
 * the list interface from the java.util package and some of its methods
 * 
 * @author todoi
 */
public class ListDemo
{
    public static void main(String[] args)
    {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apples");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Watermelon");
        fruits.add("Passion Fruits");
        fruits.add("Dragon Fruits");
        fruits.add("Strawberries");
        fruits.add("PawPaw");
        fruits.add("Guavas");
        fruits.add("Kiwi");
        fruits.add("Pineapple");
        fruits.add("Blueberries");
        fruits.add("Cranberries");
        fruits.add("Raspberries");
        fruits.add("Peaches");
        fruits.add("Pommogranate");
        fruits.add("Avocados");
        fruits.add("Tomatoes");
        fruits.add("Sweet Melon");
        
        //Display the above fruits using a for loop
        for (String fruit:fruits)
            System.out.println(fruit);
        
        //Create a list of students from the class package
        List<Student> javaStudents = new ArrayList<>();
        
        //Enroll students to the java class
        javaStudents.add(new Student("EICN-0001", "Java Professional "
                + "Programming", "Zamzam Ali", LocalDate.of(2004,11,06), 'F', 
                "Kenyan"));
        javaStudents.add(new Student("EICN-0002", "Java Professional "
                + "Programming", "Fatima Adan", LocalDate.of(2003,5,15), 'F', 
                "Kenyan"));
        javaStudents.add(new Student("EICN-0003", "Java Professional "
                + "Programming", "Victor Kiprotich", LocalDate.of(2005,9,23), 
                'M', "Kenyan"));
        javaStudents.add(new Student("EICN-0004", "Java Professional "
                + "Programming", "Adan Mbarak", LocalDate.of(2004,10,10), 'M', 
                "Kenyan"));
        javaStudents.add(new Student("EICN-0005", "Java Professional "
                + "Programming", "Joel Kahuri", LocalDate.of(2000,11,10), 'M', 
                "Kenyan"));
        javaStudents.add(new Student("EICN-0007", "Java Professional "
                + "Programming", "Elizabeth Otieno", LocalDate.of(2004,10,10), 
                'F', "Kenyan"));
        javaStudents.add(new Student("EICN-0008", "Java Professional "
                + "Programming", "Peter Odhiambo", LocalDate.of(2001,07,06), 
                'M', "Kenyan"));
        javaStudents.add(new Student("EICN-0009", "Java Professional "
                + "Programming", "Stephen Muema", LocalDate.of(1990,11,25), 
                'M', "Kenyan"));
        javaStudents.add(new Student("EICN-0010", "Java Professional "
                + "Programming", "Reuben Kamau", LocalDate.of(2003,3,15), 'F', 
                "Kenyan"));
        
        Spacer.separator();
        System.out.println("Java Professional Programming Students");
        //Display the details of the above students
        for(Student student : javaStudents)
        {
            System.out.println(student.toString());
        }
        
        //2 students drop from the class
        javaStudents.remove(1);
        javaStudents.remove(6);
        
        //Display the number of students left in the class
        System.out.println("After the 2nd and 7th students dropped, the class " 
                + "has " + javaStudents.size() +" students.");
        
        //Enroll 3 new students
        javaStudents.add(new Student("EICN-0011", "C# Programming", 
                "Sheila Josiah", LocalDate.of(1993,8,04), 'F', "Uganda"));
        javaStudents.add(new Student("EICN-0012", "Python Machine Learning", 
                "Noor Gupta", LocalDate.of(2004,06,14), 'F', "India"));
        javaStudents.add(new Student("EICN-0013", "Java Professional Programming", 
                "Tracy Chapman", LocalDate.of(2000,10,26), 'F', "South Africa"));
        
        //Display the student details using an iterator
        Spacer.separator();
        System.out.println("The final list of students is");
        Iterator<Student> stud = javaStudents.iterator();
        int n = 0;
        while(stud.hasNext())
        {
            System.out.println("Displaying the details for student: " + (n + 1));
            System.out.println(stud.next().toString());
            n++;
        }
        
        //Display the final size of the students in the class
        System.out.println("The final number of students after dropout and new" 
                + " enrollment is " + javaStudents.size());
    }
}
