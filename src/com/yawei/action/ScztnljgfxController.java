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
import com.yawei.service.gsyw.ScztnljgfxService;

@RestController
public class ScztnljgfxController {
	
	private static final Logger logger = Logger.getLogger(ScztnljgfxController.class);
	@Autowired
	private ScztnljgfxService scztnljgfxSerivce;
	
	/**
	 * 获取产业分布数量
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztnljgfx/getQynlzbData",method=RequestMethod.GET,produces="application/json")
	public ResultData getQynlzbData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			String entcat = request.getParameter("entcat");
			Map<String,Object> result = scztnljgfxSerivce.getQynlzbData(entcat);
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
	 * 获取长寿企业行业分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztnljgfx/getCsqyhyfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getCsqyhyfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			String type = request.getParameter("type");
			List<Map<String,Object>> result = scztnljgfxSerivce.getCsqyhyfxData(type);
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
	 * 获取长寿企业追踪分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztnljgfx/getCsqyzzfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getCsqyzzfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztnljgfxSerivce.getCsqyzzfxData();
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
