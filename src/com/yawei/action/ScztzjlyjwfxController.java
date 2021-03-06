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
import com.yawei.service.gsyw.ScztzjlyjwfxService;

/**
 * 市场主体资金来源（境外）分析
 * @author Administrator
 *
 */
@RestController
public class ScztzjlyjwfxController {
	
	private static final Logger logger = Logger.getLogger(ScztzjlyjwfxController.class);
	@Autowired
	private ScztzjlyjwfxService scztzjlyjwfxService;
	
	/**
	 * 获取投资金额排行数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztzjlyjwfx/getJwtzphData",method=RequestMethod.GET,produces="application/json")
	public ResultData getJwtzphData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztzjlyjwfxService.getTzjephjwData();
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
	 * 获取户数排行数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztzjlyjwfx/getJwtzphhsData",method=RequestMethod.GET,produces="application/json")
	public ResultData getJwtzphhsData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztzjlyjwfxService.getTzjephjwhsData();
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
	 * 获取投资金额排行表格数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztzjlyjwfx/getJwtzphTableData",method=RequestMethod.GET,produces="application/json")
	public ResultData getJwtzphTableData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztzjlyjwfxService.getTzjephTableData();
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
	 * 获取投资户数排行表格数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztzjlyjwfx/getJwtzphhsTableData",method=RequestMethod.GET,produces="application/json")
	public ResultData getJwtzphhsTableData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztzjlyjwfxService.getTzjephhsTableData();
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
	 * 获取投资金额排行全部数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztzjlyjwfx/getJwtzphAllData",method=RequestMethod.GET,produces="application/json")
	public ResultData getJwtzphAllData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> result = scztzjlyjwfxService.getTzjephAllData();
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
