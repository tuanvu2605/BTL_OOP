package Model;

import java.util.ArrayList;

public class FilmCD extends Item{
	private Director director;
	private ArrayList<Actor> listActor;
	public FilmKind kind ;
	
	public FilmCD()
	{
		
	}
	
	public FilmCD(String name , FilmKind kind , Price price , Director director , ArrayList<Actor> listActor){
		this.setName(name);
		this.setPrice(price);
		this.setDirector(director);
		this.setListActor(listActor);
	}
	
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public ArrayList<Actor> getListActor() {
		return listActor;
	}
	public void setListActor(ArrayList<Actor> listActor) {
		this.listActor = listActor;
	}
	

}
