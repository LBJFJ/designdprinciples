package com.webapp.lbj.dip.example1.v2;
class Book {
    public String getContent() {
        return "很久很久以前有一个阿拉伯的故事……";
    }
}

class Newspaper{  
    public String getContent(){  
        return "林书豪38+7领导尼克斯击败湖人……";  
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