package com.yawei.model.gsyw;

import com.sys.utils.BeanUtils;
import com.sys.utils.Page;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class NbZtJbxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public NbZtJbxxExample() {
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

        public Criteria andAncheidIsNull() {
            addCriterion("ANCHEID is null");
            return (Criteria) this;
        }

        public Criteria andAncheidIsNotNull() {
            addCriterion("ANCHEID is not null");
            return (Criteria) this;
        }

        public Criteria andAncheidEqualTo(String value) {
            addCriterion("ANCHEID =", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidNotEqualTo(String value) {
            addCriterion("ANCHEID <>", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidGreaterThan(String value) {
            addCriterion("ANCHEID >", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidGreaterThanOrEqualTo(String value) {
            addCriterion("ANCHEID >=", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidLessThan(String value) {
            addCriterion("ANCHEID <", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidLessThanOrEqualTo(String value) {
            addCriterion("ANCHEID <=", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidLike(String value) {
            addCriterion("ANCHEID like", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidNotLike(String value) {
            addCriterion("ANCHEID not like", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidIn(List<String> values) {
            addCriterion("ANCHEID in", values, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidNotIn(List<String> values) {
            addCriterion("ANCHEID not in", values, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidBetween(String value1, String value2) {
            addCriterion("ANCHEID between", value1, value2, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidNotBetween(String value1, String value2) {
            addCriterion("ANCHEID not between", value1, value2, "ancheid");
            return (Criteria) this;
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

        public Criteria andAnchedateIsNull() {
            addCriterion("ANCHEDATE is null");
            return (Criteria) this;
        }

        public Criteria andAnchedateIsNotNull() {
            addCriterion("ANCHEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAnchedateEqualTo(Date value) {
            addCriterion("ANCHEDATE =", value, "anchedate");
            return (Criteria) this;
        }

        public Criteria andAnchedateNotEqualTo(Date value) {
            addCriterion("ANCHEDATE <>", value, "anchedate");
            return (Criteria) this;
        }

        public Criteria andAnchedateGreaterThan(Date value) {
            addCriterion("ANCHEDATE >", value, "anchedate");
            return (Criteria) this;
        }

        public Criteria andAnchedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ANCHEDATE >=", value, "anchedate");
            return (Criteria) this;
        }

        public Criteria andAnchedateLessThan(Date value) {
            addCriterion("ANCHEDATE <", value, "anchedate");
            return (Criteria) this;
        }

        public Criteria andAnchedateLessThanOrEqualTo(Date value) {
            addCriterion("ANCHEDATE <=", value, "anchedate");
            return (Criteria) this;
        }

        public Criteria andAnchedateIn(List<Date> values) {
            addCriterion("ANCHEDATE in", values, "anchedate");
            return (Criteria) this;
        }

        public Criteria andAnchedateNotIn(List<Date> values) {
            addCriterion("ANCHEDATE not in", values, "anchedate");
            return (Criteria) this;
        }

        public Criteria andAnchedateBetween(Date value1, Date value2) {
            addCriterion("ANCHEDATE between", value1, value2, "anchedate");
            return (Criteria) this;
        }

        public Criteria andAnchedateNotBetween(Date value1, Date value2) {
            addCriterion("ANCHEDATE not between", value1, value2, "anchedate");
            return (Criteria) this;
        }

        public Criteria andAncheyearIsNull() {
            addCriterion("ANCHEYEAR is null");
            return (Criteria) this;
        }

        public Criteria andAncheyearIsNotNull() {
            addCriterion("ANCHEYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andAncheyearEqualTo(String value) {
            addCriterion("ANCHEYEAR =", value, "ancheyear");
            return (Criteria) this;
        }

        public Criteria andAncheyearNotEqualTo(String value) {
            addCriterion("ANCHEYEAR <>", value, "ancheyear");
            return (Criteria) this;
        }

        public Criteria andAncheyearGreaterThan(String value) {
            addCriterion("ANCHEYEAR >", value, "ancheyear");
            return (Criteria) this;
        }

        public Criteria andAncheyearGreaterThanOrEqualTo(String value) {
            addCriterion("ANCHEYEAR >=", value, "ancheyear");
            return (Criteria) this;
        }

        public Criteria andAncheyearLessThan(String value) {
            addCriterion("ANCHEYEAR <", value, "ancheyear");
            return (Criteria) this;
        }

        public Criteria andAncheyearLessThanOrEqualTo(String value) {
            addCriterion("ANCHEYEAR <=", value, "ancheyear");
            return (Criteria) this;
        }

        public Criteria andAncheyearLike(String value) {
            addCriterion("ANCHEYEAR like", value, "ancheyear");
            return (Criteria) this;
        }

        public Criteria andAncheyearNotLike(String value) {
            addCriterion("ANCHEYEAR not like", value, "ancheyear");
            return (Criteria) this;
        }

        public Criteria andAncheyearIn(List<String> values) {
            addCriterion("ANCHEYEAR in", values, "ancheyear");
            return (Criteria) this;
        }

        public Criteria andAncheyearNotIn(List<String> values) {
            addCriterion("ANCHEYEAR not in", values, "ancheyear");
            return (Criteria) this;
        }

        public Criteria andAncheyearBetween(String value1, String value2) {
            addCriterion("ANCHEYEAR between", value1, value2, "ancheyear");
            return (Criteria) this;
        }

        public Criteria andAncheyearNotBetween(String value1, String value2) {
            addCriterion("ANCHEYEAR not between", value1, value2, "ancheyear");
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

        public Criteria andEmpnumIsNull() {
            addCriterion("EMPNUM is null");
            return (Criteria) this;
        }

        public Criteria andEmpnumIsNotNull() {
            addCriterion("EMPNUM is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnumEqualTo(Integer value) {
            addCriterion("EMPNUM =", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumNotEqualTo(Integer value) {
            addCriterion("EMPNUM <>", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumGreaterThan(Integer value) {
            addCriterion("EMPNUM >", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMPNUM >=", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumLessThan(Integer value) {
            addCriterion("EMPNUM <", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumLessThanOrEqualTo(Integer value) {
            addCriterion("EMPNUM <=", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumIn(List<Integer> values) {
            addCriterion("EMPNUM in", values, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumNotIn(List<Integer> values) {
            addCriterion("EMPNUM not in", values, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumBetween(Integer value1, Integer value2) {
            addCriterion("EMPNUM between", value1, value2, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumNotBetween(Integer value1, Integer value2) {
            addCriterion("EMPNUM not between", value1, value2, "empnum");
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

        public Criteria andAddrIsNull() {
            addCriterion("ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("ADDR =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("ADDR <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("ADDR >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("ADDR <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("ADDR <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("ADDR like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("ADDR not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("ADDR in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("ADDR not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("ADDR between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("ADDR not between", value1, value2, "addr");
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

        public Criteria andBusstIsNull() {
            addCriterion("BUSST is null");
            return (Criteria) this;
        }

        public Criteria andBusstIsNotNull() {
            addCriterion("BUSST is not null");
            return (Criteria) this;
        }

        public Criteria andBusstEqualTo(String value) {
            addCriterion("BUSST =", value, "busst");
            return (Criteria) this;
        }

        public Criteria andBusstNotEqualTo(String value) {
            addCriterion("BUSST <>", value, "busst");
            return (Criteria) this;
        }

        public Criteria andBusstGreaterThan(String value) {
            addCriterion("BUSST >", value, "busst");
            return (Criteria) this;
        }

        public Criteria andBusstGreaterThanOrEqualTo(String value) {
            addCriterion("BUSST >=", value, "busst");
            return (Criteria) this;
        }

        public Criteria andBusstLessThan(String value) {
            addCriterion("BUSST <", value, "busst");
            return (Criteria) this;
        }

        public Criteria andBusstLessThanOrEqualTo(String value) {
            addCriterion("BUSST <=", value, "busst");
            return (Criteria) this;
        }

        public Criteria andBusstLike(String value) {
            addCriterion("BUSST like", value, "busst");
            return (Criteria) this;
        }

        public Criteria andBusstNotLike(String value) {
            addCriterion("BUSST not like", value, "busst");
            return (Criteria) this;
        }

        public Criteria andBusstIn(List<String> values) {
            addCriterion("BUSST in", values, "busst");
            return (Criteria) this;
        }

        public Criteria andBusstNotIn(List<String> values) {
            addCriterion("BUSST not in", values, "busst");
            return (Criteria) this;
        }

        public Criteria andBusstBetween(String value1, String value2) {
            addCriterion("BUSST between", value1, value2, "busst");
            return (Criteria) this;
        }

        public Criteria andBusstNotBetween(String value1, String value2) {
            addCriterion("BUSST not between", value1, value2, "busst");
            return (Criteria) this;
        }

        public Criteria andColgranumIsNull() {
            addCriterion("COLGRANUM is null");
            return (Criteria) this;
        }

        public Criteria andColgranumIsNotNull() {
            addCriterion("COLGRANUM is not null");
            return (Criteria) this;
        }

        public Criteria andColgranumEqualTo(Integer value) {
            addCriterion("COLGRANUM =", value, "colgranum");
            return (Criteria) this;
        }

        public Criteria andColgranumNotEqualTo(Integer value) {
            addCriterion("COLGRANUM <>", value, "colgranum");
            return (Criteria) this;
        }

        public Criteria andColgranumGreaterThan(Integer value) {
            addCriterion("COLGRANUM >", value, "colgranum");
            return (Criteria) this;
        }

        public Criteria andColgranumGreaterThanOrEqualTo(Integer value) {
            addCriterion("COLGRANUM >=", value, "colgranum");
            return (Criteria) this;
        }

        public Criteria andColgranumLessThan(Integer value) {
            addCriterion("COLGRANUM <", value, "colgranum");
            return (Criteria) this;
        }

        public Criteria andColgranumLessThanOrEqualTo(Integer value) {
            addCriterion("COLGRANUM <=", value, "colgranum");
            return (Criteria) this;
        }

        public Criteria andColgranumIn(List<Integer> values) {
            addCriterion("COLGRANUM in", values, "colgranum");
            return (Criteria) this;
        }

        public Criteria andColgranumNotIn(List<Integer> values) {
            addCriterion("COLGRANUM not in", values, "colgranum");
            return (Criteria) this;
        }

        public Criteria andColgranumBetween(Integer value1, Integer value2) {
            addCriterion("COLGRANUM between", value1, value2, "colgranum");
            return (Criteria) this;
        }

        public Criteria andColgranumNotBetween(Integer value1, Integer value2) {
            addCriterion("COLGRANUM not between", value1, value2, "colgranum");
            return (Criteria) this;
        }

        public Criteria andColemplnumIsNull() {
            addCriterion("COLEMPLNUM is null");
            return (Criteria) this;
        }

        public Criteria andColemplnumIsNotNull() {
            addCriterion("COLEMPLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andColemplnumEqualTo(Integer value) {
            addCriterion("COLEMPLNUM =", value, "colemplnum");
            return (Criteria) this;
        }

        public Criteria andColemplnumNotEqualTo(Integer value) {
            addCriterion("COLEMPLNUM <>", value, "colemplnum");
            return (Criteria) this;
        }

        public Criteria andColemplnumGreaterThan(Integer value) {
            addCriterion("COLEMPLNUM >", value, "colemplnum");
            return (Criteria) this;
        }

        public Criteria andColemplnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("COLEMPLNUM >=", value, "colemplnum");
            return (Criteria) this;
        }

        public Criteria andColemplnumLessThan(Integer value) {
            addCriterion("COLEMPLNUM <", value, "colemplnum");
            return (Criteria) this;
        }

        public Criteria andColemplnumLessThanOrEqualTo(Integer value) {
            addCriterion("COLEMPLNUM <=", value, "colemplnum");
            return (Criteria) this;
        }

        public Criteria andColemplnumIn(List<Integer> values) {
            addCriterion("COLEMPLNUM in", values, "colemplnum");
            return (Criteria) this;
        }

        public Criteria andColemplnumNotIn(List<Integer> values) {
            addCriterion("COLEMPLNUM not in", values, "colemplnum");
            return (Criteria) this;
        }

        public Criteria andColemplnumBetween(Integer value1, Integer value2) {
            addCriterion("COLEMPLNUM between", value1, value2, "colemplnum");
            return (Criteria) this;
        }

        public Criteria andColemplnumNotBetween(Integer value1, Integer value2) {
            addCriterion("COLEMPLNUM not between", value1, value2, "colemplnum");
            return (Criteria) this;
        }

        public Criteria andRetsolnumIsNull() {
            addCriterion("RETSOLNUM is null");
            return (Criteria) this;
        }

        public Criteria andRetsolnumIsNotNull() {
            addCriterion("RETSOLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andRetsolnumEqualTo(Integer value) {
            addCriterion("RETSOLNUM =", value, "retsolnum");
            return (Criteria) this;
        }

        public Criteria andRetsolnumNotEqualTo(Integer value) {
            addCriterion("RETSOLNUM <>", value, "retsolnum");
            return (Criteria) this;
        }

        public Criteria andRetsolnumGreaterThan(Integer value) {
            addCriterion("RETSOLNUM >", value, "retsolnum");
            return (Criteria) this;
        }

        public Criteria andRetsolnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("RETSOLNUM >=", value, "retsolnum");
            return (Criteria) this;
        }

        public Criteria andRetsolnumLessThan(Integer value) {
            addCriterion("RETSOLNUM <", value, "retsolnum");
            return (Criteria) this;
        }

        public Criteria andRetsolnumLessThanOrEqualTo(Integer value) {
            addCriterion("RETSOLNUM <=", value, "retsolnum");
            return (Criteria) this;
        }

        public Criteria andRetsolnumIn(List<Integer> values) {
            addCriterion("RETSOLNUM in", values, "retsolnum");
            return (Criteria) this;
        }

        public Criteria andRetsolnumNotIn(List<Integer> values) {
            addCriterion("RETSOLNUM not in", values, "retsolnum");
            return (Criteria) this;
        }

        public Criteria andRetsolnumBetween(Integer value1, Integer value2) {
            addCriterion("RETSOLNUM between", value1, value2, "retsolnum");
            return (Criteria) this;
        }

        public Criteria andRetsolnumNotBetween(Integer value1, Integer value2) {
            addCriterion("RETSOLNUM not between", value1, value2, "retsolnum");
            return (Criteria) this;
        }

        public Criteria andRetemplnumIsNull() {
            addCriterion("RETEMPLNUM is null");
            return (Criteria) this;
        }

        public Criteria andRetemplnumIsNotNull() {
            addCriterion("RETEMPLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andRetemplnumEqualTo(Integer value) {
            addCriterion("RETEMPLNUM =", value, "retemplnum");
            return (Criteria) this;
        }

        public Criteria andRetemplnumNotEqualTo(Integer value) {
            addCriterion("RETEMPLNUM <>", value, "retemplnum");
            return (Criteria) this;
        }

        public Criteria andRetemplnumGreaterThan(Integer value) {
            addCriterion("RETEMPLNUM >", value, "retemplnum");
            return (Criteria) this;
        }

        public Criteria andRetemplnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("RETEMPLNUM >=", value, "retemplnum");
            return (Criteria) this;
        }

        public Criteria andRetemplnumLessThan(Integer value) {
            addCriterion("RETEMPLNUM <", value, "retemplnum");
            return (Criteria) this;
        }

        public Criteria andRetemplnumLessThanOrEqualTo(Integer value) {
            addCriterion("RETEMPLNUM <=", value, "retemplnum");
            return (Criteria) this;
        }

        public Criteria andRetemplnumIn(List<Integer> values) {
            addCriterion("RETEMPLNUM in", values, "retemplnum");
            return (Criteria) this;
        }

        public Criteria andRetemplnumNotIn(List<Integer> values) {
            addCriterion("RETEMPLNUM not in", values, "retemplnum");
            return (Criteria) this;
        }

        public Criteria andRetemplnumBetween(Integer value1, Integer value2) {
            addCriterion("RETEMPLNUM between", value1, value2, "retemplnum");
            return (Criteria) this;
        }

        public Criteria andRetemplnumNotBetween(Integer value1, Integer value2) {
            addCriterion("RETEMPLNUM not between", value1, value2, "retemplnum");
            return (Criteria) this;
        }

        public Criteria andDispernumIsNull() {
            addCriterion("DISPERNUM is null");
            return (Criteria) this;
        }

        public Criteria andDispernumIsNotNull() {
            addCriterion("DISPERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDispernumEqualTo(Integer value) {
            addCriterion("DISPERNUM =", value, "dispernum");
            return (Criteria) this;
        }

        public Criteria andDispernumNotEqualTo(Integer value) {
            addCriterion("DISPERNUM <>", value, "dispernum");
            return (Criteria) this;
        }

        public Criteria andDispernumGreaterThan(Integer value) {
            addCriterion("DISPERNUM >", value, "dispernum");
            return (Criteria) this;
        }

        public Criteria andDispernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("DISPERNUM >=", value, "dispernum");
            return (Criteria) this;
        }

        public Criteria andDispernumLessThan(Integer value) {
            addCriterion("DISPERNUM <", value, "dispernum");
            return (Criteria) this;
        }

        public Criteria andDispernumLessThanOrEqualTo(Integer value) {
            addCriterion("DISPERNUM <=", value, "dispernum");
            return (Criteria) this;
        }

        public Criteria andDispernumIn(List<Integer> values) {
            addCriterion("DISPERNUM in", values, "dispernum");
            return (Criteria) this;
        }

        public Criteria andDispernumNotIn(List<Integer> values) {
            addCriterion("DISPERNUM not in", values, "dispernum");
            return (Criteria) this;
        }

        public Criteria andDispernumBetween(Integer value1, Integer value2) {
            addCriterion("DISPERNUM between", value1, value2, "dispernum");
            return (Criteria) this;
        }

        public Criteria andDispernumNotBetween(Integer value1, Integer value2) {
            addCriterion("DISPERNUM not between", value1, value2, "dispernum");
            return (Criteria) this;
        }

        public Criteria andDisemplnumIsNull() {
            addCriterion("DISEMPLNUM is null");
            return (Criteria) this;
        }

        public Criteria andDisemplnumIsNotNull() {
            addCriterion("DISEMPLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDisemplnumEqualTo(Integer value) {
            addCriterion("DISEMPLNUM =", value, "disemplnum");
            return (Criteria) this;
        }

        public Criteria andDisemplnumNotEqualTo(Integer value) {
            addCriterion("DISEMPLNUM <>", value, "disemplnum");
            return (Criteria) this;
        }

        public Criteria andDisemplnumGreaterThan(Integer value) {
            addCriterion("DISEMPLNUM >", value, "disemplnum");
            return (Criteria) this;
        }

        public Criteria andDisemplnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("DISEMPLNUM >=", value, "disemplnum");
            return (Criteria) this;
        }

        public Criteria andDisemplnumLessThan(Integer value) {
            addCriterion("DISEMPLNUM <", value, "disemplnum");
            return (Criteria) this;
        }

        public Criteria andDisemplnumLessThanOrEqualTo(Integer value) {
            addCriterion("DISEMPLNUM <=", value, "disemplnum");
            return (Criteria) this;
        }

        public Criteria andDisemplnumIn(List<Integer> values) {
            addCriterion("DISEMPLNUM in", values, "disemplnum");
            return (Criteria) this;
        }

        public Criteria andDisemplnumNotIn(List<Integer> values) {
            addCriterion("DISEMPLNUM not in", values, "disemplnum");
            return (Criteria) this;
        }

        public Criteria andDisemplnumBetween(Integer value1, Integer value2) {
            addCriterion("DISEMPLNUM between", value1, value2, "disemplnum");
            return (Criteria) this;
        }

        public Criteria andDisemplnumNotBetween(Integer value1, Integer value2) {
            addCriterion("DISEMPLNUM not between", value1, value2, "disemplnum");
            return (Criteria) this;
        }

        public Criteria andUnenumIsNull() {
            addCriterion("UNENUM is null");
            return (Criteria) this;
        }

        public Criteria andUnenumIsNotNull() {
            addCriterion("UNENUM is not null");
            return (Criteria) this;
        }

        public Criteria andUnenumEqualTo(Integer value) {
            addCriterion("UNENUM =", value, "unenum");
            return (Criteria) this;
        }

        public Criteria andUnenumNotEqualTo(Integer value) {
            addCriterion("UNENUM <>", value, "unenum");
            return (Criteria) this;
        }

        public Criteria andUnenumGreaterThan(Integer value) {
            addCriterion("UNENUM >", value, "unenum");
            return (Criteria) this;
        }

        public Criteria andUnenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNENUM >=", value, "unenum");
            return (Criteria) this;
        }

        public Criteria andUnenumLessThan(Integer value) {
            addCriterion("UNENUM <", value, "unenum");
            return (Criteria) this;
        }

        public Criteria andUnenumLessThanOrEqualTo(Integer value) {
            addCriterion("UNENUM <=", value, "unenum");
            return (Criteria) this;
        }

        public Criteria andUnenumIn(List<Integer> values) {
            addCriterion("UNENUM in", values, "unenum");
            return (Criteria) this;
        }

        public Criteria andUnenumNotIn(List<Integer> values) {
            addCriterion("UNENUM not in", values, "unenum");
            return (Criteria) this;
        }

        public Criteria andUnenumBetween(Integer value1, Integer value2) {
            addCriterion("UNENUM between", value1, value2, "unenum");
            return (Criteria) this;
        }

        public Criteria andUnenumNotBetween(Integer value1, Integer value2) {
            addCriterion("UNENUM not between", value1, value2, "unenum");
            return (Criteria) this;
        }

        public Criteria andUneemplnumIsNull() {
            addCriterion("UNEEMPLNUM is null");
            return (Criteria) this;
        }

        public Criteria andUneemplnumIsNotNull() {
            addCriterion("UNEEMPLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andUneemplnumEqualTo(Integer value) {
            addCriterion("UNEEMPLNUM =", value, "uneemplnum");
            return (Criteria) this;
        }

        public Criteria andUneemplnumNotEqualTo(Integer value) {
            addCriterion("UNEEMPLNUM <>", value, "uneemplnum");
            return (Criteria) this;
        }

        public Criteria andUneemplnumGreaterThan(Integer value) {
            addCriterion("UNEEMPLNUM >", value, "uneemplnum");
            return (Criteria) this;
        }

        public Criteria andUneemplnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNEEMPLNUM >=", value, "uneemplnum");
            return (Criteria) this;
        }

        public Criteria andUneemplnumLessThan(Integer value) {
            addCriterion("UNEEMPLNUM <", value, "uneemplnum");
            return (Criteria) this;
        }

        public Criteria andUneemplnumLessThanOrEqualTo(Integer value) {
            addCriterion("UNEEMPLNUM <=", value, "uneemplnum");
            return (Criteria) this;
        }

        public Criteria andUneemplnumIn(List<Integer> values) {
            addCriterion("UNEEMPLNUM in", values, "uneemplnum");
            return (Criteria) this;
        }

        public Criteria andUneemplnumNotIn(List<Integer> values) {
            addCriterion("UNEEMPLNUM not in", values, "uneemplnum");
            return (Criteria) this;
        }

        public Criteria andUneemplnumBetween(Integer value1, Integer value2) {
            addCriterion("UNEEMPLNUM between", value1, value2, "uneemplnum");
            return (Criteria) this;
        }

        public Criteria andUneemplnumNotBetween(Integer value1, Integer value2) {
            addCriterion("UNEEMPLNUM not between", value1, value2, "uneemplnum");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumIsNull() {
            addCriterion("IFPUBEMPNUM is null");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumIsNotNull() {
            addCriterion("IFPUBEMPNUM is not null");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumEqualTo(String value) {
            addCriterion("IFPUBEMPNUM =", value, "ifpubempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumNotEqualTo(String value) {
            addCriterion("IFPUBEMPNUM <>", value, "ifpubempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumGreaterThan(String value) {
            addCriterion("IFPUBEMPNUM >", value, "ifpubempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumGreaterThanOrEqualTo(String value) {
            addCriterion("IFPUBEMPNUM >=", value, "ifpubempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumLessThan(String value) {
            addCriterion("IFPUBEMPNUM <", value, "ifpubempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumLessThanOrEqualTo(String value) {
            addCriterion("IFPUBEMPNUM <=", value, "ifpubempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumLike(String value) {
            addCriterion("IFPUBEMPNUM like", value, "ifpubempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumNotLike(String value) {
            addCriterion("IFPUBEMPNUM not like", value, "ifpubempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumIn(List<String> values) {
            addCriterion("IFPUBEMPNUM in", values, "ifpubempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumNotIn(List<String> values) {
            addCriterion("IFPUBEMPNUM not in", values, "ifpubempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumBetween(String value1, String value2) {
            addCriterion("IFPUBEMPNUM between", value1, value2, "ifpubempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubempnumNotBetween(String value1, String value2) {
            addCriterion("IFPUBEMPNUM not between", value1, value2, "ifpubempnum");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIfpubIsNull() {
            addCriterion("IFPUB is null");
            return (Criteria) this;
        }

        public Criteria andIfpubIsNotNull() {
            addCriterion("IFPUB is not null");
            return (Criteria) this;
        }

        public Criteria andIfpubEqualTo(String value) {
            addCriterion("IFPUB =", value, "ifpub");
            return (Criteria) this;
        }

        public Criteria andIfpubNotEqualTo(String value) {
            addCriterion("IFPUB <>", value, "ifpub");
            return (Criteria) this;
        }

        public Criteria andIfpubGreaterThan(String value) {
            addCriterion("IFPUB >", value, "ifpub");
            return (Criteria) this;
        }

        public Criteria andIfpubGreaterThanOrEqualTo(String value) {
            addCriterion("IFPUB >=", value, "ifpub");
            return (Criteria) this;
        }

        public Criteria andIfpubLessThan(String value) {
            addCriterion("IFPUB <", value, "ifpub");
            return (Criteria) this;
        }

        public Criteria andIfpubLessThanOrEqualTo(String value) {
            addCriterion("IFPUB <=", value, "ifpub");
            return (Criteria) this;
        }

        public Criteria andIfpubLike(String value) {
            addCriterion("IFPUB like", value, "ifpub");
            return (Criteria) this;
        }

        public Criteria andIfpubNotLike(String value) {
            addCriterion("IFPUB not like", value, "ifpub");
            return (Criteria) this;
        }

        public Criteria andIfpubIn(List<String> values) {
            addCriterion("IFPUB in", values, "ifpub");
            return (Criteria) this;
        }

        public Criteria andIfpubNotIn(List<String> values) {
            addCriterion("IFPUB not in", values, "ifpub");
            return (Criteria) this;
        }

        public Criteria andIfpubBetween(String value1, String value2) {
            addCriterion("IFPUB between", value1, value2, "ifpub");
            return (Criteria) this;
        }

        public Criteria andIfpubNotBetween(String value1, String value2) {
            addCriterion("IFPUB not between", value1, value2, "ifpub");
            return (Criteria) this;
        }

        public Criteria andAnchetypeIsNull() {
            addCriterion("ANCHETYPE is null");
            return (Criteria) this;
        }

        public Criteria andAnchetypeIsNotNull() {
            addCriterion("ANCHETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAnchetypeEqualTo(String value) {
            addCriterion("ANCHETYPE =", value, "anchetype");
            return (Criteria) this;
        }

        public Criteria andAnchetypeNotEqualTo(String value) {
            addCriterion("ANCHETYPE <>", value, "anchetype");
            return (Criteria) this;
        }

        public Criteria andAnchetypeGreaterThan(String value) {
            addCriterion("ANCHETYPE >", value, "anchetype");
            return (Criteria) this;
        }

        public Criteria andAnchetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ANCHETYPE >=", value, "anchetype");
            return (Criteria) this;
        }

        public Criteria andAnchetypeLessThan(String value) {
            addCriterion("ANCHETYPE <", value, "anchetype");
            return (Criteria) this;
        }

        public Criteria andAnchetypeLessThanOrEqualTo(String value) {
            addCriterion("ANCHETYPE <=", value, "anchetype");
            return (Criteria) this;
        }

        public Criteria andAnchetypeLike(String value) {
            addCriterion("ANCHETYPE like", value, "anchetype");
            return (Criteria) this;
        }

        public Criteria andAnchetypeNotLike(String value) {
            addCriterion("ANCHETYPE not like", value, "anchetype");
            return (Criteria) this;
        }

        public Criteria andAnchetypeIn(List<String> values) {
            addCriterion("ANCHETYPE in", values, "anchetype");
            return (Criteria) this;
        }

        public Criteria andAnchetypeNotIn(List<String> values) {
            addCriterion("ANCHETYPE not in", values, "anchetype");
            return (Criteria) this;
        }

        public Criteria andAnchetypeBetween(String value1, String value2) {
            addCriterion("ANCHETYPE between", value1, value2, "anchetype");
            return (Criteria) this;
        }

        public Criteria andAnchetypeNotBetween(String value1, String value2) {
            addCriterion("ANCHETYPE not between", value1, value2, "anchetype");
            return (Criteria) this;
        }

        public Criteria andRelationtoIsNull() {
            addCriterion("RELATIONTO is null");
            return (Criteria) this;
        }

        public Criteria andRelationtoIsNotNull() {
            addCriterion("RELATIONTO is not null");
            return (Criteria) this;
        }

        public Criteria andRelationtoEqualTo(String value) {
            addCriterion("RELATIONTO =", value, "relationto");
            return (Criteria) this;
        }

        public Criteria andRelationtoNotEqualTo(String value) {
            addCriterion("RELATIONTO <>", value, "relationto");
            return (Criteria) this;
        }

        public Criteria andRelationtoGreaterThan(String value) {
            addCriterion("RELATIONTO >", value, "relationto");
            return (Criteria) this;
        }

        public Criteria andRelationtoGreaterThanOrEqualTo(String value) {
            addCriterion("RELATIONTO >=", value, "relationto");
            return (Criteria) this;
        }

        public Criteria andRelationtoLessThan(String value) {
            addCriterion("RELATIONTO <", value, "relationto");
            return (Criteria) this;
        }

        public Criteria andRelationtoLessThanOrEqualTo(String value) {
            addCriterion("RELATIONTO <=", value, "relationto");
            return (Criteria) this;
        }

        public Criteria andRelationtoLike(String value) {
            addCriterion("RELATIONTO like", value, "relationto");
            return (Criteria) this;
        }

        public Criteria andRelationtoNotLike(String value) {
            addCriterion("RELATIONTO not like", value, "relationto");
            return (Criteria) this;
        }

        public Criteria andRelationtoIn(List<String> values) {
            addCriterion("RELATIONTO in", values, "relationto");
            return (Criteria) this;
        }

        public Criteria andRelationtoNotIn(List<String> values) {
            addCriterion("RELATIONTO not in", values, "relationto");
            return (Criteria) this;
        }

        public Criteria andRelationtoBetween(String value1, String value2) {
            addCriterion("RELATIONTO between", value1, value2, "relationto");
            return (Criteria) this;
        }

        public Criteria andRelationtoNotBetween(String value1, String value2) {
            addCriterion("RELATIONTO not between", value1, value2, "relationto");
            return (Criteria) this;
        }

        public Criteria andFirstpubtimeIsNull() {
            addCriterion("FIRSTPUBTIME is null");
            return (Criteria) this;
        }

        public Criteria andFirstpubtimeIsNotNull() {
            addCriterion("FIRSTPUBTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstpubtimeEqualTo(Date value) {
            addCriterion("FIRSTPUBTIME =", value, "firstpubtime");
            return (Criteria) this;
        }

        public Criteria andFirstpubtimeNotEqualTo(Date value) {
            addCriterion("FIRSTPUBTIME <>", value, "firstpubtime");
            return (Criteria) this;
        }

        public Criteria andFirstpubtimeGreaterThan(Date value) {
            addCriterion("FIRSTPUBTIME >", value, "firstpubtime");
            return (Criteria) this;
        }

        public Criteria andFirstpubtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRSTPUBTIME >=", value, "firstpubtime");
            return (Criteria) this;
        }

        public Criteria andFirstpubtimeLessThan(Date value) {
            addCriterion("FIRSTPUBTIME <", value, "firstpubtime");
            return (Criteria) this;
        }

        public Criteria andFirstpubtimeLessThanOrEqualTo(Date value) {
            addCriterion("FIRSTPUBTIME <=", value, "firstpubtime");
            return (Criteria) this;
        }

        public Criteria andFirstpubtimeIn(List<Date> values) {
            addCriterion("FIRSTPUBTIME in", values, "firstpubtime");
            return (Criteria) this;
        }

        public Criteria andFirstpubtimeNotIn(List<Date> values) {
            addCriterion("FIRSTPUBTIME not in", values, "firstpubtime");
            return (Criteria) this;
        }

        public Criteria andFirstpubtimeBetween(Date value1, Date value2) {
            addCriterion("FIRSTPUBTIME between", value1, value2, "firstpubtime");
            return (Criteria) this;
        }

        public Criteria andFirstpubtimeNotBetween(Date value1, Date value2) {
            addCriterion("FIRSTPUBTIME not between", value1, value2, "firstpubtime");
            return (Criteria) this;
        }

        public Criteria andMainbusiactIsNull() {
            addCriterion("MAINBUSIACT is null");
            return (Criteria) this;
        }

        public Criteria andMainbusiactIsNotNull() {
            addCriterion("MAINBUSIACT is not null");
            return (Criteria) this;
        }

        public Criteria andMainbusiactEqualTo(String value) {
            addCriterion("MAINBUSIACT =", value, "mainbusiact");
            return (Criteria) this;
        }

        public Criteria andMainbusiactNotEqualTo(String value) {
            addCriterion("MAINBUSIACT <>", value, "mainbusiact");
            return (Criteria) this;
        }

        public Criteria andMainbusiactGreaterThan(String value) {
            addCriterion("MAINBUSIACT >", value, "mainbusiact");
            return (Criteria) this;
        }

        public Criteria andMainbusiactGreaterThanOrEqualTo(String value) {
            addCriterion("MAINBUSIACT >=", value, "mainbusiact");
            return (Criteria) this;
        }

        public Criteria andMainbusiactLessThan(String value) {
            addCriterion("MAINBUSIACT <", value, "mainbusiact");
            return (Criteria) this;
        }

        public Criteria andMainbusiactLessThanOrEqualTo(String value) {
            addCriterion("MAINBUSIACT <=", value, "mainbusiact");
            return (Criteria) this;
        }

        public Criteria andMainbusiactLike(String value) {
            addCriterion("MAINBUSIACT like", value, "mainbusiact");
            return (Criteria) this;
        }

        public Criteria andMainbusiactNotLike(String value) {
            addCriterion("MAINBUSIACT not like", value, "mainbusiact");
            return (Criteria) this;
        }

        public Criteria andMainbusiactIn(List<String> values) {
            addCriterion("MAINBUSIACT in", values, "mainbusiact");
            return (Criteria) this;
        }

        public Criteria andMainbusiactNotIn(List<String> values) {
            addCriterion("MAINBUSIACT not in", values, "mainbusiact");
            return (Criteria) this;
        }

        public Criteria andMainbusiactBetween(String value1, String value2) {
            addCriterion("MAINBUSIACT between", value1, value2, "mainbusiact");
            return (Criteria) this;
        }

        public Criteria andMainbusiactNotBetween(String value1, String value2) {
            addCriterion("MAINBUSIACT not between", value1, value2, "mainbusiact");
            return (Criteria) this;
        }

        public Criteria andWomempnumIsNull() {
            addCriterion("WOMEMPNUM is null");
            return (Criteria) this;
        }

        public Criteria andWomempnumIsNotNull() {
            addCriterion("WOMEMPNUM is not null");
            return (Criteria) this;
        }

        public Criteria andWomempnumEqualTo(Long value) {
            addCriterion("WOMEMPNUM =", value, "womempnum");
            return (Criteria) this;
        }

        public Criteria andWomempnumNotEqualTo(Long value) {
            addCriterion("WOMEMPNUM <>", value, "womempnum");
            return (Criteria) this;
        }

        public Criteria andWomempnumGreaterThan(Long value) {
            addCriterion("WOMEMPNUM >", value, "womempnum");
            return (Criteria) this;
        }

        public Criteria andWomempnumGreaterThanOrEqualTo(Long value) {
            addCriterion("WOMEMPNUM >=", value, "womempnum");
            return (Criteria) this;
        }

        public Criteria andWomempnumLessThan(Long value) {
            addCriterion("WOMEMPNUM <", value, "womempnum");
            return (Criteria) this;
        }

        public Criteria andWomempnumLessThanOrEqualTo(Long value) {
            addCriterion("WOMEMPNUM <=", value, "womempnum");
            return (Criteria) this;
        }

        public Criteria andWomempnumIn(List<Long> values) {
            addCriterion("WOMEMPNUM in", values, "womempnum");
            return (Criteria) this;
        }

        public Criteria andWomempnumNotIn(List<Long> values) {
            addCriterion("WOMEMPNUM not in", values, "womempnum");
            return (Criteria) this;
        }

        public Criteria andWomempnumBetween(Long value1, Long value2) {
            addCriterion("WOMEMPNUM between", value1, value2, "womempnum");
            return (Criteria) this;
        }

        public Criteria andWomempnumNotBetween(Long value1, Long value2) {
            addCriterion("WOMEMPNUM not between", value1, value2, "womempnum");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgIsNull() {
            addCriterion("HOLDINGSMSG is null");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgIsNotNull() {
            addCriterion("HOLDINGSMSG is not null");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgEqualTo(String value) {
            addCriterion("HOLDINGSMSG =", value, "holdingsmsg");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgNotEqualTo(String value) {
            addCriterion("HOLDINGSMSG <>", value, "holdingsmsg");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgGreaterThan(String value) {
            addCriterion("HOLDINGSMSG >", value, "holdingsmsg");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgGreaterThanOrEqualTo(String value) {
            addCriterion("HOLDINGSMSG >=", value, "holdingsmsg");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgLessThan(String value) {
            addCriterion("HOLDINGSMSG <", value, "holdingsmsg");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgLessThanOrEqualTo(String value) {
            addCriterion("HOLDINGSMSG <=", value, "holdingsmsg");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgLike(String value) {
            addCriterion("HOLDINGSMSG like", value, "holdingsmsg");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgNotLike(String value) {
            addCriterion("HOLDINGSMSG not like", value, "holdingsmsg");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgIn(List<String> values) {
            addCriterion("HOLDINGSMSG in", values, "holdingsmsg");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgNotIn(List<String> values) {
            addCriterion("HOLDINGSMSG not in", values, "holdingsmsg");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgBetween(String value1, String value2) {
            addCriterion("HOLDINGSMSG between", value1, value2, "holdingsmsg");
            return (Criteria) this;
        }

        public Criteria andHoldingsmsgNotBetween(String value1, String value2) {
            addCriterion("HOLDINGSMSG not between", value1, value2, "holdingsmsg");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidIsNull() {
            addCriterion("RELATIONTOUISCID is null");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidIsNotNull() {
            addCriterion("RELATIONTOUISCID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidEqualTo(String value) {
            addCriterion("RELATIONTOUISCID =", value, "relationtouiscid");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidNotEqualTo(String value) {
            addCriterion("RELATIONTOUISCID <>", value, "relationtouiscid");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidGreaterThan(String value) {
            addCriterion("RELATIONTOUISCID >", value, "relationtouiscid");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidGreaterThanOrEqualTo(String value) {
            addCriterion("RELATIONTOUISCID >=", value, "relationtouiscid");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidLessThan(String value) {
            addCriterion("RELATIONTOUISCID <", value, "relationtouiscid");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidLessThanOrEqualTo(String value) {
            addCriterion("RELATIONTOUISCID <=", value, "relationtouiscid");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidLike(String value) {
            addCriterion("RELATIONTOUISCID like", value, "relationtouiscid");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidNotLike(String value) {
            addCriterion("RELATIONTOUISCID not like", value, "relationtouiscid");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidIn(List<String> values) {
            addCriterion("RELATIONTOUISCID in", values, "relationtouiscid");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidNotIn(List<String> values) {
            addCriterion("RELATIONTOUISCID not in", values, "relationtouiscid");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidBetween(String value1, String value2) {
            addCriterion("RELATIONTOUISCID between", value1, value2, "relationtouiscid");
            return (Criteria) this;
        }

        public Criteria andRelationtouiscidNotBetween(String value1, String value2) {
            addCriterion("RELATIONTOUISCID not between", value1, value2, "relationtouiscid");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumIsNull() {
            addCriterion("IFPUBWOMEMPNUM is null");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumIsNotNull() {
            addCriterion("IFPUBWOMEMPNUM is not null");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumEqualTo(String value) {
            addCriterion("IFPUBWOMEMPNUM =", value, "ifpubwomempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumNotEqualTo(String value) {
            addCriterion("IFPUBWOMEMPNUM <>", value, "ifpubwomempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumGreaterThan(String value) {
            addCriterion("IFPUBWOMEMPNUM >", value, "ifpubwomempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumGreaterThanOrEqualTo(String value) {
            addCriterion("IFPUBWOMEMPNUM >=", value, "ifpubwomempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumLessThan(String value) {
            addCriterion("IFPUBWOMEMPNUM <", value, "ifpubwomempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumLessThanOrEqualTo(String value) {
            addCriterion("IFPUBWOMEMPNUM <=", value, "ifpubwomempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumLike(String value) {
            addCriterion("IFPUBWOMEMPNUM like", value, "ifpubwomempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumNotLike(String value) {
            addCriterion("IFPUBWOMEMPNUM not like", value, "ifpubwomempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumIn(List<String> values) {
            addCriterion("IFPUBWOMEMPNUM in", values, "ifpubwomempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumNotIn(List<String> values) {
            addCriterion("IFPUBWOMEMPNUM not in", values, "ifpubwomempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumBetween(String value1, String value2) {
            addCriterion("IFPUBWOMEMPNUM between", value1, value2, "ifpubwomempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubwomempnumNotBetween(String value1, String value2) {
            addCriterion("IFPUBWOMEMPNUM not between", value1, value2, "ifpubwomempnum");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgIsNull() {
            addCriterion("IFPUBHOLDINGSMSG is null");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgIsNotNull() {
            addCriterion("IFPUBHOLDINGSMSG is not null");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgEqualTo(String value) {
            addCriterion("IFPUBHOLDINGSMSG =", value, "ifpubholdingsmsg");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgNotEqualTo(String value) {
            addCriterion("IFPUBHOLDINGSMSG <>", value, "ifpubholdingsmsg");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgGreaterThan(String value) {
            addCriterion("IFPUBHOLDINGSMSG >", value, "ifpubholdingsmsg");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgGreaterThanOrEqualTo(String value) {
            addCriterion("IFPUBHOLDINGSMSG >=", value, "ifpubholdingsmsg");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgLessThan(String value) {
            addCriterion("IFPUBHOLDINGSMSG <", value, "ifpubholdingsmsg");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgLessThanOrEqualTo(String value) {
            addCriterion("IFPUBHOLDINGSMSG <=", value, "ifpubholdingsmsg");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgLike(String value) {
            addCriterion("IFPUBHOLDINGSMSG like", value, "ifpubholdingsmsg");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgNotLike(String value) {
            addCriterion("IFPUBHOLDINGSMSG not like", value, "ifpubholdingsmsg");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgIn(List<String> values) {
            addCriterion("IFPUBHOLDINGSMSG in", values, "ifpubholdingsmsg");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgNotIn(List<String> values) {
            addCriterion("IFPUBHOLDINGSMSG not in", values, "ifpubholdingsmsg");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgBetween(String value1, String value2) {
            addCriterion("IFPUBHOLDINGSMSG between", value1, value2, "ifpubholdingsmsg");
            return (Criteria) this;
        }

        public Criteria andIfpubholdingsmsgNotBetween(String value1, String value2) {
            addCriterion("IFPUBHOLDINGSMSG not between", value1, value2, "ifpubholdingsmsg");
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

        public Criteria andRegorgNameIsNull() {
            addCriterion("REGORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRegorgNameIsNotNull() {
            addCriterion("REGORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRegorgNameEqualTo(String value) {
            addCriterion("REGORG_NAME =", value, "regorgName");
            return (Criteria) this;
        }

        public Criteria andRegorgNameNotEqualTo(String value) {
            addCriterion("REGORG_NAME <>", value, "regorgName");
            return (Criteria) this;
        }

        public Criteria andRegorgNameGreaterThan(String value) {
            addCriterion("REGORG_NAME >", value, "regorgName");
            return (Criteria) this;
        }

        public Criteria andRegorgNameGreaterThanOrEqualTo(String value) {
            addCriterion("REGORG_NAME >=", value, "regorgName");
            return (Criteria) this;
        }

        public Criteria andRegorgNameLessThan(String value) {
            addCriterion("REGORG_NAME <", value, "regorgName");
            return (Criteria) this;
        }

        public Criteria andRegorgNameLessThanOrEqualTo(String value) {
            addCriterion("REGORG_NAME <=", value, "regorgName");
            return (Criteria) this;
        }

        public Criteria andRegorgNameLike(String value) {
            addCriterion("REGORG_NAME like", value, "regorgName");
            return (Criteria) this;
        }

        public Criteria andRegorgNameNotLike(String value) {
            addCriterion("REGORG_NAME not like", value, "regorgName");
            return (Criteria) this;
        }

        public Criteria andRegorgNameIn(List<String> values) {
            addCriterion("REGORG_NAME in", values, "regorgName");
            return (Criteria) this;
        }

        public Criteria andRegorgNameNotIn(List<String> values) {
            addCriterion("REGORG_NAME not in", values, "regorgName");
            return (Criteria) this;
        }

        public Criteria andRegorgNameBetween(String value1, String value2) {
            addCriterion("REGORG_NAME between", value1, value2, "regorgName");
            return (Criteria) this;
        }

        public Criteria andRegorgNameNotBetween(String value1, String value2) {
            addCriterion("REGORG_NAME not between", value1, value2, "regorgName");
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

        public Criteria andEnttypeNameIsNull() {
            addCriterion("ENTTYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEnttypeNameIsNotNull() {
            addCriterion("ENTTYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnttypeNameEqualTo(String value) {
            addCriterion("ENTTYPE_NAME =", value, "enttypeName");
            return (Criteria) this;
        }

        public Criteria andEnttypeNameNotEqualTo(String value) {
            addCriterion("ENTTYPE_NAME <>", value, "enttypeName");
            return (Criteria) this;
        }

        public Criteria andEnttypeNameGreaterThan(String value) {
            addCriterion("ENTTYPE_NAME >", value, "enttypeName");
            return (Criteria) this;
        }

        public Criteria andEnttypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTTYPE_NAME >=", value, "enttypeName");
            return (Criteria) this;
        }

        public Criteria andEnttypeNameLessThan(String value) {
            addCriterion("ENTTYPE_NAME <", value, "enttypeName");
            return (Criteria) this;
        }

        public Criteria andEnttypeNameLessThanOrEqualTo(String value) {
            addCriterion("ENTTYPE_NAME <=", value, "enttypeName");
            return (Criteria) this;
        }

        public Criteria andEnttypeNameLike(String value) {
            addCriterion("ENTTYPE_NAME like", value, "enttypeName");
            return (Criteria) this;
        }

        public Criteria andEnttypeNameNotLike(String value) {
            addCriterion("ENTTYPE_NAME not like", value, "enttypeName");
            return (Criteria) this;
        }

        public Criteria andEnttypeNameIn(List<String> values) {
            addCriterion("ENTTYPE_NAME in", values, "enttypeName");
            return (Criteria) this;
        }

        public Criteria andEnttypeNameNotIn(List<String> values) {
            addCriterion("ENTTYPE_NAME not in", values, "enttypeName");
            return (Criteria) this;
        }

        public Criteria andEnttypeNameBetween(String value1, String value2) {
            addCriterion("ENTTYPE_NAME between", value1, value2, "enttypeName");
            return (Criteria) this;
        }

        public Criteria andEnttypeNameNotBetween(String value1, String value2) {
            addCriterion("ENTTYPE_NAME not between", value1, value2, "enttypeName");
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

        public Criteria andIndustryphyNameIsNull() {
            addCriterion("INDUSTRYPHY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNameIsNotNull() {
            addCriterion("INDUSTRYPHY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNameEqualTo(String value) {
            addCriterion("INDUSTRYPHY_NAME =", value, "industryphyName");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNameNotEqualTo(String value) {
            addCriterion("INDUSTRYPHY_NAME <>", value, "industryphyName");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNameGreaterThan(String value) {
            addCriterion("INDUSTRYPHY_NAME >", value, "industryphyName");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNameGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRYPHY_NAME >=", value, "industryphyName");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNameLessThan(String value) {
            addCriterion("INDUSTRYPHY_NAME <", value, "industryphyName");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNameLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRYPHY_NAME <=", value, "industryphyName");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNameLike(String value) {
            addCriterion("INDUSTRYPHY_NAME like", value, "industryphyName");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNameNotLike(String value) {
            addCriterion("INDUSTRYPHY_NAME not like", value, "industryphyName");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNameIn(List<String> values) {
            addCriterion("INDUSTRYPHY_NAME in", values, "industryphyName");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNameNotIn(List<String> values) {
            addCriterion("INDUSTRYPHY_NAME not in", values, "industryphyName");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNameBetween(String value1, String value2) {
            addCriterion("INDUSTRYPHY_NAME between", value1, value2, "industryphyName");
            return (Criteria) this;
        }

        public Criteria andIndustryphyNameNotBetween(String value1, String value2) {
            addCriterion("INDUSTRYPHY_NAME not between", value1, value2, "industryphyName");
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

        public Criteria andIndustrycoNameIsNull() {
            addCriterion("INDUSTRYCO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNameIsNotNull() {
            addCriterion("INDUSTRYCO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNameEqualTo(String value) {
            addCriterion("INDUSTRYCO_NAME =", value, "industrycoName");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNameNotEqualTo(String value) {
            addCriterion("INDUSTRYCO_NAME <>", value, "industrycoName");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNameGreaterThan(String value) {
            addCriterion("INDUSTRYCO_NAME >", value, "industrycoName");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNameGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRYCO_NAME >=", value, "industrycoName");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNameLessThan(String value) {
            addCriterion("INDUSTRYCO_NAME <", value, "industrycoName");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNameLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRYCO_NAME <=", value, "industrycoName");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNameLike(String value) {
            addCriterion("INDUSTRYCO_NAME like", value, "industrycoName");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNameNotLike(String value) {
            addCriterion("INDUSTRYCO_NAME not like", value, "industrycoName");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNameIn(List<String> values) {
            addCriterion("INDUSTRYCO_NAME in", values, "industrycoName");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNameNotIn(List<String> values) {
            addCriterion("INDUSTRYCO_NAME not in", values, "industrycoName");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNameBetween(String value1, String value2) {
            addCriterion("INDUSTRYCO_NAME between", value1, value2, "industrycoName");
            return (Criteria) this;
        }

        public Criteria andIndustrycoNameNotBetween(String value1, String value2) {
            addCriterion("INDUSTRYCO_NAME not between", value1, value2, "industrycoName");
            return (Criteria) this;
        }

        public Criteria andLocaladminIsNull() {
            addCriterion("LOCALADMIN is null");
            return (Criteria) this;
        }

        public Criteria andLocaladminIsNotNull() {
            addCriterion("LOCALADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andLocaladminEqualTo(String value) {
            addCriterion("LOCALADMIN =", value, "localadmin");
            return (Criteria) this;
        }

        public Criteria andLocaladminNotEqualTo(String value) {
            addCriterion("LOCALADMIN <>", value, "localadmin");
            return (Criteria) this;
        }

        public Criteria andLocaladminGreaterThan(String value) {
            addCriterion("LOCALADMIN >", value, "localadmin");
            return (Criteria) this;
        }

        public Criteria andLocaladminGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALADMIN >=", value, "localadmin");
            return (Criteria) this;
        }

        public Criteria andLocaladminLessThan(String value) {
            addCriterion("LOCALADMIN <", value, "localadmin");
            return (Criteria) this;
        }

        public Criteria andLocaladminLessThanOrEqualTo(String value) {
            addCriterion("LOCALADMIN <=", value, "localadmin");
            return (Criteria) this;
        }

        public Criteria andLocaladminLike(String value) {
            addCriterion("LOCALADMIN like", value, "localadmin");
            return (Criteria) this;
        }

        public Criteria andLocaladminNotLike(String value) {
            addCriterion("LOCALADMIN not like", value, "localadmin");
            return (Criteria) this;
        }

        public Criteria andLocaladminIn(List<String> values) {
            addCriterion("LOCALADMIN in", values, "localadmin");
            return (Criteria) this;
        }

        public Criteria andLocaladminNotIn(List<String> values) {
            addCriterion("LOCALADMIN not in", values, "localadmin");
            return (Criteria) this;
        }

        public Criteria andLocaladminBetween(String value1, String value2) {
            addCriterion("LOCALADMIN between", value1, value2, "localadmin");
            return (Criteria) this;
        }

        public Criteria andLocaladminNotBetween(String value1, String value2) {
            addCriterion("LOCALADMIN not between", value1, value2, "localadmin");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameIsNull() {
            addCriterion("LOCALADMIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameIsNotNull() {
            addCriterion("LOCALADMIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameEqualTo(String value) {
            addCriterion("LOCALADMIN_NAME =", value, "localadminName");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameNotEqualTo(String value) {
            addCriterion("LOCALADMIN_NAME <>", value, "localadminName");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameGreaterThan(String value) {
            addCriterion("LOCALADMIN_NAME >", value, "localadminName");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALADMIN_NAME >=", value, "localadminName");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameLessThan(String value) {
            addCriterion("LOCALADMIN_NAME <", value, "localadminName");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameLessThanOrEqualTo(String value) {
            addCriterion("LOCALADMIN_NAME <=", value, "localadminName");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameLike(String value) {
            addCriterion("LOCALADMIN_NAME like", value, "localadminName");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameNotLike(String value) {
            addCriterion("LOCALADMIN_NAME not like", value, "localadminName");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameIn(List<String> values) {
            addCriterion("LOCALADMIN_NAME in", values, "localadminName");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameNotIn(List<String> values) {
            addCriterion("LOCALADMIN_NAME not in", values, "localadminName");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameBetween(String value1, String value2) {
            addCriterion("LOCALADMIN_NAME between", value1, value2, "localadminName");
            return (Criteria) this;
        }

        public Criteria andLocaladminNameNotBetween(String value1, String value2) {
            addCriterion("LOCALADMIN_NAME not between", value1, value2, "localadminName");
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

        public Criteria andEntstatusEqualTo(String value) {
            addCriterion("ENTSTATUS =", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusNotEqualTo(String value) {
            addCriterion("ENTSTATUS <>", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusGreaterThan(String value) {
            addCriterion("ENTSTATUS >", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ENTSTATUS >=", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusLessThan(String value) {
            addCriterion("ENTSTATUS <", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusLessThanOrEqualTo(String value) {
            addCriterion("ENTSTATUS <=", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusLike(String value) {
            addCriterion("ENTSTATUS like", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusNotLike(String value) {
            addCriterion("ENTSTATUS not like", value, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusIn(List<String> values) {
            addCriterion("ENTSTATUS in", values, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusNotIn(List<String> values) {
            addCriterion("ENTSTATUS not in", values, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusBetween(String value1, String value2) {
            addCriterion("ENTSTATUS between", value1, value2, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusNotBetween(String value1, String value2) {
            addCriterion("ENTSTATUS not between", value1, value2, "entstatus");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameIsNull() {
            addCriterion("ENTSTATUS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameIsNotNull() {
            addCriterion("ENTSTATUS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameEqualTo(String value) {
            addCriterion("ENTSTATUS_NAME =", value, "entstatusName");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameNotEqualTo(String value) {
            addCriterion("ENTSTATUS_NAME <>", value, "entstatusName");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameGreaterThan(String value) {
            addCriterion("ENTSTATUS_NAME >", value, "entstatusName");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTSTATUS_NAME >=", value, "entstatusName");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameLessThan(String value) {
            addCriterion("ENTSTATUS_NAME <", value, "entstatusName");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameLessThanOrEqualTo(String value) {
            addCriterion("ENTSTATUS_NAME <=", value, "entstatusName");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameLike(String value) {
            addCriterion("ENTSTATUS_NAME like", value, "entstatusName");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameNotLike(String value) {
            addCriterion("ENTSTATUS_NAME not like", value, "entstatusName");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameIn(List<String> values) {
            addCriterion("ENTSTATUS_NAME in", values, "entstatusName");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameNotIn(List<String> values) {
            addCriterion("ENTSTATUS_NAME not in", values, "entstatusName");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameBetween(String value1, String value2) {
            addCriterion("ENTSTATUS_NAME between", value1, value2, "entstatusName");
            return (Criteria) this;
        }

        public Criteria andEntstatusNameNotBetween(String value1, String value2) {
            addCriterion("ENTSTATUS_NAME not between", value1, value2, "entstatusName");
            return (Criteria) this;
        }

        public Criteria andMemnumIsNull() {
            addCriterion("MEMNUM is null");
            return (Criteria) this;
        }

        public Criteria andMemnumIsNotNull() {
            addCriterion("MEMNUM is not null");
            return (Criteria) this;
        }

        public Criteria andMemnumEqualTo(Integer value) {
            addCriterion("MEMNUM =", value, "memnum");
            return (Criteria) this;
        }

        public Criteria andMemnumNotEqualTo(Integer value) {
            addCriterion("MEMNUM <>", value, "memnum");
            return (Criteria) this;
        }

        public Criteria andMemnumGreaterThan(Integer value) {
            addCriterion("MEMNUM >", value, "memnum");
            return (Criteria) this;
        }

        public Criteria andMemnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMNUM >=", value, "memnum");
            return (Criteria) this;
        }

        public Criteria andMemnumLessThan(Integer value) {
            addCriterion("MEMNUM <", value, "memnum");
            return (Criteria) this;
        }

        public Criteria andMemnumLessThanOrEqualTo(Integer value) {
            addCriterion("MEMNUM <=", value, "memnum");
            return (Criteria) this;
        }

        public Criteria andMemnumIn(List<Integer> values) {
            addCriterion("MEMNUM in", values, "memnum");
            return (Criteria) this;
        }

        public Criteria andMemnumNotIn(List<Integer> values) {
            addCriterion("MEMNUM not in", values, "memnum");
            return (Criteria) this;
        }

        public Criteria andMemnumBetween(Integer value1, Integer value2) {
            addCriterion("MEMNUM between", value1, value2, "memnum");
            return (Criteria) this;
        }

        public Criteria andMemnumNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMNUM not between", value1, value2, "memnum");
            return (Criteria) this;
        }

        public Criteria andFarnumIsNull() {
            addCriterion("FARNUM is null");
            return (Criteria) this;
        }

        public Criteria andFarnumIsNotNull() {
            addCriterion("FARNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFarnumEqualTo(Integer value) {
            addCriterion("FARNUM =", value, "farnum");
            return (Criteria) this;
        }

        public Criteria andFarnumNotEqualTo(Integer value) {
            addCriterion("FARNUM <>", value, "farnum");
            return (Criteria) this;
        }

        public Criteria andFarnumGreaterThan(Integer value) {
            addCriterion("FARNUM >", value, "farnum");
            return (Criteria) this;
        }

        public Criteria andFarnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("FARNUM >=", value, "farnum");
            return (Criteria) this;
        }

        public Criteria andFarnumLessThan(Integer value) {
            addCriterion("FARNUM <", value, "farnum");
            return (Criteria) this;
        }

        public Criteria andFarnumLessThanOrEqualTo(Integer value) {
            addCriterion("FARNUM <=", value, "farnum");
            return (Criteria) this;
        }

        public Criteria andFarnumIn(List<Integer> values) {
            addCriterion("FARNUM in", values, "farnum");
            return (Criteria) this;
        }

        public Criteria andFarnumNotIn(List<Integer> values) {
            addCriterion("FARNUM not in", values, "farnum");
            return (Criteria) this;
        }

        public Criteria andFarnumBetween(Integer value1, Integer value2) {
            addCriterion("FARNUM between", value1, value2, "farnum");
            return (Criteria) this;
        }

        public Criteria andFarnumNotBetween(Integer value1, Integer value2) {
            addCriterion("FARNUM not between", value1, value2, "farnum");
            return (Criteria) this;
        }

        public Criteria andAnnnewmemnumIsNull() {
            addCriterion("ANNNEWMEMNUM is null");
            return (Criteria) this;
        }

        public Criteria andAnnnewmemnumIsNotNull() {
            addCriterion("ANNNEWMEMNUM is not null");
            return (Criteria) this;
        }

        public Criteria andAnnnewmemnumEqualTo(Integer value) {
            addCriterion("ANNNEWMEMNUM =", value, "annnewmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnnewmemnumNotEqualTo(Integer value) {
            addCriterion("ANNNEWMEMNUM <>", value, "annnewmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnnewmemnumGreaterThan(Integer value) {
            addCriterion("ANNNEWMEMNUM >", value, "annnewmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnnewmemnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ANNNEWMEMNUM >=", value, "annnewmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnnewmemnumLessThan(Integer value) {
            addCriterion("ANNNEWMEMNUM <", value, "annnewmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnnewmemnumLessThanOrEqualTo(Integer value) {
            addCriterion("ANNNEWMEMNUM <=", value, "annnewmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnnewmemnumIn(List<Integer> values) {
            addCriterion("ANNNEWMEMNUM in", values, "annnewmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnnewmemnumNotIn(List<Integer> values) {
            addCriterion("ANNNEWMEMNUM not in", values, "annnewmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnnewmemnumBetween(Integer value1, Integer value2) {
            addCriterion("ANNNEWMEMNUM between", value1, value2, "annnewmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnnewmemnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ANNNEWMEMNUM not between", value1, value2, "annnewmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnredmemnumIsNull() {
            addCriterion("ANNREDMEMNUM is null");
            return (Criteria) this;
        }

        public Criteria andAnnredmemnumIsNotNull() {
            addCriterion("ANNREDMEMNUM is not null");
            return (Criteria) this;
        }

        public Criteria andAnnredmemnumEqualTo(Integer value) {
            addCriterion("ANNREDMEMNUM =", value, "annredmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnredmemnumNotEqualTo(Integer value) {
            addCriterion("ANNREDMEMNUM <>", value, "annredmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnredmemnumGreaterThan(Integer value) {
            addCriterion("ANNREDMEMNUM >", value, "annredmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnredmemnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ANNREDMEMNUM >=", value, "annredmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnredmemnumLessThan(Integer value) {
            addCriterion("ANNREDMEMNUM <", value, "annredmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnredmemnumLessThanOrEqualTo(Integer value) {
            addCriterion("ANNREDMEMNUM <=", value, "annredmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnredmemnumIn(List<Integer> values) {
            addCriterion("ANNREDMEMNUM in", values, "annredmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnredmemnumNotIn(List<Integer> values) {
            addCriterion("ANNREDMEMNUM not in", values, "annredmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnredmemnumBetween(Integer value1, Integer value2) {
            addCriterion("ANNREDMEMNUM between", value1, value2, "annredmemnum");
            return (Criteria) this;
        }

        public Criteria andAnnredmemnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ANNREDMEMNUM not between", value1, value2, "annredmemnum");
            return (Criteria) this;
        }

        public Criteria andIfhaswebIsNull() {
            addCriterion("IFHASWEB is null");
            return (Criteria) this;
        }

        public Criteria andIfhaswebIsNotNull() {
            addCriterion("IFHASWEB is not null");
            return (Criteria) this;
        }

        public Criteria andIfhaswebEqualTo(String value) {
            addCriterion("IFHASWEB =", value, "ifhasweb");
            return (Criteria) this;
        }

        public Criteria andIfhaswebNotEqualTo(String value) {
            addCriterion("IFHASWEB <>", value, "ifhasweb");
            return (Criteria) this;
        }

        public Criteria andIfhaswebGreaterThan(String value) {
            addCriterion("IFHASWEB >", value, "ifhasweb");
            return (Criteria) this;
        }

        public Criteria andIfhaswebGreaterThanOrEqualTo(String value) {
            addCriterion("IFHASWEB >=", value, "ifhasweb");
            return (Criteria) this;
        }

        public Criteria andIfhaswebLessThan(String value) {
            addCriterion("IFHASWEB <", value, "ifhasweb");
            return (Criteria) this;
        }

        public Criteria andIfhaswebLessThanOrEqualTo(String value) {
            addCriterion("IFHASWEB <=", value, "ifhasweb");
            return (Criteria) this;
        }

        public Criteria andIfhaswebLike(String value) {
            addCriterion("IFHASWEB like", value, "ifhasweb");
            return (Criteria) this;
        }

        public Criteria andIfhaswebNotLike(String value) {
            addCriterion("IFHASWEB not like", value, "ifhasweb");
            return (Criteria) this;
        }

        public Criteria andIfhaswebIn(List<String> values) {
            addCriterion("IFHASWEB in", values, "ifhasweb");
            return (Criteria) this;
        }

        public Criteria andIfhaswebNotIn(List<String> values) {
            addCriterion("IFHASWEB not in", values, "ifhasweb");
            return (Criteria) this;
        }

        public Criteria andIfhaswebBetween(String value1, String value2) {
            addCriterion("IFHASWEB between", value1, value2, "ifhasweb");
            return (Criteria) this;
        }

        public Criteria andIfhaswebNotBetween(String value1, String value2) {
            addCriterion("IFHASWEB not between", value1, value2, "ifhasweb");
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

        public Criteria andEntcatNameIsNull() {
            addCriterion("ENTCAT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEntcatNameIsNotNull() {
            addCriterion("ENTCAT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntcatNameEqualTo(String value) {
            addCriterion("ENTCAT_NAME =", value, "entcatName");
            return (Criteria) this;
        }

        public Criteria andEntcatNameNotEqualTo(String value) {
            addCriterion("ENTCAT_NAME <>", value, "entcatName");
            return (Criteria) this;
        }

        public Criteria andEntcatNameGreaterThan(String value) {
            addCriterion("ENTCAT_NAME >", value, "entcatName");
            return (Criteria) this;
        }

        public Criteria andEntcatNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTCAT_NAME >=", value, "entcatName");
            return (Criteria) this;
        }

        public Criteria andEntcatNameLessThan(String value) {
            addCriterion("ENTCAT_NAME <", value, "entcatName");
            return (Criteria) this;
        }

        public Criteria andEntcatNameLessThanOrEqualTo(String value) {
            addCriterion("ENTCAT_NAME <=", value, "entcatName");
            return (Criteria) this;
        }

        public Criteria andEntcatNameLike(String value) {
            addCriterion("ENTCAT_NAME like", value, "entcatName");
            return (Criteria) this;
        }

        public Criteria andEntcatNameNotLike(String value) {
            addCriterion("ENTCAT_NAME not like", value, "entcatName");
            return (Criteria) this;
        }

        public Criteria andEntcatNameIn(List<String> values) {
            addCriterion("ENTCAT_NAME in", values, "entcatName");
            return (Criteria) this;
        }

        public Criteria andEntcatNameNotIn(List<String> values) {
            addCriterion("ENTCAT_NAME not in", values, "entcatName");
            return (Criteria) this;
        }

        public Criteria andEntcatNameBetween(String value1, String value2) {
            addCriterion("ENTCAT_NAME between", value1, value2, "entcatName");
            return (Criteria) this;
        }

        public Criteria andEntcatNameNotBetween(String value1, String value2) {
            addCriterion("ENTCAT_NAME not between", value1, value2, "entcatName");
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