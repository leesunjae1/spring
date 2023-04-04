package com.my.date.dao;

import java.util.List;

import com.my.date.domain.Feed;
import com.my.date.domain.FeedDto;

public interface FeedDao {
	List<FeedDto> selectFeeds();
	List<FeedDto> selectMyFeeds(int feedId);
	FeedDto selectFeed(int feedId);
	int insertFeed(Feed feed);
	int updateFeed(Feed feed);
	int deleteFeed(int feedId, int userId);
}
