package com.jawedslectures.librarymanagementsystem;

//super class library item
public class LibraryItem {
    protected String itemId;
    protected String title;
    protected boolean isAvailable;

    //constructor
    public LibraryItem(String itemId,String title){
        this.itemId=itemId;
        this.title=title;
        this.isAvailable=true;
    }

    //isAvailable method
    public boolean isAvailable(){
        return isAvailable;
    }

    //borrowItem method
    public void borrowItem(){
        if(isAvailable){
            System.out.println(title+" borrowed successfully.");
            isAvailable=false;
        }
        else{
            System.out.println(title+" is not available.");
        }
    }

    //returnItem method
    public void returnItem(){
        isAvailable=true;
        System.out.println(itemId+" returned successfully.");
    }

    //showDetailsMethod
    public void showDetails(){
        System.out.println("Id: "+itemId+"\nTitle: "+title+"\nAvailable "+isAvailable);
    }

    public String getItemId() {
        return itemId;
    }
}
