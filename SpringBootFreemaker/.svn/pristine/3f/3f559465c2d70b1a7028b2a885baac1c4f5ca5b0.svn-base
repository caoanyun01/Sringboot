package com.mengke.web;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mengke.bean.Comment;
import com.mengke.bean.Param;
import com.mengke.mapper.comment.ICommentMapper;



@RequestMapping
@Controller
public class CommentController {
	@Autowired
	private ICommentMapper ICommentMapper;
	/**
	 * 
	 * (评论页面)<br/>
	 * 方法名：comment<br/>
	 * 创建人：曹安匀 <br/>
	 * 时间：2017年11月8日-下午10:36:37 <br/>
	 * 手机:17608418601<br/>
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/comment")
	public ModelAndView comment(Comment comment){
		ModelAndView modelAndView=new ModelAndView();
		List<Comment> comments=ICommentMapper.getcomment();
		modelAndView.addObject("comments",comments);
		modelAndView.setViewName("comment/index");
		return modelAndView;
	}
}
