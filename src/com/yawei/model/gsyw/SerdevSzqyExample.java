package com.yawei.model.gsyw;

import com.sys.utils.BeanUtils;
import com.sys.utils.Page;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SerdevSzqyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public SerdevSzqyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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

        public Criteria andBeginYearIsNull() {
            addCriterion("BEGIN_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andBeginYearIsNotNull() {
            addCriterion("BEGIN_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andBeginYearEqualTo(String value) {
            addCriterion("BEGIN_YEAR =", value, "beginYear");
            return (Criteria) this;
        }

        public Criteria andBeginYearNotEqualTo(String value) {
            addCriterion("BEGIN_YEAR <>", value, "beginYear");
            return (Criteria) this;
        }

        public Criteria andBeginYearGreaterThan(String value) {
            addCriterion("BEGIN_YEAR >", value, "beginYear");
            return (Criteria) this;
        }

        public Criteria andBeginYearGreaterThanOrEqualTo(String value) {
            addCriterion("BEGIN_YEAR >=", value, "beginYear");
            return (Criteria) this;
        }

        public Criteria andBeginYearLessThan(String value) {
            addCriterion("BEGIN_YEAR <", value, "beginYear");
            return (Criteria) this;
        }

        public Criteria andBeginYearLessThanOrEqualTo(String value) {
            addCriterion("BEGIN_YEAR <=", value, "beginYear");
            return (Criteria) this;
        }

        public Criteria andBeginYearLike(String value) {
            addCriterion("BEGIN_YEAR like", value, "beginYear");
            return (Criteria) this;
        }

        public Criteria andBeginYearNotLike(String value) {
            addCriterion("BEGIN_YEAR not like", value, "beginYear");
            return (Criteria) this;
        }

        public Criteria andBeginYearIn(List<String> values) {
            addCriterion("BEGIN_YEAR in", values, "beginYear");
            return (Criteria) this;
        }

        public Criteria andBeginYearNotIn(List<String> values) {
            addCriterion("BEGIN_YEAR not in", values, "beginYear");
            return (Criteria) this;
        }

        public Criteria andBeginYearBetween(String value1, String value2) {
            addCriterion("BEGIN_YEAR between", value1, value2, "beginYear");
            return (Criteria) this;
        }

        public Criteria andBeginYearNotBetween(String value1, String value2) {
            addCriterion("BEGIN_YEAR not between", value1, value2, "beginYear");
            return (Criteria) this;
        }

        public Criteria andEndYearIsNull() {
            addCriterion("END_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andEndYearIsNotNull() {
            addCriterion("END_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andEndYearEqualTo(String value) {
            addCriterion("END_YEAR =", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearNotEqualTo(String value) {
            addCriterion("END_YEAR <>", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearGreaterThan(String value) {
            addCriterion("END_YEAR >", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearGreaterThanOrEqualTo(String value) {
            addCriterion("END_YEAR >=", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearLessThan(String value) {
            addCriterion("END_YEAR <", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearLessThanOrEqualTo(String value) {
            addCriterion("END_YEAR <=", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearLike(String value) {
            addCriterion("END_YEAR like", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearNotLike(String value) {
            addCriterion("END_YEAR not like", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearIn(List<String> values) {
            addCriterion("END_YEAR in", values, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearNotIn(List<String> values) {
            addCriterion("END_YEAR not in", values, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearBetween(String value1, String value2) {
            addCriterion("END_YEAR between", value1, value2, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearNotBetween(String value1, String value2) {
            addCriterion("END_YEAR not between", value1, value2, "endYear");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
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