class Student{
	private String major;
	private Integer StudentNum;
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Integer getStudentNum() {
		return StudentNum;
	}
	public void setStudentNum(Integer studentNum) {
		StudentNum = studentNum;
	}
}


public class Student_test {

	public static void main(String[] args) {
		Student s = new Student();
		s.setMajor("컴퓨터정보공학과");
		s.setStudentNum(20160746);
		
		System.out.println("학과:"+s.getMajor());
		System.out.println("학번:"+s.getStudentNum());
	}

}
