package com.mengke.web.banner;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.mengke.bean.Content;
import com.mengke.bean.Param;
import com.mengke.mapper.banner.IBannerMapper;

@Controller
@RequestMapping("/admin")
public class BannerController {
	@Autowired
	private IBannerMapper bannerMapper;
	/**
	 * 
	 * 访问页面<br/>
	 * 方法名：list<br/>
	 * 创建人：xiaojian <br/>
	 * 时间：2017年11月3日-上午9:57:39 <br/>
	 * 手机:15575346520<br/>
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/banlist")
	public String list(Model model){
		//查询总数
		int count = bannerMapper.sumContents();
		model.addAttribute("count",count);
		return "banner/bannerList";
	}
	
	/**
	 * 
	 * 分页的方法<br/>
	 * 方法名：tmplate<br/>
	 * 创建人：xiaojian <br/>
	 * 时间：2017年11月6日-下午4:43:52 <br/>
	 * 手机:15575346520<br/>
	 * @param param
	 * @return ModelAndView<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 *
	 */
	@RequestMapping(value="/temp",method=RequestMethod.POST)
	public ModelAndView tmplate(Param param){
		ModelAndView modelAndView = new ModelAndView();
		List<Content> contents = bannerMapper.findContents(param);
		modelAndView.addObject("contents", contents);
		modelAndView.setViewName("banner/template");
		return modelAndView;
	}
	
	/**
	 * 
	 * 访问添加页面<br/>
	 * 方法名：add<br/>
	 * 创建人：xiaojian <br/>
	 * 时间：2017年11月8日-上午10:06:04 <br/>
	 * 手机:15575346520<br/>
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/add")
	public String add(){
		return "banner/add";
	}
	
	/**
	 * 
	 * 添加的方法<br/>
	 * 方法名：addBanner<br/>
	 * 创建人：xiaojian <br/>
	 * 时间：2017年11月9日-上午10:43:20 <br/>
	 * 手机:15575346520<br/>
	 * @param content
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@ResponseBody
	@RequestMapping(value="/addBanner",method=RequestMethod.POST)
	public String addBanner(Content content){
		int num = bannerMapper.save(content);
		if(num>0){
			return "success";
		}else {
			return "fail";
		}	
	}
	
	/**
	 * 
	 * 修改方法<br/>
	 * 方法名：delBanner<br/>
	 * 创建人：xiaojian <br/>
	 * 时间：2017年11月9日-上午10:43:38 <br/>
	 * 手机:15575346520<br/>
	 * @param id
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@ResponseBody
	@RequestMapping(value="/delBanner/{id}",method=RequestMethod.POST)
	public String delBanner(@PathVariable("id")Integer id){
		int num = bannerMapper.delBanner(id);
		if(num>0){
			return "success";
		}else {
			return "fail";
		}
	}
	
	/**
	 * 
	 * 修改的方法<br/>
	 * 方法名：upBanner<br/>
	 * 创建人：xiaojian <br/>
	 * 时间：2017年11月9日-下午7:08:59 <br/>
	 * 手机:15575346520<br/>
	 * @param content
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@ResponseBody
	@RequestMapping(value="/upBanner",method=RequestMethod.POST)
	public String upBanner(Content content){
		int num = bannerMapper.updateBanner(content);
		if(num>0){
			return "success";
		}else {
			return "fail";
		}
	}
}
