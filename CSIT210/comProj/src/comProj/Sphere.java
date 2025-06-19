package comProj;

//[This section of code should be in every one of your Java submissions]
 //Daveed A. Sumpter [su1189596@email.ccbcmd.edu]
// Overview: CSIT 210: LAB 6
// Objective: Design and implement a class called Sphere with two instant variables that
//represents the radius, and an ID. Instant variable should enforce the
//encapsulation.
//Besides the getters and setters, the class should have these methods as well:
//Volume: calculates the volume of the shape
//Area: calculates the surface area of the shape
//toString: generates an appropriate string to provide the id and radius of the
//instance
//In driver class instantiate 3 spheres with ID of s0, s2, s3. Prompt the user to
//enter the radius of all three. Then print the area and volume.
//Input: None
 //Output: Text Display * Variables: None
 //Plan:
// 1. [Step 1: Methods needed: 1.) calculateVolume()----->will calculate volume of shape.      2.) calculateArea()-------> will calculate surface area of shape.      3.) toString() ------>
 //2. [In the class called Sphere, I need two instant variables: 1.) private Radius     2.) private ID]
 //3. Define Getters: The Getters will retrieve the private variables Radius and ID from a class by using the functions: getRadius() and getID()
 //4. Define Setters: Used to set data in variables. My setters are: setRadius() and setID()
 //5. Methods needed in my program: 1.) calculateVolume() to calculate the volume of shape.  2.) calculateArea() to calculate surface area of shape.   3.) toString()
 //6. In Driver Class, I must: 
 //                  1.) Instantiate 3 spheres with ID of s0, s2, s3.   
 //                  2.) Prompt user to enter radius for each sphere object.
 //                  3.) Calculate area and print.
 //                  4.) Calculate volume and print.

public class Sphere {
    private String id;         //Declare variable id using the private keyword.
    private double radius;
    private double volume;
    private double area;    //Declare variables radius, volume, area using the private keyword.

    //This is a constructor and it initializes a Sphere object with a name.
    public Sphere(String id) {
        this.id = id;
    }

    //Define Getters in order to get data from a private variable from a class.
    //The following Getters will retrieve the private variables: radius and ID.
    public double getRadius() {
        return radius;
    } 

    public String getId() {
        return id; 
    }

    //Define Setters in order to set the data in variables.
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void setID(String id) {
        this.id = id;
    }

    //Calculate volume of sphere: V = 4/3πr^3
    public double calculateVolume() {
        volume = (4.0/3.0) * Math.PI * Math.pow(this.radius, 3);
        return volume;
    }
    
    //Calculate Area of sphere: A = 4πr^2
    public double calculateArea() {
        area = 4.0 * Math.PI * Math.pow(this.radius, 2);
        return area;
    }

    //Generates an appropriate string to provide the id and radius of the instance
    @Override
    public String toString() {
        String idAndRadius = "ID: " + id + ", Radius: " + radius;
        return idAndRadius;
    }

}
