package Shopping;

public class BookList {
  String BookName;
  String BookWriter;
  String BookPublisher;
  String BookPublicationDate;
  String BookCost;
  String BookNumber;
  public BookList(String BookNumber, String BookName,String BookWriter,String BookPublisher,String BookPublicationDate,String BookCost){
	  this.BookNumber = BookNumber;
	  this.BookName = BookName;
	  this.BookWriter = BookWriter;
	  this.BookPublisher = BookPublisher;
	  this.BookPublicationDate = BookPublicationDate;
	  this.BookCost = BookCost;
  }	
}
