Feature: Mycart
 @login    
 Scenario: sgin-in
#  Given N-Bricks Home Page
  When  sign_in button
 And user should enter userID
 And user should enter password
 And user should click the remember me check box
  And click recaptcha_sign_in
    Given user should click mycart from navigation bar
	  When user should click the search icon of the partner
	  When user shloud enter buyer details
	  And user should enter product details
	  And user sholud click update
	  And user should click convert to project
	 	Then user Should verify Create Project successful.
	  And refresh the page. 
	  And user sholud click recent projects
	  Given user should clcik new project From recent projects
	  When user should enter name
	  And user should click item nad summary
	  And user should click update buttion
	  And user should click convert project to quote
	 	And refresh the page. 
	 	And user should click recent quotes
	 	And user should click on created quote
	 	And user should click on quote summary
	 	And user should convert quote to order
	 	Then verify quote is converted into order
	 	And refresh the page. 
	 	And user should click on resent orders
		And user should click on created order	 	
	 	And user should click on submit
  Then user should verify sumition approved
	 	
	 	
	 	
	  
	  
	  
   
 
  