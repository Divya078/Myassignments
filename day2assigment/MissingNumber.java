package week1.day2assigment;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,2,3,4,7,6,8};
int n = arr.length + 1;
int sum = (n*(n+1))/2;
for(int i = 0; i<arr.length; i++) {
	sum = sum - arr[i];
}
	System.out.println("Missing number is " + sum);}

}
