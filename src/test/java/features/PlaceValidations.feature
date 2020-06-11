Feature: Validating place API's

@AddPlace @Regression
Scenario Outline: Verify if place is being successfully added using AddPlaceAPI
	Given Add place payload with "<name>" "<language>" "<address>"
	When user calls "AddPlaceAPI" API with "post" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And vetrify place_id created maps to "<name>" using "getPlaceAPI"

Examples:
	|name|language|address           |
	|XYZ |English |World cross center|
#	|ABC |Spanish |Sea cross center  | 

@DeletePlace @Regression
Scenario: Verify if delete place functionality is working
	Given DeletePlace Payload
	When user calls "deletePlaceAPI" API with "post" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK" 