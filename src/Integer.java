import java.util.Scanner;
public class Integer{
	public static void main(String[] args){
		Scanner myscanner = new Scanner(System.in);
		System.out.println("����һ������");
		int integer = myscanner.nextInt();
		if(integer > 0){
			System.out.println("����0");
		}
		else if(integer < 0){
			System.out.println("С��0");
		}
		else{
			System.out.println("����0");
		}
	}
}