package com.my.date.service;

import java.util.List;

import com.my.date.domain.Feed;
import com.my.date.domain.FeedDto;

public interface FeedService {
	List<FeedDto> getFeeds();
	List<FeedDto> getMyFeeds(int feedId);
	FeedDto getFeed(int feedId);
	int addFeed(Feed feed);
	int fixFeed(Feed feed);
	int delFeed(int feedId, int userId);
}
