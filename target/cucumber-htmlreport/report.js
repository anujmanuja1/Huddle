$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('Search.feature');
formatter.feature({
  "line": 1,
  "name": "To Search in uk.ask.com",
  "description": "",
  "id": "to-search-in-uk.ask.com",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Positive case for Search",
  "description": "",
  "id": "to-search-in-uk.ask.com;positive-case-for-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am a user of Huddle",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I launch into uk.ask.com",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Search for the keyword",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should be able to see the matching keyword in the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchPageSteps.I_am_a_user_of_Huddle()"
});
formatter.result({
  "duration": 141572814,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.I_launch_into_uk_ask_com()"
});
formatter.result({
  "duration": 4507254193,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.Search_for_the_keyword()"
});
formatter.result({
  "duration": 463100982,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.I_should_be_able_to_see_the_matching_keyword_in_the_search_results()"
});
formatter.result({
  "duration": 1671818387,
  "status": "passed"
});
});