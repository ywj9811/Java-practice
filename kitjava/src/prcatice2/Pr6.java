package prcatice2;
class Movie {
	String name;
	String age;
	String sub;
	String open;
	String pro;
	String actor;
	String show;
	
	Movie(String a, String b, String c, String d, String e, String f, String g) {
		name = a;
		age = b;
		sub = c;
		open = d;
		pro = e;
		actor = f;
		show = g;
	}
	void show() {
		System.out.println("���� : " + name);
		System.out.println("��� : " + sub + " | " + age);
		System.out.println("���� : " + pro);
		System.out.println("�⿬ : " + actor);
		System.out.println("�ٰŸ� : " + sub);
		System.out.println("���� ������ : " + show);
	}
}
public class Pr6 {
	public static void main(String[] args) {
		Movie mv = new Movie("���� : ������ ���", "12���̻�", "����, ������ ã����...", "2022�� 1�� 26�� ����", "������", "���ϴ�, ��ȿ��, �̱���, �ǻ��", "1122489��");
		mv.show();
		System.out.println();
		Movie mv2 = new Movie("���� : ���� ���", "12���̻�", "����, ������ ã����...", "2022�� 1�� 26�� ����", "������", "���ϴ�, ��ȿ��, �̱���, �ǻ��", "1122489��");
		mv2.show();
	}
}
