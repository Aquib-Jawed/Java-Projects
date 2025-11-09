package com.jawedslectures.librarymanagementsystem;

//main class having main method
public class Main {
    public static void main(String[] args){

        //Create Author
        Author author=new Author("kathy sierra","Kathy Sierra is the author of \"Head first java\"Book series",4);
        Author author1=new Author("kathy sierra","Kathy Sierra is the author of \"Head first design pattern\"Book series",4);

        //create library items
        Book book1=new Book("java001","Head First Java",author);
        Book book2=new Book("java002","Head First Design Pattern",author1);
        Magazine mag1=new Magazine("m001","daily news",22);
        Magazine mag2=new Magazine("m002","Hindustan times", 35);

        Library library=new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();
        System.out.println();
        library.addMagazine(mag1);
        library.addMagazine(mag2);
        library.displayMagazine();

        library.removeBook("java001");
        library.removeMagazine("m002");

        library.displayBooks();
        library.displayMagazine();


//        Magazine m1=new Magazine("mag001","AI evolution",10);
//
//        //create users
//        Student s1=new Student("bwumca24197","Aquib");
//        Professor p1=new Professor("bwucss","Dr.Sinha sir");

        //borrow items
//        s1.borrow(book1);
//        s1.showBorrowedItems();
//        System.out.println();
//        p1.borrow(m1);
//        p1.showBorrowedItems();
//        System.out.println();
//
//        //return items
//        p1.returnItem();
//        s1.returnItem();
//        System.out.println();
//
//        //showBorrowedItems
//        p1.showBorrowedItems();
//        s1.showBorrowedItems();

    }
}
