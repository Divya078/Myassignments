package week3day1asmnt;

public class Students {
public void getStudentsInfo(int Id) {
	System.out.println(" Student Id:"+Id);}

public void getStudentsInfo(String Name) {
	System.out.println(" Student Name:"+Name);}

public void getStudentsInfo(int Id, String EmailId) {
	System.out.println("email of "+Id+ ":" + EmailId);}

public void getStudentsInfo(int Id, long PhnNo) {
	System.out.println("Phone No. of "+Id+ ":" + PhnNo);}
	public static void main(String[] args) {
		Students Info = new Students();
			Info.getStudentsInfo(12345);
			Info.getStudentsInfo("Divya");
			Info.getStudentsInfo(12345, "divyasanthanam8@gmail.com");
			Info.getStudentsInfo(12345, "9876543210");
	}
}

