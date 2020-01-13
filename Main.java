package steganography;

public class Main 
{
  public static void main(String[] args) 
  {
    try
    {
      Embedder emb = new Embedder("this is good", "/home/priya/priyapandey.pdf", "/home/priya/mamame.jpg", "/home/priya/qqq.png");
      emb.embed();
      Extractor ext = new Extractor("this is good", "/home/priya/qqq.png", "/home/priya/result");
      ext.extract();
      
    }
    catch(Exception ex)
    {
      System.out.println("Err: " + ex);
    }
  }
}
