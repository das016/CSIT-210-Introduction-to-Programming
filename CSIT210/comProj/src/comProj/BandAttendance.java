package comProj;

/** [This section of code should be in every one of your Java submissions]
* Daveed A. Sumpter [su1189596@email.ccbcmd.edu]
* 11 February 2025
* Overview: CSIT 210: LAB 2
* Objective: Write a Java program that prints a table with a list of at least 5 band's attendance with their total attendance (venue 1, venue 2, and the total) in the format below.
* @version: 1.0 1.27.2025
*/

public class BandAttendance {

	public static void main(String[] args) {
		/** This Java program prints a table with a list of at least 5 band's attendance with their total attendance (venue 1: Las Vegas, venue 2: Boston, and the Total) in the format below.*/
		
		System.out.println("//////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("|=\t  Band Attendance\t=|");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////");

		System.out.println("Name\t\t" + "Las Vegas\t\t" + "Boston\t\t" + "Total");

		System.out.println("----\t\t" + "-------\t\t" + "\t----\t\t" + "----");

		System.out.println("Bruno Mars\t" + "63,000\t" + "\t\t73,000\t" + "\t63,000 + 73,000 = 136,000");      
		System.out.println("Beyonce\t" + "\t60,000\t" + "\t\t100,000\t" + "\t60,000 + 100,000 = 160,000");
		System.out.println("Maroon 5\t" + "45,000\t" + "\t\t60,000\t" + "\t45,000 + 60,000 = 105,000");
		System.out.println("Green Day\t" + "50,000\t" + "\t\t55,000\t" + "\t50,000 + 55,000 = 105,000");
		System.out.println("Coldplay\t" +  "62,500\t" + "\t\t71,500\t" + "\t62,500 + 71,500 = 134,000");
	}
}
