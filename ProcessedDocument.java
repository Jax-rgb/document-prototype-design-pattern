public class ProcessedDocument {
    public static void main(String[] args) throws CloneNotSupportedException {
        DocumentRegistry registry = new DocumentRegistry();

        System.out.println("=== Document Prototype Pattern Demo ===\n");

        // Create and customize PDF clones
        PdfDocument pdf1 = registry.createPdfDocument();
        pdf1.setFilename("invoice.pdf");
        pdf1.setAuthor("Alice Smith");
        pdf1.setPageCount(8);
        pdf1.setName("Monthly Invoice");
        pdf1.open();

        PdfDocument pdf2 = registry.createPdfDocument();
        pdf2.setFilename("report.pdf");
        pdf2.setAuthor("Bob Johnson");
        pdf2.setPageCount(25);
        pdf2.open();

        // Text document clone
        TextDocument text1 = registry.createTextDocument();
        text1.setFilePath("meeting-notes.txt");
        text1.setEncoding("UTF-8");
        text1.setWordCount(1250);
        text1.open();

        // Spreadsheet clone
        SpreadsheetDocument sheet1 = registry.createSpreadsheetDocument();
        sheet1.setSpreadsheetName("budget-2026.xlsx");
        sheet1.setRowCount(120);
        sheet1.setColumnCount(15);
        sheet1.open();

        System.out.println("\nAll documents are independent clones from their prototypes ✓");
    }
}
