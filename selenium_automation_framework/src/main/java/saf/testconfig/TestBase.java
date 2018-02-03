package saf.testconfig;

import pages.PageOrderForm;
import pages.home.bpo.order.edit.subject_history.Page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab;
import pages.login.Page_Login;
import pages.security_question.Page_SecurityQuestionPage;


/**
 TestBase class is going to be Superclass for all test-case classes
 * 
 * This class is added for just simplicity in SAF.
 * 
 * Note:
 * 1. TestBase class contains all project wide page declarations
 *  
 * @author Panchdev Chauhan
 *
 */
public class TestBase extends TestNG_SAF {

	// Declare All Pages here
	protected PageOrderForm pageOrderForm = null;
	
	protected Page_Login page_Login = null ; 
	
	protected Page_SecurityQuestionPage page_SecurityQuestionPage = null ;
	
	protected Page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab = null ;
	
	
}
