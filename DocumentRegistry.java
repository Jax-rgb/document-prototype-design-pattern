public class DocumentRegistry {
    private final PdfDocument pdfPrototype;
    private final TextDocument textDocumentPrototype;
    private final SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        this.pdfPrototype = new PdfDocument();
        this.textDocumentPrototype = new TextDocument();
        this.spreadsheetPrototype = new SpreadsheetDocument();
    }

    public PdfDocument createPdfDocument() throws CloneNotSupportedException {
        return (PdfDocument) pdfPrototype.clone();
    }

    public TextDocument createTextDocument() throws CloneNotSupportedException {
        return (TextDocument) textDocumentPrototype.clone();
    }

    public SpreadsheetDocument createSpreadsheetDocument() throws CloneNotSupportedException {
        return (SpreadsheetDocument) spreadsheetPrototype.clone();
    }
}
