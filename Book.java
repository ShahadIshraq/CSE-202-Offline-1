/**
 * Created by Shahad on 14-Sep-15.
 */
public class Book {
    private String name;
    private  Author author;
    private double price;
    private int stock;

    public Book(String name,   Author author) {
        this.name = name;
        this.author = author;
    }
    

    public void setPrice(double price){
        this.price=price;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public String getAuthorName(){
        return this. getName();
    }
    public double getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
    public void borrowBook(int amount){
        if (amount>stock) System.out.println("Borrowing amount exceeds the current stock!");
        else stock-=amount;
    }
    public void returnBook(int amount){
        this.stock+=amount;
    }
    public Book(String name,  Author author,double price,int stock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.stock=stock;
    }
    public void print(){
        System.out.println( "Author: "+ getName()+" Name: "+name+" Price: "+price+" Stock: "+stock);
    }
    public String getName(){
        return name;
    }
    public  Author getAuthor(){
        return author;
    }

}
