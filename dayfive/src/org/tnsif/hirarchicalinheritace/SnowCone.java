package org.tnsif.hirarchicalinheritace;
//child class
public class SnowCone extends Android {
	
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}

	public SnowCone(String brandname,String slotType,int version) {
		super(brandname,slotType);
		this.version = version;
	}
	
	
	

}
