package com.my.date.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.date.dao.FeedDao;
import com.my.date.domain.FeedDto;

@Service
public class FeedServiceImpl implements FeedService{
	@Autowired private FeedDao feedDao;
	
	@Override
	public List<FeedDto> getFeeds() {
		return feedDao.selectFeeds();
	}
	
	@Override
	public List<FeedDto> getMyFeeds(int feedId) {
		return feedDao.selectMyFeeds(feedId);
	}
	
	@Override
	public FeedDto getFeed(int feedId) {
		return feedDao.selectFeed(feedId);
	}
	
}
