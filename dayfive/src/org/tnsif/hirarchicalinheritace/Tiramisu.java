package org.tnsif.hirarchicalinheritace;

public class Tiramisu extends Android{
	
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}

	
	public Tiramisu(String brandname, String slotType,int version) {
		super(brandname, slotType);
		this.version=version;
		// TODO Auto-generated constructor stub
	}
	
	

}
