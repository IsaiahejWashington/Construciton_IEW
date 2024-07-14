
public class Mall extends Business {
	
	private int numRentedUnits;
	private int numParkingSpaces;
	private double medianUnitSize;
	
	public Mall() {
		this.numRentedUnits = 0;
		this.numParkingSpaces = 0;
		this.medianUnitSize = 0;
		
	}//end empty-argument constructor
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = "";
		this.completeAddress = "";
		this.occupancyGroup = "";
		this.subgroup = "";
		this.totalSquareFeet = 0;
		
	}//end preferred constructor
	
	public void draw() {
		
	}
	
	public String displayData() {
		return null;
		
	}

}
