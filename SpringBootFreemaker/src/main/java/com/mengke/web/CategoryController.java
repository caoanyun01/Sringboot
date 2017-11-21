/**
 * 牛耳教育<br/>
 * com.mengke.web<br/>
 * CategoryController.java<br/>
 * 创建人:xiaojian<br/>
 * 时间：2017年11月3日-上午10:27:26 <br/>
 * 2017Tm公司-版权所有<br/>
 */
package com.mengke.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mengke.bean.Category;
import com.mengke.mapper.category.ICategorymapper;

/**
 * 进入分类页面
 * CategoryController<br/>
 * 创建人:wangziao<br/>
 * 时间：2017年11月3日-上午10:27:26 <br/>
 * @version 1.0.0<br/>
 * 
 */
@Controller
@RequestMapping("/admin")

public class CategoryController {
	
	@Autowired
	ICategorymapper categorymapper;
	
	/**
	 * 查询分类
	 * 方法名：category<br/>
	 * 创建人：wangziao<br/>
	 * 时间：2017年11月8日-上午11:53:17 <br/>
	 * 手机:88888888<br/>
	 * @param model
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/category")
	public String category(Model model){
		List<Category> categorys = categorymapper.getCategory();
		model.addAttribute("categories", categorys);
		return "category/index";
	}
	
	/**
	 * 修改分类
	 * 方法名：getId<br/>
	 * 创建人：wangziao<br/>
	 * 时间：2017年11月8日-上午11:52:48 <br/>
	 * 手机:88888888<br/>
	 * @param category
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@ResponseBody
	@RequestMapping("upcategory/{name}/{id}")
	public String getId(Category category){
		int count = categorymapper.updateCategory(category);
		if(count>0){
			return "success";
		}
		else{
			return "fail";
		}
	}
	/**
	 * 添加分类
	 * 方法名：add<br/>
	 * 创建人：wangziao<br/>
	 * 时间：2017年11月10日-上午8:41:27 <br/>
	 * 手机:88888888<br/>
	 * @param category
	 * @return Category<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@ResponseBody
	@RequestMapping("addcategory")
	public Category add(Category category){
		int add = categorymapper.addCategory(category);
		if(add>0){
			return category;
		}else{
			return null;
		}
	}
}
