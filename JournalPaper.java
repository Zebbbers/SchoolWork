public class JournalPaper extends WrittenItem{
  private int date;
  
  public JournalPaper(){
    super();
    date = 0;
  }
  public JournalPaper(int i, String t, int c, String a, int d){
    super(i, t, c, a);
    date = d;
  }
  public void set(int i, String t, int c, int d){
    super.set(i, t, c);
    date = d;
  }
  public int getDate(){
    return date;
  }
  public String toString(){
    return "ID: " + getId() + "\n TITLE: " + getTitle() + "\n AUTHOR: " + getAuthor() + "\n DATE PUBLISHED " +getDate()+ "\n NUMBER OF COPIES: " + getCopys();
  }
  public void print(){
    System.out.println(toString());
  }
}