package regress;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author ian
 *
 * To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class AllTestsNonGUI {

	public static void main(String[] args) {
		junit.swingui.TestRunner.run(AllTestsNonGUI.class);
	}

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for regress");
		//$JUnit-BEGIN$
		suite.addTestSuite(ArrayIteratorTest.class);
		suite.addTestSuite(GetOptTest.class);
		suite.addTestSuite(StringFormatTest.class);
		suite.addTestSuite(FileIOTest.class);
		suite.addTestSuite(FilePropertiesTest.class);
		suite.addTestSuite(IndexListTest.class);
		suite.addTestSuite(StringUtilTest.class);
		suite.addTestSuite(ArrayIteratorTest.class);
		//$JUnit-END$
		return suite;
	}
}
