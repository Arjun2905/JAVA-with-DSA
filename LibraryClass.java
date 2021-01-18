package com.company;

import java.util.Arrays;

class Library{

    String[] arr = new String[5];
    int i=0;

    void addBook(String s){
        arr[i++] = s;
        System.out.println("Books in library are : " + Arrays.toString(arr));
    }

    void issueBook(){
        for(String x: arr){
            if(x.equals("love")){
                System.out.println("book is being issued .");
                break;
            }
        }

    }

    void returnBook(){
        System.out.println("book is returned to library");
    }

    void showAllBooks(){
        for(String a : arr){
            System.out.print(a + " ");
        }
    }
}

public class LibraryClass {
    public static void main(String[] args) {
        Library Lib = new Library();
        Lib.addBook("love");
        Lib.addBook("prey");
        Lib.addBook("triangle");
        Lib.addBook("stone");
        Lib.addBook("flaw");
        Lib.issueBook();
        Lib.returnBook();
        Lib.showAllBooks();
    }
}
