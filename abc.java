import java.util.Scanner;
public class abc
{
		int r,s1,h,w;
		float area;
		public static void main(String []args)
		{
	     Scanner s=new Scanner(System.in);
		 System.out.print("Press 1 to find area of circle");
		 System.out.print("Press 2 to find area of square");
		 System.out.print("Press 3 to find area of rectangle");
		 System.out.print("Please enter your choice");
		 int op=s.intNext();
		 switch(op)
			{
			case 1: 
			System.out.print("Enter the radius of the circle");
			int ac=s.intNext();
			area=3.14*r*r;
			System.out.print("The area of the circle is:"+area);
			break;
			case 2: 
			System.out.print("Enter the value of side of the square");
			int as=s.intNext();
			area=s1*s1;
			System.out.print("The area of the circle is:"+area);
			break;
			case 3: 
			System.out.print("Enter the width and height of the triangle");
			System.out.print("Enter the width of the triangle");
			int ah=s.intNext();
			System.out.print("Enter the height of the triangle");
			float aw=s.intNext();
			area=h*w;
			System.out.print("The area of the circle is:"+area);
			break;
			}
		 
		}
}