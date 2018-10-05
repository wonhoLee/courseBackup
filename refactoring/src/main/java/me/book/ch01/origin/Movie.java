package me.book.ch01.origin;

public class Movie {
	public static final int CHILDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String _title;
	private int _priceCode;
	
	public Movie(String _title, int _priceCode) {
		super();
		this._title = _title;
		this._priceCode = _priceCode;
	}
	
	public int getPriceCode() {
		return _priceCode;
	}
	public void setPriceCode(int _priceCode) {
		this._priceCode = _priceCode;
	}
	public String getTitle() {
		return _title;
	}
}
