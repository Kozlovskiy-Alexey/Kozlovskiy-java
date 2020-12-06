package homework.lessons.lesson07.lesson0701;

class Book extends Author {

    String nameOfTheBook;
    int numberOfPages;
    String bookFormat;
    static int bookCounter = 0;


    public void setNameOfTheBook(String nameOfTheBook) {
        if (nameOfTheBook == null) {
            this.nameOfTheBook = "NAME OF THE BOOK WAS NOT ENTERED";
        } else this.nameOfTheBook = nameOfTheBook;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 2) {
            this.numberOfPages = numberOfPages;
        } else this.numberOfPages = 0;
    }

    public void setBookFormat(String bookFormat) {
        if (bookFormat == null) {
            this.bookFormat = "BOOK FORMAT WAS NOT ENTERED";
        }
        else this.bookFormat = bookFormat;
    }

    Book(String nameOfTheBook, int numberOfPages, String bookFormat, String authorName, String authorLastName, int age) {

       super(authorName, authorLastName, age);
        setNameOfTheBook(nameOfTheBook);
        setNumberOfPages(numberOfPages);
        setBookFormat(bookFormat);

        bookCounter++;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getBookFormat() {
        return bookFormat;
    }

    public static int getBookCounter() {
        return bookCounter;
    }

    @Override
    public String toString() {
        return "Information about Book:" +
                "\n---------------------" +
                "\nname Of The Book: " + nameOfTheBook +
                "\nnumber Of Pages: " + numberOfPages +
                "\nbook Format: " + bookFormat + "\n" +
                "\n" + super.toString();
    }
}
