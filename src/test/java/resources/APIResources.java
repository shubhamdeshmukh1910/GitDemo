package resources;

public enum APIResources {
	
	AddPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json");
	private String resouce;
	
	APIResources(String resource){
		this.resouce=resource;
	}
	
	public String getResource(){
		return resouce;
	}
}
