package cmsc_203_Assignment_2_Package;

public class Procedure {
	private String procedureName;
	private String procedureDate;
	private String practitioner;
	private double charges;
	
	public Procedure() {
		procedureName="";
		procedureDate="";
		practitioner="";
		charges=0.0;
	}
	
	public Procedure(String name, String date) {
		this.procedureName=name;
		this.procedureDate=date;
		
	}
	
	public Procedure(String name, String date, String practitioner, double charges) {
		this.procedureName=name;
		this.procedureDate=date;
		this.practitioner=practitioner;
		this.charges=charges;
	}
	
	public String getProcedureName() {
		return procedureName;
	}
	
	public String getProcedureDate() {
		return procedureDate;
	}
	
	public String getPractitioner() {
		return practitioner;
	}
	
	public double getCharges() {
		return charges;
	}
	
	public void setProcedureName(String procedureName ) {
		this.procedureName=procedureName;
	}
	
	public void setProcedureDate(String procedureDate ) {
		this.procedureDate=procedureDate;
	}
	
	public void setPractitioner(String practitioner ) {
		this.practitioner=practitioner;
	}
	
	public void setCharges(double charges) {
		this.charges=charges;
	}
	
	public String toString() {
		return "Procedure Name: " + procedureName + 
				"\nProcedure Date: " + procedureDate + 
				"\nPractitioner: "	+ practitioner + 
				"\nCharges: $ " + String.format("%.2f", charges); 
	}
	
	
	
}
