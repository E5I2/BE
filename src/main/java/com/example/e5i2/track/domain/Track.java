package com.example.e5i2.track.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tracks")
public class Track {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "user_id", nullable = false)
	private Long userId;

	@Column(name = "distance", nullable = false)
	private Double distance; // 러닝 거리 (예: 8.70)

	@Column(name = "track_time", nullable = false)
	private LocalTime trackTime; // 총 러닝 시간 (예: 00:50:00)

	@Enumerated(EnumType.STRING)
	@Column(name = "track_type", nullable = false)
	private TrackType trackType; // 캐릭터 타입 (예: CAT, DOG)

	@Column(name = "steps")
	private Integer steps; // 걸음 수 (예: 11242)

	@Column(name = "calories")
	private Integer calories; // 소모 칼로리 (예: 375)

	@Column(name = "heart_rate")
	private Integer heartRate; // 평균 심박수 (예: 133)

	@Column(name = "pace")
	private LocalTime pace; // 평균 페이스 (예: 00:08:01)

	@Builder(access = AccessLevel.PRIVATE)
	private Track(
		Long userId,
		Double distance,
		LocalTime trackTime,
		TrackType trackType,
		Integer steps,
		Integer calories,
		Integer heartRate,
		LocalTime pace
	) {
		this.userId = userId;
		this.distance = distance;
		this.trackTime = trackTime;
		this.trackType = trackType;
		this.steps = steps;
		this.calories = calories;
		this.heartRate = heartRate;
		this.pace = pace;
	}

	/**
	 * 트랙 생성을 위한 정적 팩토리 메서드
	 */
	public static Track createTrack(
		Long userId,
		Double distance,
		LocalTime trackTime,
		TrackType trackType,
		Integer steps,
		Integer calories,
		Integer heartRate,
		LocalTime pace
	) {
		return Track.builder()
			.userId(userId)
			.distance(distance)
			.trackTime(trackTime)
			.trackType(trackType)
			.steps(steps)
			.calories(calories)
			.heartRate(heartRate)
			.pace(pace)
			.build();
	}
}