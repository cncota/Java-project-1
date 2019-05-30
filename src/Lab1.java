
public class Lab1{
	public static void main(String[] args){
		
		
		Movie movie = new Movie();
		movie.setTitle("Harry Potter and the Goblet of Fire");
		movie.setPrice(19.99);
		movie.setYear(2000);
		movie.setDuration(734);
		movie.setDirector("J.K.", "Rowling", 1965, 7);
		System.out.println("**Original movie object** \n" + movie.toString());
		
		Movie movie2 = Movie.copy(movie);
		System.out.println("**Copied movie object** \n" + movie2.toString());
		
		
		movie2.getDirector().setNumOfFilms(10);
		
		
		System.out.println("**Copied movie object with increased number of films** \n" + movie2.toString());
		System.out.println("**Original movie object** \n" + movie.toString());
		
		
	}
	

}
