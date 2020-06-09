
public class BuildObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human bill = new Human();

		bill.height = 191;
		bill.weight = 75;
		double bmi = bill.get_BMI();

		System.out.println("身高: " + bill.height);
		System.out.println("體重: " + bill.weight);
		System.out.println("Bmi: " + bmi);
	}

}
