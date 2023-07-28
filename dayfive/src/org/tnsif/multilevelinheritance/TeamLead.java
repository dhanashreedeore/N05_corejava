package org.tnsif.multilevelinheritance;

//child class
//parent class
public class TeamLead  extends Manager{
	
	//private data members
	private String leadname;
	private int emoID;
	private String projectName;
	
	//getters and setters
	public String getLeadname() {
		return leadname;
	}
	public void setLeadname(String leadname) {
		this.leadname = leadname;
	}
	public int getEmoID() {
		return emoID;
	}
	public void setEmoID(int emoID) {
		this.emoID = emoID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	@Override
	public String toString() {
		return "TeamLead [leadname=" + leadname + ", emoID=" + emoID + ", projectName=" + projectName + ", toString()="
				+ super.toString() + "]";
	}
	
	//parameterized constructor
	public TeamLead(String deptName, String name, int empid ,String leadName,int empID,String projectName) {
		super(deptName , name, empid);
		this.emoID=empID;
		this.leadname=leadName;
		this.projectName=projectName;
		
	}
	
	

	
	
}
