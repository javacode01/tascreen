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
import com.yawei.service.gsyw.GsywssService;
import com.yawei.service.gsywfh.GsywssFhService;

/**
 * 工商业务实时监控数据接口
 * @author Administrator
 *
 */
@RestController
public class GsywssController {
	
	private static final Logger logger = Logger.getLogger(GsywssController.class);
	@Autowired
	private GsywssFhService gsywssFhService;
	@Autowired
	private GsywssService gsywssService;
	
	/**
	 * 获取今日登记排行榜数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/gsywss/getDjphbData",method=RequestMethod.GET,produces="application/json")
	public ResultData getDjphbData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = gsywssFhService.getDjphbData();
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
	 * 获取名称预核准数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/gsywss/getMcyhzData",method=RequestMethod.GET,produces="application/json")
	public ResultData getMcyhzData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> list = gsywssFhService.getMcyhzData();
			rd.setCode(Const.SUCCESS);
			rd.setResult(list);
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
			rd.setCode(Const.SYS_ERROR);
			rd.setResult(Const.SYS_ERROR_DESCRIPTION);
		}
		return rd;
	}
	
	/**
	 * 获取设立登记数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/gsywss/getSldjData",method=RequestMethod.GET,produces="application/json")
	public ResultData getSldjData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> list = gsywssFhService.getSldjData();
			rd.setCode(Const.SUCCESS);
			rd.setResult(list);
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
			rd.setCode(Const.SYS_ERROR);
			rd.setResult(Const.SYS_ERROR_DESCRIPTION);
		}
		return rd;
	}
	
	/**
	 * 获取其他登记数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/gsywss/getQtdjData",method=RequestMethod.GET,produces="application/json")
	public ResultData getQtdjData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> list = gsywssFhService.getQtdjData();
			rd.setCode(Const.SUCCESS);
			rd.setResult(list);
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
			rd.setCode(Const.SYS_ERROR);
			rd.setResult(Const.SYS_ERROR_DESCRIPTION);
		}
		return rd;
	}
	
	/**
	 * 获取年报监控数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/gsywss/getNbjkData",method=RequestMethod.GET,produces="application/json")
	public ResultData getNbjkData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> list = gsywssService.getNbjkData();
			rd.setCode(Const.SUCCESS);
			rd.setResult(list);
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
			rd.setCode(Const.SYS_ERROR);
			rd.setResult(Const.SYS_ERROR_DESCRIPTION);
		}
		return rd;
	}
	
	/**
	 * 获取执法办案情况数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/gsywss/getZfbaqkData",method=RequestMethod.GET,produces="application/json")
	public ResultData getZfbaqkData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Object> list = gsywssService.getZfbaqkData();
			rd.setCode(Const.SUCCESS);
			rd.setResult(list);
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
			rd.setCode(Const.SYS_ERROR);
			rd.setResult(Const.SYS_ERROR_DESCRIPTION);
		}
		return rd;
	}
	
	/**
	 * 获取消保维权数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/gsywss/getXbwqData",method=RequestMethod.GET,produces="application/json")
	public ResultData getXbwqData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> list = gsywssService.getXbwqData();
			rd.setCode(Const.SUCCESS);
			rd.setResult(list);
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
			rd.setCode(Const.SYS_ERROR);
			rd.setResult(Const.SYS_ERROR_DESCRIPTION);
		}
		return rd;
	}
	
}
