package com.my.date.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedDto {
	private int feedId;
	private int userId;
	private String title;
	private String content;
	private String profileImage;
	private String nickname;
	private LocalDate hireDate;
	private int feedLikeId;
	private int likeCnt;
	private int commentId;
	private int commentCnt;
}