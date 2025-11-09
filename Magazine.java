package com.jawedslectures.librarymanagementsystem;

//subclass magazine
public class Magazine extends LibraryItem{
    private int issueNumber;

    //constructor
    public Magazine(String itemId, String title, int issueNumner){
        super(itemId,title);
        this.issueNumber=issueNumner;
    }

    @Override
    public void showDetails(){
        System.out.println("Magazine Id: "+itemId+"\nTitle: "+title+"\nIssue Number: "+issueNumber);
    }

    public String toString(){
        return itemId+", "+title+", "+issueNumber;
    }
}
