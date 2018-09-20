package ch1.refact;

public class Rental {
	Movie _movie;
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
	
	double getCharge() {
		return _movie.getCharge(_daysRented);
	}
	
	double getFrequentRenterPoints() {
		return _movie._price.getFrequentRenterPoints(_movie, _daysRented);
	}
	
}
