

//�w����Ӿ�ư}�C f[], g[], ���̪��������w�g�ۤp��j�Ʀn, �ӥB��Ӱ}�C���������U�ۤ��ۦP; Ĵ�p: f[] �� 1,3,4,7,9, g[] �� 3,5,7,8,10. �мg�@�{����X�o��Ӱ}�C�����������h�ֲլۦP�����. �H�W�ҦӨ�:f[2], g[1] ���� 3, �O�Ĥ@��. f[4], g[3] ���� 7, �O�ĤG��.
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f[] = { 1, 3, 4, 7, 9 };
		int g[] = { 3, 5, 7, 8, 10 };
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < g.length; j++) {
				if (f[i]==g[j]) {
					System.out.println("f["+i+"], g["+j+"]����"+f[i]);
				}
			}
		}
	}

}
