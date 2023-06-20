package com.ceomarin.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.stereotype.Service;

import com.ceomarin.lookify.models.Song;
import com.ceomarin.lookify.repositories.SongsRepository;

@Service
public class SongService {

	@Autowired
	private SongsRepository songsRepository;
	
	public List<Song> canciones(){
		return songsRepository.findAll();
	}
	
	public Song cancion(Long id) {
		Optional<Song> optionalSong = songsRepository.findById(id);
		if (optionalSong.isPresent()) {
			return optionalSong.get();
		}else {
			return null;			
		}
	}
	
	public void delete(Long id) {
		Optional<Song> optionalSong = songsRepository.findById(id);
		if(optionalSong.isPresent()) {
			songsRepository.deleteById(id);
		}
	}
	
	public Song create(Song s) {
		return songsRepository.save(s);
	}
	
	public List<Song> cancionesOrderBy(){
		return songsRepository.findTop10ByOrderByRatingDesc();
	}
}
