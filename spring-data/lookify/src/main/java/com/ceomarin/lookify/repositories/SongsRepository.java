package com.ceomarin.lookify.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ceomarin.lookify.models.Song;

@Repository
public interface SongsRepository extends CrudRepository<Song,Long>{

	List<Song> findAll();
	
	Optional<Song> findById(Long id);
	
	List<Song> findTop10ByOrderByRatingDesc();
	
}
