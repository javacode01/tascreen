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
import com.yawei.service.gsyw.ScztzsfxService;

/**
 * 市场主体走势分析
 * @author Administrator
 *
 */
@RestController
public class ScztzsfxController {
	
	private static final Logger logger = Logger.getLogger(ScztzsfxController.class);
	@Autowired
	private ScztzsfxService scztzsfxService;
	
	/**
	 * 获取市场主体走势分析数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztzsfx/getScztzsfxData",method=RequestMethod.GET,produces="application/json")
	public ResultData getScztzsfxData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			String type = request.getParameter("type");
			String entcat = request.getParameter("entcat");
			Map<String,Object> result = scztzsfxService.getScztzsfxData(type,entcat);
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
