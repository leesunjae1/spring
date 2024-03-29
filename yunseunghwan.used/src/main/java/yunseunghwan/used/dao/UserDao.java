package yunseunghwan.used.dao;

import java.util.List;

import yunseunghwan.used.domain.User;
import yunseunghwan.used.domain.UserDto;

public interface UserDao {
	User loginUser(User user);
	UserDto findId(UserDto user);
	UserDto findPw(UserDto user);
	UserDto checkUserId(UserDto user);
	UserDto checkUserNickName(UserDto user);
	UserDto checkUserPw(UserDto user);
	List<User> selectUsers();
	User selectUser(String userId);
	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(String userId);
}
