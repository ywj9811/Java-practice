package practice;
//���� ������� ������Ҹ� ��ġ�ϸ� ��ġ�� �Ǵ�.
public class pr_2_3 {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 5, 3, 4};
		int arr2[] = {1, 3, 2, 5, 4};
		int t = 2;
		
		for(int i = 0; i < arr1.length; i++) {
			
			for(int j = 0; j < arr1.length; j++) {
				if(arr1[i] == arr2[j]) {
					t = 1;
					break;
				}
				else {
					if(j == arr1.length-1) {
						t = 0;
						break;
					}
					else
						continue;
				}
			}
			
			for(int j = 0; j < arr1.length; j++) {
				if(arr2[i] == arr1[j]) {
					t = 1;
					break;
				}
				else {
					if(j == arr2.length-1) {
						t = 0;
						break;
					}
					else
						continue;
				}
			}
		
			if(t == 1) {
				if(i == arr1.length-1) {
					System.out.println("����.");
					break;
				}	
				else
					continue;
			}
			else {
				System.out.println("�ٸ���");
				break;
			}
		}
	}
}