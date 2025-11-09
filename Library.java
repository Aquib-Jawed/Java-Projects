package com.jawedslectures.librarymanagementsystem;

public class Library implements BookOperations,MagazineOperations{
    private Book[] books=new Book[10];
    private Magazine[] magazines=new Magazine[10];
    int booksCount=0;
    int magazinesCount=0;

    @Override
    public void addBook(Book book){
        if(booksCount<books.length){
            books[booksCount++]=book;
            System.out.println("Book has been added. "+book);
        }
        else{
            System.out.println("Library is full. you can not add more books!");
        }
    }

    @Override
    public void removeBook(String itemId){
        for(int i=0; i<booksCount; i++){
            if(books[i].getItemId().equals(itemId)){
                books[i]=books[--booksCount];
                books[booksCount]=null;
                System.out.println("\nBook with Id "+itemId+" removed successfully.");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    @Override
    public void displayBooks(){
        System.out.println("\nList of books in the Library:");
        for(int i=0; i<booksCount; i++){
            System.out.println(books[i].toString());    //toString() method is also called implicitly.
        }
    }

    @Override
    public void addMagazine(Magazine magazine){
        if(magazinesCount<magazines.length){
            magazines[magazinesCount++]=magazine;
            System.out.println("Magazine added successfully. "+magazine);
        }
        else{
            System.out.println("Library is full. You can not add more magazines.");
        }
    }

    @Override
    public void removeMagazine(String itemId){
        for(int i=0; i<magazinesCount; i++){
            if(magazines[i].getItemId().equals(itemId)){
                magazines[i]=magazines[--magazinesCount];
                magazines[magazinesCount]=null;
                System.out.println("Magazine with Id "+itemId+" removed successfully.");
                return;
            }
        }
        System.out.println("Magazine not found!");
    }

    @Override
    public void displayMagazine(){
        System.out.println("\nList of Magazines in the library:");
        for(int i=0; i<magazinesCount; i++){
            System.out.println(magazines[i].toString());
        }
    }
}
