/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Karen Stagg
 * @version September 19, 2020
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author,title,pages and refNumber fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        
    }

    // Add the methods here ...
    /**
     * Provide access to the string holding the author's name
     * @return author returns the contents in author field
     */
    public String getAuthor()
    {
        return author;
    }
    
        /**
     * Provide access to the string holding the book's title
     * @return title returns the contents in title field
     */
    public String getTitle()
    {
        return title;
    }
    
        /**
     * Provide access to the int holding the book's pages
     * @return pages returns the number of pages in pages field
     */
    public int getPages()
    {
        return pages;
    }
    
        /**
     * Provide access to the string holding the book's refNumber
     * @return refNumber returns the reference number field
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
        /**
     * Set the reference number for this book
     * @param bookRefNumber is the reference number to be set for the book
     */
    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Error - refNumber must be at least 3 characters long");
        }    
    }
    
    /**
     * Print the author name
     *
     */
    public void printAuthor()
    {
        System.out.println("Author: " + author);        
    }

    /**
     * Print the book title
     *
     */
    public void printTitle()
    {
        System.out.println("Title: " + title);        
    }
    
    /**
     * Print a formatted output of the book's details
     * If there is no refNumber, then print default of ZZZ
     *
     */
    public void printDetails()
    {
        System.out.print("Title: " + title + ", Author: "
                    + author + ", Pages: " + pages); 
        if (refNumber.length() > 0)
        {
            System.out.println(", RefNumber: " + refNumber);
        }
        else
        {
            System.out.println(", RefNumber: ZZZ");
        }    
        
    }
    
    
}
