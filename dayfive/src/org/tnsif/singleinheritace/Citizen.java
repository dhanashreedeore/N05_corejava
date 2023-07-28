package org.tnsif.singleinheritace;
//base class
public class Citizen {

	//private data members
	private String city;
	private int pincode;
	private long aadharNo;
	private long contactNo;
	
	//parameterized constructor
	public Citizen() {
		
		System.out.println("DefaultConstructor");
	}	
	
	public Citizen(String city,int pincode,long aadharNo,long contactNo) {
			super();
			// TODO Auto-generated constructor stub
			this.city=city;
			this.pincode=pincode;
			this.contactNo=contactNo;
			System.out.println("Prameterized Constructor");
		}
	
	  
	
	//getters and setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", aadharNo=" + aadharNo + ", contactNo=" + contactNo
				+ ", getCity()=" + getCity() + ", getPincode()=" + getPincode() + ", getContactNo()=" + getContactNo()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
