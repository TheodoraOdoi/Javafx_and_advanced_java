package edu.adse2501.sess08_design_patterns_and_other_features;

/**
 * Java program that demonstrates delegation using a DocumentPrinter that
 * delegates printing  work to specific PrintService implementations
 * @author user
 */
public class DelegationDemo
{
    public static void main(String[] args)
    {
        // Deligate & instantiate a DocumentPrinter object
        DocumentPrinter printer = new DocumentPrinter();
        
        // Print a PDF Document
        printer.printDocument("These are the contents of the PDF document.", "PDF");
        
        // Print a Text Document
         printer.printDocument("These are the contents of the Text document.", "Text");
         
    }
}


/**
 * DocumentPrinter class delegates printing responsibilities to the apt
 * PrintService based on the document type.
 * 
 * @author user
 */
class DocumentPrinter
{
    private final PDFPrinter pdfPrinter;
    private final TextPrinter textPrinter;
    
    /**
     * TextPrinter class is a specific implementation of the PrintService interface
     * for Text Documents.
    */
    public DocumentPrinter()
    {
        this.pdfPrinter = new PDFPrinter();
        this.textPrinter = new TextPrinter();
    }
    
    public void printDocument(String content, String type)
    {
        if("pdf".equalsIgnoreCase(type))
            pdfPrinter.print(content);
        else if("text".equalsIgnoreCase(type))
            textPrinter.print(content);
        else
            System.err.println("Sorry, you gave us an unsupported type: " + type);
    }
}

/**
 * PrintService interface defines the print operation (print() method).
 * 
 */
interface PrintService
{
    void print(String document);
}

/**
 * PDFPrinter class is a specific implementation of the PrintService interface
 * for PDF Documents. 
 */
class PDFPrinter implements PrintService
{
    @Override
    public void print(String content)
    {
        System.out.println("Printing PDF Document: " + content);
    } 
}

/**
 * TextPrinter class is a specific implementation of the PrintService interface
 * for Text Documents.
 */
class TextPrinter implements PrintService
{
    @Override
    public void print(String content)
    {
        System.out.println("Printing Text Document: " + content);
    } 
}