

public class Ex10 {
//���w�@�Ӱ}�C�A�p��o�Ӱ}�C���`�M�ç�X�o�Ӱ}�C�����̤j�ȻP�̤p�ȡC
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
