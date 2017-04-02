package Model;

import java.util.ArrayList;

public class FilmCD extends Item{
	private Director director;
	private ArrayList<Actor> listActor;
	public FilmKind kind ;
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
