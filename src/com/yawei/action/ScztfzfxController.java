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
import com.yawei.service.gsyw.ScztfzfxService;

/**
 * 市场主体发展分析
 * @author Administrator
 *
 */
@RestController
public class ScztfzfxController {
	
	private static final Logger logger = Logger.getLogger(ScztfzfxController.class);
	@Autowired
	private ScztfzfxService scztfzfxService;
	
	/**
	 * 获取期末主体发展趋势数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztfzfx/getQmztfzqsData",method=RequestMethod.GET,produces="application/json")
	public ResultData getQmztfzqsData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			String type = request.getParameter("type");
			Map<String,Object> result = scztfzfxService.getQmztfzqsData(type);
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
	 * 获取主体同比增长排行榜数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztfzfx/getZttbzzData",method=RequestMethod.GET,produces="application/json")
	public ResultData getZttbzzData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			String entcat = request.getParameter("entcat");
			Map<String,Object> result = scztfzfxService.getZttbzzData(entcat);
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
	 * 获取主体类别发展分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztfzfx/getZtlbfzfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getZtlbfzfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			String entcat = request.getParameter("entcat");
			Map<String,Object> result = scztfzfxService.getZtlbfzfxData(entcat);
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
	 * 获取行业同比增长量数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztfzfx/getHytbzzlData",method=RequestMethod.GET,produces="application/json")
	public ResultData getHytbzzlData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> result = scztfzfxService.getHytbzzlData();
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
