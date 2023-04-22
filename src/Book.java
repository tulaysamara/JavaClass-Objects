
public class Book {
	// three private
	private String title;
	private String author;
	private int pages;

	// empty constructor
	public Book() {
	}

	// getting 2 of 3
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.pages = 0;
	}

	// getting all 3
	public Book(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}

	// get method
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}

	public int pages() {
		return this.pages;
	}

	// set methods
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	//boolean
	public boolean newBook() {
		return this.pages > 20;
	}
	
	//string
	
	public String toString() {
		return this.title + "by" + this.author;
	}
}
