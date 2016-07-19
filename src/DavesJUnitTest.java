import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.Thread;

public class DavesJUnitTest {

	@Test
	public void testDave() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
