
public class Human {
public float weight,height;
public float BMI;

public float get_BMI()
{
	 BMI = (float) (weight / Math.sqrt(height));
	 
	 return BMI;
	}
}
