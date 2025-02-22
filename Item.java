public abstract class Item{
  private int id;
  private String title;
  private int copys;
  
  public Item(){
    id = 0;
    title = "";
    copys = 0;
  }
  
  public Item(int i, String t, int c){
    id = i;
    title = t;
    copys = c;
  }
  
  public void set(int i, String t, int c){
    id = i;
    title = t;
    copys = c;
  }
  
  public int getId(){
    return id;
  }
    
  public String getTitle(){
    return title;
  }
     
  public int getCopys(){
    return copys;
  }
  
  public String toString(){
    return "ID: " + id + "\n TITLE: " + title + "\n NUMBER OF COPIES: " + copys;
  }
      
  public void print(){
     System.out.println(toString()); 
  }
  public boolean equals(Item i){
     return equals(i);
  }
  
  public void checkOut(){
    if(copys == 0)
      copys--;
    else
      System.out.println("No copies avalible");
  }
  
  public void checkIn(){
    copys++;
  }
    
  public int addItem(int copys){
     return copys++;
  }
}