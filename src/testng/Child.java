package testng;

import org.testng.annotations.Test;

public class Child extends Parent
{
@Test
public void tc01()
{
System.out.println("tc01");
}

@Test
public void tc02()
{
	System.out.println("tc02");	
}

}
