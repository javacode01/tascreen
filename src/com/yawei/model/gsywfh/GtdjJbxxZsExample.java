package com.yawei.model.gsywfh;

import com.sys.utils.BeanUtils;
import com.sys.utils.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class GtdjJbxxZsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public GtdjJbxxZsExample() {
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

        public Criteria andTranameIsNull() {
            addCriterion("TRANAME is null");
            return (Criteria) this;
        }

        public Criteria andTranameIsNotNull() {
            addCriterion("TRANAME is not null");
            return (Criteria) this;
        }

        public Criteria andTranameEqualTo(String value) {
            addCriterion("TRANAME =", value, "traname");
            return (Criteria) this;
        }

        public Criteria andTranameNotEqualTo(String value) {
            addCriterion("TRANAME <>", value, "traname");
            return (Criteria) this;
        }

        public Criteria andTranameGreaterThan(String value) {
            addCriterion("TRANAME >", value, "traname");
            return (Criteria) this;
        }

        public Criteria andTranameGreaterThanOrEqualTo(String value) {
            addCriterion("TRANAME >=", value, "traname");
            return (Criteria) this;
        }

        public Criteria andTranameLessThan(String value) {
            addCriterion("TRANAME <", value, "traname");
            return (Criteria) this;
        }

        public Criteria andTranameLessThanOrEqualTo(String value) {
            addCriterion("TRANAME <=", value, "traname");
            return (Criteria) this;
        }

        public Criteria andTranameLike(String value) {
            addCriterion("TRANAME like", value, "traname");
            return (Criteria) this;
        }

        public Criteria andTranameNotLike(String value) {
            addCriterion("TRANAME not like", value, "traname");
            return (Criteria) this;
        }

        public Criteria andTranameIn(List<String> values) {
            addCriterion("TRANAME in", values, "traname");
            return (Criteria) this;
        }

        public Criteria andTranameNotIn(List<String> values) {
            addCriterion("TRANAME not in", values, "traname");
            return (Criteria) this;
        }

        public Criteria andTranameBetween(String value1, String value2) {
            addCriterion("TRANAME between", value1, value2, "traname");
            return (Criteria) this;
        }

        public Criteria andTranameNotBetween(String value1, String value2) {
            addCriterion("TRANAME not between", value1, value2, "traname");
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

        public Criteria andBlictypeIsNull() {
            addCriterion("BLICTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBlictypeIsNotNull() {
            addCriterion("BLICTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBlictypeEqualTo(String value) {
            addCriterion("BLICTYPE =", value, "blictype");
            return (Criteria) this;
        }

        public Criteria andBlictypeNotEqualTo(String value) {
            addCriterion("BLICTYPE <>", value, "blictype");
            return (Criteria) this;
        }

        public Criteria andBlictypeGreaterThan(String value) {
            addCriterion("BLICTYPE >", value, "blictype");
            return (Criteria) this;
        }

        public Criteria andBlictypeGreaterThanOrEqualTo(String value) {
            addCriterion("BLICTYPE >=", value, "blictype");
            return (Criteria) this;
        }

        public Criteria andBlictypeLessThan(String value) {
            addCriterion("BLICTYPE <", value, "blictype");
            return (Criteria) this;
        }

        public Criteria andBlictypeLessThanOrEqualTo(String value) {
            addCriterion("BLICTYPE <=", value, "blictype");
            return (Criteria) this;
        }

        public Criteria andBlictypeLike(String value) {
            addCriterion("BLICTYPE like", value, "blictype");
            return (Criteria) this;
        }

        public Criteria andBlictypeNotLike(String value) {
            addCriterion("BLICTYPE not like", value, "blictype");
            return (Criteria) this;
        }

        public Criteria andBlictypeIn(List<String> values) {
            addCriterion("BLICTYPE in", values, "blictype");
            return (Criteria) this;
        }

        public Criteria andBlictypeNotIn(List<String> values) {
            addCriterion("BLICTYPE not in", values, "blictype");
            return (Criteria) this;
        }

        public Criteria andBlictypeBetween(String value1, String value2) {
            addCriterion("BLICTYPE between", value1, value2, "blictype");
            return (Criteria) this;
        }

        public Criteria andBlictypeNotBetween(String value1, String value2) {
            addCriterion("BLICTYPE not between", value1, value2, "blictype");
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

        public Criteria andCapamIsNull() {
            addCriterion("CAPAM is null");
            return (Criteria) this;
        }

        public Criteria andCapamIsNotNull() {
            addCriterion("CAPAM is not null");
            return (Criteria) this;
        }

        public Criteria andCapamEqualTo(BigDecimal value) {
            addCriterion("CAPAM =", value, "capam");
            return (Criteria) this;
        }

        public Criteria andCapamNotEqualTo(BigDecimal value) {
            addCriterion("CAPAM <>", value, "capam");
            return (Criteria) this;
        }

        public Criteria andCapamGreaterThan(BigDecimal value) {
            addCriterion("CAPAM >", value, "capam");
            return (Criteria) this;
        }

        public Criteria andCapamGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPAM >=", value, "capam");
            return (Criteria) this;
        }

        public Criteria andCapamLessThan(BigDecimal value) {
            addCriterion("CAPAM <", value, "capam");
            return (Criteria) this;
        }

        public Criteria andCapamLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPAM <=", value, "capam");
            return (Criteria) this;
        }

        public Criteria andCapamIn(List<BigDecimal> values) {
            addCriterion("CAPAM in", values, "capam");
            return (Criteria) this;
        }

        public Criteria andCapamNotIn(List<BigDecimal> values) {
            addCriterion("CAPAM not in", values, "capam");
            return (Criteria) this;
        }

        public Criteria andCapamBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPAM between", value1, value2, "capam");
            return (Criteria) this;
        }

        public Criteria andCapamNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPAM not between", value1, value2, "capam");
            return (Criteria) this;
        }

        public Criteria andCompformIsNull() {
            addCriterion("COMPFORM is null");
            return (Criteria) this;
        }

        public Criteria andCompformIsNotNull() {
            addCriterion("COMPFORM is not null");
            return (Criteria) this;
        }

        public Criteria andCompformEqualTo(String value) {
            addCriterion("COMPFORM =", value, "compform");
            return (Criteria) this;
        }

        public Criteria andCompformNotEqualTo(String value) {
            addCriterion("COMPFORM <>", value, "compform");
            return (Criteria) this;
        }

        public Criteria andCompformGreaterThan(String value) {
            addCriterion("COMPFORM >", value, "compform");
            return (Criteria) this;
        }

        public Criteria andCompformGreaterThanOrEqualTo(String value) {
            addCriterion("COMPFORM >=", value, "compform");
            return (Criteria) this;
        }

        public Criteria andCompformLessThan(String value) {
            addCriterion("COMPFORM <", value, "compform");
            return (Criteria) this;
        }

        public Criteria andCompformLessThanOrEqualTo(String value) {
            addCriterion("COMPFORM <=", value, "compform");
            return (Criteria) this;
        }

        public Criteria andCompformLike(String value) {
            addCriterion("COMPFORM like", value, "compform");
            return (Criteria) this;
        }

        public Criteria andCompformNotLike(String value) {
            addCriterion("COMPFORM not like", value, "compform");
            return (Criteria) this;
        }

        public Criteria andCompformIn(List<String> values) {
            addCriterion("COMPFORM in", values, "compform");
            return (Criteria) this;
        }

        public Criteria andCompformNotIn(List<String> values) {
            addCriterion("COMPFORM not in", values, "compform");
            return (Criteria) this;
        }

        public Criteria andCompformBetween(String value1, String value2) {
            addCriterion("COMPFORM between", value1, value2, "compform");
            return (Criteria) this;
        }

        public Criteria andCompformNotBetween(String value1, String value2) {
            addCriterion("COMPFORM not between", value1, value2, "compform");
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

        public Criteria andBusscoandformIsNull() {
            addCriterion("BUSSCOANDFORM is null");
            return (Criteria) this;
        }

        public Criteria andBusscoandformIsNotNull() {
            addCriterion("BUSSCOANDFORM is not null");
            return (Criteria) this;
        }

        public Criteria andBusscoandformEqualTo(String value) {
            addCriterion("BUSSCOANDFORM =", value, "busscoandform");
            return (Criteria) this;
        }

        public Criteria andBusscoandformNotEqualTo(String value) {
            addCriterion("BUSSCOANDFORM <>", value, "busscoandform");
            return (Criteria) this;
        }

        public Criteria andBusscoandformGreaterThan(String value) {
            addCriterion("BUSSCOANDFORM >", value, "busscoandform");
            return (Criteria) this;
        }

        public Criteria andBusscoandformGreaterThanOrEqualTo(String value) {
            addCriterion("BUSSCOANDFORM >=", value, "busscoandform");
            return (Criteria) this;
        }

        public Criteria andBusscoandformLessThan(String value) {
            addCriterion("BUSSCOANDFORM <", value, "busscoandform");
            return (Criteria) this;
        }

        public Criteria andBusscoandformLessThanOrEqualTo(String value) {
            addCriterion("BUSSCOANDFORM <=", value, "busscoandform");
            return (Criteria) this;
        }

        public Criteria andBusscoandformLike(String value) {
            addCriterion("BUSSCOANDFORM like", value, "busscoandform");
            return (Criteria) this;
        }

        public Criteria andBusscoandformNotLike(String value) {
            addCriterion("BUSSCOANDFORM not like", value, "busscoandform");
            return (Criteria) this;
        }

        public Criteria andBusscoandformIn(List<String> values) {
            addCriterion("BUSSCOANDFORM in", values, "busscoandform");
            return (Criteria) this;
        }

        public Criteria andBusscoandformNotIn(List<String> values) {
            addCriterion("BUSSCOANDFORM not in", values, "busscoandform");
            return (Criteria) this;
        }

        public Criteria andBusscoandformBetween(String value1, String value2) {
            addCriterion("BUSSCOANDFORM between", value1, value2, "busscoandform");
            return (Criteria) this;
        }

        public Criteria andBusscoandformNotBetween(String value1, String value2) {
            addCriterion("BUSSCOANDFORM not between", value1, value2, "busscoandform");
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

        public Criteria andOpelocdistrictIsNull() {
            addCriterion("OPELOCDISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andOpelocdistrictIsNotNull() {
            addCriterion("OPELOCDISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andOpelocdistrictEqualTo(String value) {
            addCriterion("OPELOCDISTRICT =", value, "opelocdistrict");
            return (Criteria) this;
        }

        public Criteria andOpelocdistrictNotEqualTo(String value) {
            addCriterion("OPELOCDISTRICT <>", value, "opelocdistrict");
            return (Criteria) this;
        }

        public Criteria andOpelocdistrictGreaterThan(String value) {
            addCriterion("OPELOCDISTRICT >", value, "opelocdistrict");
            return (Criteria) this;
        }

        public Criteria andOpelocdistrictGreaterThanOrEqualTo(String value) {
            addCriterion("OPELOCDISTRICT >=", value, "opelocdistrict");
            return (Criteria) this;
        }

        public Criteria andOpelocdistrictLessThan(String value) {
            addCriterion("OPELOCDISTRICT <", value, "opelocdistrict");
            return (Criteria) this;
        }

        public Criteria andOpelocdistrictLessThanOrEqualTo(String value) {
            addCriterion("OPELOCDISTRICT <=", value, "opelocdistrict");
            return (Criteria) this;
        }

        public Criteria andOpelocdistrictLike(String value) {
            addCriterion("OPELOCDISTRICT like", value, "opelocdistrict");
            return (Criteria) this;
        }

        public Criteria andOpelocdistrictNotLike(String value) {
            addCriterion("OPELOCDISTRICT not like", value, "opelocdistrict");
            return (Criteria) this;
        }

        public Criteria andOpelocdistrictIn(List<String> values) {
            addCriterion("OPELOCDISTRICT in", values, "opelocdistrict");
            return (Criteria) this;
        }

        public Criteria andOpelocdistrictNotIn(List<String> values) {
            addCriterion("OPELOCDISTRICT not in", values, "opelocdistrict");
            return (Criteria) this;
        }

        public Criteria andOpelocdistrictBetween(String value1, String value2) {
            addCriterion("OPELOCDISTRICT between", value1, value2, "opelocdistrict");
            return (Criteria) this;
        }

        public Criteria andOpelocdistrictNotBetween(String value1, String value2) {
            addCriterion("OPELOCDISTRICT not between", value1, value2, "opelocdistrict");
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

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(BigDecimal value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(BigDecimal value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(BigDecimal value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(BigDecimal value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<BigDecimal> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<BigDecimal> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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

        public Criteria andOpernameIsNull() {
            addCriterion("OPERNAME is null");
            return (Criteria) this;
        }

        public Criteria andOpernameIsNotNull() {
            addCriterion("OPERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpernameEqualTo(String value) {
            addCriterion("OPERNAME =", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameNotEqualTo(String value) {
            addCriterion("OPERNAME <>", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameGreaterThan(String value) {
            addCriterion("OPERNAME >", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERNAME >=", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameLessThan(String value) {
            addCriterion("OPERNAME <", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameLessThanOrEqualTo(String value) {
            addCriterion("OPERNAME <=", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameLike(String value) {
            addCriterion("OPERNAME like", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameNotLike(String value) {
            addCriterion("OPERNAME not like", value, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameIn(List<String> values) {
            addCriterion("OPERNAME in", values, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameNotIn(List<String> values) {
            addCriterion("OPERNAME not in", values, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameBetween(String value1, String value2) {
            addCriterion("OPERNAME between", value1, value2, "opername");
            return (Criteria) this;
        }

        public Criteria andOpernameNotBetween(String value1, String value2) {
            addCriterion("OPERNAME not between", value1, value2, "opername");
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

        public Criteria andCitysignIsNull() {
            addCriterion("CITYSIGN is null");
            return (Criteria) this;
        }

        public Criteria andCitysignIsNotNull() {
            addCriterion("CITYSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andCitysignEqualTo(String value) {
            addCriterion("CITYSIGN =", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignNotEqualTo(String value) {
            addCriterion("CITYSIGN <>", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignGreaterThan(String value) {
            addCriterion("CITYSIGN >", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignGreaterThanOrEqualTo(String value) {
            addCriterion("CITYSIGN >=", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignLessThan(String value) {
            addCriterion("CITYSIGN <", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignLessThanOrEqualTo(String value) {
            addCriterion("CITYSIGN <=", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignLike(String value) {
            addCriterion("CITYSIGN like", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignNotLike(String value) {
            addCriterion("CITYSIGN not like", value, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignIn(List<String> values) {
            addCriterion("CITYSIGN in", values, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignNotIn(List<String> values) {
            addCriterion("CITYSIGN not in", values, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignBetween(String value1, String value2) {
            addCriterion("CITYSIGN between", value1, value2, "citysign");
            return (Criteria) this;
        }

        public Criteria andCitysignNotBetween(String value1, String value2) {
            addCriterion("CITYSIGN not between", value1, value2, "citysign");
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

        public Criteria andMarsignEqualTo(String value) {
            addCriterion("MARSIGN =", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignNotEqualTo(String value) {
            addCriterion("MARSIGN <>", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignGreaterThan(String value) {
            addCriterion("MARSIGN >", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignGreaterThanOrEqualTo(String value) {
            addCriterion("MARSIGN >=", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignLessThan(String value) {
            addCriterion("MARSIGN <", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignLessThanOrEqualTo(String value) {
            addCriterion("MARSIGN <=", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignLike(String value) {
            addCriterion("MARSIGN like", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignNotLike(String value) {
            addCriterion("MARSIGN not like", value, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignIn(List<String> values) {
            addCriterion("MARSIGN in", values, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignNotIn(List<String> values) {
            addCriterion("MARSIGN not in", values, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignBetween(String value1, String value2) {
            addCriterion("MARSIGN between", value1, value2, "marsign");
            return (Criteria) this;
        }

        public Criteria andMarsignNotBetween(String value1, String value2) {
            addCriterion("MARSIGN not between", value1, value2, "marsign");
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

        public Criteria andBorsignIsNull() {
            addCriterion("BORSIGN is null");
            return (Criteria) this;
        }

        public Criteria andBorsignIsNotNull() {
            addCriterion("BORSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andBorsignEqualTo(String value) {
            addCriterion("BORSIGN =", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignNotEqualTo(String value) {
            addCriterion("BORSIGN <>", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignGreaterThan(String value) {
            addCriterion("BORSIGN >", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignGreaterThanOrEqualTo(String value) {
            addCriterion("BORSIGN >=", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignLessThan(String value) {
            addCriterion("BORSIGN <", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignLessThanOrEqualTo(String value) {
            addCriterion("BORSIGN <=", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignLike(String value) {
            addCriterion("BORSIGN like", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignNotLike(String value) {
            addCriterion("BORSIGN not like", value, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignIn(List<String> values) {
            addCriterion("BORSIGN in", values, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignNotIn(List<String> values) {
            addCriterion("BORSIGN not in", values, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignBetween(String value1, String value2) {
            addCriterion("BORSIGN between", value1, value2, "borsign");
            return (Criteria) this;
        }

        public Criteria andBorsignNotBetween(String value1, String value2) {
            addCriterion("BORSIGN not between", value1, value2, "borsign");
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

        public Criteria andLocreworknumIsNull() {
            addCriterion("LOCREWORKNUM is null");
            return (Criteria) this;
        }

        public Criteria andLocreworknumIsNotNull() {
            addCriterion("LOCREWORKNUM is not null");
            return (Criteria) this;
        }

        public Criteria andLocreworknumEqualTo(BigDecimal value) {
            addCriterion("LOCREWORKNUM =", value, "locreworknum");
            return (Criteria) this;
        }

        public Criteria andLocreworknumNotEqualTo(BigDecimal value) {
            addCriterion("LOCREWORKNUM <>", value, "locreworknum");
            return (Criteria) this;
        }

        public Criteria andLocreworknumGreaterThan(BigDecimal value) {
            addCriterion("LOCREWORKNUM >", value, "locreworknum");
            return (Criteria) this;
        }

        public Criteria andLocreworknumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOCREWORKNUM >=", value, "locreworknum");
            return (Criteria) this;
        }

        public Criteria andLocreworknumLessThan(BigDecimal value) {
            addCriterion("LOCREWORKNUM <", value, "locreworknum");
            return (Criteria) this;
        }

        public Criteria andLocreworknumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOCREWORKNUM <=", value, "locreworknum");
            return (Criteria) this;
        }

        public Criteria andLocreworknumIn(List<BigDecimal> values) {
            addCriterion("LOCREWORKNUM in", values, "locreworknum");
            return (Criteria) this;
        }

        public Criteria andLocreworknumNotIn(List<BigDecimal> values) {
            addCriterion("LOCREWORKNUM not in", values, "locreworknum");
            return (Criteria) this;
        }

        public Criteria andLocreworknumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOCREWORKNUM between", value1, value2, "locreworknum");
            return (Criteria) this;
        }

        public Criteria andLocreworknumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOCREWORKNUM not between", value1, value2, "locreworknum");
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

        public Criteria andAllreworkfreeIsNull() {
            addCriterion("ALLREWORKFREE is null");
            return (Criteria) this;
        }

        public Criteria andAllreworkfreeIsNotNull() {
            addCriterion("ALLREWORKFREE is not null");
            return (Criteria) this;
        }

        public Criteria andAllreworkfreeEqualTo(BigDecimal value) {
            addCriterion("ALLREWORKFREE =", value, "allreworkfree");
            return (Criteria) this;
        }

        public Criteria andAllreworkfreeNotEqualTo(BigDecimal value) {
            addCriterion("ALLREWORKFREE <>", value, "allreworkfree");
            return (Criteria) this;
        }

        public Criteria andAllreworkfreeGreaterThan(BigDecimal value) {
            addCriterion("ALLREWORKFREE >", value, "allreworkfree");
            return (Criteria) this;
        }

        public Criteria andAllreworkfreeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ALLREWORKFREE >=", value, "allreworkfree");
            return (Criteria) this;
        }

        public Criteria andAllreworkfreeLessThan(BigDecimal value) {
            addCriterion("ALLREWORKFREE <", value, "allreworkfree");
            return (Criteria) this;
        }

        public Criteria andAllreworkfreeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ALLREWORKFREE <=", value, "allreworkfree");
            return (Criteria) this;
        }

        public Criteria andAllreworkfreeIn(List<BigDecimal> values) {
            addCriterion("ALLREWORKFREE in", values, "allreworkfree");
            return (Criteria) this;
        }

        public Criteria andAllreworkfreeNotIn(List<BigDecimal> values) {
            addCriterion("ALLREWORKFREE not in", values, "allreworkfree");
            return (Criteria) this;
        }

        public Criteria andAllreworkfreeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALLREWORKFREE between", value1, value2, "allreworkfree");
            return (Criteria) this;
        }

        public Criteria andAllreworkfreeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALLREWORKFREE not between", value1, value2, "allreworkfree");
            return (Criteria) this;
        }

        public Criteria andNationreworkfreeIsNull() {
            addCriterion("NATIONREWORKFREE is null");
            return (Criteria) this;
        }

        public Criteria andNationreworkfreeIsNotNull() {
            addCriterion("NATIONREWORKFREE is not null");
            return (Criteria) this;
        }

        public Criteria andNationreworkfreeEqualTo(BigDecimal value) {
            addCriterion("NATIONREWORKFREE =", value, "nationreworkfree");
            return (Criteria) this;
        }

        public Criteria andNationreworkfreeNotEqualTo(BigDecimal value) {
            addCriterion("NATIONREWORKFREE <>", value, "nationreworkfree");
            return (Criteria) this;
        }

        public Criteria andNationreworkfreeGreaterThan(BigDecimal value) {
            addCriterion("NATIONREWORKFREE >", value, "nationreworkfree");
            return (Criteria) this;
        }

        public Criteria andNationreworkfreeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NATIONREWORKFREE >=", value, "nationreworkfree");
            return (Criteria) this;
        }

        public Criteria andNationreworkfreeLessThan(BigDecimal value) {
            addCriterion("NATIONREWORKFREE <", value, "nationreworkfree");
            return (Criteria) this;
        }

        public Criteria andNationreworkfreeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NATIONREWORKFREE <=", value, "nationreworkfree");
            return (Criteria) this;
        }

        public Criteria andNationreworkfreeIn(List<BigDecimal> values) {
            addCriterion("NATIONREWORKFREE in", values, "nationreworkfree");
            return (Criteria) this;
        }

        public Criteria andNationreworkfreeNotIn(List<BigDecimal> values) {
            addCriterion("NATIONREWORKFREE not in", values, "nationreworkfree");
            return (Criteria) this;
        }

        public Criteria andNationreworkfreeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NATIONREWORKFREE between", value1, value2, "nationreworkfree");
            return (Criteria) this;
        }

        public Criteria andNationreworkfreeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NATIONREWORKFREE not between", value1, value2, "nationreworkfree");
            return (Criteria) this;
        }

        public Criteria andUnivleaverfreeIsNull() {
            addCriterion("UNIVLEAVERFREE is null");
            return (Criteria) this;
        }

        public Criteria andUnivleaverfreeIsNotNull() {
            addCriterion("UNIVLEAVERFREE is not null");
            return (Criteria) this;
        }

        public Criteria andUnivleaverfreeEqualTo(BigDecimal value) {
            addCriterion("UNIVLEAVERFREE =", value, "univleaverfree");
            return (Criteria) this;
        }

        public Criteria andUnivleaverfreeNotEqualTo(BigDecimal value) {
            addCriterion("UNIVLEAVERFREE <>", value, "univleaverfree");
            return (Criteria) this;
        }

        public Criteria andUnivleaverfreeGreaterThan(BigDecimal value) {
            addCriterion("UNIVLEAVERFREE >", value, "univleaverfree");
            return (Criteria) this;
        }

        public Criteria andUnivleaverfreeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIVLEAVERFREE >=", value, "univleaverfree");
            return (Criteria) this;
        }

        public Criteria andUnivleaverfreeLessThan(BigDecimal value) {
            addCriterion("UNIVLEAVERFREE <", value, "univleaverfree");
            return (Criteria) this;
        }

        public Criteria andUnivleaverfreeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIVLEAVERFREE <=", value, "univleaverfree");
            return (Criteria) this;
        }

        public Criteria andUnivleaverfreeIn(List<BigDecimal> values) {
            addCriterion("UNIVLEAVERFREE in", values, "univleaverfree");
            return (Criteria) this;
        }

        public Criteria andUnivleaverfreeNotIn(List<BigDecimal> values) {
            addCriterion("UNIVLEAVERFREE not in", values, "univleaverfree");
            return (Criteria) this;
        }

        public Criteria andUnivleaverfreeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIVLEAVERFREE between", value1, value2, "univleaverfree");
            return (Criteria) this;
        }

        public Criteria andUnivleaverfreeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIVLEAVERFREE not between", value1, value2, "univleaverfree");
            return (Criteria) this;
        }

        public Criteria andCopynumIsNull() {
            addCriterion("COPYNUM is null");
            return (Criteria) this;
        }

        public Criteria andCopynumIsNotNull() {
            addCriterion("COPYNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCopynumEqualTo(BigDecimal value) {
            addCriterion("COPYNUM =", value, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumNotEqualTo(BigDecimal value) {
            addCriterion("COPYNUM <>", value, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumGreaterThan(BigDecimal value) {
            addCriterion("COPYNUM >", value, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COPYNUM >=", value, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumLessThan(BigDecimal value) {
            addCriterion("COPYNUM <", value, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COPYNUM <=", value, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumIn(List<BigDecimal> values) {
            addCriterion("COPYNUM in", values, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumNotIn(List<BigDecimal> values) {
            addCriterion("COPYNUM not in", values, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COPYNUM between", value1, value2, "copynum");
            return (Criteria) this;
        }

        public Criteria andCopynumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COPYNUM not between", value1, value2, "copynum");
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

        public Criteria andOplocareaIsNull() {
            addCriterion("OPLOCAREA is null");
            return (Criteria) this;
        }

        public Criteria andOplocareaIsNotNull() {
            addCriterion("OPLOCAREA is not null");
            return (Criteria) this;
        }

        public Criteria andOplocareaEqualTo(String value) {
            addCriterion("OPLOCAREA =", value, "oplocarea");
            return (Criteria) this;
        }

        public Criteria andOplocareaNotEqualTo(String value) {
            addCriterion("OPLOCAREA <>", value, "oplocarea");
            return (Criteria) this;
        }

        public Criteria andOplocareaGreaterThan(String value) {
            addCriterion("OPLOCAREA >", value, "oplocarea");
            return (Criteria) this;
        }

        public Criteria andOplocareaGreaterThanOrEqualTo(String value) {
            addCriterion("OPLOCAREA >=", value, "oplocarea");
            return (Criteria) this;
        }

        public Criteria andOplocareaLessThan(String value) {
            addCriterion("OPLOCAREA <", value, "oplocarea");
            return (Criteria) this;
        }

        public Criteria andOplocareaLessThanOrEqualTo(String value) {
            addCriterion("OPLOCAREA <=", value, "oplocarea");
            return (Criteria) this;
        }

        public Criteria andOplocareaLike(String value) {
            addCriterion("OPLOCAREA like", value, "oplocarea");
            return (Criteria) this;
        }

        public Criteria andOplocareaNotLike(String value) {
            addCriterion("OPLOCAREA not like", value, "oplocarea");
            return (Criteria) this;
        }

        public Criteria andOplocareaIn(List<String> values) {
            addCriterion("OPLOCAREA in", values, "oplocarea");
            return (Criteria) this;
        }

        public Criteria andOplocareaNotIn(List<String> values) {
            addCriterion("OPLOCAREA not in", values, "oplocarea");
            return (Criteria) this;
        }

        public Criteria andOplocareaBetween(String value1, String value2) {
            addCriterion("OPLOCAREA between", value1, value2, "oplocarea");
            return (Criteria) this;
        }

        public Criteria andOplocareaNotBetween(String value1, String value2) {
            addCriterion("OPLOCAREA not between", value1, value2, "oplocarea");
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

        public Criteria andFamilymemIsNull() {
            addCriterion("FAMILYMEM is null");
            return (Criteria) this;
        }

        public Criteria andFamilymemIsNotNull() {
            addCriterion("FAMILYMEM is not null");
            return (Criteria) this;
        }

        public Criteria andFamilymemEqualTo(String value) {
            addCriterion("FAMILYMEM =", value, "familymem");
            return (Criteria) this;
        }

        public Criteria andFamilymemNotEqualTo(String value) {
            addCriterion("FAMILYMEM <>", value, "familymem");
            return (Criteria) this;
        }

        public Criteria andFamilymemGreaterThan(String value) {
            addCriterion("FAMILYMEM >", value, "familymem");
            return (Criteria) this;
        }

        public Criteria andFamilymemGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYMEM >=", value, "familymem");
            return (Criteria) this;
        }

        public Criteria andFamilymemLessThan(String value) {
            addCriterion("FAMILYMEM <", value, "familymem");
            return (Criteria) this;
        }

        public Criteria andFamilymemLessThanOrEqualTo(String value) {
            addCriterion("FAMILYMEM <=", value, "familymem");
            return (Criteria) this;
        }

        public Criteria andFamilymemLike(String value) {
            addCriterion("FAMILYMEM like", value, "familymem");
            return (Criteria) this;
        }

        public Criteria andFamilymemNotLike(String value) {
            addCriterion("FAMILYMEM not like", value, "familymem");
            return (Criteria) this;
        }

        public Criteria andFamilymemIn(List<String> values) {
            addCriterion("FAMILYMEM in", values, "familymem");
            return (Criteria) this;
        }

        public Criteria andFamilymemNotIn(List<String> values) {
            addCriterion("FAMILYMEM not in", values, "familymem");
            return (Criteria) this;
        }

        public Criteria andFamilymemBetween(String value1, String value2) {
            addCriterion("FAMILYMEM between", value1, value2, "familymem");
            return (Criteria) this;
        }

        public Criteria andFamilymemNotBetween(String value1, String value2) {
            addCriterion("FAMILYMEM not between", value1, value2, "familymem");
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

        public Criteria andIsChangeUpgradeIsNull() {
            addCriterion("IS_CHANGE_UPGRADE is null");
            return (Criteria) this;
        }

        public Criteria andIsChangeUpgradeIsNotNull() {
            addCriterion("IS_CHANGE_UPGRADE is not null");
            return (Criteria) this;
        }

        public Criteria andIsChangeUpgradeEqualTo(String value) {
            addCriterion("IS_CHANGE_UPGRADE =", value, "isChangeUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsChangeUpgradeNotEqualTo(String value) {
            addCriterion("IS_CHANGE_UPGRADE <>", value, "isChangeUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsChangeUpgradeGreaterThan(String value) {
            addCriterion("IS_CHANGE_UPGRADE >", value, "isChangeUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsChangeUpgradeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CHANGE_UPGRADE >=", value, "isChangeUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsChangeUpgradeLessThan(String value) {
            addCriterion("IS_CHANGE_UPGRADE <", value, "isChangeUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsChangeUpgradeLessThanOrEqualTo(String value) {
            addCriterion("IS_CHANGE_UPGRADE <=", value, "isChangeUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsChangeUpgradeLike(String value) {
            addCriterion("IS_CHANGE_UPGRADE like", value, "isChangeUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsChangeUpgradeNotLike(String value) {
            addCriterion("IS_CHANGE_UPGRADE not like", value, "isChangeUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsChangeUpgradeIn(List<String> values) {
            addCriterion("IS_CHANGE_UPGRADE in", values, "isChangeUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsChangeUpgradeNotIn(List<String> values) {
            addCriterion("IS_CHANGE_UPGRADE not in", values, "isChangeUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsChangeUpgradeBetween(String value1, String value2) {
            addCriterion("IS_CHANGE_UPGRADE between", value1, value2, "isChangeUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsChangeUpgradeNotBetween(String value1, String value2) {
            addCriterion("IS_CHANGE_UPGRADE not between", value1, value2, "isChangeUpgrade");
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

        public Criteria andHztimeIsNull() {
            addCriterion("HZTIME is null");
            return (Criteria) this;
        }

        public Criteria andHztimeIsNotNull() {
            addCriterion("HZTIME is not null");
            return (Criteria) this;
        }

        public Criteria andHztimeEqualTo(Date value) {
            addCriterion("HZTIME =", value, "hztime");
            return (Criteria) this;
        }

        public Criteria andHztimeNotEqualTo(Date value) {
            addCriterion("HZTIME <>", value, "hztime");
            return (Criteria) this;
        }

        public Criteria andHztimeGreaterThan(Date value) {
            addCriterion("HZTIME >", value, "hztime");
            return (Criteria) this;
        }

        public Criteria andHztimeGreaterThanOrEqualTo(Date value) {
            addCriterion("HZTIME >=", value, "hztime");
            return (Criteria) this;
        }

        public Criteria andHztimeLessThan(Date value) {
            addCriterion("HZTIME <", value, "hztime");
            return (Criteria) this;
        }

        public Criteria andHztimeLessThanOrEqualTo(Date value) {
            addCriterion("HZTIME <=", value, "hztime");
            return (Criteria) this;
        }

        public Criteria andHztimeIn(List<Date> values) {
            addCriterion("HZTIME in", values, "hztime");
            return (Criteria) this;
        }

        public Criteria andHztimeNotIn(List<Date> values) {
            addCriterion("HZTIME not in", values, "hztime");
            return (Criteria) this;
        }

        public Criteria andHztimeBetween(Date value1, Date value2) {
            addCriterion("HZTIME between", value1, value2, "hztime");
            return (Criteria) this;
        }

        public Criteria andHztimeNotBetween(Date value1, Date value2) {
            addCriterion("HZTIME not between", value1, value2, "hztime");
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

        public Criteria andUniscidfgwIsNull() {
            addCriterion("UNISCIDFGW is null");
            return (Criteria) this;
        }

        public Criteria andUniscidfgwIsNotNull() {
            addCriterion("UNISCIDFGW is not null");
            return (Criteria) this;
        }

        public Criteria andUniscidfgwEqualTo(String value) {
            addCriterion("UNISCIDFGW =", value, "uniscidfgw");
            return (Criteria) this;
        }

        public Criteria andUniscidfgwNotEqualTo(String value) {
            addCriterion("UNISCIDFGW <>", value, "uniscidfgw");
            return (Criteria) this;
        }

        public Criteria andUniscidfgwGreaterThan(String value) {
            addCriterion("UNISCIDFGW >", value, "uniscidfgw");
            return (Criteria) this;
        }

        public Criteria andUniscidfgwGreaterThanOrEqualTo(String value) {
            addCriterion("UNISCIDFGW >=", value, "uniscidfgw");
            return (Criteria) this;
        }

        public Criteria andUniscidfgwLessThan(String value) {
            addCriterion("UNISCIDFGW <", value, "uniscidfgw");
            return (Criteria) this;
        }

        public Criteria andUniscidfgwLessThanOrEqualTo(String value) {
            addCriterion("UNISCIDFGW <=", value, "uniscidfgw");
            return (Criteria) this;
        }

        public Criteria andUniscidfgwLike(String value) {
            addCriterion("UNISCIDFGW like", value, "uniscidfgw");
            return (Criteria) this;
        }

        public Criteria andUniscidfgwNotLike(String value) {
            addCriterion("UNISCIDFGW not like", value, "uniscidfgw");
            return (Criteria) this;
        }

        public Criteria andUniscidfgwIn(List<String> values) {
            addCriterion("UNISCIDFGW in", values, "uniscidfgw");
            return (Criteria) this;
        }

        public Criteria andUniscidfgwNotIn(List<String> values) {
            addCriterion("UNISCIDFGW not in", values, "uniscidfgw");
            return (Criteria) this;
        }

        public Criteria andUniscidfgwBetween(String value1, String value2) {
            addCriterion("UNISCIDFGW between", value1, value2, "uniscidfgw");
            return (Criteria) this;
        }

        public Criteria andUniscidfgwNotBetween(String value1, String value2) {
            addCriterion("UNISCIDFGW not between", value1, value2, "uniscidfgw");
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