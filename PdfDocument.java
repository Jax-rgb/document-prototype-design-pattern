public class PdfDocument implements Document {
    private String filename;
    private String author;
    private int pageCount;
    private String name;

    public PdfDocument() {
        this.filename = "default.pdf";
        this.author = "Unknown";
        this.pageCount = 10;
        this.name = "Default PDF";
    }

    @Override
    public Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }

    @Override
    public void open() {
        System.out.println("Opening " + getType() + ": " + filename + " by " + author + " (" + pageCount + " pages) - Name: " + name);
    }

    @Override
    public String getType() {
        return "PDF Document";
    }

    // Getters & Setters
    public String getFilename() { return filename; }
    public void setFilename(String filename) { this.filename = filename; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public int getPageCount() { return pageCount; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
