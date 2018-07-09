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
import com.yawei.service.gsyw.ScztzjlyfxService;

/**
 * 市场主体资金来源（国内）分析
 * @author Administrator
 *
 */
@RestController
public class ScztzjlyfxController {
	
	private static final Logger logger = Logger.getLogger(ScztzjlyfxController.class);
	@Autowired
	private ScztzjlyfxService scztzjlyfxService;
	
	/**
	 * 获取投资金额排行数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztzjlyfx/getTzjephData",method=RequestMethod.GET,produces="application/json")
	public ResultData getTzjephData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztzjlyfxService.getTzjephData();
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
	@RequestMapping(value="/scztzjlyfx/getTzjephTableData",method=RequestMethod.GET,produces="application/json")
	public ResultData getTzjephTableData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztzjlyfxService.getTzjephTableData();
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
	@RequestMapping(value="/scztzjlyfx/getTzjephAllData",method=RequestMethod.GET,produces="application/json")
	public ResultData getTzjephAllData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> result = scztzjlyfxService.getTzjephAllData();
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
	 * 获取投资行业分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztzjlyfx/getTzhyfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getTzhyfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			List<Map<String,Object>> result = scztzjlyfxService.getTzhyfxData();
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
	 * 获取投资趋势分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztzjlyfx/getTzqsfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getTzqsfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztzjlyfxService.getTzqsfxData();
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
	 * 获取投资户数排行数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztzjlyfx/getTzjephhsData",method=RequestMethod.GET,produces="application/json")
	public ResultData getTzjephhsData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztzjlyfxService.getTzjephhsData();
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
	@RequestMapping(value="/scztzjlyfx/getTzjephhsTableData",method=RequestMethod.GET,produces="application/json")
	public ResultData getTzjephhsTableData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			Map<String,Object> result = scztzjlyfxService.getTzjephhsTableData();
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
