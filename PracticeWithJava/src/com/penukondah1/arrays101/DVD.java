package com.penukondah1.arrays101;



public class DVD {
	
	//creating an array to hold DVD's
	DVD[] dvdcollection = new DVD [15];
	
	public String name;
	public int releaseYear;
	public String director;
	
	public DVD (String name, int releaseYear, String director) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.director = director;
		
	}
	
	System.out.println(this.name + " directed by " + this.director + " released in " + this.releaseYear);
			
	

}



