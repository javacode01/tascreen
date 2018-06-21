package com.yawei.model.gsywfh;

import com.sys.utils.BeanUtils;
import com.sys.utils.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class McglJbxxZsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public McglJbxxZsExample() {
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

        public Criteria andNameidIsNull() {
            addCriterion("NAMEID is null");
            return (Criteria) this;
        }

        public Criteria andNameidIsNotNull() {
            addCriterion("NAMEID is not null");
            return (Criteria) this;
        }

        public Criteria andNameidEqualTo(String value) {
            addCriterion("NAMEID =", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidNotEqualTo(String value) {
            addCriterion("NAMEID <>", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidGreaterThan(String value) {
            addCriterion("NAMEID >", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidGreaterThanOrEqualTo(String value) {
            addCriterion("NAMEID >=", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidLessThan(String value) {
            addCriterion("NAMEID <", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidLessThanOrEqualTo(String value) {
            addCriterion("NAMEID <=", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidLike(String value) {
            addCriterion("NAMEID like", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidNotLike(String value) {
            addCriterion("NAMEID not like", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidIn(List<String> values) {
            addCriterion("NAMEID in", values, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidNotIn(List<String> values) {
            addCriterion("NAMEID not in", values, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidBetween(String value1, String value2) {
            addCriterion("NAMEID between", value1, value2, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidNotBetween(String value1, String value2) {
            addCriterion("NAMEID not between", value1, value2, "nameid");
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

        public Criteria andNametypeIsNull() {
            addCriterion("NAMETYPE is null");
            return (Criteria) this;
        }

        public Criteria andNametypeIsNotNull() {
            addCriterion("NAMETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNametypeEqualTo(String value) {
            addCriterion("NAMETYPE =", value, "nametype");
            return (Criteria) this;
        }

        public Criteria andNametypeNotEqualTo(String value) {
            addCriterion("NAMETYPE <>", value, "nametype");
            return (Criteria) this;
        }

        public Criteria andNametypeGreaterThan(String value) {
            addCriterion("NAMETYPE >", value, "nametype");
            return (Criteria) this;
        }

        public Criteria andNametypeGreaterThanOrEqualTo(String value) {
            addCriterion("NAMETYPE >=", value, "nametype");
            return (Criteria) this;
        }

        public Criteria andNametypeLessThan(String value) {
            addCriterion("NAMETYPE <", value, "nametype");
            return (Criteria) this;
        }

        public Criteria andNametypeLessThanOrEqualTo(String value) {
            addCriterion("NAMETYPE <=", value, "nametype");
            return (Criteria) this;
        }

        public Criteria andNametypeLike(String value) {
            addCriterion("NAMETYPE like", value, "nametype");
            return (Criteria) this;
        }

        public Criteria andNametypeNotLike(String value) {
            addCriterion("NAMETYPE not like", value, "nametype");
            return (Criteria) this;
        }

        public Criteria andNametypeIn(List<String> values) {
            addCriterion("NAMETYPE in", values, "nametype");
            return (Criteria) this;
        }

        public Criteria andNametypeNotIn(List<String> values) {
            addCriterion("NAMETYPE not in", values, "nametype");
            return (Criteria) this;
        }

        public Criteria andNametypeBetween(String value1, String value2) {
            addCriterion("NAMETYPE between", value1, value2, "nametype");
            return (Criteria) this;
        }

        public Criteria andNametypeNotBetween(String value1, String value2) {
            addCriterion("NAMETYPE not between", value1, value2, "nametype");
            return (Criteria) this;
        }

        public Criteria andEnttraIsNull() {
            addCriterion("ENTTRA is null");
            return (Criteria) this;
        }

        public Criteria andEnttraIsNotNull() {
            addCriterion("ENTTRA is not null");
            return (Criteria) this;
        }

        public Criteria andEnttraEqualTo(String value) {
            addCriterion("ENTTRA =", value, "enttra");
            return (Criteria) this;
        }

        public Criteria andEnttraNotEqualTo(String value) {
            addCriterion("ENTTRA <>", value, "enttra");
            return (Criteria) this;
        }

        public Criteria andEnttraGreaterThan(String value) {
            addCriterion("ENTTRA >", value, "enttra");
            return (Criteria) this;
        }

        public Criteria andEnttraGreaterThanOrEqualTo(String value) {
            addCriterion("ENTTRA >=", value, "enttra");
            return (Criteria) this;
        }

        public Criteria andEnttraLessThan(String value) {
            addCriterion("ENTTRA <", value, "enttra");
            return (Criteria) this;
        }

        public Criteria andEnttraLessThanOrEqualTo(String value) {
            addCriterion("ENTTRA <=", value, "enttra");
            return (Criteria) this;
        }

        public Criteria andEnttraLike(String value) {
            addCriterion("ENTTRA like", value, "enttra");
            return (Criteria) this;
        }

        public Criteria andEnttraNotLike(String value) {
            addCriterion("ENTTRA not like", value, "enttra");
            return (Criteria) this;
        }

        public Criteria andEnttraIn(List<String> values) {
            addCriterion("ENTTRA in", values, "enttra");
            return (Criteria) this;
        }

        public Criteria andEnttraNotIn(List<String> values) {
            addCriterion("ENTTRA not in", values, "enttra");
            return (Criteria) this;
        }

        public Criteria andEnttraBetween(String value1, String value2) {
            addCriterion("ENTTRA between", value1, value2, "enttra");
            return (Criteria) this;
        }

        public Criteria andEnttraNotBetween(String value1, String value2) {
            addCriterion("ENTTRA not between", value1, value2, "enttra");
            return (Criteria) this;
        }

        public Criteria andTradpinyIsNull() {
            addCriterion("TRADPINY is null");
            return (Criteria) this;
        }

        public Criteria andTradpinyIsNotNull() {
            addCriterion("TRADPINY is not null");
            return (Criteria) this;
        }

        public Criteria andTradpinyEqualTo(String value) {
            addCriterion("TRADPINY =", value, "tradpiny");
            return (Criteria) this;
        }

        public Criteria andTradpinyNotEqualTo(String value) {
            addCriterion("TRADPINY <>", value, "tradpiny");
            return (Criteria) this;
        }

        public Criteria andTradpinyGreaterThan(String value) {
            addCriterion("TRADPINY >", value, "tradpiny");
            return (Criteria) this;
        }

        public Criteria andTradpinyGreaterThanOrEqualTo(String value) {
            addCriterion("TRADPINY >=", value, "tradpiny");
            return (Criteria) this;
        }

        public Criteria andTradpinyLessThan(String value) {
            addCriterion("TRADPINY <", value, "tradpiny");
            return (Criteria) this;
        }

        public Criteria andTradpinyLessThanOrEqualTo(String value) {
            addCriterion("TRADPINY <=", value, "tradpiny");
            return (Criteria) this;
        }

        public Criteria andTradpinyLike(String value) {
            addCriterion("TRADPINY like", value, "tradpiny");
            return (Criteria) this;
        }

        public Criteria andTradpinyNotLike(String value) {
            addCriterion("TRADPINY not like", value, "tradpiny");
            return (Criteria) this;
        }

        public Criteria andTradpinyIn(List<String> values) {
            addCriterion("TRADPINY in", values, "tradpiny");
            return (Criteria) this;
        }

        public Criteria andTradpinyNotIn(List<String> values) {
            addCriterion("TRADPINY not in", values, "tradpiny");
            return (Criteria) this;
        }

        public Criteria andTradpinyBetween(String value1, String value2) {
            addCriterion("TRADPINY between", value1, value2, "tradpiny");
            return (Criteria) this;
        }

        public Criteria andTradpinyNotBetween(String value1, String value2) {
            addCriterion("TRADPINY not between", value1, value2, "tradpiny");
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

        public Criteria andOrgformIsNull() {
            addCriterion("ORGFORM is null");
            return (Criteria) this;
        }

        public Criteria andOrgformIsNotNull() {
            addCriterion("ORGFORM is not null");
            return (Criteria) this;
        }

        public Criteria andOrgformEqualTo(String value) {
            addCriterion("ORGFORM =", value, "orgform");
            return (Criteria) this;
        }

        public Criteria andOrgformNotEqualTo(String value) {
            addCriterion("ORGFORM <>", value, "orgform");
            return (Criteria) this;
        }

        public Criteria andOrgformGreaterThan(String value) {
            addCriterion("ORGFORM >", value, "orgform");
            return (Criteria) this;
        }

        public Criteria andOrgformGreaterThanOrEqualTo(String value) {
            addCriterion("ORGFORM >=", value, "orgform");
            return (Criteria) this;
        }

        public Criteria andOrgformLessThan(String value) {
            addCriterion("ORGFORM <", value, "orgform");
            return (Criteria) this;
        }

        public Criteria andOrgformLessThanOrEqualTo(String value) {
            addCriterion("ORGFORM <=", value, "orgform");
            return (Criteria) this;
        }

        public Criteria andOrgformLike(String value) {
            addCriterion("ORGFORM like", value, "orgform");
            return (Criteria) this;
        }

        public Criteria andOrgformNotLike(String value) {
            addCriterion("ORGFORM not like", value, "orgform");
            return (Criteria) this;
        }

        public Criteria andOrgformIn(List<String> values) {
            addCriterion("ORGFORM in", values, "orgform");
            return (Criteria) this;
        }

        public Criteria andOrgformNotIn(List<String> values) {
            addCriterion("ORGFORM not in", values, "orgform");
            return (Criteria) this;
        }

        public Criteria andOrgformBetween(String value1, String value2) {
            addCriterion("ORGFORM between", value1, value2, "orgform");
            return (Criteria) this;
        }

        public Criteria andOrgformNotBetween(String value1, String value2) {
            addCriterion("ORGFORM not between", value1, value2, "orgform");
            return (Criteria) this;
        }

        public Criteria andNamedistrictIsNull() {
            addCriterion("NAMEDISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andNamedistrictIsNotNull() {
            addCriterion("NAMEDISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andNamedistrictEqualTo(String value) {
            addCriterion("NAMEDISTRICT =", value, "namedistrict");
            return (Criteria) this;
        }

        public Criteria andNamedistrictNotEqualTo(String value) {
            addCriterion("NAMEDISTRICT <>", value, "namedistrict");
            return (Criteria) this;
        }

        public Criteria andNamedistrictGreaterThan(String value) {
            addCriterion("NAMEDISTRICT >", value, "namedistrict");
            return (Criteria) this;
        }

        public Criteria andNamedistrictGreaterThanOrEqualTo(String value) {
            addCriterion("NAMEDISTRICT >=", value, "namedistrict");
            return (Criteria) this;
        }

        public Criteria andNamedistrictLessThan(String value) {
            addCriterion("NAMEDISTRICT <", value, "namedistrict");
            return (Criteria) this;
        }

        public Criteria andNamedistrictLessThanOrEqualTo(String value) {
            addCriterion("NAMEDISTRICT <=", value, "namedistrict");
            return (Criteria) this;
        }

        public Criteria andNamedistrictLike(String value) {
            addCriterion("NAMEDISTRICT like", value, "namedistrict");
            return (Criteria) this;
        }

        public Criteria andNamedistrictNotLike(String value) {
            addCriterion("NAMEDISTRICT not like", value, "namedistrict");
            return (Criteria) this;
        }

        public Criteria andNamedistrictIn(List<String> values) {
            addCriterion("NAMEDISTRICT in", values, "namedistrict");
            return (Criteria) this;
        }

        public Criteria andNamedistrictNotIn(List<String> values) {
            addCriterion("NAMEDISTRICT not in", values, "namedistrict");
            return (Criteria) this;
        }

        public Criteria andNamedistrictBetween(String value1, String value2) {
            addCriterion("NAMEDISTRICT between", value1, value2, "namedistrict");
            return (Criteria) this;
        }

        public Criteria andNamedistrictNotBetween(String value1, String value2) {
            addCriterion("NAMEDISTRICT not between", value1, value2, "namedistrict");
            return (Criteria) this;
        }

        public Criteria andNameindIsNull() {
            addCriterion("NAMEIND is null");
            return (Criteria) this;
        }

        public Criteria andNameindIsNotNull() {
            addCriterion("NAMEIND is not null");
            return (Criteria) this;
        }

        public Criteria andNameindEqualTo(String value) {
            addCriterion("NAMEIND =", value, "nameind");
            return (Criteria) this;
        }

        public Criteria andNameindNotEqualTo(String value) {
            addCriterion("NAMEIND <>", value, "nameind");
            return (Criteria) this;
        }

        public Criteria andNameindGreaterThan(String value) {
            addCriterion("NAMEIND >", value, "nameind");
            return (Criteria) this;
        }

        public Criteria andNameindGreaterThanOrEqualTo(String value) {
            addCriterion("NAMEIND >=", value, "nameind");
            return (Criteria) this;
        }

        public Criteria andNameindLessThan(String value) {
            addCriterion("NAMEIND <", value, "nameind");
            return (Criteria) this;
        }

        public Criteria andNameindLessThanOrEqualTo(String value) {
            addCriterion("NAMEIND <=", value, "nameind");
            return (Criteria) this;
        }

        public Criteria andNameindLike(String value) {
            addCriterion("NAMEIND like", value, "nameind");
            return (Criteria) this;
        }

        public Criteria andNameindNotLike(String value) {
            addCriterion("NAMEIND not like", value, "nameind");
            return (Criteria) this;
        }

        public Criteria andNameindIn(List<String> values) {
            addCriterion("NAMEIND in", values, "nameind");
            return (Criteria) this;
        }

        public Criteria andNameindNotIn(List<String> values) {
            addCriterion("NAMEIND not in", values, "nameind");
            return (Criteria) this;
        }

        public Criteria andNameindBetween(String value1, String value2) {
            addCriterion("NAMEIND between", value1, value2, "nameind");
            return (Criteria) this;
        }

        public Criteria andNameindNotBetween(String value1, String value2) {
            addCriterion("NAMEIND not between", value1, value2, "nameind");
            return (Criteria) this;
        }

        public Criteria andGrpshformIsNull() {
            addCriterion("GRPSHFORM is null");
            return (Criteria) this;
        }

        public Criteria andGrpshformIsNotNull() {
            addCriterion("GRPSHFORM is not null");
            return (Criteria) this;
        }

        public Criteria andGrpshformEqualTo(String value) {
            addCriterion("GRPSHFORM =", value, "grpshform");
            return (Criteria) this;
        }

        public Criteria andGrpshformNotEqualTo(String value) {
            addCriterion("GRPSHFORM <>", value, "grpshform");
            return (Criteria) this;
        }

        public Criteria andGrpshformGreaterThan(String value) {
            addCriterion("GRPSHFORM >", value, "grpshform");
            return (Criteria) this;
        }

        public Criteria andGrpshformGreaterThanOrEqualTo(String value) {
            addCriterion("GRPSHFORM >=", value, "grpshform");
            return (Criteria) this;
        }

        public Criteria andGrpshformLessThan(String value) {
            addCriterion("GRPSHFORM <", value, "grpshform");
            return (Criteria) this;
        }

        public Criteria andGrpshformLessThanOrEqualTo(String value) {
            addCriterion("GRPSHFORM <=", value, "grpshform");
            return (Criteria) this;
        }

        public Criteria andGrpshformLike(String value) {
            addCriterion("GRPSHFORM like", value, "grpshform");
            return (Criteria) this;
        }

        public Criteria andGrpshformNotLike(String value) {
            addCriterion("GRPSHFORM not like", value, "grpshform");
            return (Criteria) this;
        }

        public Criteria andGrpshformIn(List<String> values) {
            addCriterion("GRPSHFORM in", values, "grpshform");
            return (Criteria) this;
        }

        public Criteria andGrpshformNotIn(List<String> values) {
            addCriterion("GRPSHFORM not in", values, "grpshform");
            return (Criteria) this;
        }

        public Criteria andGrpshformBetween(String value1, String value2) {
            addCriterion("GRPSHFORM between", value1, value2, "grpshform");
            return (Criteria) this;
        }

        public Criteria andGrpshformNotBetween(String value1, String value2) {
            addCriterion("GRPSHFORM not between", value1, value2, "grpshform");
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

        public Criteria andForsubconamusdIsNull() {
            addCriterion("FORSUBCONAMUSD is null");
            return (Criteria) this;
        }

        public Criteria andForsubconamusdIsNotNull() {
            addCriterion("FORSUBCONAMUSD is not null");
            return (Criteria) this;
        }

        public Criteria andForsubconamusdEqualTo(BigDecimal value) {
            addCriterion("FORSUBCONAMUSD =", value, "forsubconamusd");
            return (Criteria) this;
        }

        public Criteria andForsubconamusdNotEqualTo(BigDecimal value) {
            addCriterion("FORSUBCONAMUSD <>", value, "forsubconamusd");
            return (Criteria) this;
        }

        public Criteria andForsubconamusdGreaterThan(BigDecimal value) {
            addCriterion("FORSUBCONAMUSD >", value, "forsubconamusd");
            return (Criteria) this;
        }

        public Criteria andForsubconamusdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORSUBCONAMUSD >=", value, "forsubconamusd");
            return (Criteria) this;
        }

        public Criteria andForsubconamusdLessThan(BigDecimal value) {
            addCriterion("FORSUBCONAMUSD <", value, "forsubconamusd");
            return (Criteria) this;
        }

        public Criteria andForsubconamusdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORSUBCONAMUSD <=", value, "forsubconamusd");
            return (Criteria) this;
        }

        public Criteria andForsubconamusdIn(List<BigDecimal> values) {
            addCriterion("FORSUBCONAMUSD in", values, "forsubconamusd");
            return (Criteria) this;
        }

        public Criteria andForsubconamusdNotIn(List<BigDecimal> values) {
            addCriterion("FORSUBCONAMUSD not in", values, "forsubconamusd");
            return (Criteria) this;
        }

        public Criteria andForsubconamusdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORSUBCONAMUSD between", value1, value2, "forsubconamusd");
            return (Criteria) this;
        }

        public Criteria andForsubconamusdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORSUBCONAMUSD not between", value1, value2, "forsubconamusd");
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

        public Criteria andNamestatusIsNull() {
            addCriterion("NAMESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andNamestatusIsNotNull() {
            addCriterion("NAMESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andNamestatusEqualTo(BigDecimal value) {
            addCriterion("NAMESTATUS =", value, "namestatus");
            return (Criteria) this;
        }

        public Criteria andNamestatusNotEqualTo(BigDecimal value) {
            addCriterion("NAMESTATUS <>", value, "namestatus");
            return (Criteria) this;
        }

        public Criteria andNamestatusGreaterThan(BigDecimal value) {
            addCriterion("NAMESTATUS >", value, "namestatus");
            return (Criteria) this;
        }

        public Criteria andNamestatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NAMESTATUS >=", value, "namestatus");
            return (Criteria) this;
        }

        public Criteria andNamestatusLessThan(BigDecimal value) {
            addCriterion("NAMESTATUS <", value, "namestatus");
            return (Criteria) this;
        }

        public Criteria andNamestatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NAMESTATUS <=", value, "namestatus");
            return (Criteria) this;
        }

        public Criteria andNamestatusIn(List<BigDecimal> values) {
            addCriterion("NAMESTATUS in", values, "namestatus");
            return (Criteria) this;
        }

        public Criteria andNamestatusNotIn(List<BigDecimal> values) {
            addCriterion("NAMESTATUS not in", values, "namestatus");
            return (Criteria) this;
        }

        public Criteria andNamestatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NAMESTATUS between", value1, value2, "namestatus");
            return (Criteria) this;
        }

        public Criteria andNamestatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NAMESTATUS not between", value1, value2, "namestatus");
            return (Criteria) this;
        }

        public Criteria andSaveperfromIsNull() {
            addCriterion("SAVEPERFROM is null");
            return (Criteria) this;
        }

        public Criteria andSaveperfromIsNotNull() {
            addCriterion("SAVEPERFROM is not null");
            return (Criteria) this;
        }

        public Criteria andSaveperfromEqualTo(Date value) {
            addCriterion("SAVEPERFROM =", value, "saveperfrom");
            return (Criteria) this;
        }

        public Criteria andSaveperfromNotEqualTo(Date value) {
            addCriterion("SAVEPERFROM <>", value, "saveperfrom");
            return (Criteria) this;
        }

        public Criteria andSaveperfromGreaterThan(Date value) {
            addCriterion("SAVEPERFROM >", value, "saveperfrom");
            return (Criteria) this;
        }

        public Criteria andSaveperfromGreaterThanOrEqualTo(Date value) {
            addCriterion("SAVEPERFROM >=", value, "saveperfrom");
            return (Criteria) this;
        }

        public Criteria andSaveperfromLessThan(Date value) {
            addCriterion("SAVEPERFROM <", value, "saveperfrom");
            return (Criteria) this;
        }

        public Criteria andSaveperfromLessThanOrEqualTo(Date value) {
            addCriterion("SAVEPERFROM <=", value, "saveperfrom");
            return (Criteria) this;
        }

        public Criteria andSaveperfromIn(List<Date> values) {
            addCriterion("SAVEPERFROM in", values, "saveperfrom");
            return (Criteria) this;
        }

        public Criteria andSaveperfromNotIn(List<Date> values) {
            addCriterion("SAVEPERFROM not in", values, "saveperfrom");
            return (Criteria) this;
        }

        public Criteria andSaveperfromBetween(Date value1, Date value2) {
            addCriterion("SAVEPERFROM between", value1, value2, "saveperfrom");
            return (Criteria) this;
        }

        public Criteria andSaveperfromNotBetween(Date value1, Date value2) {
            addCriterion("SAVEPERFROM not between", value1, value2, "saveperfrom");
            return (Criteria) this;
        }

        public Criteria andSavepertoIsNull() {
            addCriterion("SAVEPERTO is null");
            return (Criteria) this;
        }

        public Criteria andSavepertoIsNotNull() {
            addCriterion("SAVEPERTO is not null");
            return (Criteria) this;
        }

        public Criteria andSavepertoEqualTo(Date value) {
            addCriterion("SAVEPERTO =", value, "saveperto");
            return (Criteria) this;
        }

        public Criteria andSavepertoNotEqualTo(Date value) {
            addCriterion("SAVEPERTO <>", value, "saveperto");
            return (Criteria) this;
        }

        public Criteria andSavepertoGreaterThan(Date value) {
            addCriterion("SAVEPERTO >", value, "saveperto");
            return (Criteria) this;
        }

        public Criteria andSavepertoGreaterThanOrEqualTo(Date value) {
            addCriterion("SAVEPERTO >=", value, "saveperto");
            return (Criteria) this;
        }

        public Criteria andSavepertoLessThan(Date value) {
            addCriterion("SAVEPERTO <", value, "saveperto");
            return (Criteria) this;
        }

        public Criteria andSavepertoLessThanOrEqualTo(Date value) {
            addCriterion("SAVEPERTO <=", value, "saveperto");
            return (Criteria) this;
        }

        public Criteria andSavepertoIn(List<Date> values) {
            addCriterion("SAVEPERTO in", values, "saveperto");
            return (Criteria) this;
        }

        public Criteria andSavepertoNotIn(List<Date> values) {
            addCriterion("SAVEPERTO not in", values, "saveperto");
            return (Criteria) this;
        }

        public Criteria andSavepertoBetween(Date value1, Date value2) {
            addCriterion("SAVEPERTO between", value1, value2, "saveperto");
            return (Criteria) this;
        }

        public Criteria andSavepertoNotBetween(Date value1, Date value2) {
            addCriterion("SAVEPERTO not between", value1, value2, "saveperto");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
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

        public Criteria andHksignIsNull() {
            addCriterion("HKSIGN is null");
            return (Criteria) this;
        }

        public Criteria andHksignIsNotNull() {
            addCriterion("HKSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andHksignEqualTo(String value) {
            addCriterion("HKSIGN =", value, "hksign");
            return (Criteria) this;
        }

        public Criteria andHksignNotEqualTo(String value) {
            addCriterion("HKSIGN <>", value, "hksign");
            return (Criteria) this;
        }

        public Criteria andHksignGreaterThan(String value) {
            addCriterion("HKSIGN >", value, "hksign");
            return (Criteria) this;
        }

        public Criteria andHksignGreaterThanOrEqualTo(String value) {
            addCriterion("HKSIGN >=", value, "hksign");
            return (Criteria) this;
        }

        public Criteria andHksignLessThan(String value) {
            addCriterion("HKSIGN <", value, "hksign");
            return (Criteria) this;
        }

        public Criteria andHksignLessThanOrEqualTo(String value) {
            addCriterion("HKSIGN <=", value, "hksign");
            return (Criteria) this;
        }

        public Criteria andHksignLike(String value) {
            addCriterion("HKSIGN like", value, "hksign");
            return (Criteria) this;
        }

        public Criteria andHksignNotLike(String value) {
            addCriterion("HKSIGN not like", value, "hksign");
            return (Criteria) this;
        }

        public Criteria andHksignIn(List<String> values) {
            addCriterion("HKSIGN in", values, "hksign");
            return (Criteria) this;
        }

        public Criteria andHksignNotIn(List<String> values) {
            addCriterion("HKSIGN not in", values, "hksign");
            return (Criteria) this;
        }

        public Criteria andHksignBetween(String value1, String value2) {
            addCriterion("HKSIGN between", value1, value2, "hksign");
            return (Criteria) this;
        }

        public Criteria andHksignNotBetween(String value1, String value2) {
            addCriterion("HKSIGN not between", value1, value2, "hksign");
            return (Criteria) this;
        }

        public Criteria andPreregorgIsNull() {
            addCriterion("PREREGORG is null");
            return (Criteria) this;
        }

        public Criteria andPreregorgIsNotNull() {
            addCriterion("PREREGORG is not null");
            return (Criteria) this;
        }

        public Criteria andPreregorgEqualTo(String value) {
            addCriterion("PREREGORG =", value, "preregorg");
            return (Criteria) this;
        }

        public Criteria andPreregorgNotEqualTo(String value) {
            addCriterion("PREREGORG <>", value, "preregorg");
            return (Criteria) this;
        }

        public Criteria andPreregorgGreaterThan(String value) {
            addCriterion("PREREGORG >", value, "preregorg");
            return (Criteria) this;
        }

        public Criteria andPreregorgGreaterThanOrEqualTo(String value) {
            addCriterion("PREREGORG >=", value, "preregorg");
            return (Criteria) this;
        }

        public Criteria andPreregorgLessThan(String value) {
            addCriterion("PREREGORG <", value, "preregorg");
            return (Criteria) this;
        }

        public Criteria andPreregorgLessThanOrEqualTo(String value) {
            addCriterion("PREREGORG <=", value, "preregorg");
            return (Criteria) this;
        }

        public Criteria andPreregorgLike(String value) {
            addCriterion("PREREGORG like", value, "preregorg");
            return (Criteria) this;
        }

        public Criteria andPreregorgNotLike(String value) {
            addCriterion("PREREGORG not like", value, "preregorg");
            return (Criteria) this;
        }

        public Criteria andPreregorgIn(List<String> values) {
            addCriterion("PREREGORG in", values, "preregorg");
            return (Criteria) this;
        }

        public Criteria andPreregorgNotIn(List<String> values) {
            addCriterion("PREREGORG not in", values, "preregorg");
            return (Criteria) this;
        }

        public Criteria andPreregorgBetween(String value1, String value2) {
            addCriterion("PREREGORG between", value1, value2, "preregorg");
            return (Criteria) this;
        }

        public Criteria andPreregorgNotBetween(String value1, String value2) {
            addCriterion("PREREGORG not between", value1, value2, "preregorg");
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

        public Criteria andApprauthIsNull() {
            addCriterion("APPRAUTH is null");
            return (Criteria) this;
        }

        public Criteria andApprauthIsNotNull() {
            addCriterion("APPRAUTH is not null");
            return (Criteria) this;
        }

        public Criteria andApprauthEqualTo(String value) {
            addCriterion("APPRAUTH =", value, "apprauth");
            return (Criteria) this;
        }

        public Criteria andApprauthNotEqualTo(String value) {
            addCriterion("APPRAUTH <>", value, "apprauth");
            return (Criteria) this;
        }

        public Criteria andApprauthGreaterThan(String value) {
            addCriterion("APPRAUTH >", value, "apprauth");
            return (Criteria) this;
        }

        public Criteria andApprauthGreaterThanOrEqualTo(String value) {
            addCriterion("APPRAUTH >=", value, "apprauth");
            return (Criteria) this;
        }

        public Criteria andApprauthLessThan(String value) {
            addCriterion("APPRAUTH <", value, "apprauth");
            return (Criteria) this;
        }

        public Criteria andApprauthLessThanOrEqualTo(String value) {
            addCriterion("APPRAUTH <=", value, "apprauth");
            return (Criteria) this;
        }

        public Criteria andApprauthLike(String value) {
            addCriterion("APPRAUTH like", value, "apprauth");
            return (Criteria) this;
        }

        public Criteria andApprauthNotLike(String value) {
            addCriterion("APPRAUTH not like", value, "apprauth");
            return (Criteria) this;
        }

        public Criteria andApprauthIn(List<String> values) {
            addCriterion("APPRAUTH in", values, "apprauth");
            return (Criteria) this;
        }

        public Criteria andApprauthNotIn(List<String> values) {
            addCriterion("APPRAUTH not in", values, "apprauth");
            return (Criteria) this;
        }

        public Criteria andApprauthBetween(String value1, String value2) {
            addCriterion("APPRAUTH between", value1, value2, "apprauth");
            return (Criteria) this;
        }

        public Criteria andApprauthNotBetween(String value1, String value2) {
            addCriterion("APPRAUTH not between", value1, value2, "apprauth");
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

        public Criteria andIsentnamealtIsNull() {
            addCriterion("ISENTNAMEALT is null");
            return (Criteria) this;
        }

        public Criteria andIsentnamealtIsNotNull() {
            addCriterion("ISENTNAMEALT is not null");
            return (Criteria) this;
        }

        public Criteria andIsentnamealtEqualTo(BigDecimal value) {
            addCriterion("ISENTNAMEALT =", value, "isentnamealt");
            return (Criteria) this;
        }

        public Criteria andIsentnamealtNotEqualTo(BigDecimal value) {
            addCriterion("ISENTNAMEALT <>", value, "isentnamealt");
            return (Criteria) this;
        }

        public Criteria andIsentnamealtGreaterThan(BigDecimal value) {
            addCriterion("ISENTNAMEALT >", value, "isentnamealt");
            return (Criteria) this;
        }

        public Criteria andIsentnamealtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISENTNAMEALT >=", value, "isentnamealt");
            return (Criteria) this;
        }

        public Criteria andIsentnamealtLessThan(BigDecimal value) {
            addCriterion("ISENTNAMEALT <", value, "isentnamealt");
            return (Criteria) this;
        }

        public Criteria andIsentnamealtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISENTNAMEALT <=", value, "isentnamealt");
            return (Criteria) this;
        }

        public Criteria andIsentnamealtIn(List<BigDecimal> values) {
            addCriterion("ISENTNAMEALT in", values, "isentnamealt");
            return (Criteria) this;
        }

        public Criteria andIsentnamealtNotIn(List<BigDecimal> values) {
            addCriterion("ISENTNAMEALT not in", values, "isentnamealt");
            return (Criteria) this;
        }

        public Criteria andIsentnamealtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISENTNAMEALT between", value1, value2, "isentnamealt");
            return (Criteria) this;
        }

        public Criteria andIsentnamealtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISENTNAMEALT not between", value1, value2, "isentnamealt");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtIsNull() {
            addCriterion("ENTNAMEBEALT is null");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtIsNotNull() {
            addCriterion("ENTNAMEBEALT is not null");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtEqualTo(String value) {
            addCriterion("ENTNAMEBEALT =", value, "entnamebealt");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtNotEqualTo(String value) {
            addCriterion("ENTNAMEBEALT <>", value, "entnamebealt");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtGreaterThan(String value) {
            addCriterion("ENTNAMEBEALT >", value, "entnamebealt");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtGreaterThanOrEqualTo(String value) {
            addCriterion("ENTNAMEBEALT >=", value, "entnamebealt");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtLessThan(String value) {
            addCriterion("ENTNAMEBEALT <", value, "entnamebealt");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtLessThanOrEqualTo(String value) {
            addCriterion("ENTNAMEBEALT <=", value, "entnamebealt");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtLike(String value) {
            addCriterion("ENTNAMEBEALT like", value, "entnamebealt");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtNotLike(String value) {
            addCriterion("ENTNAMEBEALT not like", value, "entnamebealt");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtIn(List<String> values) {
            addCriterion("ENTNAMEBEALT in", values, "entnamebealt");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtNotIn(List<String> values) {
            addCriterion("ENTNAMEBEALT not in", values, "entnamebealt");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtBetween(String value1, String value2) {
            addCriterion("ENTNAMEBEALT between", value1, value2, "entnamebealt");
            return (Criteria) this;
        }

        public Criteria andEntnamebealtNotBetween(String value1, String value2) {
            addCriterion("ENTNAMEBEALT not between", value1, value2, "entnamebealt");
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

        public Criteria andIsusedIsNull() {
            addCriterion("ISUSED is null");
            return (Criteria) this;
        }

        public Criteria andIsusedIsNotNull() {
            addCriterion("ISUSED is not null");
            return (Criteria) this;
        }

        public Criteria andIsusedEqualTo(String value) {
            addCriterion("ISUSED =", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotEqualTo(String value) {
            addCriterion("ISUSED <>", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThan(String value) {
            addCriterion("ISUSED >", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThanOrEqualTo(String value) {
            addCriterion("ISUSED >=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThan(String value) {
            addCriterion("ISUSED <", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThanOrEqualTo(String value) {
            addCriterion("ISUSED <=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLike(String value) {
            addCriterion("ISUSED like", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotLike(String value) {
            addCriterion("ISUSED not like", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedIn(List<String> values) {
            addCriterion("ISUSED in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotIn(List<String> values) {
            addCriterion("ISUSED not in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedBetween(String value1, String value2) {
            addCriterion("ISUSED between", value1, value2, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotBetween(String value1, String value2) {
            addCriterion("ISUSED not between", value1, value2, "isused");
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

        public Criteria andGrpnamebealtIsNull() {
            addCriterion("GRPNAMEBEALT is null");
            return (Criteria) this;
        }

        public Criteria andGrpnamebealtIsNotNull() {
            addCriterion("GRPNAMEBEALT is not null");
            return (Criteria) this;
        }

        public Criteria andGrpnamebealtEqualTo(String value) {
            addCriterion("GRPNAMEBEALT =", value, "grpnamebealt");
            return (Criteria) this;
        }

        public Criteria andGrpnamebealtNotEqualTo(String value) {
            addCriterion("GRPNAMEBEALT <>", value, "grpnamebealt");
            return (Criteria) this;
        }

        public Criteria andGrpnamebealtGreaterThan(String value) {
            addCriterion("GRPNAMEBEALT >", value, "grpnamebealt");
            return (Criteria) this;
        }

        public Criteria andGrpnamebealtGreaterThanOrEqualTo(String value) {
            addCriterion("GRPNAMEBEALT >=", value, "grpnamebealt");
            return (Criteria) this;
        }

        public Criteria andGrpnamebealtLessThan(String value) {
            addCriterion("GRPNAMEBEALT <", value, "grpnamebealt");
            return (Criteria) this;
        }

        public Criteria andGrpnamebealtLessThanOrEqualTo(String value) {
            addCriterion("GRPNAMEBEALT <=", value, "grpnamebealt");
            return (Criteria) this;
        }

        public Criteria andGrpnamebealtLike(String value) {
            addCriterion("GRPNAMEBEALT like", value, "grpnamebealt");
            return (Criteria) this;
        }

        public Criteria andGrpnamebealtNotLike(String value) {
            addCriterion("GRPNAMEBEALT not like", value, "grpnamebealt");
            return (Criteria) this;
        }

        public Criteria andGrpnamebealtIn(List<String> values) {
            addCriterion("GRPNAMEBEALT in", values, "grpnamebealt");
            return (Criteria) this;
        }

        public Criteria andGrpnamebealtNotIn(List<String> values) {
            addCriterion("GRPNAMEBEALT not in", values, "grpnamebealt");
            return (Criteria) this;
        }

        public Criteria andGrpnamebealtBetween(String value1, String value2) {
            addCriterion("GRPNAMEBEALT between", value1, value2, "grpnamebealt");
            return (Criteria) this;
        }

        public Criteria andGrpnamebealtNotBetween(String value1, String value2) {
            addCriterion("GRPNAMEBEALT not between", value1, value2, "grpnamebealt");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtIsNull() {
            addCriterion("GRPSHFORMBEALT is null");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtIsNotNull() {
            addCriterion("GRPSHFORMBEALT is not null");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtEqualTo(String value) {
            addCriterion("GRPSHFORMBEALT =", value, "grpshformbealt");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtNotEqualTo(String value) {
            addCriterion("GRPSHFORMBEALT <>", value, "grpshformbealt");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtGreaterThan(String value) {
            addCriterion("GRPSHFORMBEALT >", value, "grpshformbealt");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtGreaterThanOrEqualTo(String value) {
            addCriterion("GRPSHFORMBEALT >=", value, "grpshformbealt");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtLessThan(String value) {
            addCriterion("GRPSHFORMBEALT <", value, "grpshformbealt");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtLessThanOrEqualTo(String value) {
            addCriterion("GRPSHFORMBEALT <=", value, "grpshformbealt");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtLike(String value) {
            addCriterion("GRPSHFORMBEALT like", value, "grpshformbealt");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtNotLike(String value) {
            addCriterion("GRPSHFORMBEALT not like", value, "grpshformbealt");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtIn(List<String> values) {
            addCriterion("GRPSHFORMBEALT in", values, "grpshformbealt");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtNotIn(List<String> values) {
            addCriterion("GRPSHFORMBEALT not in", values, "grpshformbealt");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtBetween(String value1, String value2) {
            addCriterion("GRPSHFORMBEALT between", value1, value2, "grpshformbealt");
            return (Criteria) this;
        }

        public Criteria andGrpshformbealtNotBetween(String value1, String value2) {
            addCriterion("GRPSHFORMBEALT not between", value1, value2, "grpshformbealt");
            return (Criteria) this;
        }

        public Criteria andGrpnameIsNull() {
            addCriterion("GRPNAME is null");
            return (Criteria) this;
        }

        public Criteria andGrpnameIsNotNull() {
            addCriterion("GRPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andGrpnameEqualTo(String value) {
            addCriterion("GRPNAME =", value, "grpname");
            return (Criteria) this;
        }

        public Criteria andGrpnameNotEqualTo(String value) {
            addCriterion("GRPNAME <>", value, "grpname");
            return (Criteria) this;
        }

        public Criteria andGrpnameGreaterThan(String value) {
            addCriterion("GRPNAME >", value, "grpname");
            return (Criteria) this;
        }

        public Criteria andGrpnameGreaterThanOrEqualTo(String value) {
            addCriterion("GRPNAME >=", value, "grpname");
            return (Criteria) this;
        }

        public Criteria andGrpnameLessThan(String value) {
            addCriterion("GRPNAME <", value, "grpname");
            return (Criteria) this;
        }

        public Criteria andGrpnameLessThanOrEqualTo(String value) {
            addCriterion("GRPNAME <=", value, "grpname");
            return (Criteria) this;
        }

        public Criteria andGrpnameLike(String value) {
            addCriterion("GRPNAME like", value, "grpname");
            return (Criteria) this;
        }

        public Criteria andGrpnameNotLike(String value) {
            addCriterion("GRPNAME not like", value, "grpname");
            return (Criteria) this;
        }

        public Criteria andGrpnameIn(List<String> values) {
            addCriterion("GRPNAME in", values, "grpname");
            return (Criteria) this;
        }

        public Criteria andGrpnameNotIn(List<String> values) {
            addCriterion("GRPNAME not in", values, "grpname");
            return (Criteria) this;
        }

        public Criteria andGrpnameBetween(String value1, String value2) {
            addCriterion("GRPNAME between", value1, value2, "grpname");
            return (Criteria) this;
        }

        public Criteria andGrpnameNotBetween(String value1, String value2) {
            addCriterion("GRPNAME not between", value1, value2, "grpname");
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

        public Criteria andGtzxOpetypeIsNull() {
            addCriterion("GTZX_OPETYPE is null");
            return (Criteria) this;
        }

        public Criteria andGtzxOpetypeIsNotNull() {
            addCriterion("GTZX_OPETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGtzxOpetypeEqualTo(String value) {
            addCriterion("GTZX_OPETYPE =", value, "gtzxOpetype");
            return (Criteria) this;
        }

        public Criteria andGtzxOpetypeNotEqualTo(String value) {
            addCriterion("GTZX_OPETYPE <>", value, "gtzxOpetype");
            return (Criteria) this;
        }

        public Criteria andGtzxOpetypeGreaterThan(String value) {
            addCriterion("GTZX_OPETYPE >", value, "gtzxOpetype");
            return (Criteria) this;
        }

        public Criteria andGtzxOpetypeGreaterThanOrEqualTo(String value) {
            addCriterion("GTZX_OPETYPE >=", value, "gtzxOpetype");
            return (Criteria) this;
        }

        public Criteria andGtzxOpetypeLessThan(String value) {
            addCriterion("GTZX_OPETYPE <", value, "gtzxOpetype");
            return (Criteria) this;
        }

        public Criteria andGtzxOpetypeLessThanOrEqualTo(String value) {
            addCriterion("GTZX_OPETYPE <=", value, "gtzxOpetype");
            return (Criteria) this;
        }

        public Criteria andGtzxOpetypeLike(String value) {
            addCriterion("GTZX_OPETYPE like", value, "gtzxOpetype");
            return (Criteria) this;
        }

        public Criteria andGtzxOpetypeNotLike(String value) {
            addCriterion("GTZX_OPETYPE not like", value, "gtzxOpetype");
            return (Criteria) this;
        }

        public Criteria andGtzxOpetypeIn(List<String> values) {
            addCriterion("GTZX_OPETYPE in", values, "gtzxOpetype");
            return (Criteria) this;
        }

        public Criteria andGtzxOpetypeNotIn(List<String> values) {
            addCriterion("GTZX_OPETYPE not in", values, "gtzxOpetype");
            return (Criteria) this;
        }

        public Criteria andGtzxOpetypeBetween(String value1, String value2) {
            addCriterion("GTZX_OPETYPE between", value1, value2, "gtzxOpetype");
            return (Criteria) this;
        }

        public Criteria andGtzxOpetypeNotBetween(String value1, String value2) {
            addCriterion("GTZX_OPETYPE not between", value1, value2, "gtzxOpetype");
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

        public Criteria andGrppnameIsNull() {
            addCriterion("GRPPNAME is null");
            return (Criteria) this;
        }

        public Criteria andGrppnameIsNotNull() {
            addCriterion("GRPPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andGrppnameEqualTo(String value) {
            addCriterion("GRPPNAME =", value, "grppname");
            return (Criteria) this;
        }

        public Criteria andGrppnameNotEqualTo(String value) {
            addCriterion("GRPPNAME <>", value, "grppname");
            return (Criteria) this;
        }

        public Criteria andGrppnameGreaterThan(String value) {
            addCriterion("GRPPNAME >", value, "grppname");
            return (Criteria) this;
        }

        public Criteria andGrppnameGreaterThanOrEqualTo(String value) {
            addCriterion("GRPPNAME >=", value, "grppname");
            return (Criteria) this;
        }

        public Criteria andGrppnameLessThan(String value) {
            addCriterion("GRPPNAME <", value, "grppname");
            return (Criteria) this;
        }

        public Criteria andGrppnameLessThanOrEqualTo(String value) {
            addCriterion("GRPPNAME <=", value, "grppname");
            return (Criteria) this;
        }

        public Criteria andGrppnameLike(String value) {
            addCriterion("GRPPNAME like", value, "grppname");
            return (Criteria) this;
        }

        public Criteria andGrppnameNotLike(String value) {
            addCriterion("GRPPNAME not like", value, "grppname");
            return (Criteria) this;
        }

        public Criteria andGrppnameIn(List<String> values) {
            addCriterion("GRPPNAME in", values, "grppname");
            return (Criteria) this;
        }

        public Criteria andGrppnameNotIn(List<String> values) {
            addCriterion("GRPPNAME not in", values, "grppname");
            return (Criteria) this;
        }

        public Criteria andGrppnameBetween(String value1, String value2) {
            addCriterion("GRPPNAME between", value1, value2, "grppname");
            return (Criteria) this;
        }

        public Criteria andGrppnameNotBetween(String value1, String value2) {
            addCriterion("GRPPNAME not between", value1, value2, "grppname");
            return (Criteria) this;
        }

        public Criteria andAccdateIsNull() {
            addCriterion("ACCDATE is null");
            return (Criteria) this;
        }

        public Criteria andAccdateIsNotNull() {
            addCriterion("ACCDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccdateEqualTo(Date value) {
            addCriterion("ACCDATE =", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateNotEqualTo(Date value) {
            addCriterion("ACCDATE <>", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateGreaterThan(Date value) {
            addCriterion("ACCDATE >", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCDATE >=", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateLessThan(Date value) {
            addCriterion("ACCDATE <", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateLessThanOrEqualTo(Date value) {
            addCriterion("ACCDATE <=", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateIn(List<Date> values) {
            addCriterion("ACCDATE in", values, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateNotIn(List<Date> values) {
            addCriterion("ACCDATE not in", values, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateBetween(Date value1, Date value2) {
            addCriterion("ACCDATE between", value1, value2, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateNotBetween(Date value1, Date value2) {
            addCriterion("ACCDATE not between", value1, value2, "accdate");
            return (Criteria) this;
        }

        public Criteria andApptypeIsNull() {
            addCriterion("APPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andApptypeIsNotNull() {
            addCriterion("APPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApptypeEqualTo(String value) {
            addCriterion("APPTYPE =", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotEqualTo(String value) {
            addCriterion("APPTYPE <>", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeGreaterThan(String value) {
            addCriterion("APPTYPE >", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeGreaterThanOrEqualTo(String value) {
            addCriterion("APPTYPE >=", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeLessThan(String value) {
            addCriterion("APPTYPE <", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeLessThanOrEqualTo(String value) {
            addCriterion("APPTYPE <=", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeLike(String value) {
            addCriterion("APPTYPE like", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotLike(String value) {
            addCriterion("APPTYPE not like", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeIn(List<String> values) {
            addCriterion("APPTYPE in", values, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotIn(List<String> values) {
            addCriterion("APPTYPE not in", values, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeBetween(String value1, String value2) {
            addCriterion("APPTYPE between", value1, value2, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotBetween(String value1, String value2) {
            addCriterion("APPTYPE not between", value1, value2, "apptype");
            return (Criteria) this;
        }

        public Criteria andRestlevelIsNull() {
            addCriterion("RESTLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andRestlevelIsNotNull() {
            addCriterion("RESTLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andRestlevelEqualTo(String value) {
            addCriterion("RESTLEVEL =", value, "restlevel");
            return (Criteria) this;
        }

        public Criteria andRestlevelNotEqualTo(String value) {
            addCriterion("RESTLEVEL <>", value, "restlevel");
            return (Criteria) this;
        }

        public Criteria andRestlevelGreaterThan(String value) {
            addCriterion("RESTLEVEL >", value, "restlevel");
            return (Criteria) this;
        }

        public Criteria andRestlevelGreaterThanOrEqualTo(String value) {
            addCriterion("RESTLEVEL >=", value, "restlevel");
            return (Criteria) this;
        }

        public Criteria andRestlevelLessThan(String value) {
            addCriterion("RESTLEVEL <", value, "restlevel");
            return (Criteria) this;
        }

        public Criteria andRestlevelLessThanOrEqualTo(String value) {
            addCriterion("RESTLEVEL <=", value, "restlevel");
            return (Criteria) this;
        }

        public Criteria andRestlevelLike(String value) {
            addCriterion("RESTLEVEL like", value, "restlevel");
            return (Criteria) this;
        }

        public Criteria andRestlevelNotLike(String value) {
            addCriterion("RESTLEVEL not like", value, "restlevel");
            return (Criteria) this;
        }

        public Criteria andRestlevelIn(List<String> values) {
            addCriterion("RESTLEVEL in", values, "restlevel");
            return (Criteria) this;
        }

        public Criteria andRestlevelNotIn(List<String> values) {
            addCriterion("RESTLEVEL not in", values, "restlevel");
            return (Criteria) this;
        }

        public Criteria andRestlevelBetween(String value1, String value2) {
            addCriterion("RESTLEVEL between", value1, value2, "restlevel");
            return (Criteria) this;
        }

        public Criteria andRestlevelNotBetween(String value1, String value2) {
            addCriterion("RESTLEVEL not between", value1, value2, "restlevel");
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andFgstypeIsNull() {
            addCriterion("FGSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFgstypeIsNotNull() {
            addCriterion("FGSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFgstypeEqualTo(String value) {
            addCriterion("FGSTYPE =", value, "fgstype");
            return (Criteria) this;
        }

        public Criteria andFgstypeNotEqualTo(String value) {
            addCriterion("FGSTYPE <>", value, "fgstype");
            return (Criteria) this;
        }

        public Criteria andFgstypeGreaterThan(String value) {
            addCriterion("FGSTYPE >", value, "fgstype");
            return (Criteria) this;
        }

        public Criteria andFgstypeGreaterThanOrEqualTo(String value) {
            addCriterion("FGSTYPE >=", value, "fgstype");
            return (Criteria) this;
        }

        public Criteria andFgstypeLessThan(String value) {
            addCriterion("FGSTYPE <", value, "fgstype");
            return (Criteria) this;
        }

        public Criteria andFgstypeLessThanOrEqualTo(String value) {
            addCriterion("FGSTYPE <=", value, "fgstype");
            return (Criteria) this;
        }

        public Criteria andFgstypeLike(String value) {
            addCriterion("FGSTYPE like", value, "fgstype");
            return (Criteria) this;
        }

        public Criteria andFgstypeNotLike(String value) {
            addCriterion("FGSTYPE not like", value, "fgstype");
            return (Criteria) this;
        }

        public Criteria andFgstypeIn(List<String> values) {
            addCriterion("FGSTYPE in", values, "fgstype");
            return (Criteria) this;
        }

        public Criteria andFgstypeNotIn(List<String> values) {
            addCriterion("FGSTYPE not in", values, "fgstype");
            return (Criteria) this;
        }

        public Criteria andFgstypeBetween(String value1, String value2) {
            addCriterion("FGSTYPE between", value1, value2, "fgstype");
            return (Criteria) this;
        }

        public Criteria andFgstypeNotBetween(String value1, String value2) {
            addCriterion("FGSTYPE not between", value1, value2, "fgstype");
            return (Criteria) this;
        }

        public Criteria andRegtypeIsNull() {
            addCriterion("REGTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRegtypeIsNotNull() {
            addCriterion("REGTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRegtypeEqualTo(String value) {
            addCriterion("REGTYPE =", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeNotEqualTo(String value) {
            addCriterion("REGTYPE <>", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeGreaterThan(String value) {
            addCriterion("REGTYPE >", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeGreaterThanOrEqualTo(String value) {
            addCriterion("REGTYPE >=", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeLessThan(String value) {
            addCriterion("REGTYPE <", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeLessThanOrEqualTo(String value) {
            addCriterion("REGTYPE <=", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeLike(String value) {
            addCriterion("REGTYPE like", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeNotLike(String value) {
            addCriterion("REGTYPE not like", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeIn(List<String> values) {
            addCriterion("REGTYPE in", values, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeNotIn(List<String> values) {
            addCriterion("REGTYPE not in", values, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeBetween(String value1, String value2) {
            addCriterion("REGTYPE between", value1, value2, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeNotBetween(String value1, String value2) {
            addCriterion("REGTYPE not between", value1, value2, "regtype");
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