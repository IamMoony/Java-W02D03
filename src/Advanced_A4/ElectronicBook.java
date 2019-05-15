package Advanced_A4;

public class ElectronicBook extends Book {
    private String fileFormat;

    public ElectronicBook(String name, String descr, int price, String title, int pages, String author, String fileFormat) {
     super(name, descr, price, title, pages, author);
     this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(){
        this.fileFormat = fileFormat;
    }
}
