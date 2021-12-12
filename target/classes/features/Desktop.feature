Feature: Desktop 

Background: 
	Given User is on Retail website 
	When User click on Desktops tab 
	And User click on Show all desktops 
	
@Desktop @Regression	
Scenario: User verify all items are present in Desktops tab 
	Then User should see all items are present in Desktop page 
	
@Desktop @Regression @test
Scenario: User add HP LP 3065  from Desktops tab to the cart 
	And User click  ADD TO CART option on HP LP3065 item 
	And User select quantity 1 
	And User click add to Cart button 
	Then User should see a message Success: You have added "HP LP3065" to your shopping cart! 
	
@Desktop @Regression
Scenario: User add Canon EOS 5D from Desktops tab to the cart 
	And User click  ADD TO CART option on Canon EOS 5D item 
	And User select color from dropdown "Red" 
	And User select quantity 1 
	And User click add to Cart button 
	Then User should see a message Success: You have added "Canon EOS 5D" to your shopping cart! 
@Desktop @Regression
Scenario Outline: User add a review to Canon EOS 5D item in Desktops tab 
	And User click on Canon EOS 5D item 
	And User click on write a review link 
	And user fill the review information with below information '<yourName>' '<yourReview>' '<Rating>' 
	And User click on Continue Button 
	Then User should see a message with Thank you for your review. It has been submitted to the webmaster for approval 
	Examples: 
		|yourName|yourReview|Rating|
		|My Name|Dont have anything to add and it should be at least 25 chars |Bad|
