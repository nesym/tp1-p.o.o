package tp1;

public class point {
	private int abs;
	private int ord;
	void affiche() {
		System.out.println("abs = "+abs);
		System.out.println("ord = "+ord);
	}
	point(int a,int b){
		abs=a;
		ord=b;
	}
	point(int a){
		abs=a;
		ord=2*a;
	}
	void trht(int d) {
		abs+=d;
	}
	void trul(int d,int d1) {
		abs+=d;
		ord+=d1;
	}
	class test{
	public static void main(String[] args) {
		point p;
		p=new point(2,3);
		point p1=new point(2);
		p.affiche();
		p1.affiche();
		p.trht(5);
		p1.trul(1, 1);
		System.out.println("--------");
		p.affiche();
		System.out.println("--------");
		p1.affiche();

	}

}
}