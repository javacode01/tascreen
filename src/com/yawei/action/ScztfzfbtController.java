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
import com.yawei.service.gsyw.ScztfzfbtService;

/**
 * 市场主体发展分布图
 * @author Administrator
 *
 */
@RestController
public class ScztfzfbtController {
	
	private static final Logger logger = Logger.getLogger(ScztfzfbtController.class);
	@Autowired
	private ScztfzfbtService scztfzfbtService;
	
	/**
	 * 获取工商所市场主体数据
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/scztfzfbt/getGssztslData",method=RequestMethod.GET,produces="application/json")
	public ResultData getScztfzfbtData(HttpServletRequest request, HttpServletResponse response) {
		ResultData rd = new ResultData();
		try {
			String startTime = request.getParameter("startTime");
			String endTime = request.getParameter("endTime");
			List<Map<String,Object>> result = scztfzfbtService.getGssztslData(startTime,endTime);
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
