package example3;

public class Book {
	String author;
	String name;
	int price;
	
	public Book(String author, String name, int price) {
		this.author = author;
		this.name = name;
		this.price = price;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}
