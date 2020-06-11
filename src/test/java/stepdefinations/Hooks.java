package stepdefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException{
		StepDefination obj=new StepDefination();
		
		if(StepDefination.place_id==null){
			obj.add_place_payload_with("Test", "German", "Asia");
			obj.user_calls_API_with_http_request("AddPlaceAPI", "POST");
			obj.vetrify_place_id_created_maps_to_using("Test", "getPlaceAPI");
		}
	}
}
