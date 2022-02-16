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
		System.out.println("제목 : " + name);
		System.out.println("요약 : " + sub + " | " + age);
		System.out.println("감독 : " + pro);
		System.out.println("출연 : " + actor);
		System.out.println("줄거리 : " + sub);
		System.out.println("누적 관객수 : " + show);
	}
}
public class Pr6 {
	public static void main(String[] args) {
		Movie mv = new Movie("해적 : 도깨비 깃발", "12세이상", "가자, 보물을 찾으러...", "2022년 1월 26일 개봉", "김정훈", "강하늘, 한효주, 이광수, 권상우", "1122489명");
		mv.show();
		System.out.println();
		Movie mv2 = new Movie("도적 : 헤작 깃발", "12세이상", "가자, 보물을 찾으러...", "2022년 1월 26일 개봉", "김정훈", "강하늘, 한효주, 이광수, 권상우", "1122489명");
		mv2.show();
	}
}
