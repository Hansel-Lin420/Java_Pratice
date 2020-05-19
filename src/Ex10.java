

public class Ex10 {
//給定一個陣列，計算這個陣列的總和並找出這個陣列中的最大值與最小值。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data []= {7,5,8,13,4};
		int sum=0;
		int min=data[0];
		int max=0;
		for(int i = 0 ;i<5;i++) {
			sum=sum+data[i];
		}
		System.out.println("sum"+sum);
	
	for(int i = 0 ;i<5;i++) {
		if(max<data[i]) {
			max=data[i];
		}
	
	if(min>data[i]) {
		min=data[i];
	}
}
	System.out.println("max:"+max);
	System.out.println("min:"+min);
}
}
