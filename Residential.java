
public class Residential extends Building {
	
	protected int numBedrooms = 0 ;
	protected int numBathrooms = 0;
	protected boolean laundryRoom = true;
	
	public Residential() {
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
		
	}//end empty-argument constructor
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = "";
		this.completeAddress = "";
		this.occupancyGroup = "";
		this.subgroup = "";
		this.totalSquareFeet = 0;
		
	}//end preferred constructor
	
	

}
