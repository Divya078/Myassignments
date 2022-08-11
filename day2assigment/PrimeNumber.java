package week1.day2assigment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=13;
boolean flag=true;
for (int i = 2; i <n; i++) {
	if(n%i==0)
	{flag=false;
	break;
	}}

	if(flag==true) {
	System.out.println("Prime");}

	else {
		System.out.println("not a prime");
}
	}

}
