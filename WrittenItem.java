public class WrittenItem extends Item{
  private String author;
  
  public WrittenItem(){
    super();
    author = "";
  }
  public WrittenItem(int i, String t, int c, String a){
    super(i, t, c);
    author = a;
  }
  public void set(int i, String t, int c, String a){
    super.set(i, t, c);
    author = a;
  }
  public String getAuthor(){
    return author;
  }
  public String toString(){
    return "ID: " + getId() + "\n TITLE: " + getTitle() + "\n AUTHOR: " + getAuthor() + "\n NUMBER OF COPIES: " + getCopys();
  }
  public void print(){
    System.out.println(toString());
  }
}
                     
  