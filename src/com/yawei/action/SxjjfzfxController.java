package com.yawei.action;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.yawei.service.gsyw.SxjjfzfxService;

/**
 * 四新经济发展分析
 * @author Administrator
 *
 */
@RestController
public class SxjjfzfxController {
	
	private static final Logger logger = Logger.getLogger(SxjjfzfxController.class);
	@Autowired
	private SxjjfzfxService sxjjfzfxService;

}
