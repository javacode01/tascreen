package com.yawei.model.gsyw;

import com.sys.utils.BeanUtils;
import com.sys.utils.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ZtdjJbxxZsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ZtdjJbxxZsExample() {
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

        public Criteria andEntidIsNull() {
            addCriterion("ENTID is null");
            return (Criteria) this;
        }

        public Criteria andEntidIsNotNull() {
            addCriterion("ENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEntidEqualTo(String value) {
            addCriterion("ENTID =", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotEqualTo(String value) {
            addCriterion("ENTID <>", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThan(String value) {
            addCriterion("ENTID >", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThanOrEqualTo(String value) {
            addCriterion("ENTID >=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThan(String value) {
            addCriterion("ENTID <", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThanOrEqualTo(String value) {
            addCriterion("ENTID <=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLike(String value) {
            addCriterion("ENTID like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotLike(String value) {
            addCriterion("ENTID not like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidIn(List<String> values) {
            addCriterion("ENTID in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotIn(List<String> values) {
            addCriterion("ENTID not in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidBetween(String value1, String value2) {
            addCriterion("ENTID between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotBetween(String value1, String value2) {
            addCriterion("ENTID not between", value1, value2, "entid");
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

        public Criteria andLocalorgNameIsNull() {
            addCriterion("LOCALORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLocalorgNameIsNotNull() {
            addCriterion("LOCALORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLocalorgNameEqualTo(String value) {
            addCriterion("LOCALORG_NAME =", value, "localorgName");
            return (Criteria) this;
        }

        public Criteria andLocalorgNameNotEqualTo(String value) {
            addCriterion("LOCALORG_NAME <>", value, "localorgName");
            return (Criteria) this;
        }

        public Criteria andLocalorgNameGreaterThan(String value) {
            addCriterion("LOCALORG_NAME >", value, "localorgName");
            return (Criteria) this;
        }

        public Criteria andLocalorgNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALORG_NAME >=", value, "localorgName");
            return (Criteria) this;
        }

        public Criteria andLocalorgNameLessThan(String value) {
            addCriterion("LOCALORG_NAME <", value, "localorgName");
            return (Criteria) this;
        }

        public Criteria andLocalorgNameLessThanOrEqualTo(String value) {
            addCriterion("LOCALORG_NAME <=", value, "localorgName");
            return (Criteria) this;
        }

        public Criteria andLocalorgNameLike(String value) {
            addCriterion("LOCALORG_NAME like", value, "localorgName");
            return (Criteria) this;
        }

        public Criteria andLocalorgNameNotLike(String value) {
            addCriterion("LOCALORG_NAME not like", value, "localorgName");
            return (Criteria) this;
        }

        public Criteria andLocalorgNameIn(List<String> values) {
            addCriterion("LOCALORG_NAME in", values, "localorgName");
            return (Criteria) this;
        }

        public Criteria andLocalorgNameNotIn(List<String> values) {
            addCriterion("LOCALORG_NAME not in", values, "localorgName");
            return (Criteria) this;
        }

        public Criteria andLocalorgNameBetween(String value1, String value2) {
            addCriterion("LOCALORG_NAME between", value1, value2, "localorgName");
            return (Criteria) this;
        }

        public Criteria andLocalorgNameNotBetween(String value1, String value2) {
            addCriterion("LOCALORG_NAME not between", value1, value2, "localorgName");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameIsNull() {
            addCriterion("LOCALADM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameIsNotNull() {
            addCriterion("LOCALADM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameEqualTo(String value) {
            addCriterion("LOCALADM_NAME =", value, "localadmName");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameNotEqualTo(String value) {
            addCriterion("LOCALADM_NAME <>", value, "localadmName");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameGreaterThan(String value) {
            addCriterion("LOCALADM_NAME >", value, "localadmName");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALADM_NAME >=", value, "localadmName");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameLessThan(String value) {
            addCriterion("LOCALADM_NAME <", value, "localadmName");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameLessThanOrEqualTo(String value) {
            addCriterion("LOCALADM_NAME <=", value, "localadmName");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameLike(String value) {
            addCriterion("LOCALADM_NAME like", value, "localadmName");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameNotLike(String value) {
            addCriterion("LOCALADM_NAME not like", value, "localadmName");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameIn(List<String> values) {
            addCriterion("LOCALADM_NAME in", values, "localadmName");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameNotIn(List<String> values) {
            addCriterion("LOCALADM_NAME not in", values, "localadmName");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameBetween(String value1, String value2) {
            addCriterion("LOCALADM_NAME between", value1, value2, "localadmName");
            return (Criteria) this;
        }

        public Criteria andLocaladmNameNotBetween(String value1, String value2) {
            addCriterion("LOCALADM_NAME not between", value1, value2, "localadmName");
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

        public Criteria andIndustrytypeIsNull() {
            addCriterion("INDUSTRYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeIsNotNull() {
            addCriterion("INDUSTRYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeEqualTo(String value) {
            addCriterion("INDUSTRYTYPE =", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeNotEqualTo(String value) {
            addCriterion("INDUSTRYTYPE <>", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeGreaterThan(String value) {
            addCriterion("INDUSTRYTYPE >", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRYTYPE >=", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeLessThan(String value) {
            addCriterion("INDUSTRYTYPE <", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRYTYPE <=", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeLike(String value) {
            addCriterion("INDUSTRYTYPE like", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeNotLike(String value) {
            addCriterion("INDUSTRYTYPE not like", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeIn(List<String> values) {
            addCriterion("INDUSTRYTYPE in", values, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeNotIn(List<String> values) {
            addCriterion("INDUSTRYTYPE not in", values, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeBetween(String value1, String value2) {
            addCriterion("INDUSTRYTYPE between", value1, value2, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeNotBetween(String value1, String value2) {
            addCriterion("INDUSTRYTYPE not between", value1, value2, "industrytype");
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

        public Criteria andCernoIsNull() {
            addCriterion("CERNO is null");
            return (Criteria) this;
        }

        public Criteria andCernoIsNotNull() {
            addCriterion("CERNO is not null");
            return (Criteria) this;
        }

        public Criteria andCernoEqualTo(String value) {
            addCriterion("CERNO =", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoNotEqualTo(String value) {
            addCriterion("CERNO <>", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoGreaterThan(String value) {
            addCriterion("CERNO >", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoGreaterThanOrEqualTo(String value) {
            addCriterion("CERNO >=", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoLessThan(String value) {
            addCriterion("CERNO <", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoLessThanOrEqualTo(String value) {
            addCriterion("CERNO <=", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoLike(String value) {
            addCriterion("CERNO like", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoNotLike(String value) {
            addCriterion("CERNO not like", value, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoIn(List<String> values) {
            addCriterion("CERNO in", values, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoNotIn(List<String> values) {
            addCriterion("CERNO not in", values, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoBetween(String value1, String value2) {
            addCriterion("CERNO between", value1, value2, "cerno");
            return (Criteria) this;
        }

        public Criteria andCernoNotBetween(String value1, String value2) {
            addCriterion("CERNO not between", value1, value2, "cerno");
            return (Criteria) this;
        }

        public Criteria andQylxdlIsNull() {
            addCriterion("QYLXDL is null");
            return (Criteria) this;
        }

        public Criteria andQylxdlIsNotNull() {
            addCriterion("QYLXDL is not null");
            return (Criteria) this;
        }

        public Criteria andQylxdlEqualTo(String value) {
            addCriterion("QYLXDL =", value, "qylxdl");
            return (Criteria) this;
        }

        public Criteria andQylxdlNotEqualTo(String value) {
            addCriterion("QYLXDL <>", value, "qylxdl");
            return (Criteria) this;
        }

        public Criteria andQylxdlGreaterThan(String value) {
            addCriterion("QYLXDL >", value, "qylxdl");
            return (Criteria) this;
        }

        public Criteria andQylxdlGreaterThanOrEqualTo(String value) {
            addCriterion("QYLXDL >=", value, "qylxdl");
            return (Criteria) this;
        }

        public Criteria andQylxdlLessThan(String value) {
            addCriterion("QYLXDL <", value, "qylxdl");
            return (Criteria) this;
        }

        public Criteria andQylxdlLessThanOrEqualTo(String value) {
            addCriterion("QYLXDL <=", value, "qylxdl");
            return (Criteria) this;
        }

        public Criteria andQylxdlLike(String value) {
            addCriterion("QYLXDL like", value, "qylxdl");
            return (Criteria) this;
        }

        public Criteria andQylxdlNotLike(String value) {
            addCriterion("QYLXDL not like", value, "qylxdl");
            return (Criteria) this;
        }

        public Criteria andQylxdlIn(List<String> values) {
            addCriterion("QYLXDL in", values, "qylxdl");
            return (Criteria) this;
        }

        public Criteria andQylxdlNotIn(List<String> values) {
            addCriterion("QYLXDL not in", values, "qylxdl");
            return (Criteria) this;
        }

        public Criteria andQylxdlBetween(String value1, String value2) {
            addCriterion("QYLXDL between", value1, value2, "qylxdl");
            return (Criteria) this;
        }

        public Criteria andQylxdlNotBetween(String value1, String value2) {
            addCriterion("QYLXDL not between", value1, value2, "qylxdl");
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