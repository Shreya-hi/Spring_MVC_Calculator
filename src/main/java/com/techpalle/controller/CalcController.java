package com.techpalle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController 
{
	@RequestMapping(value="calc",params="btnAdd")
	public ModelAndView getAdd(String tbFn, String tbSn)
	{
		ModelAndView mv=new ModelAndView();
		
		//convert the string to integer
		int fn=Integer.parseInt(tbFn);
		int sn=Integer.parseInt(tbSn);
		
		//add the above 2 num and store it in variable
		int res=fn+sn;
		
		//put the result in modelandview 
		mv.addObject("result" ,res);
		
		//redirect user to display.jsp
		mv.setViewName("display.jsp");
		return mv;
	}
	
	@RequestMapping(value="calc",params="btnSub")
	public ModelAndView getSub(String tbFn, String tbSn)
	{
		ModelAndView mv=new ModelAndView();
		
		//convert the string to integer
		int fn=Integer.parseInt(tbFn);
		int sn=Integer.parseInt(tbSn);
		
		//add the above 2 num and store it in variable
		int res=fn-sn;
		
		//put the result in modelandview 
		mv.addObject("result" ,res);
		
		//redirect user to display.jsp
		mv.setViewName("display.jsp");
		return mv;
	}
	@RequestMapping(value="calc",params="btnMul")
	public ModelAndView getMul(String tbFn, String tbSn)
	{
		ModelAndView mv=new ModelAndView();
		
		//convert the string to integer
		int fn=Integer.parseInt(tbFn);
		int sn=Integer.parseInt(tbSn);
		
		//add the above 2 num and store it in variable
		int res=fn*sn;
		
		//put the result in modelandview 
		mv.addObject("result" ,res);
		
		//redirect user to display.jsp
		mv.setViewName("display.jsp");
		return mv;
	}
	
	@RequestMapping(value="calc",params="btnDiv")
	public ModelAndView getDiv(String tbFn, String tbSn)
	{
		ModelAndView mv=new ModelAndView();
		
		//convert the string to integer
		float fn=Integer.parseInt(tbFn);
		float sn=Integer.parseInt(tbSn);
		
		//add the above 2 num and store it in variable
		float res=fn/sn;
		
		//put the result in modelandview 
		mv.addObject("result" ,res);
		
		//redirect user to display.jsp
		mv.setViewName("display.jsp");
		return mv;
	}
}
