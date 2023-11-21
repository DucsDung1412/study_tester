package assertJ;

import static org.junit.Assert.*;

import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.swing.finder.WindowFinder.findFrame;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JLabelFixture;

import view.testJF;

public class testView {

	private FrameFixture window;

	  @BeforeClass
	  public static void setUpOnce() {
	    FailOnThreadViolationRepaintManager.install();
	  }
	
	
	@Before
	public void setUp() {
	  testJF frame = GuiActionRunner.execute(() -> new testJF());
	  window = new FrameFixture(frame);
	  window.show(); // shows the frame to test
	}
	
	@Test
	public void shouldCopyTextInLabelWhenClickingButton() {
	  window.textBox("txt_name").enterText("DungVipPro");
	  window.textBox("txt_age").enterText("22");
	  window.button("btnLogin").click();
	  
	  FrameFixture mainFrame = findFrame("Main").withTimeout(10000).using(window.robot());
	}
	
	@Test
    public void shouldShowErrorDialogOnIncorrectUsernameAndPassword() {
        testErrorDialog("accountToTest1", "123", "Dung");
        
    }
	
	@Test
    public void shouldShowErrorDialogOnIncorrectUsernameAndPassword1() {
        testErrorDialog("DungVipPro", "23", "Dung");
    }
	
	private void testErrorDialog(String username, String password, String text) {
        window.textBox("txt_name").enterText(username);
        window.textBox("txt_age").enterText(password);
        window.button("btnLogin").click();
        
        JLabelFixture lblTitle = window.label("lbl");
        System.out.println(String.valueOf(lblTitle));
        lblTitle.requireText(text);
    }
	
	@After
	public void tearDown() {
	  window.cleanUp();
	}
}
