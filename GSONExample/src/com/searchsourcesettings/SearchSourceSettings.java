package com.searchsourcesettings;

import java.util.List;

public class SearchSourceSettings {
	 String allPlaceHolder;
	 boolean showInfoWindowOnSelect;
	 List<SearchSourceType> sources;
	public String getAllPlaceHolder() {
		return allPlaceHolder;
	}
	public void setAllPlaceHolder(String allPlaceHolder) {
		this.allPlaceHolder = allPlaceHolder;
	}
	public boolean isShowInfoWindowOnSelect() {
		return showInfoWindowOnSelect;
	}
	public void setShowInfoWindowOnSelect(boolean showInfoWindowOnSelect) {
		this.showInfoWindowOnSelect = showInfoWindowOnSelect;
	}
	public List<SearchSourceType> getSources() {
		return sources;
	}
	public void setSources(List<SearchSourceType> sources) {
		this.sources = sources;
	}
}
