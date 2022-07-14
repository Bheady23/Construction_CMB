
public class SingleFamilyHome extends Residential{

	//instance variables
	private boolean garage;
	private String clothes;
	private String garagepark;
	//end instance variables
	
	//constructors
	public SingleFamilyHome() {
		
		super();
		garage=false;
	}//end empty argument constructor

	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup, numBedrooms, numBathrooms, 
				laundryRoom);
		this.garage=garage;
	}//end preferred constructor
	//end constructors
	
	//getters and setters
	public boolean isGarage() {
		return garage;
	}//end isGarage

	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage
	//end getters and setters
	
	
	//methods
	 public void draw() {
			
		System.out.println("Drawing Code for <<SingleFamilyHome>>");
	}//end draw method
		
	public String displayData() {
		
		if (laundryRoom==true)
			clothes="Y";
		else clothes="N";
		
		if (garage==true)
			garagepark="Y";
		else garagepark="N";
			
		return "Project Name: "+projectName+"\n\n"+"Address: "+completeAddress+"\n\n"+"Square Feet: "+totalSquareFeet+"\n\n"
					+"Occupancy Group: "+occupancyGroup+"\n\n"+"Occupancy Subgroup: "+subGroup+"\n\n"+"Number of Bedrooms: "+numBedrooms+
					"\n\n"+"Number of Bathrooms: "+numBathrooms+"\n\n"+"Does it have a Laundry room: "+clothes+"\n\n"+
					"Does it have a Garage: "+garagepark;
	}//end displayData method

	@Override
	public String toString() {
			
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms="
					+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName
					+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet
					+ ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup + "]";
	}//end toString method
	//end methods
			
}//end class
