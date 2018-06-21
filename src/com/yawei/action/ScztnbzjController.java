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
import com.yawei.service.gsyw.ScztnbzjService;

/**
 * 市场主体年报总结
 * @author Administrator
 *
 */
@RestController
public class ScztnbzjController {
	
	private static final Logger logger = Logger.getLogger(ScztnbzjController.class);
	@Autowired
	private ScztnbzjService scztnbzjSerivce;
	
	/**
	 * 获取各辖区年报情况数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztnbzj/getGxqnbqkData",method=RequestMethod.GET,produces="application/json")
	public ResultData getGxqnbqkData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztnbzjSerivce.getGxqnbqkData();
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
	 * 获取年度全市年报情况数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztnbzj/getNdqsnbqkData",method=RequestMethod.GET,produces="application/json")
	public ResultData getNdqsnbqkData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztnbzjSerivce.getNdqsnbqkData();
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
	 * 获取年度纳税额数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztnbzj/getNdnseData",method=RequestMethod.GET,produces="application/json")
	public ResultData getNdnseData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztnbzjSerivce.getNdnseData();
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
	 * 获取年度利润额数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztnbzj/getNdlreData",method=RequestMethod.GET,produces="application/json")
	public ResultData getNdlreData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztnbzjSerivce.getNdlreData();
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
	 * 获取党组织建设情况数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztnbzj/getDzzjsqkData",method=RequestMethod.GET,produces="application/json")
	public ResultData getDzzjsqkData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztnbzjSerivce.getDzzjsqkData();
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
