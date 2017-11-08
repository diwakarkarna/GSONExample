package com.searchsourcesettings;

public class SearchSourcesLayer {
	String layerID;
	String URL;
	String Name;
	String placeHolder;
	String DisplayField;
	boolean exactMach;
	int maxSuggestions;
	int maxResults;
	public String getLayerID() {
		return layerID;
	}
	public void setLayerID(String layerID) {
		this.layerID = layerID;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPlaceHolder() {
		return placeHolder;
	}
	public void setPlaceHolder(String placeHolder) {
		this.placeHolder = placeHolder;
	}
	public String getDisplayField() {
		return DisplayField;
	}
	public void setDisplayField(String displayField) {
		DisplayField = displayField;
	}
	public boolean isExactMach() {
		return exactMach;
	}
	public void setExactMach(boolean exactMach) {
		this.exactMach = exactMach;
	}
	public int getMaxSuggestions() {
		return maxSuggestions;
	}
	public void setMaxSuggestions(int maxSuggestions) {
		this.maxSuggestions = maxSuggestions;
	}
	public int getMaxResults() {
		return maxResults;
	}
	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}

	
	
}
