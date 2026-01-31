package com.example.e5i2.track.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.e5i2.track.domain.Track;

public interface TrackRepository extends JpaRepository<Track, Long> {
	List<Track> findAllByUserId(Long userId);
}
