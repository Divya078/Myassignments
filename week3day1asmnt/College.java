package week3day1asmnt;

public class College extends Students {

	

public static void main(String[] args) {
	College overrde = new College();
	overrde.getStudentsInfo(12345);
	overrde.getStudentsInfo("Divya");
	overrde.getStudentsInfo(12345, "9876543210");
	overrde.getStudentsInfo(12345, "divya@gmail.com");
}
}
