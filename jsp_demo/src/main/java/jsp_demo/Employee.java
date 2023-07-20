package jsp_demo;

public class Employee {
	private String name;
	private int rolno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRolno() {
		return rolno;
	}
	public void setRolno(int rolno) {
		this.rolno = rolno;
	}
	public Employee(String name, int rolno) {
		super();
		this.name = name;
		this.rolno = rolno;
	}
	

}
