package services;

import models.Book;
import models.Document;
import models.Magazine;
import models.Newspaper;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager implements GeneralManager{
    List<Document> documentList = new ArrayList<>();
    @Override
    public void showAll() {
        for (Document d: documentList) {
            System.out.println(d);
        }
    }

    @Override
    public void add(Document document) {
        documentList.add(document);
    }

    @Override
    public Object findByID(int id) {
        for (Document d : documentList) {
            if (d.getDCore() == id) {
                return d;
            }
        }
        return null;
    }

    @Override
    public Object findByName(String name) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        documentList.removeIf(d -> d.getDCore() == id);
    }

    @Override
    public void deleteByName(String name) {
    }
    public Object findBook(String name) {
        for (Document d: documentList) {
            if (d instanceof Book && ((Book)d).getBookName().equals(name)) {
               return d;
            }
        }
        return "Not found";
    }
    public Object findNewspaper(int num){
        for (Document d: documentList) {
            if (d.getDCore() == num && d instanceof Newspaper) {
                return d;
            }
        }
        return "Not found";
    }
    public Object findMagazine(int num) {
        for (Document d : documentList){
            if (d instanceof Magazine && ((Magazine)d).getIssueNum() == num) {
                return d;
            }
        }
        return "Not found";
    }
    public void showAllBook() {
        for(Document d : documentList){
            if (d instanceof Book){
                System.out.println(d);
            }
        }
    }
    public void showAllNewspaper() {
        for(Document d : documentList){
            if (d instanceof Newspaper){
                System.out.println(d);
            }
        }
    }
    public void showAllMagazine() {
        for(Document d : documentList){
            if (d instanceof Magazine){
                System.out.println(d);
            }
        }
    }
    public static void main(String[] args) {
        Document book = new Book("a",1,"d","ab", 100);
        Document document = new Newspaper("a", 13, "10/10/2010");
        Document document1 = new Newspaper("b", 18, "10/10/2010");
        Document document2 = new Newspaper("b", 19, "10/10/2010");
        Document document3 = new Newspaper("b", 20, "10/10/2010");
        Document book1 = new Book("b",1,"c","ab", 100);
        Document book2 = new Book("b",1,"g","ab", 100);
        LibraryManager libraryManager = new LibraryManager();
        libraryManager.add(book);
        libraryManager.add(book1);
        libraryManager.add(book2);
        libraryManager.add(document);
        libraryManager.add(document1);
        libraryManager.add(document2);
        libraryManager.add(document3);
        System.out.println(libraryManager.findNewspaper(10));
        System.out.println(libraryManager.findBook("a"));
        Document m1 = new Magazine("a", 2 , 4 ,"abc");
        Document m2 = new Magazine("a", 2 , 5 ,"abc");
        Document m3 = new Magazine("a", 2 , 6 ,"abc");
        libraryManager.add(m1);
        libraryManager.add(m2);
        libraryManager.add(m3);
        System.out.println(libraryManager.findMagazine(42));
//        libraryManager.deleteById(6);
//        libraryManager.showAll();
        libraryManager.showAllBook();
    }
}
