package test;
import org.junit.Test;
import main.Telivision;
import static org.junit.Assert.*;
public class TelivisionTest
{
	@Test
	public void volumeTestOfCurrentVolume()
	{
		assertEquals(4,new Telivision().volumeOfTelivison());
	}
	@Test
	public void volumeTestOfIncreaseOfVolume()
	{
		assertEquals(5,new Telivision().volumeIncreaseOfTelivision());
	}
	
}