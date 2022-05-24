package com.haroldstevens.tmhandson10;

class TaskManager {
	
	private String name;
	boolean isComplete;
	
	
	public TaskManager() {
		name = "";
	}
	
	public TaskManager( String name ) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isComplete() {
		return isComplete;
	}

	@Override
	public String toString() {
		return this.name + ( this.isComplete? " ( complete? ) ": "" );
	}

	public void setComplete(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
 