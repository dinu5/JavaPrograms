import java.util.Scanner;
public class Geomatry
{
		
		public static void main(String []args)
		{
			double area;
			//double s1,r,h,w;
		
	     Scanner s=new Scanner(System.in);
		 System.out.println("Press 1 to find area of circle");
		 System.out.println("Press 2 to find area of square");
		 System.out.println("Press 3 to find area of rectangle");
		 System.out.println("Please enter your choice");
		 int op=s.nextInt();
		 switch(op)
			{
			case 1: 
			System.out.println("Enter the radius of the circle");
		    double r=s.nextDouble();
			area=3.14*r*r;
			System.out.println("The area of the circle is:"+area);
			break;
			case 2: 
			System.out.println("Enter the value of side of the square");
			double s1=s.nextDouble();
			area=s1*s1;
			System.out.println("The area of the circle is:"+area);
			break;
			case 3: 
			System.out.println("Enter the width and height of the triangle");
			System.out.print("Enter the widtlnh of the triangle:  ");
			double w=s.nextDouble();
			System.out.print("Enter the height of the triangle:  ");
			double h=s.nextDouble();
			area=h*w;
			System.out.println("The area of the circle is:  "+area);
			break;
			}
		 
		}
}