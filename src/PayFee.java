public class PayFee{
	public static void main(String[] args){
		int totalMoney = 100000;
		int count = 0;
		while(true){
			if(totalMoney > 50000){
			totalMoney -= totalMoney * 0.05;
			count++;
			}
			else if(totalMoney <= 50000 && totalMoney >=1000){
				totalMoney -= 1000;
				count++;
			}
			else{
				break;
			}
		}
		System.out.println(count);
	}
}