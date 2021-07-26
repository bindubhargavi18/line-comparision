package lines;
import java.util.*;
public class Comparision {
	public static void main(String args[]){
		System.out.println("Welcome to line comparision computation program");	
		int x1,x2,y1,y2,a,b;
		double len;
		System.out.println("enter points of a line");
	    Scanner s = new Scanner(System.in);
			x1=s.nextInt();
			y1=s.nextInt();
			x2=s.nextInt();
			y2=s.nextInt();
			a=x2-x1;
			b=y2-y1;
		len=Math.sqrt((a*a)+(b*b));
		System.out.println("length of line is" +len);
	
	}
}
