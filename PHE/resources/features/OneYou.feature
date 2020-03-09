Feature: OneYou landing page 
Description: As a User I want to start OneYou quiz



Scenario Outline: Quiz Time 

	Given I load data from test data sheet "<Testcase>"
	Given I start quiz on OneYou website 
	When I fill first page Name, Gender, Age and click Next
	When I land on How are you feeling right now Really Knackered,CanRunForMiles,FeelingCalm,SleeplessNights,LeanMean,DownDump and click Next 
	When I select options from What Stops you taking care of yourself and click next
	When I choose who all depend on me for being healthy and click next
	When I identify top three health priorities from the given options
	Then I Validate PartOne OutPut Message and click Next
	Then I choose one of my favorite drinks from given Drink options and click Next
	Then I select my favorite snacks out of given options
	Then I choose my favorite breakfast out of given options and click next
	Then I choose my favorite cheese out of given options
	Then I choose my favorite NonVeg item from the available options and click next
	Then I choose servings of fruits and vegetables from
	Then I choose my favorite snacks from given options
	Then I select frequency of alcohol intake and click Next
	Then I choose my exercise metrics
	Then I choose my strengthening metrics
	Then I am asked about my smoking habbits
	When I do not opt for sign up
	Then I land on Result Page with the score
	And I validate messages against each section
	
	Examples: 
	
		|Testcase |
		|TC1	  |
		
		
		
		
		
