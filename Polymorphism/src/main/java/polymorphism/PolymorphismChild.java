package polymorphism;
public class PolymorphismChild extends PolymorphismParent
{
	public void displayParent()
	 {		
		System.out.println("Child class method");
		super.displayParent();
	 }
	public static void main(String[] args)
	{
		PolymorphismChild obj=new PolymorphismChild();
		obj.displayParent();		
	}
}
