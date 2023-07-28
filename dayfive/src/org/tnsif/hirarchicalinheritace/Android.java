package org.tnsif.hirarchicalinheritace;
//base class
public class Android {

	private String brandname;
	private String slotType;
	
	//getters and setters
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	
	
	@Override
	public String toString() {
		return "Android [brandname=" + brandname + ", slotType=" + slotType + ", toString()=" + super.toString() + "]";
	}
	
	
	public Android() {
		System.out.println("Android-details");
	}
	
	
	public Android(String brandname, String slotType) {
		super();
		this.brandname = brandname;
		this.slotType = slotType;
	}
	
	
	
}
