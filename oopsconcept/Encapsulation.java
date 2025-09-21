package oopsconcept;

// data hiding is done by declaring the data as private
// diff btw data hiding and encapsulation is data hiding is about providing security to the information and
// encapsulation is about hiding the complexity
// encapsultaion is implementation leve and internal level and containing information
// abstraction is design level and external level and gaining information

public class Encapsulation {
    public static void main(String[] args) {
        Book b = new Book();
        // b.total_pages;  --> can't access this data member
        b.setPages(500);
        int pages = b.getPages();
        System.out.println(pages);
    }
}


class Book{
    private int total_pages;

    void setPages(int t){
      total_pages = t;
    }

    int getPages(){
        return total_pages;
    }
}
