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


public class Student_test2 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setMajor("��ǻ���������а�");
		s.setStudentNum(20160746);
		
		System.out.println("�а�:"+s.getMajor());
		System.out.println("�й�:"+s.getStudentNum());
	}

}
