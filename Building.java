
public class Building {

	protected String projectName = "Gaines House";
	protected String completeAddress = "123 Main Street, Louisville, Kentucky 40201";
	protected String occupancyGroup = "Assembly, Business, Educational, Factory/Industrial, High Hazard, Institutional, Mercantile, Residential, Storage, Utility & Miscellaneous";
	protected String subgroup = "Groups A-1, A-2, A-3, A-4, & A-5, Group B, Group E, Groups F-1 & F-2, Groups H-1, H-2, H-3, H-4, & H-5, Groups I-1, I-2, I-3, & I-4, Group M, Groups R-1, R-2, R-3, & R-4, Groups S-1 & S-2, Group U";;
	protected double totalSquareFeet = 0;
	
	public Building() {

		this.projectName = "";
		this.completeAddress = "";
		this.occupancyGroup = "";
		this.subgroup = "";
		this.totalSquareFeet = 0;
		
	}//end empty-argument constructor
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
		this.totalSquareFeet= totalSquareFeet;
		
		
	}//end preferred constructor
	
	public void draw() {
		System.out.println();
	}
	
	public String displayData() {
		return completeAddress;
		
	}
	
	

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + ", totalSquareFeet=" + totalSquareFeet + "]";
	}
	
}
