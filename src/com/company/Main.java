package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Book [] books = new Book[2];
        String[] TheOtherAuthors = {"Amie Kaufman", "Meagan Spooner"};
        String[] PunchingAuthors = {"Ibi Zoboi","Yusef Salaam"};
        books[0] = new Book ("The Other Side of the Sky", TheOtherAuthors, 2020);
        books[1] = new Book ("Punching the Air",PunchingAuthors, 2020 );
        for( Book e : books)
            System.out.println(e);
    }
}
