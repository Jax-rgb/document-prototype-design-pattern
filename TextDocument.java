public class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument() {
        this.filePath = "default.txt";
        this.encoding = "UTF-8";
        this.wordCount = 100;
    }

    @Override
    public Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }

    @Override
    public void open() {
        System.out.println("Opening " + getType() + ": " + filePath + " (" + encoding + ") - " + wordCount + " words");
    }

    @Override
    public String getType() {
        return "Text Document";
    }

    // Getters & Setters
    public String getFilePath() { return filePath; }
    public void setFilePath(String filePath) { this.filePath = filePath; }
    public String getEncoding() { return encoding; }
    public void setEncoding(String encoding) { this.encoding = encoding; }
    public int getWordCount() { return wordCount; }
    public void setWordCount(int wordCount) { this.wordCount = wordCount; }
}
