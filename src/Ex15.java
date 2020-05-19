

//已知兩個整數陣列 f[], g[], 它們的元素都已經自小到大排好, 而且兩個陣列的元素都各自不相同; 譬如: f[] 有 1,3,4,7,9, g[] 有 3,5,7,8,10. 請寫一程式算出這兩個陣列彼此之間有多少組相同的資料. 以上例而言:f[2], g[1] 均為 3, 是第一組. f[4], g[3] 均為 7, 是第二組.
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f[] = { 1, 3, 4, 7, 9 };
		int g[] = { 3, 5, 7, 8, 10 };
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < g.length; j++) {
				if (f[i]==g[j]) {
					System.out.println("f["+i+"], g["+j+"]均為"+f[i]);
				}
			}
		}
	}

}
