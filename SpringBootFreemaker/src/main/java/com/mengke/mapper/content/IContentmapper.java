package com.mengke.mapper.content;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.servlet.mvc.condition.ParamsRequestCondition;

import com.mengke.bean.Content;
import com.mengke.bean.Params;

public interface IContentmapper {
	/**
	 * 
	 * 查询<br/>
	 * 方法名：findContent<br/>
	 * 创建人：WXQ <br/>
	 * 时间：2017年11月3日-上午10:57:11 <br/>
	 * 手机:1564545646464<br/>
	 * @return List<Content><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public List<HashMap<String,Object>> findContent(Params param);
	
	/**
	 * 
	 * 查询总条数<br/>
	 * 方法名：Contsums<br/>
	 * 创建人：WXQ <br/>
	 * 时间：2017年11月9日-下午11:25:36 <br/>
	 * 手机:1564545646464<br/>
	 * @return int<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public int Contsums();
	
	/**
	 * 
	 * 删除的方法<br/>
	 * 方法名：delBanner<br/>
	 * 创建人：WXQ <br/>
	 * 时间：2017年11月12日-下午11:37:57 <br/>
	 * 手机:1564545646464<br/>
	 * @param id
	 * @return int<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public int delcontent(@org.apache.ibatis.annotations.Param("id") Integer id);
}
