
public class Apartment extends Residential {
	
	private int numRentalUnits;
	private double avgUnitSize;
	private boolean parkingAvailable = true;
	
	public Apartment() {
		this.numRentalUnits = 0;
		this.avgUnitSize = 0;
		this.parkingAvailable = false;
		
	}//end empty-argument constructor
	
	public Apartment(String projectName, String CompleteAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = "";
		this.completeAddress = "";
		this.occupancyGroup = "";
		this.subgroup = "";
		this.totalSquareFeet = 0;
		
	}//end preferred constructor
	
	public void draw() {
		
	}
	
	public String displayData() {
		return numRentalUnits;
		
	}

	public int getNumRentalUnits() {
		return numRentalUnits;
	}

	public void setNumRentalUnits(int numRentalUnits) {
		this.numRentalUnits = numRentalUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	@Override
	public String toString() {
		return "Apartment [numRentalUnits=" + numRentalUnits + ", avgUnitSize=" + avgUnitSize + ", parkingAvailable="
				+ parkingAvailable + "]";
	}
	
	

}
