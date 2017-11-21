package com.mengke.mapper.user;

import java.util.List;

import com.mengke.bean.User;

/**
 * 用户数据操作接口
 * @author Administrator
 *
 */
public interface IUsermapper {
	/**
	 * 获取所有用户
	 * @return
	 */
	public List<User> getUser();
	
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	public User user(User user);
}
