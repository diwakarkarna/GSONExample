package com.config;

import com.searchsourcesettings.SearchSourceSettings;

public class Config {
	 String fontColor;
	 boolean showLocationTool;	 
	SearchSourceSettings searchSourceSettings;
	DirectionLengthUnit directionLengthUnit;
	String maxBufferDistance;
	String defaultBufferDistance;
	boolean enableProximitySearch;
	boolean intersectSearchedLocation;
	
	public String getMaxBufferDistance() {
		return maxBufferDistance;
	}
	public void setMaxBufferDistance(String maxBufferDistance) {
		this.maxBufferDistance = maxBufferDistance;
	}
	public String getDefaultBufferDistance() {
		return defaultBufferDistance;
	}
	public void setDefaultBufferDistance(String defaultBufferDistance) {
		this.defaultBufferDistance = defaultBufferDistance;
	}
	public boolean isEnableProximitySearch() {
		return enableProximitySearch;
	}
	public void setEnableProximitySearch(boolean enableProximitySearch) {
		this.enableProximitySearch = enableProximitySearch;
	}
	public boolean isIntersectSearchedLocation() {
		return intersectSearchedLocation;
	}
	public void setIntersectSearchedLocation(boolean intersectSearchedLocation) {
		this.intersectSearchedLocation = intersectSearchedLocation;
	}
	public DirectionLengthUnit getDirectionLengthUnit() {
		return directionLengthUnit;
	}
	public void setDirectionLengthUnit(DirectionLengthUnit directionLengthUnit) {
		this.directionLengthUnit = directionLengthUnit;
	}
	public String getFontColor() {
		return fontColor;
	}
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
	public SearchSourceSettings getSearchSourceSettings() {
		return searchSourceSettings;
	}
	public void setSearchSourceSettings(SearchSourceSettings searchSourceSettings) {
		this.searchSourceSettings = searchSourceSettings;
	}
	public boolean isShowLocationTool() {
		return showLocationTool;
	}
	public void setShowLocationTool(boolean showLocationTool) {
		this.showLocationTool = showLocationTool;
	}

}
