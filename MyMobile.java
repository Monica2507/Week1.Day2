package Week1.Day2;

public class MyMobile {
	
	public void makeCalls() {
		System.out.println("Make a call");

	}
	
	public void sendMsg() {
		System.out.println("Message is send");

	}
	private void payBills() {
		System.out.println("Pay bills");

	}
	
	public static void main(String[] args) {
		MyMobile myMob = new MyMobile();
		myMob.makeCalls();
		myMob.sendMsg();
		myMob.payBills();
	}

}
