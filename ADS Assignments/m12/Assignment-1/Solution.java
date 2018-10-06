import java.util.Scanner;
import java.util.Arrays;
class Student {
	private String Studentname;
	private String Dateofbirth;
	private int subj1marks;
	private int subj2marks;
	private int subj3marks;
	private int totalmarks;
	private String ReservationCategory;
	private int noofstudents;
	private int noofvacncies;
	private int noofunreserved;
	private int noSC;
	private int noBC;
	private int noST;

	Student(String Sname, String DOB, int sub1marks, int sub2marks, int sub3marks, int totalmark, String ReservationCat, int nostudents, int novacncies, int nounreserved, int noSC, int noBC, int noST) {
		this.Studentname = Sname;
		this.Dateofbirth = DOB;
		this.subj1marks = sub1marks;
		this.subj2marks = sub2marks;
		this.subj3marks = sub3marks;
		this.totalmarks = totalmark;
		this.ReservationCategory = ReservationCat;
		this.noofstudents = nostudents;
		this.noofvacncies = novacncies;
		this.noofunreserved = nounreserved;
		this.noSC = noSC;
		this.noBC = noBC;
		this.noST = noST;
	}
	public String getSname() {
		return this.Studentname;
	}
	public String getDOB() {
		return this.Dateofbirth;
	}
	public int getsub1marks() {
		return this.subj1marks;
	}
	public int getsub2marks() {
		return this.subj2marks;
	}
	public int getsub3marks() {
		return this.subj3marks;
	}
	public int gettotalmark() {
		return this.totalmarks;
	}
	public String ReservationCat() {
		return this.ReservationCategory;
	}
	public int getnostudents() {
		return this.noofstudents;
	}
	public int getnovacncies() {
		return this.noofvacncies;
	}
	public int getnounreserved() {
		return this.noofunreserved;
	}
	public int getnoSC() {
		return this.noSC;
	}
	public int getnoBC() {
		return this.noBC;
	}
	public int getnoST() {
		return this.noST;
	}
}
class Sort {
	int[] aux;
	int[] a;
	public void sort(int[] a) {
		aux = new int[a.length];
		sort(a, 0, a.length - 1);
	}
	public void sort(int[] a, int l, int h) {
		if (h <= l) {
			return;
		}
		int mid = l + (h - l) / 2;
		sort(a, l, mid);
		sort(a, mid + 1, h);
		merge(a, l, mid, h);
	}
	public void merge(int[] a, int l, int mid, int h) {
		int i = l;
		int j = mid + 1;
		System.out.println(j);
		for (int m = 0; m <= h; m++) {
			aux[m] = a[m];
		}
		for (int k = 0; k <= h; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > h) {
				a[k] = aux[i++];
			} else if(less(aux[j], aux[i])) {
				a[k] = aux[j++];
			} else {
				a[k]= aux[i++];
			}
		}
	}
	public boolean less(int i, int j) {
		return j > i;
	}
	public String toString() {
		System.out.println(Arrays.toString(a));
		return "";
	}
}
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Insertion ns = new Insertion();
		int nostudents = sc.nextInt();
		int novacncies = sc.nextInt();
		int nounreserved = sc.nextInt();
		int noSC = sc.nextInt();
		int noBC = sc.nextInt();
		int noST = sc.nextInt();

		}
	}