import java.util.ArrayList;
import java.util.List;

public class Playlist {
	
	Song song = null;
	List<Song> songs = new ArrayList<Song>();
	public List<Song> add(String name,float time){
		song = new Song(name,time);
		songs.add(0, song);
		System.out.println("Song is added");
		
		return songs;
	}
	
	public void displaySongs() {
		
		System.out.println("The songs in Playlist are: " + songs.size());
	}
	
	public void forward(int songNo) {
		if(songs.isEmpty()) {
			System.out.println("No songs in PlayList.");
		}
		else if(songNo >= songs.size()) {
			System.out.println("There is no Songs left.");
		}
		else {
			System.out.println(songs.get(songNo+1).toString());
		}
	}
	
	public void backward(int songNo) {
		if(songNo <= 0) {
			System.out.println("There is no previous songs.");
		}
		else {
			System.out.println(songs.get(songNo-1).toString());
		}
	}
	
	public void delete(int songNo) {
		if(songs.isEmpty()) {
			System.out.println("There is No songs.");
		}
		else if(songNo > songs.size()) {
			System.out.println("There is no such song.");
		}
		else {
			songs.remove(songNo);
			System.out.println("Song Deleted.");
		}
	}

}
