package com.mengke.mapper.banner;

import java.util.List;

import com.mengke.bean.Content;
import com.mengke.bean.Param;

public interface IBannerMapper {
	/**
	 * 
	 * 查询出轮播图并分页<br/>
	 * 方法名：findContents<br/>
	 * 创建人：xiaojian <br/>
	 * 时间：2017年11月2日-上午11:31:07 <br/>
	 * 手机:15575346520<br/>
	 * @return List<Content><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public List<Content> findContents(Param param);
	
	/**
	 * 
	 * 查询总数<br/>
	 * 方法名：sumContents<br/>
	 * 创建人：xiaojian <br/>
	 * 时间：2017年11月4日-下午5:42:49 <br/>
	 * 手机:15575346520<br/>
	 * @return int<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public int sumContents();
	
	/**
	 * 
	 * 添加的方法<br/>
	 * 方法名：save<br/>
	 * 创建人：xiaojian <br/>
	 * 时间：2017年11月7日-下午12:03:49 <br/>
	 * 手机:15575346520<br/>
	 * @return int<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public int save(Content content);
	/**
	 * 
	 * 删除的方法<br/>
	 * 方法名：delBanner<br/>
	 * 创建人：xiaojian <br/>
	 * 时间：2017年11月8日-下午6:36:51 <br/>
	 * 手机:15575346520<br/>
	 * @param id
	 * @return int<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public int delBanner(@org.apache.ibatis.annotations.Param("id") Integer id);
	
	/**
	 * 
	 * 修改的方法<br/>
	 * 方法名：updateBanner<br/>
	 * 创建人：xiaojian <br/>
	 * 时间：2017年11月9日-上午10:20:42 <br/>
	 * 手机:15575346520<br/>
	 * @param content
	 * @return int<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public int updateBanner(Content content);
}
