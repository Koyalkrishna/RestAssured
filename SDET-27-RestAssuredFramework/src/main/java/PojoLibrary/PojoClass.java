package PojoLibrary;

public class PojoClass {
	public String createBy;
	public String ProjectName;
	public String status;
	public int teamsize;
	public PojoClass(String createBy, String projectName, String status, int teamsize) {
		super();
		this.createBy = createBy;
		ProjectName = projectName;
		this.status = status;
		this.teamsize = teamsize;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	

}
