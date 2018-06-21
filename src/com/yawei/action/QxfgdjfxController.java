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
import com.yawei.service.gsyw.QxfgdjfxService;

/**
 * 区县非公党建分析
 * @author Administrator
 *
 */
@RestController
public class QxfgdjfxController {
	
	private static final Logger logger = Logger.getLogger(QxfgdjfxController.class);
	@Autowired
	private QxfgdjfxService qxfgdjfxService;
	
	/**
	 * 获取全市党组织建设总览数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/qxfgdjfx/getQsdzzjszlData",method=RequestMethod.GET,produces="application/json")
	public ResultData getQsdzzjszlData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = qxfgdjfxService.getQsdzzjszlData();
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
	 * 获取各区县党组织建设总览数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/qxfgdjfx/getGqxdzzjszlData",method=RequestMethod.GET,produces="application/json")
	public ResultData getGqxdzzjszlData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = qxfgdjfxService.getGqxdzzjszlData();
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
	 * 获取各区县党组织排行榜数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/qxfgdjfx/getQxdzzphbData",method=RequestMethod.GET,produces="application/json")
	public ResultData getQxdzzphbData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> result = qxfgdjfxService.getQxdzzphbData();
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
	 * 获取各区县党员人数排行榜数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/qxfgdjfx/getQxdyrsphbData",method=RequestMethod.GET,produces="application/json")
	public ResultData getQxdyrsphbData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> result = qxfgdjfxService.getQxdyrsphbData();
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
	 * 获取党组织增长趋势数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/qxfgdjfx/getDzzzzqsData",method=RequestMethod.GET,produces="application/json")
	public ResultData getDzzzzqsData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = qxfgdjfxService.getDzzzzqsData();
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
	 * 获取党员人数增长趋势数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/qxfgdjfx/getDyrszzqsData",method=RequestMethod.GET,produces="application/json")
	public ResultData getDyrszzqsData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = qxfgdjfxService.getDyrszzqsData();
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
