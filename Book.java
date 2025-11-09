package com.jawedslectures.librarymanagementsystem;

//subclass book
public class Book extends LibraryItem{
    private Author author;

    //constructor
    public Book(String itemId, String title, Author author){
        super(itemId,title);
        this.author=author;
    }

    @Override
    public void showDetails(){
        System.out.println("Book title: "+title+"\nAuthor name: "+author.getAuthorDetails());
    }

    @Override
    public String toString(){
        return itemId+", "+title+", "+author.getAuthorName();
    }
}
