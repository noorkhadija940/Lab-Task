public class Artwork{

String title;
int year;
Artist artist;

public Artwork(String title, int year, Artist artist){
this.title=title;
this.year=year;
this.artist=artist;
}

public Artwork(String title, int year){
this.title=title;
this.year=year;
artist=new Artist("Unknown artist");
}

public String getTitle (){
return title;
}

public int year(){
return year;
}

public Artist artist(){
return artist;
}

public void display(){
System.out.println("Title: " + title);
System.out.println("Year: " +year);
artist.display(); 
}

public Artwork shallowcopy(){
return new Artwork(this.title, this.year, this.artist);
}

public Artwork deepcopy(){
Artist a1=new Artist(this.artist.getArtistname());
return new Artwork(this.title, this.year, a1);
}



}