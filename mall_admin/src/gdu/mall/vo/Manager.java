package gdu.mall.vo; //vo타입은 테이블과 동일하게 만듦

public class Manager {
	private int managerNo;
	private String managerId;
	private String managerPw;
	private String managerName;
	private String managerDate;
	private int managerLevel;
	public int getManagerNo() {
		return managerNo;
	}
	public void setManagerNo(int managerNo) {
		this.managerNo = managerNo;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerPw() {
		return managerPw;
	}
	public void setManagerPw(String managerPw) {
		this.managerPw = managerPw;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerDate() {
		return managerDate;
	}
	public void setManagerDate(String managerDate) {
		this.managerDate = managerDate;
	}
	public int getManagerLevel() {
		return managerLevel;
	}
	public void setManagerLevel(int managerLevel) {
		this.managerLevel = managerLevel;
	}
	
}