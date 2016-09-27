
public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello world!");
		Thread.yield();
	}
public String Hello()
{
	if (Math.random() * 101 > 5)
	{
		try {
			Thread.sleep((int) Math.floor(Math.random() * 20000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace() ;
		}
		return "aaaaaaaaaahhhhhhhh123";
		
	}
	else
	{
		try {
			Thread.sleep((int) Math.floor(Math.random() * 101));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello";
	}
}
}
