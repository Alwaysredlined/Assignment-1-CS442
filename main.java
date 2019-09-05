import java.util.Scanner;
public class main {

	public static void main(String[] args)
	{
		String delims = " ";
		String str1, str2;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first string can include spaces (Case-Sensetive): ");
		str1 = s.nextLine();
		System.out.println("Enter the second string without spaces (Case-Sensetive): ");
		str2 = s.next();
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.contains(str2));
		
		if(str1.contains(str2))
		{
			System.out.println("FOUND");
		} else {System.out.println("NOT FOUND");}
		
	}

}
