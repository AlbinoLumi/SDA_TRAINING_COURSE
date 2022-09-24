package com.DesignPatters.Builder;

public class Client {
    public static void main(String[] args) {
        Book.BookBuilder builder = new Book.BookBuilder();
        builder.setTitle("Design patterns").setAuthor("Albino Lumi").setPrice(212);

        Book book = builder.createBook();
        System.out.println(book.getAuthor());
        System.out.println(book.getDescription());
        System.out.println(book.getPrice());
        System.out.println(book.getTitle());

    }
}
