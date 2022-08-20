package week3day1asmnt;

public class Department extends Students{
public void getStudentInfo(){
	super.getStudentsInfo(0);}
public static void main(String[] args) {
	Department call = new Department();
	call.getStudentsInfo(12345);
	call.getStudentsInfo("Divya");
}
}


