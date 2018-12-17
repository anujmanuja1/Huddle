Feature: To Search in uk.ask.com

		
Scenario: Positive case for Search
		Given I am a user of Huddle 
		When I launch into uk.ask.com
		And Search for the keyword
		Then I should be able to see the matching keyword in the search results
		

		
