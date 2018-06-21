package com.yawei.action;

import java.util.List;
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
import com.yawei.service.gsyw.ScztxxzlService;

/**
 * 市场主体信息总览数据接口
 * @author Administrator
 *
 */
@RestController
public class ScztxxzlController {
	
	private static final Logger logger = Logger.getLogger(ScztxxzlController.class);
	@Autowired
	private ScztxxzlService scztxxzlService;
	
	/**
	 * 获取根据类型获取期末和去年同期主体数量
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztxxzl/getZtslData",method=RequestMethod.GET,produces="application/json")
	public ResultData getZtzlData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			String entcat = request.getParameter("entcat");
			Map<String,Object> result = scztxxzlService.getZtzlData(entcat);
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
	 * 获取产业分布数量
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztxxzl/getCyfbData",method=RequestMethod.GET,produces="application/json")
	public ResultData getCyfbData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			String entcat = request.getParameter("entcat");
			List<Map<String,Object>> result = scztxxzlService.getCyfbData(entcat);
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
	 * 获取各区县主体数量
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztxxzl/getGqxztslData",method=RequestMethod.GET,produces="application/json")
	public ResultData getGqxztslData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			String entcat = request.getParameter("entcat");
			List<Map<String,Object>> result = scztxxzlService.getGqxztslData(entcat);
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
	 * 获取类型分布数量
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztxxzl/getLxfbData",method=RequestMethod.GET,produces="application/json")
	public ResultData getLxfbData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> result = scztxxzlService.getLxfbData();
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
	 * 获取规模分布数量
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztxxzl/getGmfbData",method=RequestMethod.GET,produces="application/json")
	public ResultData getGmfbData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			String entcat = request.getParameter("entcat");
			List<Map<String,Object>> result = scztxxzlService.getGmfbData(entcat);
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
	 * 获取主体增长趋势数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztxxzl/getZtzzqsData",method=RequestMethod.GET,produces="application/json")
	public ResultData getZtzzqsData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			String entcat = request.getParameter("entcat");
			Map<String,Object> result = scztxxzlService.getZtzzqsData(entcat);
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
