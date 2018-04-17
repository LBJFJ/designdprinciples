package com.webapp.lbj.dip.example1.v1;

class Book {
    public String getContent() {
        return "很久很久以前有一个阿拉伯的故事……";
    }
}

class Mother {
    public void narrate(Book book) {
        System.out.println("妈妈开始讲故事");
        System.out.println(book.getContent());
    }
}

public class Client {
    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.narrate(new Book());
    }
}
