
public class Mall extends Business{
	
	//instance variables
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	//end instance variables
	
	//constructors
	public Mall() {
		super();
		numRentedUnits=0;
		medianUnitSize=0.0;
		numParkingSpaces=0;
	}//end empty argument constructor
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup, int numRentableUnits,int numRentedUnits,double medianUnitSize, int numParkingSpaces) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup, numRentableUnits);
		this.numRentedUnits=numRentedUnits;
		this.medianUnitSize=medianUnitSize;
		this.numParkingSpaces=numParkingSpaces;
	}//end preferred constructor
	//end constructors
	
	
	//getters and setters
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits
	
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits
	
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize
	
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize
	
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces
	
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces	
	//end getters and setters
	
	//methods
	public void draw() {
		System.out.println("Drawing Code for <<Mall>>");
	}//end draw method
	
	public String displayData() {
		
		return "Project Name: "+projectName+"\n\n"+"Address: "+completeAddress+"\n\n"+"Square Feet: "+totalSquareFeet+"\n\n"
				+"Occupancy Group: "+occupancyGroup+"\n\n"+"Occupancy Subgroup: "+subGroup+"\n\n"+"Number of Rentable units: "
				+numRentableUnits+"\n\n"+"Number of Rented Units: "+numRentedUnits+"\n\n"+"Median Size of Units: "
				+medianUnitSize+"\n\n"+"Number of Parking Spaces: "+numParkingSpaces;
	}//end displayData method

	@Override
	public String toString() {
		
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subGroup=" + subGroup + "]";
	}//end toString method
	//end methods
		

}//end class
