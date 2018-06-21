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
import com.yawei.service.gsyw.ScztryhlfxService;

/**
 * 市场主体人员活力分析
 * @author Administrator
 *
 */
@RestController
public class ScztryhlfxController {
	
	private static final Logger logger = Logger.getLogger(ScztryhlfxController.class);
	@Autowired
	private ScztryhlfxService scztryhlfxSerivce;
	
	/**
	 * 获取企业家每百人性别分布数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztryhlfx/getQyjmbrxbfbData",method=RequestMethod.GET,produces="application/json")
	public ResultData getQyjmbrxbfbData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> result = scztryhlfxSerivce.getQyjmbrxbfbData();
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
	 * 获取企业家每百地区分布数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztryhlfx/getQyjmbrdqfbData",method=RequestMethod.GET,produces="application/json")
	public ResultData getQyjmbrdqfbData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztryhlfxSerivce.getQyjmbrdqfbData();
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
	 * 获取企业家年龄分布数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztryhlfx/getQyjnlfbData",method=RequestMethod.GET,produces="application/json")
	public ResultData getQyjnlfbData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztryhlfxSerivce.getQyjnlfbData();
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
	 * 获取企业家学历分布数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztryhlfx/getQyjxlfbData",method=RequestMethod.GET,produces="application/json")
	public ResultData getQyjxlfbData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> result = scztryhlfxSerivce.getQyjxlfbData();
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
	 * 获取每百人企业家性别、年龄总览
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztryhlfx/getMbrqyjxbnlzlData",method=RequestMethod.GET,produces="application/json")
	public ResultData getMbrqyjxbnlzlData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object>result = scztryhlfxSerivce.getMbrqyjxbnlzlData();
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
