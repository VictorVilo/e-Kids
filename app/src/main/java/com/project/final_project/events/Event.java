package com.project.final_project.events;


/**
 * The event that is invoked from the low levels of this game (like engine) and
 * not from the ui.
 * 
 * @author sromku
 */
public interface Event {

	String getType();
	
}
