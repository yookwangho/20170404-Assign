



public class Student {
	String major;
	Integer StudentNum;
	public static void main(String[] args) {
		Student s = new Student();
		s.major="컴퓨터정보공학과";
		s.StudentNum=20160746;
		
		System.out.println("학과:"+s.major);
		System.out.println("학번:"+s.StudentNum);
	}

}
