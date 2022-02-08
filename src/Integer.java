import java.util.Scanner;
public class Integer{
	public static void main(String[] args){
		Scanner myscanner = new Scanner(System.in);
		System.out.println("输入一个整数");
		int integer = myscanner.nextInt();
		if(integer > 0){
			System.out.println("大于0");
		}
		else if(integer < 0){
			System.out.println("小于0");
		}
		else{
			System.out.println("等于0");
		}
	}
}