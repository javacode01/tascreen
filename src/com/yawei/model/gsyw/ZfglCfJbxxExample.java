package com.yawei.model.gsyw;

import com.sys.utils.BeanUtils;
import com.sys.utils.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ZfglCfJbxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ZfglCfJbxxExample() {
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

        public Criteria andCasenoIsNull() {
            addCriterion("CASENO is null");
            return (Criteria) this;
        }

        public Criteria andCasenoIsNotNull() {
            addCriterion("CASENO is not null");
            return (Criteria) this;
        }

        public Criteria andCasenoEqualTo(String value) {
            addCriterion("CASENO =", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotEqualTo(String value) {
            addCriterion("CASENO <>", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThan(String value) {
            addCriterion("CASENO >", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThanOrEqualTo(String value) {
            addCriterion("CASENO >=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThan(String value) {
            addCriterion("CASENO <", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThanOrEqualTo(String value) {
            addCriterion("CASENO <=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLike(String value) {
            addCriterion("CASENO like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotLike(String value) {
            addCriterion("CASENO not like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoIn(List<String> values) {
            addCriterion("CASENO in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotIn(List<String> values) {
            addCriterion("CASENO not in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoBetween(String value1, String value2) {
            addCriterion("CASENO between", value1, value2, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotBetween(String value1, String value2) {
            addCriterion("CASENO not between", value1, value2, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenameIsNull() {
            addCriterion("CASENAME is null");
            return (Criteria) this;
        }

        public Criteria andCasenameIsNotNull() {
            addCriterion("CASENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCasenameEqualTo(String value) {
            addCriterion("CASENAME =", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotEqualTo(String value) {
            addCriterion("CASENAME <>", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThan(String value) {
            addCriterion("CASENAME >", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThanOrEqualTo(String value) {
            addCriterion("CASENAME >=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThan(String value) {
            addCriterion("CASENAME <", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThanOrEqualTo(String value) {
            addCriterion("CASENAME <=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLike(String value) {
            addCriterion("CASENAME like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotLike(String value) {
            addCriterion("CASENAME not like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameIn(List<String> values) {
            addCriterion("CASENAME in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotIn(List<String> values) {
            addCriterion("CASENAME not in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameBetween(String value1, String value2) {
            addCriterion("CASENAME between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotBetween(String value1, String value2) {
            addCriterion("CASENAME not between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andCasereasonIsNull() {
            addCriterion("CASEREASON is null");
            return (Criteria) this;
        }

        public Criteria andCasereasonIsNotNull() {
            addCriterion("CASEREASON is not null");
            return (Criteria) this;
        }

        public Criteria andCasereasonEqualTo(String value) {
            addCriterion("CASEREASON =", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonNotEqualTo(String value) {
            addCriterion("CASEREASON <>", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonGreaterThan(String value) {
            addCriterion("CASEREASON >", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonGreaterThanOrEqualTo(String value) {
            addCriterion("CASEREASON >=", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonLessThan(String value) {
            addCriterion("CASEREASON <", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonLessThanOrEqualTo(String value) {
            addCriterion("CASEREASON <=", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonLike(String value) {
            addCriterion("CASEREASON like", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonNotLike(String value) {
            addCriterion("CASEREASON not like", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonIn(List<String> values) {
            addCriterion("CASEREASON in", values, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonNotIn(List<String> values) {
            addCriterion("CASEREASON not in", values, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonBetween(String value1, String value2) {
            addCriterion("CASEREASON between", value1, value2, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonNotBetween(String value1, String value2) {
            addCriterion("CASEREASON not between", value1, value2, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasevalIsNull() {
            addCriterion("CASEVAL is null");
            return (Criteria) this;
        }

        public Criteria andCasevalIsNotNull() {
            addCriterion("CASEVAL is not null");
            return (Criteria) this;
        }

        public Criteria andCasevalEqualTo(BigDecimal value) {
            addCriterion("CASEVAL =", value, "caseval");
            return (Criteria) this;
        }

        public Criteria andCasevalNotEqualTo(BigDecimal value) {
            addCriterion("CASEVAL <>", value, "caseval");
            return (Criteria) this;
        }

        public Criteria andCasevalGreaterThan(BigDecimal value) {
            addCriterion("CASEVAL >", value, "caseval");
            return (Criteria) this;
        }

        public Criteria andCasevalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASEVAL >=", value, "caseval");
            return (Criteria) this;
        }

        public Criteria andCasevalLessThan(BigDecimal value) {
            addCriterion("CASEVAL <", value, "caseval");
            return (Criteria) this;
        }

        public Criteria andCasevalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASEVAL <=", value, "caseval");
            return (Criteria) this;
        }

        public Criteria andCasevalIn(List<BigDecimal> values) {
            addCriterion("CASEVAL in", values, "caseval");
            return (Criteria) this;
        }

        public Criteria andCasevalNotIn(List<BigDecimal> values) {
            addCriterion("CASEVAL not in", values, "caseval");
            return (Criteria) this;
        }

        public Criteria andCasevalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASEVAL between", value1, value2, "caseval");
            return (Criteria) this;
        }

        public Criteria andCasevalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASEVAL not between", value1, value2, "caseval");
            return (Criteria) this;
        }

        public Criteria andAppprocedureIsNull() {
            addCriterion("APPPROCEDURE is null");
            return (Criteria) this;
        }

        public Criteria andAppprocedureIsNotNull() {
            addCriterion("APPPROCEDURE is not null");
            return (Criteria) this;
        }

        public Criteria andAppprocedureEqualTo(String value) {
            addCriterion("APPPROCEDURE =", value, "appprocedure");
            return (Criteria) this;
        }

        public Criteria andAppprocedureNotEqualTo(String value) {
            addCriterion("APPPROCEDURE <>", value, "appprocedure");
            return (Criteria) this;
        }

        public Criteria andAppprocedureGreaterThan(String value) {
            addCriterion("APPPROCEDURE >", value, "appprocedure");
            return (Criteria) this;
        }

        public Criteria andAppprocedureGreaterThanOrEqualTo(String value) {
            addCriterion("APPPROCEDURE >=", value, "appprocedure");
            return (Criteria) this;
        }

        public Criteria andAppprocedureLessThan(String value) {
            addCriterion("APPPROCEDURE <", value, "appprocedure");
            return (Criteria) this;
        }

        public Criteria andAppprocedureLessThanOrEqualTo(String value) {
            addCriterion("APPPROCEDURE <=", value, "appprocedure");
            return (Criteria) this;
        }

        public Criteria andAppprocedureLike(String value) {
            addCriterion("APPPROCEDURE like", value, "appprocedure");
            return (Criteria) this;
        }

        public Criteria andAppprocedureNotLike(String value) {
            addCriterion("APPPROCEDURE not like", value, "appprocedure");
            return (Criteria) this;
        }

        public Criteria andAppprocedureIn(List<String> values) {
            addCriterion("APPPROCEDURE in", values, "appprocedure");
            return (Criteria) this;
        }

        public Criteria andAppprocedureNotIn(List<String> values) {
            addCriterion("APPPROCEDURE not in", values, "appprocedure");
            return (Criteria) this;
        }

        public Criteria andAppprocedureBetween(String value1, String value2) {
            addCriterion("APPPROCEDURE between", value1, value2, "appprocedure");
            return (Criteria) this;
        }

        public Criteria andAppprocedureNotBetween(String value1, String value2) {
            addCriterion("APPPROCEDURE not between", value1, value2, "appprocedure");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeIsNull() {
            addCriterion("ILLEGACTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeIsNotNull() {
            addCriterion("ILLEGACTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeEqualTo(String value) {
            addCriterion("ILLEGACTTYPE =", value, "illegacttype");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNotEqualTo(String value) {
            addCriterion("ILLEGACTTYPE <>", value, "illegacttype");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeGreaterThan(String value) {
            addCriterion("ILLEGACTTYPE >", value, "illegacttype");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ILLEGACTTYPE >=", value, "illegacttype");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeLessThan(String value) {
            addCriterion("ILLEGACTTYPE <", value, "illegacttype");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeLessThanOrEqualTo(String value) {
            addCriterion("ILLEGACTTYPE <=", value, "illegacttype");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeLike(String value) {
            addCriterion("ILLEGACTTYPE like", value, "illegacttype");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNotLike(String value) {
            addCriterion("ILLEGACTTYPE not like", value, "illegacttype");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeIn(List<String> values) {
            addCriterion("ILLEGACTTYPE in", values, "illegacttype");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNotIn(List<String> values) {
            addCriterion("ILLEGACTTYPE not in", values, "illegacttype");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeBetween(String value1, String value2) {
            addCriterion("ILLEGACTTYPE between", value1, value2, "illegacttype");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNotBetween(String value1, String value2) {
            addCriterion("ILLEGACTTYPE not between", value1, value2, "illegacttype");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameIsNull() {
            addCriterion("ILLEGACTTYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameIsNotNull() {
            addCriterion("ILLEGACTTYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameEqualTo(String value) {
            addCriterion("ILLEGACTTYPE_NAME =", value, "illegacttypeName");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameNotEqualTo(String value) {
            addCriterion("ILLEGACTTYPE_NAME <>", value, "illegacttypeName");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameGreaterThan(String value) {
            addCriterion("ILLEGACTTYPE_NAME >", value, "illegacttypeName");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ILLEGACTTYPE_NAME >=", value, "illegacttypeName");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameLessThan(String value) {
            addCriterion("ILLEGACTTYPE_NAME <", value, "illegacttypeName");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameLessThanOrEqualTo(String value) {
            addCriterion("ILLEGACTTYPE_NAME <=", value, "illegacttypeName");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameLike(String value) {
            addCriterion("ILLEGACTTYPE_NAME like", value, "illegacttypeName");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameNotLike(String value) {
            addCriterion("ILLEGACTTYPE_NAME not like", value, "illegacttypeName");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameIn(List<String> values) {
            addCriterion("ILLEGACTTYPE_NAME in", values, "illegacttypeName");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameNotIn(List<String> values) {
            addCriterion("ILLEGACTTYPE_NAME not in", values, "illegacttypeName");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameBetween(String value1, String value2) {
            addCriterion("ILLEGACTTYPE_NAME between", value1, value2, "illegacttypeName");
            return (Criteria) this;
        }

        public Criteria andIllegacttypeNameNotBetween(String value1, String value2) {
            addCriterion("ILLEGACTTYPE_NAME not between", value1, value2, "illegacttypeName");
            return (Criteria) this;
        }

        public Criteria andQuabasisIsNull() {
            addCriterion("QUABASIS is null");
            return (Criteria) this;
        }

        public Criteria andQuabasisIsNotNull() {
            addCriterion("QUABASIS is not null");
            return (Criteria) this;
        }

        public Criteria andQuabasisEqualTo(String value) {
            addCriterion("QUABASIS =", value, "quabasis");
            return (Criteria) this;
        }

        public Criteria andQuabasisNotEqualTo(String value) {
            addCriterion("QUABASIS <>", value, "quabasis");
            return (Criteria) this;
        }

        public Criteria andQuabasisGreaterThan(String value) {
            addCriterion("QUABASIS >", value, "quabasis");
            return (Criteria) this;
        }

        public Criteria andQuabasisGreaterThanOrEqualTo(String value) {
            addCriterion("QUABASIS >=", value, "quabasis");
            return (Criteria) this;
        }

        public Criteria andQuabasisLessThan(String value) {
            addCriterion("QUABASIS <", value, "quabasis");
            return (Criteria) this;
        }

        public Criteria andQuabasisLessThanOrEqualTo(String value) {
            addCriterion("QUABASIS <=", value, "quabasis");
            return (Criteria) this;
        }

        public Criteria andQuabasisLike(String value) {
            addCriterion("QUABASIS like", value, "quabasis");
            return (Criteria) this;
        }

        public Criteria andQuabasisNotLike(String value) {
            addCriterion("QUABASIS not like", value, "quabasis");
            return (Criteria) this;
        }

        public Criteria andQuabasisIn(List<String> values) {
            addCriterion("QUABASIS in", values, "quabasis");
            return (Criteria) this;
        }

        public Criteria andQuabasisNotIn(List<String> values) {
            addCriterion("QUABASIS not in", values, "quabasis");
            return (Criteria) this;
        }

        public Criteria andQuabasisBetween(String value1, String value2) {
            addCriterion("QUABASIS between", value1, value2, "quabasis");
            return (Criteria) this;
        }

        public Criteria andQuabasisNotBetween(String value1, String value2) {
            addCriterion("QUABASIS not between", value1, value2, "quabasis");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameIsNull() {
            addCriterion("QUABASIS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameIsNotNull() {
            addCriterion("QUABASIS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameEqualTo(String value) {
            addCriterion("QUABASIS_NAME =", value, "quabasisName");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameNotEqualTo(String value) {
            addCriterion("QUABASIS_NAME <>", value, "quabasisName");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameGreaterThan(String value) {
            addCriterion("QUABASIS_NAME >", value, "quabasisName");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameGreaterThanOrEqualTo(String value) {
            addCriterion("QUABASIS_NAME >=", value, "quabasisName");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameLessThan(String value) {
            addCriterion("QUABASIS_NAME <", value, "quabasisName");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameLessThanOrEqualTo(String value) {
            addCriterion("QUABASIS_NAME <=", value, "quabasisName");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameLike(String value) {
            addCriterion("QUABASIS_NAME like", value, "quabasisName");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameNotLike(String value) {
            addCriterion("QUABASIS_NAME not like", value, "quabasisName");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameIn(List<String> values) {
            addCriterion("QUABASIS_NAME in", values, "quabasisName");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameNotIn(List<String> values) {
            addCriterion("QUABASIS_NAME not in", values, "quabasisName");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameBetween(String value1, String value2) {
            addCriterion("QUABASIS_NAME between", value1, value2, "quabasisName");
            return (Criteria) this;
        }

        public Criteria andQuabasisNameNotBetween(String value1, String value2) {
            addCriterion("QUABASIS_NAME not between", value1, value2, "quabasisName");
            return (Criteria) this;
        }

        public Criteria andIllegincomeIsNull() {
            addCriterion("ILLEGINCOME is null");
            return (Criteria) this;
        }

        public Criteria andIllegincomeIsNotNull() {
            addCriterion("ILLEGINCOME is not null");
            return (Criteria) this;
        }

        public Criteria andIllegincomeEqualTo(BigDecimal value) {
            addCriterion("ILLEGINCOME =", value, "illegincome");
            return (Criteria) this;
        }

        public Criteria andIllegincomeNotEqualTo(BigDecimal value) {
            addCriterion("ILLEGINCOME <>", value, "illegincome");
            return (Criteria) this;
        }

        public Criteria andIllegincomeGreaterThan(BigDecimal value) {
            addCriterion("ILLEGINCOME >", value, "illegincome");
            return (Criteria) this;
        }

        public Criteria andIllegincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ILLEGINCOME >=", value, "illegincome");
            return (Criteria) this;
        }

        public Criteria andIllegincomeLessThan(BigDecimal value) {
            addCriterion("ILLEGINCOME <", value, "illegincome");
            return (Criteria) this;
        }

        public Criteria andIllegincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ILLEGINCOME <=", value, "illegincome");
            return (Criteria) this;
        }

        public Criteria andIllegincomeIn(List<BigDecimal> values) {
            addCriterion("ILLEGINCOME in", values, "illegincome");
            return (Criteria) this;
        }

        public Criteria andIllegincomeNotIn(List<BigDecimal> values) {
            addCriterion("ILLEGINCOME not in", values, "illegincome");
            return (Criteria) this;
        }

        public Criteria andIllegincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ILLEGINCOME between", value1, value2, "illegincome");
            return (Criteria) this;
        }

        public Criteria andIllegincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ILLEGINCOME not between", value1, value2, "illegincome");
            return (Criteria) this;
        }

        public Criteria andPentypeIsNull() {
            addCriterion("PENTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPentypeIsNotNull() {
            addCriterion("PENTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPentypeEqualTo(String value) {
            addCriterion("PENTYPE =", value, "pentype");
            return (Criteria) this;
        }

        public Criteria andPentypeNotEqualTo(String value) {
            addCriterion("PENTYPE <>", value, "pentype");
            return (Criteria) this;
        }

        public Criteria andPentypeGreaterThan(String value) {
            addCriterion("PENTYPE >", value, "pentype");
            return (Criteria) this;
        }

        public Criteria andPentypeGreaterThanOrEqualTo(String value) {
            addCriterion("PENTYPE >=", value, "pentype");
            return (Criteria) this;
        }

        public Criteria andPentypeLessThan(String value) {
            addCriterion("PENTYPE <", value, "pentype");
            return (Criteria) this;
        }

        public Criteria andPentypeLessThanOrEqualTo(String value) {
            addCriterion("PENTYPE <=", value, "pentype");
            return (Criteria) this;
        }

        public Criteria andPentypeLike(String value) {
            addCriterion("PENTYPE like", value, "pentype");
            return (Criteria) this;
        }

        public Criteria andPentypeNotLike(String value) {
            addCriterion("PENTYPE not like", value, "pentype");
            return (Criteria) this;
        }

        public Criteria andPentypeIn(List<String> values) {
            addCriterion("PENTYPE in", values, "pentype");
            return (Criteria) this;
        }

        public Criteria andPentypeNotIn(List<String> values) {
            addCriterion("PENTYPE not in", values, "pentype");
            return (Criteria) this;
        }

        public Criteria andPentypeBetween(String value1, String value2) {
            addCriterion("PENTYPE between", value1, value2, "pentype");
            return (Criteria) this;
        }

        public Criteria andPentypeNotBetween(String value1, String value2) {
            addCriterion("PENTYPE not between", value1, value2, "pentype");
            return (Criteria) this;
        }

        public Criteria andPentypeNameIsNull() {
            addCriterion("PENTYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPentypeNameIsNotNull() {
            addCriterion("PENTYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPentypeNameEqualTo(String value) {
            addCriterion("PENTYPE_NAME =", value, "pentypeName");
            return (Criteria) this;
        }

        public Criteria andPentypeNameNotEqualTo(String value) {
            addCriterion("PENTYPE_NAME <>", value, "pentypeName");
            return (Criteria) this;
        }

        public Criteria andPentypeNameGreaterThan(String value) {
            addCriterion("PENTYPE_NAME >", value, "pentypeName");
            return (Criteria) this;
        }

        public Criteria andPentypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("PENTYPE_NAME >=", value, "pentypeName");
            return (Criteria) this;
        }

        public Criteria andPentypeNameLessThan(String value) {
            addCriterion("PENTYPE_NAME <", value, "pentypeName");
            return (Criteria) this;
        }

        public Criteria andPentypeNameLessThanOrEqualTo(String value) {
            addCriterion("PENTYPE_NAME <=", value, "pentypeName");
            return (Criteria) this;
        }

        public Criteria andPentypeNameLike(String value) {
            addCriterion("PENTYPE_NAME like", value, "pentypeName");
            return (Criteria) this;
        }

        public Criteria andPentypeNameNotLike(String value) {
            addCriterion("PENTYPE_NAME not like", value, "pentypeName");
            return (Criteria) this;
        }

        public Criteria andPentypeNameIn(List<String> values) {
            addCriterion("PENTYPE_NAME in", values, "pentypeName");
            return (Criteria) this;
        }

        public Criteria andPentypeNameNotIn(List<String> values) {
            addCriterion("PENTYPE_NAME not in", values, "pentypeName");
            return (Criteria) this;
        }

        public Criteria andPentypeNameBetween(String value1, String value2) {
            addCriterion("PENTYPE_NAME between", value1, value2, "pentypeName");
            return (Criteria) this;
        }

        public Criteria andPentypeNameNotBetween(String value1, String value2) {
            addCriterion("PENTYPE_NAME not between", value1, value2, "pentypeName");
            return (Criteria) this;
        }

        public Criteria andPenresultIsNull() {
            addCriterion("PENRESULT is null");
            return (Criteria) this;
        }

        public Criteria andPenresultIsNotNull() {
            addCriterion("PENRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPenresultEqualTo(String value) {
            addCriterion("PENRESULT =", value, "penresult");
            return (Criteria) this;
        }

        public Criteria andPenresultNotEqualTo(String value) {
            addCriterion("PENRESULT <>", value, "penresult");
            return (Criteria) this;
        }

        public Criteria andPenresultGreaterThan(String value) {
            addCriterion("PENRESULT >", value, "penresult");
            return (Criteria) this;
        }

        public Criteria andPenresultGreaterThanOrEqualTo(String value) {
            addCriterion("PENRESULT >=", value, "penresult");
            return (Criteria) this;
        }

        public Criteria andPenresultLessThan(String value) {
            addCriterion("PENRESULT <", value, "penresult");
            return (Criteria) this;
        }

        public Criteria andPenresultLessThanOrEqualTo(String value) {
            addCriterion("PENRESULT <=", value, "penresult");
            return (Criteria) this;
        }

        public Criteria andPenresultLike(String value) {
            addCriterion("PENRESULT like", value, "penresult");
            return (Criteria) this;
        }

        public Criteria andPenresultNotLike(String value) {
            addCriterion("PENRESULT not like", value, "penresult");
            return (Criteria) this;
        }

        public Criteria andPenresultIn(List<String> values) {
            addCriterion("PENRESULT in", values, "penresult");
            return (Criteria) this;
        }

        public Criteria andPenresultNotIn(List<String> values) {
            addCriterion("PENRESULT not in", values, "penresult");
            return (Criteria) this;
        }

        public Criteria andPenresultBetween(String value1, String value2) {
            addCriterion("PENRESULT between", value1, value2, "penresult");
            return (Criteria) this;
        }

        public Criteria andPenresultNotBetween(String value1, String value2) {
            addCriterion("PENRESULT not between", value1, value2, "penresult");
            return (Criteria) this;
        }

        public Criteria andPenresultNameIsNull() {
            addCriterion("PENRESULT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPenresultNameIsNotNull() {
            addCriterion("PENRESULT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPenresultNameEqualTo(String value) {
            addCriterion("PENRESULT_NAME =", value, "penresultName");
            return (Criteria) this;
        }

        public Criteria andPenresultNameNotEqualTo(String value) {
            addCriterion("PENRESULT_NAME <>", value, "penresultName");
            return (Criteria) this;
        }

        public Criteria andPenresultNameGreaterThan(String value) {
            addCriterion("PENRESULT_NAME >", value, "penresultName");
            return (Criteria) this;
        }

        public Criteria andPenresultNameGreaterThanOrEqualTo(String value) {
            addCriterion("PENRESULT_NAME >=", value, "penresultName");
            return (Criteria) this;
        }

        public Criteria andPenresultNameLessThan(String value) {
            addCriterion("PENRESULT_NAME <", value, "penresultName");
            return (Criteria) this;
        }

        public Criteria andPenresultNameLessThanOrEqualTo(String value) {
            addCriterion("PENRESULT_NAME <=", value, "penresultName");
            return (Criteria) this;
        }

        public Criteria andPenresultNameLike(String value) {
            addCriterion("PENRESULT_NAME like", value, "penresultName");
            return (Criteria) this;
        }

        public Criteria andPenresultNameNotLike(String value) {
            addCriterion("PENRESULT_NAME not like", value, "penresultName");
            return (Criteria) this;
        }

        public Criteria andPenresultNameIn(List<String> values) {
            addCriterion("PENRESULT_NAME in", values, "penresultName");
            return (Criteria) this;
        }

        public Criteria andPenresultNameNotIn(List<String> values) {
            addCriterion("PENRESULT_NAME not in", values, "penresultName");
            return (Criteria) this;
        }

        public Criteria andPenresultNameBetween(String value1, String value2) {
            addCriterion("PENRESULT_NAME between", value1, value2, "penresultName");
            return (Criteria) this;
        }

        public Criteria andPenresultNameNotBetween(String value1, String value2) {
            addCriterion("PENRESULT_NAME not between", value1, value2, "penresultName");
            return (Criteria) this;
        }

        public Criteria andPenamIsNull() {
            addCriterion("PENAM is null");
            return (Criteria) this;
        }

        public Criteria andPenamIsNotNull() {
            addCriterion("PENAM is not null");
            return (Criteria) this;
        }

        public Criteria andPenamEqualTo(BigDecimal value) {
            addCriterion("PENAM =", value, "penam");
            return (Criteria) this;
        }

        public Criteria andPenamNotEqualTo(BigDecimal value) {
            addCriterion("PENAM <>", value, "penam");
            return (Criteria) this;
        }

        public Criteria andPenamGreaterThan(BigDecimal value) {
            addCriterion("PENAM >", value, "penam");
            return (Criteria) this;
        }

        public Criteria andPenamGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PENAM >=", value, "penam");
            return (Criteria) this;
        }

        public Criteria andPenamLessThan(BigDecimal value) {
            addCriterion("PENAM <", value, "penam");
            return (Criteria) this;
        }

        public Criteria andPenamLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PENAM <=", value, "penam");
            return (Criteria) this;
        }

        public Criteria andPenamIn(List<BigDecimal> values) {
            addCriterion("PENAM in", values, "penam");
            return (Criteria) this;
        }

        public Criteria andPenamNotIn(List<BigDecimal> values) {
            addCriterion("PENAM not in", values, "penam");
            return (Criteria) this;
        }

        public Criteria andPenamBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PENAM between", value1, value2, "penam");
            return (Criteria) this;
        }

        public Criteria andPenamNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PENAM not between", value1, value2, "penam");
            return (Criteria) this;
        }

        public Criteria andForfamIsNull() {
            addCriterion("FORFAM is null");
            return (Criteria) this;
        }

        public Criteria andForfamIsNotNull() {
            addCriterion("FORFAM is not null");
            return (Criteria) this;
        }

        public Criteria andForfamEqualTo(BigDecimal value) {
            addCriterion("FORFAM =", value, "forfam");
            return (Criteria) this;
        }

        public Criteria andForfamNotEqualTo(BigDecimal value) {
            addCriterion("FORFAM <>", value, "forfam");
            return (Criteria) this;
        }

        public Criteria andForfamGreaterThan(BigDecimal value) {
            addCriterion("FORFAM >", value, "forfam");
            return (Criteria) this;
        }

        public Criteria andForfamGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORFAM >=", value, "forfam");
            return (Criteria) this;
        }

        public Criteria andForfamLessThan(BigDecimal value) {
            addCriterion("FORFAM <", value, "forfam");
            return (Criteria) this;
        }

        public Criteria andForfamLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORFAM <=", value, "forfam");
            return (Criteria) this;
        }

        public Criteria andForfamIn(List<BigDecimal> values) {
            addCriterion("FORFAM in", values, "forfam");
            return (Criteria) this;
        }

        public Criteria andForfamNotIn(List<BigDecimal> values) {
            addCriterion("FORFAM not in", values, "forfam");
            return (Criteria) this;
        }

        public Criteria andForfamBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORFAM between", value1, value2, "forfam");
            return (Criteria) this;
        }

        public Criteria andForfamNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORFAM not between", value1, value2, "forfam");
            return (Criteria) this;
        }

        public Criteria andApprcuramIsNull() {
            addCriterion("APPRCURAM is null");
            return (Criteria) this;
        }

        public Criteria andApprcuramIsNotNull() {
            addCriterion("APPRCURAM is not null");
            return (Criteria) this;
        }

        public Criteria andApprcuramEqualTo(BigDecimal value) {
            addCriterion("APPRCURAM =", value, "apprcuram");
            return (Criteria) this;
        }

        public Criteria andApprcuramNotEqualTo(BigDecimal value) {
            addCriterion("APPRCURAM <>", value, "apprcuram");
            return (Criteria) this;
        }

        public Criteria andApprcuramGreaterThan(BigDecimal value) {
            addCriterion("APPRCURAM >", value, "apprcuram");
            return (Criteria) this;
        }

        public Criteria andApprcuramGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPRCURAM >=", value, "apprcuram");
            return (Criteria) this;
        }

        public Criteria andApprcuramLessThan(BigDecimal value) {
            addCriterion("APPRCURAM <", value, "apprcuram");
            return (Criteria) this;
        }

        public Criteria andApprcuramLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPRCURAM <=", value, "apprcuram");
            return (Criteria) this;
        }

        public Criteria andApprcuramIn(List<BigDecimal> values) {
            addCriterion("APPRCURAM in", values, "apprcuram");
            return (Criteria) this;
        }

        public Criteria andApprcuramNotIn(List<BigDecimal> values) {
            addCriterion("APPRCURAM not in", values, "apprcuram");
            return (Criteria) this;
        }

        public Criteria andApprcuramBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPRCURAM between", value1, value2, "apprcuram");
            return (Criteria) this;
        }

        public Criteria andApprcuramNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPRCURAM not between", value1, value2, "apprcuram");
            return (Criteria) this;
        }

        public Criteria andPenwritnoIsNull() {
            addCriterion("PENWRITNO is null");
            return (Criteria) this;
        }

        public Criteria andPenwritnoIsNotNull() {
            addCriterion("PENWRITNO is not null");
            return (Criteria) this;
        }

        public Criteria andPenwritnoEqualTo(String value) {
            addCriterion("PENWRITNO =", value, "penwritno");
            return (Criteria) this;
        }

        public Criteria andPenwritnoNotEqualTo(String value) {
            addCriterion("PENWRITNO <>", value, "penwritno");
            return (Criteria) this;
        }

        public Criteria andPenwritnoGreaterThan(String value) {
            addCriterion("PENWRITNO >", value, "penwritno");
            return (Criteria) this;
        }

        public Criteria andPenwritnoGreaterThanOrEqualTo(String value) {
            addCriterion("PENWRITNO >=", value, "penwritno");
            return (Criteria) this;
        }

        public Criteria andPenwritnoLessThan(String value) {
            addCriterion("PENWRITNO <", value, "penwritno");
            return (Criteria) this;
        }

        public Criteria andPenwritnoLessThanOrEqualTo(String value) {
            addCriterion("PENWRITNO <=", value, "penwritno");
            return (Criteria) this;
        }

        public Criteria andPenwritnoLike(String value) {
            addCriterion("PENWRITNO like", value, "penwritno");
            return (Criteria) this;
        }

        public Criteria andPenwritnoNotLike(String value) {
            addCriterion("PENWRITNO not like", value, "penwritno");
            return (Criteria) this;
        }

        public Criteria andPenwritnoIn(List<String> values) {
            addCriterion("PENWRITNO in", values, "penwritno");
            return (Criteria) this;
        }

        public Criteria andPenwritnoNotIn(List<String> values) {
            addCriterion("PENWRITNO not in", values, "penwritno");
            return (Criteria) this;
        }

        public Criteria andPenwritnoBetween(String value1, String value2) {
            addCriterion("PENWRITNO between", value1, value2, "penwritno");
            return (Criteria) this;
        }

        public Criteria andPenwritnoNotBetween(String value1, String value2) {
            addCriterion("PENWRITNO not between", value1, value2, "penwritno");
            return (Criteria) this;
        }

        public Criteria andPendecissdateIsNull() {
            addCriterion("PENDECISSDATE is null");
            return (Criteria) this;
        }

        public Criteria andPendecissdateIsNotNull() {
            addCriterion("PENDECISSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPendecissdateEqualTo(Date value) {
            addCriterion("PENDECISSDATE =", value, "pendecissdate");
            return (Criteria) this;
        }

        public Criteria andPendecissdateNotEqualTo(Date value) {
            addCriterion("PENDECISSDATE <>", value, "pendecissdate");
            return (Criteria) this;
        }

        public Criteria andPendecissdateGreaterThan(Date value) {
            addCriterion("PENDECISSDATE >", value, "pendecissdate");
            return (Criteria) this;
        }

        public Criteria andPendecissdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PENDECISSDATE >=", value, "pendecissdate");
            return (Criteria) this;
        }

        public Criteria andPendecissdateLessThan(Date value) {
            addCriterion("PENDECISSDATE <", value, "pendecissdate");
            return (Criteria) this;
        }

        public Criteria andPendecissdateLessThanOrEqualTo(Date value) {
            addCriterion("PENDECISSDATE <=", value, "pendecissdate");
            return (Criteria) this;
        }

        public Criteria andPendecissdateIn(List<Date> values) {
            addCriterion("PENDECISSDATE in", values, "pendecissdate");
            return (Criteria) this;
        }

        public Criteria andPendecissdateNotIn(List<Date> values) {
            addCriterion("PENDECISSDATE not in", values, "pendecissdate");
            return (Criteria) this;
        }

        public Criteria andPendecissdateBetween(Date value1, Date value2) {
            addCriterion("PENDECISSDATE between", value1, value2, "pendecissdate");
            return (Criteria) this;
        }

        public Criteria andPendecissdateNotBetween(Date value1, Date value2) {
            addCriterion("PENDECISSDATE not between", value1, value2, "pendecissdate");
            return (Criteria) this;
        }

        public Criteria andFedbacstaIsNull() {
            addCriterion("FEDBACSTA is null");
            return (Criteria) this;
        }

        public Criteria andFedbacstaIsNotNull() {
            addCriterion("FEDBACSTA is not null");
            return (Criteria) this;
        }

        public Criteria andFedbacstaEqualTo(String value) {
            addCriterion("FEDBACSTA =", value, "fedbacsta");
            return (Criteria) this;
        }

        public Criteria andFedbacstaNotEqualTo(String value) {
            addCriterion("FEDBACSTA <>", value, "fedbacsta");
            return (Criteria) this;
        }

        public Criteria andFedbacstaGreaterThan(String value) {
            addCriterion("FEDBACSTA >", value, "fedbacsta");
            return (Criteria) this;
        }

        public Criteria andFedbacstaGreaterThanOrEqualTo(String value) {
            addCriterion("FEDBACSTA >=", value, "fedbacsta");
            return (Criteria) this;
        }

        public Criteria andFedbacstaLessThan(String value) {
            addCriterion("FEDBACSTA <", value, "fedbacsta");
            return (Criteria) this;
        }

        public Criteria andFedbacstaLessThanOrEqualTo(String value) {
            addCriterion("FEDBACSTA <=", value, "fedbacsta");
            return (Criteria) this;
        }

        public Criteria andFedbacstaLike(String value) {
            addCriterion("FEDBACSTA like", value, "fedbacsta");
            return (Criteria) this;
        }

        public Criteria andFedbacstaNotLike(String value) {
            addCriterion("FEDBACSTA not like", value, "fedbacsta");
            return (Criteria) this;
        }

        public Criteria andFedbacstaIn(List<String> values) {
            addCriterion("FEDBACSTA in", values, "fedbacsta");
            return (Criteria) this;
        }

        public Criteria andFedbacstaNotIn(List<String> values) {
            addCriterion("FEDBACSTA not in", values, "fedbacsta");
            return (Criteria) this;
        }

        public Criteria andFedbacstaBetween(String value1, String value2) {
            addCriterion("FEDBACSTA between", value1, value2, "fedbacsta");
            return (Criteria) this;
        }

        public Criteria andFedbacstaNotBetween(String value1, String value2) {
            addCriterion("FEDBACSTA not between", value1, value2, "fedbacsta");
            return (Criteria) this;
        }

        public Criteria andCaseorgIsNull() {
            addCriterion("CASEORG is null");
            return (Criteria) this;
        }

        public Criteria andCaseorgIsNotNull() {
            addCriterion("CASEORG is not null");
            return (Criteria) this;
        }

        public Criteria andCaseorgEqualTo(String value) {
            addCriterion("CASEORG =", value, "caseorg");
            return (Criteria) this;
        }

        public Criteria andCaseorgNotEqualTo(String value) {
            addCriterion("CASEORG <>", value, "caseorg");
            return (Criteria) this;
        }

        public Criteria andCaseorgGreaterThan(String value) {
            addCriterion("CASEORG >", value, "caseorg");
            return (Criteria) this;
        }

        public Criteria andCaseorgGreaterThanOrEqualTo(String value) {
            addCriterion("CASEORG >=", value, "caseorg");
            return (Criteria) this;
        }

        public Criteria andCaseorgLessThan(String value) {
            addCriterion("CASEORG <", value, "caseorg");
            return (Criteria) this;
        }

        public Criteria andCaseorgLessThanOrEqualTo(String value) {
            addCriterion("CASEORG <=", value, "caseorg");
            return (Criteria) this;
        }

        public Criteria andCaseorgLike(String value) {
            addCriterion("CASEORG like", value, "caseorg");
            return (Criteria) this;
        }

        public Criteria andCaseorgNotLike(String value) {
            addCriterion("CASEORG not like", value, "caseorg");
            return (Criteria) this;
        }

        public Criteria andCaseorgIn(List<String> values) {
            addCriterion("CASEORG in", values, "caseorg");
            return (Criteria) this;
        }

        public Criteria andCaseorgNotIn(List<String> values) {
            addCriterion("CASEORG not in", values, "caseorg");
            return (Criteria) this;
        }

        public Criteria andCaseorgBetween(String value1, String value2) {
            addCriterion("CASEORG between", value1, value2, "caseorg");
            return (Criteria) this;
        }

        public Criteria andCaseorgNotBetween(String value1, String value2) {
            addCriterion("CASEORG not between", value1, value2, "caseorg");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameIsNull() {
            addCriterion("CASEORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameIsNotNull() {
            addCriterion("CASEORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameEqualTo(String value) {
            addCriterion("CASEORG_NAME =", value, "caseorgName");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameNotEqualTo(String value) {
            addCriterion("CASEORG_NAME <>", value, "caseorgName");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameGreaterThan(String value) {
            addCriterion("CASEORG_NAME >", value, "caseorgName");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameGreaterThanOrEqualTo(String value) {
            addCriterion("CASEORG_NAME >=", value, "caseorgName");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameLessThan(String value) {
            addCriterion("CASEORG_NAME <", value, "caseorgName");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameLessThanOrEqualTo(String value) {
            addCriterion("CASEORG_NAME <=", value, "caseorgName");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameLike(String value) {
            addCriterion("CASEORG_NAME like", value, "caseorgName");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameNotLike(String value) {
            addCriterion("CASEORG_NAME not like", value, "caseorgName");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameIn(List<String> values) {
            addCriterion("CASEORG_NAME in", values, "caseorgName");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameNotIn(List<String> values) {
            addCriterion("CASEORG_NAME not in", values, "caseorgName");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameBetween(String value1, String value2) {
            addCriterion("CASEORG_NAME between", value1, value2, "caseorgName");
            return (Criteria) this;
        }

        public Criteria andCaseorgNameNotBetween(String value1, String value2) {
            addCriterion("CASEORG_NAME not between", value1, value2, "caseorgName");
            return (Criteria) this;
        }

        public Criteria andPenexestIsNull() {
            addCriterion("PENEXEST is null");
            return (Criteria) this;
        }

        public Criteria andPenexestIsNotNull() {
            addCriterion("PENEXEST is not null");
            return (Criteria) this;
        }

        public Criteria andPenexestEqualTo(String value) {
            addCriterion("PENEXEST =", value, "penexest");
            return (Criteria) this;
        }

        public Criteria andPenexestNotEqualTo(String value) {
            addCriterion("PENEXEST <>", value, "penexest");
            return (Criteria) this;
        }

        public Criteria andPenexestGreaterThan(String value) {
            addCriterion("PENEXEST >", value, "penexest");
            return (Criteria) this;
        }

        public Criteria andPenexestGreaterThanOrEqualTo(String value) {
            addCriterion("PENEXEST >=", value, "penexest");
            return (Criteria) this;
        }

        public Criteria andPenexestLessThan(String value) {
            addCriterion("PENEXEST <", value, "penexest");
            return (Criteria) this;
        }

        public Criteria andPenexestLessThanOrEqualTo(String value) {
            addCriterion("PENEXEST <=", value, "penexest");
            return (Criteria) this;
        }

        public Criteria andPenexestLike(String value) {
            addCriterion("PENEXEST like", value, "penexest");
            return (Criteria) this;
        }

        public Criteria andPenexestNotLike(String value) {
            addCriterion("PENEXEST not like", value, "penexest");
            return (Criteria) this;
        }

        public Criteria andPenexestIn(List<String> values) {
            addCriterion("PENEXEST in", values, "penexest");
            return (Criteria) this;
        }

        public Criteria andPenexestNotIn(List<String> values) {
            addCriterion("PENEXEST not in", values, "penexest");
            return (Criteria) this;
        }

        public Criteria andPenexestBetween(String value1, String value2) {
            addCriterion("PENEXEST between", value1, value2, "penexest");
            return (Criteria) this;
        }

        public Criteria andPenexestNotBetween(String value1, String value2) {
            addCriterion("PENEXEST not between", value1, value2, "penexest");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNameIsNull() {
            addCriterion("STATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStateNameIsNotNull() {
            addCriterion("STATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStateNameEqualTo(String value) {
            addCriterion("STATE_NAME =", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameNotEqualTo(String value) {
            addCriterion("STATE_NAME <>", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameGreaterThan(String value) {
            addCriterion("STATE_NAME >", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("STATE_NAME >=", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameLessThan(String value) {
            addCriterion("STATE_NAME <", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameLessThanOrEqualTo(String value) {
            addCriterion("STATE_NAME <=", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameLike(String value) {
            addCriterion("STATE_NAME like", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameNotLike(String value) {
            addCriterion("STATE_NAME not like", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameIn(List<String> values) {
            addCriterion("STATE_NAME in", values, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameNotIn(List<String> values) {
            addCriterion("STATE_NAME not in", values, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameBetween(String value1, String value2) {
            addCriterion("STATE_NAME between", value1, value2, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameNotBetween(String value1, String value2) {
            addCriterion("STATE_NAME not between", value1, value2, "stateName");
            return (Criteria) this;
        }

        public Criteria andClocasedateIsNull() {
            addCriterion("CLOCASEDATE is null");
            return (Criteria) this;
        }

        public Criteria andClocasedateIsNotNull() {
            addCriterion("CLOCASEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andClocasedateEqualTo(Date value) {
            addCriterion("CLOCASEDATE =", value, "clocasedate");
            return (Criteria) this;
        }

        public Criteria andClocasedateNotEqualTo(Date value) {
            addCriterion("CLOCASEDATE <>", value, "clocasedate");
            return (Criteria) this;
        }

        public Criteria andClocasedateGreaterThan(Date value) {
            addCriterion("CLOCASEDATE >", value, "clocasedate");
            return (Criteria) this;
        }

        public Criteria andClocasedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CLOCASEDATE >=", value, "clocasedate");
            return (Criteria) this;
        }

        public Criteria andClocasedateLessThan(Date value) {
            addCriterion("CLOCASEDATE <", value, "clocasedate");
            return (Criteria) this;
        }

        public Criteria andClocasedateLessThanOrEqualTo(Date value) {
            addCriterion("CLOCASEDATE <=", value, "clocasedate");
            return (Criteria) this;
        }

        public Criteria andClocasedateIn(List<Date> values) {
            addCriterion("CLOCASEDATE in", values, "clocasedate");
            return (Criteria) this;
        }

        public Criteria andClocasedateNotIn(List<Date> values) {
            addCriterion("CLOCASEDATE not in", values, "clocasedate");
            return (Criteria) this;
        }

        public Criteria andClocasedateBetween(Date value1, Date value2) {
            addCriterion("CLOCASEDATE between", value1, value2, "clocasedate");
            return (Criteria) this;
        }

        public Criteria andClocasedateNotBetween(Date value1, Date value2) {
            addCriterion("CLOCASEDATE not between", value1, value2, "clocasedate");
            return (Criteria) this;
        }

        public Criteria andClocasereaIsNull() {
            addCriterion("CLOCASEREA is null");
            return (Criteria) this;
        }

        public Criteria andClocasereaIsNotNull() {
            addCriterion("CLOCASEREA is not null");
            return (Criteria) this;
        }

        public Criteria andClocasereaEqualTo(String value) {
            addCriterion("CLOCASEREA =", value, "clocaserea");
            return (Criteria) this;
        }

        public Criteria andClocasereaNotEqualTo(String value) {
            addCriterion("CLOCASEREA <>", value, "clocaserea");
            return (Criteria) this;
        }

        public Criteria andClocasereaGreaterThan(String value) {
            addCriterion("CLOCASEREA >", value, "clocaserea");
            return (Criteria) this;
        }

        public Criteria andClocasereaGreaterThanOrEqualTo(String value) {
            addCriterion("CLOCASEREA >=", value, "clocaserea");
            return (Criteria) this;
        }

        public Criteria andClocasereaLessThan(String value) {
            addCriterion("CLOCASEREA <", value, "clocaserea");
            return (Criteria) this;
        }

        public Criteria andClocasereaLessThanOrEqualTo(String value) {
            addCriterion("CLOCASEREA <=", value, "clocaserea");
            return (Criteria) this;
        }

        public Criteria andClocasereaLike(String value) {
            addCriterion("CLOCASEREA like", value, "clocaserea");
            return (Criteria) this;
        }

        public Criteria andClocasereaNotLike(String value) {
            addCriterion("CLOCASEREA not like", value, "clocaserea");
            return (Criteria) this;
        }

        public Criteria andClocasereaIn(List<String> values) {
            addCriterion("CLOCASEREA in", values, "clocaserea");
            return (Criteria) this;
        }

        public Criteria andClocasereaNotIn(List<String> values) {
            addCriterion("CLOCASEREA not in", values, "clocaserea");
            return (Criteria) this;
        }

        public Criteria andClocasereaBetween(String value1, String value2) {
            addCriterion("CLOCASEREA between", value1, value2, "clocaserea");
            return (Criteria) this;
        }

        public Criteria andClocasereaNotBetween(String value1, String value2) {
            addCriterion("CLOCASEREA not between", value1, value2, "clocaserea");
            return (Criteria) this;
        }

        public Criteria andClocasereanameIsNull() {
            addCriterion("CLOCASEREANAME is null");
            return (Criteria) this;
        }

        public Criteria andClocasereanameIsNotNull() {
            addCriterion("CLOCASEREANAME is not null");
            return (Criteria) this;
        }

        public Criteria andClocasereanameEqualTo(String value) {
            addCriterion("CLOCASEREANAME =", value, "clocasereaname");
            return (Criteria) this;
        }

        public Criteria andClocasereanameNotEqualTo(String value) {
            addCriterion("CLOCASEREANAME <>", value, "clocasereaname");
            return (Criteria) this;
        }

        public Criteria andClocasereanameGreaterThan(String value) {
            addCriterion("CLOCASEREANAME >", value, "clocasereaname");
            return (Criteria) this;
        }

        public Criteria andClocasereanameGreaterThanOrEqualTo(String value) {
            addCriterion("CLOCASEREANAME >=", value, "clocasereaname");
            return (Criteria) this;
        }

        public Criteria andClocasereanameLessThan(String value) {
            addCriterion("CLOCASEREANAME <", value, "clocasereaname");
            return (Criteria) this;
        }

        public Criteria andClocasereanameLessThanOrEqualTo(String value) {
            addCriterion("CLOCASEREANAME <=", value, "clocasereaname");
            return (Criteria) this;
        }

        public Criteria andClocasereanameLike(String value) {
            addCriterion("CLOCASEREANAME like", value, "clocasereaname");
            return (Criteria) this;
        }

        public Criteria andClocasereanameNotLike(String value) {
            addCriterion("CLOCASEREANAME not like", value, "clocasereaname");
            return (Criteria) this;
        }

        public Criteria andClocasereanameIn(List<String> values) {
            addCriterion("CLOCASEREANAME in", values, "clocasereaname");
            return (Criteria) this;
        }

        public Criteria andClocasereanameNotIn(List<String> values) {
            addCriterion("CLOCASEREANAME not in", values, "clocasereaname");
            return (Criteria) this;
        }

        public Criteria andClocasereanameBetween(String value1, String value2) {
            addCriterion("CLOCASEREANAME between", value1, value2, "clocasereaname");
            return (Criteria) this;
        }

        public Criteria andClocasereanameNotBetween(String value1, String value2) {
            addCriterion("CLOCASEREANAME not between", value1, value2, "clocasereaname");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeIsNull() {
            addCriterion("ACCPTRANFAUTHTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeIsNotNull() {
            addCriterion("ACCPTRANFAUTHTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeEqualTo(String value) {
            addCriterion("ACCPTRANFAUTHTYPE =", value, "accptranfauthtype");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeNotEqualTo(String value) {
            addCriterion("ACCPTRANFAUTHTYPE <>", value, "accptranfauthtype");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeGreaterThan(String value) {
            addCriterion("ACCPTRANFAUTHTYPE >", value, "accptranfauthtype");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCPTRANFAUTHTYPE >=", value, "accptranfauthtype");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeLessThan(String value) {
            addCriterion("ACCPTRANFAUTHTYPE <", value, "accptranfauthtype");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeLessThanOrEqualTo(String value) {
            addCriterion("ACCPTRANFAUTHTYPE <=", value, "accptranfauthtype");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeLike(String value) {
            addCriterion("ACCPTRANFAUTHTYPE like", value, "accptranfauthtype");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeNotLike(String value) {
            addCriterion("ACCPTRANFAUTHTYPE not like", value, "accptranfauthtype");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeIn(List<String> values) {
            addCriterion("ACCPTRANFAUTHTYPE in", values, "accptranfauthtype");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeNotIn(List<String> values) {
            addCriterion("ACCPTRANFAUTHTYPE not in", values, "accptranfauthtype");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeBetween(String value1, String value2) {
            addCriterion("ACCPTRANFAUTHTYPE between", value1, value2, "accptranfauthtype");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypeNotBetween(String value1, String value2) {
            addCriterion("ACCPTRANFAUTHTYPE not between", value1, value2, "accptranfauthtype");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameIsNull() {
            addCriterion("ACCPTRANFAUTHTYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameIsNotNull() {
            addCriterion("ACCPTRANFAUTHTYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameEqualTo(String value) {
            addCriterion("ACCPTRANFAUTHTYPENAME =", value, "accptranfauthtypename");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameNotEqualTo(String value) {
            addCriterion("ACCPTRANFAUTHTYPENAME <>", value, "accptranfauthtypename");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameGreaterThan(String value) {
            addCriterion("ACCPTRANFAUTHTYPENAME >", value, "accptranfauthtypename");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCPTRANFAUTHTYPENAME >=", value, "accptranfauthtypename");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameLessThan(String value) {
            addCriterion("ACCPTRANFAUTHTYPENAME <", value, "accptranfauthtypename");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameLessThanOrEqualTo(String value) {
            addCriterion("ACCPTRANFAUTHTYPENAME <=", value, "accptranfauthtypename");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameLike(String value) {
            addCriterion("ACCPTRANFAUTHTYPENAME like", value, "accptranfauthtypename");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameNotLike(String value) {
            addCriterion("ACCPTRANFAUTHTYPENAME not like", value, "accptranfauthtypename");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameIn(List<String> values) {
            addCriterion("ACCPTRANFAUTHTYPENAME in", values, "accptranfauthtypename");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameNotIn(List<String> values) {
            addCriterion("ACCPTRANFAUTHTYPENAME not in", values, "accptranfauthtypename");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameBetween(String value1, String value2) {
            addCriterion("ACCPTRANFAUTHTYPENAME between", value1, value2, "accptranfauthtypename");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthtypenameNotBetween(String value1, String value2) {
            addCriterion("ACCPTRANFAUTHTYPENAME not between", value1, value2, "accptranfauthtypename");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthIsNull() {
            addCriterion("ACCPTRANFAUTH is null");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthIsNotNull() {
            addCriterion("ACCPTRANFAUTH is not null");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthEqualTo(String value) {
            addCriterion("ACCPTRANFAUTH =", value, "accptranfauth");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthNotEqualTo(String value) {
            addCriterion("ACCPTRANFAUTH <>", value, "accptranfauth");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthGreaterThan(String value) {
            addCriterion("ACCPTRANFAUTH >", value, "accptranfauth");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthGreaterThanOrEqualTo(String value) {
            addCriterion("ACCPTRANFAUTH >=", value, "accptranfauth");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthLessThan(String value) {
            addCriterion("ACCPTRANFAUTH <", value, "accptranfauth");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthLessThanOrEqualTo(String value) {
            addCriterion("ACCPTRANFAUTH <=", value, "accptranfauth");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthLike(String value) {
            addCriterion("ACCPTRANFAUTH like", value, "accptranfauth");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthNotLike(String value) {
            addCriterion("ACCPTRANFAUTH not like", value, "accptranfauth");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthIn(List<String> values) {
            addCriterion("ACCPTRANFAUTH in", values, "accptranfauth");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthNotIn(List<String> values) {
            addCriterion("ACCPTRANFAUTH not in", values, "accptranfauth");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthBetween(String value1, String value2) {
            addCriterion("ACCPTRANFAUTH between", value1, value2, "accptranfauth");
            return (Criteria) this;
        }

        public Criteria andAccptranfauthNotBetween(String value1, String value2) {
            addCriterion("ACCPTRANFAUTH not between", value1, value2, "accptranfauth");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeIsNull() {
            addCriterion("TRANFREATYPE is null");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeIsNotNull() {
            addCriterion("TRANFREATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeEqualTo(String value) {
            addCriterion("TRANFREATYPE =", value, "tranfreatype");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeNotEqualTo(String value) {
            addCriterion("TRANFREATYPE <>", value, "tranfreatype");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeGreaterThan(String value) {
            addCriterion("TRANFREATYPE >", value, "tranfreatype");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANFREATYPE >=", value, "tranfreatype");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeLessThan(String value) {
            addCriterion("TRANFREATYPE <", value, "tranfreatype");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeLessThanOrEqualTo(String value) {
            addCriterion("TRANFREATYPE <=", value, "tranfreatype");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeLike(String value) {
            addCriterion("TRANFREATYPE like", value, "tranfreatype");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeNotLike(String value) {
            addCriterion("TRANFREATYPE not like", value, "tranfreatype");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeIn(List<String> values) {
            addCriterion("TRANFREATYPE in", values, "tranfreatype");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeNotIn(List<String> values) {
            addCriterion("TRANFREATYPE not in", values, "tranfreatype");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeBetween(String value1, String value2) {
            addCriterion("TRANFREATYPE between", value1, value2, "tranfreatype");
            return (Criteria) this;
        }

        public Criteria andTranfreatypeNotBetween(String value1, String value2) {
            addCriterion("TRANFREATYPE not between", value1, value2, "tranfreatype");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameIsNull() {
            addCriterion("TRANFREATYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameIsNotNull() {
            addCriterion("TRANFREATYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameEqualTo(String value) {
            addCriterion("TRANFREATYPENAME =", value, "tranfreatypename");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameNotEqualTo(String value) {
            addCriterion("TRANFREATYPENAME <>", value, "tranfreatypename");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameGreaterThan(String value) {
            addCriterion("TRANFREATYPENAME >", value, "tranfreatypename");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameGreaterThanOrEqualTo(String value) {
            addCriterion("TRANFREATYPENAME >=", value, "tranfreatypename");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameLessThan(String value) {
            addCriterion("TRANFREATYPENAME <", value, "tranfreatypename");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameLessThanOrEqualTo(String value) {
            addCriterion("TRANFREATYPENAME <=", value, "tranfreatypename");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameLike(String value) {
            addCriterion("TRANFREATYPENAME like", value, "tranfreatypename");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameNotLike(String value) {
            addCriterion("TRANFREATYPENAME not like", value, "tranfreatypename");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameIn(List<String> values) {
            addCriterion("TRANFREATYPENAME in", values, "tranfreatypename");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameNotIn(List<String> values) {
            addCriterion("TRANFREATYPENAME not in", values, "tranfreatypename");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameBetween(String value1, String value2) {
            addCriterion("TRANFREATYPENAME between", value1, value2, "tranfreatypename");
            return (Criteria) this;
        }

        public Criteria andTranfreatypenameNotBetween(String value1, String value2) {
            addCriterion("TRANFREATYPENAME not between", value1, value2, "tranfreatypename");
            return (Criteria) this;
        }

        public Criteria andTranfreaIsNull() {
            addCriterion("TRANFREA is null");
            return (Criteria) this;
        }

        public Criteria andTranfreaIsNotNull() {
            addCriterion("TRANFREA is not null");
            return (Criteria) this;
        }

        public Criteria andTranfreaEqualTo(String value) {
            addCriterion("TRANFREA =", value, "tranfrea");
            return (Criteria) this;
        }

        public Criteria andTranfreaNotEqualTo(String value) {
            addCriterion("TRANFREA <>", value, "tranfrea");
            return (Criteria) this;
        }

        public Criteria andTranfreaGreaterThan(String value) {
            addCriterion("TRANFREA >", value, "tranfrea");
            return (Criteria) this;
        }

        public Criteria andTranfreaGreaterThanOrEqualTo(String value) {
            addCriterion("TRANFREA >=", value, "tranfrea");
            return (Criteria) this;
        }

        public Criteria andTranfreaLessThan(String value) {
            addCriterion("TRANFREA <", value, "tranfrea");
            return (Criteria) this;
        }

        public Criteria andTranfreaLessThanOrEqualTo(String value) {
            addCriterion("TRANFREA <=", value, "tranfrea");
            return (Criteria) this;
        }

        public Criteria andTranfreaLike(String value) {
            addCriterion("TRANFREA like", value, "tranfrea");
            return (Criteria) this;
        }

        public Criteria andTranfreaNotLike(String value) {
            addCriterion("TRANFREA not like", value, "tranfrea");
            return (Criteria) this;
        }

        public Criteria andTranfreaIn(List<String> values) {
            addCriterion("TRANFREA in", values, "tranfrea");
            return (Criteria) this;
        }

        public Criteria andTranfreaNotIn(List<String> values) {
            addCriterion("TRANFREA not in", values, "tranfrea");
            return (Criteria) this;
        }

        public Criteria andTranfreaBetween(String value1, String value2) {
            addCriterion("TRANFREA between", value1, value2, "tranfrea");
            return (Criteria) this;
        }

        public Criteria andTranfreaNotBetween(String value1, String value2) {
            addCriterion("TRANFREA not between", value1, value2, "tranfrea");
            return (Criteria) this;
        }

        public Criteria andTranfdateIsNull() {
            addCriterion("TRANFDATE is null");
            return (Criteria) this;
        }

        public Criteria andTranfdateIsNotNull() {
            addCriterion("TRANFDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTranfdateEqualTo(Date value) {
            addCriterion("TRANFDATE =", value, "tranfdate");
            return (Criteria) this;
        }

        public Criteria andTranfdateNotEqualTo(Date value) {
            addCriterion("TRANFDATE <>", value, "tranfdate");
            return (Criteria) this;
        }

        public Criteria andTranfdateGreaterThan(Date value) {
            addCriterion("TRANFDATE >", value, "tranfdate");
            return (Criteria) this;
        }

        public Criteria andTranfdateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANFDATE >=", value, "tranfdate");
            return (Criteria) this;
        }

        public Criteria andTranfdateLessThan(Date value) {
            addCriterion("TRANFDATE <", value, "tranfdate");
            return (Criteria) this;
        }

        public Criteria andTranfdateLessThanOrEqualTo(Date value) {
            addCriterion("TRANFDATE <=", value, "tranfdate");
            return (Criteria) this;
        }

        public Criteria andTranfdateIn(List<Date> values) {
            addCriterion("TRANFDATE in", values, "tranfdate");
            return (Criteria) this;
        }

        public Criteria andTranfdateNotIn(List<Date> values) {
            addCriterion("TRANFDATE not in", values, "tranfdate");
            return (Criteria) this;
        }

        public Criteria andTranfdateBetween(Date value1, Date value2) {
            addCriterion("TRANFDATE between", value1, value2, "tranfdate");
            return (Criteria) this;
        }

        public Criteria andTranfdateNotBetween(Date value1, Date value2) {
            addCriterion("TRANFDATE not between", value1, value2, "tranfdate");
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

        public Criteria andCasefidateIsNull() {
            addCriterion("CASEFIDATE is null");
            return (Criteria) this;
        }

        public Criteria andCasefidateIsNotNull() {
            addCriterion("CASEFIDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCasefidateEqualTo(Date value) {
            addCriterion("CASEFIDATE =", value, "casefidate");
            return (Criteria) this;
        }

        public Criteria andCasefidateNotEqualTo(Date value) {
            addCriterion("CASEFIDATE <>", value, "casefidate");
            return (Criteria) this;
        }

        public Criteria andCasefidateGreaterThan(Date value) {
            addCriterion("CASEFIDATE >", value, "casefidate");
            return (Criteria) this;
        }

        public Criteria andCasefidateGreaterThanOrEqualTo(Date value) {
            addCriterion("CASEFIDATE >=", value, "casefidate");
            return (Criteria) this;
        }

        public Criteria andCasefidateLessThan(Date value) {
            addCriterion("CASEFIDATE <", value, "casefidate");
            return (Criteria) this;
        }

        public Criteria andCasefidateLessThanOrEqualTo(Date value) {
            addCriterion("CASEFIDATE <=", value, "casefidate");
            return (Criteria) this;
        }

        public Criteria andCasefidateIn(List<Date> values) {
            addCriterion("CASEFIDATE in", values, "casefidate");
            return (Criteria) this;
        }

        public Criteria andCasefidateNotIn(List<Date> values) {
            addCriterion("CASEFIDATE not in", values, "casefidate");
            return (Criteria) this;
        }

        public Criteria andCasefidateBetween(Date value1, Date value2) {
            addCriterion("CASEFIDATE between", value1, value2, "casefidate");
            return (Criteria) this;
        }

        public Criteria andCasefidateNotBetween(Date value1, Date value2) {
            addCriterion("CASEFIDATE not between", value1, value2, "casefidate");
            return (Criteria) this;
        }

        public Criteria andCaseenddateIsNull() {
            addCriterion("CASEENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andCaseenddateIsNotNull() {
            addCriterion("CASEENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCaseenddateEqualTo(Date value) {
            addCriterion("CASEENDDATE =", value, "caseenddate");
            return (Criteria) this;
        }

        public Criteria andCaseenddateNotEqualTo(Date value) {
            addCriterion("CASEENDDATE <>", value, "caseenddate");
            return (Criteria) this;
        }

        public Criteria andCaseenddateGreaterThan(Date value) {
            addCriterion("CASEENDDATE >", value, "caseenddate");
            return (Criteria) this;
        }

        public Criteria andCaseenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("CASEENDDATE >=", value, "caseenddate");
            return (Criteria) this;
        }

        public Criteria andCaseenddateLessThan(Date value) {
            addCriterion("CASEENDDATE <", value, "caseenddate");
            return (Criteria) this;
        }

        public Criteria andCaseenddateLessThanOrEqualTo(Date value) {
            addCriterion("CASEENDDATE <=", value, "caseenddate");
            return (Criteria) this;
        }

        public Criteria andCaseenddateIn(List<Date> values) {
            addCriterion("CASEENDDATE in", values, "caseenddate");
            return (Criteria) this;
        }

        public Criteria andCaseenddateNotIn(List<Date> values) {
            addCriterion("CASEENDDATE not in", values, "caseenddate");
            return (Criteria) this;
        }

        public Criteria andCaseenddateBetween(Date value1, Date value2) {
            addCriterion("CASEENDDATE between", value1, value2, "caseenddate");
            return (Criteria) this;
        }

        public Criteria andCaseenddateNotBetween(Date value1, Date value2) {
            addCriterion("CASEENDDATE not between", value1, value2, "caseenddate");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictIsNull() {
            addCriterion("CASESCEDISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictIsNotNull() {
            addCriterion("CASESCEDISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictEqualTo(String value) {
            addCriterion("CASESCEDISTRICT =", value, "casescedistrict");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictNotEqualTo(String value) {
            addCriterion("CASESCEDISTRICT <>", value, "casescedistrict");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictGreaterThan(String value) {
            addCriterion("CASESCEDISTRICT >", value, "casescedistrict");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictGreaterThanOrEqualTo(String value) {
            addCriterion("CASESCEDISTRICT >=", value, "casescedistrict");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictLessThan(String value) {
            addCriterion("CASESCEDISTRICT <", value, "casescedistrict");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictLessThanOrEqualTo(String value) {
            addCriterion("CASESCEDISTRICT <=", value, "casescedistrict");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictLike(String value) {
            addCriterion("CASESCEDISTRICT like", value, "casescedistrict");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictNotLike(String value) {
            addCriterion("CASESCEDISTRICT not like", value, "casescedistrict");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictIn(List<String> values) {
            addCriterion("CASESCEDISTRICT in", values, "casescedistrict");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictNotIn(List<String> values) {
            addCriterion("CASESCEDISTRICT not in", values, "casescedistrict");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictBetween(String value1, String value2) {
            addCriterion("CASESCEDISTRICT between", value1, value2, "casescedistrict");
            return (Criteria) this;
        }

        public Criteria andCasescedistrictNotBetween(String value1, String value2) {
            addCriterion("CASESCEDISTRICT not between", value1, value2, "casescedistrict");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameIsNull() {
            addCriterion("CASESCEDISNAME is null");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameIsNotNull() {
            addCriterion("CASESCEDISNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameEqualTo(String value) {
            addCriterion("CASESCEDISNAME =", value, "casescedisname");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameNotEqualTo(String value) {
            addCriterion("CASESCEDISNAME <>", value, "casescedisname");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameGreaterThan(String value) {
            addCriterion("CASESCEDISNAME >", value, "casescedisname");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameGreaterThanOrEqualTo(String value) {
            addCriterion("CASESCEDISNAME >=", value, "casescedisname");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameLessThan(String value) {
            addCriterion("CASESCEDISNAME <", value, "casescedisname");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameLessThanOrEqualTo(String value) {
            addCriterion("CASESCEDISNAME <=", value, "casescedisname");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameLike(String value) {
            addCriterion("CASESCEDISNAME like", value, "casescedisname");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameNotLike(String value) {
            addCriterion("CASESCEDISNAME not like", value, "casescedisname");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameIn(List<String> values) {
            addCriterion("CASESCEDISNAME in", values, "casescedisname");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameNotIn(List<String> values) {
            addCriterion("CASESCEDISNAME not in", values, "casescedisname");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameBetween(String value1, String value2) {
            addCriterion("CASESCEDISNAME between", value1, value2, "casescedisname");
            return (Criteria) this;
        }

        public Criteria andCasescedisnameNotBetween(String value1, String value2) {
            addCriterion("CASESCEDISNAME not between", value1, value2, "casescedisname");
            return (Criteria) this;
        }

        public Criteria andCasespotIsNull() {
            addCriterion("CASESPOT is null");
            return (Criteria) this;
        }

        public Criteria andCasespotIsNotNull() {
            addCriterion("CASESPOT is not null");
            return (Criteria) this;
        }

        public Criteria andCasespotEqualTo(String value) {
            addCriterion("CASESPOT =", value, "casespot");
            return (Criteria) this;
        }

        public Criteria andCasespotNotEqualTo(String value) {
            addCriterion("CASESPOT <>", value, "casespot");
            return (Criteria) this;
        }

        public Criteria andCasespotGreaterThan(String value) {
            addCriterion("CASESPOT >", value, "casespot");
            return (Criteria) this;
        }

        public Criteria andCasespotGreaterThanOrEqualTo(String value) {
            addCriterion("CASESPOT >=", value, "casespot");
            return (Criteria) this;
        }

        public Criteria andCasespotLessThan(String value) {
            addCriterion("CASESPOT <", value, "casespot");
            return (Criteria) this;
        }

        public Criteria andCasespotLessThanOrEqualTo(String value) {
            addCriterion("CASESPOT <=", value, "casespot");
            return (Criteria) this;
        }

        public Criteria andCasespotLike(String value) {
            addCriterion("CASESPOT like", value, "casespot");
            return (Criteria) this;
        }

        public Criteria andCasespotNotLike(String value) {
            addCriterion("CASESPOT not like", value, "casespot");
            return (Criteria) this;
        }

        public Criteria andCasespotIn(List<String> values) {
            addCriterion("CASESPOT in", values, "casespot");
            return (Criteria) this;
        }

        public Criteria andCasespotNotIn(List<String> values) {
            addCriterion("CASESPOT not in", values, "casespot");
            return (Criteria) this;
        }

        public Criteria andCasespotBetween(String value1, String value2) {
            addCriterion("CASESPOT between", value1, value2, "casespot");
            return (Criteria) this;
        }

        public Criteria andCasespotNotBetween(String value1, String value2) {
            addCriterion("CASESPOT not between", value1, value2, "casespot");
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

        public Criteria andAdsignIsNull() {
            addCriterion("ADSIGN is null");
            return (Criteria) this;
        }

        public Criteria andAdsignIsNotNull() {
            addCriterion("ADSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andAdsignEqualTo(String value) {
            addCriterion("ADSIGN =", value, "adsign");
            return (Criteria) this;
        }

        public Criteria andAdsignNotEqualTo(String value) {
            addCriterion("ADSIGN <>", value, "adsign");
            return (Criteria) this;
        }

        public Criteria andAdsignGreaterThan(String value) {
            addCriterion("ADSIGN >", value, "adsign");
            return (Criteria) this;
        }

        public Criteria andAdsignGreaterThanOrEqualTo(String value) {
            addCriterion("ADSIGN >=", value, "adsign");
            return (Criteria) this;
        }

        public Criteria andAdsignLessThan(String value) {
            addCriterion("ADSIGN <", value, "adsign");
            return (Criteria) this;
        }

        public Criteria andAdsignLessThanOrEqualTo(String value) {
            addCriterion("ADSIGN <=", value, "adsign");
            return (Criteria) this;
        }

        public Criteria andAdsignLike(String value) {
            addCriterion("ADSIGN like", value, "adsign");
            return (Criteria) this;
        }

        public Criteria andAdsignNotLike(String value) {
            addCriterion("ADSIGN not like", value, "adsign");
            return (Criteria) this;
        }

        public Criteria andAdsignIn(List<String> values) {
            addCriterion("ADSIGN in", values, "adsign");
            return (Criteria) this;
        }

        public Criteria andAdsignNotIn(List<String> values) {
            addCriterion("ADSIGN not in", values, "adsign");
            return (Criteria) this;
        }

        public Criteria andAdsignBetween(String value1, String value2) {
            addCriterion("ADSIGN between", value1, value2, "adsign");
            return (Criteria) this;
        }

        public Criteria andAdsignNotBetween(String value1, String value2) {
            addCriterion("ADSIGN not between", value1, value2, "adsign");
            return (Criteria) this;
        }

        public Criteria andProerlerepIsNull() {
            addCriterion("PROERLEREP is null");
            return (Criteria) this;
        }

        public Criteria andProerlerepIsNotNull() {
            addCriterion("PROERLEREP is not null");
            return (Criteria) this;
        }

        public Criteria andProerlerepEqualTo(String value) {
            addCriterion("PROERLEREP =", value, "proerlerep");
            return (Criteria) this;
        }

        public Criteria andProerlerepNotEqualTo(String value) {
            addCriterion("PROERLEREP <>", value, "proerlerep");
            return (Criteria) this;
        }

        public Criteria andProerlerepGreaterThan(String value) {
            addCriterion("PROERLEREP >", value, "proerlerep");
            return (Criteria) this;
        }

        public Criteria andProerlerepGreaterThanOrEqualTo(String value) {
            addCriterion("PROERLEREP >=", value, "proerlerep");
            return (Criteria) this;
        }

        public Criteria andProerlerepLessThan(String value) {
            addCriterion("PROERLEREP <", value, "proerlerep");
            return (Criteria) this;
        }

        public Criteria andProerlerepLessThanOrEqualTo(String value) {
            addCriterion("PROERLEREP <=", value, "proerlerep");
            return (Criteria) this;
        }

        public Criteria andProerlerepLike(String value) {
            addCriterion("PROERLEREP like", value, "proerlerep");
            return (Criteria) this;
        }

        public Criteria andProerlerepNotLike(String value) {
            addCriterion("PROERLEREP not like", value, "proerlerep");
            return (Criteria) this;
        }

        public Criteria andProerlerepIn(List<String> values) {
            addCriterion("PROERLEREP in", values, "proerlerep");
            return (Criteria) this;
        }

        public Criteria andProerlerepNotIn(List<String> values) {
            addCriterion("PROERLEREP not in", values, "proerlerep");
            return (Criteria) this;
        }

        public Criteria andProerlerepBetween(String value1, String value2) {
            addCriterion("PROERLEREP between", value1, value2, "proerlerep");
            return (Criteria) this;
        }

        public Criteria andProerlerepNotBetween(String value1, String value2) {
            addCriterion("PROERLEREP not between", value1, value2, "proerlerep");
            return (Criteria) this;
        }

        public Criteria andCommeacoIsNull() {
            addCriterion("COMMEACO is null");
            return (Criteria) this;
        }

        public Criteria andCommeacoIsNotNull() {
            addCriterion("COMMEACO is not null");
            return (Criteria) this;
        }

        public Criteria andCommeacoEqualTo(String value) {
            addCriterion("COMMEACO =", value, "commeaco");
            return (Criteria) this;
        }

        public Criteria andCommeacoNotEqualTo(String value) {
            addCriterion("COMMEACO <>", value, "commeaco");
            return (Criteria) this;
        }

        public Criteria andCommeacoGreaterThan(String value) {
            addCriterion("COMMEACO >", value, "commeaco");
            return (Criteria) this;
        }

        public Criteria andCommeacoGreaterThanOrEqualTo(String value) {
            addCriterion("COMMEACO >=", value, "commeaco");
            return (Criteria) this;
        }

        public Criteria andCommeacoLessThan(String value) {
            addCriterion("COMMEACO <", value, "commeaco");
            return (Criteria) this;
        }

        public Criteria andCommeacoLessThanOrEqualTo(String value) {
            addCriterion("COMMEACO <=", value, "commeaco");
            return (Criteria) this;
        }

        public Criteria andCommeacoLike(String value) {
            addCriterion("COMMEACO like", value, "commeaco");
            return (Criteria) this;
        }

        public Criteria andCommeacoNotLike(String value) {
            addCriterion("COMMEACO not like", value, "commeaco");
            return (Criteria) this;
        }

        public Criteria andCommeacoIn(List<String> values) {
            addCriterion("COMMEACO in", values, "commeaco");
            return (Criteria) this;
        }

        public Criteria andCommeacoNotIn(List<String> values) {
            addCriterion("COMMEACO not in", values, "commeaco");
            return (Criteria) this;
        }

        public Criteria andCommeacoBetween(String value1, String value2) {
            addCriterion("COMMEACO between", value1, value2, "commeaco");
            return (Criteria) this;
        }

        public Criteria andCommeacoNotBetween(String value1, String value2) {
            addCriterion("COMMEACO not between", value1, value2, "commeaco");
            return (Criteria) this;
        }

        public Criteria andCommeaconameIsNull() {
            addCriterion("COMMEACONAME is null");
            return (Criteria) this;
        }

        public Criteria andCommeaconameIsNotNull() {
            addCriterion("COMMEACONAME is not null");
            return (Criteria) this;
        }

        public Criteria andCommeaconameEqualTo(String value) {
            addCriterion("COMMEACONAME =", value, "commeaconame");
            return (Criteria) this;
        }

        public Criteria andCommeaconameNotEqualTo(String value) {
            addCriterion("COMMEACONAME <>", value, "commeaconame");
            return (Criteria) this;
        }

        public Criteria andCommeaconameGreaterThan(String value) {
            addCriterion("COMMEACONAME >", value, "commeaconame");
            return (Criteria) this;
        }

        public Criteria andCommeaconameGreaterThanOrEqualTo(String value) {
            addCriterion("COMMEACONAME >=", value, "commeaconame");
            return (Criteria) this;
        }

        public Criteria andCommeaconameLessThan(String value) {
            addCriterion("COMMEACONAME <", value, "commeaconame");
            return (Criteria) this;
        }

        public Criteria andCommeaconameLessThanOrEqualTo(String value) {
            addCriterion("COMMEACONAME <=", value, "commeaconame");
            return (Criteria) this;
        }

        public Criteria andCommeaconameLike(String value) {
            addCriterion("COMMEACONAME like", value, "commeaconame");
            return (Criteria) this;
        }

        public Criteria andCommeaconameNotLike(String value) {
            addCriterion("COMMEACONAME not like", value, "commeaconame");
            return (Criteria) this;
        }

        public Criteria andCommeaconameIn(List<String> values) {
            addCriterion("COMMEACONAME in", values, "commeaconame");
            return (Criteria) this;
        }

        public Criteria andCommeaconameNotIn(List<String> values) {
            addCriterion("COMMEACONAME not in", values, "commeaconame");
            return (Criteria) this;
        }

        public Criteria andCommeaconameBetween(String value1, String value2) {
            addCriterion("COMMEACONAME between", value1, value2, "commeaconame");
            return (Criteria) this;
        }

        public Criteria andCommeaconameNotBetween(String value1, String value2) {
            addCriterion("COMMEACONAME not between", value1, value2, "commeaconame");
            return (Criteria) this;
        }

        public Criteria andCasetypeIsNull() {
            addCriterion("CASETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCasetypeIsNotNull() {
            addCriterion("CASETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCasetypeEqualTo(String value) {
            addCriterion("CASETYPE =", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotEqualTo(String value) {
            addCriterion("CASETYPE <>", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeGreaterThan(String value) {
            addCriterion("CASETYPE >", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CASETYPE >=", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLessThan(String value) {
            addCriterion("CASETYPE <", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLessThanOrEqualTo(String value) {
            addCriterion("CASETYPE <=", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLike(String value) {
            addCriterion("CASETYPE like", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotLike(String value) {
            addCriterion("CASETYPE not like", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeIn(List<String> values) {
            addCriterion("CASETYPE in", values, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotIn(List<String> values) {
            addCriterion("CASETYPE not in", values, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeBetween(String value1, String value2) {
            addCriterion("CASETYPE between", value1, value2, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotBetween(String value1, String value2) {
            addCriterion("CASETYPE not between", value1, value2, "casetype");
            return (Criteria) this;
        }

        public Criteria andFilenoIsNull() {
            addCriterion("FILENO is null");
            return (Criteria) this;
        }

        public Criteria andFilenoIsNotNull() {
            addCriterion("FILENO is not null");
            return (Criteria) this;
        }

        public Criteria andFilenoEqualTo(String value) {
            addCriterion("FILENO =", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoNotEqualTo(String value) {
            addCriterion("FILENO <>", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoGreaterThan(String value) {
            addCriterion("FILENO >", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoGreaterThanOrEqualTo(String value) {
            addCriterion("FILENO >=", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoLessThan(String value) {
            addCriterion("FILENO <", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoLessThanOrEqualTo(String value) {
            addCriterion("FILENO <=", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoLike(String value) {
            addCriterion("FILENO like", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoNotLike(String value) {
            addCriterion("FILENO not like", value, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoIn(List<String> values) {
            addCriterion("FILENO in", values, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoNotIn(List<String> values) {
            addCriterion("FILENO not in", values, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoBetween(String value1, String value2) {
            addCriterion("FILENO between", value1, value2, "fileno");
            return (Criteria) this;
        }

        public Criteria andFilenoNotBetween(String value1, String value2) {
            addCriterion("FILENO not between", value1, value2, "fileno");
            return (Criteria) this;
        }

        public Criteria andCasefiauthIsNull() {
            addCriterion("CASEFIAUTH is null");
            return (Criteria) this;
        }

        public Criteria andCasefiauthIsNotNull() {
            addCriterion("CASEFIAUTH is not null");
            return (Criteria) this;
        }

        public Criteria andCasefiauthEqualTo(String value) {
            addCriterion("CASEFIAUTH =", value, "casefiauth");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNotEqualTo(String value) {
            addCriterion("CASEFIAUTH <>", value, "casefiauth");
            return (Criteria) this;
        }

        public Criteria andCasefiauthGreaterThan(String value) {
            addCriterion("CASEFIAUTH >", value, "casefiauth");
            return (Criteria) this;
        }

        public Criteria andCasefiauthGreaterThanOrEqualTo(String value) {
            addCriterion("CASEFIAUTH >=", value, "casefiauth");
            return (Criteria) this;
        }

        public Criteria andCasefiauthLessThan(String value) {
            addCriterion("CASEFIAUTH <", value, "casefiauth");
            return (Criteria) this;
        }

        public Criteria andCasefiauthLessThanOrEqualTo(String value) {
            addCriterion("CASEFIAUTH <=", value, "casefiauth");
            return (Criteria) this;
        }

        public Criteria andCasefiauthLike(String value) {
            addCriterion("CASEFIAUTH like", value, "casefiauth");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNotLike(String value) {
            addCriterion("CASEFIAUTH not like", value, "casefiauth");
            return (Criteria) this;
        }

        public Criteria andCasefiauthIn(List<String> values) {
            addCriterion("CASEFIAUTH in", values, "casefiauth");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNotIn(List<String> values) {
            addCriterion("CASEFIAUTH not in", values, "casefiauth");
            return (Criteria) this;
        }

        public Criteria andCasefiauthBetween(String value1, String value2) {
            addCriterion("CASEFIAUTH between", value1, value2, "casefiauth");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNotBetween(String value1, String value2) {
            addCriterion("CASEFIAUTH not between", value1, value2, "casefiauth");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameIsNull() {
            addCriterion("CASEFIAUTH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameIsNotNull() {
            addCriterion("CASEFIAUTH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameEqualTo(String value) {
            addCriterion("CASEFIAUTH_NAME =", value, "casefiauthName");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameNotEqualTo(String value) {
            addCriterion("CASEFIAUTH_NAME <>", value, "casefiauthName");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameGreaterThan(String value) {
            addCriterion("CASEFIAUTH_NAME >", value, "casefiauthName");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameGreaterThanOrEqualTo(String value) {
            addCriterion("CASEFIAUTH_NAME >=", value, "casefiauthName");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameLessThan(String value) {
            addCriterion("CASEFIAUTH_NAME <", value, "casefiauthName");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameLessThanOrEqualTo(String value) {
            addCriterion("CASEFIAUTH_NAME <=", value, "casefiauthName");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameLike(String value) {
            addCriterion("CASEFIAUTH_NAME like", value, "casefiauthName");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameNotLike(String value) {
            addCriterion("CASEFIAUTH_NAME not like", value, "casefiauthName");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameIn(List<String> values) {
            addCriterion("CASEFIAUTH_NAME in", values, "casefiauthName");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameNotIn(List<String> values) {
            addCriterion("CASEFIAUTH_NAME not in", values, "casefiauthName");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameBetween(String value1, String value2) {
            addCriterion("CASEFIAUTH_NAME between", value1, value2, "casefiauthName");
            return (Criteria) this;
        }

        public Criteria andCasefiauthNameNotBetween(String value1, String value2) {
            addCriterion("CASEFIAUTH_NAME not between", value1, value2, "casefiauthName");
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

        public Criteria andIsfyIsNull() {
            addCriterion("ISFY is null");
            return (Criteria) this;
        }

        public Criteria andIsfyIsNotNull() {
            addCriterion("ISFY is not null");
            return (Criteria) this;
        }

        public Criteria andIsfyEqualTo(String value) {
            addCriterion("ISFY =", value, "isfy");
            return (Criteria) this;
        }

        public Criteria andIsfyNotEqualTo(String value) {
            addCriterion("ISFY <>", value, "isfy");
            return (Criteria) this;
        }

        public Criteria andIsfyGreaterThan(String value) {
            addCriterion("ISFY >", value, "isfy");
            return (Criteria) this;
        }

        public Criteria andIsfyGreaterThanOrEqualTo(String value) {
            addCriterion("ISFY >=", value, "isfy");
            return (Criteria) this;
        }

        public Criteria andIsfyLessThan(String value) {
            addCriterion("ISFY <", value, "isfy");
            return (Criteria) this;
        }

        public Criteria andIsfyLessThanOrEqualTo(String value) {
            addCriterion("ISFY <=", value, "isfy");
            return (Criteria) this;
        }

        public Criteria andIsfyLike(String value) {
            addCriterion("ISFY like", value, "isfy");
            return (Criteria) this;
        }

        public Criteria andIsfyNotLike(String value) {
            addCriterion("ISFY not like", value, "isfy");
            return (Criteria) this;
        }

        public Criteria andIsfyIn(List<String> values) {
            addCriterion("ISFY in", values, "isfy");
            return (Criteria) this;
        }

        public Criteria andIsfyNotIn(List<String> values) {
            addCriterion("ISFY not in", values, "isfy");
            return (Criteria) this;
        }

        public Criteria andIsfyBetween(String value1, String value2) {
            addCriterion("ISFY between", value1, value2, "isfy");
            return (Criteria) this;
        }

        public Criteria andIsfyNotBetween(String value1, String value2) {
            addCriterion("ISFY not between", value1, value2, "isfy");
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

        public Criteria andIstzIsNull() {
            addCriterion("ISTZ is null");
            return (Criteria) this;
        }

        public Criteria andIstzIsNotNull() {
            addCriterion("ISTZ is not null");
            return (Criteria) this;
        }

        public Criteria andIstzEqualTo(String value) {
            addCriterion("ISTZ =", value, "istz");
            return (Criteria) this;
        }

        public Criteria andIstzNotEqualTo(String value) {
            addCriterion("ISTZ <>", value, "istz");
            return (Criteria) this;
        }

        public Criteria andIstzGreaterThan(String value) {
            addCriterion("ISTZ >", value, "istz");
            return (Criteria) this;
        }

        public Criteria andIstzGreaterThanOrEqualTo(String value) {
            addCriterion("ISTZ >=", value, "istz");
            return (Criteria) this;
        }

        public Criteria andIstzLessThan(String value) {
            addCriterion("ISTZ <", value, "istz");
            return (Criteria) this;
        }

        public Criteria andIstzLessThanOrEqualTo(String value) {
            addCriterion("ISTZ <=", value, "istz");
            return (Criteria) this;
        }

        public Criteria andIstzLike(String value) {
            addCriterion("ISTZ like", value, "istz");
            return (Criteria) this;
        }

        public Criteria andIstzNotLike(String value) {
            addCriterion("ISTZ not like", value, "istz");
            return (Criteria) this;
        }

        public Criteria andIstzIn(List<String> values) {
            addCriterion("ISTZ in", values, "istz");
            return (Criteria) this;
        }

        public Criteria andIstzNotIn(List<String> values) {
            addCriterion("ISTZ not in", values, "istz");
            return (Criteria) this;
        }

        public Criteria andIstzBetween(String value1, String value2) {
            addCriterion("ISTZ between", value1, value2, "istz");
            return (Criteria) this;
        }

        public Criteria andIstzNotBetween(String value1, String value2) {
            addCriterion("ISTZ not between", value1, value2, "istz");
            return (Criteria) this;
        }

        public Criteria andIsgsIsNull() {
            addCriterion("ISGS is null");
            return (Criteria) this;
        }

        public Criteria andIsgsIsNotNull() {
            addCriterion("ISGS is not null");
            return (Criteria) this;
        }

        public Criteria andIsgsEqualTo(String value) {
            addCriterion("ISGS =", value, "isgs");
            return (Criteria) this;
        }

        public Criteria andIsgsNotEqualTo(String value) {
            addCriterion("ISGS <>", value, "isgs");
            return (Criteria) this;
        }

        public Criteria andIsgsGreaterThan(String value) {
            addCriterion("ISGS >", value, "isgs");
            return (Criteria) this;
        }

        public Criteria andIsgsGreaterThanOrEqualTo(String value) {
            addCriterion("ISGS >=", value, "isgs");
            return (Criteria) this;
        }

        public Criteria andIsgsLessThan(String value) {
            addCriterion("ISGS <", value, "isgs");
            return (Criteria) this;
        }

        public Criteria andIsgsLessThanOrEqualTo(String value) {
            addCriterion("ISGS <=", value, "isgs");
            return (Criteria) this;
        }

        public Criteria andIsgsLike(String value) {
            addCriterion("ISGS like", value, "isgs");
            return (Criteria) this;
        }

        public Criteria andIsgsNotLike(String value) {
            addCriterion("ISGS not like", value, "isgs");
            return (Criteria) this;
        }

        public Criteria andIsgsIn(List<String> values) {
            addCriterion("ISGS in", values, "isgs");
            return (Criteria) this;
        }

        public Criteria andIsgsNotIn(List<String> values) {
            addCriterion("ISGS not in", values, "isgs");
            return (Criteria) this;
        }

        public Criteria andIsgsBetween(String value1, String value2) {
            addCriterion("ISGS between", value1, value2, "isgs");
            return (Criteria) this;
        }

        public Criteria andIsgsNotBetween(String value1, String value2) {
            addCriterion("ISGS not between", value1, value2, "isgs");
            return (Criteria) this;
        }

        public Criteria andCaseidIsNull() {
            addCriterion("CASEID is null");
            return (Criteria) this;
        }

        public Criteria andCaseidIsNotNull() {
            addCriterion("CASEID is not null");
            return (Criteria) this;
        }

        public Criteria andCaseidEqualTo(String value) {
            addCriterion("CASEID =", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotEqualTo(String value) {
            addCriterion("CASEID <>", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThan(String value) {
            addCriterion("CASEID >", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThanOrEqualTo(String value) {
            addCriterion("CASEID >=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThan(String value) {
            addCriterion("CASEID <", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThanOrEqualTo(String value) {
            addCriterion("CASEID <=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLike(String value) {
            addCriterion("CASEID like", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotLike(String value) {
            addCriterion("CASEID not like", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidIn(List<String> values) {
            addCriterion("CASEID in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotIn(List<String> values) {
            addCriterion("CASEID not in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidBetween(String value1, String value2) {
            addCriterion("CASEID between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotBetween(String value1, String value2) {
            addCriterion("CASEID not between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andIsssIsNull() {
            addCriterion("ISSS is null");
            return (Criteria) this;
        }

        public Criteria andIsssIsNotNull() {
            addCriterion("ISSS is not null");
            return (Criteria) this;
        }

        public Criteria andIsssEqualTo(String value) {
            addCriterion("ISSS =", value, "isss");
            return (Criteria) this;
        }

        public Criteria andIsssNotEqualTo(String value) {
            addCriterion("ISSS <>", value, "isss");
            return (Criteria) this;
        }

        public Criteria andIsssGreaterThan(String value) {
            addCriterion("ISSS >", value, "isss");
            return (Criteria) this;
        }

        public Criteria andIsssGreaterThanOrEqualTo(String value) {
            addCriterion("ISSS >=", value, "isss");
            return (Criteria) this;
        }

        public Criteria andIsssLessThan(String value) {
            addCriterion("ISSS <", value, "isss");
            return (Criteria) this;
        }

        public Criteria andIsssLessThanOrEqualTo(String value) {
            addCriterion("ISSS <=", value, "isss");
            return (Criteria) this;
        }

        public Criteria andIsssLike(String value) {
            addCriterion("ISSS like", value, "isss");
            return (Criteria) this;
        }

        public Criteria andIsssNotLike(String value) {
            addCriterion("ISSS not like", value, "isss");
            return (Criteria) this;
        }

        public Criteria andIsssIn(List<String> values) {
            addCriterion("ISSS in", values, "isss");
            return (Criteria) this;
        }

        public Criteria andIsssNotIn(List<String> values) {
            addCriterion("ISSS not in", values, "isss");
            return (Criteria) this;
        }

        public Criteria andIsssBetween(String value1, String value2) {
            addCriterion("ISSS between", value1, value2, "isss");
            return (Criteria) this;
        }

        public Criteria andIsssNotBetween(String value1, String value2) {
            addCriterion("ISSS not between", value1, value2, "isss");
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