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

    /**
     * Set the author,title and pages fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
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
    
    
    
}
