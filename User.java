package com.jawedslectures.librarymanagementsystem;

//superclass User
public class User{
    protected String userId;
    protected String name;
    protected int maxBorrowLimit=1;
    private LibraryItem borrowedItem;

    //constructor
    public User(String userId, String name){
        this.userId=userId;
        this.name=name;
        this.borrowedItem=null;
    }

    //borrow method
    public void borrow(LibraryItem item){
        if(borrowedItem!=null){
            System.out.println(name+" has already borrowed an item. Return it first.");
        }
        else if(item.isAvailable()){
            borrowedItem=item;
            item.borrowItem();
        }
    }

    //return item method
    public void returnItem(){
        if(borrowedItem==null){
            System.out.println(name+" has no borrowed item.");
        }
        else{
            borrowedItem.returnItem();
            borrowedItem=null;
        }
    }

    //showBorrowedItems method
    public void showBorrowedItems(){
        if(borrowedItem==null){
            System.out.println(name+" has no borrowed item.");
        }
        else{
            System.out.println(name+" has borrowed:");
            borrowedItem.showDetails();
        }
    }
}
