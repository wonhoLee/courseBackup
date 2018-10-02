package ch01.origin;

public class Rental {
	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie _movie, int _daysRented) {
		super();
		this._movie = _movie;
		this._daysRented = _daysRented;
	}
	
	
	public Movie getMovie() {
		return _movie;
	}
	public int getDaysRented() {
		return _daysRented;
	}
	
	
}
