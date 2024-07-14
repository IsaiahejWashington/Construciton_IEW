
public class Business extends Building {
	
	protected int numRentableUnits = 0;
	
	public Business() {
		this.numRentableUnits = 0;
		
		
	}//end empty-argument constructor
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = "";
		this.completeAddress = "";
		this.occupancyGroup = "";
		this.subgroup = "";
		this.totalSquareFeet = 0;
		
	}//end preferred constructor

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + "]";
	}
	
	
	
	
	
	

}
