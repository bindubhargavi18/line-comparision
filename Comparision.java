package lines;
import java.util.*;
public class Comparision
{
	public static void main(String args[])
	{
		System.out.println("Welcome to line comparision computation program");	
		int x1,x2,y1,y2,a,b;
		double len1,len2;
		System.out.println("enter points of a line1");
	    Scanner s = new Scanner(System.in);
			x1=s.nextInt();
			y1=s.nextInt();
			x2=s.nextInt();
			y2=s.nextInt();
			a=x2-x1;
			b=y2-y1;
		len1=(Math.sqrt((a*a)+(b*b)));
		System.out.println("length of line1 is" +len1);
		System.out.println("enter points of a line2");   
		x1=s.nextInt();
		y1=s.nextInt();
		x2=s.nextInt();
		y2=s.nextInt();
		s.close();
		a=x2-x1;
		b=y2-y1;
		len2=(Math.sqrt((a*a)+(b*b)));
		System.out.println("length of line2 is" +len2);
		int res=Double.compare(len1,len2);
		   if(res==0)
			   System.out.println("Both lines are equal");
		   else if(res<0)
			   System.out.println("line1: " + len1 + " is less than line2: " + len2);
		   else
			   System.out.println("line1: " + len1 + " is greater than line2:  " + len2);
	  
	}
}
