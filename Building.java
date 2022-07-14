
public class Building {

	//instance variables
	protected  String projectName;
	protected  String completeAddress;
	protected  double totalSquareFeet;
	protected  String occupancyGroup;
	protected  String subGroup;
	//end instance variables
	
	//constructors
	public Building() {
		projectName="";
		completeAddress="";
		totalSquareFeet=0.0;
		occupancyGroup="";
		subGroup="";
	}//end empty argument constructor
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
	}//end preferred constructor
	//end constructors
	
	
	//getters and setters
	public String getProjectName() {
		return projectName;
	}//end getProjectName

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName

	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupnacyGroup

	public String getSubGroup() {
		return subGroup;
	}//end getSubGroup

	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}//end setSubGroup
	//end getters and setters
	
	//methods
	public void draw() {
		System.out.println("Drawing Code for <<Building>>");
	}//end draw method
	
	public String displayData() {
		return "Project Name: "+projectName+"\n\n"+"Address: "+completeAddress+"\n\n"+"Square Feet: "+totalSquareFeet+"\n\n"
				+"Occupancy Group: "+occupancyGroup+"\n\n"+"Occupancy Subgroup: "+subGroup;
	}//end displayData method

	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup + "]";
	}//end toString method
	//end methods
	
	
}//end class
	
	
	
	
	
