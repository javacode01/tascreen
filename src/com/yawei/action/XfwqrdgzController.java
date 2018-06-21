package com.yawei.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.utils.Const;
import com.mobile.utils.ResultData;
import com.yawei.service.gsyw.XfwqrdgzService;

/**
 * 消费维权热点关注
 * @author Administrator
 *
 */
@RestController
public class XfwqrdgzController {
	
	private static final Logger logger = Logger.getLogger(XfwqrdgzController.class);
	@Autowired
	private XfwqrdgzService xfwqrdgzSerivce;
	
	/**
	 * 获取消费维权总览数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/xfwqrdgz/getXfwqzlData",method=RequestMethod.GET,produces="application/json")
	public ResultData getXfwqzlData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = xfwqrdgzSerivce.getXfwqzlData();
			rd.setCode(Const.SUCCESS);
			rd.setResult(result);
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
			rd.setCode(Const.SYS_ERROR);
			rd.setResult(Const.SYS_ERROR_DESCRIPTION);
		}
		return rd;
	}
	
	/**
	 * 获取投诉问题分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/xfwqrdgz/getTswtfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getTswtfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			String type = request.getParameter("type");
			Map<String,Object> result = xfwqrdgzSerivce.getTswtfxData(type);
			rd.setCode(Const.SUCCESS);
			rd.setResult(result);
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
			rd.setCode(Const.SYS_ERROR);
			rd.setResult(Const.SYS_ERROR_DESCRIPTION);
		}
		return rd;
	}
	
	/**
	 * 获取各区投诉举报分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/xfwqrdgz/getGqtsjbfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getGqtsjbfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = xfwqrdgzSerivce.getGqtsjbfxData();
			rd.setCode(Const.SUCCESS);
			rd.setResult(result);
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
			rd.setCode(Const.SYS_ERROR);
			rd.setResult(Const.SYS_ERROR_DESCRIPTION);
		}
		return rd;
	}
	
	/**
	 * 获取举报问题分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/xfwqrdgz/getJbwtfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getJbwtfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = xfwqrdgzSerivce.getJbwtfxData();
			rd.setCode(Const.SUCCESS);
			rd.setResult(result);
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
			rd.setCode(Const.SYS_ERROR);
			rd.setResult(Const.SYS_ERROR_DESCRIPTION);
		}
		return rd;
	}
	
	/**
	 * 获取举报问题总体分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/xfwqrdgz/getJbwtfxZtData",method=RequestMethod.GET,produces="application/json")
	public ResultData getJbwtfxZtData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = xfwqrdgzSerivce.getJbwtfxZtData();
			rd.setCode(Const.SUCCESS);
			rd.setResult(result);
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
			rd.setCode(Const.SYS_ERROR);
			rd.setResult(Const.SYS_ERROR_DESCRIPTION);
		}
		return rd;
	}
}
