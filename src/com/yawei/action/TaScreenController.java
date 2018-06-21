package com.yawei.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 获取页面
 * @author Administrator
 *
 */
@Controller
public class TaScreenController {
	
	/**
	 * 获取导航页
	 * @return
	 */
	@RequestMapping(value="/toMain",method=RequestMethod.GET)
	public String toMain() {
		return "jsp/tascreen/main";
	}
	
	/**
	 * 获取工商业务实时监控页
	 * @return
	 */
	@RequestMapping(value="/toGsywssjk",method=RequestMethod.GET)
	public String toGsywssjk() {
		return "jsp/tascreen/gsywssjk";
	}
	
	/**
	 * 获取市场主体信息总览页
	 * @return
	 */
	@RequestMapping(value="/toScztxxzl",method=RequestMethod.GET)
	public String toScztxxzl() {
		return "jsp/tascreen/scztxxzl";
	}
	
	/**
	 * 获取市场主体发展分析页
	 * @return
	 */
	@RequestMapping(value="/toScztfzfx",method=RequestMethod.GET)
	public String toScztfzfx() {
		return "jsp/tascreen/scztfzfx";
	}
	
	/**
	 * 获取市场主体走势分析页
	 * @return
	 */
	@RequestMapping(value="/toScztzsfx",method=RequestMethod.GET)
	public String toScztzsfx() {
		return "jsp/tascreen/scztzsfx";
	}
	
	/**
	 * 获取市场主体发展分布图页
	 * @return
	 */
	@RequestMapping(value="/toScztfzfbt",method=RequestMethod.GET)
	public String toScztfzfbt() {
		return "jsp/tascreen/scztfzfbt";
	}
	
	/**
	 * 获取市场主体年龄结构分布页
	 * @return
	 */
	@RequestMapping(value="/toScztnljgfb",method=RequestMethod.GET)
	public String toScztnljgfb() {
		return "jsp/tascreen/scztnljgfb";
	}
	
	/**
	 * 获取市场主体资金来（国内）源分析页
	 * @return
	 */
	@RequestMapping(value="/toScztzjlyfx",method=RequestMethod.GET)
	public String toScztzjlyfx() {
		return "jsp/tascreen/scztzjlyfx";
	}
	
	/**
	 * 获取市场主体资金来（境外）源分析页
	 * @return
	 */
	@RequestMapping(value="/toScztzjlyjwfx",method=RequestMethod.GET)
	public String toScztzjlyjwfx() {
		return "jsp/tascreen/scztzjlyjwfx";
	}
	
	/**
	 * 获取市场主体人员活力分析页
	 * @return
	 */
	@RequestMapping(value="/toScztryhlfx",method=RequestMethod.GET)
	public String toScztryhlfx() {
		return "jsp/tascreen/scztryhlfx";
	}
	
	/**
	 * 获取市场主体年报总结页
	 * @return
	 */
	@RequestMapping(value="/toScztnbzj",method=RequestMethod.GET)
	public String toScztnbzj() {
		return "jsp/tascreen/scztnbzj";
	}
	
	/**
	 * 获取执法办案数据分析页
	 * @return
	 */
	@RequestMapping(value="/toZfbasjfx",method=RequestMethod.GET)
	public String toZfbasjfx() {
		return "jsp/tascreen/zfbasjfx";
	}
	
	/**
	 * 获取消保维权热点关注页
	 * @return
	 */
	@RequestMapping(value="/toXbwqrdgz",method=RequestMethod.GET)
	public String toXbwqrdgz() {
		return "jsp/tascreen/xbwqrdgz";
	}
	
	/**
	 * 获取服务发展专题分析页
	 * @return
	 */
	@RequestMapping(value="/toFwfzztfx",method=RequestMethod.GET)
	public String toFwfzztfx() {
		return "jsp/tascreen/fwfzztfx";
	}
	
	/**
	 * 获取区县非公党建分析页
	 * @return
	 */
	@RequestMapping(value="/toQxfgdjfx",method=RequestMethod.GET)
	public String toQxfgdjfx() {
		return "jsp/tascreen/qxfgdjfx";
	}
	
	/**
	 * 获取四新经济发展分析页
	 * @return
	 */
	@RequestMapping(value="/toSxjjfzfx",method=RequestMethod.GET)
	public String toSxjjfzfx() {
		return "jsp/tascreen/sxjjfzfx";
	}
	
}
