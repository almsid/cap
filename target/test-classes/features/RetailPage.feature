Feature: Retail Page

Background:
Given User is on Retail website 
And User click on MyAccount
When User click on Login 
And User enter username "testing1@test.net" and password "testing"
And User click on Login button
Then User should be logged in to MyAccount dashboard

@Retail-
Scenario Outline: Register as an Affiliate user with Cheque Payment Method
When User click on Register for an Affiliate Account link 
And User fill affiliate form with below information '<company>' '<website>' '<taxID>' '<paymentMethod>' '<chequeName>'
And User check on About us check box 
And User click on Continue button 
Then User should see a success message 
Examples:
|company|website|taxID|paymentMethod|chequeName|
|My Company|www.company.com|123456789|cheque|Some Body|

@Retail @Regression
Scenario Outline: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on Edit your affiliate information link 
And user click on Bank Transfer radio button
And User fill Bank information with information '<bankName>' '<abaNumber>' '<swiftCode>' '<accountName>' '<accountNumber>'
And User click on Continue button 
Then User should see a success message
Examples:
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|BoA|21323423|04223423|Checking|2343773|

@Retail @Regression
Scenario Outline: Edit your account Information 
When User click on ‘Edit your account information’ link 
And User modify information '<firstname>' '<lastName>' '<email>' '<telephone>'
And User click on Continue button 
Then User should see a success message
Examples:
|firstname|lastName|email|telephone|
|Nameeee|Last Name Changed|testing1@test.net|5555551234|