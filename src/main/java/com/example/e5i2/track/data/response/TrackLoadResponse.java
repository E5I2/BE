package com.example.e5i2.track.data.response;

import java.util.List;

import com.example.e5i2.track.domain.TrackType;

import lombok.Builder;

@Builder
public record TrackLoadResponse(
	List<TrackType> trackTypes
) {
}
