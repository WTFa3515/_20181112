package _20181128;

import javax.print.attribute.standard.MediaSize.Other;

public class TestDoSome {
	
	@Ignore("message") //(value = "message")
	public void TestDoSome2() {	
	}
	
	@TestClass({TestDoSome.class, Other.class})//(value = {TestDoSome.class, Other.class})
	public void TestDoSome3() {
	}
	@Test4(timeout = 10, messange = "over10s")
	public void testDoSome4() {
	}
	@Test8	//�[��Dvoid�W�褣���L
	public void testDoSome8() {
	}
}
