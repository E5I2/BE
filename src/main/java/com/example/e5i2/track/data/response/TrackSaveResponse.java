package com.example.e5i2.track.data.response;

import java.time.LocalTime;

import com.example.e5i2.track.domain.TrackType;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record TrackSaveResponse(
	Long userId,
	Double distance,
	LocalTime trackTime,
	TrackType trackType,
	Integer steps,
	Integer calories,
	Integer heartRate,
	LocalTime pace
) {
}
