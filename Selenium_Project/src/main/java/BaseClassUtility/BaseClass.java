package BaseClassUtility;

public class BaseClass {
	

	public static void main(String[] args) {
		boolean flag = false;
		System.out.println("hii sam");
		if("HDFC".equals("HDFC"))
		{
			System.out.println("Pass1");
		}
		else if("ICICI".equals("ICICI"))
		{
			System.out.println("Fail1");
		} else
			try {
				if(flag==true)
				{
					System.out.println("Invalid");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		
}
