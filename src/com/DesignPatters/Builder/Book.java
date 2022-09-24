package com.DesignPatters.Builder;

public class Book {

    private String title;
    private String author;
    private String description;
    private double price;
    private String isbn;
    private String publish;
    private String cover;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    private Book(String title, String author, String description, double price, String isbn, String publish, String cover) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isbn = isbn;
        this.publish = publish;
        this.cover = cover;
    }

    public static class BookBuilder{

        private String title;
        private String author;
        private String description;
        private double price;
        private String isbn;
        private String publish;
        private String cover;

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public BookBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public BookBuilder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder setPublish(String publish) {
            this.publish = publish;
            return this;
        }

        public BookBuilder setCover(String cover) {
            this.cover = cover;
            return this;
        }
        public Book createBook(){
            Book book = new Book(this.title, this.author,this.description,
                    this.price,this.isbn,this.publish,this.cover);
            return book;
    }

    }
}
