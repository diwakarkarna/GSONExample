package com.searchsourcesettings;

public class SearchSourceType {
	String type;
	String layerId;
	String countryCode;
	String name;
	String[] searchFields;
	String placeholder;
	String displayField;
	String exactMatch;
	boolean searchInCurrentMapExtent;
	int zoomScale;
	int maxSuggestions;
	int maxResults;
	boolean enableLocalSearch;
	int localSearchMinScale;
	int localSearchDistance;
	
	//Call only when source type is query
	public String getLayerId() {
		return layerId;
	}

	public void setLayerId(String layerId) {
		this.layerId = layerId;
	}
	//Common for all the search source
	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}
	//Call only when search source type is query
	public String getDisplayField() {
		return displayField;
	}

	public void setDisplayField(String displayField) {
		this.displayField = displayField;
	}

	public String getExactMatch() {
		return exactMatch;
	}

	public void setExactMatch(String exactMatch) {
		this.exactMatch = exactMatch;
	}

	public boolean isSearchInCurrentMapExtent() {
		return searchInCurrentMapExtent;
	}

	public void setSearchInCurrentMapExtent(boolean searchInCurrentMapExtent) {
		this.searchInCurrentMapExtent = searchInCurrentMapExtent;
	}

	public int getZoomScale() {
		return zoomScale;
	}

	public void setZoomScale(int zoomScale) {
		this.zoomScale = zoomScale;
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

	public boolean isEnableLocalSearch() {
		return enableLocalSearch;
	}

	public void setEnableLocalSearch(boolean enableLocalSearch) {
		this.enableLocalSearch = enableLocalSearch;
	}

	public int getLocalSearchMinScale() {
		return localSearchMinScale;
	}

	public void setLocalSearchMinScale(int localSearchMinScale) {
		this.localSearchMinScale = localSearchMinScale;
	}

	public int getLocalSearchDistance() {
		return localSearchDistance;
	}

	public void setLocalSearchDistance(int localSearchDistance) {
		this.localSearchDistance = localSearchDistance;
	}
	
	public String getLayerID() {
		return layerId;
	}

	public void setLayerID(String layerID) {
		this.layerId = layerID;
	}

	public String[] getSearchFields() {
		return searchFields;
	}

	public void setSearchFields(String[] searchFields) {
		this.searchFields = searchFields;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
