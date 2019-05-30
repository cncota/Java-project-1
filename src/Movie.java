//Claudia Cota ID:60341850
public class Movie{
	
	private int durationMin;
	private int yearReleased;
	private double price;
	private String title;
	private Director director;
	
	
	public int getDuration(){
		return durationMin;
	}
	
	public int getYearReleased(){
		return yearReleased;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getTitle(){
		return title;
	}
	
	public Director getDirector(){
		return director;
	}

	public void setDuration(int durationMin){
		this.durationMin = durationMin;
	}
	
	public void setYear(int year){
		this.yearReleased = year;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setDirector(String fName, String lName, int bYear, int films){
		director = new Director(fName, lName, bYear, films);
	}
	
	public static Movie copy(Movie m){
		Movie copyMovie = new Movie();
		copyMovie.setTitle(m.title);
		copyMovie.setPrice(m.price);
		copyMovie.setYear(m.yearReleased);
		copyMovie.setDuration(m.durationMin);
		copyMovie.setDirector(m.director.getFirstName(), m.director.getLastName(), m.director.getBirthYear(), m.director.getNumOfFilms());
		return copyMovie;
	}
	
	public String toString(){
		return "Title: " + this.title + "\nPublished in: " + this.yearReleased + "\nDuration of Movie: " + 
				this.durationMin + " minutes \nPrice: $" + this.price + "\nDirected by "+ director.getFirstName()+ " " +
				director.getLastName() + ", who was born in " + director.getBirthYear() + " and has " + 
				director.getNumOfFilms() + " releases. \n";
	}
	
}
