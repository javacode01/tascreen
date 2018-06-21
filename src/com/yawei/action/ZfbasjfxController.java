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
import com.yawei.service.gsyw.ZfbasjfxService;

/**
 * 执法办案数据分析
 * @author Administrator
 *
 */
@RestController
public class ZfbasjfxController {
	
	private static final Logger logger = Logger.getLogger(ZfbasjfxController.class);
	@Autowired
	private ZfbasjfxService zfbasjfxSerivce;
	
	/**
	 * 获取案件类型分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/zfbasjfx/getAjlxfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getAjlxfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = zfbasjfxSerivce.getAjlxfxData();
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
	 * 获取案件趋势数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/zfbasjfx/getAjqsfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getAjqsfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = zfbasjfxSerivce.getAjqsfxData();
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
	 * 获取各区县执法数据分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/zfbasjfx/getGqxzfsjfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getGqxzfsjfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> result = zfbasjfxSerivce.getGqxzfsjfxData();
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
	 * 获取年度数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/zfbasjfx/getNdData",method=RequestMethod.GET,produces="application/json")
	public ResultData getNdData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> result = zfbasjfxSerivce.getNdData();
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
