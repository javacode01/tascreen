package com.yawei.model.gsywfh;

import com.sys.utils.BeanUtils;
import com.sys.utils.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class QydjJbxxZsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public QydjJbxxZsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    public List<Criteria> integratedQuery(Map queryCondationMap) {
            Criteria criteria = createCriteriaInternal();
    for(Object key : queryCondationMap.keySet()) {
		String field = ((String)key).split("@")[0];
		String opt = ((String)key).split("@")[1];
		if(((String)key).contains("between")){
         criteria.addCriterion(BeanUtils.camelToUnderline(field)+" "+opt,((String)queryCondationMap.get(key)).split(",")[0],((String)queryCondationMap.get(key)).split(",")[1],(String)key);
		}else if(((String)key).contains("IS NULL")||((String)key).contains("IS NOT NULL")){
         criteria.addCriterion(BeanUtils.camelToUnderline(field)+" "+opt);
		}else if(((String)key).contains("@IN")||((String)key).contains("@NOT IN")){
         String values = (String)queryCondationMap.get(key);
 		  List val=Arrays.asList(values.split(","));
 		  criteria.addCriterion(BeanUtils.camelToUnderline(field)+" "+opt,val,(String)key);
		}else{
         criteria.addCriterion(BeanUtils.camelToUnderline(field)+" "+opt,queryCondationMap.get(key),(String)key);
		}
    }
	 oredCriteria.add(criteria);
    return oredCriteria;

    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPripidIsNull() {
            addCriterion("PRIPID is null");
            return (Criteria) this;
        }

        public Criteria andPripidIsNotNull() {
            addCriterion("PRIPID is not null");
            return (Criteria) this;
        }

        public Criteria andPripidEqualTo(String value) {
            addCriterion("PRIPID =", value, "pripid");
            return (Criteria) this;
        }

        public Criteria andPripidNotEqualTo(String value) {
            addCriterion("PRIPID <>", value, "pripid");
            return (Criteria) this;
        }

        public Criteria andPripidGreaterThan(String value) {
            addCriterion("PRIPID >", value, "pripid");
            return (Criteria) this;
        }

        public Criteria andPripidGreaterThanOrEqualTo(String value) {
            addCriterion("PRIPID >=", value, "pripid");
            return (Criteria) this;
        }

        public Criteria andPripidLessThan(String value) {
            addCriterion("PRIPID <", value, "pripid");
            return (Criteria) this;
        }

        public Criteria andPripidLessThanOrEqualTo(String value) {
            addCriterion("PRIPID <=", value, "pripid");
            return (Criteria) this;
        }

        public Criteria andPripidLike(String value) {
            addCriterion("PRIPID like", value, "pripid");
            return (Criteria) this;
        }

        public Criteria andPripidNotLike(String value) {
            addCriterion("PRIPID not like", value, "pripid");
            return (Criteria) this;
        }

        public Criteria andPripidIn(List<String> values) {
            addCriterion("PRIPID in", values, "pripid");
            return (Criteria) this;
        }

        public Criteria andPripidNotIn(List<String> values) {
            addCriterion("PRIPID not in", values, "pripid");
            return (Criteria) this;
        }

        public Criteria andPripidBetween(String value1, String value2) {
            addCriterion("PRIPID between", value1, value2, "pripid");
            return (Criteria) this;
        }

        public Criteria andPripidNotBetween(String value1, String value2) {
            addCriterion("PRIPID not between", value1, value2, "pripid");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNull() {
            addCriterion("ENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNotNull() {
            addCriterion("ENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntnameEqualTo(String value) {
            addCriterion("ENTNAME =", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotEqualTo(String value) {
            addCriterion("ENTNAME <>", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThan(String value) {
            addCriterion("ENTNAME >", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTNAME >=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThan(String value) {
            addCriterion("ENTNAME <", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThanOrEqualTo(String value) {
            addCriterion("ENTNAME <=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLike(String value) {
            addCriterion("ENTNAME like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotLike(String value) {
            addCriterion("ENTNAME not like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameIn(List<String> values) {
            addCriterion("ENTNAME in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotIn(List<String> values) {
            addCriterion("ENTNAME not in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameBetween(String value1, String value2) {
            addCriterion("ENTNAME between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotBetween(String value1, String value2) {
            addCriterion("ENTNAME not between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnamespellIsNull() {
            addCriterion("ENTNAMESPELL is null");
            return (Criteria) this;
        }

        public Criteria andEntnamespellIsNotNull() {
            addCriterion("ENTNAMESPELL is not null");
            return (Criteria) this;
        }

        public Criteria andEntnamespellEqualTo(String value) {
            addCriterion("ENTNAMESPELL =", value, "entnamespell");
            return (Criteria) this;
        }

        public Criteria andEntnamespellNotEqualTo(String value) {
            addCriterion("ENTNAMESPELL <>", value, "entnamespell");
            return (Criteria) this;
        }

        public Criteria andEntnamespellGreaterThan(String value) {
            addCriterion("ENTNAMESPELL >", value, "entnamespell");
            return (Criteria) this;
        }

        public Criteria andEntnamespellGreaterThanOrEqualTo(String value) {
            addCriterion("ENTNAMESPELL >=", value, "entnamespell");
            return (Criteria) this;
        }

        public Criteria andEntnamespellLessThan(String value) {
            addCriterion("ENTNAMESPELL <", value, "entnamespell");
            return (Criteria) this;
        }

        public Criteria andEntnamespellLessThanOrEqualTo(String value) {
            addCriterion("ENTNAMESPELL <=", value, "entnamespell");
            return (Criteria) this;
        }

        public Criteria andEntnamespellLike(String value) {
            addCriterion("ENTNAMESPELL like", value, "entnamespell");
            return (Criteria) this;
        }

        public Criteria andEntnamespellNotLike(String value) {
            addCriterion("ENTNAMESPELL not like", value, "entnamespell");
            return (Criteria) this;
        }

        public Criteria andEntnamespellIn(List<String> values) {
            addCriterion("ENTNAMESPELL in", values, "entnamespell");
            return (Criteria) this;
        }

        public Criteria andEntnamespellNotIn(List<String> values) {
            addCriterion("ENTNAMESPELL not in", values, "entnamespell");
            return (Criteria) this;
        }

        public Criteria andEntnamespellBetween(String value1, String value2) {
            addCriterion("ENTNAMESPELL between", value1, value2, "entnamespell");
            return (Criteria) this;
        }

        public Criteria andEntnamespellNotBetween(String value1, String value2) {
            addCriterion("ENTNAMESPELL not between", value1, value2, "entnamespell");
            return (Criteria) this;
        }

        public Criteria andRegnoIsNull() {
            addCriterion("REGNO is null");
            return (Criteria) this;
        }

        public Criteria andRegnoIsNotNull() {
            addCriterion("REGNO is not null");
            return (Criteria) this;
        }

        public Criteria andRegnoEqualTo(String value) {
            addCriterion("REGNO =", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoNotEqualTo(String value) {
            addCriterion("REGNO <>", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoGreaterThan(String value) {
            addCriterion("REGNO >", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoGreaterThanOrEqualTo(String value) {
            addCriterion("REGNO >=", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoLessThan(String value) {
            addCriterion("REGNO <", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoLessThanOrEqualTo(String value) {
            addCriterion("REGNO <=", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoLike(String value) {
            addCriterion("REGNO like", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoNotLike(String value) {
            addCriterion("REGNO not like", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoIn(List<String> values) {
            addCriterion("REGNO in", values, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoNotIn(List<String> values) {
            addCriterion("REGNO not in", values, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoBetween(String value1, String value2) {
            addCriterion("REGNO between", value1, value2, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoNotBetween(String value1, String value2) {
            addCriterion("REGNO not between", value1, value2, "regno");
            return (Criteria) this;
        }

        public Criteria andOldregnoIsNull() {
            addCriterion("OLDREGNO is null");
            return (Criteria) this;
        }

        public Criteria andOldregnoIsNotNull() {
            addCriterion("OLDREGNO is not null");
            return (Criteria) this;
        }

        public Criteria andOldregnoEqualTo(String value) {
            addCriterion("OLDREGNO =", value, "oldregno");
            return (Criteria) this;
        }

        public Criteria andOldregnoNotEqualTo(String value) {
            addCriterion("OLDREGNO <>", value, "oldregno");
            return (Criteria) this;
        }

        public Criteria andOldregnoGreaterThan(String value) {
            addCriterion("OLDREGNO >", value, "oldregno");
            return (Criteria) this;
        }

        public Criteria andOldregnoGreaterThanOrEqualTo(String value) {
            addCriterion("OLDREGNO >=", value, "oldregno");
            return (Criteria) this;
        }

        public Criteria andOldregnoLessThan(String value) {
            addCriterion("OLDREGNO <", value, "oldregno");
            return (Criteria) this;
        }

        public Criteria andOldregnoLessThanOrEqualTo(String value) {
            addCriterion("OLDREGNO <=", value, "oldregno");
            return (Criteria) this;
        }

        public Criteria andOldregnoLike(String value) {
            addCriterion("OLDREGNO like", value, "oldregno");
            return (Criteria) this;
        }

        public Criteria andOldregnoNotLike(String value) {
            addCriterion("OLDREGNO not like", value, "oldregno");
            return (Criteria) this;
        }

        public Criteria andOldregnoIn(List<String> values) {
            addCriterion("OLDREGNO in", values, "oldregno");
            return (Criteria) this;
        }

        public Criteria andOldregnoNotIn(List<String> values) {
            addCriterion("OLDREGNO not in", values, "oldregno");
            return (Criteria) this;
        }

        public Criteria andOldregnoBetween(String value1, String value2) {
            addCriterion("OLDREGNO between", value1, value2, "oldregno");
            return (Criteria) this;
        }

        public Criteria andOldregnoNotBetween(String value1, String value2) {
            addCriterion("OLDREGNO not between", value1, value2, "oldregno");
            return (Criteria) this;
        }

        public Criteria andEntcatIsNull() {
            addCriterion("ENTCAT is null");
            return (Criteria) this;
        }

        public Criteria andEntcatIsNotNull() {
            addCriterion("ENTCAT is not null");
            return (Criteria) this;
        }

        public Criteria andEntcatEqualTo(String value) {
            addCriterion("ENTCAT =", value, "entcat");
            return (Criteria) this;
        }

        public Criteria andEntcatNotEqualTo(String value) {
            addCriterion("ENTCAT <>", value, "entcat");
            return (Criteria) this;
        }

        public Criteria andEntcatGreaterThan(String value) {
            addCriterion("ENTCAT >", value, "entcat");
            return (Criteria) this;
        }

        public Criteria andEntcatGreaterThanOrEqualTo(String value) {
            addCriterion("ENTCAT >=", value, "entcat");
            return (Criteria) this;
        }

        public Criteria andEntcatLessThan(String value) {
            addCriterion("ENTCAT <", value, "entcat");
            return (Criteria) this;
        }

        public Criteria andEntcatLessThanOrEqualTo(String value) {
            addCriterion("ENTCAT <=", value, "entcat");
            return (Criteria) this;
        }

        public Criteria andEntcatLike(String value) {
            addCriterion("ENTCAT like", value, "entcat");
            return (Criteria) this;
        }

        public Criteria andEntcatNotLike(String value) {
            addCriterion("ENTCAT not like", value, "entcat");
            return (Criteria) this;
        }

        public Criteria andEntcatIn(List<String> values) {
            addCriterion("ENTCAT in", values, "entcat");
            return (Criteria) this;
        }

        public Criteria andEntcatNotIn(List<String> values) {
            addCriterion("ENTCAT not in", values, "entcat");
            return (Criteria) this;
        }

        public Criteria andEntcatBetween(String value1, String value2) {
            addCriterion("ENTCAT between", value1, value2, "entcat");
            return (Criteria) this;
        }

        public Criteria andEntcatNotBetween(String value1, String value2) {
            addCriterion("ENTCAT not between", value1, value2, "entcat");
            return (Criteria) this;
        }

        public Criteria andEnttypeIsNull() {
            addCriterion("ENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEnttypeIsNotNull() {
            addCriterion("ENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEnttypeEqualTo(String value) {
            addCriterion("ENTTYPE =", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotEqualTo(String value) {
            addCriterion("ENTTYPE <>", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeGreaterThan(String value) {
            addCriterion("ENTTYPE >", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTTYPE >=", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeLessThan(String value) {
            addCriterion("ENTTYPE <", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeLessThanOrEqualTo(String value) {
            addCriterion("ENTTYPE <=", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeLike(String value) {
            addCriterion("ENTTYPE like", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotLike(String value) {
            addCriterion("ENTTYPE not like", value, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeIn(List<String> values) {
            addCriterion("ENTTYPE in", values, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotIn(List<String> values) {
            addCriterion("ENTTYPE not in", values, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeBetween(String value1, String value2) {
            addCriterion("ENTTYPE between", value1, value2, "enttype");
            return (Criteria) this;
        }

        public Criteria andEnttypeNotBetween(String value1, String value2) {
            addCriterion("ENTTYPE not between", value1, value2, "enttype");
            return (Criteria) this;
        }

        public Criteria andRegcapIsNull() {
            addCriterion("REGCAP is null");
            return (Criteria) this;
        }

        public Criteria andRegcapIsNotNull() {
            addCriterion("REGCAP is not null");
            return (Criteria) this;
        }

        public Criteria andRegcapEqualTo(BigDecimal value) {
            addCriterion("REGCAP =", value, "regcap");
            return (Criteria) this;
        }

        public Criteria andRegcapNotEqualTo(BigDecimal value) {
            addCriterion("REGCAP <>", value, "regcap");
            return (Criteria) this;
        }

        public Criteria andRegcapGreaterThan(BigDecimal value) {
            addCriterion("REGCAP >", value, "regcap");
            return (Criteria) this;
        }

        public Criteria andRegcapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGCAP >=", value, "regcap");
            return (Criteria) this;
        }

        public Criteria andRegcapLessThan(BigDecimal value) {
            addCriterion("REGCAP <", value, "regcap");
            return (Criteria) this;
        }

        public Criteria andRegcapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGCAP <=", value, "regcap");
            return (Criteria) this;
        }

        public Criteria andRegcapIn(List<BigDecimal> values) {
            addCriterion("REGCAP in", values, "regcap");
            return (Criteria) this;
        }

        public Criteria andRegcapNotIn(List<BigDecimal> values) {
            addCriterion("REGCAP not in", values, "regcap");
            return (Criteria) this;
        }

        public Criteria andRegcapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGCAP between", value1, value2, "regcap");
            return (Criteria) this;
        }

        public Criteria andRegcapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGCAP not between", value1, value2, "regcap");
            return (Criteria) this;
        }

        public Criteria andIndustryphyIsNull() {
            addCriterion("INDUSTRYPHY is null");
            return (Criteria) this;
        }

        public Criteria andIndustryphyIsNotNull() {
            addCriterion("INDUSTRYPHY is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryphyEqualTo(String value) {
            addCriterion("INDUSTRYPHY =", value, "industryphy");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNotEqualTo(String value) {
            addCriterion("INDUSTRYPHY <>", value, "industryphy");
            return (Criteria) this;
        }

        public Criteria andIndustryphyGreaterThan(String value) {
            addCriterion("INDUSTRYPHY >", value, "industryphy");
            return (Criteria) this;
        }

        public Criteria andIndustryphyGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRYPHY >=", value, "industryphy");
            return (Criteria) this;
        }

        public Criteria andIndustryphyLessThan(String value) {
            addCriterion("INDUSTRYPHY <", value, "industryphy");
            return (Criteria) this;
        }

        public Criteria andIndustryphyLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRYPHY <=", value, "industryphy");
            return (Criteria) this;
        }

        public Criteria andIndustryphyLike(String value) {
            addCriterion("INDUSTRYPHY like", value, "industryphy");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNotLike(String value) {
            addCriterion("INDUSTRYPHY not like", value, "industryphy");
            return (Criteria) this;
        }

        public Criteria andIndustryphyIn(List<String> values) {
            addCriterion("INDUSTRYPHY in", values, "industryphy");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNotIn(List<String> values) {
            addCriterion("INDUSTRYPHY not in", values, "industryphy");
            return (Criteria) this;
        }

        public Criteria andIndustryphyBetween(String value1, String value2) {
            addCriterion("INDUSTRYPHY between", value1, value2, "industryphy");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNotBetween(String value1, String value2) {
            addCriterion("INDUSTRYPHY not between", value1, value2, "industryphy");
            return (Criteria) this;
        }

        public Criteria andIndustrycoIsNull() {
            addCriterion("INDUSTRYCO is null");
            return (Criteria) this;
        }

        public Criteria andIndustrycoIsNotNull() {
            addCriterion("INDUSTRYCO is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrycoEqualTo(String value) {
            addCriterion("INDUSTRYCO =", value, "industryco");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNotEqualTo(String value) {
            addCriterion("INDUSTRYCO <>", value, "industryco");
            return (Criteria) this;
        }

        public Criteria andIndustrycoGreaterThan(String value) {
            addCriterion("INDUSTRYCO >", value, "industryco");
            return (Criteria) this;
        }

        public Criteria andIndustrycoGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRYCO >=", value, "industryco");
            return (Criteria) this;
        }

        public Criteria andIndustrycoLessThan(String value) {
            addCriterion("INDUSTRYCO <", value, "industryco");
            return (Criteria) this;
        }

        public Criteria andIndustrycoLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRYCO <=", value, "industryco");
            return (Criteria) this;
        }

        public Criteria andIndustrycoLike(String value) {
            addCriterion("INDUSTRYCO like", value, "industryco");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNotLike(String value) {
            addCriterion("INDUSTRYCO not like", value, "industryco");
            return (Criteria) this;
        }

        public Criteria andIndustrycoIn(List<String> values) {
            addCriterion("INDUSTRYCO in", values, "industryco");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNotIn(List<String> values) {
            addCriterion("INDUSTRYCO not in", values, "industryco");
            return (Criteria) this;
        }

        public Criteria andIndustrycoBetween(String value1, String value2) {
            addCriterion("INDUSTRYCO between", value1, value2, "industryco");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNotBetween(String value1, String value2) {
            addCriterion("INDUSTRYCO not between", value1, value2, "industryco");
            return (Criteria) this;
        }

        public Criteria andEstdateIsNull() {
            addCriterion("ESTDATE is null");
            return (Criteria) this;
        }

        public Criteria andEstdateIsNotNull() {
            addCriterion("ESTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEstdateEqualTo(Date value) {
            addCriterion("ESTDATE =", value, "estdate");
            return (Criteria) this;
        }

        public Criteria andEstdateNotEqualTo(Date value) {
            addCriterion("ESTDATE <>", value, "estdate");
            return (Criteria) this;
        }

        public Criteria andEstdateGreaterThan(Date value) {
            addCriterion("ESTDATE >", value, "estdate");
            return (Criteria) this;
        }

        public Criteria andEstdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ESTDATE >=", value, "estdate");
            return (Criteria) this;
        }

        public Criteria andEstdateLessThan(Date value) {
            addCriterion("ESTDATE <", value, "estdate");
            return (Criteria) this;
        }

        public Criteria andEstdateLessThanOrEqualTo(Date value) {
            addCriterion("ESTDATE <=", value, "estdate");
            return (Criteria) this;
        }

        public Criteria andEstdateIn(List<Date> values) {
            addCriterion("ESTDATE in", values, "estdate");
            return (Criteria) this;
        }

        public Criteria andEstdateNotIn(List<Date> values) {
            addCriterion("ESTDATE not in", values, "estdate");
            return (Criteria) this;
        }

        public Criteria andEstdateBetween(Date value1, Date value2) {
            addCriterion("ESTDATE between", value1, value2, "estdate");
            return (Criteria) this;
        }

        public Criteria andEstdateNotBetween(Date value1, Date value2) {
            addCriterion("ESTDATE not between", value1, value2, "estdate");
            return (Criteria) this;
        }

        public Criteria andRegorgIsNull() {
            addCriterion("REGORG is null");
            return (Criteria) this;
        }

        public Criteria andRegorgIsNotNull() {
            addCriterion("REGORG is not null");
            return (Criteria) this;
        }

        public Criteria andRegorgEqualTo(String value) {
            addCriterion("REGORG =", value, "regorg");
            return (Criteria) this;
        }

        public Criteria andRegorgNotEqualTo(String value) {
            addCriterion("REGORG <>", value, "regorg");
            return (Criteria) this;
        }

        public Criteria andRegorgGreaterThan(String value) {
            addCriterion("REGORG >", value, "regorg");
            return (Criteria) this;
        }

        public Criteria andRegorgGreaterThanOrEqualTo(String value) {
            addCriterion("REGORG >=", value, "regorg");
            return (Criteria) this;
        }

        public Criteria andRegorgLessThan(String value) {
            addCriterion("REGORG <", value, "regorg");
            return (Criteria) this;
        }

        public Criteria andRegorgLessThanOrEqualTo(String value) {
            addCriterion("REGORG <=", value, "regorg");
            return (Criteria) this;
        }

        public Criteria andRegorgLike(String value) {
            addCriterion("REGORG like", value, "regorg");
            return (Criteria) this;
        }

        public Criteria andRegorgNotLike(String value) {
            addCriterion("REGORG not like", value, "regorg");
            return (Criteria) this;
        }

        public Criteria andRegorgIn(List<String> values) {
            addCriterion("REGORG in", values, "regorg");
            return (Criteria) this;
        }

        public Criteria andRegorgNotIn(List<String> values) {
            addCriterion("REGORG not in", values, "regorg");
            return (Criteria) this;
        }

        public Criteria andRegorgBetween(String value1, String value2) {
            addCriterion("REGORG between", value1, value2, "regorg");
            return (Criteria) this;
        }

        public Criteria andRegorgNotBetween(String value1, String value2) {
            addCriterion("REGORG not between", value1, value2, "regorg");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("POSTALCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("POSTALCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(String value) {
            addCriterion("POSTALCODE =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(String value) {
            addCriterion("POSTALCODE <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(String value) {
            addCriterion("POSTALCODE >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTALCODE >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(String value) {
            addCriterion("POSTALCODE <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTALCODE <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLike(String value) {
            addCriterion("POSTALCODE like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotLike(String value) {
            addCriterion("POSTALCODE not like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<String> values) {
            addCriterion("POSTALCODE in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<String> values) {
            addCriterion("POSTALCODE not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(String value1, String value2) {
            addCriterion("POSTALCODE between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(String value1, String value2) {
            addCriterion("POSTALCODE not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("WEBSITE =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("WEBSITE <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("WEBSITE >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("WEBSITE >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("WEBSITE <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("WEBSITE <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("WEBSITE like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("WEBSITE not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("WEBSITE in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("WEBSITE not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("WEBSITE between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("WEBSITE not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoIsNull() {
            addCriterion("ABUITEMCO is null");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoIsNotNull() {
            addCriterion("ABUITEMCO is not null");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoEqualTo(String value) {
            addCriterion("ABUITEMCO =", value, "abuitemco");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoNotEqualTo(String value) {
            addCriterion("ABUITEMCO <>", value, "abuitemco");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoGreaterThan(String value) {
            addCriterion("ABUITEMCO >", value, "abuitemco");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoGreaterThanOrEqualTo(String value) {
            addCriterion("ABUITEMCO >=", value, "abuitemco");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoLessThan(String value) {
            addCriterion("ABUITEMCO <", value, "abuitemco");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoLessThanOrEqualTo(String value) {
            addCriterion("ABUITEMCO <=", value, "abuitemco");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoLike(String value) {
            addCriterion("ABUITEMCO like", value, "abuitemco");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoNotLike(String value) {
            addCriterion("ABUITEMCO not like", value, "abuitemco");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoIn(List<String> values) {
            addCriterion("ABUITEMCO in", values, "abuitemco");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoNotIn(List<String> values) {
            addCriterion("ABUITEMCO not in", values, "abuitemco");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoBetween(String value1, String value2) {
            addCriterion("ABUITEMCO between", value1, value2, "abuitemco");
            return (Criteria) this;
        }

        public Criteria andAbuitemcoNotBetween(String value1, String value2) {
            addCriterion("ABUITEMCO not between", value1, value2, "abuitemco");
            return (Criteria) this;
        }

        public Criteria andCbuitemIsNull() {
            addCriterion("CBUITEM is null");
            return (Criteria) this;
        }

        public Criteria andCbuitemIsNotNull() {
            addCriterion("CBUITEM is not null");
            return (Criteria) this;
        }

        public Criteria andCbuitemEqualTo(String value) {
            addCriterion("CBUITEM =", value, "cbuitem");
            return (Criteria) this;
        }

        public Criteria andCbuitemNotEqualTo(String value) {
            addCriterion("CBUITEM <>", value, "cbuitem");
            return (Criteria) this;
        }

        public Criteria andCbuitemGreaterThan(String value) {
            addCriterion("CBUITEM >", value, "cbuitem");
            return (Criteria) this;
        }

        public Criteria andCbuitemGreaterThanOrEqualTo(String value) {
            addCriterion("CBUITEM >=", value, "cbuitem");
            return (Criteria) this;
        }

        public Criteria andCbuitemLessThan(String value) {
            addCriterion("CBUITEM <", value, "cbuitem");
            return (Criteria) this;
        }

        public Criteria andCbuitemLessThanOrEqualTo(String value) {
            addCriterion("CBUITEM <=", value, "cbuitem");
            return (Criteria) this;
        }

        public Criteria andCbuitemLike(String value) {
            addCriterion("CBUITEM like", value, "cbuitem");
            return (Criteria) this;
        }

        public Criteria andCbuitemNotLike(String value) {
            addCriterion("CBUITEM not like", value, "cbuitem");
            return (Criteria) this;
        }

        public Criteria andCbuitemIn(List<String> values) {
            addCriterion("CBUITEM in", values, "cbuitem");
            return (Criteria) this;
        }

        public Criteria andCbuitemNotIn(List<String> values) {
            addCriterion("CBUITEM not in", values, "cbuitem");
            return (Criteria) this;
        }

        public Criteria andCbuitemBetween(String value1, String value2) {
            addCriterion("CBUITEM between", value1, value2, "cbuitem");
            return (Criteria) this;
        }

        public Criteria andCbuitemNotBetween(String value1, String value2) {
            addCriterion("CBUITEM not between", value1, value2, "cbuitem");
            return (Criteria) this;
        }

        public Criteria andBusscopeIsNull() {
            addCriterion("BUSSCOPE is null");
            return (Criteria) this;
        }

        public Criteria andBusscopeIsNotNull() {
            addCriterion("BUSSCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusscopeEqualTo(String value) {
            addCriterion("BUSSCOPE =", value, "busscope");
            return (Criteria) this;
        }

        public Criteria andBusscopeNotEqualTo(String value) {
            addCriterion("BUSSCOPE <>", value, "busscope");
            return (Criteria) this;
        }

        public Criteria andBusscopeGreaterThan(String value) {
            addCriterion("BUSSCOPE >", value, "busscope");
            return (Criteria) this;
        }

        public Criteria andBusscopeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSSCOPE >=", value, "busscope");
            return (Criteria) this;
        }

        public Criteria andBusscopeLessThan(String value) {
            addCriterion("BUSSCOPE <", value, "busscope");
            return (Criteria) this;
        }

        public Criteria andBusscopeLessThanOrEqualTo(String value) {
            addCriterion("BUSSCOPE <=", value, "busscope");
            return (Criteria) this;
        }

        public Criteria andBusscopeLike(String value) {
            addCriterion("BUSSCOPE like", value, "busscope");
            return (Criteria) this;
        }

        public Criteria andBusscopeNotLike(String value) {
            addCriterion("BUSSCOPE not like", value, "busscope");
            return (Criteria) this;
        }

        public Criteria andBusscopeIn(List<String> values) {
            addCriterion("BUSSCOPE in", values, "busscope");
            return (Criteria) this;
        }

        public Criteria andBusscopeNotIn(List<String> values) {
            addCriterion("BUSSCOPE not in", values, "busscope");
            return (Criteria) this;
        }

        public Criteria andBusscopeBetween(String value1, String value2) {
            addCriterion("BUSSCOPE between", value1, value2, "busscope");
            return (Criteria) this;
        }

        public Criteria andBusscopeNotBetween(String value1, String value2) {
            addCriterion("BUSSCOPE not between", value1, value2, "busscope");
            return (Criteria) this;
        }

        public Criteria andOptypeIsNull() {
            addCriterion("OPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOptypeIsNotNull() {
            addCriterion("OPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOptypeEqualTo(String value) {
            addCriterion("OPTYPE =", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotEqualTo(String value) {
            addCriterion("OPTYPE <>", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeGreaterThan(String value) {
            addCriterion("OPTYPE >", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPTYPE >=", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLessThan(String value) {
            addCriterion("OPTYPE <", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLessThanOrEqualTo(String value) {
            addCriterion("OPTYPE <=", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLike(String value) {
            addCriterion("OPTYPE like", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotLike(String value) {
            addCriterion("OPTYPE not like", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeIn(List<String> values) {
            addCriterion("OPTYPE in", values, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotIn(List<String> values) {
            addCriterion("OPTYPE not in", values, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeBetween(String value1, String value2) {
            addCriterion("OPTYPE between", value1, value2, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotBetween(String value1, String value2) {
            addCriterion("OPTYPE not between", value1, value2, "optype");
            return (Criteria) this;
        }

        public Criteria andOpfyearsIsNull() {
            addCriterion("OPFYEARS is null");
            return (Criteria) this;
        }

        public Criteria andOpfyearsIsNotNull() {
            addCriterion("OPFYEARS is not null");
            return (Criteria) this;
        }

        public Criteria andOpfyearsEqualTo(BigDecimal value) {
            addCriterion("OPFYEARS =", value, "opfyears");
            return (Criteria) this;
        }

        public Criteria andOpfyearsNotEqualTo(BigDecimal value) {
            addCriterion("OPFYEARS <>", value, "opfyears");
            return (Criteria) this;
        }

        public Criteria andOpfyearsGreaterThan(BigDecimal value) {
            addCriterion("OPFYEARS >", value, "opfyears");
            return (Criteria) this;
        }

        public Criteria andOpfyearsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPFYEARS >=", value, "opfyears");
            return (Criteria) this;
        }

        public Criteria andOpfyearsLessThan(BigDecimal value) {
            addCriterion("OPFYEARS <", value, "opfyears");
            return (Criteria) this;
        }

        public Criteria andOpfyearsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPFYEARS <=", value, "opfyears");
            return (Criteria) this;
        }

        public Criteria andOpfyearsIn(List<BigDecimal> values) {
            addCriterion("OPFYEARS in", values, "opfyears");
            return (Criteria) this;
        }

        public Criteria andOpfyearsNotIn(List<BigDecimal> values) {
            addCriterion("OPFYEARS not in", values, "opfyears");
            return (Criteria) this;
        }

        public Criteria andOpfyearsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPFYEARS between", value1, value2, "opfyears");
            return (Criteria) this;
        }

        public Criteria andOpfyearsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPFYEARS not between", value1, value2, "opfyears");
            return (Criteria) this;
        }

        public Criteria andOpfromIsNull() {
            addCriterion("OPFROM is null");
            return (Criteria) this;
        }

        public Criteria andOpfromIsNotNull() {
            addCriterion("OPFROM is not null");
            return (Criteria) this;
        }

        public Criteria andOpfromEqualTo(Date value) {
            addCriterion("OPFROM =", value, "opfrom");
            return (Criteria) this;
        }

        public Criteria andOpfromNotEqualTo(Date value) {
            addCriterion("OPFROM <>", value, "opfrom");
            return (Criteria) this;
        }

        public Criteria andOpfromGreaterThan(Date value) {
            addCriterion("OPFROM >", value, "opfrom");
            return (Criteria) this;
        }

        public Criteria andOpfromGreaterThanOrEqualTo(Date value) {
            addCriterion("OPFROM >=", value, "opfrom");
            return (Criteria) this;
        }

        public Criteria andOpfromLessThan(Date value) {
            addCriterion("OPFROM <", value, "opfrom");
            return (Criteria) this;
        }

        public Criteria andOpfromLessThanOrEqualTo(Date value) {
            addCriterion("OPFROM <=", value, "opfrom");
            return (Criteria) this;
        }

        public Criteria andOpfromIn(List<Date> values) {
            addCriterion("OPFROM in", values, "opfrom");
            return (Criteria) this;
        }

        public Criteria andOpfromNotIn(List<Date> values) {
            addCriterion("OPFROM not in", values, "opfrom");
            return (Criteria) this;
        }

        public Criteria andOpfromBetween(Date value1, Date value2) {
            addCriterion("OPFROM between", value1, value2, "opfrom");
            return (Criteria) this;
        }

        public Criteria andOpfromNotBetween(Date value1, Date value2) {
            addCriterion("OPFROM not between", value1, value2, "opfrom");
            return (Criteria) this;
        }

        public Criteria andOptoIsNull() {
            addCriterion("OPTO is null");
            return (Criteria) this;
        }

        public Criteria andOptoIsNotNull() {
            addCriterion("OPTO is not null");
            return (Criteria) this;
        }

        public Criteria andOptoEqualTo(Date value) {
            addCriterion("OPTO =", value, "opto");
            return (Criteria) this;
        }

        public Criteria andOptoNotEqualTo(Date value) {
            addCriterion("OPTO <>", value, "opto");
            return (Criteria) this;
        }

        public Criteria andOptoGreaterThan(Date value) {
            addCriterion("OPTO >", value, "opto");
            return (Criteria) this;
        }

        public Criteria andOptoGreaterThanOrEqualTo(Date value) {
            addCriterion("OPTO >=", value, "opto");
            return (Criteria) this;
        }

        public Criteria andOptoLessThan(Date value) {
            addCriterion("OPTO <", value, "opto");
            return (Criteria) this;
        }

        public Criteria andOptoLessThanOrEqualTo(Date value) {
            addCriterion("OPTO <=", value, "opto");
            return (Criteria) this;
        }

        public Criteria andOptoIn(List<Date> values) {
            addCriterion("OPTO in", values, "opto");
            return (Criteria) this;
        }

        public Criteria andOptoNotIn(List<Date> values) {
            addCriterion("OPTO not in", values, "opto");
            return (Criteria) this;
        }

        public Criteria andOptoBetween(Date value1, Date value2) {
            addCriterion("OPTO between", value1, value2, "opto");
            return (Criteria) this;
        }

        public Criteria andOptoNotBetween(Date value1, Date value2) {
            addCriterion("OPTO not between", value1, value2, "opto");
            return (Criteria) this;
        }

        public Criteria andLocalorgIsNull() {
            addCriterion("LOCALORG is null");
            return (Criteria) this;
        }

        public Criteria andLocalorgIsNotNull() {
            addCriterion("LOCALORG is not null");
            return (Criteria) this;
        }

        public Criteria andLocalorgEqualTo(String value) {
            addCriterion("LOCALORG =", value, "localorg");
            return (Criteria) this;
        }

        public Criteria andLocalorgNotEqualTo(String value) {
            addCriterion("LOCALORG <>", value, "localorg");
            return (Criteria) this;
        }

        public Criteria andLocalorgGreaterThan(String value) {
            addCriterion("LOCALORG >", value, "localorg");
            return (Criteria) this;
        }

        public Criteria andLocalorgGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALORG >=", value, "localorg");
            return (Criteria) this;
        }

        public Criteria andLocalorgLessThan(String value) {
            addCriterion("LOCALORG <", value, "localorg");
            return (Criteria) this;
        }

        public Criteria andLocalorgLessThanOrEqualTo(String value) {
            addCriterion("LOCALORG <=", value, "localorg");
            return (Criteria) this;
        }

        public Criteria andLocalorgLike(String value) {
            addCriterion("LOCALORG like", value, "localorg");
            return (Criteria) this;
        }

        public Criteria andLocalorgNotLike(String value) {
            addCriterion("LOCALORG not like", value, "localorg");
            return (Criteria) this;
        }

        public Criteria andLocalorgIn(List<String> values) {
            addCriterion("LOCALORG in", values, "localorg");
            return (Criteria) this;
        }

        public Criteria andLocalorgNotIn(List<String> values) {
            addCriterion("LOCALORG not in", values, "localorg");
            return (Criteria) this;
        }

        public Criteria andLocalorgBetween(String value1, String value2) {
            addCriterion("LOCALORG between", value1, value2, "localorg");
            return (Criteria) this;
        }

        public Criteria andLocalorgNotBetween(String value1, String value2) {
            addCriterion("LOCALORG not between", value1, value2, "localorg");
            return (Criteria) this;
        }

        public Criteria andLocaladmIsNull() {
            addCriterion("LOCALADM is null");
            return (Criteria) this;
        }

        public Criteria andLocaladmIsNotNull() {
            addCriterion("LOCALADM is not null");
            return (Criteria) this;
        }

        public Criteria andLocaladmEqualTo(String value) {
            addCriterion("LOCALADM =", value, "localadm");
            return (Criteria) this;
        }

        public Criteria andLocaladmNotEqualTo(String value) {
            addCriterion("LOCALADM <>", value, "localadm");
            return (Criteria) this;
        }

        public Criteria andLocaladmGreaterThan(String value) {
            addCriterion("LOCALADM >", value, "localadm");
            return (Criteria) this;
        }

        public Criteria andLocaladmGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALADM >=", value, "localadm");
            return (Criteria) this;
        }

        public Criteria andLocaladmLessThan(String value) {
            addCriterion("LOCALADM <", value, "localadm");
            return (Criteria) this;
        }

        public Criteria andLocaladmLessThanOrEqualTo(String value) {
            addCriterion("LOCALADM <=", value, "localadm");
            return (Criteria) this;
        }

        public Criteria andLocaladmLike(String value) {
            addCriterion("LOCALADM like", value, "localadm");
            return (Criteria) this;
        }

        public Criteria andLocaladmNotLike(String value) {
            addCriterion("LOCALADM not like", value, "localadm");
            return (Criteria) this;
        }

        public Criteria andLocaladmIn(List<String> values) {
            addCriterion("LOCALADM in", values, "localadm");
            return (Criteria) this;
        }

        public Criteria andLocaladmNotIn(List<String> values) {
            addCriterion("LOCALADM not in", values, "localadm");
            return (Criteria) this;
        }

        public Criteria andLocaladmBetween(String value1, String value2) {
            addCriterion("LOCALADM between", value1, value2, "localadm");
            return (Criteria) this;
        }

        public Criteria andLocaladmNotBetween(String value1, String value2) {
            addCriterion("LOCALADM not between", value1, value2, "localadm");
            return (Criteria) this;
        }

        public Criteria andReccapIsNull() {
            addCriterion("RECCAP is null");
            return (Criteria) this;
        }

        public Criteria andReccapIsNotNull() {
            addCriterion("RECCAP is not null");
            return (Criteria) this;
        }

        public Criteria andReccapEqualTo(BigDecimal value) {
            addCriterion("RECCAP =", value, "reccap");
            return (Criteria) this;
        }

        public Criteria andReccapNotEqualTo(BigDecimal value) {
            addCriterion("RECCAP <>", value, "reccap");
            return (Criteria) this;
        }

        public Criteria andReccapGreaterThan(BigDecimal value) {
            addCriterion("RECCAP >", value, "reccap");
            return (Criteria) this;
        }

        public Criteria andReccapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECCAP >=", value, "reccap");
            return (Criteria) this;
        }

        public Criteria andReccapLessThan(BigDecimal value) {
            addCriterion("RECCAP <", value, "reccap");
            return (Criteria) this;
        }

        public Criteria andReccapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECCAP <=", value, "reccap");
            return (Criteria) this;
        }

        public Criteria andReccapIn(List<BigDecimal> values) {
            addCriterion("RECCAP in", values, "reccap");
            return (Criteria) this;
        }

        public Criteria andReccapNotIn(List<BigDecimal> values) {
            addCriterion("RECCAP not in", values, "reccap");
            return (Criteria) this;
        }

        public Criteria andReccapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECCAP between", value1, value2, "reccap");
            return (Criteria) this;
        }

        public Criteria andReccapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECCAP not between", value1, value2, "reccap");
            return (Criteria) this;
        }

        public Criteria andInsformIsNull() {
            addCriterion("INSFORM is null");
            return (Criteria) this;
        }

        public Criteria andInsformIsNotNull() {
            addCriterion("INSFORM is not null");
            return (Criteria) this;
        }

        public Criteria andInsformEqualTo(String value) {
            addCriterion("INSFORM =", value, "insform");
            return (Criteria) this;
        }

        public Criteria andInsformNotEqualTo(String value) {
            addCriterion("INSFORM <>", value, "insform");
            return (Criteria) this;
        }

        public Criteria andInsformGreaterThan(String value) {
            addCriterion("INSFORM >", value, "insform");
            return (Criteria) this;
        }

        public Criteria andInsformGreaterThanOrEqualTo(String value) {
            addCriterion("INSFORM >=", value, "insform");
            return (Criteria) this;
        }

        public Criteria andInsformLessThan(String value) {
            addCriterion("INSFORM <", value, "insform");
            return (Criteria) this;
        }

        public Criteria andInsformLessThanOrEqualTo(String value) {
            addCriterion("INSFORM <=", value, "insform");
            return (Criteria) this;
        }

        public Criteria andInsformLike(String value) {
            addCriterion("INSFORM like", value, "insform");
            return (Criteria) this;
        }

        public Criteria andInsformNotLike(String value) {
            addCriterion("INSFORM not like", value, "insform");
            return (Criteria) this;
        }

        public Criteria andInsformIn(List<String> values) {
            addCriterion("INSFORM in", values, "insform");
            return (Criteria) this;
        }

        public Criteria andInsformNotIn(List<String> values) {
            addCriterion("INSFORM not in", values, "insform");
            return (Criteria) this;
        }

        public Criteria andInsformBetween(String value1, String value2) {
            addCriterion("INSFORM between", value1, value2, "insform");
            return (Criteria) this;
        }

        public Criteria andInsformNotBetween(String value1, String value2) {
            addCriterion("INSFORM not between", value1, value2, "insform");
            return (Criteria) this;
        }

        public Criteria andDomdistrictIsNull() {
            addCriterion("DOMDISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andDomdistrictIsNotNull() {
            addCriterion("DOMDISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andDomdistrictEqualTo(String value) {
            addCriterion("DOMDISTRICT =", value, "domdistrict");
            return (Criteria) this;
        }

        public Criteria andDomdistrictNotEqualTo(String value) {
            addCriterion("DOMDISTRICT <>", value, "domdistrict");
            return (Criteria) this;
        }

        public Criteria andDomdistrictGreaterThan(String value) {
            addCriterion("DOMDISTRICT >", value, "domdistrict");
            return (Criteria) this;
        }

        public Criteria andDomdistrictGreaterThanOrEqualTo(String value) {
            addCriterion("DOMDISTRICT >=", value, "domdistrict");
            return (Criteria) this;
        }

        public Criteria andDomdistrictLessThan(String value) {
            addCriterion("DOMDISTRICT <", value, "domdistrict");
            return (Criteria) this;
        }

        public Criteria andDomdistrictLessThanOrEqualTo(String value) {
            addCriterion("DOMDISTRICT <=", value, "domdistrict");
            return (Criteria) this;
        }

        public Criteria andDomdistrictLike(String value) {
            addCriterion("DOMDISTRICT like", value, "domdistrict");
            return (Criteria) this;
        }

        public Criteria andDomdistrictNotLike(String value) {
            addCriterion("DOMDISTRICT not like", value, "domdistrict");
            return (Criteria) this;
        }

        public Criteria andDomdistrictIn(List<String> values) {
            addCriterion("DOMDISTRICT in", values, "domdistrict");
            return (Criteria) this;
        }

        public Criteria andDomdistrictNotIn(List<String> values) {
            addCriterion("DOMDISTRICT not in", values, "domdistrict");
            return (Criteria) this;
        }

        public Criteria andDomdistrictBetween(String value1, String value2) {
            addCriterion("DOMDISTRICT between", value1, value2, "domdistrict");
            return (Criteria) this;
        }

        public Criteria andDomdistrictNotBetween(String value1, String value2) {
            addCriterion("DOMDISTRICT not between", value1, value2, "domdistrict");
            return (Criteria) this;
        }

        public Criteria andDomIsNull() {
            addCriterion("DOM is null");
            return (Criteria) this;
        }

        public Criteria andDomIsNotNull() {
            addCriterion("DOM is not null");
            return (Criteria) this;
        }

        public Criteria andDomEqualTo(String value) {
            addCriterion("DOM =", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomNotEqualTo(String value) {
            addCriterion("DOM <>", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomGreaterThan(String value) {
            addCriterion("DOM >", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomGreaterThanOrEqualTo(String value) {
            addCriterion("DOM >=", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomLessThan(String value) {
            addCriterion("DOM <", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomLessThanOrEqualTo(String value) {
            addCriterion("DOM <=", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomLike(String value) {
            addCriterion("DOM like", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomNotLike(String value) {
            addCriterion("DOM not like", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomIn(List<String> values) {
            addCriterion("DOM in", values, "dom");
            return (Criteria) this;
        }

        public Criteria andDomNotIn(List<String> values) {
            addCriterion("DOM not in", values, "dom");
            return (Criteria) this;
        }

        public Criteria andDomBetween(String value1, String value2) {
            addCriterion("DOM between", value1, value2, "dom");
            return (Criteria) this;
        }

        public Criteria andDomNotBetween(String value1, String value2) {
            addCriterion("DOM not between", value1, value2, "dom");
            return (Criteria) this;
        }

        public Criteria andDomprorightIsNull() {
            addCriterion("DOMPRORIGHT is null");
            return (Criteria) this;
        }

        public Criteria andDomprorightIsNotNull() {
            addCriterion("DOMPRORIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andDomprorightEqualTo(String value) {
            addCriterion("DOMPRORIGHT =", value, "domproright");
            return (Criteria) this;
        }

        public Criteria andDomprorightNotEqualTo(String value) {
            addCriterion("DOMPRORIGHT <>", value, "domproright");
            return (Criteria) this;
        }

        public Criteria andDomprorightGreaterThan(String value) {
            addCriterion("DOMPRORIGHT >", value, "domproright");
            return (Criteria) this;
        }

        public Criteria andDomprorightGreaterThanOrEqualTo(String value) {
            addCriterion("DOMPRORIGHT >=", value, "domproright");
            return (Criteria) this;
        }

        public Criteria andDomprorightLessThan(String value) {
            addCriterion("DOMPRORIGHT <", value, "domproright");
            return (Criteria) this;
        }

        public Criteria andDomprorightLessThanOrEqualTo(String value) {
            addCriterion("DOMPRORIGHT <=", value, "domproright");
            return (Criteria) this;
        }

        public Criteria andDomprorightLike(String value) {
            addCriterion("DOMPRORIGHT like", value, "domproright");
            return (Criteria) this;
        }

        public Criteria andDomprorightNotLike(String value) {
            addCriterion("DOMPRORIGHT not like", value, "domproright");
            return (Criteria) this;
        }

        public Criteria andDomprorightIn(List<String> values) {
            addCriterion("DOMPRORIGHT in", values, "domproright");
            return (Criteria) this;
        }

        public Criteria andDomprorightNotIn(List<String> values) {
            addCriterion("DOMPRORIGHT not in", values, "domproright");
            return (Criteria) this;
        }

        public Criteria andDomprorightBetween(String value1, String value2) {
            addCriterion("DOMPRORIGHT between", value1, value2, "domproright");
            return (Criteria) this;
        }

        public Criteria andDomprorightNotBetween(String value1, String value2) {
            addCriterion("DOMPRORIGHT not between", value1, value2, "domproright");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictIsNull() {
            addCriterion("OPLOCDISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictIsNotNull() {
            addCriterion("OPLOCDISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictEqualTo(String value) {
            addCriterion("OPLOCDISTRICT =", value, "oplocdistrict");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictNotEqualTo(String value) {
            addCriterion("OPLOCDISTRICT <>", value, "oplocdistrict");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictGreaterThan(String value) {
            addCriterion("OPLOCDISTRICT >", value, "oplocdistrict");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictGreaterThanOrEqualTo(String value) {
            addCriterion("OPLOCDISTRICT >=", value, "oplocdistrict");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictLessThan(String value) {
            addCriterion("OPLOCDISTRICT <", value, "oplocdistrict");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictLessThanOrEqualTo(String value) {
            addCriterion("OPLOCDISTRICT <=", value, "oplocdistrict");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictLike(String value) {
            addCriterion("OPLOCDISTRICT like", value, "oplocdistrict");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictNotLike(String value) {
            addCriterion("OPLOCDISTRICT not like", value, "oplocdistrict");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictIn(List<String> values) {
            addCriterion("OPLOCDISTRICT in", values, "oplocdistrict");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictNotIn(List<String> values) {
            addCriterion("OPLOCDISTRICT not in", values, "oplocdistrict");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictBetween(String value1, String value2) {
            addCriterion("OPLOCDISTRICT between", value1, value2, "oplocdistrict");
            return (Criteria) this;
        }

        public Criteria andOplocdistrictNotBetween(String value1, String value2) {
            addCriterion("OPLOCDISTRICT not between", value1, value2, "oplocdistrict");
            return (Criteria) this;
        }

        public Criteria andOplocIsNull() {
            addCriterion("OPLOC is null");
            return (Criteria) this;
        }

        public Criteria andOplocIsNotNull() {
            addCriterion("OPLOC is not null");
            return (Criteria) this;
        }

        public Criteria andOplocEqualTo(String value) {
            addCriterion("OPLOC =", value, "oploc");
            return (Criteria) this;
        }

        public Criteria andOplocNotEqualTo(String value) {
            addCriterion("OPLOC <>", value, "oploc");
            return (Criteria) this;
        }

        public Criteria andOplocGreaterThan(String value) {
            addCriterion("OPLOC >", value, "oploc");
            return (Criteria) this;
        }

        public Criteria andOplocGreaterThanOrEqualTo(String value) {
            addCriterion("OPLOC >=", value, "oploc");
            return (Criteria) this;
        }

        public Criteria andOplocLessThan(String value) {
            addCriterion("OPLOC <", value, "oploc");
            return (Criteria) this;
        }

        public Criteria andOplocLessThanOrEqualTo(String value) {
            addCriterion("OPLOC <=", value, "oploc");
            return (Criteria) this;
        }

        public Criteria andOplocLike(String value) {
            addCriterion("OPLOC like", value, "oploc");
            return (Criteria) this;
        }

        public Criteria andOplocNotLike(String value) {
            addCriterion("OPLOC not like", value, "oploc");
            return (Criteria) this;
        }

        public Criteria andOplocIn(List<String> values) {
            addCriterion("OPLOC in", values, "oploc");
            return (Criteria) this;
        }

        public Criteria andOplocNotIn(List<String> values) {
            addCriterion("OPLOC not in", values, "oploc");
            return (Criteria) this;
        }

        public Criteria andOplocBetween(String value1, String value2) {
            addCriterion("OPLOC between", value1, value2, "oploc");
            return (Criteria) this;
        }

        public Criteria andOplocNotBetween(String value1, String value2) {
            addCriterion("OPLOC not between", value1, value2, "oploc");
            return (Criteria) this;
        }

        public Criteria andOplocprorightIsNull() {
            addCriterion("OPLOCPRORIGHT is null");
            return (Criteria) this;
        }

        public Criteria andOplocprorightIsNotNull() {
            addCriterion("OPLOCPRORIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andOplocprorightEqualTo(String value) {
            addCriterion("OPLOCPRORIGHT =", value, "oplocproright");
            return (Criteria) this;
        }

        public Criteria andOplocprorightNotEqualTo(String value) {
            addCriterion("OPLOCPRORIGHT <>", value, "oplocproright");
            return (Criteria) this;
        }

        public Criteria andOplocprorightGreaterThan(String value) {
            addCriterion("OPLOCPRORIGHT >", value, "oplocproright");
            return (Criteria) this;
        }

        public Criteria andOplocprorightGreaterThanOrEqualTo(String value) {
            addCriterion("OPLOCPRORIGHT >=", value, "oplocproright");
            return (Criteria) this;
        }

        public Criteria andOplocprorightLessThan(String value) {
            addCriterion("OPLOCPRORIGHT <", value, "oplocproright");
            return (Criteria) this;
        }

        public Criteria andOplocprorightLessThanOrEqualTo(String value) {
            addCriterion("OPLOCPRORIGHT <=", value, "oplocproright");
            return (Criteria) this;
        }

        public Criteria andOplocprorightLike(String value) {
            addCriterion("OPLOCPRORIGHT like", value, "oplocproright");
            return (Criteria) this;
        }

        public Criteria andOplocprorightNotLike(String value) {
            addCriterion("OPLOCPRORIGHT not like", value, "oplocproright");
            return (Criteria) this;
        }

        public Criteria andOplocprorightIn(List<String> values) {
            addCriterion("OPLOCPRORIGHT in", values, "oplocproright");
            return (Criteria) this;
        }

        public Criteria andOplocprorightNotIn(List<String> values) {
            addCriterion("OPLOCPRORIGHT not in", values, "oplocproright");
            return (Criteria) this;
        }

        public Criteria andOplocprorightBetween(String value1, String value2) {
            addCriterion("OPLOCPRORIGHT between", value1, value2, "oplocproright");
            return (Criteria) this;
        }

        public Criteria andOplocprorightNotBetween(String value1, String value2) {
            addCriterion("OPLOCPRORIGHT not between", value1, value2, "oplocproright");
            return (Criteria) this;
        }

        public Criteria andBusformIsNull() {
            addCriterion("BUSFORM is null");
            return (Criteria) this;
        }

        public Criteria andBusformIsNotNull() {
            addCriterion("BUSFORM is not null");
            return (Criteria) this;
        }

        public Criteria andBusformEqualTo(String value) {
            addCriterion("BUSFORM =", value, "busform");
            return (Criteria) this;
        }

        public Criteria andBusformNotEqualTo(String value) {
            addCriterion("BUSFORM <>", value, "busform");
            return (Criteria) this;
        }

        public Criteria andBusformGreaterThan(String value) {
            addCriterion("BUSFORM >", value, "busform");
            return (Criteria) this;
        }

        public Criteria andBusformGreaterThanOrEqualTo(String value) {
            addCriterion("BUSFORM >=", value, "busform");
            return (Criteria) this;
        }

        public Criteria andBusformLessThan(String value) {
            addCriterion("BUSFORM <", value, "busform");
            return (Criteria) this;
        }

        public Criteria andBusformLessThanOrEqualTo(String value) {
            addCriterion("BUSFORM <=", value, "busform");
            return (Criteria) this;
        }

        public Criteria andBusformLike(String value) {
            addCriterion("BUSFORM like", value, "busform");
            return (Criteria) this;
        }

        public Criteria andBusformNotLike(String value) {
            addCriterion("BUSFORM not like", value, "busform");
            return (Criteria) this;
        }

        public Criteria andBusformIn(List<String> values) {
            addCriterion("BUSFORM in", values, "busform");
            return (Criteria) this;
        }

        public Criteria andBusformNotIn(List<String> values) {
            addCriterion("BUSFORM not in", values, "busform");
            return (Criteria) this;
        }

        public Criteria andBusformBetween(String value1, String value2) {
            addCriterion("BUSFORM between", value1, value2, "busform");
            return (Criteria) this;
        }

        public Criteria andBusformNotBetween(String value1, String value2) {
            addCriterion("BUSFORM not between", value1, value2, "busform");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeIsNull() {
            addCriterion("PTBUSSCOPE is null");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeIsNotNull() {
            addCriterion("PTBUSSCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeEqualTo(String value) {
            addCriterion("PTBUSSCOPE =", value, "ptbusscope");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeNotEqualTo(String value) {
            addCriterion("PTBUSSCOPE <>", value, "ptbusscope");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeGreaterThan(String value) {
            addCriterion("PTBUSSCOPE >", value, "ptbusscope");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeGreaterThanOrEqualTo(String value) {
            addCriterion("PTBUSSCOPE >=", value, "ptbusscope");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeLessThan(String value) {
            addCriterion("PTBUSSCOPE <", value, "ptbusscope");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeLessThanOrEqualTo(String value) {
            addCriterion("PTBUSSCOPE <=", value, "ptbusscope");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeLike(String value) {
            addCriterion("PTBUSSCOPE like", value, "ptbusscope");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeNotLike(String value) {
            addCriterion("PTBUSSCOPE not like", value, "ptbusscope");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeIn(List<String> values) {
            addCriterion("PTBUSSCOPE in", values, "ptbusscope");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeNotIn(List<String> values) {
            addCriterion("PTBUSSCOPE not in", values, "ptbusscope");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeBetween(String value1, String value2) {
            addCriterion("PTBUSSCOPE between", value1, value2, "ptbusscope");
            return (Criteria) this;
        }

        public Criteria andPtbusscopeNotBetween(String value1, String value2) {
            addCriterion("PTBUSSCOPE not between", value1, value2, "ptbusscope");
            return (Criteria) this;
        }

        public Criteria andHypotaxisIsNull() {
            addCriterion("HYPOTAXIS is null");
            return (Criteria) this;
        }

        public Criteria andHypotaxisIsNotNull() {
            addCriterion("HYPOTAXIS is not null");
            return (Criteria) this;
        }

        public Criteria andHypotaxisEqualTo(String value) {
            addCriterion("HYPOTAXIS =", value, "hypotaxis");
            return (Criteria) this;
        }

        public Criteria andHypotaxisNotEqualTo(String value) {
            addCriterion("HYPOTAXIS <>", value, "hypotaxis");
            return (Criteria) this;
        }

        public Criteria andHypotaxisGreaterThan(String value) {
            addCriterion("HYPOTAXIS >", value, "hypotaxis");
            return (Criteria) this;
        }

        public Criteria andHypotaxisGreaterThanOrEqualTo(String value) {
            addCriterion("HYPOTAXIS >=", value, "hypotaxis");
            return (Criteria) this;
        }

        public Criteria andHypotaxisLessThan(String value) {
            addCriterion("HYPOTAXIS <", value, "hypotaxis");
            return (Criteria) this;
        }

        public Criteria andHypotaxisLessThanOrEqualTo(String value) {
            addCriterion("HYPOTAXIS <=", value, "hypotaxis");
            return (Criteria) this;
        }

        public Criteria andHypotaxisLike(String value) {
            addCriterion("HYPOTAXIS like", value, "hypotaxis");
            return (Criteria) this;
        }

        public Criteria andHypotaxisNotLike(String value) {
            addCriterion("HYPOTAXIS not like", value, "hypotaxis");
            return (Criteria) this;
        }

        public Criteria andHypotaxisIn(List<String> values) {
            addCriterion("HYPOTAXIS in", values, "hypotaxis");
            return (Criteria) this;
        }

        public Criteria andHypotaxisNotIn(List<String> values) {
            addCriterion("HYPOTAXIS not in", values, "hypotaxis");
            return (Criteria) this;
        }

        public Criteria andHypotaxisBetween(String value1, String value2) {
            addCriterion("HYPOTAXIS between", value1, value2, "hypotaxis");
            return (Criteria) this;
        }

        public Criteria andHypotaxisNotBetween(String value1, String value2) {
            addCriterion("HYPOTAXIS not between", value1, value2, "hypotaxis");
            return (Criteria) this;
        }

        public Criteria andEcochrIsNull() {
            addCriterion("ECOCHR is null");
            return (Criteria) this;
        }

        public Criteria andEcochrIsNotNull() {
            addCriterion("ECOCHR is not null");
            return (Criteria) this;
        }

        public Criteria andEcochrEqualTo(String value) {
            addCriterion("ECOCHR =", value, "ecochr");
            return (Criteria) this;
        }

        public Criteria andEcochrNotEqualTo(String value) {
            addCriterion("ECOCHR <>", value, "ecochr");
            return (Criteria) this;
        }

        public Criteria andEcochrGreaterThan(String value) {
            addCriterion("ECOCHR >", value, "ecochr");
            return (Criteria) this;
        }

        public Criteria andEcochrGreaterThanOrEqualTo(String value) {
            addCriterion("ECOCHR >=", value, "ecochr");
            return (Criteria) this;
        }

        public Criteria andEcochrLessThan(String value) {
            addCriterion("ECOCHR <", value, "ecochr");
            return (Criteria) this;
        }

        public Criteria andEcochrLessThanOrEqualTo(String value) {
            addCriterion("ECOCHR <=", value, "ecochr");
            return (Criteria) this;
        }

        public Criteria andEcochrLike(String value) {
            addCriterion("ECOCHR like", value, "ecochr");
            return (Criteria) this;
        }

        public Criteria andEcochrNotLike(String value) {
            addCriterion("ECOCHR not like", value, "ecochr");
            return (Criteria) this;
        }

        public Criteria andEcochrIn(List<String> values) {
            addCriterion("ECOCHR in", values, "ecochr");
            return (Criteria) this;
        }

        public Criteria andEcochrNotIn(List<String> values) {
            addCriterion("ECOCHR not in", values, "ecochr");
            return (Criteria) this;
        }

        public Criteria andEcochrBetween(String value1, String value2) {
            addCriterion("ECOCHR between", value1, value2, "ecochr");
            return (Criteria) this;
        }

        public Criteria andEcochrNotBetween(String value1, String value2) {
            addCriterion("ECOCHR not between", value1, value2, "ecochr");
            return (Criteria) this;
        }

        public Criteria andParnumIsNull() {
            addCriterion("PARNUM is null");
            return (Criteria) this;
        }

        public Criteria andParnumIsNotNull() {
            addCriterion("PARNUM is not null");
            return (Criteria) this;
        }

        public Criteria andParnumEqualTo(BigDecimal value) {
            addCriterion("PARNUM =", value, "parnum");
            return (Criteria) this;
        }

        public Criteria andParnumNotEqualTo(BigDecimal value) {
            addCriterion("PARNUM <>", value, "parnum");
            return (Criteria) this;
        }

        public Criteria andParnumGreaterThan(BigDecimal value) {
            addCriterion("PARNUM >", value, "parnum");
            return (Criteria) this;
        }

        public Criteria andParnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PARNUM >=", value, "parnum");
            return (Criteria) this;
        }

        public Criteria andParnumLessThan(BigDecimal value) {
            addCriterion("PARNUM <", value, "parnum");
            return (Criteria) this;
        }

        public Criteria andParnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PARNUM <=", value, "parnum");
            return (Criteria) this;
        }

        public Criteria andParnumIn(List<BigDecimal> values) {
            addCriterion("PARNUM in", values, "parnum");
            return (Criteria) this;
        }

        public Criteria andParnumNotIn(List<BigDecimal> values) {
            addCriterion("PARNUM not in", values, "parnum");
            return (Criteria) this;
        }

        public Criteria andParnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARNUM between", value1, value2, "parnum");
            return (Criteria) this;
        }

        public Criteria andParnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARNUM not between", value1, value2, "parnum");
            return (Criteria) this;
        }

        public Criteria andParformIsNull() {
            addCriterion("PARFORM is null");
            return (Criteria) this;
        }

        public Criteria andParformIsNotNull() {
            addCriterion("PARFORM is not null");
            return (Criteria) this;
        }

        public Criteria andParformEqualTo(String value) {
            addCriterion("PARFORM =", value, "parform");
            return (Criteria) this;
        }

        public Criteria andParformNotEqualTo(String value) {
            addCriterion("PARFORM <>", value, "parform");
            return (Criteria) this;
        }

        public Criteria andParformGreaterThan(String value) {
            addCriterion("PARFORM >", value, "parform");
            return (Criteria) this;
        }

        public Criteria andParformGreaterThanOrEqualTo(String value) {
            addCriterion("PARFORM >=", value, "parform");
            return (Criteria) this;
        }

        public Criteria andParformLessThan(String value) {
            addCriterion("PARFORM <", value, "parform");
            return (Criteria) this;
        }

        public Criteria andParformLessThanOrEqualTo(String value) {
            addCriterion("PARFORM <=", value, "parform");
            return (Criteria) this;
        }

        public Criteria andParformLike(String value) {
            addCriterion("PARFORM like", value, "parform");
            return (Criteria) this;
        }

        public Criteria andParformNotLike(String value) {
            addCriterion("PARFORM not like", value, "parform");
            return (Criteria) this;
        }

        public Criteria andParformIn(List<String> values) {
            addCriterion("PARFORM in", values, "parform");
            return (Criteria) this;
        }

        public Criteria andParformNotIn(List<String> values) {
            addCriterion("PARFORM not in", values, "parform");
            return (Criteria) this;
        }

        public Criteria andParformBetween(String value1, String value2) {
            addCriterion("PARFORM between", value1, value2, "parform");
            return (Criteria) this;
        }

        public Criteria andParformNotBetween(String value1, String value2) {
            addCriterion("PARFORM not between", value1, value2, "parform");
            return (Criteria) this;
        }

        public Criteria andExenumIsNull() {
            addCriterion("EXENUM is null");
            return (Criteria) this;
        }

        public Criteria andExenumIsNotNull() {
            addCriterion("EXENUM is not null");
            return (Criteria) this;
        }

        public Criteria andExenumEqualTo(BigDecimal value) {
            addCriterion("EXENUM =", value, "exenum");
            return (Criteria) this;
        }

        public Criteria andExenumNotEqualTo(BigDecimal value) {
            addCriterion("EXENUM <>", value, "exenum");
            return (Criteria) this;
        }

        public Criteria andExenumGreaterThan(BigDecimal value) {
            addCriterion("EXENUM >", value, "exenum");
            return (Criteria) this;
        }

        public Criteria andExenumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXENUM >=", value, "exenum");
            return (Criteria) this;
        }

        public Criteria andExenumLessThan(BigDecimal value) {
            addCriterion("EXENUM <", value, "exenum");
            return (Criteria) this;
        }

        public Criteria andExenumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXENUM <=", value, "exenum");
            return (Criteria) this;
        }

        public Criteria andExenumIn(List<BigDecimal> values) {
            addCriterion("EXENUM in", values, "exenum");
            return (Criteria) this;
        }

        public Criteria andExenumNotIn(List<BigDecimal> values) {
            addCriterion("EXENUM not in", values, "exenum");
            return (Criteria) this;
        }

        public Criteria andExenumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXENUM between", value1, value2, "exenum");
            return (Criteria) this;
        }

        public Criteria andExenumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXENUM not between", value1, value2, "exenum");
            return (Criteria) this;
        }

        public Criteria andEmpnumIsNull() {
            addCriterion("EMPNUM is null");
            return (Criteria) this;
        }

        public Criteria andEmpnumIsNotNull() {
            addCriterion("EMPNUM is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnumEqualTo(BigDecimal value) {
            addCriterion("EMPNUM =", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumNotEqualTo(BigDecimal value) {
            addCriterion("EMPNUM <>", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumGreaterThan(BigDecimal value) {
            addCriterion("EMPNUM >", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EMPNUM >=", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumLessThan(BigDecimal value) {
            addCriterion("EMPNUM <", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EMPNUM <=", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumIn(List<BigDecimal> values) {
            addCriterion("EMPNUM in", values, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumNotIn(List<BigDecimal> values) {
            addCriterion("EMPNUM not in", values, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMPNUM between", value1, value2, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMPNUM not between", value1, value2, "empnum");
            return (Criteria) this;
        }

        public Criteria andSconformIsNull() {
            addCriterion("SCONFORM is null");
            return (Criteria) this;
        }

        public Criteria andSconformIsNotNull() {
            addCriterion("SCONFORM is not null");
            return (Criteria) this;
        }

        public Criteria andSconformEqualTo(String value) {
            addCriterion("SCONFORM =", value, "sconform");
            return (Criteria) this;
        }

        public Criteria andSconformNotEqualTo(String value) {
            addCriterion("SCONFORM <>", value, "sconform");
            return (Criteria) this;
        }

        public Criteria andSconformGreaterThan(String value) {
            addCriterion("SCONFORM >", value, "sconform");
            return (Criteria) this;
        }

        public Criteria andSconformGreaterThanOrEqualTo(String value) {
            addCriterion("SCONFORM >=", value, "sconform");
            return (Criteria) this;
        }

        public Criteria andSconformLessThan(String value) {
            addCriterion("SCONFORM <", value, "sconform");
            return (Criteria) this;
        }

        public Criteria andSconformLessThanOrEqualTo(String value) {
            addCriterion("SCONFORM <=", value, "sconform");
            return (Criteria) this;
        }

        public Criteria andSconformLike(String value) {
            addCriterion("SCONFORM like", value, "sconform");
            return (Criteria) this;
        }

        public Criteria andSconformNotLike(String value) {
            addCriterion("SCONFORM not like", value, "sconform");
            return (Criteria) this;
        }

        public Criteria andSconformIn(List<String> values) {
            addCriterion("SCONFORM in", values, "sconform");
            return (Criteria) this;
        }

        public Criteria andSconformNotIn(List<String> values) {
            addCriterion("SCONFORM not in", values, "sconform");
            return (Criteria) this;
        }

        public Criteria andSconformBetween(String value1, String value2) {
            addCriterion("SCONFORM between", value1, value2, "sconform");
            return (Criteria) this;
        }

        public Criteria andSconformNotBetween(String value1, String value2) {
            addCriterion("SCONFORM not between", value1, value2, "sconform");
            return (Criteria) this;
        }

        public Criteria andSupentnameIsNull() {
            addCriterion("SUPENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andSupentnameIsNotNull() {
            addCriterion("SUPENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupentnameEqualTo(String value) {
            addCriterion("SUPENTNAME =", value, "supentname");
            return (Criteria) this;
        }

        public Criteria andSupentnameNotEqualTo(String value) {
            addCriterion("SUPENTNAME <>", value, "supentname");
            return (Criteria) this;
        }

        public Criteria andSupentnameGreaterThan(String value) {
            addCriterion("SUPENTNAME >", value, "supentname");
            return (Criteria) this;
        }

        public Criteria andSupentnameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPENTNAME >=", value, "supentname");
            return (Criteria) this;
        }

        public Criteria andSupentnameLessThan(String value) {
            addCriterion("SUPENTNAME <", value, "supentname");
            return (Criteria) this;
        }

        public Criteria andSupentnameLessThanOrEqualTo(String value) {
            addCriterion("SUPENTNAME <=", value, "supentname");
            return (Criteria) this;
        }

        public Criteria andSupentnameLike(String value) {
            addCriterion("SUPENTNAME like", value, "supentname");
            return (Criteria) this;
        }

        public Criteria andSupentnameNotLike(String value) {
            addCriterion("SUPENTNAME not like", value, "supentname");
            return (Criteria) this;
        }

        public Criteria andSupentnameIn(List<String> values) {
            addCriterion("SUPENTNAME in", values, "supentname");
            return (Criteria) this;
        }

        public Criteria andSupentnameNotIn(List<String> values) {
            addCriterion("SUPENTNAME not in", values, "supentname");
            return (Criteria) this;
        }

        public Criteria andSupentnameBetween(String value1, String value2) {
            addCriterion("SUPENTNAME between", value1, value2, "supentname");
            return (Criteria) this;
        }

        public Criteria andSupentnameNotBetween(String value1, String value2) {
            addCriterion("SUPENTNAME not between", value1, value2, "supentname");
            return (Criteria) this;
        }

        public Criteria andSupregnoIsNull() {
            addCriterion("SUPREGNO is null");
            return (Criteria) this;
        }

        public Criteria andSupregnoIsNotNull() {
            addCriterion("SUPREGNO is not null");
            return (Criteria) this;
        }

        public Criteria andSupregnoEqualTo(String value) {
            addCriterion("SUPREGNO =", value, "supregno");
            return (Criteria) this;
        }

        public Criteria andSupregnoNotEqualTo(String value) {
            addCriterion("SUPREGNO <>", value, "supregno");
            return (Criteria) this;
        }

        public Criteria andSupregnoGreaterThan(String value) {
            addCriterion("SUPREGNO >", value, "supregno");
            return (Criteria) this;
        }

        public Criteria andSupregnoGreaterThanOrEqualTo(String value) {
            addCriterion("SUPREGNO >=", value, "supregno");
            return (Criteria) this;
        }

        public Criteria andSupregnoLessThan(String value) {
            addCriterion("SUPREGNO <", value, "supregno");
            return (Criteria) this;
        }

        public Criteria andSupregnoLessThanOrEqualTo(String value) {
            addCriterion("SUPREGNO <=", value, "supregno");
            return (Criteria) this;
        }

        public Criteria andSupregnoLike(String value) {
            addCriterion("SUPREGNO like", value, "supregno");
            return (Criteria) this;
        }

        public Criteria andSupregnoNotLike(String value) {
            addCriterion("SUPREGNO not like", value, "supregno");
            return (Criteria) this;
        }

        public Criteria andSupregnoIn(List<String> values) {
            addCriterion("SUPREGNO in", values, "supregno");
            return (Criteria) this;
        }

        public Criteria andSupregnoNotIn(List<String> values) {
            addCriterion("SUPREGNO not in", values, "supregno");
            return (Criteria) this;
        }

        public Criteria andSupregnoBetween(String value1, String value2) {
            addCriterion("SUPREGNO between", value1, value2, "supregno");
            return (Criteria) this;
        }

        public Criteria andSupregnoNotBetween(String value1, String value2) {
            addCriterion("SUPREGNO not between", value1, value2, "supregno");
            return (Criteria) this;
        }

        public Criteria andSupregnorgIsNull() {
            addCriterion("SUPREGNORG is null");
            return (Criteria) this;
        }

        public Criteria andSupregnorgIsNotNull() {
            addCriterion("SUPREGNORG is not null");
            return (Criteria) this;
        }

        public Criteria andSupregnorgEqualTo(String value) {
            addCriterion("SUPREGNORG =", value, "supregnorg");
            return (Criteria) this;
        }

        public Criteria andSupregnorgNotEqualTo(String value) {
            addCriterion("SUPREGNORG <>", value, "supregnorg");
            return (Criteria) this;
        }

        public Criteria andSupregnorgGreaterThan(String value) {
            addCriterion("SUPREGNORG >", value, "supregnorg");
            return (Criteria) this;
        }

        public Criteria andSupregnorgGreaterThanOrEqualTo(String value) {
            addCriterion("SUPREGNORG >=", value, "supregnorg");
            return (Criteria) this;
        }

        public Criteria andSupregnorgLessThan(String value) {
            addCriterion("SUPREGNORG <", value, "supregnorg");
            return (Criteria) this;
        }

        public Criteria andSupregnorgLessThanOrEqualTo(String value) {
            addCriterion("SUPREGNORG <=", value, "supregnorg");
            return (Criteria) this;
        }

        public Criteria andSupregnorgLike(String value) {
            addCriterion("SUPREGNORG like", value, "supregnorg");
            return (Criteria) this;
        }

        public Criteria andSupregnorgNotLike(String value) {
            addCriterion("SUPREGNORG not like", value, "supregnorg");
            return (Criteria) this;
        }

        public Criteria andSupregnorgIn(List<String> values) {
            addCriterion("SUPREGNORG in", values, "supregnorg");
            return (Criteria) this;
        }

        public Criteria andSupregnorgNotIn(List<String> values) {
            addCriterion("SUPREGNORG not in", values, "supregnorg");
            return (Criteria) this;
        }

        public Criteria andSupregnorgBetween(String value1, String value2) {
            addCriterion("SUPREGNORG between", value1, value2, "supregnorg");
            return (Criteria) this;
        }

        public Criteria andSupregnorgNotBetween(String value1, String value2) {
            addCriterion("SUPREGNORG not between", value1, value2, "supregnorg");
            return (Criteria) this;
        }

        public Criteria andSupemailIsNull() {
            addCriterion("SUPEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andSupemailIsNotNull() {
            addCriterion("SUPEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSupemailEqualTo(String value) {
            addCriterion("SUPEMAIL =", value, "supemail");
            return (Criteria) this;
        }

        public Criteria andSupemailNotEqualTo(String value) {
            addCriterion("SUPEMAIL <>", value, "supemail");
            return (Criteria) this;
        }

        public Criteria andSupemailGreaterThan(String value) {
            addCriterion("SUPEMAIL >", value, "supemail");
            return (Criteria) this;
        }

        public Criteria andSupemailGreaterThanOrEqualTo(String value) {
            addCriterion("SUPEMAIL >=", value, "supemail");
            return (Criteria) this;
        }

        public Criteria andSupemailLessThan(String value) {
            addCriterion("SUPEMAIL <", value, "supemail");
            return (Criteria) this;
        }

        public Criteria andSupemailLessThanOrEqualTo(String value) {
            addCriterion("SUPEMAIL <=", value, "supemail");
            return (Criteria) this;
        }

        public Criteria andSupemailLike(String value) {
            addCriterion("SUPEMAIL like", value, "supemail");
            return (Criteria) this;
        }

        public Criteria andSupemailNotLike(String value) {
            addCriterion("SUPEMAIL not like", value, "supemail");
            return (Criteria) this;
        }

        public Criteria andSupemailIn(List<String> values) {
            addCriterion("SUPEMAIL in", values, "supemail");
            return (Criteria) this;
        }

        public Criteria andSupemailNotIn(List<String> values) {
            addCriterion("SUPEMAIL not in", values, "supemail");
            return (Criteria) this;
        }

        public Criteria andSupemailBetween(String value1, String value2) {
            addCriterion("SUPEMAIL between", value1, value2, "supemail");
            return (Criteria) this;
        }

        public Criteria andSupemailNotBetween(String value1, String value2) {
            addCriterion("SUPEMAIL not between", value1, value2, "supemail");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeIsNull() {
            addCriterion("FORCAPINDCODE is null");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeIsNotNull() {
            addCriterion("FORCAPINDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeEqualTo(String value) {
            addCriterion("FORCAPINDCODE =", value, "forcapindcode");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeNotEqualTo(String value) {
            addCriterion("FORCAPINDCODE <>", value, "forcapindcode");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeGreaterThan(String value) {
            addCriterion("FORCAPINDCODE >", value, "forcapindcode");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FORCAPINDCODE >=", value, "forcapindcode");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeLessThan(String value) {
            addCriterion("FORCAPINDCODE <", value, "forcapindcode");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeLessThanOrEqualTo(String value) {
            addCriterion("FORCAPINDCODE <=", value, "forcapindcode");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeLike(String value) {
            addCriterion("FORCAPINDCODE like", value, "forcapindcode");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeNotLike(String value) {
            addCriterion("FORCAPINDCODE not like", value, "forcapindcode");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeIn(List<String> values) {
            addCriterion("FORCAPINDCODE in", values, "forcapindcode");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeNotIn(List<String> values) {
            addCriterion("FORCAPINDCODE not in", values, "forcapindcode");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeBetween(String value1, String value2) {
            addCriterion("FORCAPINDCODE between", value1, value2, "forcapindcode");
            return (Criteria) this;
        }

        public Criteria andForcapindcodeNotBetween(String value1, String value2) {
            addCriterion("FORCAPINDCODE not between", value1, value2, "forcapindcode");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeIsNull() {
            addCriterion("MIDPREINDCODE is null");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeIsNotNull() {
            addCriterion("MIDPREINDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeEqualTo(String value) {
            addCriterion("MIDPREINDCODE =", value, "midpreindcode");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeNotEqualTo(String value) {
            addCriterion("MIDPREINDCODE <>", value, "midpreindcode");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeGreaterThan(String value) {
            addCriterion("MIDPREINDCODE >", value, "midpreindcode");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeGreaterThanOrEqualTo(String value) {
            addCriterion("MIDPREINDCODE >=", value, "midpreindcode");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeLessThan(String value) {
            addCriterion("MIDPREINDCODE <", value, "midpreindcode");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeLessThanOrEqualTo(String value) {
            addCriterion("MIDPREINDCODE <=", value, "midpreindcode");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeLike(String value) {
            addCriterion("MIDPREINDCODE like", value, "midpreindcode");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeNotLike(String value) {
            addCriterion("MIDPREINDCODE not like", value, "midpreindcode");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeIn(List<String> values) {
            addCriterion("MIDPREINDCODE in", values, "midpreindcode");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeNotIn(List<String> values) {
            addCriterion("MIDPREINDCODE not in", values, "midpreindcode");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeBetween(String value1, String value2) {
            addCriterion("MIDPREINDCODE between", value1, value2, "midpreindcode");
            return (Criteria) this;
        }

        public Criteria andMidpreindcodeNotBetween(String value1, String value2) {
            addCriterion("MIDPREINDCODE not between", value1, value2, "midpreindcode");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneIsNull() {
            addCriterion("ECOTECDEVZONE is null");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneIsNotNull() {
            addCriterion("ECOTECDEVZONE is not null");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneEqualTo(String value) {
            addCriterion("ECOTECDEVZONE =", value, "ecotecdevzone");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneNotEqualTo(String value) {
            addCriterion("ECOTECDEVZONE <>", value, "ecotecdevzone");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneGreaterThan(String value) {
            addCriterion("ECOTECDEVZONE >", value, "ecotecdevzone");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneGreaterThanOrEqualTo(String value) {
            addCriterion("ECOTECDEVZONE >=", value, "ecotecdevzone");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneLessThan(String value) {
            addCriterion("ECOTECDEVZONE <", value, "ecotecdevzone");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneLessThanOrEqualTo(String value) {
            addCriterion("ECOTECDEVZONE <=", value, "ecotecdevzone");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneLike(String value) {
            addCriterion("ECOTECDEVZONE like", value, "ecotecdevzone");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneNotLike(String value) {
            addCriterion("ECOTECDEVZONE not like", value, "ecotecdevzone");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneIn(List<String> values) {
            addCriterion("ECOTECDEVZONE in", values, "ecotecdevzone");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneNotIn(List<String> values) {
            addCriterion("ECOTECDEVZONE not in", values, "ecotecdevzone");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneBetween(String value1, String value2) {
            addCriterion("ECOTECDEVZONE between", value1, value2, "ecotecdevzone");
            return (Criteria) this;
        }

        public Criteria andEcotecdevzoneNotBetween(String value1, String value2) {
            addCriterion("ECOTECDEVZONE not between", value1, value2, "ecotecdevzone");
            return (Criteria) this;
        }

        public Criteria andProtypeIsNull() {
            addCriterion("PROTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProtypeIsNotNull() {
            addCriterion("PROTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProtypeEqualTo(String value) {
            addCriterion("PROTYPE =", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotEqualTo(String value) {
            addCriterion("PROTYPE <>", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeGreaterThan(String value) {
            addCriterion("PROTYPE >", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROTYPE >=", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLessThan(String value) {
            addCriterion("PROTYPE <", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLessThanOrEqualTo(String value) {
            addCriterion("PROTYPE <=", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLike(String value) {
            addCriterion("PROTYPE like", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotLike(String value) {
            addCriterion("PROTYPE not like", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeIn(List<String> values) {
            addCriterion("PROTYPE in", values, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotIn(List<String> values) {
            addCriterion("PROTYPE not in", values, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeBetween(String value1, String value2) {
            addCriterion("PROTYPE between", value1, value2, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotBetween(String value1, String value2) {
            addCriterion("PROTYPE not between", value1, value2, "protype");
            return (Criteria) this;
        }

        public Criteria andCongroIsNull() {
            addCriterion("CONGRO is null");
            return (Criteria) this;
        }

        public Criteria andCongroIsNotNull() {
            addCriterion("CONGRO is not null");
            return (Criteria) this;
        }

        public Criteria andCongroEqualTo(BigDecimal value) {
            addCriterion("CONGRO =", value, "congro");
            return (Criteria) this;
        }

        public Criteria andCongroNotEqualTo(BigDecimal value) {
            addCriterion("CONGRO <>", value, "congro");
            return (Criteria) this;
        }

        public Criteria andCongroGreaterThan(BigDecimal value) {
            addCriterion("CONGRO >", value, "congro");
            return (Criteria) this;
        }

        public Criteria andCongroGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONGRO >=", value, "congro");
            return (Criteria) this;
        }

        public Criteria andCongroLessThan(BigDecimal value) {
            addCriterion("CONGRO <", value, "congro");
            return (Criteria) this;
        }

        public Criteria andCongroLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONGRO <=", value, "congro");
            return (Criteria) this;
        }

        public Criteria andCongroIn(List<BigDecimal> values) {
            addCriterion("CONGRO in", values, "congro");
            return (Criteria) this;
        }

        public Criteria andCongroNotIn(List<BigDecimal> values) {
            addCriterion("CONGRO not in", values, "congro");
            return (Criteria) this;
        }

        public Criteria andCongroBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONGRO between", value1, value2, "congro");
            return (Criteria) this;
        }

        public Criteria andCongroNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONGRO not between", value1, value2, "congro");
            return (Criteria) this;
        }

        public Criteria andCongrocurIsNull() {
            addCriterion("CONGROCUR is null");
            return (Criteria) this;
        }

        public Criteria andCongrocurIsNotNull() {
            addCriterion("CONGROCUR is not null");
            return (Criteria) this;
        }

        public Criteria andCongrocurEqualTo(String value) {
            addCriterion("CONGROCUR =", value, "congrocur");
            return (Criteria) this;
        }

        public Criteria andCongrocurNotEqualTo(String value) {
            addCriterion("CONGROCUR <>", value, "congrocur");
            return (Criteria) this;
        }

        public Criteria andCongrocurGreaterThan(String value) {
            addCriterion("CONGROCUR >", value, "congrocur");
            return (Criteria) this;
        }

        public Criteria andCongrocurGreaterThanOrEqualTo(String value) {
            addCriterion("CONGROCUR >=", value, "congrocur");
            return (Criteria) this;
        }

        public Criteria andCongrocurLessThan(String value) {
            addCriterion("CONGROCUR <", value, "congrocur");
            return (Criteria) this;
        }

        public Criteria andCongrocurLessThanOrEqualTo(String value) {
            addCriterion("CONGROCUR <=", value, "congrocur");
            return (Criteria) this;
        }

        public Criteria andCongrocurLike(String value) {
            addCriterion("CONGROCUR like", value, "congrocur");
            return (Criteria) this;
        }

        public Criteria andCongrocurNotLike(String value) {
            addCriterion("CONGROCUR not like", value, "congrocur");
            return (Criteria) this;
        }

        public Criteria andCongrocurIn(List<String> values) {
            addCriterion("CONGROCUR in", values, "congrocur");
            return (Criteria) this;
        }

        public Criteria andCongrocurNotIn(List<String> values) {
            addCriterion("CONGROCUR not in", values, "congrocur");
            return (Criteria) this;
        }

        public Criteria andCongrocurBetween(String value1, String value2) {
            addCriterion("CONGROCUR between", value1, value2, "congrocur");
            return (Criteria) this;
        }

        public Criteria andCongrocurNotBetween(String value1, String value2) {
            addCriterion("CONGROCUR not between", value1, value2, "congrocur");
            return (Criteria) this;
        }

        public Criteria andCongrousdIsNull() {
            addCriterion("CONGROUSD is null");
            return (Criteria) this;
        }

        public Criteria andCongrousdIsNotNull() {
            addCriterion("CONGROUSD is not null");
            return (Criteria) this;
        }

        public Criteria andCongrousdEqualTo(BigDecimal value) {
            addCriterion("CONGROUSD =", value, "congrousd");
            return (Criteria) this;
        }

        public Criteria andCongrousdNotEqualTo(BigDecimal value) {
            addCriterion("CONGROUSD <>", value, "congrousd");
            return (Criteria) this;
        }

        public Criteria andCongrousdGreaterThan(BigDecimal value) {
            addCriterion("CONGROUSD >", value, "congrousd");
            return (Criteria) this;
        }

        public Criteria andCongrousdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONGROUSD >=", value, "congrousd");
            return (Criteria) this;
        }

        public Criteria andCongrousdLessThan(BigDecimal value) {
            addCriterion("CONGROUSD <", value, "congrousd");
            return (Criteria) this;
        }

        public Criteria andCongrousdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONGROUSD <=", value, "congrousd");
            return (Criteria) this;
        }

        public Criteria andCongrousdIn(List<BigDecimal> values) {
            addCriterion("CONGROUSD in", values, "congrousd");
            return (Criteria) this;
        }

        public Criteria andCongrousdNotIn(List<BigDecimal> values) {
            addCriterion("CONGROUSD not in", values, "congrousd");
            return (Criteria) this;
        }

        public Criteria andCongrousdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONGROUSD between", value1, value2, "congrousd");
            return (Criteria) this;
        }

        public Criteria andCongrousdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONGROUSD not between", value1, value2, "congrousd");
            return (Criteria) this;
        }

        public Criteria andFundamIsNull() {
            addCriterion("FUNDAM is null");
            return (Criteria) this;
        }

        public Criteria andFundamIsNotNull() {
            addCriterion("FUNDAM is not null");
            return (Criteria) this;
        }

        public Criteria andFundamEqualTo(BigDecimal value) {
            addCriterion("FUNDAM =", value, "fundam");
            return (Criteria) this;
        }

        public Criteria andFundamNotEqualTo(BigDecimal value) {
            addCriterion("FUNDAM <>", value, "fundam");
            return (Criteria) this;
        }

        public Criteria andFundamGreaterThan(BigDecimal value) {
            addCriterion("FUNDAM >", value, "fundam");
            return (Criteria) this;
        }

        public Criteria andFundamGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUNDAM >=", value, "fundam");
            return (Criteria) this;
        }

        public Criteria andFundamLessThan(BigDecimal value) {
            addCriterion("FUNDAM <", value, "fundam");
            return (Criteria) this;
        }

        public Criteria andFundamLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUNDAM <=", value, "fundam");
            return (Criteria) this;
        }

        public Criteria andFundamIn(List<BigDecimal> values) {
            addCriterion("FUNDAM in", values, "fundam");
            return (Criteria) this;
        }

        public Criteria andFundamNotIn(List<BigDecimal> values) {
            addCriterion("FUNDAM not in", values, "fundam");
            return (Criteria) this;
        }

        public Criteria andFundamBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUNDAM between", value1, value2, "fundam");
            return (Criteria) this;
        }

        public Criteria andFundamNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUNDAM not between", value1, value2, "fundam");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andFundamusdIsNull() {
            addCriterion("FUNDAMUSD is null");
            return (Criteria) this;
        }

        public Criteria andFundamusdIsNotNull() {
            addCriterion("FUNDAMUSD is not null");
            return (Criteria) this;
        }

        public Criteria andFundamusdEqualTo(BigDecimal value) {
            addCriterion("FUNDAMUSD =", value, "fundamusd");
            return (Criteria) this;
        }

        public Criteria andFundamusdNotEqualTo(BigDecimal value) {
            addCriterion("FUNDAMUSD <>", value, "fundamusd");
            return (Criteria) this;
        }

        public Criteria andFundamusdGreaterThan(BigDecimal value) {
            addCriterion("FUNDAMUSD >", value, "fundamusd");
            return (Criteria) this;
        }

        public Criteria andFundamusdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUNDAMUSD >=", value, "fundamusd");
            return (Criteria) this;
        }

        public Criteria andFundamusdLessThan(BigDecimal value) {
            addCriterion("FUNDAMUSD <", value, "fundamusd");
            return (Criteria) this;
        }

        public Criteria andFundamusdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUNDAMUSD <=", value, "fundamusd");
            return (Criteria) this;
        }

        public Criteria andFundamusdIn(List<BigDecimal> values) {
            addCriterion("FUNDAMUSD in", values, "fundamusd");
            return (Criteria) this;
        }

        public Criteria andFundamusdNotIn(List<BigDecimal> values) {
            addCriterion("FUNDAMUSD not in", values, "fundamusd");
            return (Criteria) this;
        }

        public Criteria andFundamusdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUNDAMUSD between", value1, value2, "fundamusd");
            return (Criteria) this;
        }

        public Criteria andFundamusdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUNDAMUSD not between", value1, value2, "fundamusd");
            return (Criteria) this;
        }

        public Criteria andFundamrmbIsNull() {
            addCriterion("FUNDAMRMB is null");
            return (Criteria) this;
        }

        public Criteria andFundamrmbIsNotNull() {
            addCriterion("FUNDAMRMB is not null");
            return (Criteria) this;
        }

        public Criteria andFundamrmbEqualTo(BigDecimal value) {
            addCriterion("FUNDAMRMB =", value, "fundamrmb");
            return (Criteria) this;
        }

        public Criteria andFundamrmbNotEqualTo(BigDecimal value) {
            addCriterion("FUNDAMRMB <>", value, "fundamrmb");
            return (Criteria) this;
        }

        public Criteria andFundamrmbGreaterThan(BigDecimal value) {
            addCriterion("FUNDAMRMB >", value, "fundamrmb");
            return (Criteria) this;
        }

        public Criteria andFundamrmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUNDAMRMB >=", value, "fundamrmb");
            return (Criteria) this;
        }

        public Criteria andFundamrmbLessThan(BigDecimal value) {
            addCriterion("FUNDAMRMB <", value, "fundamrmb");
            return (Criteria) this;
        }

        public Criteria andFundamrmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUNDAMRMB <=", value, "fundamrmb");
            return (Criteria) this;
        }

        public Criteria andFundamrmbIn(List<BigDecimal> values) {
            addCriterion("FUNDAMRMB in", values, "fundamrmb");
            return (Criteria) this;
        }

        public Criteria andFundamrmbNotIn(List<BigDecimal> values) {
            addCriterion("FUNDAMRMB not in", values, "fundamrmb");
            return (Criteria) this;
        }

        public Criteria andFundamrmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUNDAMRMB between", value1, value2, "fundamrmb");
            return (Criteria) this;
        }

        public Criteria andFundamrmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUNDAMRMB not between", value1, value2, "fundamrmb");
            return (Criteria) this;
        }

        public Criteria andRegcapcurIsNull() {
            addCriterion("REGCAPCUR is null");
            return (Criteria) this;
        }

        public Criteria andRegcapcurIsNotNull() {
            addCriterion("REGCAPCUR is not null");
            return (Criteria) this;
        }

        public Criteria andRegcapcurEqualTo(String value) {
            addCriterion("REGCAPCUR =", value, "regcapcur");
            return (Criteria) this;
        }

        public Criteria andRegcapcurNotEqualTo(String value) {
            addCriterion("REGCAPCUR <>", value, "regcapcur");
            return (Criteria) this;
        }

        public Criteria andRegcapcurGreaterThan(String value) {
            addCriterion("REGCAPCUR >", value, "regcapcur");
            return (Criteria) this;
        }

        public Criteria andRegcapcurGreaterThanOrEqualTo(String value) {
            addCriterion("REGCAPCUR >=", value, "regcapcur");
            return (Criteria) this;
        }

        public Criteria andRegcapcurLessThan(String value) {
            addCriterion("REGCAPCUR <", value, "regcapcur");
            return (Criteria) this;
        }

        public Criteria andRegcapcurLessThanOrEqualTo(String value) {
            addCriterion("REGCAPCUR <=", value, "regcapcur");
            return (Criteria) this;
        }

        public Criteria andRegcapcurLike(String value) {
            addCriterion("REGCAPCUR like", value, "regcapcur");
            return (Criteria) this;
        }

        public Criteria andRegcapcurNotLike(String value) {
            addCriterion("REGCAPCUR not like", value, "regcapcur");
            return (Criteria) this;
        }

        public Criteria andRegcapcurIn(List<String> values) {
            addCriterion("REGCAPCUR in", values, "regcapcur");
            return (Criteria) this;
        }

        public Criteria andRegcapcurNotIn(List<String> values) {
            addCriterion("REGCAPCUR not in", values, "regcapcur");
            return (Criteria) this;
        }

        public Criteria andRegcapcurBetween(String value1, String value2) {
            addCriterion("REGCAPCUR between", value1, value2, "regcapcur");
            return (Criteria) this;
        }

        public Criteria andRegcapcurNotBetween(String value1, String value2) {
            addCriterion("REGCAPCUR not between", value1, value2, "regcapcur");
            return (Criteria) this;
        }

        public Criteria andRegcapusdIsNull() {
            addCriterion("REGCAPUSD is null");
            return (Criteria) this;
        }

        public Criteria andRegcapusdIsNotNull() {
            addCriterion("REGCAPUSD is not null");
            return (Criteria) this;
        }

        public Criteria andRegcapusdEqualTo(BigDecimal value) {
            addCriterion("REGCAPUSD =", value, "regcapusd");
            return (Criteria) this;
        }

        public Criteria andRegcapusdNotEqualTo(BigDecimal value) {
            addCriterion("REGCAPUSD <>", value, "regcapusd");
            return (Criteria) this;
        }

        public Criteria andRegcapusdGreaterThan(BigDecimal value) {
            addCriterion("REGCAPUSD >", value, "regcapusd");
            return (Criteria) this;
        }

        public Criteria andRegcapusdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGCAPUSD >=", value, "regcapusd");
            return (Criteria) this;
        }

        public Criteria andRegcapusdLessThan(BigDecimal value) {
            addCriterion("REGCAPUSD <", value, "regcapusd");
            return (Criteria) this;
        }

        public Criteria andRegcapusdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGCAPUSD <=", value, "regcapusd");
            return (Criteria) this;
        }

        public Criteria andRegcapusdIn(List<BigDecimal> values) {
            addCriterion("REGCAPUSD in", values, "regcapusd");
            return (Criteria) this;
        }

        public Criteria andRegcapusdNotIn(List<BigDecimal> values) {
            addCriterion("REGCAPUSD not in", values, "regcapusd");
            return (Criteria) this;
        }

        public Criteria andRegcapusdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGCAPUSD between", value1, value2, "regcapusd");
            return (Criteria) this;
        }

        public Criteria andRegcapusdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGCAPUSD not between", value1, value2, "regcapusd");
            return (Criteria) this;
        }

        public Criteria andRegcaprmbIsNull() {
            addCriterion("REGCAPRMB is null");
            return (Criteria) this;
        }

        public Criteria andRegcaprmbIsNotNull() {
            addCriterion("REGCAPRMB is not null");
            return (Criteria) this;
        }

        public Criteria andRegcaprmbEqualTo(BigDecimal value) {
            addCriterion("REGCAPRMB =", value, "regcaprmb");
            return (Criteria) this;
        }

        public Criteria andRegcaprmbNotEqualTo(BigDecimal value) {
            addCriterion("REGCAPRMB <>", value, "regcaprmb");
            return (Criteria) this;
        }

        public Criteria andRegcaprmbGreaterThan(BigDecimal value) {
            addCriterion("REGCAPRMB >", value, "regcaprmb");
            return (Criteria) this;
        }

        public Criteria andRegcaprmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGCAPRMB >=", value, "regcaprmb");
            return (Criteria) this;
        }

        public Criteria andRegcaprmbLessThan(BigDecimal value) {
            addCriterion("REGCAPRMB <", value, "regcaprmb");
            return (Criteria) this;
        }

        public Criteria andRegcaprmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGCAPRMB <=", value, "regcaprmb");
            return (Criteria) this;
        }

        public Criteria andRegcaprmbIn(List<BigDecimal> values) {
            addCriterion("REGCAPRMB in", values, "regcaprmb");
            return (Criteria) this;
        }

        public Criteria andRegcaprmbNotIn(List<BigDecimal> values) {
            addCriterion("REGCAPRMB not in", values, "regcaprmb");
            return (Criteria) this;
        }

        public Criteria andRegcaprmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGCAPRMB between", value1, value2, "regcaprmb");
            return (Criteria) this;
        }

        public Criteria andRegcaprmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGCAPRMB not between", value1, value2, "regcaprmb");
            return (Criteria) this;
        }

        public Criteria andReccapcurIsNull() {
            addCriterion("RECCAPCUR is null");
            return (Criteria) this;
        }

        public Criteria andReccapcurIsNotNull() {
            addCriterion("RECCAPCUR is not null");
            return (Criteria) this;
        }

        public Criteria andReccapcurEqualTo(String value) {
            addCriterion("RECCAPCUR =", value, "reccapcur");
            return (Criteria) this;
        }

        public Criteria andReccapcurNotEqualTo(String value) {
            addCriterion("RECCAPCUR <>", value, "reccapcur");
            return (Criteria) this;
        }

        public Criteria andReccapcurGreaterThan(String value) {
            addCriterion("RECCAPCUR >", value, "reccapcur");
            return (Criteria) this;
        }

        public Criteria andReccapcurGreaterThanOrEqualTo(String value) {
            addCriterion("RECCAPCUR >=", value, "reccapcur");
            return (Criteria) this;
        }

        public Criteria andReccapcurLessThan(String value) {
            addCriterion("RECCAPCUR <", value, "reccapcur");
            return (Criteria) this;
        }

        public Criteria andReccapcurLessThanOrEqualTo(String value) {
            addCriterion("RECCAPCUR <=", value, "reccapcur");
            return (Criteria) this;
        }

        public Criteria andReccapcurLike(String value) {
            addCriterion("RECCAPCUR like", value, "reccapcur");
            return (Criteria) this;
        }

        public Criteria andReccapcurNotLike(String value) {
            addCriterion("RECCAPCUR not like", value, "reccapcur");
            return (Criteria) this;
        }

        public Criteria andReccapcurIn(List<String> values) {
            addCriterion("RECCAPCUR in", values, "reccapcur");
            return (Criteria) this;
        }

        public Criteria andReccapcurNotIn(List<String> values) {
            addCriterion("RECCAPCUR not in", values, "reccapcur");
            return (Criteria) this;
        }

        public Criteria andReccapcurBetween(String value1, String value2) {
            addCriterion("RECCAPCUR between", value1, value2, "reccapcur");
            return (Criteria) this;
        }

        public Criteria andReccapcurNotBetween(String value1, String value2) {
            addCriterion("RECCAPCUR not between", value1, value2, "reccapcur");
            return (Criteria) this;
        }

        public Criteria andReccapusdIsNull() {
            addCriterion("RECCAPUSD is null");
            return (Criteria) this;
        }

        public Criteria andReccapusdIsNotNull() {
            addCriterion("RECCAPUSD is not null");
            return (Criteria) this;
        }

        public Criteria andReccapusdEqualTo(BigDecimal value) {
            addCriterion("RECCAPUSD =", value, "reccapusd");
            return (Criteria) this;
        }

        public Criteria andReccapusdNotEqualTo(BigDecimal value) {
            addCriterion("RECCAPUSD <>", value, "reccapusd");
            return (Criteria) this;
        }

        public Criteria andReccapusdGreaterThan(BigDecimal value) {
            addCriterion("RECCAPUSD >", value, "reccapusd");
            return (Criteria) this;
        }

        public Criteria andReccapusdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECCAPUSD >=", value, "reccapusd");
            return (Criteria) this;
        }

        public Criteria andReccapusdLessThan(BigDecimal value) {
            addCriterion("RECCAPUSD <", value, "reccapusd");
            return (Criteria) this;
        }

        public Criteria andReccapusdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECCAPUSD <=", value, "reccapusd");
            return (Criteria) this;
        }

        public Criteria andReccapusdIn(List<BigDecimal> values) {
            addCriterion("RECCAPUSD in", values, "reccapusd");
            return (Criteria) this;
        }

        public Criteria andReccapusdNotIn(List<BigDecimal> values) {
            addCriterion("RECCAPUSD not in", values, "reccapusd");
            return (Criteria) this;
        }

        public Criteria andReccapusdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECCAPUSD between", value1, value2, "reccapusd");
            return (Criteria) this;
        }

        public Criteria andReccapusdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECCAPUSD not between", value1, value2, "reccapusd");
            return (Criteria) this;
        }

        public Criteria andReccaprmbIsNull() {
            addCriterion("RECCAPRMB is null");
            return (Criteria) this;
        }

        public Criteria andReccaprmbIsNotNull() {
            addCriterion("RECCAPRMB is not null");
            return (Criteria) this;
        }

        public Criteria andReccaprmbEqualTo(BigDecimal value) {
            addCriterion("RECCAPRMB =", value, "reccaprmb");
            return (Criteria) this;
        }

        public Criteria andReccaprmbNotEqualTo(BigDecimal value) {
            addCriterion("RECCAPRMB <>", value, "reccaprmb");
            return (Criteria) this;
        }

        public Criteria andReccaprmbGreaterThan(BigDecimal value) {
            addCriterion("RECCAPRMB >", value, "reccaprmb");
            return (Criteria) this;
        }

        public Criteria andReccaprmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECCAPRMB >=", value, "reccaprmb");
            return (Criteria) this;
        }

        public Criteria andReccaprmbLessThan(BigDecimal value) {
            addCriterion("RECCAPRMB <", value, "reccaprmb");
            return (Criteria) this;
        }

        public Criteria andReccaprmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECCAPRMB <=", value, "reccaprmb");
            return (Criteria) this;
        }

        public Criteria andReccaprmbIn(List<BigDecimal> values) {
            addCriterion("RECCAPRMB in", values, "reccaprmb");
            return (Criteria) this;
        }

        public Criteria andReccaprmbNotIn(List<BigDecimal> values) {
            addCriterion("RECCAPRMB not in", values, "reccaprmb");
            return (Criteria) this;
        }

        public Criteria andReccaprmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECCAPRMB between", value1, value2, "reccaprmb");
            return (Criteria) this;
        }

        public Criteria andReccaprmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECCAPRMB not between", value1, value2, "reccaprmb");
            return (Criteria) this;
        }

        public Criteria andDomeregcapIsNull() {
            addCriterion("DOMEREGCAP is null");
            return (Criteria) this;
        }

        public Criteria andDomeregcapIsNotNull() {
            addCriterion("DOMEREGCAP is not null");
            return (Criteria) this;
        }

        public Criteria andDomeregcapEqualTo(BigDecimal value) {
            addCriterion("DOMEREGCAP =", value, "domeregcap");
            return (Criteria) this;
        }

        public Criteria andDomeregcapNotEqualTo(BigDecimal value) {
            addCriterion("DOMEREGCAP <>", value, "domeregcap");
            return (Criteria) this;
        }

        public Criteria andDomeregcapGreaterThan(BigDecimal value) {
            addCriterion("DOMEREGCAP >", value, "domeregcap");
            return (Criteria) this;
        }

        public Criteria andDomeregcapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOMEREGCAP >=", value, "domeregcap");
            return (Criteria) this;
        }

        public Criteria andDomeregcapLessThan(BigDecimal value) {
            addCriterion("DOMEREGCAP <", value, "domeregcap");
            return (Criteria) this;
        }

        public Criteria andDomeregcapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOMEREGCAP <=", value, "domeregcap");
            return (Criteria) this;
        }

        public Criteria andDomeregcapIn(List<BigDecimal> values) {
            addCriterion("DOMEREGCAP in", values, "domeregcap");
            return (Criteria) this;
        }

        public Criteria andDomeregcapNotIn(List<BigDecimal> values) {
            addCriterion("DOMEREGCAP not in", values, "domeregcap");
            return (Criteria) this;
        }

        public Criteria andDomeregcapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOMEREGCAP between", value1, value2, "domeregcap");
            return (Criteria) this;
        }

        public Criteria andDomeregcapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOMEREGCAP not between", value1, value2, "domeregcap");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurIsNull() {
            addCriterion("DOMEREGCAPCUR is null");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurIsNotNull() {
            addCriterion("DOMEREGCAPCUR is not null");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurEqualTo(String value) {
            addCriterion("DOMEREGCAPCUR =", value, "domeregcapcur");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurNotEqualTo(String value) {
            addCriterion("DOMEREGCAPCUR <>", value, "domeregcapcur");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurGreaterThan(String value) {
            addCriterion("DOMEREGCAPCUR >", value, "domeregcapcur");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurGreaterThanOrEqualTo(String value) {
            addCriterion("DOMEREGCAPCUR >=", value, "domeregcapcur");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurLessThan(String value) {
            addCriterion("DOMEREGCAPCUR <", value, "domeregcapcur");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurLessThanOrEqualTo(String value) {
            addCriterion("DOMEREGCAPCUR <=", value, "domeregcapcur");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurLike(String value) {
            addCriterion("DOMEREGCAPCUR like", value, "domeregcapcur");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurNotLike(String value) {
            addCriterion("DOMEREGCAPCUR not like", value, "domeregcapcur");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurIn(List<String> values) {
            addCriterion("DOMEREGCAPCUR in", values, "domeregcapcur");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurNotIn(List<String> values) {
            addCriterion("DOMEREGCAPCUR not in", values, "domeregcapcur");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurBetween(String value1, String value2) {
            addCriterion("DOMEREGCAPCUR between", value1, value2, "domeregcapcur");
            return (Criteria) this;
        }

        public Criteria andDomeregcapcurNotBetween(String value1, String value2) {
            addCriterion("DOMEREGCAPCUR not between", value1, value2, "domeregcapcur");
            return (Criteria) this;
        }

        public Criteria andDomeregcapusdIsNull() {
            addCriterion("DOMEREGCAPUSD is null");
            return (Criteria) this;
        }

        public Criteria andDomeregcapusdIsNotNull() {
            addCriterion("DOMEREGCAPUSD is not null");
            return (Criteria) this;
        }

        public Criteria andDomeregcapusdEqualTo(BigDecimal value) {
            addCriterion("DOMEREGCAPUSD =", value, "domeregcapusd");
            return (Criteria) this;
        }

        public Criteria andDomeregcapusdNotEqualTo(BigDecimal value) {
            addCriterion("DOMEREGCAPUSD <>", value, "domeregcapusd");
            return (Criteria) this;
        }

        public Criteria andDomeregcapusdGreaterThan(BigDecimal value) {
            addCriterion("DOMEREGCAPUSD >", value, "domeregcapusd");
            return (Criteria) this;
        }

        public Criteria andDomeregcapusdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOMEREGCAPUSD >=", value, "domeregcapusd");
            return (Criteria) this;
        }

        public Criteria andDomeregcapusdLessThan(BigDecimal value) {
            addCriterion("DOMEREGCAPUSD <", value, "domeregcapusd");
            return (Criteria) this;
        }

        public Criteria andDomeregcapusdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOMEREGCAPUSD <=", value, "domeregcapusd");
            return (Criteria) this;
        }

        public Criteria andDomeregcapusdIn(List<BigDecimal> values) {
            addCriterion("DOMEREGCAPUSD in", values, "domeregcapusd");
            return (Criteria) this;
        }

        public Criteria andDomeregcapusdNotIn(List<BigDecimal> values) {
            addCriterion("DOMEREGCAPUSD not in", values, "domeregcapusd");
            return (Criteria) this;
        }

        public Criteria andDomeregcapusdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOMEREGCAPUSD between", value1, value2, "domeregcapusd");
            return (Criteria) this;
        }

        public Criteria andDomeregcapusdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOMEREGCAPUSD not between", value1, value2, "domeregcapusd");
            return (Criteria) this;
        }

        public Criteria andDomeregcapinvratIsNull() {
            addCriterion("DOMEREGCAPINVRAT is null");
            return (Criteria) this;
        }

        public Criteria andDomeregcapinvratIsNotNull() {
            addCriterion("DOMEREGCAPINVRAT is not null");
            return (Criteria) this;
        }

        public Criteria andDomeregcapinvratEqualTo(BigDecimal value) {
            addCriterion("DOMEREGCAPINVRAT =", value, "domeregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andDomeregcapinvratNotEqualTo(BigDecimal value) {
            addCriterion("DOMEREGCAPINVRAT <>", value, "domeregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andDomeregcapinvratGreaterThan(BigDecimal value) {
            addCriterion("DOMEREGCAPINVRAT >", value, "domeregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andDomeregcapinvratGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOMEREGCAPINVRAT >=", value, "domeregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andDomeregcapinvratLessThan(BigDecimal value) {
            addCriterion("DOMEREGCAPINVRAT <", value, "domeregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andDomeregcapinvratLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOMEREGCAPINVRAT <=", value, "domeregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andDomeregcapinvratIn(List<BigDecimal> values) {
            addCriterion("DOMEREGCAPINVRAT in", values, "domeregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andDomeregcapinvratNotIn(List<BigDecimal> values) {
            addCriterion("DOMEREGCAPINVRAT not in", values, "domeregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andDomeregcapinvratBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOMEREGCAPINVRAT between", value1, value2, "domeregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andDomeregcapinvratNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOMEREGCAPINVRAT not between", value1, value2, "domeregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andDomereccapIsNull() {
            addCriterion("DOMERECCAP is null");
            return (Criteria) this;
        }

        public Criteria andDomereccapIsNotNull() {
            addCriterion("DOMERECCAP is not null");
            return (Criteria) this;
        }

        public Criteria andDomereccapEqualTo(BigDecimal value) {
            addCriterion("DOMERECCAP =", value, "domereccap");
            return (Criteria) this;
        }

        public Criteria andDomereccapNotEqualTo(BigDecimal value) {
            addCriterion("DOMERECCAP <>", value, "domereccap");
            return (Criteria) this;
        }

        public Criteria andDomereccapGreaterThan(BigDecimal value) {
            addCriterion("DOMERECCAP >", value, "domereccap");
            return (Criteria) this;
        }

        public Criteria andDomereccapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOMERECCAP >=", value, "domereccap");
            return (Criteria) this;
        }

        public Criteria andDomereccapLessThan(BigDecimal value) {
            addCriterion("DOMERECCAP <", value, "domereccap");
            return (Criteria) this;
        }

        public Criteria andDomereccapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOMERECCAP <=", value, "domereccap");
            return (Criteria) this;
        }

        public Criteria andDomereccapIn(List<BigDecimal> values) {
            addCriterion("DOMERECCAP in", values, "domereccap");
            return (Criteria) this;
        }

        public Criteria andDomereccapNotIn(List<BigDecimal> values) {
            addCriterion("DOMERECCAP not in", values, "domereccap");
            return (Criteria) this;
        }

        public Criteria andDomereccapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOMERECCAP between", value1, value2, "domereccap");
            return (Criteria) this;
        }

        public Criteria andDomereccapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOMERECCAP not between", value1, value2, "domereccap");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurIsNull() {
            addCriterion("DOMERECCAPCUR is null");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurIsNotNull() {
            addCriterion("DOMERECCAPCUR is not null");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurEqualTo(String value) {
            addCriterion("DOMERECCAPCUR =", value, "domereccapcur");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurNotEqualTo(String value) {
            addCriterion("DOMERECCAPCUR <>", value, "domereccapcur");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurGreaterThan(String value) {
            addCriterion("DOMERECCAPCUR >", value, "domereccapcur");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurGreaterThanOrEqualTo(String value) {
            addCriterion("DOMERECCAPCUR >=", value, "domereccapcur");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurLessThan(String value) {
            addCriterion("DOMERECCAPCUR <", value, "domereccapcur");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurLessThanOrEqualTo(String value) {
            addCriterion("DOMERECCAPCUR <=", value, "domereccapcur");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurLike(String value) {
            addCriterion("DOMERECCAPCUR like", value, "domereccapcur");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurNotLike(String value) {
            addCriterion("DOMERECCAPCUR not like", value, "domereccapcur");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurIn(List<String> values) {
            addCriterion("DOMERECCAPCUR in", values, "domereccapcur");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurNotIn(List<String> values) {
            addCriterion("DOMERECCAPCUR not in", values, "domereccapcur");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurBetween(String value1, String value2) {
            addCriterion("DOMERECCAPCUR between", value1, value2, "domereccapcur");
            return (Criteria) this;
        }

        public Criteria andDomereccapcurNotBetween(String value1, String value2) {
            addCriterion("DOMERECCAPCUR not between", value1, value2, "domereccapcur");
            return (Criteria) this;
        }

        public Criteria andDomereccapusdIsNull() {
            addCriterion("DOMERECCAPUSD is null");
            return (Criteria) this;
        }

        public Criteria andDomereccapusdIsNotNull() {
            addCriterion("DOMERECCAPUSD is not null");
            return (Criteria) this;
        }

        public Criteria andDomereccapusdEqualTo(BigDecimal value) {
            addCriterion("DOMERECCAPUSD =", value, "domereccapusd");
            return (Criteria) this;
        }

        public Criteria andDomereccapusdNotEqualTo(BigDecimal value) {
            addCriterion("DOMERECCAPUSD <>", value, "domereccapusd");
            return (Criteria) this;
        }

        public Criteria andDomereccapusdGreaterThan(BigDecimal value) {
            addCriterion("DOMERECCAPUSD >", value, "domereccapusd");
            return (Criteria) this;
        }

        public Criteria andDomereccapusdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOMERECCAPUSD >=", value, "domereccapusd");
            return (Criteria) this;
        }

        public Criteria andDomereccapusdLessThan(BigDecimal value) {
            addCriterion("DOMERECCAPUSD <", value, "domereccapusd");
            return (Criteria) this;
        }

        public Criteria andDomereccapusdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOMERECCAPUSD <=", value, "domereccapusd");
            return (Criteria) this;
        }

        public Criteria andDomereccapusdIn(List<BigDecimal> values) {
            addCriterion("DOMERECCAPUSD in", values, "domereccapusd");
            return (Criteria) this;
        }

        public Criteria andDomereccapusdNotIn(List<BigDecimal> values) {
            addCriterion("DOMERECCAPUSD not in", values, "domereccapusd");
            return (Criteria) this;
        }

        public Criteria andDomereccapusdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOMERECCAPUSD between", value1, value2, "domereccapusd");
            return (Criteria) this;
        }

        public Criteria andDomereccapusdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOMERECCAPUSD not between", value1, value2, "domereccapusd");
            return (Criteria) this;
        }

        public Criteria andDomereccapcanpropIsNull() {
            addCriterion("DOMERECCAPCANPROP is null");
            return (Criteria) this;
        }

        public Criteria andDomereccapcanpropIsNotNull() {
            addCriterion("DOMERECCAPCANPROP is not null");
            return (Criteria) this;
        }

        public Criteria andDomereccapcanpropEqualTo(BigDecimal value) {
            addCriterion("DOMERECCAPCANPROP =", value, "domereccapcanprop");
            return (Criteria) this;
        }

        public Criteria andDomereccapcanpropNotEqualTo(BigDecimal value) {
            addCriterion("DOMERECCAPCANPROP <>", value, "domereccapcanprop");
            return (Criteria) this;
        }

        public Criteria andDomereccapcanpropGreaterThan(BigDecimal value) {
            addCriterion("DOMERECCAPCANPROP >", value, "domereccapcanprop");
            return (Criteria) this;
        }

        public Criteria andDomereccapcanpropGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOMERECCAPCANPROP >=", value, "domereccapcanprop");
            return (Criteria) this;
        }

        public Criteria andDomereccapcanpropLessThan(BigDecimal value) {
            addCriterion("DOMERECCAPCANPROP <", value, "domereccapcanprop");
            return (Criteria) this;
        }

        public Criteria andDomereccapcanpropLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOMERECCAPCANPROP <=", value, "domereccapcanprop");
            return (Criteria) this;
        }

        public Criteria andDomereccapcanpropIn(List<BigDecimal> values) {
            addCriterion("DOMERECCAPCANPROP in", values, "domereccapcanprop");
            return (Criteria) this;
        }

        public Criteria andDomereccapcanpropNotIn(List<BigDecimal> values) {
            addCriterion("DOMERECCAPCANPROP not in", values, "domereccapcanprop");
            return (Criteria) this;
        }

        public Criteria andDomereccapcanpropBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOMERECCAPCANPROP between", value1, value2, "domereccapcanprop");
            return (Criteria) this;
        }

        public Criteria andDomereccapcanpropNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOMERECCAPCANPROP not between", value1, value2, "domereccapcanprop");
            return (Criteria) this;
        }

        public Criteria andForregcapIsNull() {
            addCriterion("FORREGCAP is null");
            return (Criteria) this;
        }

        public Criteria andForregcapIsNotNull() {
            addCriterion("FORREGCAP is not null");
            return (Criteria) this;
        }

        public Criteria andForregcapEqualTo(BigDecimal value) {
            addCriterion("FORREGCAP =", value, "forregcap");
            return (Criteria) this;
        }

        public Criteria andForregcapNotEqualTo(BigDecimal value) {
            addCriterion("FORREGCAP <>", value, "forregcap");
            return (Criteria) this;
        }

        public Criteria andForregcapGreaterThan(BigDecimal value) {
            addCriterion("FORREGCAP >", value, "forregcap");
            return (Criteria) this;
        }

        public Criteria andForregcapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORREGCAP >=", value, "forregcap");
            return (Criteria) this;
        }

        public Criteria andForregcapLessThan(BigDecimal value) {
            addCriterion("FORREGCAP <", value, "forregcap");
            return (Criteria) this;
        }

        public Criteria andForregcapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORREGCAP <=", value, "forregcap");
            return (Criteria) this;
        }

        public Criteria andForregcapIn(List<BigDecimal> values) {
            addCriterion("FORREGCAP in", values, "forregcap");
            return (Criteria) this;
        }

        public Criteria andForregcapNotIn(List<BigDecimal> values) {
            addCriterion("FORREGCAP not in", values, "forregcap");
            return (Criteria) this;
        }

        public Criteria andForregcapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORREGCAP between", value1, value2, "forregcap");
            return (Criteria) this;
        }

        public Criteria andForregcapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORREGCAP not between", value1, value2, "forregcap");
            return (Criteria) this;
        }

        public Criteria andForregcapcurIsNull() {
            addCriterion("FORREGCAPCUR is null");
            return (Criteria) this;
        }

        public Criteria andForregcapcurIsNotNull() {
            addCriterion("FORREGCAPCUR is not null");
            return (Criteria) this;
        }

        public Criteria andForregcapcurEqualTo(String value) {
            addCriterion("FORREGCAPCUR =", value, "forregcapcur");
            return (Criteria) this;
        }

        public Criteria andForregcapcurNotEqualTo(String value) {
            addCriterion("FORREGCAPCUR <>", value, "forregcapcur");
            return (Criteria) this;
        }

        public Criteria andForregcapcurGreaterThan(String value) {
            addCriterion("FORREGCAPCUR >", value, "forregcapcur");
            return (Criteria) this;
        }

        public Criteria andForregcapcurGreaterThanOrEqualTo(String value) {
            addCriterion("FORREGCAPCUR >=", value, "forregcapcur");
            return (Criteria) this;
        }

        public Criteria andForregcapcurLessThan(String value) {
            addCriterion("FORREGCAPCUR <", value, "forregcapcur");
            return (Criteria) this;
        }

        public Criteria andForregcapcurLessThanOrEqualTo(String value) {
            addCriterion("FORREGCAPCUR <=", value, "forregcapcur");
            return (Criteria) this;
        }

        public Criteria andForregcapcurLike(String value) {
            addCriterion("FORREGCAPCUR like", value, "forregcapcur");
            return (Criteria) this;
        }

        public Criteria andForregcapcurNotLike(String value) {
            addCriterion("FORREGCAPCUR not like", value, "forregcapcur");
            return (Criteria) this;
        }

        public Criteria andForregcapcurIn(List<String> values) {
            addCriterion("FORREGCAPCUR in", values, "forregcapcur");
            return (Criteria) this;
        }

        public Criteria andForregcapcurNotIn(List<String> values) {
            addCriterion("FORREGCAPCUR not in", values, "forregcapcur");
            return (Criteria) this;
        }

        public Criteria andForregcapcurBetween(String value1, String value2) {
            addCriterion("FORREGCAPCUR between", value1, value2, "forregcapcur");
            return (Criteria) this;
        }

        public Criteria andForregcapcurNotBetween(String value1, String value2) {
            addCriterion("FORREGCAPCUR not between", value1, value2, "forregcapcur");
            return (Criteria) this;
        }

        public Criteria andForregcapusdIsNull() {
            addCriterion("FORREGCAPUSD is null");
            return (Criteria) this;
        }

        public Criteria andForregcapusdIsNotNull() {
            addCriterion("FORREGCAPUSD is not null");
            return (Criteria) this;
        }

        public Criteria andForregcapusdEqualTo(BigDecimal value) {
            addCriterion("FORREGCAPUSD =", value, "forregcapusd");
            return (Criteria) this;
        }

        public Criteria andForregcapusdNotEqualTo(BigDecimal value) {
            addCriterion("FORREGCAPUSD <>", value, "forregcapusd");
            return (Criteria) this;
        }

        public Criteria andForregcapusdGreaterThan(BigDecimal value) {
            addCriterion("FORREGCAPUSD >", value, "forregcapusd");
            return (Criteria) this;
        }

        public Criteria andForregcapusdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORREGCAPUSD >=", value, "forregcapusd");
            return (Criteria) this;
        }

        public Criteria andForregcapusdLessThan(BigDecimal value) {
            addCriterion("FORREGCAPUSD <", value, "forregcapusd");
            return (Criteria) this;
        }

        public Criteria andForregcapusdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORREGCAPUSD <=", value, "forregcapusd");
            return (Criteria) this;
        }

        public Criteria andForregcapusdIn(List<BigDecimal> values) {
            addCriterion("FORREGCAPUSD in", values, "forregcapusd");
            return (Criteria) this;
        }

        public Criteria andForregcapusdNotIn(List<BigDecimal> values) {
            addCriterion("FORREGCAPUSD not in", values, "forregcapusd");
            return (Criteria) this;
        }

        public Criteria andForregcapusdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORREGCAPUSD between", value1, value2, "forregcapusd");
            return (Criteria) this;
        }

        public Criteria andForregcapusdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORREGCAPUSD not between", value1, value2, "forregcapusd");
            return (Criteria) this;
        }

        public Criteria andForregcapinvratIsNull() {
            addCriterion("FORREGCAPINVRAT is null");
            return (Criteria) this;
        }

        public Criteria andForregcapinvratIsNotNull() {
            addCriterion("FORREGCAPINVRAT is not null");
            return (Criteria) this;
        }

        public Criteria andForregcapinvratEqualTo(BigDecimal value) {
            addCriterion("FORREGCAPINVRAT =", value, "forregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andForregcapinvratNotEqualTo(BigDecimal value) {
            addCriterion("FORREGCAPINVRAT <>", value, "forregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andForregcapinvratGreaterThan(BigDecimal value) {
            addCriterion("FORREGCAPINVRAT >", value, "forregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andForregcapinvratGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORREGCAPINVRAT >=", value, "forregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andForregcapinvratLessThan(BigDecimal value) {
            addCriterion("FORREGCAPINVRAT <", value, "forregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andForregcapinvratLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORREGCAPINVRAT <=", value, "forregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andForregcapinvratIn(List<BigDecimal> values) {
            addCriterion("FORREGCAPINVRAT in", values, "forregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andForregcapinvratNotIn(List<BigDecimal> values) {
            addCriterion("FORREGCAPINVRAT not in", values, "forregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andForregcapinvratBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORREGCAPINVRAT between", value1, value2, "forregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andForregcapinvratNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORREGCAPINVRAT not between", value1, value2, "forregcapinvrat");
            return (Criteria) this;
        }

        public Criteria andForreccapIsNull() {
            addCriterion("FORRECCAP is null");
            return (Criteria) this;
        }

        public Criteria andForreccapIsNotNull() {
            addCriterion("FORRECCAP is not null");
            return (Criteria) this;
        }

        public Criteria andForreccapEqualTo(BigDecimal value) {
            addCriterion("FORRECCAP =", value, "forreccap");
            return (Criteria) this;
        }

        public Criteria andForreccapNotEqualTo(BigDecimal value) {
            addCriterion("FORRECCAP <>", value, "forreccap");
            return (Criteria) this;
        }

        public Criteria andForreccapGreaterThan(BigDecimal value) {
            addCriterion("FORRECCAP >", value, "forreccap");
            return (Criteria) this;
        }

        public Criteria andForreccapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORRECCAP >=", value, "forreccap");
            return (Criteria) this;
        }

        public Criteria andForreccapLessThan(BigDecimal value) {
            addCriterion("FORRECCAP <", value, "forreccap");
            return (Criteria) this;
        }

        public Criteria andForreccapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORRECCAP <=", value, "forreccap");
            return (Criteria) this;
        }

        public Criteria andForreccapIn(List<BigDecimal> values) {
            addCriterion("FORRECCAP in", values, "forreccap");
            return (Criteria) this;
        }

        public Criteria andForreccapNotIn(List<BigDecimal> values) {
            addCriterion("FORRECCAP not in", values, "forreccap");
            return (Criteria) this;
        }

        public Criteria andForreccapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORRECCAP between", value1, value2, "forreccap");
            return (Criteria) this;
        }

        public Criteria andForreccapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORRECCAP not between", value1, value2, "forreccap");
            return (Criteria) this;
        }

        public Criteria andForreccapcurIsNull() {
            addCriterion("FORRECCAPCUR is null");
            return (Criteria) this;
        }

        public Criteria andForreccapcurIsNotNull() {
            addCriterion("FORRECCAPCUR is not null");
            return (Criteria) this;
        }

        public Criteria andForreccapcurEqualTo(String value) {
            addCriterion("FORRECCAPCUR =", value, "forreccapcur");
            return (Criteria) this;
        }

        public Criteria andForreccapcurNotEqualTo(String value) {
            addCriterion("FORRECCAPCUR <>", value, "forreccapcur");
            return (Criteria) this;
        }

        public Criteria andForreccapcurGreaterThan(String value) {
            addCriterion("FORRECCAPCUR >", value, "forreccapcur");
            return (Criteria) this;
        }

        public Criteria andForreccapcurGreaterThanOrEqualTo(String value) {
            addCriterion("FORRECCAPCUR >=", value, "forreccapcur");
            return (Criteria) this;
        }

        public Criteria andForreccapcurLessThan(String value) {
            addCriterion("FORRECCAPCUR <", value, "forreccapcur");
            return (Criteria) this;
        }

        public Criteria andForreccapcurLessThanOrEqualTo(String value) {
            addCriterion("FORRECCAPCUR <=", value, "forreccapcur");
            return (Criteria) this;
        }

        public Criteria andForreccapcurLike(String value) {
            addCriterion("FORRECCAPCUR like", value, "forreccapcur");
            return (Criteria) this;
        }

        public Criteria andForreccapcurNotLike(String value) {
            addCriterion("FORRECCAPCUR not like", value, "forreccapcur");
            return (Criteria) this;
        }

        public Criteria andForreccapcurIn(List<String> values) {
            addCriterion("FORRECCAPCUR in", values, "forreccapcur");
            return (Criteria) this;
        }

        public Criteria andForreccapcurNotIn(List<String> values) {
            addCriterion("FORRECCAPCUR not in", values, "forreccapcur");
            return (Criteria) this;
        }

        public Criteria andForreccapcurBetween(String value1, String value2) {
            addCriterion("FORRECCAPCUR between", value1, value2, "forreccapcur");
            return (Criteria) this;
        }

        public Criteria andForreccapcurNotBetween(String value1, String value2) {
            addCriterion("FORRECCAPCUR not between", value1, value2, "forreccapcur");
            return (Criteria) this;
        }

        public Criteria andForreccapusdIsNull() {
            addCriterion("FORRECCAPUSD is null");
            return (Criteria) this;
        }

        public Criteria andForreccapusdIsNotNull() {
            addCriterion("FORRECCAPUSD is not null");
            return (Criteria) this;
        }

        public Criteria andForreccapusdEqualTo(BigDecimal value) {
            addCriterion("FORRECCAPUSD =", value, "forreccapusd");
            return (Criteria) this;
        }

        public Criteria andForreccapusdNotEqualTo(BigDecimal value) {
            addCriterion("FORRECCAPUSD <>", value, "forreccapusd");
            return (Criteria) this;
        }

        public Criteria andForreccapusdGreaterThan(BigDecimal value) {
            addCriterion("FORRECCAPUSD >", value, "forreccapusd");
            return (Criteria) this;
        }

        public Criteria andForreccapusdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORRECCAPUSD >=", value, "forreccapusd");
            return (Criteria) this;
        }

        public Criteria andForreccapusdLessThan(BigDecimal value) {
            addCriterion("FORRECCAPUSD <", value, "forreccapusd");
            return (Criteria) this;
        }

        public Criteria andForreccapusdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORRECCAPUSD <=", value, "forreccapusd");
            return (Criteria) this;
        }

        public Criteria andForreccapusdIn(List<BigDecimal> values) {
            addCriterion("FORRECCAPUSD in", values, "forreccapusd");
            return (Criteria) this;
        }

        public Criteria andForreccapusdNotIn(List<BigDecimal> values) {
            addCriterion("FORRECCAPUSD not in", values, "forreccapusd");
            return (Criteria) this;
        }

        public Criteria andForreccapusdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORRECCAPUSD between", value1, value2, "forreccapusd");
            return (Criteria) this;
        }

        public Criteria andForreccapusdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORRECCAPUSD not between", value1, value2, "forreccapusd");
            return (Criteria) this;
        }

        public Criteria andForreccapconpropIsNull() {
            addCriterion("FORRECCAPCONPROP is null");
            return (Criteria) this;
        }

        public Criteria andForreccapconpropIsNotNull() {
            addCriterion("FORRECCAPCONPROP is not null");
            return (Criteria) this;
        }

        public Criteria andForreccapconpropEqualTo(BigDecimal value) {
            addCriterion("FORRECCAPCONPROP =", value, "forreccapconprop");
            return (Criteria) this;
        }

        public Criteria andForreccapconpropNotEqualTo(BigDecimal value) {
            addCriterion("FORRECCAPCONPROP <>", value, "forreccapconprop");
            return (Criteria) this;
        }

        public Criteria andForreccapconpropGreaterThan(BigDecimal value) {
            addCriterion("FORRECCAPCONPROP >", value, "forreccapconprop");
            return (Criteria) this;
        }

        public Criteria andForreccapconpropGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORRECCAPCONPROP >=", value, "forreccapconprop");
            return (Criteria) this;
        }

        public Criteria andForreccapconpropLessThan(BigDecimal value) {
            addCriterion("FORRECCAPCONPROP <", value, "forreccapconprop");
            return (Criteria) this;
        }

        public Criteria andForreccapconpropLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORRECCAPCONPROP <=", value, "forreccapconprop");
            return (Criteria) this;
        }

        public Criteria andForreccapconpropIn(List<BigDecimal> values) {
            addCriterion("FORRECCAPCONPROP in", values, "forreccapconprop");
            return (Criteria) this;
        }

        public Criteria andForreccapconpropNotIn(List<BigDecimal> values) {
            addCriterion("FORRECCAPCONPROP not in", values, "forreccapconprop");
            return (Criteria) this;
        }

        public Criteria andForreccapconpropBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORRECCAPCONPROP between", value1, value2, "forreccapconprop");
            return (Criteria) this;
        }

        public Criteria andForreccapconpropNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORRECCAPCONPROP not between", value1, value2, "forreccapconprop");
            return (Criteria) this;
        }

        public Criteria andChamecdateIsNull() {
            addCriterion("CHAMECDATE is null");
            return (Criteria) this;
        }

        public Criteria andChamecdateIsNotNull() {
            addCriterion("CHAMECDATE is not null");
            return (Criteria) this;
        }

        public Criteria andChamecdateEqualTo(Date value) {
            addCriterion("CHAMECDATE =", value, "chamecdate");
            return (Criteria) this;
        }

        public Criteria andChamecdateNotEqualTo(Date value) {
            addCriterion("CHAMECDATE <>", value, "chamecdate");
            return (Criteria) this;
        }

        public Criteria andChamecdateGreaterThan(Date value) {
            addCriterion("CHAMECDATE >", value, "chamecdate");
            return (Criteria) this;
        }

        public Criteria andChamecdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHAMECDATE >=", value, "chamecdate");
            return (Criteria) this;
        }

        public Criteria andChamecdateLessThan(Date value) {
            addCriterion("CHAMECDATE <", value, "chamecdate");
            return (Criteria) this;
        }

        public Criteria andChamecdateLessThanOrEqualTo(Date value) {
            addCriterion("CHAMECDATE <=", value, "chamecdate");
            return (Criteria) this;
        }

        public Criteria andChamecdateIn(List<Date> values) {
            addCriterion("CHAMECDATE in", values, "chamecdate");
            return (Criteria) this;
        }

        public Criteria andChamecdateNotIn(List<Date> values) {
            addCriterion("CHAMECDATE not in", values, "chamecdate");
            return (Criteria) this;
        }

        public Criteria andChamecdateBetween(Date value1, Date value2) {
            addCriterion("CHAMECDATE between", value1, value2, "chamecdate");
            return (Criteria) this;
        }

        public Criteria andChamecdateNotBetween(Date value1, Date value2) {
            addCriterion("CHAMECDATE not between", value1, value2, "chamecdate");
            return (Criteria) this;
        }

        public Criteria andExaauthIsNull() {
            addCriterion("EXAAUTH is null");
            return (Criteria) this;
        }

        public Criteria andExaauthIsNotNull() {
            addCriterion("EXAAUTH is not null");
            return (Criteria) this;
        }

        public Criteria andExaauthEqualTo(String value) {
            addCriterion("EXAAUTH =", value, "exaauth");
            return (Criteria) this;
        }

        public Criteria andExaauthNotEqualTo(String value) {
            addCriterion("EXAAUTH <>", value, "exaauth");
            return (Criteria) this;
        }

        public Criteria andExaauthGreaterThan(String value) {
            addCriterion("EXAAUTH >", value, "exaauth");
            return (Criteria) this;
        }

        public Criteria andExaauthGreaterThanOrEqualTo(String value) {
            addCriterion("EXAAUTH >=", value, "exaauth");
            return (Criteria) this;
        }

        public Criteria andExaauthLessThan(String value) {
            addCriterion("EXAAUTH <", value, "exaauth");
            return (Criteria) this;
        }

        public Criteria andExaauthLessThanOrEqualTo(String value) {
            addCriterion("EXAAUTH <=", value, "exaauth");
            return (Criteria) this;
        }

        public Criteria andExaauthLike(String value) {
            addCriterion("EXAAUTH like", value, "exaauth");
            return (Criteria) this;
        }

        public Criteria andExaauthNotLike(String value) {
            addCriterion("EXAAUTH not like", value, "exaauth");
            return (Criteria) this;
        }

        public Criteria andExaauthIn(List<String> values) {
            addCriterion("EXAAUTH in", values, "exaauth");
            return (Criteria) this;
        }

        public Criteria andExaauthNotIn(List<String> values) {
            addCriterion("EXAAUTH not in", values, "exaauth");
            return (Criteria) this;
        }

        public Criteria andExaauthBetween(String value1, String value2) {
            addCriterion("EXAAUTH between", value1, value2, "exaauth");
            return (Criteria) this;
        }

        public Criteria andExaauthNotBetween(String value1, String value2) {
            addCriterion("EXAAUTH not between", value1, value2, "exaauth");
            return (Criteria) this;
        }

        public Criteria andSandocnoIsNull() {
            addCriterion("SANDOCNO is null");
            return (Criteria) this;
        }

        public Criteria andSandocnoIsNotNull() {
            addCriterion("SANDOCNO is not null");
            return (Criteria) this;
        }

        public Criteria andSandocnoEqualTo(String value) {
            addCriterion("SANDOCNO =", value, "sandocno");
            return (Criteria) this;
        }

        public Criteria andSandocnoNotEqualTo(String value) {
            addCriterion("SANDOCNO <>", value, "sandocno");
            return (Criteria) this;
        }

        public Criteria andSandocnoGreaterThan(String value) {
            addCriterion("SANDOCNO >", value, "sandocno");
            return (Criteria) this;
        }

        public Criteria andSandocnoGreaterThanOrEqualTo(String value) {
            addCriterion("SANDOCNO >=", value, "sandocno");
            return (Criteria) this;
        }

        public Criteria andSandocnoLessThan(String value) {
            addCriterion("SANDOCNO <", value, "sandocno");
            return (Criteria) this;
        }

        public Criteria andSandocnoLessThanOrEqualTo(String value) {
            addCriterion("SANDOCNO <=", value, "sandocno");
            return (Criteria) this;
        }

        public Criteria andSandocnoLike(String value) {
            addCriterion("SANDOCNO like", value, "sandocno");
            return (Criteria) this;
        }

        public Criteria andSandocnoNotLike(String value) {
            addCriterion("SANDOCNO not like", value, "sandocno");
            return (Criteria) this;
        }

        public Criteria andSandocnoIn(List<String> values) {
            addCriterion("SANDOCNO in", values, "sandocno");
            return (Criteria) this;
        }

        public Criteria andSandocnoNotIn(List<String> values) {
            addCriterion("SANDOCNO not in", values, "sandocno");
            return (Criteria) this;
        }

        public Criteria andSandocnoBetween(String value1, String value2) {
            addCriterion("SANDOCNO between", value1, value2, "sandocno");
            return (Criteria) this;
        }

        public Criteria andSandocnoNotBetween(String value1, String value2) {
            addCriterion("SANDOCNO not between", value1, value2, "sandocno");
            return (Criteria) this;
        }

        public Criteria andSandateIsNull() {
            addCriterion("SANDATE is null");
            return (Criteria) this;
        }

        public Criteria andSandateIsNotNull() {
            addCriterion("SANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSandateEqualTo(Date value) {
            addCriterion("SANDATE =", value, "sandate");
            return (Criteria) this;
        }

        public Criteria andSandateNotEqualTo(Date value) {
            addCriterion("SANDATE <>", value, "sandate");
            return (Criteria) this;
        }

        public Criteria andSandateGreaterThan(Date value) {
            addCriterion("SANDATE >", value, "sandate");
            return (Criteria) this;
        }

        public Criteria andSandateGreaterThanOrEqualTo(Date value) {
            addCriterion("SANDATE >=", value, "sandate");
            return (Criteria) this;
        }

        public Criteria andSandateLessThan(Date value) {
            addCriterion("SANDATE <", value, "sandate");
            return (Criteria) this;
        }

        public Criteria andSandateLessThanOrEqualTo(Date value) {
            addCriterion("SANDATE <=", value, "sandate");
            return (Criteria) this;
        }

        public Criteria andSandateIn(List<Date> values) {
            addCriterion("SANDATE in", values, "sandate");
            return (Criteria) this;
        }

        public Criteria andSandateNotIn(List<Date> values) {
            addCriterion("SANDATE not in", values, "sandate");
            return (Criteria) this;
        }

        public Criteria andSandateBetween(Date value1, Date value2) {
            addCriterion("SANDATE between", value1, value2, "sandate");
            return (Criteria) this;
        }

        public Criteria andSandateNotBetween(Date value1, Date value2) {
            addCriterion("SANDATE not between", value1, value2, "sandate");
            return (Criteria) this;
        }

        public Criteria andForentnameIsNull() {
            addCriterion("FORENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andForentnameIsNotNull() {
            addCriterion("FORENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andForentnameEqualTo(String value) {
            addCriterion("FORENTNAME =", value, "forentname");
            return (Criteria) this;
        }

        public Criteria andForentnameNotEqualTo(String value) {
            addCriterion("FORENTNAME <>", value, "forentname");
            return (Criteria) this;
        }

        public Criteria andForentnameGreaterThan(String value) {
            addCriterion("FORENTNAME >", value, "forentname");
            return (Criteria) this;
        }

        public Criteria andForentnameGreaterThanOrEqualTo(String value) {
            addCriterion("FORENTNAME >=", value, "forentname");
            return (Criteria) this;
        }

        public Criteria andForentnameLessThan(String value) {
            addCriterion("FORENTNAME <", value, "forentname");
            return (Criteria) this;
        }

        public Criteria andForentnameLessThanOrEqualTo(String value) {
            addCriterion("FORENTNAME <=", value, "forentname");
            return (Criteria) this;
        }

        public Criteria andForentnameLike(String value) {
            addCriterion("FORENTNAME like", value, "forentname");
            return (Criteria) this;
        }

        public Criteria andForentnameNotLike(String value) {
            addCriterion("FORENTNAME not like", value, "forentname");
            return (Criteria) this;
        }

        public Criteria andForentnameIn(List<String> values) {
            addCriterion("FORENTNAME in", values, "forentname");
            return (Criteria) this;
        }

        public Criteria andForentnameNotIn(List<String> values) {
            addCriterion("FORENTNAME not in", values, "forentname");
            return (Criteria) this;
        }

        public Criteria andForentnameBetween(String value1, String value2) {
            addCriterion("FORENTNAME between", value1, value2, "forentname");
            return (Criteria) this;
        }

        public Criteria andForentnameNotBetween(String value1, String value2) {
            addCriterion("FORENTNAME not between", value1, value2, "forentname");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andBoardchaIsNull() {
            addCriterion("BOARDCHA is null");
            return (Criteria) this;
        }

        public Criteria andBoardchaIsNotNull() {
            addCriterion("BOARDCHA is not null");
            return (Criteria) this;
        }

        public Criteria andBoardchaEqualTo(String value) {
            addCriterion("BOARDCHA =", value, "boardcha");
            return (Criteria) this;
        }

        public Criteria andBoardchaNotEqualTo(String value) {
            addCriterion("BOARDCHA <>", value, "boardcha");
            return (Criteria) this;
        }

        public Criteria andBoardchaGreaterThan(String value) {
            addCriterion("BOARDCHA >", value, "boardcha");
            return (Criteria) this;
        }

        public Criteria andBoardchaGreaterThanOrEqualTo(String value) {
            addCriterion("BOARDCHA >=", value, "boardcha");
            return (Criteria) this;
        }

        public Criteria andBoardchaLessThan(String value) {
            addCriterion("BOARDCHA <", value, "boardcha");
            return (Criteria) this;
        }

        public Criteria andBoardchaLessThanOrEqualTo(String value) {
            addCriterion("BOARDCHA <=", value, "boardcha");
            return (Criteria) this;
        }

        public Criteria andBoardchaLike(String value) {
            addCriterion("BOARDCHA like", value, "boardcha");
            return (Criteria) this;
        }

        public Criteria andBoardchaNotLike(String value) {
            addCriterion("BOARDCHA not like", value, "boardcha");
            return (Criteria) this;
        }

        public Criteria andBoardchaIn(List<String> values) {
            addCriterion("BOARDCHA in", values, "boardcha");
            return (Criteria) this;
        }

        public Criteria andBoardchaNotIn(List<String> values) {
            addCriterion("BOARDCHA not in", values, "boardcha");
            return (Criteria) this;
        }

        public Criteria andBoardchaBetween(String value1, String value2) {
            addCriterion("BOARDCHA between", value1, value2, "boardcha");
            return (Criteria) this;
        }

        public Criteria andBoardchaNotBetween(String value1, String value2) {
            addCriterion("BOARDCHA not between", value1, value2, "boardcha");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeIsNull() {
            addCriterion("OPEACTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeIsNotNull() {
            addCriterion("OPEACTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeEqualTo(String value) {
            addCriterion("OPEACTTYPE =", value, "opeacttype");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeNotEqualTo(String value) {
            addCriterion("OPEACTTYPE <>", value, "opeacttype");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeGreaterThan(String value) {
            addCriterion("OPEACTTYPE >", value, "opeacttype");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPEACTTYPE >=", value, "opeacttype");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeLessThan(String value) {
            addCriterion("OPEACTTYPE <", value, "opeacttype");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeLessThanOrEqualTo(String value) {
            addCriterion("OPEACTTYPE <=", value, "opeacttype");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeLike(String value) {
            addCriterion("OPEACTTYPE like", value, "opeacttype");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeNotLike(String value) {
            addCriterion("OPEACTTYPE not like", value, "opeacttype");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeIn(List<String> values) {
            addCriterion("OPEACTTYPE in", values, "opeacttype");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeNotIn(List<String> values) {
            addCriterion("OPEACTTYPE not in", values, "opeacttype");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeBetween(String value1, String value2) {
            addCriterion("OPEACTTYPE between", value1, value2, "opeacttype");
            return (Criteria) this;
        }

        public Criteria andOpeacttypeNotBetween(String value1, String value2) {
            addCriterion("OPEACTTYPE not between", value1, value2, "opeacttype");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproIsNull() {
            addCriterion("ITEMOFOPORCPRO is null");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproIsNotNull() {
            addCriterion("ITEMOFOPORCPRO is not null");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproEqualTo(String value) {
            addCriterion("ITEMOFOPORCPRO =", value, "itemofoporcpro");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproNotEqualTo(String value) {
            addCriterion("ITEMOFOPORCPRO <>", value, "itemofoporcpro");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproGreaterThan(String value) {
            addCriterion("ITEMOFOPORCPRO >", value, "itemofoporcpro");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMOFOPORCPRO >=", value, "itemofoporcpro");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproLessThan(String value) {
            addCriterion("ITEMOFOPORCPRO <", value, "itemofoporcpro");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproLessThanOrEqualTo(String value) {
            addCriterion("ITEMOFOPORCPRO <=", value, "itemofoporcpro");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproLike(String value) {
            addCriterion("ITEMOFOPORCPRO like", value, "itemofoporcpro");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproNotLike(String value) {
            addCriterion("ITEMOFOPORCPRO not like", value, "itemofoporcpro");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproIn(List<String> values) {
            addCriterion("ITEMOFOPORCPRO in", values, "itemofoporcpro");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproNotIn(List<String> values) {
            addCriterion("ITEMOFOPORCPRO not in", values, "itemofoporcpro");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproBetween(String value1, String value2) {
            addCriterion("ITEMOFOPORCPRO between", value1, value2, "itemofoporcpro");
            return (Criteria) this;
        }

        public Criteria andItemofoporcproNotBetween(String value1, String value2) {
            addCriterion("ITEMOFOPORCPRO not between", value1, value2, "itemofoporcpro");
            return (Criteria) this;
        }

        public Criteria andConofcontrproIsNull() {
            addCriterion("CONOFCONTRPRO is null");
            return (Criteria) this;
        }

        public Criteria andConofcontrproIsNotNull() {
            addCriterion("CONOFCONTRPRO is not null");
            return (Criteria) this;
        }

        public Criteria andConofcontrproEqualTo(String value) {
            addCriterion("CONOFCONTRPRO =", value, "conofcontrpro");
            return (Criteria) this;
        }

        public Criteria andConofcontrproNotEqualTo(String value) {
            addCriterion("CONOFCONTRPRO <>", value, "conofcontrpro");
            return (Criteria) this;
        }

        public Criteria andConofcontrproGreaterThan(String value) {
            addCriterion("CONOFCONTRPRO >", value, "conofcontrpro");
            return (Criteria) this;
        }

        public Criteria andConofcontrproGreaterThanOrEqualTo(String value) {
            addCriterion("CONOFCONTRPRO >=", value, "conofcontrpro");
            return (Criteria) this;
        }

        public Criteria andConofcontrproLessThan(String value) {
            addCriterion("CONOFCONTRPRO <", value, "conofcontrpro");
            return (Criteria) this;
        }

        public Criteria andConofcontrproLessThanOrEqualTo(String value) {
            addCriterion("CONOFCONTRPRO <=", value, "conofcontrpro");
            return (Criteria) this;
        }

        public Criteria andConofcontrproLike(String value) {
            addCriterion("CONOFCONTRPRO like", value, "conofcontrpro");
            return (Criteria) this;
        }

        public Criteria andConofcontrproNotLike(String value) {
            addCriterion("CONOFCONTRPRO not like", value, "conofcontrpro");
            return (Criteria) this;
        }

        public Criteria andConofcontrproIn(List<String> values) {
            addCriterion("CONOFCONTRPRO in", values, "conofcontrpro");
            return (Criteria) this;
        }

        public Criteria andConofcontrproNotIn(List<String> values) {
            addCriterion("CONOFCONTRPRO not in", values, "conofcontrpro");
            return (Criteria) this;
        }

        public Criteria andConofcontrproBetween(String value1, String value2) {
            addCriterion("CONOFCONTRPRO between", value1, value2, "conofcontrpro");
            return (Criteria) this;
        }

        public Criteria andConofcontrproNotBetween(String value1, String value2) {
            addCriterion("CONOFCONTRPRO not between", value1, value2, "conofcontrpro");
            return (Criteria) this;
        }

        public Criteria andFordomIsNull() {
            addCriterion("FORDOM is null");
            return (Criteria) this;
        }

        public Criteria andFordomIsNotNull() {
            addCriterion("FORDOM is not null");
            return (Criteria) this;
        }

        public Criteria andFordomEqualTo(String value) {
            addCriterion("FORDOM =", value, "fordom");
            return (Criteria) this;
        }

        public Criteria andFordomNotEqualTo(String value) {
            addCriterion("FORDOM <>", value, "fordom");
            return (Criteria) this;
        }

        public Criteria andFordomGreaterThan(String value) {
            addCriterion("FORDOM >", value, "fordom");
            return (Criteria) this;
        }

        public Criteria andFordomGreaterThanOrEqualTo(String value) {
            addCriterion("FORDOM >=", value, "fordom");
            return (Criteria) this;
        }

        public Criteria andFordomLessThan(String value) {
            addCriterion("FORDOM <", value, "fordom");
            return (Criteria) this;
        }

        public Criteria andFordomLessThanOrEqualTo(String value) {
            addCriterion("FORDOM <=", value, "fordom");
            return (Criteria) this;
        }

        public Criteria andFordomLike(String value) {
            addCriterion("FORDOM like", value, "fordom");
            return (Criteria) this;
        }

        public Criteria andFordomNotLike(String value) {
            addCriterion("FORDOM not like", value, "fordom");
            return (Criteria) this;
        }

        public Criteria andFordomIn(List<String> values) {
            addCriterion("FORDOM in", values, "fordom");
            return (Criteria) this;
        }

        public Criteria andFordomNotIn(List<String> values) {
            addCriterion("FORDOM not in", values, "fordom");
            return (Criteria) this;
        }

        public Criteria andFordomBetween(String value1, String value2) {
            addCriterion("FORDOM between", value1, value2, "fordom");
            return (Criteria) this;
        }

        public Criteria andFordomNotBetween(String value1, String value2) {
            addCriterion("FORDOM not between", value1, value2, "fordom");
            return (Criteria) this;
        }

        public Criteria andForregecapIsNull() {
            addCriterion("FORREGECAP is null");
            return (Criteria) this;
        }

        public Criteria andForregecapIsNotNull() {
            addCriterion("FORREGECAP is not null");
            return (Criteria) this;
        }

        public Criteria andForregecapEqualTo(BigDecimal value) {
            addCriterion("FORREGECAP =", value, "forregecap");
            return (Criteria) this;
        }

        public Criteria andForregecapNotEqualTo(BigDecimal value) {
            addCriterion("FORREGECAP <>", value, "forregecap");
            return (Criteria) this;
        }

        public Criteria andForregecapGreaterThan(BigDecimal value) {
            addCriterion("FORREGECAP >", value, "forregecap");
            return (Criteria) this;
        }

        public Criteria andForregecapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORREGECAP >=", value, "forregecap");
            return (Criteria) this;
        }

        public Criteria andForregecapLessThan(BigDecimal value) {
            addCriterion("FORREGECAP <", value, "forregecap");
            return (Criteria) this;
        }

        public Criteria andForregecapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORREGECAP <=", value, "forregecap");
            return (Criteria) this;
        }

        public Criteria andForregecapIn(List<BigDecimal> values) {
            addCriterion("FORREGECAP in", values, "forregecap");
            return (Criteria) this;
        }

        public Criteria andForregecapNotIn(List<BigDecimal> values) {
            addCriterion("FORREGECAP not in", values, "forregecap");
            return (Criteria) this;
        }

        public Criteria andForregecapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORREGECAP between", value1, value2, "forregecap");
            return (Criteria) this;
        }

        public Criteria andForregecapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORREGECAP not between", value1, value2, "forregecap");
            return (Criteria) this;
        }

        public Criteria andForbusscopeIsNull() {
            addCriterion("FORBUSSCOPE is null");
            return (Criteria) this;
        }

        public Criteria andForbusscopeIsNotNull() {
            addCriterion("FORBUSSCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andForbusscopeEqualTo(String value) {
            addCriterion("FORBUSSCOPE =", value, "forbusscope");
            return (Criteria) this;
        }

        public Criteria andForbusscopeNotEqualTo(String value) {
            addCriterion("FORBUSSCOPE <>", value, "forbusscope");
            return (Criteria) this;
        }

        public Criteria andForbusscopeGreaterThan(String value) {
            addCriterion("FORBUSSCOPE >", value, "forbusscope");
            return (Criteria) this;
        }

        public Criteria andForbusscopeGreaterThanOrEqualTo(String value) {
            addCriterion("FORBUSSCOPE >=", value, "forbusscope");
            return (Criteria) this;
        }

        public Criteria andForbusscopeLessThan(String value) {
            addCriterion("FORBUSSCOPE <", value, "forbusscope");
            return (Criteria) this;
        }

        public Criteria andForbusscopeLessThanOrEqualTo(String value) {
            addCriterion("FORBUSSCOPE <=", value, "forbusscope");
            return (Criteria) this;
        }

        public Criteria andForbusscopeLike(String value) {
            addCriterion("FORBUSSCOPE like", value, "forbusscope");
            return (Criteria) this;
        }

        public Criteria andForbusscopeNotLike(String value) {
            addCriterion("FORBUSSCOPE not like", value, "forbusscope");
            return (Criteria) this;
        }

        public Criteria andForbusscopeIn(List<String> values) {
            addCriterion("FORBUSSCOPE in", values, "forbusscope");
            return (Criteria) this;
        }

        public Criteria andForbusscopeNotIn(List<String> values) {
            addCriterion("FORBUSSCOPE not in", values, "forbusscope");
            return (Criteria) this;
        }

        public Criteria andForbusscopeBetween(String value1, String value2) {
            addCriterion("FORBUSSCOPE between", value1, value2, "forbusscope");
            return (Criteria) this;
        }

        public Criteria andForbusscopeNotBetween(String value1, String value2) {
            addCriterion("FORBUSSCOPE not between", value1, value2, "forbusscope");
            return (Criteria) this;
        }

        public Criteria andLerepIsNull() {
            addCriterion("LEREP is null");
            return (Criteria) this;
        }

        public Criteria andLerepIsNotNull() {
            addCriterion("LEREP is not null");
            return (Criteria) this;
        }

        public Criteria andLerepEqualTo(String value) {
            addCriterion("LEREP =", value, "lerep");
            return (Criteria) this;
        }

        public Criteria andLerepNotEqualTo(String value) {
            addCriterion("LEREP <>", value, "lerep");
            return (Criteria) this;
        }

        public Criteria andLerepGreaterThan(String value) {
            addCriterion("LEREP >", value, "lerep");
            return (Criteria) this;
        }

        public Criteria andLerepGreaterThanOrEqualTo(String value) {
            addCriterion("LEREP >=", value, "lerep");
            return (Criteria) this;
        }

        public Criteria andLerepLessThan(String value) {
            addCriterion("LEREP <", value, "lerep");
            return (Criteria) this;
        }

        public Criteria andLerepLessThanOrEqualTo(String value) {
            addCriterion("LEREP <=", value, "lerep");
            return (Criteria) this;
        }

        public Criteria andLerepLike(String value) {
            addCriterion("LEREP like", value, "lerep");
            return (Criteria) this;
        }

        public Criteria andLerepNotLike(String value) {
            addCriterion("LEREP not like", value, "lerep");
            return (Criteria) this;
        }

        public Criteria andLerepIn(List<String> values) {
            addCriterion("LEREP in", values, "lerep");
            return (Criteria) this;
        }

        public Criteria andLerepNotIn(List<String> values) {
            addCriterion("LEREP not in", values, "lerep");
            return (Criteria) this;
        }

        public Criteria andLerepBetween(String value1, String value2) {
            addCriterion("LEREP between", value1, value2, "lerep");
            return (Criteria) this;
        }

        public Criteria andLerepNotBetween(String value1, String value2) {
            addCriterion("LEREP not between", value1, value2, "lerep");
            return (Criteria) this;
        }

        public Criteria andBaldelperIsNull() {
            addCriterion("BALDELPER is null");
            return (Criteria) this;
        }

        public Criteria andBaldelperIsNotNull() {
            addCriterion("BALDELPER is not null");
            return (Criteria) this;
        }

        public Criteria andBaldelperEqualTo(Date value) {
            addCriterion("BALDELPER =", value, "baldelper");
            return (Criteria) this;
        }

        public Criteria andBaldelperNotEqualTo(Date value) {
            addCriterion("BALDELPER <>", value, "baldelper");
            return (Criteria) this;
        }

        public Criteria andBaldelperGreaterThan(Date value) {
            addCriterion("BALDELPER >", value, "baldelper");
            return (Criteria) this;
        }

        public Criteria andBaldelperGreaterThanOrEqualTo(Date value) {
            addCriterion("BALDELPER >=", value, "baldelper");
            return (Criteria) this;
        }

        public Criteria andBaldelperLessThan(Date value) {
            addCriterion("BALDELPER <", value, "baldelper");
            return (Criteria) this;
        }

        public Criteria andBaldelperLessThanOrEqualTo(Date value) {
            addCriterion("BALDELPER <=", value, "baldelper");
            return (Criteria) this;
        }

        public Criteria andBaldelperIn(List<Date> values) {
            addCriterion("BALDELPER in", values, "baldelper");
            return (Criteria) this;
        }

        public Criteria andBaldelperNotIn(List<Date> values) {
            addCriterion("BALDELPER not in", values, "baldelper");
            return (Criteria) this;
        }

        public Criteria andBaldelperBetween(Date value1, Date value2) {
            addCriterion("BALDELPER between", value1, value2, "baldelper");
            return (Criteria) this;
        }

        public Criteria andBaldelperNotBetween(Date value1, Date value2) {
            addCriterion("BALDELPER not between", value1, value2, "baldelper");
            return (Criteria) this;
        }

        public Criteria andCurconamIsNull() {
            addCriterion("CURCONAM is null");
            return (Criteria) this;
        }

        public Criteria andCurconamIsNotNull() {
            addCriterion("CURCONAM is not null");
            return (Criteria) this;
        }

        public Criteria andCurconamEqualTo(BigDecimal value) {
            addCriterion("CURCONAM =", value, "curconam");
            return (Criteria) this;
        }

        public Criteria andCurconamNotEqualTo(BigDecimal value) {
            addCriterion("CURCONAM <>", value, "curconam");
            return (Criteria) this;
        }

        public Criteria andCurconamGreaterThan(BigDecimal value) {
            addCriterion("CURCONAM >", value, "curconam");
            return (Criteria) this;
        }

        public Criteria andCurconamGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURCONAM >=", value, "curconam");
            return (Criteria) this;
        }

        public Criteria andCurconamLessThan(BigDecimal value) {
            addCriterion("CURCONAM <", value, "curconam");
            return (Criteria) this;
        }

        public Criteria andCurconamLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURCONAM <=", value, "curconam");
            return (Criteria) this;
        }

        public Criteria andCurconamIn(List<BigDecimal> values) {
            addCriterion("CURCONAM in", values, "curconam");
            return (Criteria) this;
        }

        public Criteria andCurconamNotIn(List<BigDecimal> values) {
            addCriterion("CURCONAM not in", values, "curconam");
            return (Criteria) this;
        }

        public Criteria andCurconamBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURCONAM between", value1, value2, "curconam");
            return (Criteria) this;
        }

        public Criteria andCurconamNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURCONAM not between", value1, value2, "curconam");
            return (Criteria) this;
        }

        public Criteria andHighindustryIsNull() {
            addCriterion("HIGHINDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andHighindustryIsNotNull() {
            addCriterion("HIGHINDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andHighindustryEqualTo(String value) {
            addCriterion("HIGHINDUSTRY =", value, "highindustry");
            return (Criteria) this;
        }

        public Criteria andHighindustryNotEqualTo(String value) {
            addCriterion("HIGHINDUSTRY <>", value, "highindustry");
            return (Criteria) this;
        }

        public Criteria andHighindustryGreaterThan(String value) {
            addCriterion("HIGHINDUSTRY >", value, "highindustry");
            return (Criteria) this;
        }

        public Criteria andHighindustryGreaterThanOrEqualTo(String value) {
            addCriterion("HIGHINDUSTRY >=", value, "highindustry");
            return (Criteria) this;
        }

        public Criteria andHighindustryLessThan(String value) {
            addCriterion("HIGHINDUSTRY <", value, "highindustry");
            return (Criteria) this;
        }

        public Criteria andHighindustryLessThanOrEqualTo(String value) {
            addCriterion("HIGHINDUSTRY <=", value, "highindustry");
            return (Criteria) this;
        }

        public Criteria andHighindustryLike(String value) {
            addCriterion("HIGHINDUSTRY like", value, "highindustry");
            return (Criteria) this;
        }

        public Criteria andHighindustryNotLike(String value) {
            addCriterion("HIGHINDUSTRY not like", value, "highindustry");
            return (Criteria) this;
        }

        public Criteria andHighindustryIn(List<String> values) {
            addCriterion("HIGHINDUSTRY in", values, "highindustry");
            return (Criteria) this;
        }

        public Criteria andHighindustryNotIn(List<String> values) {
            addCriterion("HIGHINDUSTRY not in", values, "highindustry");
            return (Criteria) this;
        }

        public Criteria andHighindustryBetween(String value1, String value2) {
            addCriterion("HIGHINDUSTRY between", value1, value2, "highindustry");
            return (Criteria) this;
        }

        public Criteria andHighindustryNotBetween(String value1, String value2) {
            addCriterion("HIGHINDUSTRY not between", value1, value2, "highindustry");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeIsNull() {
            addCriterion("BUSADDSCOPE is null");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeIsNotNull() {
            addCriterion("BUSADDSCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeEqualTo(String value) {
            addCriterion("BUSADDSCOPE =", value, "busaddscope");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeNotEqualTo(String value) {
            addCriterion("BUSADDSCOPE <>", value, "busaddscope");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeGreaterThan(String value) {
            addCriterion("BUSADDSCOPE >", value, "busaddscope");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSADDSCOPE >=", value, "busaddscope");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeLessThan(String value) {
            addCriterion("BUSADDSCOPE <", value, "busaddscope");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeLessThanOrEqualTo(String value) {
            addCriterion("BUSADDSCOPE <=", value, "busaddscope");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeLike(String value) {
            addCriterion("BUSADDSCOPE like", value, "busaddscope");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeNotLike(String value) {
            addCriterion("BUSADDSCOPE not like", value, "busaddscope");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeIn(List<String> values) {
            addCriterion("BUSADDSCOPE in", values, "busaddscope");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeNotIn(List<String> values) {
            addCriterion("BUSADDSCOPE not in", values, "busaddscope");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeBetween(String value1, String value2) {
            addCriterion("BUSADDSCOPE between", value1, value2, "busaddscope");
            return (Criteria) this;
        }

        public Criteria andBusaddscopeNotBetween(String value1, String value2) {
            addCriterion("BUSADDSCOPE not between", value1, value2, "busaddscope");
            return (Criteria) this;
        }

        public Criteria andCredlevelIsNull() {
            addCriterion("CREDLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCredlevelIsNotNull() {
            addCriterion("CREDLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCredlevelEqualTo(String value) {
            addCriterion("CREDLEVEL =", value, "credlevel");
            return (Criteria) this;
        }

        public Criteria andCredlevelNotEqualTo(String value) {
            addCriterion("CREDLEVEL <>", value, "credlevel");
            return (Criteria) this;
        }

        public Criteria andCredlevelGreaterThan(String value) {
            addCriterion("CREDLEVEL >", value, "credlevel");
            return (Criteria) this;
        }

        public Criteria andCredlevelGreaterThanOrEqualTo(String value) {
            addCriterion("CREDLEVEL >=", value, "credlevel");
            return (Criteria) this;
        }

        public Criteria andCredlevelLessThan(String value) {
            addCriterion("CREDLEVEL <", value, "credlevel");
            return (Criteria) this;
        }

        public Criteria andCredlevelLessThanOrEqualTo(String value) {
            addCriterion("CREDLEVEL <=", value, "credlevel");
            return (Criteria) this;
        }

        public Criteria andCredlevelLike(String value) {
            addCriterion("CREDLEVEL like", value, "credlevel");
            return (Criteria) this;
        }

        public Criteria andCredlevelNotLike(String value) {
            addCriterion("CREDLEVEL not like", value, "credlevel");
            return (Criteria) this;
        }

        public Criteria andCredlevelIn(List<String> values) {
            addCriterion("CREDLEVEL in", values, "credlevel");
            return (Criteria) this;
        }

        public Criteria andCredlevelNotIn(List<String> values) {
            addCriterion("CREDLEVEL not in", values, "credlevel");
            return (Criteria) this;
        }

        public Criteria andCredlevelBetween(String value1, String value2) {
            addCriterion("CREDLEVEL between", value1, value2, "credlevel");
            return (Criteria) this;
        }

        public Criteria andCredlevelNotBetween(String value1, String value2) {
            addCriterion("CREDLEVEL not between", value1, value2, "credlevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelIsNull() {
            addCriterion("SAFELEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSafelevelIsNotNull() {
            addCriterion("SAFELEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSafelevelEqualTo(String value) {
            addCriterion("SAFELEVEL =", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelNotEqualTo(String value) {
            addCriterion("SAFELEVEL <>", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelGreaterThan(String value) {
            addCriterion("SAFELEVEL >", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelGreaterThanOrEqualTo(String value) {
            addCriterion("SAFELEVEL >=", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelLessThan(String value) {
            addCriterion("SAFELEVEL <", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelLessThanOrEqualTo(String value) {
            addCriterion("SAFELEVEL <=", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelLike(String value) {
            addCriterion("SAFELEVEL like", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelNotLike(String value) {
            addCriterion("SAFELEVEL not like", value, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelIn(List<String> values) {
            addCriterion("SAFELEVEL in", values, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelNotIn(List<String> values) {
            addCriterion("SAFELEVEL not in", values, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelBetween(String value1, String value2) {
            addCriterion("SAFELEVEL between", value1, value2, "safelevel");
            return (Criteria) this;
        }

        public Criteria andSafelevelNotBetween(String value1, String value2) {
            addCriterion("SAFELEVEL not between", value1, value2, "safelevel");
            return (Criteria) this;
        }

        public Criteria andBorsignIsNull() {
            addCriterion("BORSIGN is null");
            return (Criteria) this;
        }

        public Criteria andBorsignIsNotNull() {
            addCriterion("BORSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andBorsignEqualTo(BigDecimal value) {
            addCriterion("BORSIGN =", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignNotEqualTo(BigDecimal value) {
            addCriterion("BORSIGN <>", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignGreaterThan(BigDecimal value) {
            addCriterion("BORSIGN >", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BORSIGN >=", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignLessThan(BigDecimal value) {
            addCriterion("BORSIGN <", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BORSIGN <=", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignIn(List<BigDecimal> values) {
            addCriterion("BORSIGN in", values, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignNotIn(List<BigDecimal> values) {
            addCriterion("BORSIGN not in", values, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BORSIGN between", value1, value2, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BORSIGN not between", value1, value2, "borsign");
            return (Criteria) this;
        }

        public Criteria andMarsignIsNull() {
            addCriterion("MARSIGN is null");
            return (Criteria) this;
        }

        public Criteria andMarsignIsNotNull() {
            addCriterion("MARSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andMarsignEqualTo(BigDecimal value) {
            addCriterion("MARSIGN =", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignNotEqualTo(BigDecimal value) {
            addCriterion("MARSIGN <>", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignGreaterThan(BigDecimal value) {
            addCriterion("MARSIGN >", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MARSIGN >=", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignLessThan(BigDecimal value) {
            addCriterion("MARSIGN <", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MARSIGN <=", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignIn(List<BigDecimal> values) {
            addCriterion("MARSIGN in", values, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignNotIn(List<BigDecimal> values) {
            addCriterion("MARSIGN not in", values, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARSIGN between", value1, value2, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARSIGN not between", value1, value2, "marsign");
            return (Criteria) this;
        }

        public Criteria andEntstatusIsNull() {
            addCriterion("ENTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andEntstatusIsNotNull() {
            addCriterion("ENTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEntstatusEqualTo(BigDecimal value) {
            addCriterion("ENTSTATUS =", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusNotEqualTo(BigDecimal value) {
            addCriterion("ENTSTATUS <>", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusGreaterThan(BigDecimal value) {
            addCriterion("ENTSTATUS >", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ENTSTATUS >=", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusLessThan(BigDecimal value) {
            addCriterion("ENTSTATUS <", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ENTSTATUS <=", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusIn(List<BigDecimal> values) {
            addCriterion("ENTSTATUS in", values, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusNotIn(List<BigDecimal> values) {
            addCriterion("ENTSTATUS not in", values, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENTSTATUS between", value1, value2, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENTSTATUS not between", value1, value2, "entstatus");
            return (Criteria) this;
        }

        public Criteria andApprdateIsNull() {
            addCriterion("APPRDATE is null");
            return (Criteria) this;
        }

        public Criteria andApprdateIsNotNull() {
            addCriterion("APPRDATE is not null");
            return (Criteria) this;
        }

        public Criteria andApprdateEqualTo(Date value) {
            addCriterion("APPRDATE =", value, "apprdate");
            return (Criteria) this;
        }

        public Criteria andApprdateNotEqualTo(Date value) {
            addCriterion("APPRDATE <>", value, "apprdate");
            return (Criteria) this;
        }

        public Criteria andApprdateGreaterThan(Date value) {
            addCriterion("APPRDATE >", value, "apprdate");
            return (Criteria) this;
        }

        public Criteria andApprdateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPRDATE >=", value, "apprdate");
            return (Criteria) this;
        }

        public Criteria andApprdateLessThan(Date value) {
            addCriterion("APPRDATE <", value, "apprdate");
            return (Criteria) this;
        }

        public Criteria andApprdateLessThanOrEqualTo(Date value) {
            addCriterion("APPRDATE <=", value, "apprdate");
            return (Criteria) this;
        }

        public Criteria andApprdateIn(List<Date> values) {
            addCriterion("APPRDATE in", values, "apprdate");
            return (Criteria) this;
        }

        public Criteria andApprdateNotIn(List<Date> values) {
            addCriterion("APPRDATE not in", values, "apprdate");
            return (Criteria) this;
        }

        public Criteria andApprdateBetween(Date value1, Date value2) {
            addCriterion("APPRDATE between", value1, value2, "apprdate");
            return (Criteria) this;
        }

        public Criteria andApprdateNotBetween(Date value1, Date value2) {
            addCriterion("APPRDATE not between", value1, value2, "apprdate");
            return (Criteria) this;
        }

        public Criteria andConumIsNull() {
            addCriterion("CONUM is null");
            return (Criteria) this;
        }

        public Criteria andConumIsNotNull() {
            addCriterion("CONUM is not null");
            return (Criteria) this;
        }

        public Criteria andConumEqualTo(String value) {
            addCriterion("CONUM =", value, "conum");
            return (Criteria) this;
        }

        public Criteria andConumNotEqualTo(String value) {
            addCriterion("CONUM <>", value, "conum");
            return (Criteria) this;
        }

        public Criteria andConumGreaterThan(String value) {
            addCriterion("CONUM >", value, "conum");
            return (Criteria) this;
        }

        public Criteria andConumGreaterThanOrEqualTo(String value) {
            addCriterion("CONUM >=", value, "conum");
            return (Criteria) this;
        }

        public Criteria andConumLessThan(String value) {
            addCriterion("CONUM <", value, "conum");
            return (Criteria) this;
        }

        public Criteria andConumLessThanOrEqualTo(String value) {
            addCriterion("CONUM <=", value, "conum");
            return (Criteria) this;
        }

        public Criteria andConumLike(String value) {
            addCriterion("CONUM like", value, "conum");
            return (Criteria) this;
        }

        public Criteria andConumNotLike(String value) {
            addCriterion("CONUM not like", value, "conum");
            return (Criteria) this;
        }

        public Criteria andConumIn(List<String> values) {
            addCriterion("CONUM in", values, "conum");
            return (Criteria) this;
        }

        public Criteria andConumNotIn(List<String> values) {
            addCriterion("CONUM not in", values, "conum");
            return (Criteria) this;
        }

        public Criteria andConumBetween(String value1, String value2) {
            addCriterion("CONUM between", value1, value2, "conum");
            return (Criteria) this;
        }

        public Criteria andConumNotBetween(String value1, String value2) {
            addCriterion("CONUM not between", value1, value2, "conum");
            return (Criteria) this;
        }

        public Criteria andApprnoIsNull() {
            addCriterion("APPRNO is null");
            return (Criteria) this;
        }

        public Criteria andApprnoIsNotNull() {
            addCriterion("APPRNO is not null");
            return (Criteria) this;
        }

        public Criteria andApprnoEqualTo(String value) {
            addCriterion("APPRNO =", value, "apprno");
            return (Criteria) this;
        }

        public Criteria andApprnoNotEqualTo(String value) {
            addCriterion("APPRNO <>", value, "apprno");
            return (Criteria) this;
        }

        public Criteria andApprnoGreaterThan(String value) {
            addCriterion("APPRNO >", value, "apprno");
            return (Criteria) this;
        }

        public Criteria andApprnoGreaterThanOrEqualTo(String value) {
            addCriterion("APPRNO >=", value, "apprno");
            return (Criteria) this;
        }

        public Criteria andApprnoLessThan(String value) {
            addCriterion("APPRNO <", value, "apprno");
            return (Criteria) this;
        }

        public Criteria andApprnoLessThanOrEqualTo(String value) {
            addCriterion("APPRNO <=", value, "apprno");
            return (Criteria) this;
        }

        public Criteria andApprnoLike(String value) {
            addCriterion("APPRNO like", value, "apprno");
            return (Criteria) this;
        }

        public Criteria andApprnoNotLike(String value) {
            addCriterion("APPRNO not like", value, "apprno");
            return (Criteria) this;
        }

        public Criteria andApprnoIn(List<String> values) {
            addCriterion("APPRNO in", values, "apprno");
            return (Criteria) this;
        }

        public Criteria andApprnoNotIn(List<String> values) {
            addCriterion("APPRNO not in", values, "apprno");
            return (Criteria) this;
        }

        public Criteria andApprnoBetween(String value1, String value2) {
            addCriterion("APPRNO between", value1, value2, "apprno");
            return (Criteria) this;
        }

        public Criteria andApprnoNotBetween(String value1, String value2) {
            addCriterion("APPRNO not between", value1, value2, "apprno");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeIsNull() {
            addCriterion("OPLOCPOSTALCODE is null");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeIsNotNull() {
            addCriterion("OPLOCPOSTALCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeEqualTo(String value) {
            addCriterion("OPLOCPOSTALCODE =", value, "oplocpostalcode");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeNotEqualTo(String value) {
            addCriterion("OPLOCPOSTALCODE <>", value, "oplocpostalcode");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeGreaterThan(String value) {
            addCriterion("OPLOCPOSTALCODE >", value, "oplocpostalcode");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPLOCPOSTALCODE >=", value, "oplocpostalcode");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeLessThan(String value) {
            addCriterion("OPLOCPOSTALCODE <", value, "oplocpostalcode");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeLessThanOrEqualTo(String value) {
            addCriterion("OPLOCPOSTALCODE <=", value, "oplocpostalcode");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeLike(String value) {
            addCriterion("OPLOCPOSTALCODE like", value, "oplocpostalcode");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeNotLike(String value) {
            addCriterion("OPLOCPOSTALCODE not like", value, "oplocpostalcode");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeIn(List<String> values) {
            addCriterion("OPLOCPOSTALCODE in", values, "oplocpostalcode");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeNotIn(List<String> values) {
            addCriterion("OPLOCPOSTALCODE not in", values, "oplocpostalcode");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeBetween(String value1, String value2) {
            addCriterion("OPLOCPOSTALCODE between", value1, value2, "oplocpostalcode");
            return (Criteria) this;
        }

        public Criteria andOplocpostalcodeNotBetween(String value1, String value2) {
            addCriterion("OPLOCPOSTALCODE not between", value1, value2, "oplocpostalcode");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andWorcapIsNull() {
            addCriterion("WORCAP is null");
            return (Criteria) this;
        }

        public Criteria andWorcapIsNotNull() {
            addCriterion("WORCAP is not null");
            return (Criteria) this;
        }

        public Criteria andWorcapEqualTo(BigDecimal value) {
            addCriterion("WORCAP =", value, "worcap");
            return (Criteria) this;
        }

        public Criteria andWorcapNotEqualTo(BigDecimal value) {
            addCriterion("WORCAP <>", value, "worcap");
            return (Criteria) this;
        }

        public Criteria andWorcapGreaterThan(BigDecimal value) {
            addCriterion("WORCAP >", value, "worcap");
            return (Criteria) this;
        }

        public Criteria andWorcapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORCAP >=", value, "worcap");
            return (Criteria) this;
        }

        public Criteria andWorcapLessThan(BigDecimal value) {
            addCriterion("WORCAP <", value, "worcap");
            return (Criteria) this;
        }

        public Criteria andWorcapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORCAP <=", value, "worcap");
            return (Criteria) this;
        }

        public Criteria andWorcapIn(List<BigDecimal> values) {
            addCriterion("WORCAP in", values, "worcap");
            return (Criteria) this;
        }

        public Criteria andWorcapNotIn(List<BigDecimal> values) {
            addCriterion("WORCAP not in", values, "worcap");
            return (Criteria) this;
        }

        public Criteria andWorcapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORCAP between", value1, value2, "worcap");
            return (Criteria) this;
        }

        public Criteria andWorcapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORCAP not between", value1, value2, "worcap");
            return (Criteria) this;
        }

        public Criteria andContinentIsNull() {
            addCriterion("CONTINENT is null");
            return (Criteria) this;
        }

        public Criteria andContinentIsNotNull() {
            addCriterion("CONTINENT is not null");
            return (Criteria) this;
        }

        public Criteria andContinentEqualTo(String value) {
            addCriterion("CONTINENT =", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentNotEqualTo(String value) {
            addCriterion("CONTINENT <>", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentGreaterThan(String value) {
            addCriterion("CONTINENT >", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTINENT >=", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentLessThan(String value) {
            addCriterion("CONTINENT <", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentLessThanOrEqualTo(String value) {
            addCriterion("CONTINENT <=", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentLike(String value) {
            addCriterion("CONTINENT like", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentNotLike(String value) {
            addCriterion("CONTINENT not like", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentIn(List<String> values) {
            addCriterion("CONTINENT in", values, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentNotIn(List<String> values) {
            addCriterion("CONTINENT not in", values, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentBetween(String value1, String value2) {
            addCriterion("CONTINENT between", value1, value2, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentNotBetween(String value1, String value2) {
            addCriterion("CONTINENT not between", value1, value2, "continent");
            return (Criteria) this;
        }

        public Criteria andCitysignIsNull() {
            addCriterion("CITYSIGN is null");
            return (Criteria) this;
        }

        public Criteria andCitysignIsNotNull() {
            addCriterion("CITYSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andCitysignEqualTo(BigDecimal value) {
            addCriterion("CITYSIGN =", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignNotEqualTo(BigDecimal value) {
            addCriterion("CITYSIGN <>", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignGreaterThan(BigDecimal value) {
            addCriterion("CITYSIGN >", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CITYSIGN >=", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignLessThan(BigDecimal value) {
            addCriterion("CITYSIGN <", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CITYSIGN <=", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignIn(List<BigDecimal> values) {
            addCriterion("CITYSIGN in", values, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignNotIn(List<BigDecimal> values) {
            addCriterion("CITYSIGN not in", values, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CITYSIGN between", value1, value2, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CITYSIGN not between", value1, value2, "citysign");
            return (Criteria) this;
        }

        public Criteria andIfforhelpIsNull() {
            addCriterion("IFFORHELP is null");
            return (Criteria) this;
        }

        public Criteria andIfforhelpIsNotNull() {
            addCriterion("IFFORHELP is not null");
            return (Criteria) this;
        }

        public Criteria andIfforhelpEqualTo(BigDecimal value) {
            addCriterion("IFFORHELP =", value, "ifforhelp");
            return (Criteria) this;
        }

        public Criteria andIfforhelpNotEqualTo(BigDecimal value) {
            addCriterion("IFFORHELP <>", value, "ifforhelp");
            return (Criteria) this;
        }

        public Criteria andIfforhelpGreaterThan(BigDecimal value) {
            addCriterion("IFFORHELP >", value, "ifforhelp");
            return (Criteria) this;
        }

        public Criteria andIfforhelpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IFFORHELP >=", value, "ifforhelp");
            return (Criteria) this;
        }

        public Criteria andIfforhelpLessThan(BigDecimal value) {
            addCriterion("IFFORHELP <", value, "ifforhelp");
            return (Criteria) this;
        }

        public Criteria andIfforhelpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IFFORHELP <=", value, "ifforhelp");
            return (Criteria) this;
        }

        public Criteria andIfforhelpIn(List<BigDecimal> values) {
            addCriterion("IFFORHELP in", values, "ifforhelp");
            return (Criteria) this;
        }

        public Criteria andIfforhelpNotIn(List<BigDecimal> values) {
            addCriterion("IFFORHELP not in", values, "ifforhelp");
            return (Criteria) this;
        }

        public Criteria andIfforhelpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IFFORHELP between", value1, value2, "ifforhelp");
            return (Criteria) this;
        }

        public Criteria andIfforhelpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IFFORHELP not between", value1, value2, "ifforhelp");
            return (Criteria) this;
        }

        public Criteria andInvnumIsNull() {
            addCriterion("INVNUM is null");
            return (Criteria) this;
        }

        public Criteria andInvnumIsNotNull() {
            addCriterion("INVNUM is not null");
            return (Criteria) this;
        }

        public Criteria andInvnumEqualTo(BigDecimal value) {
            addCriterion("INVNUM =", value, "invnum");
            return (Criteria) this;
        }

        public Criteria andInvnumNotEqualTo(BigDecimal value) {
            addCriterion("INVNUM <>", value, "invnum");
            return (Criteria) this;
        }

        public Criteria andInvnumGreaterThan(BigDecimal value) {
            addCriterion("INVNUM >", value, "invnum");
            return (Criteria) this;
        }

        public Criteria andInvnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVNUM >=", value, "invnum");
            return (Criteria) this;
        }

        public Criteria andInvnumLessThan(BigDecimal value) {
            addCriterion("INVNUM <", value, "invnum");
            return (Criteria) this;
        }

        public Criteria andInvnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVNUM <=", value, "invnum");
            return (Criteria) this;
        }

        public Criteria andInvnumIn(List<BigDecimal> values) {
            addCriterion("INVNUM in", values, "invnum");
            return (Criteria) this;
        }

        public Criteria andInvnumNotIn(List<BigDecimal> values) {
            addCriterion("INVNUM not in", values, "invnum");
            return (Criteria) this;
        }

        public Criteria andInvnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVNUM between", value1, value2, "invnum");
            return (Criteria) this;
        }

        public Criteria andInvnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVNUM not between", value1, value2, "invnum");
            return (Criteria) this;
        }

        public Criteria andEstregcapusdIsNull() {
            addCriterion("ESTREGCAPUSD is null");
            return (Criteria) this;
        }

        public Criteria andEstregcapusdIsNotNull() {
            addCriterion("ESTREGCAPUSD is not null");
            return (Criteria) this;
        }

        public Criteria andEstregcapusdEqualTo(BigDecimal value) {
            addCriterion("ESTREGCAPUSD =", value, "estregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstregcapusdNotEqualTo(BigDecimal value) {
            addCriterion("ESTREGCAPUSD <>", value, "estregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstregcapusdGreaterThan(BigDecimal value) {
            addCriterion("ESTREGCAPUSD >", value, "estregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstregcapusdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ESTREGCAPUSD >=", value, "estregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstregcapusdLessThan(BigDecimal value) {
            addCriterion("ESTREGCAPUSD <", value, "estregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstregcapusdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ESTREGCAPUSD <=", value, "estregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstregcapusdIn(List<BigDecimal> values) {
            addCriterion("ESTREGCAPUSD in", values, "estregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstregcapusdNotIn(List<BigDecimal> values) {
            addCriterion("ESTREGCAPUSD not in", values, "estregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstregcapusdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ESTREGCAPUSD between", value1, value2, "estregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstregcapusdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ESTREGCAPUSD not between", value1, value2, "estregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstforregcapusdIsNull() {
            addCriterion("ESTFORREGCAPUSD is null");
            return (Criteria) this;
        }

        public Criteria andEstforregcapusdIsNotNull() {
            addCriterion("ESTFORREGCAPUSD is not null");
            return (Criteria) this;
        }

        public Criteria andEstforregcapusdEqualTo(BigDecimal value) {
            addCriterion("ESTFORREGCAPUSD =", value, "estforregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstforregcapusdNotEqualTo(BigDecimal value) {
            addCriterion("ESTFORREGCAPUSD <>", value, "estforregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstforregcapusdGreaterThan(BigDecimal value) {
            addCriterion("ESTFORREGCAPUSD >", value, "estforregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstforregcapusdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ESTFORREGCAPUSD >=", value, "estforregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstforregcapusdLessThan(BigDecimal value) {
            addCriterion("ESTFORREGCAPUSD <", value, "estforregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstforregcapusdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ESTFORREGCAPUSD <=", value, "estforregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstforregcapusdIn(List<BigDecimal> values) {
            addCriterion("ESTFORREGCAPUSD in", values, "estforregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstforregcapusdNotIn(List<BigDecimal> values) {
            addCriterion("ESTFORREGCAPUSD not in", values, "estforregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstforregcapusdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ESTFORREGCAPUSD between", value1, value2, "estforregcapusd");
            return (Criteria) this;
        }

        public Criteria andEstforregcapusdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ESTFORREGCAPUSD not between", value1, value2, "estforregcapusd");
            return (Criteria) this;
        }

        public Criteria andSupenttypeIsNull() {
            addCriterion("SUPENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSupenttypeIsNotNull() {
            addCriterion("SUPENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSupenttypeEqualTo(String value) {
            addCriterion("SUPENTTYPE =", value, "supenttype");
            return (Criteria) this;
        }

        public Criteria andSupenttypeNotEqualTo(String value) {
            addCriterion("SUPENTTYPE <>", value, "supenttype");
            return (Criteria) this;
        }

        public Criteria andSupenttypeGreaterThan(String value) {
            addCriterion("SUPENTTYPE >", value, "supenttype");
            return (Criteria) this;
        }

        public Criteria andSupenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUPENTTYPE >=", value, "supenttype");
            return (Criteria) this;
        }

        public Criteria andSupenttypeLessThan(String value) {
            addCriterion("SUPENTTYPE <", value, "supenttype");
            return (Criteria) this;
        }

        public Criteria andSupenttypeLessThanOrEqualTo(String value) {
            addCriterion("SUPENTTYPE <=", value, "supenttype");
            return (Criteria) this;
        }

        public Criteria andSupenttypeLike(String value) {
            addCriterion("SUPENTTYPE like", value, "supenttype");
            return (Criteria) this;
        }

        public Criteria andSupenttypeNotLike(String value) {
            addCriterion("SUPENTTYPE not like", value, "supenttype");
            return (Criteria) this;
        }

        public Criteria andSupenttypeIn(List<String> values) {
            addCriterion("SUPENTTYPE in", values, "supenttype");
            return (Criteria) this;
        }

        public Criteria andSupenttypeNotIn(List<String> values) {
            addCriterion("SUPENTTYPE not in", values, "supenttype");
            return (Criteria) this;
        }

        public Criteria andSupenttypeBetween(String value1, String value2) {
            addCriterion("SUPENTTYPE between", value1, value2, "supenttype");
            return (Criteria) this;
        }

        public Criteria andSupenttypeNotBetween(String value1, String value2) {
            addCriterion("SUPENTTYPE not between", value1, value2, "supenttype");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeIsNull() {
            addCriterion("STOCKDEALTYPE is null");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeIsNotNull() {
            addCriterion("STOCKDEALTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeEqualTo(String value) {
            addCriterion("STOCKDEALTYPE =", value, "stockdealtype");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeNotEqualTo(String value) {
            addCriterion("STOCKDEALTYPE <>", value, "stockdealtype");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeGreaterThan(String value) {
            addCriterion("STOCKDEALTYPE >", value, "stockdealtype");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeGreaterThanOrEqualTo(String value) {
            addCriterion("STOCKDEALTYPE >=", value, "stockdealtype");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeLessThan(String value) {
            addCriterion("STOCKDEALTYPE <", value, "stockdealtype");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeLessThanOrEqualTo(String value) {
            addCriterion("STOCKDEALTYPE <=", value, "stockdealtype");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeLike(String value) {
            addCriterion("STOCKDEALTYPE like", value, "stockdealtype");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeNotLike(String value) {
            addCriterion("STOCKDEALTYPE not like", value, "stockdealtype");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeIn(List<String> values) {
            addCriterion("STOCKDEALTYPE in", values, "stockdealtype");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeNotIn(List<String> values) {
            addCriterion("STOCKDEALTYPE not in", values, "stockdealtype");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeBetween(String value1, String value2) {
            addCriterion("STOCKDEALTYPE between", value1, value2, "stockdealtype");
            return (Criteria) this;
        }

        public Criteria andStockdealtypeNotBetween(String value1, String value2) {
            addCriterion("STOCKDEALTYPE not between", value1, value2, "stockdealtype");
            return (Criteria) this;
        }

        public Criteria andStocknumIsNull() {
            addCriterion("STOCKNUM is null");
            return (Criteria) this;
        }

        public Criteria andStocknumIsNotNull() {
            addCriterion("STOCKNUM is not null");
            return (Criteria) this;
        }

        public Criteria andStocknumEqualTo(BigDecimal value) {
            addCriterion("STOCKNUM =", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumNotEqualTo(BigDecimal value) {
            addCriterion("STOCKNUM <>", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumGreaterThan(BigDecimal value) {
            addCriterion("STOCKNUM >", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STOCKNUM >=", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumLessThan(BigDecimal value) {
            addCriterion("STOCKNUM <", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STOCKNUM <=", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumIn(List<BigDecimal> values) {
            addCriterion("STOCKNUM in", values, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumNotIn(List<BigDecimal> values) {
            addCriterion("STOCKNUM not in", values, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOCKNUM between", value1, value2, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOCKNUM not between", value1, value2, "stocknum");
            return (Criteria) this;
        }

        public Criteria andIfprovincenameIsNull() {
            addCriterion("IFPROVINCENAME is null");
            return (Criteria) this;
        }

        public Criteria andIfprovincenameIsNotNull() {
            addCriterion("IFPROVINCENAME is not null");
            return (Criteria) this;
        }

        public Criteria andIfprovincenameEqualTo(BigDecimal value) {
            addCriterion("IFPROVINCENAME =", value, "ifprovincename");
            return (Criteria) this;
        }

        public Criteria andIfprovincenameNotEqualTo(BigDecimal value) {
            addCriterion("IFPROVINCENAME <>", value, "ifprovincename");
            return (Criteria) this;
        }

        public Criteria andIfprovincenameGreaterThan(BigDecimal value) {
            addCriterion("IFPROVINCENAME >", value, "ifprovincename");
            return (Criteria) this;
        }

        public Criteria andIfprovincenameGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IFPROVINCENAME >=", value, "ifprovincename");
            return (Criteria) this;
        }

        public Criteria andIfprovincenameLessThan(BigDecimal value) {
            addCriterion("IFPROVINCENAME <", value, "ifprovincename");
            return (Criteria) this;
        }

        public Criteria andIfprovincenameLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IFPROVINCENAME <=", value, "ifprovincename");
            return (Criteria) this;
        }

        public Criteria andIfprovincenameIn(List<BigDecimal> values) {
            addCriterion("IFPROVINCENAME in", values, "ifprovincename");
            return (Criteria) this;
        }

        public Criteria andIfprovincenameNotIn(List<BigDecimal> values) {
            addCriterion("IFPROVINCENAME not in", values, "ifprovincename");
            return (Criteria) this;
        }

        public Criteria andIfprovincenameBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IFPROVINCENAME between", value1, value2, "ifprovincename");
            return (Criteria) this;
        }

        public Criteria andIfprovincenameNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IFPROVINCENAME not between", value1, value2, "ifprovincename");
            return (Criteria) this;
        }

        public Criteria andCertinfoIsNull() {
            addCriterion("CERTINFO is null");
            return (Criteria) this;
        }

        public Criteria andCertinfoIsNotNull() {
            addCriterion("CERTINFO is not null");
            return (Criteria) this;
        }

        public Criteria andCertinfoEqualTo(String value) {
            addCriterion("CERTINFO =", value, "certinfo");
            return (Criteria) this;
        }

        public Criteria andCertinfoNotEqualTo(String value) {
            addCriterion("CERTINFO <>", value, "certinfo");
            return (Criteria) this;
        }

        public Criteria andCertinfoGreaterThan(String value) {
            addCriterion("CERTINFO >", value, "certinfo");
            return (Criteria) this;
        }

        public Criteria andCertinfoGreaterThanOrEqualTo(String value) {
            addCriterion("CERTINFO >=", value, "certinfo");
            return (Criteria) this;
        }

        public Criteria andCertinfoLessThan(String value) {
            addCriterion("CERTINFO <", value, "certinfo");
            return (Criteria) this;
        }

        public Criteria andCertinfoLessThanOrEqualTo(String value) {
            addCriterion("CERTINFO <=", value, "certinfo");
            return (Criteria) this;
        }

        public Criteria andCertinfoLike(String value) {
            addCriterion("CERTINFO like", value, "certinfo");
            return (Criteria) this;
        }

        public Criteria andCertinfoNotLike(String value) {
            addCriterion("CERTINFO not like", value, "certinfo");
            return (Criteria) this;
        }

        public Criteria andCertinfoIn(List<String> values) {
            addCriterion("CERTINFO in", values, "certinfo");
            return (Criteria) this;
        }

        public Criteria andCertinfoNotIn(List<String> values) {
            addCriterion("CERTINFO not in", values, "certinfo");
            return (Criteria) this;
        }

        public Criteria andCertinfoBetween(String value1, String value2) {
            addCriterion("CERTINFO between", value1, value2, "certinfo");
            return (Criteria) this;
        }

        public Criteria andCertinfoNotBetween(String value1, String value2) {
            addCriterion("CERTINFO not between", value1, value2, "certinfo");
            return (Criteria) this;
        }

        public Criteria andRoeIsNull() {
            addCriterion("ROE is null");
            return (Criteria) this;
        }

        public Criteria andRoeIsNotNull() {
            addCriterion("ROE is not null");
            return (Criteria) this;
        }

        public Criteria andRoeEqualTo(BigDecimal value) {
            addCriterion("ROE =", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeNotEqualTo(BigDecimal value) {
            addCriterion("ROE <>", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeGreaterThan(BigDecimal value) {
            addCriterion("ROE >", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROE >=", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeLessThan(BigDecimal value) {
            addCriterion("ROE <", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROE <=", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeIn(List<BigDecimal> values) {
            addCriterion("ROE in", values, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeNotIn(List<BigDecimal> values) {
            addCriterion("ROE not in", values, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROE between", value1, value2, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROE not between", value1, value2, "roe");
            return (Criteria) this;
        }

        public Criteria andOpscotypeIsNull() {
            addCriterion("OPSCOTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpscotypeIsNotNull() {
            addCriterion("OPSCOTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpscotypeEqualTo(String value) {
            addCriterion("OPSCOTYPE =", value, "opscotype");
            return (Criteria) this;
        }

        public Criteria andOpscotypeNotEqualTo(String value) {
            addCriterion("OPSCOTYPE <>", value, "opscotype");
            return (Criteria) this;
        }

        public Criteria andOpscotypeGreaterThan(String value) {
            addCriterion("OPSCOTYPE >", value, "opscotype");
            return (Criteria) this;
        }

        public Criteria andOpscotypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPSCOTYPE >=", value, "opscotype");
            return (Criteria) this;
        }

        public Criteria andOpscotypeLessThan(String value) {
            addCriterion("OPSCOTYPE <", value, "opscotype");
            return (Criteria) this;
        }

        public Criteria andOpscotypeLessThanOrEqualTo(String value) {
            addCriterion("OPSCOTYPE <=", value, "opscotype");
            return (Criteria) this;
        }

        public Criteria andOpscotypeLike(String value) {
            addCriterion("OPSCOTYPE like", value, "opscotype");
            return (Criteria) this;
        }

        public Criteria andOpscotypeNotLike(String value) {
            addCriterion("OPSCOTYPE not like", value, "opscotype");
            return (Criteria) this;
        }

        public Criteria andOpscotypeIn(List<String> values) {
            addCriterion("OPSCOTYPE in", values, "opscotype");
            return (Criteria) this;
        }

        public Criteria andOpscotypeNotIn(List<String> values) {
            addCriterion("OPSCOTYPE not in", values, "opscotype");
            return (Criteria) this;
        }

        public Criteria andOpscotypeBetween(String value1, String value2) {
            addCriterion("OPSCOTYPE between", value1, value2, "opscotype");
            return (Criteria) this;
        }

        public Criteria andOpscotypeNotBetween(String value1, String value2) {
            addCriterion("OPSCOTYPE not between", value1, value2, "opscotype");
            return (Criteria) this;
        }

        public Criteria andForcapentsortIsNull() {
            addCriterion("FORCAPENTSORT is null");
            return (Criteria) this;
        }

        public Criteria andForcapentsortIsNotNull() {
            addCriterion("FORCAPENTSORT is not null");
            return (Criteria) this;
        }

        public Criteria andForcapentsortEqualTo(String value) {
            addCriterion("FORCAPENTSORT =", value, "forcapentsort");
            return (Criteria) this;
        }

        public Criteria andForcapentsortNotEqualTo(String value) {
            addCriterion("FORCAPENTSORT <>", value, "forcapentsort");
            return (Criteria) this;
        }

        public Criteria andForcapentsortGreaterThan(String value) {
            addCriterion("FORCAPENTSORT >", value, "forcapentsort");
            return (Criteria) this;
        }

        public Criteria andForcapentsortGreaterThanOrEqualTo(String value) {
            addCriterion("FORCAPENTSORT >=", value, "forcapentsort");
            return (Criteria) this;
        }

        public Criteria andForcapentsortLessThan(String value) {
            addCriterion("FORCAPENTSORT <", value, "forcapentsort");
            return (Criteria) this;
        }

        public Criteria andForcapentsortLessThanOrEqualTo(String value) {
            addCriterion("FORCAPENTSORT <=", value, "forcapentsort");
            return (Criteria) this;
        }

        public Criteria andForcapentsortLike(String value) {
            addCriterion("FORCAPENTSORT like", value, "forcapentsort");
            return (Criteria) this;
        }

        public Criteria andForcapentsortNotLike(String value) {
            addCriterion("FORCAPENTSORT not like", value, "forcapentsort");
            return (Criteria) this;
        }

        public Criteria andForcapentsortIn(List<String> values) {
            addCriterion("FORCAPENTSORT in", values, "forcapentsort");
            return (Criteria) this;
        }

        public Criteria andForcapentsortNotIn(List<String> values) {
            addCriterion("FORCAPENTSORT not in", values, "forcapentsort");
            return (Criteria) this;
        }

        public Criteria andForcapentsortBetween(String value1, String value2) {
            addCriterion("FORCAPENTSORT between", value1, value2, "forcapentsort");
            return (Criteria) this;
        }

        public Criteria andForcapentsortNotBetween(String value1, String value2) {
            addCriterion("FORCAPENTSORT not between", value1, value2, "forcapentsort");
            return (Criteria) this;
        }

        public Criteria andLimparnumIsNull() {
            addCriterion("LIMPARNUM is null");
            return (Criteria) this;
        }

        public Criteria andLimparnumIsNotNull() {
            addCriterion("LIMPARNUM is not null");
            return (Criteria) this;
        }

        public Criteria andLimparnumEqualTo(Short value) {
            addCriterion("LIMPARNUM =", value, "limparnum");
            return (Criteria) this;
        }

        public Criteria andLimparnumNotEqualTo(Short value) {
            addCriterion("LIMPARNUM <>", value, "limparnum");
            return (Criteria) this;
        }

        public Criteria andLimparnumGreaterThan(Short value) {
            addCriterion("LIMPARNUM >", value, "limparnum");
            return (Criteria) this;
        }

        public Criteria andLimparnumGreaterThanOrEqualTo(Short value) {
            addCriterion("LIMPARNUM >=", value, "limparnum");
            return (Criteria) this;
        }

        public Criteria andLimparnumLessThan(Short value) {
            addCriterion("LIMPARNUM <", value, "limparnum");
            return (Criteria) this;
        }

        public Criteria andLimparnumLessThanOrEqualTo(Short value) {
            addCriterion("LIMPARNUM <=", value, "limparnum");
            return (Criteria) this;
        }

        public Criteria andLimparnumIn(List<Short> values) {
            addCriterion("LIMPARNUM in", values, "limparnum");
            return (Criteria) this;
        }

        public Criteria andLimparnumNotIn(List<Short> values) {
            addCriterion("LIMPARNUM not in", values, "limparnum");
            return (Criteria) this;
        }

        public Criteria andLimparnumBetween(Short value1, Short value2) {
            addCriterion("LIMPARNUM between", value1, value2, "limparnum");
            return (Criteria) this;
        }

        public Criteria andLimparnumNotBetween(Short value1, Short value2) {
            addCriterion("LIMPARNUM not between", value1, value2, "limparnum");
            return (Criteria) this;
        }

        public Criteria andOpstateIsNull() {
            addCriterion("OPSTATE is null");
            return (Criteria) this;
        }

        public Criteria andOpstateIsNotNull() {
            addCriterion("OPSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpstateEqualTo(String value) {
            addCriterion("OPSTATE =", value, "opstate");
            return (Criteria) this;
        }

        public Criteria andOpstateNotEqualTo(String value) {
            addCriterion("OPSTATE <>", value, "opstate");
            return (Criteria) this;
        }

        public Criteria andOpstateGreaterThan(String value) {
            addCriterion("OPSTATE >", value, "opstate");
            return (Criteria) this;
        }

        public Criteria andOpstateGreaterThanOrEqualTo(String value) {
            addCriterion("OPSTATE >=", value, "opstate");
            return (Criteria) this;
        }

        public Criteria andOpstateLessThan(String value) {
            addCriterion("OPSTATE <", value, "opstate");
            return (Criteria) this;
        }

        public Criteria andOpstateLessThanOrEqualTo(String value) {
            addCriterion("OPSTATE <=", value, "opstate");
            return (Criteria) this;
        }

        public Criteria andOpstateLike(String value) {
            addCriterion("OPSTATE like", value, "opstate");
            return (Criteria) this;
        }

        public Criteria andOpstateNotLike(String value) {
            addCriterion("OPSTATE not like", value, "opstate");
            return (Criteria) this;
        }

        public Criteria andOpstateIn(List<String> values) {
            addCriterion("OPSTATE in", values, "opstate");
            return (Criteria) this;
        }

        public Criteria andOpstateNotIn(List<String> values) {
            addCriterion("OPSTATE not in", values, "opstate");
            return (Criteria) this;
        }

        public Criteria andOpstateBetween(String value1, String value2) {
            addCriterion("OPSTATE between", value1, value2, "opstate");
            return (Criteria) this;
        }

        public Criteria andOpstateNotBetween(String value1, String value2) {
            addCriterion("OPSTATE not between", value1, value2, "opstate");
            return (Criteria) this;
        }

        public Criteria andIndateIsNull() {
            addCriterion("INDATE is null");
            return (Criteria) this;
        }

        public Criteria andIndateIsNotNull() {
            addCriterion("INDATE is not null");
            return (Criteria) this;
        }

        public Criteria andIndateEqualTo(Date value) {
            addCriterion("INDATE =", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotEqualTo(Date value) {
            addCriterion("INDATE <>", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThan(Date value) {
            addCriterion("INDATE >", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThanOrEqualTo(Date value) {
            addCriterion("INDATE >=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThan(Date value) {
            addCriterion("INDATE <", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThanOrEqualTo(Date value) {
            addCriterion("INDATE <=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateIn(List<Date> values) {
            addCriterion("INDATE in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotIn(List<Date> values) {
            addCriterion("INDATE not in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateBetween(Date value1, Date value2) {
            addCriterion("INDATE between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotBetween(Date value1, Date value2) {
            addCriterion("INDATE not between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andOutdateIsNull() {
            addCriterion("OUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andOutdateIsNotNull() {
            addCriterion("OUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOutdateEqualTo(Date value) {
            addCriterion("OUTDATE =", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotEqualTo(Date value) {
            addCriterion("OUTDATE <>", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateGreaterThan(Date value) {
            addCriterion("OUTDATE >", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateGreaterThanOrEqualTo(Date value) {
            addCriterion("OUTDATE >=", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateLessThan(Date value) {
            addCriterion("OUTDATE <", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateLessThanOrEqualTo(Date value) {
            addCriterion("OUTDATE <=", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateIn(List<Date> values) {
            addCriterion("OUTDATE in", values, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotIn(List<Date> values) {
            addCriterion("OUTDATE not in", values, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateBetween(Date value1, Date value2) {
            addCriterion("OUTDATE between", value1, value2, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotBetween(Date value1, Date value2) {
            addCriterion("OUTDATE not between", value1, value2, "outdate");
            return (Criteria) this;
        }

        public Criteria andRevdateIsNull() {
            addCriterion("REVDATE is null");
            return (Criteria) this;
        }

        public Criteria andRevdateIsNotNull() {
            addCriterion("REVDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRevdateEqualTo(Date value) {
            addCriterion("REVDATE =", value, "revdate");
            return (Criteria) this;
        }

        public Criteria andRevdateNotEqualTo(Date value) {
            addCriterion("REVDATE <>", value, "revdate");
            return (Criteria) this;
        }

        public Criteria andRevdateGreaterThan(Date value) {
            addCriterion("REVDATE >", value, "revdate");
            return (Criteria) this;
        }

        public Criteria andRevdateGreaterThanOrEqualTo(Date value) {
            addCriterion("REVDATE >=", value, "revdate");
            return (Criteria) this;
        }

        public Criteria andRevdateLessThan(Date value) {
            addCriterion("REVDATE <", value, "revdate");
            return (Criteria) this;
        }

        public Criteria andRevdateLessThanOrEqualTo(Date value) {
            addCriterion("REVDATE <=", value, "revdate");
            return (Criteria) this;
        }

        public Criteria andRevdateIn(List<Date> values) {
            addCriterion("REVDATE in", values, "revdate");
            return (Criteria) this;
        }

        public Criteria andRevdateNotIn(List<Date> values) {
            addCriterion("REVDATE not in", values, "revdate");
            return (Criteria) this;
        }

        public Criteria andRevdateBetween(Date value1, Date value2) {
            addCriterion("REVDATE between", value1, value2, "revdate");
            return (Criteria) this;
        }

        public Criteria andRevdateNotBetween(Date value1, Date value2) {
            addCriterion("REVDATE not between", value1, value2, "revdate");
            return (Criteria) this;
        }

        public Criteria andCandateIsNull() {
            addCriterion("CANDATE is null");
            return (Criteria) this;
        }

        public Criteria andCandateIsNotNull() {
            addCriterion("CANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCandateEqualTo(Date value) {
            addCriterion("CANDATE =", value, "candate");
            return (Criteria) this;
        }

        public Criteria andCandateNotEqualTo(Date value) {
            addCriterion("CANDATE <>", value, "candate");
            return (Criteria) this;
        }

        public Criteria andCandateGreaterThan(Date value) {
            addCriterion("CANDATE >", value, "candate");
            return (Criteria) this;
        }

        public Criteria andCandateGreaterThanOrEqualTo(Date value) {
            addCriterion("CANDATE >=", value, "candate");
            return (Criteria) this;
        }

        public Criteria andCandateLessThan(Date value) {
            addCriterion("CANDATE <", value, "candate");
            return (Criteria) this;
        }

        public Criteria andCandateLessThanOrEqualTo(Date value) {
            addCriterion("CANDATE <=", value, "candate");
            return (Criteria) this;
        }

        public Criteria andCandateIn(List<Date> values) {
            addCriterion("CANDATE in", values, "candate");
            return (Criteria) this;
        }

        public Criteria andCandateNotIn(List<Date> values) {
            addCriterion("CANDATE not in", values, "candate");
            return (Criteria) this;
        }

        public Criteria andCandateBetween(Date value1, Date value2) {
            addCriterion("CANDATE between", value1, value2, "candate");
            return (Criteria) this;
        }

        public Criteria andCandateNotBetween(Date value1, Date value2) {
            addCriterion("CANDATE not between", value1, value2, "candate");
            return (Criteria) this;
        }

        public Criteria andUnempnumIsNull() {
            addCriterion("UNEMPNUM is null");
            return (Criteria) this;
        }

        public Criteria andUnempnumIsNotNull() {
            addCriterion("UNEMPNUM is not null");
            return (Criteria) this;
        }

        public Criteria andUnempnumEqualTo(BigDecimal value) {
            addCriterion("UNEMPNUM =", value, "unempnum");
            return (Criteria) this;
        }

        public Criteria andUnempnumNotEqualTo(BigDecimal value) {
            addCriterion("UNEMPNUM <>", value, "unempnum");
            return (Criteria) this;
        }

        public Criteria andUnempnumGreaterThan(BigDecimal value) {
            addCriterion("UNEMPNUM >", value, "unempnum");
            return (Criteria) this;
        }

        public Criteria andUnempnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNEMPNUM >=", value, "unempnum");
            return (Criteria) this;
        }

        public Criteria andUnempnumLessThan(BigDecimal value) {
            addCriterion("UNEMPNUM <", value, "unempnum");
            return (Criteria) this;
        }

        public Criteria andUnempnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNEMPNUM <=", value, "unempnum");
            return (Criteria) this;
        }

        public Criteria andUnempnumIn(List<BigDecimal> values) {
            addCriterion("UNEMPNUM in", values, "unempnum");
            return (Criteria) this;
        }

        public Criteria andUnempnumNotIn(List<BigDecimal> values) {
            addCriterion("UNEMPNUM not in", values, "unempnum");
            return (Criteria) this;
        }

        public Criteria andUnempnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNEMPNUM between", value1, value2, "unempnum");
            return (Criteria) this;
        }

        public Criteria andUnempnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNEMPNUM not between", value1, value2, "unempnum");
            return (Criteria) this;
        }

        public Criteria andUnivleavernumIsNull() {
            addCriterion("UNIVLEAVERNUM is null");
            return (Criteria) this;
        }

        public Criteria andUnivleavernumIsNotNull() {
            addCriterion("UNIVLEAVERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andUnivleavernumEqualTo(BigDecimal value) {
            addCriterion("UNIVLEAVERNUM =", value, "univleavernum");
            return (Criteria) this;
        }

        public Criteria andUnivleavernumNotEqualTo(BigDecimal value) {
            addCriterion("UNIVLEAVERNUM <>", value, "univleavernum");
            return (Criteria) this;
        }

        public Criteria andUnivleavernumGreaterThan(BigDecimal value) {
            addCriterion("UNIVLEAVERNUM >", value, "univleavernum");
            return (Criteria) this;
        }

        public Criteria andUnivleavernumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIVLEAVERNUM >=", value, "univleavernum");
            return (Criteria) this;
        }

        public Criteria andUnivleavernumLessThan(BigDecimal value) {
            addCriterion("UNIVLEAVERNUM <", value, "univleavernum");
            return (Criteria) this;
        }

        public Criteria andUnivleavernumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIVLEAVERNUM <=", value, "univleavernum");
            return (Criteria) this;
        }

        public Criteria andUnivleavernumIn(List<BigDecimal> values) {
            addCriterion("UNIVLEAVERNUM in", values, "univleavernum");
            return (Criteria) this;
        }

        public Criteria andUnivleavernumNotIn(List<BigDecimal> values) {
            addCriterion("UNIVLEAVERNUM not in", values, "univleavernum");
            return (Criteria) this;
        }

        public Criteria andUnivleavernumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIVLEAVERNUM between", value1, value2, "univleavernum");
            return (Criteria) this;
        }

        public Criteria andUnivleavernumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIVLEAVERNUM not between", value1, value2, "univleavernum");
            return (Criteria) this;
        }

        public Criteria andSExtTimestampIsNull() {
            addCriterion("S_EXT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andSExtTimestampIsNotNull() {
            addCriterion("S_EXT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andSExtTimestampEqualTo(Date value) {
            addCriterion("S_EXT_TIMESTAMP =", value, "sExtTimestamp");
            return (Criteria) this;
        }

        public Criteria andSExtTimestampNotEqualTo(Date value) {
            addCriterion("S_EXT_TIMESTAMP <>", value, "sExtTimestamp");
            return (Criteria) this;
        }

        public Criteria andSExtTimestampGreaterThan(Date value) {
            addCriterion("S_EXT_TIMESTAMP >", value, "sExtTimestamp");
            return (Criteria) this;
        }

        public Criteria andSExtTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("S_EXT_TIMESTAMP >=", value, "sExtTimestamp");
            return (Criteria) this;
        }

        public Criteria andSExtTimestampLessThan(Date value) {
            addCriterion("S_EXT_TIMESTAMP <", value, "sExtTimestamp");
            return (Criteria) this;
        }

        public Criteria andSExtTimestampLessThanOrEqualTo(Date value) {
            addCriterion("S_EXT_TIMESTAMP <=", value, "sExtTimestamp");
            return (Criteria) this;
        }

        public Criteria andSExtTimestampIn(List<Date> values) {
            addCriterion("S_EXT_TIMESTAMP in", values, "sExtTimestamp");
            return (Criteria) this;
        }

        public Criteria andSExtTimestampNotIn(List<Date> values) {
            addCriterion("S_EXT_TIMESTAMP not in", values, "sExtTimestamp");
            return (Criteria) this;
        }

        public Criteria andSExtTimestampBetween(Date value1, Date value2) {
            addCriterion("S_EXT_TIMESTAMP between", value1, value2, "sExtTimestamp");
            return (Criteria) this;
        }

        public Criteria andSExtTimestampNotBetween(Date value1, Date value2) {
            addCriterion("S_EXT_TIMESTAMP not between", value1, value2, "sExtTimestamp");
            return (Criteria) this;
        }

        public Criteria andOpetypeIsNull() {
            addCriterion("OPETYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpetypeIsNotNull() {
            addCriterion("OPETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpetypeEqualTo(String value) {
            addCriterion("OPETYPE =", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeNotEqualTo(String value) {
            addCriterion("OPETYPE <>", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeGreaterThan(String value) {
            addCriterion("OPETYPE >", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPETYPE >=", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeLessThan(String value) {
            addCriterion("OPETYPE <", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeLessThanOrEqualTo(String value) {
            addCriterion("OPETYPE <=", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeLike(String value) {
            addCriterion("OPETYPE like", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeNotLike(String value) {
            addCriterion("OPETYPE not like", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeIn(List<String> values) {
            addCriterion("OPETYPE in", values, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeNotIn(List<String> values) {
            addCriterion("OPETYPE not in", values, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeBetween(String value1, String value2) {
            addCriterion("OPETYPE between", value1, value2, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeNotBetween(String value1, String value2) {
            addCriterion("OPETYPE not between", value1, value2, "opetype");
            return (Criteria) this;
        }

        public Criteria andAccountformIsNull() {
            addCriterion("ACCOUNTFORM is null");
            return (Criteria) this;
        }

        public Criteria andAccountformIsNotNull() {
            addCriterion("ACCOUNTFORM is not null");
            return (Criteria) this;
        }

        public Criteria andAccountformEqualTo(String value) {
            addCriterion("ACCOUNTFORM =", value, "accountform");
            return (Criteria) this;
        }

        public Criteria andAccountformNotEqualTo(String value) {
            addCriterion("ACCOUNTFORM <>", value, "accountform");
            return (Criteria) this;
        }

        public Criteria andAccountformGreaterThan(String value) {
            addCriterion("ACCOUNTFORM >", value, "accountform");
            return (Criteria) this;
        }

        public Criteria andAccountformGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTFORM >=", value, "accountform");
            return (Criteria) this;
        }

        public Criteria andAccountformLessThan(String value) {
            addCriterion("ACCOUNTFORM <", value, "accountform");
            return (Criteria) this;
        }

        public Criteria andAccountformLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTFORM <=", value, "accountform");
            return (Criteria) this;
        }

        public Criteria andAccountformLike(String value) {
            addCriterion("ACCOUNTFORM like", value, "accountform");
            return (Criteria) this;
        }

        public Criteria andAccountformNotLike(String value) {
            addCriterion("ACCOUNTFORM not like", value, "accountform");
            return (Criteria) this;
        }

        public Criteria andAccountformIn(List<String> values) {
            addCriterion("ACCOUNTFORM in", values, "accountform");
            return (Criteria) this;
        }

        public Criteria andAccountformNotIn(List<String> values) {
            addCriterion("ACCOUNTFORM not in", values, "accountform");
            return (Criteria) this;
        }

        public Criteria andAccountformBetween(String value1, String value2) {
            addCriterion("ACCOUNTFORM between", value1, value2, "accountform");
            return (Criteria) this;
        }

        public Criteria andAccountformNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTFORM not between", value1, value2, "accountform");
            return (Criteria) this;
        }

        public Criteria andAdvsignIsNull() {
            addCriterion("ADVSIGN is null");
            return (Criteria) this;
        }

        public Criteria andAdvsignIsNotNull() {
            addCriterion("ADVSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andAdvsignEqualTo(BigDecimal value) {
            addCriterion("ADVSIGN =", value, "advsign");
            return (Criteria) this;
        }

        public Criteria andAdvsignNotEqualTo(BigDecimal value) {
            addCriterion("ADVSIGN <>", value, "advsign");
            return (Criteria) this;
        }

        public Criteria andAdvsignGreaterThan(BigDecimal value) {
            addCriterion("ADVSIGN >", value, "advsign");
            return (Criteria) this;
        }

        public Criteria andAdvsignGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADVSIGN >=", value, "advsign");
            return (Criteria) this;
        }

        public Criteria andAdvsignLessThan(BigDecimal value) {
            addCriterion("ADVSIGN <", value, "advsign");
            return (Criteria) this;
        }

        public Criteria andAdvsignLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADVSIGN <=", value, "advsign");
            return (Criteria) this;
        }

        public Criteria andAdvsignIn(List<BigDecimal> values) {
            addCriterion("ADVSIGN in", values, "advsign");
            return (Criteria) this;
        }

        public Criteria andAdvsignNotIn(List<BigDecimal> values) {
            addCriterion("ADVSIGN not in", values, "advsign");
            return (Criteria) this;
        }

        public Criteria andAdvsignBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADVSIGN between", value1, value2, "advsign");
            return (Criteria) this;
        }

        public Criteria andAdvsignNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADVSIGN not between", value1, value2, "advsign");
            return (Criteria) this;
        }

        public Criteria andAgrsignIsNull() {
            addCriterion("AGRSIGN is null");
            return (Criteria) this;
        }

        public Criteria andAgrsignIsNotNull() {
            addCriterion("AGRSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andAgrsignEqualTo(BigDecimal value) {
            addCriterion("AGRSIGN =", value, "agrsign");
            return (Criteria) this;
        }

        public Criteria andAgrsignNotEqualTo(BigDecimal value) {
            addCriterion("AGRSIGN <>", value, "agrsign");
            return (Criteria) this;
        }

        public Criteria andAgrsignGreaterThan(BigDecimal value) {
            addCriterion("AGRSIGN >", value, "agrsign");
            return (Criteria) this;
        }

        public Criteria andAgrsignGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AGRSIGN >=", value, "agrsign");
            return (Criteria) this;
        }

        public Criteria andAgrsignLessThan(BigDecimal value) {
            addCriterion("AGRSIGN <", value, "agrsign");
            return (Criteria) this;
        }

        public Criteria andAgrsignLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AGRSIGN <=", value, "agrsign");
            return (Criteria) this;
        }

        public Criteria andAgrsignIn(List<BigDecimal> values) {
            addCriterion("AGRSIGN in", values, "agrsign");
            return (Criteria) this;
        }

        public Criteria andAgrsignNotIn(List<BigDecimal> values) {
            addCriterion("AGRSIGN not in", values, "agrsign");
            return (Criteria) this;
        }

        public Criteria andAgrsignBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGRSIGN between", value1, value2, "agrsign");
            return (Criteria) this;
        }

        public Criteria andAgrsignNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGRSIGN not between", value1, value2, "agrsign");
            return (Criteria) this;
        }

        public Criteria andSupopfromIsNull() {
            addCriterion("SUPOPFROM is null");
            return (Criteria) this;
        }

        public Criteria andSupopfromIsNotNull() {
            addCriterion("SUPOPFROM is not null");
            return (Criteria) this;
        }

        public Criteria andSupopfromEqualTo(Date value) {
            addCriterion("SUPOPFROM =", value, "supopfrom");
            return (Criteria) this;
        }

        public Criteria andSupopfromNotEqualTo(Date value) {
            addCriterion("SUPOPFROM <>", value, "supopfrom");
            return (Criteria) this;
        }

        public Criteria andSupopfromGreaterThan(Date value) {
            addCriterion("SUPOPFROM >", value, "supopfrom");
            return (Criteria) this;
        }

        public Criteria andSupopfromGreaterThanOrEqualTo(Date value) {
            addCriterion("SUPOPFROM >=", value, "supopfrom");
            return (Criteria) this;
        }

        public Criteria andSupopfromLessThan(Date value) {
            addCriterion("SUPOPFROM <", value, "supopfrom");
            return (Criteria) this;
        }

        public Criteria andSupopfromLessThanOrEqualTo(Date value) {
            addCriterion("SUPOPFROM <=", value, "supopfrom");
            return (Criteria) this;
        }

        public Criteria andSupopfromIn(List<Date> values) {
            addCriterion("SUPOPFROM in", values, "supopfrom");
            return (Criteria) this;
        }

        public Criteria andSupopfromNotIn(List<Date> values) {
            addCriterion("SUPOPFROM not in", values, "supopfrom");
            return (Criteria) this;
        }

        public Criteria andSupopfromBetween(Date value1, Date value2) {
            addCriterion("SUPOPFROM between", value1, value2, "supopfrom");
            return (Criteria) this;
        }

        public Criteria andSupopfromNotBetween(Date value1, Date value2) {
            addCriterion("SUPOPFROM not between", value1, value2, "supopfrom");
            return (Criteria) this;
        }

        public Criteria andSupoptoIsNull() {
            addCriterion("SUPOPTO is null");
            return (Criteria) this;
        }

        public Criteria andSupoptoIsNotNull() {
            addCriterion("SUPOPTO is not null");
            return (Criteria) this;
        }

        public Criteria andSupoptoEqualTo(Date value) {
            addCriterion("SUPOPTO =", value, "supopto");
            return (Criteria) this;
        }

        public Criteria andSupoptoNotEqualTo(Date value) {
            addCriterion("SUPOPTO <>", value, "supopto");
            return (Criteria) this;
        }

        public Criteria andSupoptoGreaterThan(Date value) {
            addCriterion("SUPOPTO >", value, "supopto");
            return (Criteria) this;
        }

        public Criteria andSupoptoGreaterThanOrEqualTo(Date value) {
            addCriterion("SUPOPTO >=", value, "supopto");
            return (Criteria) this;
        }

        public Criteria andSupoptoLessThan(Date value) {
            addCriterion("SUPOPTO <", value, "supopto");
            return (Criteria) this;
        }

        public Criteria andSupoptoLessThanOrEqualTo(Date value) {
            addCriterion("SUPOPTO <=", value, "supopto");
            return (Criteria) this;
        }

        public Criteria andSupoptoIn(List<Date> values) {
            addCriterion("SUPOPTO in", values, "supopto");
            return (Criteria) this;
        }

        public Criteria andSupoptoNotIn(List<Date> values) {
            addCriterion("SUPOPTO not in", values, "supopto");
            return (Criteria) this;
        }

        public Criteria andSupoptoBetween(Date value1, Date value2) {
            addCriterion("SUPOPTO between", value1, value2, "supopto");
            return (Criteria) this;
        }

        public Criteria andSupoptoNotBetween(Date value1, Date value2) {
            addCriterion("SUPOPTO not between", value1, value2, "supopto");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("COUNTY is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("COUNTY is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("COUNTY =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("COUNTY <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("COUNTY >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTY >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("COUNTY <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("COUNTY <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("COUNTY like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("COUNTY not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("COUNTY in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("COUNTY not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("COUNTY between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("COUNTY not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("STREET is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("STREET is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("STREET =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("STREET <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("STREET >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("STREET >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("STREET <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("STREET <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("STREET like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("STREET not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("STREET in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("STREET not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("STREET between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("STREET not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andRoadIsNull() {
            addCriterion("ROAD is null");
            return (Criteria) this;
        }

        public Criteria andRoadIsNotNull() {
            addCriterion("ROAD is not null");
            return (Criteria) this;
        }

        public Criteria andRoadEqualTo(String value) {
            addCriterion("ROAD =", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadNotEqualTo(String value) {
            addCriterion("ROAD <>", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadGreaterThan(String value) {
            addCriterion("ROAD >", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadGreaterThanOrEqualTo(String value) {
            addCriterion("ROAD >=", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadLessThan(String value) {
            addCriterion("ROAD <", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadLessThanOrEqualTo(String value) {
            addCriterion("ROAD <=", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadLike(String value) {
            addCriterion("ROAD like", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadNotLike(String value) {
            addCriterion("ROAD not like", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadIn(List<String> values) {
            addCriterion("ROAD in", values, "road");
            return (Criteria) this;
        }

        public Criteria andRoadNotIn(List<String> values) {
            addCriterion("ROAD not in", values, "road");
            return (Criteria) this;
        }

        public Criteria andRoadBetween(String value1, String value2) {
            addCriterion("ROAD between", value1, value2, "road");
            return (Criteria) this;
        }

        public Criteria andRoadNotBetween(String value1, String value2) {
            addCriterion("ROAD not between", value1, value2, "road");
            return (Criteria) this;
        }

        public Criteria andDoorplateIsNull() {
            addCriterion("DOORPLATE is null");
            return (Criteria) this;
        }

        public Criteria andDoorplateIsNotNull() {
            addCriterion("DOORPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andDoorplateEqualTo(String value) {
            addCriterion("DOORPLATE =", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateNotEqualTo(String value) {
            addCriterion("DOORPLATE <>", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateGreaterThan(String value) {
            addCriterion("DOORPLATE >", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateGreaterThanOrEqualTo(String value) {
            addCriterion("DOORPLATE >=", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateLessThan(String value) {
            addCriterion("DOORPLATE <", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateLessThanOrEqualTo(String value) {
            addCriterion("DOORPLATE <=", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateLike(String value) {
            addCriterion("DOORPLATE like", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateNotLike(String value) {
            addCriterion("DOORPLATE not like", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateIn(List<String> values) {
            addCriterion("DOORPLATE in", values, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateNotIn(List<String> values) {
            addCriterion("DOORPLATE not in", values, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateBetween(String value1, String value2) {
            addCriterion("DOORPLATE between", value1, value2, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateNotBetween(String value1, String value2) {
            addCriterion("DOORPLATE not between", value1, value2, "doorplate");
            return (Criteria) this;
        }

        public Criteria andArchnoIsNull() {
            addCriterion("ARCHNO is null");
            return (Criteria) this;
        }

        public Criteria andArchnoIsNotNull() {
            addCriterion("ARCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andArchnoEqualTo(String value) {
            addCriterion("ARCHNO =", value, "archno");
            return (Criteria) this;
        }

        public Criteria andArchnoNotEqualTo(String value) {
            addCriterion("ARCHNO <>", value, "archno");
            return (Criteria) this;
        }

        public Criteria andArchnoGreaterThan(String value) {
            addCriterion("ARCHNO >", value, "archno");
            return (Criteria) this;
        }

        public Criteria andArchnoGreaterThanOrEqualTo(String value) {
            addCriterion("ARCHNO >=", value, "archno");
            return (Criteria) this;
        }

        public Criteria andArchnoLessThan(String value) {
            addCriterion("ARCHNO <", value, "archno");
            return (Criteria) this;
        }

        public Criteria andArchnoLessThanOrEqualTo(String value) {
            addCriterion("ARCHNO <=", value, "archno");
            return (Criteria) this;
        }

        public Criteria andArchnoLike(String value) {
            addCriterion("ARCHNO like", value, "archno");
            return (Criteria) this;
        }

        public Criteria andArchnoNotLike(String value) {
            addCriterion("ARCHNO not like", value, "archno");
            return (Criteria) this;
        }

        public Criteria andArchnoIn(List<String> values) {
            addCriterion("ARCHNO in", values, "archno");
            return (Criteria) this;
        }

        public Criteria andArchnoNotIn(List<String> values) {
            addCriterion("ARCHNO not in", values, "archno");
            return (Criteria) this;
        }

        public Criteria andArchnoBetween(String value1, String value2) {
            addCriterion("ARCHNO between", value1, value2, "archno");
            return (Criteria) this;
        }

        public Criteria andArchnoNotBetween(String value1, String value2) {
            addCriterion("ARCHNO not between", value1, value2, "archno");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andTaxregisterIsNull() {
            addCriterion("TAXREGISTER is null");
            return (Criteria) this;
        }

        public Criteria andTaxregisterIsNotNull() {
            addCriterion("TAXREGISTER is not null");
            return (Criteria) this;
        }

        public Criteria andTaxregisterEqualTo(String value) {
            addCriterion("TAXREGISTER =", value, "taxregister");
            return (Criteria) this;
        }

        public Criteria andTaxregisterNotEqualTo(String value) {
            addCriterion("TAXREGISTER <>", value, "taxregister");
            return (Criteria) this;
        }

        public Criteria andTaxregisterGreaterThan(String value) {
            addCriterion("TAXREGISTER >", value, "taxregister");
            return (Criteria) this;
        }

        public Criteria andTaxregisterGreaterThanOrEqualTo(String value) {
            addCriterion("TAXREGISTER >=", value, "taxregister");
            return (Criteria) this;
        }

        public Criteria andTaxregisterLessThan(String value) {
            addCriterion("TAXREGISTER <", value, "taxregister");
            return (Criteria) this;
        }

        public Criteria andTaxregisterLessThanOrEqualTo(String value) {
            addCriterion("TAXREGISTER <=", value, "taxregister");
            return (Criteria) this;
        }

        public Criteria andTaxregisterLike(String value) {
            addCriterion("TAXREGISTER like", value, "taxregister");
            return (Criteria) this;
        }

        public Criteria andTaxregisterNotLike(String value) {
            addCriterion("TAXREGISTER not like", value, "taxregister");
            return (Criteria) this;
        }

        public Criteria andTaxregisterIn(List<String> values) {
            addCriterion("TAXREGISTER in", values, "taxregister");
            return (Criteria) this;
        }

        public Criteria andTaxregisterNotIn(List<String> values) {
            addCriterion("TAXREGISTER not in", values, "taxregister");
            return (Criteria) this;
        }

        public Criteria andTaxregisterBetween(String value1, String value2) {
            addCriterion("TAXREGISTER between", value1, value2, "taxregister");
            return (Criteria) this;
        }

        public Criteria andTaxregisterNotBetween(String value1, String value2) {
            addCriterion("TAXREGISTER not between", value1, value2, "taxregister");
            return (Criteria) this;
        }

        public Criteria andAccorgIsNull() {
            addCriterion("ACCORG is null");
            return (Criteria) this;
        }

        public Criteria andAccorgIsNotNull() {
            addCriterion("ACCORG is not null");
            return (Criteria) this;
        }

        public Criteria andAccorgEqualTo(String value) {
            addCriterion("ACCORG =", value, "accorg");
            return (Criteria) this;
        }

        public Criteria andAccorgNotEqualTo(String value) {
            addCriterion("ACCORG <>", value, "accorg");
            return (Criteria) this;
        }

        public Criteria andAccorgGreaterThan(String value) {
            addCriterion("ACCORG >", value, "accorg");
            return (Criteria) this;
        }

        public Criteria andAccorgGreaterThanOrEqualTo(String value) {
            addCriterion("ACCORG >=", value, "accorg");
            return (Criteria) this;
        }

        public Criteria andAccorgLessThan(String value) {
            addCriterion("ACCORG <", value, "accorg");
            return (Criteria) this;
        }

        public Criteria andAccorgLessThanOrEqualTo(String value) {
            addCriterion("ACCORG <=", value, "accorg");
            return (Criteria) this;
        }

        public Criteria andAccorgLike(String value) {
            addCriterion("ACCORG like", value, "accorg");
            return (Criteria) this;
        }

        public Criteria andAccorgNotLike(String value) {
            addCriterion("ACCORG not like", value, "accorg");
            return (Criteria) this;
        }

        public Criteria andAccorgIn(List<String> values) {
            addCriterion("ACCORG in", values, "accorg");
            return (Criteria) this;
        }

        public Criteria andAccorgNotIn(List<String> values) {
            addCriterion("ACCORG not in", values, "accorg");
            return (Criteria) this;
        }

        public Criteria andAccorgBetween(String value1, String value2) {
            addCriterion("ACCORG between", value1, value2, "accorg");
            return (Criteria) this;
        }

        public Criteria andAccorgNotBetween(String value1, String value2) {
            addCriterion("ACCORG not between", value1, value2, "accorg");
            return (Criteria) this;
        }

        public Criteria andIfsjIsNull() {
            addCriterion("IFSJ is null");
            return (Criteria) this;
        }

        public Criteria andIfsjIsNotNull() {
            addCriterion("IFSJ is not null");
            return (Criteria) this;
        }

        public Criteria andIfsjEqualTo(String value) {
            addCriterion("IFSJ =", value, "ifsj");
            return (Criteria) this;
        }

        public Criteria andIfsjNotEqualTo(String value) {
            addCriterion("IFSJ <>", value, "ifsj");
            return (Criteria) this;
        }

        public Criteria andIfsjGreaterThan(String value) {
            addCriterion("IFSJ >", value, "ifsj");
            return (Criteria) this;
        }

        public Criteria andIfsjGreaterThanOrEqualTo(String value) {
            addCriterion("IFSJ >=", value, "ifsj");
            return (Criteria) this;
        }

        public Criteria andIfsjLessThan(String value) {
            addCriterion("IFSJ <", value, "ifsj");
            return (Criteria) this;
        }

        public Criteria andIfsjLessThanOrEqualTo(String value) {
            addCriterion("IFSJ <=", value, "ifsj");
            return (Criteria) this;
        }

        public Criteria andIfsjLike(String value) {
            addCriterion("IFSJ like", value, "ifsj");
            return (Criteria) this;
        }

        public Criteria andIfsjNotLike(String value) {
            addCriterion("IFSJ not like", value, "ifsj");
            return (Criteria) this;
        }

        public Criteria andIfsjIn(List<String> values) {
            addCriterion("IFSJ in", values, "ifsj");
            return (Criteria) this;
        }

        public Criteria andIfsjNotIn(List<String> values) {
            addCriterion("IFSJ not in", values, "ifsj");
            return (Criteria) this;
        }

        public Criteria andIfsjBetween(String value1, String value2) {
            addCriterion("IFSJ between", value1, value2, "ifsj");
            return (Criteria) this;
        }

        public Criteria andIfsjNotBetween(String value1, String value2) {
            addCriterion("IFSJ not between", value1, value2, "ifsj");
            return (Criteria) this;
        }

        public Criteria andSjtypeIsNull() {
            addCriterion("SJTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSjtypeIsNotNull() {
            addCriterion("SJTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSjtypeEqualTo(String value) {
            addCriterion("SJTYPE =", value, "sjtype");
            return (Criteria) this;
        }

        public Criteria andSjtypeNotEqualTo(String value) {
            addCriterion("SJTYPE <>", value, "sjtype");
            return (Criteria) this;
        }

        public Criteria andSjtypeGreaterThan(String value) {
            addCriterion("SJTYPE >", value, "sjtype");
            return (Criteria) this;
        }

        public Criteria andSjtypeGreaterThanOrEqualTo(String value) {
            addCriterion("SJTYPE >=", value, "sjtype");
            return (Criteria) this;
        }

        public Criteria andSjtypeLessThan(String value) {
            addCriterion("SJTYPE <", value, "sjtype");
            return (Criteria) this;
        }

        public Criteria andSjtypeLessThanOrEqualTo(String value) {
            addCriterion("SJTYPE <=", value, "sjtype");
            return (Criteria) this;
        }

        public Criteria andSjtypeLike(String value) {
            addCriterion("SJTYPE like", value, "sjtype");
            return (Criteria) this;
        }

        public Criteria andSjtypeNotLike(String value) {
            addCriterion("SJTYPE not like", value, "sjtype");
            return (Criteria) this;
        }

        public Criteria andSjtypeIn(List<String> values) {
            addCriterion("SJTYPE in", values, "sjtype");
            return (Criteria) this;
        }

        public Criteria andSjtypeNotIn(List<String> values) {
            addCriterion("SJTYPE not in", values, "sjtype");
            return (Criteria) this;
        }

        public Criteria andSjtypeBetween(String value1, String value2) {
            addCriterion("SJTYPE between", value1, value2, "sjtype");
            return (Criteria) this;
        }

        public Criteria andSjtypeNotBetween(String value1, String value2) {
            addCriterion("SJTYPE not between", value1, value2, "sjtype");
            return (Criteria) this;
        }

        public Criteria andFarmernumIsNull() {
            addCriterion("FARMERNUM is null");
            return (Criteria) this;
        }

        public Criteria andFarmernumIsNotNull() {
            addCriterion("FARMERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFarmernumEqualTo(BigDecimal value) {
            addCriterion("FARMERNUM =", value, "farmernum");
            return (Criteria) this;
        }

        public Criteria andFarmernumNotEqualTo(BigDecimal value) {
            addCriterion("FARMERNUM <>", value, "farmernum");
            return (Criteria) this;
        }

        public Criteria andFarmernumGreaterThan(BigDecimal value) {
            addCriterion("FARMERNUM >", value, "farmernum");
            return (Criteria) this;
        }

        public Criteria andFarmernumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FARMERNUM >=", value, "farmernum");
            return (Criteria) this;
        }

        public Criteria andFarmernumLessThan(BigDecimal value) {
            addCriterion("FARMERNUM <", value, "farmernum");
            return (Criteria) this;
        }

        public Criteria andFarmernumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FARMERNUM <=", value, "farmernum");
            return (Criteria) this;
        }

        public Criteria andFarmernumIn(List<BigDecimal> values) {
            addCriterion("FARMERNUM in", values, "farmernum");
            return (Criteria) this;
        }

        public Criteria andFarmernumNotIn(List<BigDecimal> values) {
            addCriterion("FARMERNUM not in", values, "farmernum");
            return (Criteria) this;
        }

        public Criteria andFarmernumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FARMERNUM between", value1, value2, "farmernum");
            return (Criteria) this;
        }

        public Criteria andFarmernumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FARMERNUM not between", value1, value2, "farmernum");
            return (Criteria) this;
        }

        public Criteria andQtnumIsNull() {
            addCriterion("QTNUM is null");
            return (Criteria) this;
        }

        public Criteria andQtnumIsNotNull() {
            addCriterion("QTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andQtnumEqualTo(BigDecimal value) {
            addCriterion("QTNUM =", value, "qtnum");
            return (Criteria) this;
        }

        public Criteria andQtnumNotEqualTo(BigDecimal value) {
            addCriterion("QTNUM <>", value, "qtnum");
            return (Criteria) this;
        }

        public Criteria andQtnumGreaterThan(BigDecimal value) {
            addCriterion("QTNUM >", value, "qtnum");
            return (Criteria) this;
        }

        public Criteria andQtnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTNUM >=", value, "qtnum");
            return (Criteria) this;
        }

        public Criteria andQtnumLessThan(BigDecimal value) {
            addCriterion("QTNUM <", value, "qtnum");
            return (Criteria) this;
        }

        public Criteria andQtnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTNUM <=", value, "qtnum");
            return (Criteria) this;
        }

        public Criteria andQtnumIn(List<BigDecimal> values) {
            addCriterion("QTNUM in", values, "qtnum");
            return (Criteria) this;
        }

        public Criteria andQtnumNotIn(List<BigDecimal> values) {
            addCriterion("QTNUM not in", values, "qtnum");
            return (Criteria) this;
        }

        public Criteria andQtnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTNUM between", value1, value2, "qtnum");
            return (Criteria) this;
        }

        public Criteria andQtnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTNUM not between", value1, value2, "qtnum");
            return (Criteria) this;
        }

        public Criteria andOldPripidIsNull() {
            addCriterion("OLD_PRIPID is null");
            return (Criteria) this;
        }

        public Criteria andOldPripidIsNotNull() {
            addCriterion("OLD_PRIPID is not null");
            return (Criteria) this;
        }

        public Criteria andOldPripidEqualTo(String value) {
            addCriterion("OLD_PRIPID =", value, "oldPripid");
            return (Criteria) this;
        }

        public Criteria andOldPripidNotEqualTo(String value) {
            addCriterion("OLD_PRIPID <>", value, "oldPripid");
            return (Criteria) this;
        }

        public Criteria andOldPripidGreaterThan(String value) {
            addCriterion("OLD_PRIPID >", value, "oldPripid");
            return (Criteria) this;
        }

        public Criteria andOldPripidGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_PRIPID >=", value, "oldPripid");
            return (Criteria) this;
        }

        public Criteria andOldPripidLessThan(String value) {
            addCriterion("OLD_PRIPID <", value, "oldPripid");
            return (Criteria) this;
        }

        public Criteria andOldPripidLessThanOrEqualTo(String value) {
            addCriterion("OLD_PRIPID <=", value, "oldPripid");
            return (Criteria) this;
        }

        public Criteria andOldPripidLike(String value) {
            addCriterion("OLD_PRIPID like", value, "oldPripid");
            return (Criteria) this;
        }

        public Criteria andOldPripidNotLike(String value) {
            addCriterion("OLD_PRIPID not like", value, "oldPripid");
            return (Criteria) this;
        }

        public Criteria andOldPripidIn(List<String> values) {
            addCriterion("OLD_PRIPID in", values, "oldPripid");
            return (Criteria) this;
        }

        public Criteria andOldPripidNotIn(List<String> values) {
            addCriterion("OLD_PRIPID not in", values, "oldPripid");
            return (Criteria) this;
        }

        public Criteria andOldPripidBetween(String value1, String value2) {
            addCriterion("OLD_PRIPID between", value1, value2, "oldPripid");
            return (Criteria) this;
        }

        public Criteria andOldPripidNotBetween(String value1, String value2) {
            addCriterion("OLD_PRIPID not between", value1, value2, "oldPripid");
            return (Criteria) this;
        }

        public Criteria andIfblIsNull() {
            addCriterion("IFBL is null");
            return (Criteria) this;
        }

        public Criteria andIfblIsNotNull() {
            addCriterion("IFBL is not null");
            return (Criteria) this;
        }

        public Criteria andIfblEqualTo(String value) {
            addCriterion("IFBL =", value, "ifbl");
            return (Criteria) this;
        }

        public Criteria andIfblNotEqualTo(String value) {
            addCriterion("IFBL <>", value, "ifbl");
            return (Criteria) this;
        }

        public Criteria andIfblGreaterThan(String value) {
            addCriterion("IFBL >", value, "ifbl");
            return (Criteria) this;
        }

        public Criteria andIfblGreaterThanOrEqualTo(String value) {
            addCriterion("IFBL >=", value, "ifbl");
            return (Criteria) this;
        }

        public Criteria andIfblLessThan(String value) {
            addCriterion("IFBL <", value, "ifbl");
            return (Criteria) this;
        }

        public Criteria andIfblLessThanOrEqualTo(String value) {
            addCriterion("IFBL <=", value, "ifbl");
            return (Criteria) this;
        }

        public Criteria andIfblLike(String value) {
            addCriterion("IFBL like", value, "ifbl");
            return (Criteria) this;
        }

        public Criteria andIfblNotLike(String value) {
            addCriterion("IFBL not like", value, "ifbl");
            return (Criteria) this;
        }

        public Criteria andIfblIn(List<String> values) {
            addCriterion("IFBL in", values, "ifbl");
            return (Criteria) this;
        }

        public Criteria andIfblNotIn(List<String> values) {
            addCriterion("IFBL not in", values, "ifbl");
            return (Criteria) this;
        }

        public Criteria andIfblBetween(String value1, String value2) {
            addCriterion("IFBL between", value1, value2, "ifbl");
            return (Criteria) this;
        }

        public Criteria andIfblNotBetween(String value1, String value2) {
            addCriterion("IFBL not between", value1, value2, "ifbl");
            return (Criteria) this;
        }

        public Criteria andWzflbsIsNull() {
            addCriterion("WZFLBS is null");
            return (Criteria) this;
        }

        public Criteria andWzflbsIsNotNull() {
            addCriterion("WZFLBS is not null");
            return (Criteria) this;
        }

        public Criteria andWzflbsEqualTo(String value) {
            addCriterion("WZFLBS =", value, "wzflbs");
            return (Criteria) this;
        }

        public Criteria andWzflbsNotEqualTo(String value) {
            addCriterion("WZFLBS <>", value, "wzflbs");
            return (Criteria) this;
        }

        public Criteria andWzflbsGreaterThan(String value) {
            addCriterion("WZFLBS >", value, "wzflbs");
            return (Criteria) this;
        }

        public Criteria andWzflbsGreaterThanOrEqualTo(String value) {
            addCriterion("WZFLBS >=", value, "wzflbs");
            return (Criteria) this;
        }

        public Criteria andWzflbsLessThan(String value) {
            addCriterion("WZFLBS <", value, "wzflbs");
            return (Criteria) this;
        }

        public Criteria andWzflbsLessThanOrEqualTo(String value) {
            addCriterion("WZFLBS <=", value, "wzflbs");
            return (Criteria) this;
        }

        public Criteria andWzflbsLike(String value) {
            addCriterion("WZFLBS like", value, "wzflbs");
            return (Criteria) this;
        }

        public Criteria andWzflbsNotLike(String value) {
            addCriterion("WZFLBS not like", value, "wzflbs");
            return (Criteria) this;
        }

        public Criteria andWzflbsIn(List<String> values) {
            addCriterion("WZFLBS in", values, "wzflbs");
            return (Criteria) this;
        }

        public Criteria andWzflbsNotIn(List<String> values) {
            addCriterion("WZFLBS not in", values, "wzflbs");
            return (Criteria) this;
        }

        public Criteria andWzflbsBetween(String value1, String value2) {
            addCriterion("WZFLBS between", value1, value2, "wzflbs");
            return (Criteria) this;
        }

        public Criteria andWzflbsNotBetween(String value1, String value2) {
            addCriterion("WZFLBS not between", value1, value2, "wzflbs");
            return (Criteria) this;
        }

        public Criteria andProlocIsNull() {
            addCriterion("PROLOC is null");
            return (Criteria) this;
        }

        public Criteria andProlocIsNotNull() {
            addCriterion("PROLOC is not null");
            return (Criteria) this;
        }

        public Criteria andProlocEqualTo(String value) {
            addCriterion("PROLOC =", value, "proloc");
            return (Criteria) this;
        }

        public Criteria andProlocNotEqualTo(String value) {
            addCriterion("PROLOC <>", value, "proloc");
            return (Criteria) this;
        }

        public Criteria andProlocGreaterThan(String value) {
            addCriterion("PROLOC >", value, "proloc");
            return (Criteria) this;
        }

        public Criteria andProlocGreaterThanOrEqualTo(String value) {
            addCriterion("PROLOC >=", value, "proloc");
            return (Criteria) this;
        }

        public Criteria andProlocLessThan(String value) {
            addCriterion("PROLOC <", value, "proloc");
            return (Criteria) this;
        }

        public Criteria andProlocLessThanOrEqualTo(String value) {
            addCriterion("PROLOC <=", value, "proloc");
            return (Criteria) this;
        }

        public Criteria andProlocLike(String value) {
            addCriterion("PROLOC like", value, "proloc");
            return (Criteria) this;
        }

        public Criteria andProlocNotLike(String value) {
            addCriterion("PROLOC not like", value, "proloc");
            return (Criteria) this;
        }

        public Criteria andProlocIn(List<String> values) {
            addCriterion("PROLOC in", values, "proloc");
            return (Criteria) this;
        }

        public Criteria andProlocNotIn(List<String> values) {
            addCriterion("PROLOC not in", values, "proloc");
            return (Criteria) this;
        }

        public Criteria andProlocBetween(String value1, String value2) {
            addCriterion("PROLOC between", value1, value2, "proloc");
            return (Criteria) this;
        }

        public Criteria andProlocNotBetween(String value1, String value2) {
            addCriterion("PROLOC not between", value1, value2, "proloc");
            return (Criteria) this;
        }

        public Criteria andPaprovinceIsNull() {
            addCriterion("PAPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andPaprovinceIsNotNull() {
            addCriterion("PAPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andPaprovinceEqualTo(String value) {
            addCriterion("PAPROVINCE =", value, "paprovince");
            return (Criteria) this;
        }

        public Criteria andPaprovinceNotEqualTo(String value) {
            addCriterion("PAPROVINCE <>", value, "paprovince");
            return (Criteria) this;
        }

        public Criteria andPaprovinceGreaterThan(String value) {
            addCriterion("PAPROVINCE >", value, "paprovince");
            return (Criteria) this;
        }

        public Criteria andPaprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("PAPROVINCE >=", value, "paprovince");
            return (Criteria) this;
        }

        public Criteria andPaprovinceLessThan(String value) {
            addCriterion("PAPROVINCE <", value, "paprovince");
            return (Criteria) this;
        }

        public Criteria andPaprovinceLessThanOrEqualTo(String value) {
            addCriterion("PAPROVINCE <=", value, "paprovince");
            return (Criteria) this;
        }

        public Criteria andPaprovinceLike(String value) {
            addCriterion("PAPROVINCE like", value, "paprovince");
            return (Criteria) this;
        }

        public Criteria andPaprovinceNotLike(String value) {
            addCriterion("PAPROVINCE not like", value, "paprovince");
            return (Criteria) this;
        }

        public Criteria andPaprovinceIn(List<String> values) {
            addCriterion("PAPROVINCE in", values, "paprovince");
            return (Criteria) this;
        }

        public Criteria andPaprovinceNotIn(List<String> values) {
            addCriterion("PAPROVINCE not in", values, "paprovince");
            return (Criteria) this;
        }

        public Criteria andPaprovinceBetween(String value1, String value2) {
            addCriterion("PAPROVINCE between", value1, value2, "paprovince");
            return (Criteria) this;
        }

        public Criteria andPaprovinceNotBetween(String value1, String value2) {
            addCriterion("PAPROVINCE not between", value1, value2, "paprovince");
            return (Criteria) this;
        }

        public Criteria andPacityIsNull() {
            addCriterion("PACITY is null");
            return (Criteria) this;
        }

        public Criteria andPacityIsNotNull() {
            addCriterion("PACITY is not null");
            return (Criteria) this;
        }

        public Criteria andPacityEqualTo(String value) {
            addCriterion("PACITY =", value, "pacity");
            return (Criteria) this;
        }

        public Criteria andPacityNotEqualTo(String value) {
            addCriterion("PACITY <>", value, "pacity");
            return (Criteria) this;
        }

        public Criteria andPacityGreaterThan(String value) {
            addCriterion("PACITY >", value, "pacity");
            return (Criteria) this;
        }

        public Criteria andPacityGreaterThanOrEqualTo(String value) {
            addCriterion("PACITY >=", value, "pacity");
            return (Criteria) this;
        }

        public Criteria andPacityLessThan(String value) {
            addCriterion("PACITY <", value, "pacity");
            return (Criteria) this;
        }

        public Criteria andPacityLessThanOrEqualTo(String value) {
            addCriterion("PACITY <=", value, "pacity");
            return (Criteria) this;
        }

        public Criteria andPacityLike(String value) {
            addCriterion("PACITY like", value, "pacity");
            return (Criteria) this;
        }

        public Criteria andPacityNotLike(String value) {
            addCriterion("PACITY not like", value, "pacity");
            return (Criteria) this;
        }

        public Criteria andPacityIn(List<String> values) {
            addCriterion("PACITY in", values, "pacity");
            return (Criteria) this;
        }

        public Criteria andPacityNotIn(List<String> values) {
            addCriterion("PACITY not in", values, "pacity");
            return (Criteria) this;
        }

        public Criteria andPacityBetween(String value1, String value2) {
            addCriterion("PACITY between", value1, value2, "pacity");
            return (Criteria) this;
        }

        public Criteria andPacityNotBetween(String value1, String value2) {
            addCriterion("PACITY not between", value1, value2, "pacity");
            return (Criteria) this;
        }

        public Criteria andPacountyIsNull() {
            addCriterion("PACOUNTY is null");
            return (Criteria) this;
        }

        public Criteria andPacountyIsNotNull() {
            addCriterion("PACOUNTY is not null");
            return (Criteria) this;
        }

        public Criteria andPacountyEqualTo(String value) {
            addCriterion("PACOUNTY =", value, "pacounty");
            return (Criteria) this;
        }

        public Criteria andPacountyNotEqualTo(String value) {
            addCriterion("PACOUNTY <>", value, "pacounty");
            return (Criteria) this;
        }

        public Criteria andPacountyGreaterThan(String value) {
            addCriterion("PACOUNTY >", value, "pacounty");
            return (Criteria) this;
        }

        public Criteria andPacountyGreaterThanOrEqualTo(String value) {
            addCriterion("PACOUNTY >=", value, "pacounty");
            return (Criteria) this;
        }

        public Criteria andPacountyLessThan(String value) {
            addCriterion("PACOUNTY <", value, "pacounty");
            return (Criteria) this;
        }

        public Criteria andPacountyLessThanOrEqualTo(String value) {
            addCriterion("PACOUNTY <=", value, "pacounty");
            return (Criteria) this;
        }

        public Criteria andPacountyLike(String value) {
            addCriterion("PACOUNTY like", value, "pacounty");
            return (Criteria) this;
        }

        public Criteria andPacountyNotLike(String value) {
            addCriterion("PACOUNTY not like", value, "pacounty");
            return (Criteria) this;
        }

        public Criteria andPacountyIn(List<String> values) {
            addCriterion("PACOUNTY in", values, "pacounty");
            return (Criteria) this;
        }

        public Criteria andPacountyNotIn(List<String> values) {
            addCriterion("PACOUNTY not in", values, "pacounty");
            return (Criteria) this;
        }

        public Criteria andPacountyBetween(String value1, String value2) {
            addCriterion("PACOUNTY between", value1, value2, "pacounty");
            return (Criteria) this;
        }

        public Criteria andPacountyNotBetween(String value1, String value2) {
            addCriterion("PACOUNTY not between", value1, value2, "pacounty");
            return (Criteria) this;
        }

        public Criteria andPastreetIsNull() {
            addCriterion("PASTREET is null");
            return (Criteria) this;
        }

        public Criteria andPastreetIsNotNull() {
            addCriterion("PASTREET is not null");
            return (Criteria) this;
        }

        public Criteria andPastreetEqualTo(String value) {
            addCriterion("PASTREET =", value, "pastreet");
            return (Criteria) this;
        }

        public Criteria andPastreetNotEqualTo(String value) {
            addCriterion("PASTREET <>", value, "pastreet");
            return (Criteria) this;
        }

        public Criteria andPastreetGreaterThan(String value) {
            addCriterion("PASTREET >", value, "pastreet");
            return (Criteria) this;
        }

        public Criteria andPastreetGreaterThanOrEqualTo(String value) {
            addCriterion("PASTREET >=", value, "pastreet");
            return (Criteria) this;
        }

        public Criteria andPastreetLessThan(String value) {
            addCriterion("PASTREET <", value, "pastreet");
            return (Criteria) this;
        }

        public Criteria andPastreetLessThanOrEqualTo(String value) {
            addCriterion("PASTREET <=", value, "pastreet");
            return (Criteria) this;
        }

        public Criteria andPastreetLike(String value) {
            addCriterion("PASTREET like", value, "pastreet");
            return (Criteria) this;
        }

        public Criteria andPastreetNotLike(String value) {
            addCriterion("PASTREET not like", value, "pastreet");
            return (Criteria) this;
        }

        public Criteria andPastreetIn(List<String> values) {
            addCriterion("PASTREET in", values, "pastreet");
            return (Criteria) this;
        }

        public Criteria andPastreetNotIn(List<String> values) {
            addCriterion("PASTREET not in", values, "pastreet");
            return (Criteria) this;
        }

        public Criteria andPastreetBetween(String value1, String value2) {
            addCriterion("PASTREET between", value1, value2, "pastreet");
            return (Criteria) this;
        }

        public Criteria andPastreetNotBetween(String value1, String value2) {
            addCriterion("PASTREET not between", value1, value2, "pastreet");
            return (Criteria) this;
        }

        public Criteria andParoadIsNull() {
            addCriterion("PAROAD is null");
            return (Criteria) this;
        }

        public Criteria andParoadIsNotNull() {
            addCriterion("PAROAD is not null");
            return (Criteria) this;
        }

        public Criteria andParoadEqualTo(String value) {
            addCriterion("PAROAD =", value, "paroad");
            return (Criteria) this;
        }

        public Criteria andParoadNotEqualTo(String value) {
            addCriterion("PAROAD <>", value, "paroad");
            return (Criteria) this;
        }

        public Criteria andParoadGreaterThan(String value) {
            addCriterion("PAROAD >", value, "paroad");
            return (Criteria) this;
        }

        public Criteria andParoadGreaterThanOrEqualTo(String value) {
            addCriterion("PAROAD >=", value, "paroad");
            return (Criteria) this;
        }

        public Criteria andParoadLessThan(String value) {
            addCriterion("PAROAD <", value, "paroad");
            return (Criteria) this;
        }

        public Criteria andParoadLessThanOrEqualTo(String value) {
            addCriterion("PAROAD <=", value, "paroad");
            return (Criteria) this;
        }

        public Criteria andParoadLike(String value) {
            addCriterion("PAROAD like", value, "paroad");
            return (Criteria) this;
        }

        public Criteria andParoadNotLike(String value) {
            addCriterion("PAROAD not like", value, "paroad");
            return (Criteria) this;
        }

        public Criteria andParoadIn(List<String> values) {
            addCriterion("PAROAD in", values, "paroad");
            return (Criteria) this;
        }

        public Criteria andParoadNotIn(List<String> values) {
            addCriterion("PAROAD not in", values, "paroad");
            return (Criteria) this;
        }

        public Criteria andParoadBetween(String value1, String value2) {
            addCriterion("PAROAD between", value1, value2, "paroad");
            return (Criteria) this;
        }

        public Criteria andParoadNotBetween(String value1, String value2) {
            addCriterion("PAROAD not between", value1, value2, "paroad");
            return (Criteria) this;
        }

        public Criteria andPadoorplateIsNull() {
            addCriterion("PADOORPLATE is null");
            return (Criteria) this;
        }

        public Criteria andPadoorplateIsNotNull() {
            addCriterion("PADOORPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andPadoorplateEqualTo(String value) {
            addCriterion("PADOORPLATE =", value, "padoorplate");
            return (Criteria) this;
        }

        public Criteria andPadoorplateNotEqualTo(String value) {
            addCriterion("PADOORPLATE <>", value, "padoorplate");
            return (Criteria) this;
        }

        public Criteria andPadoorplateGreaterThan(String value) {
            addCriterion("PADOORPLATE >", value, "padoorplate");
            return (Criteria) this;
        }

        public Criteria andPadoorplateGreaterThanOrEqualTo(String value) {
            addCriterion("PADOORPLATE >=", value, "padoorplate");
            return (Criteria) this;
        }

        public Criteria andPadoorplateLessThan(String value) {
            addCriterion("PADOORPLATE <", value, "padoorplate");
            return (Criteria) this;
        }

        public Criteria andPadoorplateLessThanOrEqualTo(String value) {
            addCriterion("PADOORPLATE <=", value, "padoorplate");
            return (Criteria) this;
        }

        public Criteria andPadoorplateLike(String value) {
            addCriterion("PADOORPLATE like", value, "padoorplate");
            return (Criteria) this;
        }

        public Criteria andPadoorplateNotLike(String value) {
            addCriterion("PADOORPLATE not like", value, "padoorplate");
            return (Criteria) this;
        }

        public Criteria andPadoorplateIn(List<String> values) {
            addCriterion("PADOORPLATE in", values, "padoorplate");
            return (Criteria) this;
        }

        public Criteria andPadoorplateNotIn(List<String> values) {
            addCriterion("PADOORPLATE not in", values, "padoorplate");
            return (Criteria) this;
        }

        public Criteria andPadoorplateBetween(String value1, String value2) {
            addCriterion("PADOORPLATE between", value1, value2, "padoorplate");
            return (Criteria) this;
        }

        public Criteria andPadoorplateNotBetween(String value1, String value2) {
            addCriterion("PADOORPLATE not between", value1, value2, "padoorplate");
            return (Criteria) this;
        }

        public Criteria andUniscidIsNull() {
            addCriterion("UNISCID is null");
            return (Criteria) this;
        }

        public Criteria andUniscidIsNotNull() {
            addCriterion("UNISCID is not null");
            return (Criteria) this;
        }

        public Criteria andUniscidEqualTo(String value) {
            addCriterion("UNISCID =", value, "uniscid");
            return (Criteria) this;
        }

        public Criteria andUniscidNotEqualTo(String value) {
            addCriterion("UNISCID <>", value, "uniscid");
            return (Criteria) this;
        }

        public Criteria andUniscidGreaterThan(String value) {
            addCriterion("UNISCID >", value, "uniscid");
            return (Criteria) this;
        }

        public Criteria andUniscidGreaterThanOrEqualTo(String value) {
            addCriterion("UNISCID >=", value, "uniscid");
            return (Criteria) this;
        }

        public Criteria andUniscidLessThan(String value) {
            addCriterion("UNISCID <", value, "uniscid");
            return (Criteria) this;
        }

        public Criteria andUniscidLessThanOrEqualTo(String value) {
            addCriterion("UNISCID <=", value, "uniscid");
            return (Criteria) this;
        }

        public Criteria andUniscidLike(String value) {
            addCriterion("UNISCID like", value, "uniscid");
            return (Criteria) this;
        }

        public Criteria andUniscidNotLike(String value) {
            addCriterion("UNISCID not like", value, "uniscid");
            return (Criteria) this;
        }

        public Criteria andUniscidIn(List<String> values) {
            addCriterion("UNISCID in", values, "uniscid");
            return (Criteria) this;
        }

        public Criteria andUniscidNotIn(List<String> values) {
            addCriterion("UNISCID not in", values, "uniscid");
            return (Criteria) this;
        }

        public Criteria andUniscidBetween(String value1, String value2) {
            addCriterion("UNISCID between", value1, value2, "uniscid");
            return (Criteria) this;
        }

        public Criteria andUniscidNotBetween(String value1, String value2) {
            addCriterion("UNISCID not between", value1, value2, "uniscid");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodIsNull() {
            addCriterion("CALCULATIONMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodIsNotNull() {
            addCriterion("CALCULATIONMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodEqualTo(String value) {
            addCriterion("CALCULATIONMETHOD =", value, "calculationmethod");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodNotEqualTo(String value) {
            addCriterion("CALCULATIONMETHOD <>", value, "calculationmethod");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodGreaterThan(String value) {
            addCriterion("CALCULATIONMETHOD >", value, "calculationmethod");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodGreaterThanOrEqualTo(String value) {
            addCriterion("CALCULATIONMETHOD >=", value, "calculationmethod");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodLessThan(String value) {
            addCriterion("CALCULATIONMETHOD <", value, "calculationmethod");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodLessThanOrEqualTo(String value) {
            addCriterion("CALCULATIONMETHOD <=", value, "calculationmethod");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodLike(String value) {
            addCriterion("CALCULATIONMETHOD like", value, "calculationmethod");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodNotLike(String value) {
            addCriterion("CALCULATIONMETHOD not like", value, "calculationmethod");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodIn(List<String> values) {
            addCriterion("CALCULATIONMETHOD in", values, "calculationmethod");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodNotIn(List<String> values) {
            addCriterion("CALCULATIONMETHOD not in", values, "calculationmethod");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodBetween(String value1, String value2) {
            addCriterion("CALCULATIONMETHOD between", value1, value2, "calculationmethod");
            return (Criteria) this;
        }

        public Criteria andCalculationmethodNotBetween(String value1, String value2) {
            addCriterion("CALCULATIONMETHOD not between", value1, value2, "calculationmethod");
            return (Criteria) this;
        }

        public Criteria andHzstatusIsNull() {
            addCriterion("HZSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andHzstatusIsNotNull() {
            addCriterion("HZSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andHzstatusEqualTo(String value) {
            addCriterion("HZSTATUS =", value, "hzstatus");
            return (Criteria) this;
        }

        public Criteria andHzstatusNotEqualTo(String value) {
            addCriterion("HZSTATUS <>", value, "hzstatus");
            return (Criteria) this;
        }

        public Criteria andHzstatusGreaterThan(String value) {
            addCriterion("HZSTATUS >", value, "hzstatus");
            return (Criteria) this;
        }

        public Criteria andHzstatusGreaterThanOrEqualTo(String value) {
            addCriterion("HZSTATUS >=", value, "hzstatus");
            return (Criteria) this;
        }

        public Criteria andHzstatusLessThan(String value) {
            addCriterion("HZSTATUS <", value, "hzstatus");
            return (Criteria) this;
        }

        public Criteria andHzstatusLessThanOrEqualTo(String value) {
            addCriterion("HZSTATUS <=", value, "hzstatus");
            return (Criteria) this;
        }

        public Criteria andHzstatusLike(String value) {
            addCriterion("HZSTATUS like", value, "hzstatus");
            return (Criteria) this;
        }

        public Criteria andHzstatusNotLike(String value) {
            addCriterion("HZSTATUS not like", value, "hzstatus");
            return (Criteria) this;
        }

        public Criteria andHzstatusIn(List<String> values) {
            addCriterion("HZSTATUS in", values, "hzstatus");
            return (Criteria) this;
        }

        public Criteria andHzstatusNotIn(List<String> values) {
            addCriterion("HZSTATUS not in", values, "hzstatus");
            return (Criteria) this;
        }

        public Criteria andHzstatusBetween(String value1, String value2) {
            addCriterion("HZSTATUS between", value1, value2, "hzstatus");
            return (Criteria) this;
        }

        public Criteria andHzstatusNotBetween(String value1, String value2) {
            addCriterion("HZSTATUS not between", value1, value2, "hzstatus");
            return (Criteria) this;
        }

        public Criteria andHmtimeIsNull() {
            addCriterion("HMTIME is null");
            return (Criteria) this;
        }

        public Criteria andHmtimeIsNotNull() {
            addCriterion("HMTIME is not null");
            return (Criteria) this;
        }

        public Criteria andHmtimeEqualTo(Date value) {
            addCriterion("HMTIME =", value, "hmtime");
            return (Criteria) this;
        }

        public Criteria andHmtimeNotEqualTo(Date value) {
            addCriterion("HMTIME <>", value, "hmtime");
            return (Criteria) this;
        }

        public Criteria andHmtimeGreaterThan(Date value) {
            addCriterion("HMTIME >", value, "hmtime");
            return (Criteria) this;
        }

        public Criteria andHmtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("HMTIME >=", value, "hmtime");
            return (Criteria) this;
        }

        public Criteria andHmtimeLessThan(Date value) {
            addCriterion("HMTIME <", value, "hmtime");
            return (Criteria) this;
        }

        public Criteria andHmtimeLessThanOrEqualTo(Date value) {
            addCriterion("HMTIME <=", value, "hmtime");
            return (Criteria) this;
        }

        public Criteria andHmtimeIn(List<Date> values) {
            addCriterion("HMTIME in", values, "hmtime");
            return (Criteria) this;
        }

        public Criteria andHmtimeNotIn(List<Date> values) {
            addCriterion("HMTIME not in", values, "hmtime");
            return (Criteria) this;
        }

        public Criteria andHmtimeBetween(Date value1, Date value2) {
            addCriterion("HMTIME between", value1, value2, "hmtime");
            return (Criteria) this;
        }

        public Criteria andHmtimeNotBetween(Date value1, Date value2) {
            addCriterion("HMTIME not between", value1, value2, "hmtime");
            return (Criteria) this;
        }

        public Criteria andForempnumIsNull() {
            addCriterion("FOREMPNUM is null");
            return (Criteria) this;
        }

        public Criteria andForempnumIsNotNull() {
            addCriterion("FOREMPNUM is not null");
            return (Criteria) this;
        }

        public Criteria andForempnumEqualTo(Integer value) {
            addCriterion("FOREMPNUM =", value, "forempnum");
            return (Criteria) this;
        }

        public Criteria andForempnumNotEqualTo(Integer value) {
            addCriterion("FOREMPNUM <>", value, "forempnum");
            return (Criteria) this;
        }

        public Criteria andForempnumGreaterThan(Integer value) {
            addCriterion("FOREMPNUM >", value, "forempnum");
            return (Criteria) this;
        }

        public Criteria andForempnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("FOREMPNUM >=", value, "forempnum");
            return (Criteria) this;
        }

        public Criteria andForempnumLessThan(Integer value) {
            addCriterion("FOREMPNUM <", value, "forempnum");
            return (Criteria) this;
        }

        public Criteria andForempnumLessThanOrEqualTo(Integer value) {
            addCriterion("FOREMPNUM <=", value, "forempnum");
            return (Criteria) this;
        }

        public Criteria andForempnumIn(List<Integer> values) {
            addCriterion("FOREMPNUM in", values, "forempnum");
            return (Criteria) this;
        }

        public Criteria andForempnumNotIn(List<Integer> values) {
            addCriterion("FOREMPNUM not in", values, "forempnum");
            return (Criteria) this;
        }

        public Criteria andForempnumBetween(Integer value1, Integer value2) {
            addCriterion("FOREMPNUM between", value1, value2, "forempnum");
            return (Criteria) this;
        }

        public Criteria andForempnumNotBetween(Integer value1, Integer value2) {
            addCriterion("FOREMPNUM not between", value1, value2, "forempnum");
            return (Criteria) this;
        }

        public Criteria andSubordIsNull() {
            addCriterion("SUBORD is null");
            return (Criteria) this;
        }

        public Criteria andSubordIsNotNull() {
            addCriterion("SUBORD is not null");
            return (Criteria) this;
        }

        public Criteria andSubordEqualTo(String value) {
            addCriterion("SUBORD =", value, "subord");
            return (Criteria) this;
        }

        public Criteria andSubordNotEqualTo(String value) {
            addCriterion("SUBORD <>", value, "subord");
            return (Criteria) this;
        }

        public Criteria andSubordGreaterThan(String value) {
            addCriterion("SUBORD >", value, "subord");
            return (Criteria) this;
        }

        public Criteria andSubordGreaterThanOrEqualTo(String value) {
            addCriterion("SUBORD >=", value, "subord");
            return (Criteria) this;
        }

        public Criteria andSubordLessThan(String value) {
            addCriterion("SUBORD <", value, "subord");
            return (Criteria) this;
        }

        public Criteria andSubordLessThanOrEqualTo(String value) {
            addCriterion("SUBORD <=", value, "subord");
            return (Criteria) this;
        }

        public Criteria andSubordLike(String value) {
            addCriterion("SUBORD like", value, "subord");
            return (Criteria) this;
        }

        public Criteria andSubordNotLike(String value) {
            addCriterion("SUBORD not like", value, "subord");
            return (Criteria) this;
        }

        public Criteria andSubordIn(List<String> values) {
            addCriterion("SUBORD in", values, "subord");
            return (Criteria) this;
        }

        public Criteria andSubordNotIn(List<String> values) {
            addCriterion("SUBORD not in", values, "subord");
            return (Criteria) this;
        }

        public Criteria andSubordBetween(String value1, String value2) {
            addCriterion("SUBORD between", value1, value2, "subord");
            return (Criteria) this;
        }

        public Criteria andSubordNotBetween(String value1, String value2) {
            addCriterion("SUBORD not between", value1, value2, "subord");
            return (Criteria) this;
        }

        public Criteria andIfsealxzIsNull() {
            addCriterion("IFSEALXZ is null");
            return (Criteria) this;
        }

        public Criteria andIfsealxzIsNotNull() {
            addCriterion("IFSEALXZ is not null");
            return (Criteria) this;
        }

        public Criteria andIfsealxzEqualTo(String value) {
            addCriterion("IFSEALXZ =", value, "ifsealxz");
            return (Criteria) this;
        }

        public Criteria andIfsealxzNotEqualTo(String value) {
            addCriterion("IFSEALXZ <>", value, "ifsealxz");
            return (Criteria) this;
        }

        public Criteria andIfsealxzGreaterThan(String value) {
            addCriterion("IFSEALXZ >", value, "ifsealxz");
            return (Criteria) this;
        }

        public Criteria andIfsealxzGreaterThanOrEqualTo(String value) {
            addCriterion("IFSEALXZ >=", value, "ifsealxz");
            return (Criteria) this;
        }

        public Criteria andIfsealxzLessThan(String value) {
            addCriterion("IFSEALXZ <", value, "ifsealxz");
            return (Criteria) this;
        }

        public Criteria andIfsealxzLessThanOrEqualTo(String value) {
            addCriterion("IFSEALXZ <=", value, "ifsealxz");
            return (Criteria) this;
        }

        public Criteria andIfsealxzLike(String value) {
            addCriterion("IFSEALXZ like", value, "ifsealxz");
            return (Criteria) this;
        }

        public Criteria andIfsealxzNotLike(String value) {
            addCriterion("IFSEALXZ not like", value, "ifsealxz");
            return (Criteria) this;
        }

        public Criteria andIfsealxzIn(List<String> values) {
            addCriterion("IFSEALXZ in", values, "ifsealxz");
            return (Criteria) this;
        }

        public Criteria andIfsealxzNotIn(List<String> values) {
            addCriterion("IFSEALXZ not in", values, "ifsealxz");
            return (Criteria) this;
        }

        public Criteria andIfsealxzBetween(String value1, String value2) {
            addCriterion("IFSEALXZ between", value1, value2, "ifsealxz");
            return (Criteria) this;
        }

        public Criteria andIfsealxzNotBetween(String value1, String value2) {
            addCriterion("IFSEALXZ not between", value1, value2, "ifsealxz");
            return (Criteria) this;
        }

        public Criteria andIfsealcwIsNull() {
            addCriterion("IFSEALCW is null");
            return (Criteria) this;
        }

        public Criteria andIfsealcwIsNotNull() {
            addCriterion("IFSEALCW is not null");
            return (Criteria) this;
        }

        public Criteria andIfsealcwEqualTo(String value) {
            addCriterion("IFSEALCW =", value, "ifsealcw");
            return (Criteria) this;
        }

        public Criteria andIfsealcwNotEqualTo(String value) {
            addCriterion("IFSEALCW <>", value, "ifsealcw");
            return (Criteria) this;
        }

        public Criteria andIfsealcwGreaterThan(String value) {
            addCriterion("IFSEALCW >", value, "ifsealcw");
            return (Criteria) this;
        }

        public Criteria andIfsealcwGreaterThanOrEqualTo(String value) {
            addCriterion("IFSEALCW >=", value, "ifsealcw");
            return (Criteria) this;
        }

        public Criteria andIfsealcwLessThan(String value) {
            addCriterion("IFSEALCW <", value, "ifsealcw");
            return (Criteria) this;
        }

        public Criteria andIfsealcwLessThanOrEqualTo(String value) {
            addCriterion("IFSEALCW <=", value, "ifsealcw");
            return (Criteria) this;
        }

        public Criteria andIfsealcwLike(String value) {
            addCriterion("IFSEALCW like", value, "ifsealcw");
            return (Criteria) this;
        }

        public Criteria andIfsealcwNotLike(String value) {
            addCriterion("IFSEALCW not like", value, "ifsealcw");
            return (Criteria) this;
        }

        public Criteria andIfsealcwIn(List<String> values) {
            addCriterion("IFSEALCW in", values, "ifsealcw");
            return (Criteria) this;
        }

        public Criteria andIfsealcwNotIn(List<String> values) {
            addCriterion("IFSEALCW not in", values, "ifsealcw");
            return (Criteria) this;
        }

        public Criteria andIfsealcwBetween(String value1, String value2) {
            addCriterion("IFSEALCW between", value1, value2, "ifsealcw");
            return (Criteria) this;
        }

        public Criteria andIfsealcwNotBetween(String value1, String value2) {
            addCriterion("IFSEALCW not between", value1, value2, "ifsealcw");
            return (Criteria) this;
        }

        public Criteria andIfsealfpIsNull() {
            addCriterion("IFSEALFP is null");
            return (Criteria) this;
        }

        public Criteria andIfsealfpIsNotNull() {
            addCriterion("IFSEALFP is not null");
            return (Criteria) this;
        }

        public Criteria andIfsealfpEqualTo(String value) {
            addCriterion("IFSEALFP =", value, "ifsealfp");
            return (Criteria) this;
        }

        public Criteria andIfsealfpNotEqualTo(String value) {
            addCriterion("IFSEALFP <>", value, "ifsealfp");
            return (Criteria) this;
        }

        public Criteria andIfsealfpGreaterThan(String value) {
            addCriterion("IFSEALFP >", value, "ifsealfp");
            return (Criteria) this;
        }

        public Criteria andIfsealfpGreaterThanOrEqualTo(String value) {
            addCriterion("IFSEALFP >=", value, "ifsealfp");
            return (Criteria) this;
        }

        public Criteria andIfsealfpLessThan(String value) {
            addCriterion("IFSEALFP <", value, "ifsealfp");
            return (Criteria) this;
        }

        public Criteria andIfsealfpLessThanOrEqualTo(String value) {
            addCriterion("IFSEALFP <=", value, "ifsealfp");
            return (Criteria) this;
        }

        public Criteria andIfsealfpLike(String value) {
            addCriterion("IFSEALFP like", value, "ifsealfp");
            return (Criteria) this;
        }

        public Criteria andIfsealfpNotLike(String value) {
            addCriterion("IFSEALFP not like", value, "ifsealfp");
            return (Criteria) this;
        }

        public Criteria andIfsealfpIn(List<String> values) {
            addCriterion("IFSEALFP in", values, "ifsealfp");
            return (Criteria) this;
        }

        public Criteria andIfsealfpNotIn(List<String> values) {
            addCriterion("IFSEALFP not in", values, "ifsealfp");
            return (Criteria) this;
        }

        public Criteria andIfsealfpBetween(String value1, String value2) {
            addCriterion("IFSEALFP between", value1, value2, "ifsealfp");
            return (Criteria) this;
        }

        public Criteria andIfsealfpNotBetween(String value1, String value2) {
            addCriterion("IFSEALFP not between", value1, value2, "ifsealfp");
            return (Criteria) this;
        }

        public Criteria andIfsealhtIsNull() {
            addCriterion("IFSEALHT is null");
            return (Criteria) this;
        }

        public Criteria andIfsealhtIsNotNull() {
            addCriterion("IFSEALHT is not null");
            return (Criteria) this;
        }

        public Criteria andIfsealhtEqualTo(String value) {
            addCriterion("IFSEALHT =", value, "ifsealht");
            return (Criteria) this;
        }

        public Criteria andIfsealhtNotEqualTo(String value) {
            addCriterion("IFSEALHT <>", value, "ifsealht");
            return (Criteria) this;
        }

        public Criteria andIfsealhtGreaterThan(String value) {
            addCriterion("IFSEALHT >", value, "ifsealht");
            return (Criteria) this;
        }

        public Criteria andIfsealhtGreaterThanOrEqualTo(String value) {
            addCriterion("IFSEALHT >=", value, "ifsealht");
            return (Criteria) this;
        }

        public Criteria andIfsealhtLessThan(String value) {
            addCriterion("IFSEALHT <", value, "ifsealht");
            return (Criteria) this;
        }

        public Criteria andIfsealhtLessThanOrEqualTo(String value) {
            addCriterion("IFSEALHT <=", value, "ifsealht");
            return (Criteria) this;
        }

        public Criteria andIfsealhtLike(String value) {
            addCriterion("IFSEALHT like", value, "ifsealht");
            return (Criteria) this;
        }

        public Criteria andIfsealhtNotLike(String value) {
            addCriterion("IFSEALHT not like", value, "ifsealht");
            return (Criteria) this;
        }

        public Criteria andIfsealhtIn(List<String> values) {
            addCriterion("IFSEALHT in", values, "ifsealht");
            return (Criteria) this;
        }

        public Criteria andIfsealhtNotIn(List<String> values) {
            addCriterion("IFSEALHT not in", values, "ifsealht");
            return (Criteria) this;
        }

        public Criteria andIfsealhtBetween(String value1, String value2) {
            addCriterion("IFSEALHT between", value1, value2, "ifsealht");
            return (Criteria) this;
        }

        public Criteria andIfsealhtNotBetween(String value1, String value2) {
            addCriterion("IFSEALHT not between", value1, value2, "ifsealht");
            return (Criteria) this;
        }

        public Criteria andIfsealywIsNull() {
            addCriterion("IFSEALYW is null");
            return (Criteria) this;
        }

        public Criteria andIfsealywIsNotNull() {
            addCriterion("IFSEALYW is not null");
            return (Criteria) this;
        }

        public Criteria andIfsealywEqualTo(String value) {
            addCriterion("IFSEALYW =", value, "ifsealyw");
            return (Criteria) this;
        }

        public Criteria andIfsealywNotEqualTo(String value) {
            addCriterion("IFSEALYW <>", value, "ifsealyw");
            return (Criteria) this;
        }

        public Criteria andIfsealywGreaterThan(String value) {
            addCriterion("IFSEALYW >", value, "ifsealyw");
            return (Criteria) this;
        }

        public Criteria andIfsealywGreaterThanOrEqualTo(String value) {
            addCriterion("IFSEALYW >=", value, "ifsealyw");
            return (Criteria) this;
        }

        public Criteria andIfsealywLessThan(String value) {
            addCriterion("IFSEALYW <", value, "ifsealyw");
            return (Criteria) this;
        }

        public Criteria andIfsealywLessThanOrEqualTo(String value) {
            addCriterion("IFSEALYW <=", value, "ifsealyw");
            return (Criteria) this;
        }

        public Criteria andIfsealywLike(String value) {
            addCriterion("IFSEALYW like", value, "ifsealyw");
            return (Criteria) this;
        }

        public Criteria andIfsealywNotLike(String value) {
            addCriterion("IFSEALYW not like", value, "ifsealyw");
            return (Criteria) this;
        }

        public Criteria andIfsealywIn(List<String> values) {
            addCriterion("IFSEALYW in", values, "ifsealyw");
            return (Criteria) this;
        }

        public Criteria andIfsealywNotIn(List<String> values) {
            addCriterion("IFSEALYW not in", values, "ifsealyw");
            return (Criteria) this;
        }

        public Criteria andIfsealywBetween(String value1, String value2) {
            addCriterion("IFSEALYW between", value1, value2, "ifsealyw");
            return (Criteria) this;
        }

        public Criteria andIfsealywNotBetween(String value1, String value2) {
            addCriterion("IFSEALYW not between", value1, value2, "ifsealyw");
            return (Criteria) this;
        }

        public Criteria andIfsealbgIsNull() {
            addCriterion("IFSEALBG is null");
            return (Criteria) this;
        }

        public Criteria andIfsealbgIsNotNull() {
            addCriterion("IFSEALBG is not null");
            return (Criteria) this;
        }

        public Criteria andIfsealbgEqualTo(String value) {
            addCriterion("IFSEALBG =", value, "ifsealbg");
            return (Criteria) this;
        }

        public Criteria andIfsealbgNotEqualTo(String value) {
            addCriterion("IFSEALBG <>", value, "ifsealbg");
            return (Criteria) this;
        }

        public Criteria andIfsealbgGreaterThan(String value) {
            addCriterion("IFSEALBG >", value, "ifsealbg");
            return (Criteria) this;
        }

        public Criteria andIfsealbgGreaterThanOrEqualTo(String value) {
            addCriterion("IFSEALBG >=", value, "ifsealbg");
            return (Criteria) this;
        }

        public Criteria andIfsealbgLessThan(String value) {
            addCriterion("IFSEALBG <", value, "ifsealbg");
            return (Criteria) this;
        }

        public Criteria andIfsealbgLessThanOrEqualTo(String value) {
            addCriterion("IFSEALBG <=", value, "ifsealbg");
            return (Criteria) this;
        }

        public Criteria andIfsealbgLike(String value) {
            addCriterion("IFSEALBG like", value, "ifsealbg");
            return (Criteria) this;
        }

        public Criteria andIfsealbgNotLike(String value) {
            addCriterion("IFSEALBG not like", value, "ifsealbg");
            return (Criteria) this;
        }

        public Criteria andIfsealbgIn(List<String> values) {
            addCriterion("IFSEALBG in", values, "ifsealbg");
            return (Criteria) this;
        }

        public Criteria andIfsealbgNotIn(List<String> values) {
            addCriterion("IFSEALBG not in", values, "ifsealbg");
            return (Criteria) this;
        }

        public Criteria andIfsealbgBetween(String value1, String value2) {
            addCriterion("IFSEALBG between", value1, value2, "ifsealbg");
            return (Criteria) this;
        }

        public Criteria andIfsealbgNotBetween(String value1, String value2) {
            addCriterion("IFSEALBG not between", value1, value2, "ifsealbg");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzIsNull() {
            addCriterion("IFELCSEALXZ is null");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzIsNotNull() {
            addCriterion("IFELCSEALXZ is not null");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzEqualTo(String value) {
            addCriterion("IFELCSEALXZ =", value, "ifelcsealxz");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzNotEqualTo(String value) {
            addCriterion("IFELCSEALXZ <>", value, "ifelcsealxz");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzGreaterThan(String value) {
            addCriterion("IFELCSEALXZ >", value, "ifelcsealxz");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzGreaterThanOrEqualTo(String value) {
            addCriterion("IFELCSEALXZ >=", value, "ifelcsealxz");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzLessThan(String value) {
            addCriterion("IFELCSEALXZ <", value, "ifelcsealxz");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzLessThanOrEqualTo(String value) {
            addCriterion("IFELCSEALXZ <=", value, "ifelcsealxz");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzLike(String value) {
            addCriterion("IFELCSEALXZ like", value, "ifelcsealxz");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzNotLike(String value) {
            addCriterion("IFELCSEALXZ not like", value, "ifelcsealxz");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzIn(List<String> values) {
            addCriterion("IFELCSEALXZ in", values, "ifelcsealxz");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzNotIn(List<String> values) {
            addCriterion("IFELCSEALXZ not in", values, "ifelcsealxz");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzBetween(String value1, String value2) {
            addCriterion("IFELCSEALXZ between", value1, value2, "ifelcsealxz");
            return (Criteria) this;
        }

        public Criteria andIfelcsealxzNotBetween(String value1, String value2) {
            addCriterion("IFELCSEALXZ not between", value1, value2, "ifelcsealxz");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpIsNull() {
            addCriterion("IFELCSEALFP is null");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpIsNotNull() {
            addCriterion("IFELCSEALFP is not null");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpEqualTo(String value) {
            addCriterion("IFELCSEALFP =", value, "ifelcsealfp");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpNotEqualTo(String value) {
            addCriterion("IFELCSEALFP <>", value, "ifelcsealfp");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpGreaterThan(String value) {
            addCriterion("IFELCSEALFP >", value, "ifelcsealfp");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpGreaterThanOrEqualTo(String value) {
            addCriterion("IFELCSEALFP >=", value, "ifelcsealfp");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpLessThan(String value) {
            addCriterion("IFELCSEALFP <", value, "ifelcsealfp");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpLessThanOrEqualTo(String value) {
            addCriterion("IFELCSEALFP <=", value, "ifelcsealfp");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpLike(String value) {
            addCriterion("IFELCSEALFP like", value, "ifelcsealfp");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpNotLike(String value) {
            addCriterion("IFELCSEALFP not like", value, "ifelcsealfp");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpIn(List<String> values) {
            addCriterion("IFELCSEALFP in", values, "ifelcsealfp");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpNotIn(List<String> values) {
            addCriterion("IFELCSEALFP not in", values, "ifelcsealfp");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpBetween(String value1, String value2) {
            addCriterion("IFELCSEALFP between", value1, value2, "ifelcsealfp");
            return (Criteria) this;
        }

        public Criteria andIfelcsealfpNotBetween(String value1, String value2) {
            addCriterion("IFELCSEALFP not between", value1, value2, "ifelcsealfp");
            return (Criteria) this;
        }

        public Criteria andTaxpayidIsNull() {
            addCriterion("TAXPAYID is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayidIsNotNull() {
            addCriterion("TAXPAYID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayidEqualTo(String value) {
            addCriterion("TAXPAYID =", value, "taxpayid");
            return (Criteria) this;
        }

        public Criteria andTaxpayidNotEqualTo(String value) {
            addCriterion("TAXPAYID <>", value, "taxpayid");
            return (Criteria) this;
        }

        public Criteria andTaxpayidGreaterThan(String value) {
            addCriterion("TAXPAYID >", value, "taxpayid");
            return (Criteria) this;
        }

        public Criteria andTaxpayidGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYID >=", value, "taxpayid");
            return (Criteria) this;
        }

        public Criteria andTaxpayidLessThan(String value) {
            addCriterion("TAXPAYID <", value, "taxpayid");
            return (Criteria) this;
        }

        public Criteria andTaxpayidLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYID <=", value, "taxpayid");
            return (Criteria) this;
        }

        public Criteria andTaxpayidLike(String value) {
            addCriterion("TAXPAYID like", value, "taxpayid");
            return (Criteria) this;
        }

        public Criteria andTaxpayidNotLike(String value) {
            addCriterion("TAXPAYID not like", value, "taxpayid");
            return (Criteria) this;
        }

        public Criteria andTaxpayidIn(List<String> values) {
            addCriterion("TAXPAYID in", values, "taxpayid");
            return (Criteria) this;
        }

        public Criteria andTaxpayidNotIn(List<String> values) {
            addCriterion("TAXPAYID not in", values, "taxpayid");
            return (Criteria) this;
        }

        public Criteria andTaxpayidBetween(String value1, String value2) {
            addCriterion("TAXPAYID between", value1, value2, "taxpayid");
            return (Criteria) this;
        }

        public Criteria andTaxpayidNotBetween(String value1, String value2) {
            addCriterion("TAXPAYID not between", value1, value2, "taxpayid");
            return (Criteria) this;
        }

        public Criteria andSiregnoIsNull() {
            addCriterion("SIREGNO is null");
            return (Criteria) this;
        }

        public Criteria andSiregnoIsNotNull() {
            addCriterion("SIREGNO is not null");
            return (Criteria) this;
        }

        public Criteria andSiregnoEqualTo(String value) {
            addCriterion("SIREGNO =", value, "siregno");
            return (Criteria) this;
        }

        public Criteria andSiregnoNotEqualTo(String value) {
            addCriterion("SIREGNO <>", value, "siregno");
            return (Criteria) this;
        }

        public Criteria andSiregnoGreaterThan(String value) {
            addCriterion("SIREGNO >", value, "siregno");
            return (Criteria) this;
        }

        public Criteria andSiregnoGreaterThanOrEqualTo(String value) {
            addCriterion("SIREGNO >=", value, "siregno");
            return (Criteria) this;
        }

        public Criteria andSiregnoLessThan(String value) {
            addCriterion("SIREGNO <", value, "siregno");
            return (Criteria) this;
        }

        public Criteria andSiregnoLessThanOrEqualTo(String value) {
            addCriterion("SIREGNO <=", value, "siregno");
            return (Criteria) this;
        }

        public Criteria andSiregnoLike(String value) {
            addCriterion("SIREGNO like", value, "siregno");
            return (Criteria) this;
        }

        public Criteria andSiregnoNotLike(String value) {
            addCriterion("SIREGNO not like", value, "siregno");
            return (Criteria) this;
        }

        public Criteria andSiregnoIn(List<String> values) {
            addCriterion("SIREGNO in", values, "siregno");
            return (Criteria) this;
        }

        public Criteria andSiregnoNotIn(List<String> values) {
            addCriterion("SIREGNO not in", values, "siregno");
            return (Criteria) this;
        }

        public Criteria andSiregnoBetween(String value1, String value2) {
            addCriterion("SIREGNO between", value1, value2, "siregno");
            return (Criteria) this;
        }

        public Criteria andSiregnoNotBetween(String value1, String value2) {
            addCriterion("SIREGNO not between", value1, value2, "siregno");
            return (Criteria) this;
        }

        public Criteria andLocalareaIsNull() {
            addCriterion("LOCALAREA is null");
            return (Criteria) this;
        }

        public Criteria andLocalareaIsNotNull() {
            addCriterion("LOCALAREA is not null");
            return (Criteria) this;
        }

        public Criteria andLocalareaEqualTo(String value) {
            addCriterion("LOCALAREA =", value, "localarea");
            return (Criteria) this;
        }

        public Criteria andLocalareaNotEqualTo(String value) {
            addCriterion("LOCALAREA <>", value, "localarea");
            return (Criteria) this;
        }

        public Criteria andLocalareaGreaterThan(String value) {
            addCriterion("LOCALAREA >", value, "localarea");
            return (Criteria) this;
        }

        public Criteria andLocalareaGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALAREA >=", value, "localarea");
            return (Criteria) this;
        }

        public Criteria andLocalareaLessThan(String value) {
            addCriterion("LOCALAREA <", value, "localarea");
            return (Criteria) this;
        }

        public Criteria andLocalareaLessThanOrEqualTo(String value) {
            addCriterion("LOCALAREA <=", value, "localarea");
            return (Criteria) this;
        }

        public Criteria andLocalareaLike(String value) {
            addCriterion("LOCALAREA like", value, "localarea");
            return (Criteria) this;
        }

        public Criteria andLocalareaNotLike(String value) {
            addCriterion("LOCALAREA not like", value, "localarea");
            return (Criteria) this;
        }

        public Criteria andLocalareaIn(List<String> values) {
            addCriterion("LOCALAREA in", values, "localarea");
            return (Criteria) this;
        }

        public Criteria andLocalareaNotIn(List<String> values) {
            addCriterion("LOCALAREA not in", values, "localarea");
            return (Criteria) this;
        }

        public Criteria andLocalareaBetween(String value1, String value2) {
            addCriterion("LOCALAREA between", value1, value2, "localarea");
            return (Criteria) this;
        }

        public Criteria andLocalareaNotBetween(String value1, String value2) {
            addCriterion("LOCALAREA not between", value1, value2, "localarea");
            return (Criteria) this;
        }

        public Criteria andIfelecIsNull() {
            addCriterion("IFELEC is null");
            return (Criteria) this;
        }

        public Criteria andIfelecIsNotNull() {
            addCriterion("IFELEC is not null");
            return (Criteria) this;
        }

        public Criteria andIfelecEqualTo(String value) {
            addCriterion("IFELEC =", value, "ifelec");
            return (Criteria) this;
        }

        public Criteria andIfelecNotEqualTo(String value) {
            addCriterion("IFELEC <>", value, "ifelec");
            return (Criteria) this;
        }

        public Criteria andIfelecGreaterThan(String value) {
            addCriterion("IFELEC >", value, "ifelec");
            return (Criteria) this;
        }

        public Criteria andIfelecGreaterThanOrEqualTo(String value) {
            addCriterion("IFELEC >=", value, "ifelec");
            return (Criteria) this;
        }

        public Criteria andIfelecLessThan(String value) {
            addCriterion("IFELEC <", value, "ifelec");
            return (Criteria) this;
        }

        public Criteria andIfelecLessThanOrEqualTo(String value) {
            addCriterion("IFELEC <=", value, "ifelec");
            return (Criteria) this;
        }

        public Criteria andIfelecLike(String value) {
            addCriterion("IFELEC like", value, "ifelec");
            return (Criteria) this;
        }

        public Criteria andIfelecNotLike(String value) {
            addCriterion("IFELEC not like", value, "ifelec");
            return (Criteria) this;
        }

        public Criteria andIfelecIn(List<String> values) {
            addCriterion("IFELEC in", values, "ifelec");
            return (Criteria) this;
        }

        public Criteria andIfelecNotIn(List<String> values) {
            addCriterion("IFELEC not in", values, "ifelec");
            return (Criteria) this;
        }

        public Criteria andIfelecBetween(String value1, String value2) {
            addCriterion("IFELEC between", value1, value2, "ifelec");
            return (Criteria) this;
        }

        public Criteria andIfelecNotBetween(String value1, String value2) {
            addCriterion("IFELEC not between", value1, value2, "ifelec");
            return (Criteria) this;
        }

        public Criteria andBusscope1IsNull() {
            addCriterion("BUSSCOPE1 is null");
            return (Criteria) this;
        }

        public Criteria andBusscope1IsNotNull() {
            addCriterion("BUSSCOPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andBusscope1EqualTo(String value) {
            addCriterion("BUSSCOPE1 =", value, "busscope1");
            return (Criteria) this;
        }

        public Criteria andBusscope1NotEqualTo(String value) {
            addCriterion("BUSSCOPE1 <>", value, "busscope1");
            return (Criteria) this;
        }

        public Criteria andBusscope1GreaterThan(String value) {
            addCriterion("BUSSCOPE1 >", value, "busscope1");
            return (Criteria) this;
        }

        public Criteria andBusscope1GreaterThanOrEqualTo(String value) {
            addCriterion("BUSSCOPE1 >=", value, "busscope1");
            return (Criteria) this;
        }

        public Criteria andBusscope1LessThan(String value) {
            addCriterion("BUSSCOPE1 <", value, "busscope1");
            return (Criteria) this;
        }

        public Criteria andBusscope1LessThanOrEqualTo(String value) {
            addCriterion("BUSSCOPE1 <=", value, "busscope1");
            return (Criteria) this;
        }

        public Criteria andBusscope1Like(String value) {
            addCriterion("BUSSCOPE1 like", value, "busscope1");
            return (Criteria) this;
        }

        public Criteria andBusscope1NotLike(String value) {
            addCriterion("BUSSCOPE1 not like", value, "busscope1");
            return (Criteria) this;
        }

        public Criteria andBusscope1In(List<String> values) {
            addCriterion("BUSSCOPE1 in", values, "busscope1");
            return (Criteria) this;
        }

        public Criteria andBusscope1NotIn(List<String> values) {
            addCriterion("BUSSCOPE1 not in", values, "busscope1");
            return (Criteria) this;
        }

        public Criteria andBusscope1Between(String value1, String value2) {
            addCriterion("BUSSCOPE1 between", value1, value2, "busscope1");
            return (Criteria) this;
        }

        public Criteria andBusscope1NotBetween(String value1, String value2) {
            addCriterion("BUSSCOPE1 not between", value1, value2, "busscope1");
            return (Criteria) this;
        }

        public Criteria andBusscope2IsNull() {
            addCriterion("BUSSCOPE2 is null");
            return (Criteria) this;
        }

        public Criteria andBusscope2IsNotNull() {
            addCriterion("BUSSCOPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andBusscope2EqualTo(String value) {
            addCriterion("BUSSCOPE2 =", value, "busscope2");
            return (Criteria) this;
        }

        public Criteria andBusscope2NotEqualTo(String value) {
            addCriterion("BUSSCOPE2 <>", value, "busscope2");
            return (Criteria) this;
        }

        public Criteria andBusscope2GreaterThan(String value) {
            addCriterion("BUSSCOPE2 >", value, "busscope2");
            return (Criteria) this;
        }

        public Criteria andBusscope2GreaterThanOrEqualTo(String value) {
            addCriterion("BUSSCOPE2 >=", value, "busscope2");
            return (Criteria) this;
        }

        public Criteria andBusscope2LessThan(String value) {
            addCriterion("BUSSCOPE2 <", value, "busscope2");
            return (Criteria) this;
        }

        public Criteria andBusscope2LessThanOrEqualTo(String value) {
            addCriterion("BUSSCOPE2 <=", value, "busscope2");
            return (Criteria) this;
        }

        public Criteria andBusscope2Like(String value) {
            addCriterion("BUSSCOPE2 like", value, "busscope2");
            return (Criteria) this;
        }

        public Criteria andBusscope2NotLike(String value) {
            addCriterion("BUSSCOPE2 not like", value, "busscope2");
            return (Criteria) this;
        }

        public Criteria andBusscope2In(List<String> values) {
            addCriterion("BUSSCOPE2 in", values, "busscope2");
            return (Criteria) this;
        }

        public Criteria andBusscope2NotIn(List<String> values) {
            addCriterion("BUSSCOPE2 not in", values, "busscope2");
            return (Criteria) this;
        }

        public Criteria andBusscope2Between(String value1, String value2) {
            addCriterion("BUSSCOPE2 between", value1, value2, "busscope2");
            return (Criteria) this;
        }

        public Criteria andBusscope2NotBetween(String value1, String value2) {
            addCriterion("BUSSCOPE2 not between", value1, value2, "busscope2");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeIsNull() {
            addCriterion("DZYYZZ_APP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeIsNotNull() {
            addCriterion("DZYYZZ_APP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeEqualTo(String value) {
            addCriterion("DZYYZZ_APP_TYPE =", value, "dzyyzzAppType");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeNotEqualTo(String value) {
            addCriterion("DZYYZZ_APP_TYPE <>", value, "dzyyzzAppType");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeGreaterThan(String value) {
            addCriterion("DZYYZZ_APP_TYPE >", value, "dzyyzzAppType");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DZYYZZ_APP_TYPE >=", value, "dzyyzzAppType");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeLessThan(String value) {
            addCriterion("DZYYZZ_APP_TYPE <", value, "dzyyzzAppType");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeLessThanOrEqualTo(String value) {
            addCriterion("DZYYZZ_APP_TYPE <=", value, "dzyyzzAppType");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeLike(String value) {
            addCriterion("DZYYZZ_APP_TYPE like", value, "dzyyzzAppType");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeNotLike(String value) {
            addCriterion("DZYYZZ_APP_TYPE not like", value, "dzyyzzAppType");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeIn(List<String> values) {
            addCriterion("DZYYZZ_APP_TYPE in", values, "dzyyzzAppType");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeNotIn(List<String> values) {
            addCriterion("DZYYZZ_APP_TYPE not in", values, "dzyyzzAppType");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeBetween(String value1, String value2) {
            addCriterion("DZYYZZ_APP_TYPE between", value1, value2, "dzyyzzAppType");
            return (Criteria) this;
        }

        public Criteria andDzyyzzAppTypeNotBetween(String value1, String value2) {
            addCriterion("DZYYZZ_APP_TYPE not between", value1, value2, "dzyyzzAppType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}