@LoginNTL
Feature: validate NTL login page
Scenario: Validate login with positive data
Given open browser as chrome
Then Enter URL as http://www.ntltaxi.com/
Then click Loginlink
Then Enter Mobilenumber as 9677109279
Then Enter Password as 545667
Then Click LoginButton 
