import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class CodingExercise46 {
	public static void main(String[] args) {
		ArrayList<Album> albums = new ArrayList<Album>();

		Album album = new Album("Stormbringer", "Deep Purple");
		album.addSong("Stormbringer", 4.6);
		album.addSong("Love don't mean a thing", 4.22);
		album.addSong("Holy man", 4.3);
		album.addSong("Hold on", 5.6);
		album.addSong("Lady double dealer", 3.21);
		album.addSong("You can't do it right", 6.23);
		album.addSong("High ball shooter", 4.27);
		album.addSong("The gypsy", 4.2);
		album.addSong("Soldier of fortune", 3.13);
		albums.add(album);

		album = new Album("For those about to rock", "AC/DC");
		album.addSong("For those about to rock", 5.44);
		album.addSong("I put the finger on you", 3.25);
		album.addSong("Lets go", 3.45);
		album.addSong("Inject the venom", 3.33);
		album.addSong("Snowballed", 4.51);
		album.addSong("Evil walks", 3.45);
		album.addSong("C.O.D.", 5.25);
		album.addSong("Breaking the rules", 5.32);
		album.addSong("Night of the long knives", 5.12);
		albums.add(album);

		LinkedList<Song> playList = new LinkedList<Song>();

		albums.get(0).addToPlayList("You can't do it right", playList);
		albums.get(0).addToPlayList("Holy man", playList);
		albums.get(0).addToPlayList("Speed king", playList); // Does not exist
		albums.get(0).addToPlayList(9, playList);
		albums.get(1).addToPlayList(3, playList);
		albums.get(1).addToPlayList(2, playList);
		albums.get(1).addToPlayList(24, playList); // There is no track 24
	}
}

class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;

	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}

	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			// If no song exists, add a song.
			this.songs.add(new Song(title, duration));
			return true;
		}
		// If a song exists , return false.
		return false;

	}

	private Song findSong(String title) {
		Iterator<Song> songsIterator = this.songs.iterator();
		while (songsIterator.hasNext()) {
			Song song = songsIterator.next();
			if (song.getTitle().equals(title)) {
				return song;
			}
		}
		return null;
	}

	public boolean addToPlayList(String title, LinkedList<Song> playlist) {
		Song song = this.findSong(title);
		if (song != null) {
			if (playlist.contains(song)) {
				return false;
			} else {
				playlist.add(song);
				return true;
			}
		} else {
			return false;
		}
	}

	public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
		int index = trackNumber - 1;
		if ((index >= 0) && (index < this.songs.size())) {
			// If the index is in between our songs list size,
			// we know there exists a song in this album
			// correcponding to the index
			// hence we add that song
			Song song = this.songs.get(trackNumber - 1);
			if (playlist.contains(song)) {
				return false;
			} else {
				playlist.add(song);
				return true;
			}
		} else {
			// if the index is out of songs size,
			// return false.
			return false;
		}
	}
}

class Song {
	private String title;
	private double duration;

	public Song(String title, double duration) {
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return this.title;
	}

	public String toString() {
		return this.title + ":  " + this.duration;
	}
}
