
public class SingleFamilyHome extends Residential {
	
	private boolean garage = true;
	
	public SingleFamilyHome() {
		this.garage = false;
		
	}//end empty-argument constructor
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = "";
		this.completeAddress = "";
		this.occupancyGroup = "";
		this.subgroup = "";
		this.totalSquareFeet = 0;
		
	}//end preferred constructor
	
	public void draw() {
		
	}
	
	public String displayData() {
		return completeAddress ;
		
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + "]";
	}
	
	

}
