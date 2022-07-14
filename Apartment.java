
public class Apartment extends Residential{
	
	//instance variables
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	private String clothes;
	private String parking;
	//end instance variables 
	
	//constructors
	public Apartment() {
		super();
		numRentableUnits=0;
		avgUnitSize=0.0;
		parkingAvailable=false;
	}//end empty argument constructor

	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup, boolean laundryRoom, int numBedrooms, int numBathrooms, int numRentableUnits, 
			double avgUnitSize, boolean parkingAvailable) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}//end preferred constructor
	//end constructors

	//getters and setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//end isParkingAvailable

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable
	//end getters and setters
	
	//methods
	public void draw() {
		
		System.out.println("Drawing Code for <<Apartment>>");
	}//end draw method
	
	public String displayData() {
		
		if (laundryRoom==true)
			clothes="Y";
		else clothes="N";
		
		if (parkingAvailable==true)
			parking="Y";
		else parking="N";
		
		return "Project Name: "+projectName+"\n\n"+"Address: "+completeAddress+"\n\n"+"Square Feet: "+totalSquareFeet+"\n\n"
				+"Occupancy Group: "+occupancyGroup+"\n\n"+"Occupancy Subgroup: "+subGroup+"\n\n"+"Numer of Rentable Units: "
				+numRentableUnits+"\n\n"+"Average size of Unit: "+avgUnitSize+"\n\n"+"Number of Bedrooms: "+numBedrooms+
				"\n\n"+"Number of Bathrooms: "+numBathrooms+"\n\n"+"Does it have a Laundry room: "+clothes+"\n\n"+
				"Is Parking Available: "+parking;
	}//end displayData method

	@Override
	public String toString() {
		
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + "]";
	}//end toString method
	//end methods
	
	
}//end class
