package comProj;

import java.util.Scanner;

public class SphereDemo {
    //This is the Driver Class.
    public static void main(String[] args) {

        //Instantiate 3 spheres with ID of s0, s2, s3.
        Sphere sphere1 = new Sphere("s0"); //Sphere1 will have an id s0.
        Sphere sphere2 = new Sphere("s2"); //Sphere2 will have an id s2.
        Sphere sphere3 = new Sphere("s3"); //Sphere3 will have an id s3.
        
        //Prompt user to enter the radius of all three.
        Scanner scan = new Scanner(System.in); //Creates a Scanner object to obtain input from the user.

        System.out.print("Please enter the radius of sphere1: ");
        sphere1.setRadius(scan.nextDouble());

        System.out.print("Please enter the radius of sphere2: ");
        sphere2.setRadius(scan.nextDouble());

        System.out.print("Please enter the radius of sphere3: ");
        sphere3.setRadius(scan.nextDouble());

        //Print Sphere1 details
        System.out.println("\nsphere1 " + sphere1);
        System.out.println("sphere1 area: " + sphere1.calculateArea());
        System.out.println("sphere1 volume: " + sphere1.calculateVolume() + "\n");

        //Print Sphere2 details
        System.out.println("sphere2 " + sphere2);
        System.out.println("sphere2 area: " + sphere2.calculateArea());
        System.out.println("sphere2 volume: " + sphere2.calculateVolume() + "\n");

        //Print Sphere3 details
        System.out.println("sphere3 " + sphere3);
        System.out.println("sphere3 area: " + sphere3.calculateArea());
        System.out.println("sphere3 volume: " + sphere3.calculateVolume());
    }
}
