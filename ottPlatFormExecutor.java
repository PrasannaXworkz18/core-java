class ottPlatFormExecutor{

	public static void main(String args []){
	
	ottPlatForm movie = new ottPlatForm();
	 movie.addMovieName("om");
	 movie.addMovieName("Jogi");
	 movie.addMovieName("Ugrum");
	 movie.addMovieName("Upendra");
	  movie.addMovieName("Kgf");
	   movie.addMovieName("HumTum");
	     movie.addMovieName("HumTum");
	  
	  
	  movie.getMovies();
	  
	boolean  is =  movie.deleteByName ("HumTum");
	
	  
	
	}

}