package cmsc_203_Assignment_2_Package;
import java.util.*;

public class PatientDriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String first =sc.nextLine();
		
		System.out.println("Enter Middle Name: ");
		String middle =sc.nextLine();
		
		System.out.println("Enter Last Name: ");
		String last =sc.nextLine();
		
		System.out.println("Enter Street Address: ");
		String streetAddress =sc.nextLine();
		
		System.out.println("Enter City: ");
		String city =sc.nextLine();
		
		System.out.println("Enter State: ");
		String state =sc.nextLine();
		
		System.out.println("Enter ZIP: ");
		String zip =sc.nextLine();
		
		System.out.println("Enter Phone: ");
		String phone =sc.nextLine();
		
		System.out.println("Enter Emergency Contact Name: ");
		String emergencyContactName =sc.nextLine();
		
		System.out.println("Enter Emergency Contact Phone: ");
		String emergencyContactPhone =sc.nextLine();
		
		Patient patient=new Patient(first, middle, last, streetAddress, city, state, zip, phone, emergencyContactName, emergencyContactPhone);
		
		Procedure[] procedures = new Procedure[3];
		
		for(int i=0; i<procedures.length;i++) {
			System.out.println("\nEnter info for Procedure " + (i+1));
			System.out.print("Procedure Name: ");
			String pName=sc.nextLine();
			
			System.out.print("Procedure Date: ");
			String pDate=sc.nextLine();
			
			System.out.print("Practitioner: ");
			String practitioner=sc.nextLine();
			
			System.out.print("Charges: ");
			double charge = Double.parseDouble(sc.nextLine());
			procedures[i]= new Procedure(pName, pDate, practitioner, charge);
			
			System.out.println("\n-----------------");
			System.out.println("The Patient Information are as follows");
			System.out.println(patient);
			double total=0.0;
			for(Procedure p : procedures) {
				if(p!=null) {
					System.out.println("\n" + p);
					total+=p.getCharges();
				}
			}
			
			System.out.printf("\n Total Charges: $%.2f\n", total);
			
		}
		sc.close();
	}

}
