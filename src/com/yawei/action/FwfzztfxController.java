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
import com.yawei.service.gsyw.FwfzztfxService;

/**
 * 服务发展专题分析
 * @author Administrator
 *
 */
@RestController
public class FwfzztfxController {
	
	private static final Logger logger = Logger.getLogger(FwfzztfxController.class);
	@Autowired
	private FwfzztfxService fwfzztfxService;
	
	/**
	 * 获取各区县注册商标数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/fwfzztfx/getGqxzcsbData",method=RequestMethod.GET,produces="application/json")
	public ResultData getGqxzcsbData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = fwfzztfxService.getGqxzcsbData();
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
	 * 获取守重企业数据分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/fwfzztfx/getSzqysjfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getSzqysjfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = fwfzztfxService.getSzqysjfxData();
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
	 * 获取注册商标趋势分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/fwfzztfx/getZcsbqsfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getZcsbqsfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = fwfzztfxService.getZcsbqsfxData();
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
	 * 获取助企融资-股权出质数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/fwfzztfx/getZqrzGqczData",method=RequestMethod.GET,produces="application/json")
	public ResultData getZqrzGqczData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = fwfzztfxService.getZqrzGqczData();
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
	 * 获取助企融资-动产抵押数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/fwfzztfx/getZqrzDcdyData",method=RequestMethod.GET,produces="application/json")
	public ResultData getZqrzDcdyData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = fwfzztfxService.getZqrzDcdyData();
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
	 * 获取助企融资-商标权质押数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/fwfzztfx/getZqrzSbqzyData",method=RequestMethod.GET,produces="application/json")
	public ResultData getZqrzSbqzyData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = fwfzztfxService.getZqrzSbqzyData();
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
