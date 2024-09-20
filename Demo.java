public class Demo{

public static void main(String args[])
{
Artist a1= new Artist("Unknown");

Artwork a2= new Artwork("Digital art", 2005, a1);
Artwork a3= new Artwork("Painting", 2006);

System.out.println("Artwork information: ");

a2.display();
a3.display();


}
}