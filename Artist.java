public class Artist{
String artistname;

Artist (String artistname){
this.artistname= artistname;
}
public void setArtistname(String artistname1){
artistname=artistname1;
}

public String getArtistname(){
return artistname;
}

public void display(){
System.out.println("Artist name: " + artistname);
}



}
