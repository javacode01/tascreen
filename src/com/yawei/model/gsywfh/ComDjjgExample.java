package com.yawei.model.gsywfh;

import com.sys.utils.BeanUtils;
import com.sys.utils.Page;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ComDjjgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ComDjjgExample() {
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

        public Criteria andCodingIsNull() {
            addCriterion("CODING is null");
            return (Criteria) this;
        }

        public Criteria andCodingIsNotNull() {
            addCriterion("CODING is not null");
            return (Criteria) this;
        }

        public Criteria andCodingEqualTo(String value) {
            addCriterion("CODING =", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotEqualTo(String value) {
            addCriterion("CODING <>", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingGreaterThan(String value) {
            addCriterion("CODING >", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingGreaterThanOrEqualTo(String value) {
            addCriterion("CODING >=", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingLessThan(String value) {
            addCriterion("CODING <", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingLessThanOrEqualTo(String value) {
            addCriterion("CODING <=", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingLike(String value) {
            addCriterion("CODING like", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotLike(String value) {
            addCriterion("CODING not like", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingIn(List<String> values) {
            addCriterion("CODING in", values, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotIn(List<String> values) {
            addCriterion("CODING not in", values, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingBetween(String value1, String value2) {
            addCriterion("CODING between", value1, value2, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotBetween(String value1, String value2) {
            addCriterion("CODING not between", value1, value2, "coding");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andPcodingIsNull() {
            addCriterion("PCODING is null");
            return (Criteria) this;
        }

        public Criteria andPcodingIsNotNull() {
            addCriterion("PCODING is not null");
            return (Criteria) this;
        }

        public Criteria andPcodingEqualTo(String value) {
            addCriterion("PCODING =", value, "pcoding");
            return (Criteria) this;
        }

        public Criteria andPcodingNotEqualTo(String value) {
            addCriterion("PCODING <>", value, "pcoding");
            return (Criteria) this;
        }

        public Criteria andPcodingGreaterThan(String value) {
            addCriterion("PCODING >", value, "pcoding");
            return (Criteria) this;
        }

        public Criteria andPcodingGreaterThanOrEqualTo(String value) {
            addCriterion("PCODING >=", value, "pcoding");
            return (Criteria) this;
        }

        public Criteria andPcodingLessThan(String value) {
            addCriterion("PCODING <", value, "pcoding");
            return (Criteria) this;
        }

        public Criteria andPcodingLessThanOrEqualTo(String value) {
            addCriterion("PCODING <=", value, "pcoding");
            return (Criteria) this;
        }

        public Criteria andPcodingLike(String value) {
            addCriterion("PCODING like", value, "pcoding");
            return (Criteria) this;
        }

        public Criteria andPcodingNotLike(String value) {
            addCriterion("PCODING not like", value, "pcoding");
            return (Criteria) this;
        }

        public Criteria andPcodingIn(List<String> values) {
            addCriterion("PCODING in", values, "pcoding");
            return (Criteria) this;
        }

        public Criteria andPcodingNotIn(List<String> values) {
            addCriterion("PCODING not in", values, "pcoding");
            return (Criteria) this;
        }

        public Criteria andPcodingBetween(String value1, String value2) {
            addCriterion("PCODING between", value1, value2, "pcoding");
            return (Criteria) this;
        }

        public Criteria andPcodingNotBetween(String value1, String value2) {
            addCriterion("PCODING not between", value1, value2, "pcoding");
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

        public Criteria andReglevelIsNull() {
            addCriterion("REGLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andReglevelIsNotNull() {
            addCriterion("REGLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andReglevelEqualTo(String value) {
            addCriterion("REGLEVEL =", value, "reglevel");
            return (Criteria) this;
        }

        public Criteria andReglevelNotEqualTo(String value) {
            addCriterion("REGLEVEL <>", value, "reglevel");
            return (Criteria) this;
        }

        public Criteria andReglevelGreaterThan(String value) {
            addCriterion("REGLEVEL >", value, "reglevel");
            return (Criteria) this;
        }

        public Criteria andReglevelGreaterThanOrEqualTo(String value) {
            addCriterion("REGLEVEL >=", value, "reglevel");
            return (Criteria) this;
        }

        public Criteria andReglevelLessThan(String value) {
            addCriterion("REGLEVEL <", value, "reglevel");
            return (Criteria) this;
        }

        public Criteria andReglevelLessThanOrEqualTo(String value) {
            addCriterion("REGLEVEL <=", value, "reglevel");
            return (Criteria) this;
        }

        public Criteria andReglevelLike(String value) {
            addCriterion("REGLEVEL like", value, "reglevel");
            return (Criteria) this;
        }

        public Criteria andReglevelNotLike(String value) {
            addCriterion("REGLEVEL not like", value, "reglevel");
            return (Criteria) this;
        }

        public Criteria andReglevelIn(List<String> values) {
            addCriterion("REGLEVEL in", values, "reglevel");
            return (Criteria) this;
        }

        public Criteria andReglevelNotIn(List<String> values) {
            addCriterion("REGLEVEL not in", values, "reglevel");
            return (Criteria) this;
        }

        public Criteria andReglevelBetween(String value1, String value2) {
            addCriterion("REGLEVEL between", value1, value2, "reglevel");
            return (Criteria) this;
        }

        public Criteria andReglevelNotBetween(String value1, String value2) {
            addCriterion("REGLEVEL not between", value1, value2, "reglevel");
            return (Criteria) this;
        }

        public Criteria andMcjcIsNull() {
            addCriterion("MCJC is null");
            return (Criteria) this;
        }

        public Criteria andMcjcIsNotNull() {
            addCriterion("MCJC is not null");
            return (Criteria) this;
        }

        public Criteria andMcjcEqualTo(String value) {
            addCriterion("MCJC =", value, "mcjc");
            return (Criteria) this;
        }

        public Criteria andMcjcNotEqualTo(String value) {
            addCriterion("MCJC <>", value, "mcjc");
            return (Criteria) this;
        }

        public Criteria andMcjcGreaterThan(String value) {
            addCriterion("MCJC >", value, "mcjc");
            return (Criteria) this;
        }

        public Criteria andMcjcGreaterThanOrEqualTo(String value) {
            addCriterion("MCJC >=", value, "mcjc");
            return (Criteria) this;
        }

        public Criteria andMcjcLessThan(String value) {
            addCriterion("MCJC <", value, "mcjc");
            return (Criteria) this;
        }

        public Criteria andMcjcLessThanOrEqualTo(String value) {
            addCriterion("MCJC <=", value, "mcjc");
            return (Criteria) this;
        }

        public Criteria andMcjcLike(String value) {
            addCriterion("MCJC like", value, "mcjc");
            return (Criteria) this;
        }

        public Criteria andMcjcNotLike(String value) {
            addCriterion("MCJC not like", value, "mcjc");
            return (Criteria) this;
        }

        public Criteria andMcjcIn(List<String> values) {
            addCriterion("MCJC in", values, "mcjc");
            return (Criteria) this;
        }

        public Criteria andMcjcNotIn(List<String> values) {
            addCriterion("MCJC not in", values, "mcjc");
            return (Criteria) this;
        }

        public Criteria andMcjcBetween(String value1, String value2) {
            addCriterion("MCJC between", value1, value2, "mcjc");
            return (Criteria) this;
        }

        public Criteria andMcjcNotBetween(String value1, String value2) {
            addCriterion("MCJC not between", value1, value2, "mcjc");
            return (Criteria) this;
        }

        public Criteria andDqjcIsNull() {
            addCriterion("DQJC is null");
            return (Criteria) this;
        }

        public Criteria andDqjcIsNotNull() {
            addCriterion("DQJC is not null");
            return (Criteria) this;
        }

        public Criteria andDqjcEqualTo(String value) {
            addCriterion("DQJC =", value, "dqjc");
            return (Criteria) this;
        }

        public Criteria andDqjcNotEqualTo(String value) {
            addCriterion("DQJC <>", value, "dqjc");
            return (Criteria) this;
        }

        public Criteria andDqjcGreaterThan(String value) {
            addCriterion("DQJC >", value, "dqjc");
            return (Criteria) this;
        }

        public Criteria andDqjcGreaterThanOrEqualTo(String value) {
            addCriterion("DQJC >=", value, "dqjc");
            return (Criteria) this;
        }

        public Criteria andDqjcLessThan(String value) {
            addCriterion("DQJC <", value, "dqjc");
            return (Criteria) this;
        }

        public Criteria andDqjcLessThanOrEqualTo(String value) {
            addCriterion("DQJC <=", value, "dqjc");
            return (Criteria) this;
        }

        public Criteria andDqjcLike(String value) {
            addCriterion("DQJC like", value, "dqjc");
            return (Criteria) this;
        }

        public Criteria andDqjcNotLike(String value) {
            addCriterion("DQJC not like", value, "dqjc");
            return (Criteria) this;
        }

        public Criteria andDqjcIn(List<String> values) {
            addCriterion("DQJC in", values, "dqjc");
            return (Criteria) this;
        }

        public Criteria andDqjcNotIn(List<String> values) {
            addCriterion("DQJC not in", values, "dqjc");
            return (Criteria) this;
        }

        public Criteria andDqjcBetween(String value1, String value2) {
            addCriterion("DQJC between", value1, value2, "dqjc");
            return (Criteria) this;
        }

        public Criteria andDqjcNotBetween(String value1, String value2) {
            addCriterion("DQJC not between", value1, value2, "dqjc");
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