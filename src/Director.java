
public class Director{
	
	private String firstName;
	private String lastName;
	private int birthYear;
	private int numOfFilms;
	
	public Director(String fName, String lName, int bYear, int numFilms){
		firstName = fName;
		lastName = lName;
		birthYear = bYear;
		numOfFilms = numFilms;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getBirthYear(){
		return birthYear;
	}
	
	public int getNumOfFilms(){
		return numOfFilms;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setBirthYear(int birthYear){
		this.birthYear = birthYear;
	}
	
	public void setNumOfFilms(int numOfFilms){
		this.numOfFilms = numOfFilms;
	}
	
	
}
