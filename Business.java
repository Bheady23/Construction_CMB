
public class Business extends Building {
	
	//instance variables
	protected int numRentableUnits;
	//end instance variables

	//constructors
	public Business() {
		super();
		numRentableUnits=0;
	}//end empty argument constructor
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup, int numRentableUnits) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.numRentableUnits = numRentableUnits;
	}//end preferred constructor
	//end constructors
	
	//getters and setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end numRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits
	//end getters and setters
	

	//methods
	public void draw() {
		System.out.println("Drawing Code for <<Business>>");
	}//end draw method
	
	public String displayData() {
		return "Project Name: "+projectName+"\n\n"+"Address: "+completeAddress+"\n\n"+"Square Feet: "+totalSquareFeet+"\n\n" 
				+"Occupancy Group: "+occupancyGroup+"\n\n"+"Occupancy Subgroup: "+subGroup+"\n\n"+"Number of Rentable units: "
				+numRentableUnits;
	}//end displayData method

	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + "]";
	}//end toString method
	//end methods

	
}//end class
