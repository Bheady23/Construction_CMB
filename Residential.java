
public class Residential extends Building{
	
	//instance variables
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	private String clothes;
	//end instance variables
	
	//constructors
	public Residential() {
		numBedrooms=0;
		numBathrooms=0;
		laundryRoom=false;
	}//end empty argument constructor

	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.numBedrooms=numBedrooms;
		this.numBathrooms=numBathrooms;
		this.laundryRoom=laundryRoom;
	}//end preferred constructor
	//end constructors
	
	//getters and setters
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms

	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms

	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryroom
	//end getters and setters
	
	//methods
	public void draw() {
		
		System.out.println("Drawing Code for <<Residential>>");
	}//end draw method
	
	public String displayData() {
		
		if (laundryRoom==true)
			clothes="Y";
		else clothes="N";
		
		return "Project Name: "+projectName+"\n\n"+"Address: "+completeAddress+"\n\n"+"Square Feet: "+totalSquareFeet+"\n\n"
				+"Occupancy Group: "+occupancyGroup+"\n\n"+"Occupancy Subgroup: "+subGroup+"\n\n"+"Number of Bedrooms: "+numBedrooms+
				"\n\n"+"Number of Bathrooms: "+numBathrooms+"\n\n"+"Does it have a Laundry room: "+clothes;
	}//end displayData method

	@Override
	public String toString() {
		
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup="
				+ subGroup + "]";
	}//end toString Method
	//end methods
	
	
}//end class
