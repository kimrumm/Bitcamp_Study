package dept;

// 부서정보를 저장하는 기능 클래스
// 사용자 입력 Date -> Dept
public class Dept {
	
	private int deptno; // 부서번호
	private String dname; // 부서이름
	private String loc; // 부서위치
	
	//생성자
	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		
		// getter,setter
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	//디버깅용
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	

}
