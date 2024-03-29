package com.my.date.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.date.dao.map.FeedMap;
import com.my.date.domain.Feed;
import com.my.date.domain.FeedDto;

@Repository
public class FeedDaoImpl implements FeedDao{
	@Autowired private FeedMap feedMap;
	
	@Override
	public List<FeedDto> selectFeeds() {
		return feedMap.selectFeeds();
	}
	
	@Override
	public List<FeedDto> selectMyFeeds(int feedId) {
		return feedMap.selectMyFeeds(feedId);
	}
	
	@Override
	public FeedDto selectFeed(int feedId) {
		return feedMap.selectFeed(feedId);
	}
	
	@Override
	public int insertFeed(Feed feed) {
		return feedMap.insertFeed(feed);
	}
	
	@Override
	public int updateFeed(Feed feed) {
		return feedMap.updateFeed(feed);
	}
	
	@Override
	public int deleteFeed(int feedId, int userId) {
		return feedMap.deleteFeed(feedId, userId);	
	}
}