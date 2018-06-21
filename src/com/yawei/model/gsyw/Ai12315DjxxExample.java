package com.yawei.model.gsyw;

import com.sys.utils.BeanUtils;
import com.sys.utils.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Ai12315DjxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public Ai12315DjxxExample() {
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

        public Criteria andRecidIsNull() {
            addCriterion("RECID is null");
            return (Criteria) this;
        }

        public Criteria andRecidIsNotNull() {
            addCriterion("RECID is not null");
            return (Criteria) this;
        }

        public Criteria andRecidEqualTo(String value) {
            addCriterion("RECID =", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidNotEqualTo(String value) {
            addCriterion("RECID <>", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidGreaterThan(String value) {
            addCriterion("RECID >", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidGreaterThanOrEqualTo(String value) {
            addCriterion("RECID >=", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidLessThan(String value) {
            addCriterion("RECID <", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidLessThanOrEqualTo(String value) {
            addCriterion("RECID <=", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidLike(String value) {
            addCriterion("RECID like", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidNotLike(String value) {
            addCriterion("RECID not like", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidIn(List<String> values) {
            addCriterion("RECID in", values, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidNotIn(List<String> values) {
            addCriterion("RECID not in", values, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidBetween(String value1, String value2) {
            addCriterion("RECID between", value1, value2, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidNotBetween(String value1, String value2) {
            addCriterion("RECID not between", value1, value2, "recid");
            return (Criteria) this;
        }

        public Criteria andReginoIsNull() {
            addCriterion("REGINO is null");
            return (Criteria) this;
        }

        public Criteria andReginoIsNotNull() {
            addCriterion("REGINO is not null");
            return (Criteria) this;
        }

        public Criteria andReginoEqualTo(String value) {
            addCriterion("REGINO =", value, "regino");
            return (Criteria) this;
        }

        public Criteria andReginoNotEqualTo(String value) {
            addCriterion("REGINO <>", value, "regino");
            return (Criteria) this;
        }

        public Criteria andReginoGreaterThan(String value) {
            addCriterion("REGINO >", value, "regino");
            return (Criteria) this;
        }

        public Criteria andReginoGreaterThanOrEqualTo(String value) {
            addCriterion("REGINO >=", value, "regino");
            return (Criteria) this;
        }

        public Criteria andReginoLessThan(String value) {
            addCriterion("REGINO <", value, "regino");
            return (Criteria) this;
        }

        public Criteria andReginoLessThanOrEqualTo(String value) {
            addCriterion("REGINO <=", value, "regino");
            return (Criteria) this;
        }

        public Criteria andReginoLike(String value) {
            addCriterion("REGINO like", value, "regino");
            return (Criteria) this;
        }

        public Criteria andReginoNotLike(String value) {
            addCriterion("REGINO not like", value, "regino");
            return (Criteria) this;
        }

        public Criteria andReginoIn(List<String> values) {
            addCriterion("REGINO in", values, "regino");
            return (Criteria) this;
        }

        public Criteria andReginoNotIn(List<String> values) {
            addCriterion("REGINO not in", values, "regino");
            return (Criteria) this;
        }

        public Criteria andReginoBetween(String value1, String value2) {
            addCriterion("REGINO between", value1, value2, "regino");
            return (Criteria) this;
        }

        public Criteria andReginoNotBetween(String value1, String value2) {
            addCriterion("REGINO not between", value1, value2, "regino");
            return (Criteria) this;
        }

        public Criteria andInfooriIsNull() {
            addCriterion("INFOORI is null");
            return (Criteria) this;
        }

        public Criteria andInfooriIsNotNull() {
            addCriterion("INFOORI is not null");
            return (Criteria) this;
        }

        public Criteria andInfooriEqualTo(String value) {
            addCriterion("INFOORI =", value, "infoori");
            return (Criteria) this;
        }

        public Criteria andInfooriNotEqualTo(String value) {
            addCriterion("INFOORI <>", value, "infoori");
            return (Criteria) this;
        }

        public Criteria andInfooriGreaterThan(String value) {
            addCriterion("INFOORI >", value, "infoori");
            return (Criteria) this;
        }

        public Criteria andInfooriGreaterThanOrEqualTo(String value) {
            addCriterion("INFOORI >=", value, "infoori");
            return (Criteria) this;
        }

        public Criteria andInfooriLessThan(String value) {
            addCriterion("INFOORI <", value, "infoori");
            return (Criteria) this;
        }

        public Criteria andInfooriLessThanOrEqualTo(String value) {
            addCriterion("INFOORI <=", value, "infoori");
            return (Criteria) this;
        }

        public Criteria andInfooriLike(String value) {
            addCriterion("INFOORI like", value, "infoori");
            return (Criteria) this;
        }

        public Criteria andInfooriNotLike(String value) {
            addCriterion("INFOORI not like", value, "infoori");
            return (Criteria) this;
        }

        public Criteria andInfooriIn(List<String> values) {
            addCriterion("INFOORI in", values, "infoori");
            return (Criteria) this;
        }

        public Criteria andInfooriNotIn(List<String> values) {
            addCriterion("INFOORI not in", values, "infoori");
            return (Criteria) this;
        }

        public Criteria andInfooriBetween(String value1, String value2) {
            addCriterion("INFOORI between", value1, value2, "infoori");
            return (Criteria) this;
        }

        public Criteria andInfooriNotBetween(String value1, String value2) {
            addCriterion("INFOORI not between", value1, value2, "infoori");
            return (Criteria) this;
        }

        public Criteria andIncformIsNull() {
            addCriterion("INCFORM is null");
            return (Criteria) this;
        }

        public Criteria andIncformIsNotNull() {
            addCriterion("INCFORM is not null");
            return (Criteria) this;
        }

        public Criteria andIncformEqualTo(String value) {
            addCriterion("INCFORM =", value, "incform");
            return (Criteria) this;
        }

        public Criteria andIncformNotEqualTo(String value) {
            addCriterion("INCFORM <>", value, "incform");
            return (Criteria) this;
        }

        public Criteria andIncformGreaterThan(String value) {
            addCriterion("INCFORM >", value, "incform");
            return (Criteria) this;
        }

        public Criteria andIncformGreaterThanOrEqualTo(String value) {
            addCriterion("INCFORM >=", value, "incform");
            return (Criteria) this;
        }

        public Criteria andIncformLessThan(String value) {
            addCriterion("INCFORM <", value, "incform");
            return (Criteria) this;
        }

        public Criteria andIncformLessThanOrEqualTo(String value) {
            addCriterion("INCFORM <=", value, "incform");
            return (Criteria) this;
        }

        public Criteria andIncformLike(String value) {
            addCriterion("INCFORM like", value, "incform");
            return (Criteria) this;
        }

        public Criteria andIncformNotLike(String value) {
            addCriterion("INCFORM not like", value, "incform");
            return (Criteria) this;
        }

        public Criteria andIncformIn(List<String> values) {
            addCriterion("INCFORM in", values, "incform");
            return (Criteria) this;
        }

        public Criteria andIncformNotIn(List<String> values) {
            addCriterion("INCFORM not in", values, "incform");
            return (Criteria) this;
        }

        public Criteria andIncformBetween(String value1, String value2) {
            addCriterion("INCFORM between", value1, value2, "incform");
            return (Criteria) this;
        }

        public Criteria andIncformNotBetween(String value1, String value2) {
            addCriterion("INCFORM not between", value1, value2, "incform");
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

        public Criteria andRegdepIsNull() {
            addCriterion("REGDEP is null");
            return (Criteria) this;
        }

        public Criteria andRegdepIsNotNull() {
            addCriterion("REGDEP is not null");
            return (Criteria) this;
        }

        public Criteria andRegdepEqualTo(String value) {
            addCriterion("REGDEP =", value, "regdep");
            return (Criteria) this;
        }

        public Criteria andRegdepNotEqualTo(String value) {
            addCriterion("REGDEP <>", value, "regdep");
            return (Criteria) this;
        }

        public Criteria andRegdepGreaterThan(String value) {
            addCriterion("REGDEP >", value, "regdep");
            return (Criteria) this;
        }

        public Criteria andRegdepGreaterThanOrEqualTo(String value) {
            addCriterion("REGDEP >=", value, "regdep");
            return (Criteria) this;
        }

        public Criteria andRegdepLessThan(String value) {
            addCriterion("REGDEP <", value, "regdep");
            return (Criteria) this;
        }

        public Criteria andRegdepLessThanOrEqualTo(String value) {
            addCriterion("REGDEP <=", value, "regdep");
            return (Criteria) this;
        }

        public Criteria andRegdepLike(String value) {
            addCriterion("REGDEP like", value, "regdep");
            return (Criteria) this;
        }

        public Criteria andRegdepNotLike(String value) {
            addCriterion("REGDEP not like", value, "regdep");
            return (Criteria) this;
        }

        public Criteria andRegdepIn(List<String> values) {
            addCriterion("REGDEP in", values, "regdep");
            return (Criteria) this;
        }

        public Criteria andRegdepNotIn(List<String> values) {
            addCriterion("REGDEP not in", values, "regdep");
            return (Criteria) this;
        }

        public Criteria andRegdepBetween(String value1, String value2) {
            addCriterion("REGDEP between", value1, value2, "regdep");
            return (Criteria) this;
        }

        public Criteria andRegdepNotBetween(String value1, String value2) {
            addCriterion("REGDEP not between", value1, value2, "regdep");
            return (Criteria) this;
        }

        public Criteria andAccregperIsNull() {
            addCriterion("ACCREGPER is null");
            return (Criteria) this;
        }

        public Criteria andAccregperIsNotNull() {
            addCriterion("ACCREGPER is not null");
            return (Criteria) this;
        }

        public Criteria andAccregperEqualTo(String value) {
            addCriterion("ACCREGPER =", value, "accregper");
            return (Criteria) this;
        }

        public Criteria andAccregperNotEqualTo(String value) {
            addCriterion("ACCREGPER <>", value, "accregper");
            return (Criteria) this;
        }

        public Criteria andAccregperGreaterThan(String value) {
            addCriterion("ACCREGPER >", value, "accregper");
            return (Criteria) this;
        }

        public Criteria andAccregperGreaterThanOrEqualTo(String value) {
            addCriterion("ACCREGPER >=", value, "accregper");
            return (Criteria) this;
        }

        public Criteria andAccregperLessThan(String value) {
            addCriterion("ACCREGPER <", value, "accregper");
            return (Criteria) this;
        }

        public Criteria andAccregperLessThanOrEqualTo(String value) {
            addCriterion("ACCREGPER <=", value, "accregper");
            return (Criteria) this;
        }

        public Criteria andAccregperLike(String value) {
            addCriterion("ACCREGPER like", value, "accregper");
            return (Criteria) this;
        }

        public Criteria andAccregperNotLike(String value) {
            addCriterion("ACCREGPER not like", value, "accregper");
            return (Criteria) this;
        }

        public Criteria andAccregperIn(List<String> values) {
            addCriterion("ACCREGPER in", values, "accregper");
            return (Criteria) this;
        }

        public Criteria andAccregperNotIn(List<String> values) {
            addCriterion("ACCREGPER not in", values, "accregper");
            return (Criteria) this;
        }

        public Criteria andAccregperBetween(String value1, String value2) {
            addCriterion("ACCREGPER between", value1, value2, "accregper");
            return (Criteria) this;
        }

        public Criteria andAccregperNotBetween(String value1, String value2) {
            addCriterion("ACCREGPER not between", value1, value2, "accregper");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(Date value) {
            addCriterion("REGTIME =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(Date value) {
            addCriterion("REGTIME <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(Date value) {
            addCriterion("REGTIME >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REGTIME >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(Date value) {
            addCriterion("REGTIME <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("REGTIME <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<Date> values) {
            addCriterion("REGTIME in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<Date> values) {
            addCriterion("REGTIME not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(Date value1, Date value2) {
            addCriterion("REGTIME between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("REGTIME not between", value1, value2, "regtime");
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

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPerideIsNull() {
            addCriterion("PERIDE is null");
            return (Criteria) this;
        }

        public Criteria andPerideIsNotNull() {
            addCriterion("PERIDE is not null");
            return (Criteria) this;
        }

        public Criteria andPerideEqualTo(String value) {
            addCriterion("PERIDE =", value, "peride");
            return (Criteria) this;
        }

        public Criteria andPerideNotEqualTo(String value) {
            addCriterion("PERIDE <>", value, "peride");
            return (Criteria) this;
        }

        public Criteria andPerideGreaterThan(String value) {
            addCriterion("PERIDE >", value, "peride");
            return (Criteria) this;
        }

        public Criteria andPerideGreaterThanOrEqualTo(String value) {
            addCriterion("PERIDE >=", value, "peride");
            return (Criteria) this;
        }

        public Criteria andPerideLessThan(String value) {
            addCriterion("PERIDE <", value, "peride");
            return (Criteria) this;
        }

        public Criteria andPerideLessThanOrEqualTo(String value) {
            addCriterion("PERIDE <=", value, "peride");
            return (Criteria) this;
        }

        public Criteria andPerideLike(String value) {
            addCriterion("PERIDE like", value, "peride");
            return (Criteria) this;
        }

        public Criteria andPerideNotLike(String value) {
            addCriterion("PERIDE not like", value, "peride");
            return (Criteria) this;
        }

        public Criteria andPerideIn(List<String> values) {
            addCriterion("PERIDE in", values, "peride");
            return (Criteria) this;
        }

        public Criteria andPerideNotIn(List<String> values) {
            addCriterion("PERIDE not in", values, "peride");
            return (Criteria) this;
        }

        public Criteria andPerideBetween(String value1, String value2) {
            addCriterion("PERIDE between", value1, value2, "peride");
            return (Criteria) this;
        }

        public Criteria andPerideNotBetween(String value1, String value2) {
            addCriterion("PERIDE not between", value1, value2, "peride");
            return (Criteria) this;
        }

        public Criteria andPertypeIsNull() {
            addCriterion("PERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPertypeIsNotNull() {
            addCriterion("PERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPertypeEqualTo(String value) {
            addCriterion("PERTYPE =", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeNotEqualTo(String value) {
            addCriterion("PERTYPE <>", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeGreaterThan(String value) {
            addCriterion("PERTYPE >", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeGreaterThanOrEqualTo(String value) {
            addCriterion("PERTYPE >=", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeLessThan(String value) {
            addCriterion("PERTYPE <", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeLessThanOrEqualTo(String value) {
            addCriterion("PERTYPE <=", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeLike(String value) {
            addCriterion("PERTYPE like", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeNotLike(String value) {
            addCriterion("PERTYPE not like", value, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeIn(List<String> values) {
            addCriterion("PERTYPE in", values, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeNotIn(List<String> values) {
            addCriterion("PERTYPE not in", values, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeBetween(String value1, String value2) {
            addCriterion("PERTYPE between", value1, value2, "pertype");
            return (Criteria) this;
        }

        public Criteria andPertypeNotBetween(String value1, String value2) {
            addCriterion("PERTYPE not between", value1, value2, "pertype");
            return (Criteria) this;
        }

        public Criteria andCertypeIsNull() {
            addCriterion("CERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertypeIsNotNull() {
            addCriterion("CERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertypeEqualTo(String value) {
            addCriterion("CERTYPE =", value, "certype");
            return (Criteria) this;
        }

        public Criteria andCertypeNotEqualTo(String value) {
            addCriterion("CERTYPE <>", value, "certype");
            return (Criteria) this;
        }

        public Criteria andCertypeGreaterThan(String value) {
            addCriterion("CERTYPE >", value, "certype");
            return (Criteria) this;
        }

        public Criteria andCertypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTYPE >=", value, "certype");
            return (Criteria) this;
        }

        public Criteria andCertypeLessThan(String value) {
            addCriterion("CERTYPE <", value, "certype");
            return (Criteria) this;
        }

        public Criteria andCertypeLessThanOrEqualTo(String value) {
            addCriterion("CERTYPE <=", value, "certype");
            return (Criteria) this;
        }

        public Criteria andCertypeLike(String value) {
            addCriterion("CERTYPE like", value, "certype");
            return (Criteria) this;
        }

        public Criteria andCertypeNotLike(String value) {
            addCriterion("CERTYPE not like", value, "certype");
            return (Criteria) this;
        }

        public Criteria andCertypeIn(List<String> values) {
            addCriterion("CERTYPE in", values, "certype");
            return (Criteria) this;
        }

        public Criteria andCertypeNotIn(List<String> values) {
            addCriterion("CERTYPE not in", values, "certype");
            return (Criteria) this;
        }

        public Criteria andCertypeBetween(String value1, String value2) {
            addCriterion("CERTYPE between", value1, value2, "certype");
            return (Criteria) this;
        }

        public Criteria andCertypeNotBetween(String value1, String value2) {
            addCriterion("CERTYPE not between", value1, value2, "certype");
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

        public Criteria andHandisignIsNull() {
            addCriterion("HANDISIGN is null");
            return (Criteria) this;
        }

        public Criteria andHandisignIsNotNull() {
            addCriterion("HANDISIGN is not null");
            return (Criteria) this;
        }

        public Criteria andHandisignEqualTo(String value) {
            addCriterion("HANDISIGN =", value, "handisign");
            return (Criteria) this;
        }

        public Criteria andHandisignNotEqualTo(String value) {
            addCriterion("HANDISIGN <>", value, "handisign");
            return (Criteria) this;
        }

        public Criteria andHandisignGreaterThan(String value) {
            addCriterion("HANDISIGN >", value, "handisign");
            return (Criteria) this;
        }

        public Criteria andHandisignGreaterThanOrEqualTo(String value) {
            addCriterion("HANDISIGN >=", value, "handisign");
            return (Criteria) this;
        }

        public Criteria andHandisignLessThan(String value) {
            addCriterion("HANDISIGN <", value, "handisign");
            return (Criteria) this;
        }

        public Criteria andHandisignLessThanOrEqualTo(String value) {
            addCriterion("HANDISIGN <=", value, "handisign");
            return (Criteria) this;
        }

        public Criteria andHandisignLike(String value) {
            addCriterion("HANDISIGN like", value, "handisign");
            return (Criteria) this;
        }

        public Criteria andHandisignNotLike(String value) {
            addCriterion("HANDISIGN not like", value, "handisign");
            return (Criteria) this;
        }

        public Criteria andHandisignIn(List<String> values) {
            addCriterion("HANDISIGN in", values, "handisign");
            return (Criteria) this;
        }

        public Criteria andHandisignNotIn(List<String> values) {
            addCriterion("HANDISIGN not in", values, "handisign");
            return (Criteria) this;
        }

        public Criteria andHandisignBetween(String value1, String value2) {
            addCriterion("HANDISIGN between", value1, value2, "handisign");
            return (Criteria) this;
        }

        public Criteria andHandisignNotBetween(String value1, String value2) {
            addCriterion("HANDISIGN not between", value1, value2, "handisign");
            return (Criteria) this;
        }

        public Criteria andWorkunitIsNull() {
            addCriterion("WORKUNIT is null");
            return (Criteria) this;
        }

        public Criteria andWorkunitIsNotNull() {
            addCriterion("WORKUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkunitEqualTo(String value) {
            addCriterion("WORKUNIT =", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotEqualTo(String value) {
            addCriterion("WORKUNIT <>", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitGreaterThan(String value) {
            addCriterion("WORKUNIT >", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitGreaterThanOrEqualTo(String value) {
            addCriterion("WORKUNIT >=", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLessThan(String value) {
            addCriterion("WORKUNIT <", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLessThanOrEqualTo(String value) {
            addCriterion("WORKUNIT <=", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLike(String value) {
            addCriterion("WORKUNIT like", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotLike(String value) {
            addCriterion("WORKUNIT not like", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitIn(List<String> values) {
            addCriterion("WORKUNIT in", values, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotIn(List<String> values) {
            addCriterion("WORKUNIT not in", values, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitBetween(String value1, String value2) {
            addCriterion("WORKUNIT between", value1, value2, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotBetween(String value1, String value2) {
            addCriterion("WORKUNIT not between", value1, value2, "workunit");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andMemlevelIsNull() {
            addCriterion("MEMLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andMemlevelIsNotNull() {
            addCriterion("MEMLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andMemlevelEqualTo(String value) {
            addCriterion("MEMLEVEL =", value, "memlevel");
            return (Criteria) this;
        }

        public Criteria andMemlevelNotEqualTo(String value) {
            addCriterion("MEMLEVEL <>", value, "memlevel");
            return (Criteria) this;
        }

        public Criteria andMemlevelGreaterThan(String value) {
            addCriterion("MEMLEVEL >", value, "memlevel");
            return (Criteria) this;
        }

        public Criteria andMemlevelGreaterThanOrEqualTo(String value) {
            addCriterion("MEMLEVEL >=", value, "memlevel");
            return (Criteria) this;
        }

        public Criteria andMemlevelLessThan(String value) {
            addCriterion("MEMLEVEL <", value, "memlevel");
            return (Criteria) this;
        }

        public Criteria andMemlevelLessThanOrEqualTo(String value) {
            addCriterion("MEMLEVEL <=", value, "memlevel");
            return (Criteria) this;
        }

        public Criteria andMemlevelLike(String value) {
            addCriterion("MEMLEVEL like", value, "memlevel");
            return (Criteria) this;
        }

        public Criteria andMemlevelNotLike(String value) {
            addCriterion("MEMLEVEL not like", value, "memlevel");
            return (Criteria) this;
        }

        public Criteria andMemlevelIn(List<String> values) {
            addCriterion("MEMLEVEL in", values, "memlevel");
            return (Criteria) this;
        }

        public Criteria andMemlevelNotIn(List<String> values) {
            addCriterion("MEMLEVEL not in", values, "memlevel");
            return (Criteria) this;
        }

        public Criteria andMemlevelBetween(String value1, String value2) {
            addCriterion("MEMLEVEL between", value1, value2, "memlevel");
            return (Criteria) this;
        }

        public Criteria andMemlevelNotBetween(String value1, String value2) {
            addCriterion("MEMLEVEL not between", value1, value2, "memlevel");
            return (Criteria) this;
        }

        public Criteria andInfotypeIsNull() {
            addCriterion("INFOTYPE is null");
            return (Criteria) this;
        }

        public Criteria andInfotypeIsNotNull() {
            addCriterion("INFOTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInfotypeEqualTo(String value) {
            addCriterion("INFOTYPE =", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotEqualTo(String value) {
            addCriterion("INFOTYPE <>", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeGreaterThan(String value) {
            addCriterion("INFOTYPE >", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeGreaterThanOrEqualTo(String value) {
            addCriterion("INFOTYPE >=", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeLessThan(String value) {
            addCriterion("INFOTYPE <", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeLessThanOrEqualTo(String value) {
            addCriterion("INFOTYPE <=", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeLike(String value) {
            addCriterion("INFOTYPE like", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotLike(String value) {
            addCriterion("INFOTYPE not like", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeIn(List<String> values) {
            addCriterion("INFOTYPE in", values, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotIn(List<String> values) {
            addCriterion("INFOTYPE not in", values, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeBetween(String value1, String value2) {
            addCriterion("INFOTYPE between", value1, value2, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotBetween(String value1, String value2) {
            addCriterion("INFOTYPE not between", value1, value2, "infotype");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("KEYWORD =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("KEYWORD <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("KEYWORD >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("KEYWORD >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("KEYWORD <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("KEYWORD <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("KEYWORD like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("KEYWORD not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("KEYWORD in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("KEYWORD not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("KEYWORD between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("KEYWORD not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andIdiqueIsNull() {
            addCriterion("IDIQUE is null");
            return (Criteria) this;
        }

        public Criteria andIdiqueIsNotNull() {
            addCriterion("IDIQUE is not null");
            return (Criteria) this;
        }

        public Criteria andIdiqueEqualTo(String value) {
            addCriterion("IDIQUE =", value, "idique");
            return (Criteria) this;
        }

        public Criteria andIdiqueNotEqualTo(String value) {
            addCriterion("IDIQUE <>", value, "idique");
            return (Criteria) this;
        }

        public Criteria andIdiqueGreaterThan(String value) {
            addCriterion("IDIQUE >", value, "idique");
            return (Criteria) this;
        }

        public Criteria andIdiqueGreaterThanOrEqualTo(String value) {
            addCriterion("IDIQUE >=", value, "idique");
            return (Criteria) this;
        }

        public Criteria andIdiqueLessThan(String value) {
            addCriterion("IDIQUE <", value, "idique");
            return (Criteria) this;
        }

        public Criteria andIdiqueLessThanOrEqualTo(String value) {
            addCriterion("IDIQUE <=", value, "idique");
            return (Criteria) this;
        }

        public Criteria andIdiqueLike(String value) {
            addCriterion("IDIQUE like", value, "idique");
            return (Criteria) this;
        }

        public Criteria andIdiqueNotLike(String value) {
            addCriterion("IDIQUE not like", value, "idique");
            return (Criteria) this;
        }

        public Criteria andIdiqueIn(List<String> values) {
            addCriterion("IDIQUE in", values, "idique");
            return (Criteria) this;
        }

        public Criteria andIdiqueNotIn(List<String> values) {
            addCriterion("IDIQUE not in", values, "idique");
            return (Criteria) this;
        }

        public Criteria andIdiqueBetween(String value1, String value2) {
            addCriterion("IDIQUE between", value1, value2, "idique");
            return (Criteria) this;
        }

        public Criteria andIdiqueNotBetween(String value1, String value2) {
            addCriterion("IDIQUE not between", value1, value2, "idique");
            return (Criteria) this;
        }

        public Criteria andConlrangeIsNull() {
            addCriterion("CONLRANGE is null");
            return (Criteria) this;
        }

        public Criteria andConlrangeIsNotNull() {
            addCriterion("CONLRANGE is not null");
            return (Criteria) this;
        }

        public Criteria andConlrangeEqualTo(String value) {
            addCriterion("CONLRANGE =", value, "conlrange");
            return (Criteria) this;
        }

        public Criteria andConlrangeNotEqualTo(String value) {
            addCriterion("CONLRANGE <>", value, "conlrange");
            return (Criteria) this;
        }

        public Criteria andConlrangeGreaterThan(String value) {
            addCriterion("CONLRANGE >", value, "conlrange");
            return (Criteria) this;
        }

        public Criteria andConlrangeGreaterThanOrEqualTo(String value) {
            addCriterion("CONLRANGE >=", value, "conlrange");
            return (Criteria) this;
        }

        public Criteria andConlrangeLessThan(String value) {
            addCriterion("CONLRANGE <", value, "conlrange");
            return (Criteria) this;
        }

        public Criteria andConlrangeLessThanOrEqualTo(String value) {
            addCriterion("CONLRANGE <=", value, "conlrange");
            return (Criteria) this;
        }

        public Criteria andConlrangeLike(String value) {
            addCriterion("CONLRANGE like", value, "conlrange");
            return (Criteria) this;
        }

        public Criteria andConlrangeNotLike(String value) {
            addCriterion("CONLRANGE not like", value, "conlrange");
            return (Criteria) this;
        }

        public Criteria andConlrangeIn(List<String> values) {
            addCriterion("CONLRANGE in", values, "conlrange");
            return (Criteria) this;
        }

        public Criteria andConlrangeNotIn(List<String> values) {
            addCriterion("CONLRANGE not in", values, "conlrange");
            return (Criteria) this;
        }

        public Criteria andConlrangeBetween(String value1, String value2) {
            addCriterion("CONLRANGE between", value1, value2, "conlrange");
            return (Criteria) this;
        }

        public Criteria andConlrangeNotBetween(String value1, String value2) {
            addCriterion("CONLRANGE not between", value1, value2, "conlrange");
            return (Criteria) this;
        }

        public Criteria andBristIsNull() {
            addCriterion("BRIST is null");
            return (Criteria) this;
        }

        public Criteria andBristIsNotNull() {
            addCriterion("BRIST is not null");
            return (Criteria) this;
        }

        public Criteria andBristEqualTo(String value) {
            addCriterion("BRIST =", value, "brist");
            return (Criteria) this;
        }

        public Criteria andBristNotEqualTo(String value) {
            addCriterion("BRIST <>", value, "brist");
            return (Criteria) this;
        }

        public Criteria andBristGreaterThan(String value) {
            addCriterion("BRIST >", value, "brist");
            return (Criteria) this;
        }

        public Criteria andBristGreaterThanOrEqualTo(String value) {
            addCriterion("BRIST >=", value, "brist");
            return (Criteria) this;
        }

        public Criteria andBristLessThan(String value) {
            addCriterion("BRIST <", value, "brist");
            return (Criteria) this;
        }

        public Criteria andBristLessThanOrEqualTo(String value) {
            addCriterion("BRIST <=", value, "brist");
            return (Criteria) this;
        }

        public Criteria andBristLike(String value) {
            addCriterion("BRIST like", value, "brist");
            return (Criteria) this;
        }

        public Criteria andBristNotLike(String value) {
            addCriterion("BRIST not like", value, "brist");
            return (Criteria) this;
        }

        public Criteria andBristIn(List<String> values) {
            addCriterion("BRIST in", values, "brist");
            return (Criteria) this;
        }

        public Criteria andBristNotIn(List<String> values) {
            addCriterion("BRIST not in", values, "brist");
            return (Criteria) this;
        }

        public Criteria andBristBetween(String value1, String value2) {
            addCriterion("BRIST between", value1, value2, "brist");
            return (Criteria) this;
        }

        public Criteria andBristNotBetween(String value1, String value2) {
            addCriterion("BRIST not between", value1, value2, "brist");
            return (Criteria) this;
        }

        public Criteria andApplbasqueIsNull() {
            addCriterion("APPLBASQUE is null");
            return (Criteria) this;
        }

        public Criteria andApplbasqueIsNotNull() {
            addCriterion("APPLBASQUE is not null");
            return (Criteria) this;
        }

        public Criteria andApplbasqueEqualTo(String value) {
            addCriterion("APPLBASQUE =", value, "applbasque");
            return (Criteria) this;
        }

        public Criteria andApplbasqueNotEqualTo(String value) {
            addCriterion("APPLBASQUE <>", value, "applbasque");
            return (Criteria) this;
        }

        public Criteria andApplbasqueGreaterThan(String value) {
            addCriterion("APPLBASQUE >", value, "applbasque");
            return (Criteria) this;
        }

        public Criteria andApplbasqueGreaterThanOrEqualTo(String value) {
            addCriterion("APPLBASQUE >=", value, "applbasque");
            return (Criteria) this;
        }

        public Criteria andApplbasqueLessThan(String value) {
            addCriterion("APPLBASQUE <", value, "applbasque");
            return (Criteria) this;
        }

        public Criteria andApplbasqueLessThanOrEqualTo(String value) {
            addCriterion("APPLBASQUE <=", value, "applbasque");
            return (Criteria) this;
        }

        public Criteria andApplbasqueLike(String value) {
            addCriterion("APPLBASQUE like", value, "applbasque");
            return (Criteria) this;
        }

        public Criteria andApplbasqueNotLike(String value) {
            addCriterion("APPLBASQUE not like", value, "applbasque");
            return (Criteria) this;
        }

        public Criteria andApplbasqueIn(List<String> values) {
            addCriterion("APPLBASQUE in", values, "applbasque");
            return (Criteria) this;
        }

        public Criteria andApplbasqueNotIn(List<String> values) {
            addCriterion("APPLBASQUE not in", values, "applbasque");
            return (Criteria) this;
        }

        public Criteria andApplbasqueBetween(String value1, String value2) {
            addCriterion("APPLBASQUE between", value1, value2, "applbasque");
            return (Criteria) this;
        }

        public Criteria andApplbasqueNotBetween(String value1, String value2) {
            addCriterion("APPLBASQUE not between", value1, value2, "applbasque");
            return (Criteria) this;
        }

        public Criteria andAcctimeIsNull() {
            addCriterion("ACCTIME is null");
            return (Criteria) this;
        }

        public Criteria andAcctimeIsNotNull() {
            addCriterion("ACCTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAcctimeEqualTo(Date value) {
            addCriterion("ACCTIME =", value, "acctime");
            return (Criteria) this;
        }

        public Criteria andAcctimeNotEqualTo(Date value) {
            addCriterion("ACCTIME <>", value, "acctime");
            return (Criteria) this;
        }

        public Criteria andAcctimeGreaterThan(Date value) {
            addCriterion("ACCTIME >", value, "acctime");
            return (Criteria) this;
        }

        public Criteria andAcctimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCTIME >=", value, "acctime");
            return (Criteria) this;
        }

        public Criteria andAcctimeLessThan(Date value) {
            addCriterion("ACCTIME <", value, "acctime");
            return (Criteria) this;
        }

        public Criteria andAcctimeLessThanOrEqualTo(Date value) {
            addCriterion("ACCTIME <=", value, "acctime");
            return (Criteria) this;
        }

        public Criteria andAcctimeIn(List<Date> values) {
            addCriterion("ACCTIME in", values, "acctime");
            return (Criteria) this;
        }

        public Criteria andAcctimeNotIn(List<Date> values) {
            addCriterion("ACCTIME not in", values, "acctime");
            return (Criteria) this;
        }

        public Criteria andAcctimeBetween(Date value1, Date value2) {
            addCriterion("ACCTIME between", value1, value2, "acctime");
            return (Criteria) this;
        }

        public Criteria andAcctimeNotBetween(Date value1, Date value2) {
            addCriterion("ACCTIME not between", value1, value2, "acctime");
            return (Criteria) this;
        }

        public Criteria andAccsceIsNull() {
            addCriterion("ACCSCE is null");
            return (Criteria) this;
        }

        public Criteria andAccsceIsNotNull() {
            addCriterion("ACCSCE is not null");
            return (Criteria) this;
        }

        public Criteria andAccsceEqualTo(String value) {
            addCriterion("ACCSCE =", value, "accsce");
            return (Criteria) this;
        }

        public Criteria andAccsceNotEqualTo(String value) {
            addCriterion("ACCSCE <>", value, "accsce");
            return (Criteria) this;
        }

        public Criteria andAccsceGreaterThan(String value) {
            addCriterion("ACCSCE >", value, "accsce");
            return (Criteria) this;
        }

        public Criteria andAccsceGreaterThanOrEqualTo(String value) {
            addCriterion("ACCSCE >=", value, "accsce");
            return (Criteria) this;
        }

        public Criteria andAccsceLessThan(String value) {
            addCriterion("ACCSCE <", value, "accsce");
            return (Criteria) this;
        }

        public Criteria andAccsceLessThanOrEqualTo(String value) {
            addCriterion("ACCSCE <=", value, "accsce");
            return (Criteria) this;
        }

        public Criteria andAccsceLike(String value) {
            addCriterion("ACCSCE like", value, "accsce");
            return (Criteria) this;
        }

        public Criteria andAccsceNotLike(String value) {
            addCriterion("ACCSCE not like", value, "accsce");
            return (Criteria) this;
        }

        public Criteria andAccsceIn(List<String> values) {
            addCriterion("ACCSCE in", values, "accsce");
            return (Criteria) this;
        }

        public Criteria andAccsceNotIn(List<String> values) {
            addCriterion("ACCSCE not in", values, "accsce");
            return (Criteria) this;
        }

        public Criteria andAccsceBetween(String value1, String value2) {
            addCriterion("ACCSCE between", value1, value2, "accsce");
            return (Criteria) this;
        }

        public Criteria andAccsceNotBetween(String value1, String value2) {
            addCriterion("ACCSCE not between", value1, value2, "accsce");
            return (Criteria) this;
        }

        public Criteria andControversytimeIsNull() {
            addCriterion("CONTROVERSYTIME is null");
            return (Criteria) this;
        }

        public Criteria andControversytimeIsNotNull() {
            addCriterion("CONTROVERSYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andControversytimeEqualTo(Date value) {
            addCriterion("CONTROVERSYTIME =", value, "controversytime");
            return (Criteria) this;
        }

        public Criteria andControversytimeNotEqualTo(Date value) {
            addCriterion("CONTROVERSYTIME <>", value, "controversytime");
            return (Criteria) this;
        }

        public Criteria andControversytimeGreaterThan(Date value) {
            addCriterion("CONTROVERSYTIME >", value, "controversytime");
            return (Criteria) this;
        }

        public Criteria andControversytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONTROVERSYTIME >=", value, "controversytime");
            return (Criteria) this;
        }

        public Criteria andControversytimeLessThan(Date value) {
            addCriterion("CONTROVERSYTIME <", value, "controversytime");
            return (Criteria) this;
        }

        public Criteria andControversytimeLessThanOrEqualTo(Date value) {
            addCriterion("CONTROVERSYTIME <=", value, "controversytime");
            return (Criteria) this;
        }

        public Criteria andControversytimeIn(List<Date> values) {
            addCriterion("CONTROVERSYTIME in", values, "controversytime");
            return (Criteria) this;
        }

        public Criteria andControversytimeNotIn(List<Date> values) {
            addCriterion("CONTROVERSYTIME not in", values, "controversytime");
            return (Criteria) this;
        }

        public Criteria andControversytimeBetween(Date value1, Date value2) {
            addCriterion("CONTROVERSYTIME between", value1, value2, "controversytime");
            return (Criteria) this;
        }

        public Criteria andControversytimeNotBetween(Date value1, Date value2) {
            addCriterion("CONTROVERSYTIME not between", value1, value2, "controversytime");
            return (Criteria) this;
        }

        public Criteria andConsumetimeIsNull() {
            addCriterion("CONSUMETIME is null");
            return (Criteria) this;
        }

        public Criteria andConsumetimeIsNotNull() {
            addCriterion("CONSUMETIME is not null");
            return (Criteria) this;
        }

        public Criteria andConsumetimeEqualTo(Date value) {
            addCriterion("CONSUMETIME =", value, "consumetime");
            return (Criteria) this;
        }

        public Criteria andConsumetimeNotEqualTo(Date value) {
            addCriterion("CONSUMETIME <>", value, "consumetime");
            return (Criteria) this;
        }

        public Criteria andConsumetimeGreaterThan(Date value) {
            addCriterion("CONSUMETIME >", value, "consumetime");
            return (Criteria) this;
        }

        public Criteria andConsumetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONSUMETIME >=", value, "consumetime");
            return (Criteria) this;
        }

        public Criteria andConsumetimeLessThan(Date value) {
            addCriterion("CONSUMETIME <", value, "consumetime");
            return (Criteria) this;
        }

        public Criteria andConsumetimeLessThanOrEqualTo(Date value) {
            addCriterion("CONSUMETIME <=", value, "consumetime");
            return (Criteria) this;
        }

        public Criteria andConsumetimeIn(List<Date> values) {
            addCriterion("CONSUMETIME in", values, "consumetime");
            return (Criteria) this;
        }

        public Criteria andConsumetimeNotIn(List<Date> values) {
            addCriterion("CONSUMETIME not in", values, "consumetime");
            return (Criteria) this;
        }

        public Criteria andConsumetimeBetween(Date value1, Date value2) {
            addCriterion("CONSUMETIME between", value1, value2, "consumetime");
            return (Criteria) this;
        }

        public Criteria andConsumetimeNotBetween(Date value1, Date value2) {
            addCriterion("CONSUMETIME not between", value1, value2, "consumetime");
            return (Criteria) this;
        }

        public Criteria andIsreconcileIsNull() {
            addCriterion("ISRECONCILE is null");
            return (Criteria) this;
        }

        public Criteria andIsreconcileIsNotNull() {
            addCriterion("ISRECONCILE is not null");
            return (Criteria) this;
        }

        public Criteria andIsreconcileEqualTo(String value) {
            addCriterion("ISRECONCILE =", value, "isreconcile");
            return (Criteria) this;
        }

        public Criteria andIsreconcileNotEqualTo(String value) {
            addCriterion("ISRECONCILE <>", value, "isreconcile");
            return (Criteria) this;
        }

        public Criteria andIsreconcileGreaterThan(String value) {
            addCriterion("ISRECONCILE >", value, "isreconcile");
            return (Criteria) this;
        }

        public Criteria andIsreconcileGreaterThanOrEqualTo(String value) {
            addCriterion("ISRECONCILE >=", value, "isreconcile");
            return (Criteria) this;
        }

        public Criteria andIsreconcileLessThan(String value) {
            addCriterion("ISRECONCILE <", value, "isreconcile");
            return (Criteria) this;
        }

        public Criteria andIsreconcileLessThanOrEqualTo(String value) {
            addCriterion("ISRECONCILE <=", value, "isreconcile");
            return (Criteria) this;
        }

        public Criteria andIsreconcileLike(String value) {
            addCriterion("ISRECONCILE like", value, "isreconcile");
            return (Criteria) this;
        }

        public Criteria andIsreconcileNotLike(String value) {
            addCriterion("ISRECONCILE not like", value, "isreconcile");
            return (Criteria) this;
        }

        public Criteria andIsreconcileIn(List<String> values) {
            addCriterion("ISRECONCILE in", values, "isreconcile");
            return (Criteria) this;
        }

        public Criteria andIsreconcileNotIn(List<String> values) {
            addCriterion("ISRECONCILE not in", values, "isreconcile");
            return (Criteria) this;
        }

        public Criteria andIsreconcileBetween(String value1, String value2) {
            addCriterion("ISRECONCILE between", value1, value2, "isreconcile");
            return (Criteria) this;
        }

        public Criteria andIsreconcileNotBetween(String value1, String value2) {
            addCriterion("ISRECONCILE not between", value1, value2, "isreconcile");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerIsNull() {
            addCriterion("ISNEEDANSWER is null");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerIsNotNull() {
            addCriterion("ISNEEDANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerEqualTo(String value) {
            addCriterion("ISNEEDANSWER =", value, "isneedanswer");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerNotEqualTo(String value) {
            addCriterion("ISNEEDANSWER <>", value, "isneedanswer");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerGreaterThan(String value) {
            addCriterion("ISNEEDANSWER >", value, "isneedanswer");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerGreaterThanOrEqualTo(String value) {
            addCriterion("ISNEEDANSWER >=", value, "isneedanswer");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerLessThan(String value) {
            addCriterion("ISNEEDANSWER <", value, "isneedanswer");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerLessThanOrEqualTo(String value) {
            addCriterion("ISNEEDANSWER <=", value, "isneedanswer");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerLike(String value) {
            addCriterion("ISNEEDANSWER like", value, "isneedanswer");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerNotLike(String value) {
            addCriterion("ISNEEDANSWER not like", value, "isneedanswer");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerIn(List<String> values) {
            addCriterion("ISNEEDANSWER in", values, "isneedanswer");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerNotIn(List<String> values) {
            addCriterion("ISNEEDANSWER not in", values, "isneedanswer");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerBetween(String value1, String value2) {
            addCriterion("ISNEEDANSWER between", value1, value2, "isneedanswer");
            return (Criteria) this;
        }

        public Criteria andIsneedanswerNotBetween(String value1, String value2) {
            addCriterion("ISNEEDANSWER not between", value1, value2, "isneedanswer");
            return (Criteria) this;
        }

        public Criteria andAudiofileIsNull() {
            addCriterion("AUDIOFILE is null");
            return (Criteria) this;
        }

        public Criteria andAudiofileIsNotNull() {
            addCriterion("AUDIOFILE is not null");
            return (Criteria) this;
        }

        public Criteria andAudiofileEqualTo(String value) {
            addCriterion("AUDIOFILE =", value, "audiofile");
            return (Criteria) this;
        }

        public Criteria andAudiofileNotEqualTo(String value) {
            addCriterion("AUDIOFILE <>", value, "audiofile");
            return (Criteria) this;
        }

        public Criteria andAudiofileGreaterThan(String value) {
            addCriterion("AUDIOFILE >", value, "audiofile");
            return (Criteria) this;
        }

        public Criteria andAudiofileGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIOFILE >=", value, "audiofile");
            return (Criteria) this;
        }

        public Criteria andAudiofileLessThan(String value) {
            addCriterion("AUDIOFILE <", value, "audiofile");
            return (Criteria) this;
        }

        public Criteria andAudiofileLessThanOrEqualTo(String value) {
            addCriterion("AUDIOFILE <=", value, "audiofile");
            return (Criteria) this;
        }

        public Criteria andAudiofileLike(String value) {
            addCriterion("AUDIOFILE like", value, "audiofile");
            return (Criteria) this;
        }

        public Criteria andAudiofileNotLike(String value) {
            addCriterion("AUDIOFILE not like", value, "audiofile");
            return (Criteria) this;
        }

        public Criteria andAudiofileIn(List<String> values) {
            addCriterion("AUDIOFILE in", values, "audiofile");
            return (Criteria) this;
        }

        public Criteria andAudiofileNotIn(List<String> values) {
            addCriterion("AUDIOFILE not in", values, "audiofile");
            return (Criteria) this;
        }

        public Criteria andAudiofileBetween(String value1, String value2) {
            addCriterion("AUDIOFILE between", value1, value2, "audiofile");
            return (Criteria) this;
        }

        public Criteria andAudiofileNotBetween(String value1, String value2) {
            addCriterion("AUDIOFILE not between", value1, value2, "audiofile");
            return (Criteria) this;
        }

        public Criteria andSfslIsNull() {
            addCriterion("SFSL is null");
            return (Criteria) this;
        }

        public Criteria andSfslIsNotNull() {
            addCriterion("SFSL is not null");
            return (Criteria) this;
        }

        public Criteria andSfslEqualTo(String value) {
            addCriterion("SFSL =", value, "sfsl");
            return (Criteria) this;
        }

        public Criteria andSfslNotEqualTo(String value) {
            addCriterion("SFSL <>", value, "sfsl");
            return (Criteria) this;
        }

        public Criteria andSfslGreaterThan(String value) {
            addCriterion("SFSL >", value, "sfsl");
            return (Criteria) this;
        }

        public Criteria andSfslGreaterThanOrEqualTo(String value) {
            addCriterion("SFSL >=", value, "sfsl");
            return (Criteria) this;
        }

        public Criteria andSfslLessThan(String value) {
            addCriterion("SFSL <", value, "sfsl");
            return (Criteria) this;
        }

        public Criteria andSfslLessThanOrEqualTo(String value) {
            addCriterion("SFSL <=", value, "sfsl");
            return (Criteria) this;
        }

        public Criteria andSfslLike(String value) {
            addCriterion("SFSL like", value, "sfsl");
            return (Criteria) this;
        }

        public Criteria andSfslNotLike(String value) {
            addCriterion("SFSL not like", value, "sfsl");
            return (Criteria) this;
        }

        public Criteria andSfslIn(List<String> values) {
            addCriterion("SFSL in", values, "sfsl");
            return (Criteria) this;
        }

        public Criteria andSfslNotIn(List<String> values) {
            addCriterion("SFSL not in", values, "sfsl");
            return (Criteria) this;
        }

        public Criteria andSfslBetween(String value1, String value2) {
            addCriterion("SFSL between", value1, value2, "sfsl");
            return (Criteria) this;
        }

        public Criteria andSfslNotBetween(String value1, String value2) {
            addCriterion("SFSL not between", value1, value2, "sfsl");
            return (Criteria) this;
        }

        public Criteria andLdtelIsNull() {
            addCriterion("LDTEL is null");
            return (Criteria) this;
        }

        public Criteria andLdtelIsNotNull() {
            addCriterion("LDTEL is not null");
            return (Criteria) this;
        }

        public Criteria andLdtelEqualTo(String value) {
            addCriterion("LDTEL =", value, "ldtel");
            return (Criteria) this;
        }

        public Criteria andLdtelNotEqualTo(String value) {
            addCriterion("LDTEL <>", value, "ldtel");
            return (Criteria) this;
        }

        public Criteria andLdtelGreaterThan(String value) {
            addCriterion("LDTEL >", value, "ldtel");
            return (Criteria) this;
        }

        public Criteria andLdtelGreaterThanOrEqualTo(String value) {
            addCriterion("LDTEL >=", value, "ldtel");
            return (Criteria) this;
        }

        public Criteria andLdtelLessThan(String value) {
            addCriterion("LDTEL <", value, "ldtel");
            return (Criteria) this;
        }

        public Criteria andLdtelLessThanOrEqualTo(String value) {
            addCriterion("LDTEL <=", value, "ldtel");
            return (Criteria) this;
        }

        public Criteria andLdtelLike(String value) {
            addCriterion("LDTEL like", value, "ldtel");
            return (Criteria) this;
        }

        public Criteria andLdtelNotLike(String value) {
            addCriterion("LDTEL not like", value, "ldtel");
            return (Criteria) this;
        }

        public Criteria andLdtelIn(List<String> values) {
            addCriterion("LDTEL in", values, "ldtel");
            return (Criteria) this;
        }

        public Criteria andLdtelNotIn(List<String> values) {
            addCriterion("LDTEL not in", values, "ldtel");
            return (Criteria) this;
        }

        public Criteria andLdtelBetween(String value1, String value2) {
            addCriterion("LDTEL between", value1, value2, "ldtel");
            return (Criteria) this;
        }

        public Criteria andLdtelNotBetween(String value1, String value2) {
            addCriterion("LDTEL not between", value1, value2, "ldtel");
            return (Criteria) this;
        }

        public Criteria andIssecretIsNull() {
            addCriterion("ISSECRET is null");
            return (Criteria) this;
        }

        public Criteria andIssecretIsNotNull() {
            addCriterion("ISSECRET is not null");
            return (Criteria) this;
        }

        public Criteria andIssecretEqualTo(String value) {
            addCriterion("ISSECRET =", value, "issecret");
            return (Criteria) this;
        }

        public Criteria andIssecretNotEqualTo(String value) {
            addCriterion("ISSECRET <>", value, "issecret");
            return (Criteria) this;
        }

        public Criteria andIssecretGreaterThan(String value) {
            addCriterion("ISSECRET >", value, "issecret");
            return (Criteria) this;
        }

        public Criteria andIssecretGreaterThanOrEqualTo(String value) {
            addCriterion("ISSECRET >=", value, "issecret");
            return (Criteria) this;
        }

        public Criteria andIssecretLessThan(String value) {
            addCriterion("ISSECRET <", value, "issecret");
            return (Criteria) this;
        }

        public Criteria andIssecretLessThanOrEqualTo(String value) {
            addCriterion("ISSECRET <=", value, "issecret");
            return (Criteria) this;
        }

        public Criteria andIssecretLike(String value) {
            addCriterion("ISSECRET like", value, "issecret");
            return (Criteria) this;
        }

        public Criteria andIssecretNotLike(String value) {
            addCriterion("ISSECRET not like", value, "issecret");
            return (Criteria) this;
        }

        public Criteria andIssecretIn(List<String> values) {
            addCriterion("ISSECRET in", values, "issecret");
            return (Criteria) this;
        }

        public Criteria andIssecretNotIn(List<String> values) {
            addCriterion("ISSECRET not in", values, "issecret");
            return (Criteria) this;
        }

        public Criteria andIssecretBetween(String value1, String value2) {
            addCriterion("ISSECRET between", value1, value2, "issecret");
            return (Criteria) this;
        }

        public Criteria andIssecretNotBetween(String value1, String value2) {
            addCriterion("ISSECRET not between", value1, value2, "issecret");
            return (Criteria) this;
        }

        public Criteria andZxlxIsNull() {
            addCriterion("ZXLX is null");
            return (Criteria) this;
        }

        public Criteria andZxlxIsNotNull() {
            addCriterion("ZXLX is not null");
            return (Criteria) this;
        }

        public Criteria andZxlxEqualTo(String value) {
            addCriterion("ZXLX =", value, "zxlx");
            return (Criteria) this;
        }

        public Criteria andZxlxNotEqualTo(String value) {
            addCriterion("ZXLX <>", value, "zxlx");
            return (Criteria) this;
        }

        public Criteria andZxlxGreaterThan(String value) {
            addCriterion("ZXLX >", value, "zxlx");
            return (Criteria) this;
        }

        public Criteria andZxlxGreaterThanOrEqualTo(String value) {
            addCriterion("ZXLX >=", value, "zxlx");
            return (Criteria) this;
        }

        public Criteria andZxlxLessThan(String value) {
            addCriterion("ZXLX <", value, "zxlx");
            return (Criteria) this;
        }

        public Criteria andZxlxLessThanOrEqualTo(String value) {
            addCriterion("ZXLX <=", value, "zxlx");
            return (Criteria) this;
        }

        public Criteria andZxlxLike(String value) {
            addCriterion("ZXLX like", value, "zxlx");
            return (Criteria) this;
        }

        public Criteria andZxlxNotLike(String value) {
            addCriterion("ZXLX not like", value, "zxlx");
            return (Criteria) this;
        }

        public Criteria andZxlxIn(List<String> values) {
            addCriterion("ZXLX in", values, "zxlx");
            return (Criteria) this;
        }

        public Criteria andZxlxNotIn(List<String> values) {
            addCriterion("ZXLX not in", values, "zxlx");
            return (Criteria) this;
        }

        public Criteria andZxlxBetween(String value1, String value2) {
            addCriterion("ZXLX between", value1, value2, "zxlx");
            return (Criteria) this;
        }

        public Criteria andZxlxNotBetween(String value1, String value2) {
            addCriterion("ZXLX not between", value1, value2, "zxlx");
            return (Criteria) this;
        }

        public Criteria andZxwtflIsNull() {
            addCriterion("ZXWTFL is null");
            return (Criteria) this;
        }

        public Criteria andZxwtflIsNotNull() {
            addCriterion("ZXWTFL is not null");
            return (Criteria) this;
        }

        public Criteria andZxwtflEqualTo(String value) {
            addCriterion("ZXWTFL =", value, "zxwtfl");
            return (Criteria) this;
        }

        public Criteria andZxwtflNotEqualTo(String value) {
            addCriterion("ZXWTFL <>", value, "zxwtfl");
            return (Criteria) this;
        }

        public Criteria andZxwtflGreaterThan(String value) {
            addCriterion("ZXWTFL >", value, "zxwtfl");
            return (Criteria) this;
        }

        public Criteria andZxwtflGreaterThanOrEqualTo(String value) {
            addCriterion("ZXWTFL >=", value, "zxwtfl");
            return (Criteria) this;
        }

        public Criteria andZxwtflLessThan(String value) {
            addCriterion("ZXWTFL <", value, "zxwtfl");
            return (Criteria) this;
        }

        public Criteria andZxwtflLessThanOrEqualTo(String value) {
            addCriterion("ZXWTFL <=", value, "zxwtfl");
            return (Criteria) this;
        }

        public Criteria andZxwtflLike(String value) {
            addCriterion("ZXWTFL like", value, "zxwtfl");
            return (Criteria) this;
        }

        public Criteria andZxwtflNotLike(String value) {
            addCriterion("ZXWTFL not like", value, "zxwtfl");
            return (Criteria) this;
        }

        public Criteria andZxwtflIn(List<String> values) {
            addCriterion("ZXWTFL in", values, "zxwtfl");
            return (Criteria) this;
        }

        public Criteria andZxwtflNotIn(List<String> values) {
            addCriterion("ZXWTFL not in", values, "zxwtfl");
            return (Criteria) this;
        }

        public Criteria andZxwtflBetween(String value1, String value2) {
            addCriterion("ZXWTFL between", value1, value2, "zxwtfl");
            return (Criteria) this;
        }

        public Criteria andZxwtflNotBetween(String value1, String value2) {
            addCriterion("ZXWTFL not between", value1, value2, "zxwtfl");
            return (Criteria) this;
        }

        public Criteria andJydzIsNull() {
            addCriterion("JYDZ is null");
            return (Criteria) this;
        }

        public Criteria andJydzIsNotNull() {
            addCriterion("JYDZ is not null");
            return (Criteria) this;
        }

        public Criteria andJydzEqualTo(String value) {
            addCriterion("JYDZ =", value, "jydz");
            return (Criteria) this;
        }

        public Criteria andJydzNotEqualTo(String value) {
            addCriterion("JYDZ <>", value, "jydz");
            return (Criteria) this;
        }

        public Criteria andJydzGreaterThan(String value) {
            addCriterion("JYDZ >", value, "jydz");
            return (Criteria) this;
        }

        public Criteria andJydzGreaterThanOrEqualTo(String value) {
            addCriterion("JYDZ >=", value, "jydz");
            return (Criteria) this;
        }

        public Criteria andJydzLessThan(String value) {
            addCriterion("JYDZ <", value, "jydz");
            return (Criteria) this;
        }

        public Criteria andJydzLessThanOrEqualTo(String value) {
            addCriterion("JYDZ <=", value, "jydz");
            return (Criteria) this;
        }

        public Criteria andJydzLike(String value) {
            addCriterion("JYDZ like", value, "jydz");
            return (Criteria) this;
        }

        public Criteria andJydzNotLike(String value) {
            addCriterion("JYDZ not like", value, "jydz");
            return (Criteria) this;
        }

        public Criteria andJydzIn(List<String> values) {
            addCriterion("JYDZ in", values, "jydz");
            return (Criteria) this;
        }

        public Criteria andJydzNotIn(List<String> values) {
            addCriterion("JYDZ not in", values, "jydz");
            return (Criteria) this;
        }

        public Criteria andJydzBetween(String value1, String value2) {
            addCriterion("JYDZ between", value1, value2, "jydz");
            return (Criteria) this;
        }

        public Criteria andJydzNotBetween(String value1, String value2) {
            addCriterion("JYDZ not between", value1, value2, "jydz");
            return (Criteria) this;
        }

        public Criteria andAjlyIsNull() {
            addCriterion("AJLY is null");
            return (Criteria) this;
        }

        public Criteria andAjlyIsNotNull() {
            addCriterion("AJLY is not null");
            return (Criteria) this;
        }

        public Criteria andAjlyEqualTo(String value) {
            addCriterion("AJLY =", value, "ajly");
            return (Criteria) this;
        }

        public Criteria andAjlyNotEqualTo(String value) {
            addCriterion("AJLY <>", value, "ajly");
            return (Criteria) this;
        }

        public Criteria andAjlyGreaterThan(String value) {
            addCriterion("AJLY >", value, "ajly");
            return (Criteria) this;
        }

        public Criteria andAjlyGreaterThanOrEqualTo(String value) {
            addCriterion("AJLY >=", value, "ajly");
            return (Criteria) this;
        }

        public Criteria andAjlyLessThan(String value) {
            addCriterion("AJLY <", value, "ajly");
            return (Criteria) this;
        }

        public Criteria andAjlyLessThanOrEqualTo(String value) {
            addCriterion("AJLY <=", value, "ajly");
            return (Criteria) this;
        }

        public Criteria andAjlyLike(String value) {
            addCriterion("AJLY like", value, "ajly");
            return (Criteria) this;
        }

        public Criteria andAjlyNotLike(String value) {
            addCriterion("AJLY not like", value, "ajly");
            return (Criteria) this;
        }

        public Criteria andAjlyIn(List<String> values) {
            addCriterion("AJLY in", values, "ajly");
            return (Criteria) this;
        }

        public Criteria andAjlyNotIn(List<String> values) {
            addCriterion("AJLY not in", values, "ajly");
            return (Criteria) this;
        }

        public Criteria andAjlyBetween(String value1, String value2) {
            addCriterion("AJLY between", value1, value2, "ajly");
            return (Criteria) this;
        }

        public Criteria andAjlyNotBetween(String value1, String value2) {
            addCriterion("AJLY not between", value1, value2, "ajly");
            return (Criteria) this;
        }

        public Criteria andGrgzIsNull() {
            addCriterion("GRGZ is null");
            return (Criteria) this;
        }

        public Criteria andGrgzIsNotNull() {
            addCriterion("GRGZ is not null");
            return (Criteria) this;
        }

        public Criteria andGrgzEqualTo(String value) {
            addCriterion("GRGZ =", value, "grgz");
            return (Criteria) this;
        }

        public Criteria andGrgzNotEqualTo(String value) {
            addCriterion("GRGZ <>", value, "grgz");
            return (Criteria) this;
        }

        public Criteria andGrgzGreaterThan(String value) {
            addCriterion("GRGZ >", value, "grgz");
            return (Criteria) this;
        }

        public Criteria andGrgzGreaterThanOrEqualTo(String value) {
            addCriterion("GRGZ >=", value, "grgz");
            return (Criteria) this;
        }

        public Criteria andGrgzLessThan(String value) {
            addCriterion("GRGZ <", value, "grgz");
            return (Criteria) this;
        }

        public Criteria andGrgzLessThanOrEqualTo(String value) {
            addCriterion("GRGZ <=", value, "grgz");
            return (Criteria) this;
        }

        public Criteria andGrgzLike(String value) {
            addCriterion("GRGZ like", value, "grgz");
            return (Criteria) this;
        }

        public Criteria andGrgzNotLike(String value) {
            addCriterion("GRGZ not like", value, "grgz");
            return (Criteria) this;
        }

        public Criteria andGrgzIn(List<String> values) {
            addCriterion("GRGZ in", values, "grgz");
            return (Criteria) this;
        }

        public Criteria andGrgzNotIn(List<String> values) {
            addCriterion("GRGZ not in", values, "grgz");
            return (Criteria) this;
        }

        public Criteria andGrgzBetween(String value1, String value2) {
            addCriterion("GRGZ between", value1, value2, "grgz");
            return (Criteria) this;
        }

        public Criteria andGrgzNotBetween(String value1, String value2) {
            addCriterion("GRGZ not between", value1, value2, "grgz");
            return (Criteria) this;
        }

        public Criteria andDcjbIsNull() {
            addCriterion("DCJB is null");
            return (Criteria) this;
        }

        public Criteria andDcjbIsNotNull() {
            addCriterion("DCJB is not null");
            return (Criteria) this;
        }

        public Criteria andDcjbEqualTo(String value) {
            addCriterion("DCJB =", value, "dcjb");
            return (Criteria) this;
        }

        public Criteria andDcjbNotEqualTo(String value) {
            addCriterion("DCJB <>", value, "dcjb");
            return (Criteria) this;
        }

        public Criteria andDcjbGreaterThan(String value) {
            addCriterion("DCJB >", value, "dcjb");
            return (Criteria) this;
        }

        public Criteria andDcjbGreaterThanOrEqualTo(String value) {
            addCriterion("DCJB >=", value, "dcjb");
            return (Criteria) this;
        }

        public Criteria andDcjbLessThan(String value) {
            addCriterion("DCJB <", value, "dcjb");
            return (Criteria) this;
        }

        public Criteria andDcjbLessThanOrEqualTo(String value) {
            addCriterion("DCJB <=", value, "dcjb");
            return (Criteria) this;
        }

        public Criteria andDcjbLike(String value) {
            addCriterion("DCJB like", value, "dcjb");
            return (Criteria) this;
        }

        public Criteria andDcjbNotLike(String value) {
            addCriterion("DCJB not like", value, "dcjb");
            return (Criteria) this;
        }

        public Criteria andDcjbIn(List<String> values) {
            addCriterion("DCJB in", values, "dcjb");
            return (Criteria) this;
        }

        public Criteria andDcjbNotIn(List<String> values) {
            addCriterion("DCJB not in", values, "dcjb");
            return (Criteria) this;
        }

        public Criteria andDcjbBetween(String value1, String value2) {
            addCriterion("DCJB between", value1, value2, "dcjb");
            return (Criteria) this;
        }

        public Criteria andDcjbNotBetween(String value1, String value2) {
            addCriterion("DCJB not between", value1, value2, "dcjb");
            return (Criteria) this;
        }

        public Criteria andCfjbIsNull() {
            addCriterion("CFJB is null");
            return (Criteria) this;
        }

        public Criteria andCfjbIsNotNull() {
            addCriterion("CFJB is not null");
            return (Criteria) this;
        }

        public Criteria andCfjbEqualTo(String value) {
            addCriterion("CFJB =", value, "cfjb");
            return (Criteria) this;
        }

        public Criteria andCfjbNotEqualTo(String value) {
            addCriterion("CFJB <>", value, "cfjb");
            return (Criteria) this;
        }

        public Criteria andCfjbGreaterThan(String value) {
            addCriterion("CFJB >", value, "cfjb");
            return (Criteria) this;
        }

        public Criteria andCfjbGreaterThanOrEqualTo(String value) {
            addCriterion("CFJB >=", value, "cfjb");
            return (Criteria) this;
        }

        public Criteria andCfjbLessThan(String value) {
            addCriterion("CFJB <", value, "cfjb");
            return (Criteria) this;
        }

        public Criteria andCfjbLessThanOrEqualTo(String value) {
            addCriterion("CFJB <=", value, "cfjb");
            return (Criteria) this;
        }

        public Criteria andCfjbLike(String value) {
            addCriterion("CFJB like", value, "cfjb");
            return (Criteria) this;
        }

        public Criteria andCfjbNotLike(String value) {
            addCriterion("CFJB not like", value, "cfjb");
            return (Criteria) this;
        }

        public Criteria andCfjbIn(List<String> values) {
            addCriterion("CFJB in", values, "cfjb");
            return (Criteria) this;
        }

        public Criteria andCfjbNotIn(List<String> values) {
            addCriterion("CFJB not in", values, "cfjb");
            return (Criteria) this;
        }

        public Criteria andCfjbBetween(String value1, String value2) {
            addCriterion("CFJB between", value1, value2, "cfjb");
            return (Criteria) this;
        }

        public Criteria andCfjbNotBetween(String value1, String value2) {
            addCriterion("CFJB not between", value1, value2, "cfjb");
            return (Criteria) this;
        }

        public Criteria andZdgzIsNull() {
            addCriterion("ZDGZ is null");
            return (Criteria) this;
        }

        public Criteria andZdgzIsNotNull() {
            addCriterion("ZDGZ is not null");
            return (Criteria) this;
        }

        public Criteria andZdgzEqualTo(String value) {
            addCriterion("ZDGZ =", value, "zdgz");
            return (Criteria) this;
        }

        public Criteria andZdgzNotEqualTo(String value) {
            addCriterion("ZDGZ <>", value, "zdgz");
            return (Criteria) this;
        }

        public Criteria andZdgzGreaterThan(String value) {
            addCriterion("ZDGZ >", value, "zdgz");
            return (Criteria) this;
        }

        public Criteria andZdgzGreaterThanOrEqualTo(String value) {
            addCriterion("ZDGZ >=", value, "zdgz");
            return (Criteria) this;
        }

        public Criteria andZdgzLessThan(String value) {
            addCriterion("ZDGZ <", value, "zdgz");
            return (Criteria) this;
        }

        public Criteria andZdgzLessThanOrEqualTo(String value) {
            addCriterion("ZDGZ <=", value, "zdgz");
            return (Criteria) this;
        }

        public Criteria andZdgzLike(String value) {
            addCriterion("ZDGZ like", value, "zdgz");
            return (Criteria) this;
        }

        public Criteria andZdgzNotLike(String value) {
            addCriterion("ZDGZ not like", value, "zdgz");
            return (Criteria) this;
        }

        public Criteria andZdgzIn(List<String> values) {
            addCriterion("ZDGZ in", values, "zdgz");
            return (Criteria) this;
        }

        public Criteria andZdgzNotIn(List<String> values) {
            addCriterion("ZDGZ not in", values, "zdgz");
            return (Criteria) this;
        }

        public Criteria andZdgzBetween(String value1, String value2) {
            addCriterion("ZDGZ between", value1, value2, "zdgz");
            return (Criteria) this;
        }

        public Criteria andZdgzNotBetween(String value1, String value2) {
            addCriterion("ZDGZ not between", value1, value2, "zdgz");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andHjstatusIsNull() {
            addCriterion("HJSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andHjstatusIsNotNull() {
            addCriterion("HJSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andHjstatusEqualTo(String value) {
            addCriterion("HJSTATUS =", value, "hjstatus");
            return (Criteria) this;
        }

        public Criteria andHjstatusNotEqualTo(String value) {
            addCriterion("HJSTATUS <>", value, "hjstatus");
            return (Criteria) this;
        }

        public Criteria andHjstatusGreaterThan(String value) {
            addCriterion("HJSTATUS >", value, "hjstatus");
            return (Criteria) this;
        }

        public Criteria andHjstatusGreaterThanOrEqualTo(String value) {
            addCriterion("HJSTATUS >=", value, "hjstatus");
            return (Criteria) this;
        }

        public Criteria andHjstatusLessThan(String value) {
            addCriterion("HJSTATUS <", value, "hjstatus");
            return (Criteria) this;
        }

        public Criteria andHjstatusLessThanOrEqualTo(String value) {
            addCriterion("HJSTATUS <=", value, "hjstatus");
            return (Criteria) this;
        }

        public Criteria andHjstatusLike(String value) {
            addCriterion("HJSTATUS like", value, "hjstatus");
            return (Criteria) this;
        }

        public Criteria andHjstatusNotLike(String value) {
            addCriterion("HJSTATUS not like", value, "hjstatus");
            return (Criteria) this;
        }

        public Criteria andHjstatusIn(List<String> values) {
            addCriterion("HJSTATUS in", values, "hjstatus");
            return (Criteria) this;
        }

        public Criteria andHjstatusNotIn(List<String> values) {
            addCriterion("HJSTATUS not in", values, "hjstatus");
            return (Criteria) this;
        }

        public Criteria andHjstatusBetween(String value1, String value2) {
            addCriterion("HJSTATUS between", value1, value2, "hjstatus");
            return (Criteria) this;
        }

        public Criteria andHjstatusNotBetween(String value1, String value2) {
            addCriterion("HJSTATUS not between", value1, value2, "hjstatus");
            return (Criteria) this;
        }

        public Criteria andCurregorgIsNull() {
            addCriterion("CURREGORG is null");
            return (Criteria) this;
        }

        public Criteria andCurregorgIsNotNull() {
            addCriterion("CURREGORG is not null");
            return (Criteria) this;
        }

        public Criteria andCurregorgEqualTo(String value) {
            addCriterion("CURREGORG =", value, "curregorg");
            return (Criteria) this;
        }

        public Criteria andCurregorgNotEqualTo(String value) {
            addCriterion("CURREGORG <>", value, "curregorg");
            return (Criteria) this;
        }

        public Criteria andCurregorgGreaterThan(String value) {
            addCriterion("CURREGORG >", value, "curregorg");
            return (Criteria) this;
        }

        public Criteria andCurregorgGreaterThanOrEqualTo(String value) {
            addCriterion("CURREGORG >=", value, "curregorg");
            return (Criteria) this;
        }

        public Criteria andCurregorgLessThan(String value) {
            addCriterion("CURREGORG <", value, "curregorg");
            return (Criteria) this;
        }

        public Criteria andCurregorgLessThanOrEqualTo(String value) {
            addCriterion("CURREGORG <=", value, "curregorg");
            return (Criteria) this;
        }

        public Criteria andCurregorgLike(String value) {
            addCriterion("CURREGORG like", value, "curregorg");
            return (Criteria) this;
        }

        public Criteria andCurregorgNotLike(String value) {
            addCriterion("CURREGORG not like", value, "curregorg");
            return (Criteria) this;
        }

        public Criteria andCurregorgIn(List<String> values) {
            addCriterion("CURREGORG in", values, "curregorg");
            return (Criteria) this;
        }

        public Criteria andCurregorgNotIn(List<String> values) {
            addCriterion("CURREGORG not in", values, "curregorg");
            return (Criteria) this;
        }

        public Criteria andCurregorgBetween(String value1, String value2) {
            addCriterion("CURREGORG between", value1, value2, "curregorg");
            return (Criteria) this;
        }

        public Criteria andCurregorgNotBetween(String value1, String value2) {
            addCriterion("CURREGORG not between", value1, value2, "curregorg");
            return (Criteria) this;
        }

        public Criteria andCurdepIsNull() {
            addCriterion("CURDEP is null");
            return (Criteria) this;
        }

        public Criteria andCurdepIsNotNull() {
            addCriterion("CURDEP is not null");
            return (Criteria) this;
        }

        public Criteria andCurdepEqualTo(String value) {
            addCriterion("CURDEP =", value, "curdep");
            return (Criteria) this;
        }

        public Criteria andCurdepNotEqualTo(String value) {
            addCriterion("CURDEP <>", value, "curdep");
            return (Criteria) this;
        }

        public Criteria andCurdepGreaterThan(String value) {
            addCriterion("CURDEP >", value, "curdep");
            return (Criteria) this;
        }

        public Criteria andCurdepGreaterThanOrEqualTo(String value) {
            addCriterion("CURDEP >=", value, "curdep");
            return (Criteria) this;
        }

        public Criteria andCurdepLessThan(String value) {
            addCriterion("CURDEP <", value, "curdep");
            return (Criteria) this;
        }

        public Criteria andCurdepLessThanOrEqualTo(String value) {
            addCriterion("CURDEP <=", value, "curdep");
            return (Criteria) this;
        }

        public Criteria andCurdepLike(String value) {
            addCriterion("CURDEP like", value, "curdep");
            return (Criteria) this;
        }

        public Criteria andCurdepNotLike(String value) {
            addCriterion("CURDEP not like", value, "curdep");
            return (Criteria) this;
        }

        public Criteria andCurdepIn(List<String> values) {
            addCriterion("CURDEP in", values, "curdep");
            return (Criteria) this;
        }

        public Criteria andCurdepNotIn(List<String> values) {
            addCriterion("CURDEP not in", values, "curdep");
            return (Criteria) this;
        }

        public Criteria andCurdepBetween(String value1, String value2) {
            addCriterion("CURDEP between", value1, value2, "curdep");
            return (Criteria) this;
        }

        public Criteria andCurdepNotBetween(String value1, String value2) {
            addCriterion("CURDEP not between", value1, value2, "curdep");
            return (Criteria) this;
        }

        public Criteria andReportbasqueIsNull() {
            addCriterion("REPORTBASQUE is null");
            return (Criteria) this;
        }

        public Criteria andReportbasqueIsNotNull() {
            addCriterion("REPORTBASQUE is not null");
            return (Criteria) this;
        }

        public Criteria andReportbasqueEqualTo(String value) {
            addCriterion("REPORTBASQUE =", value, "reportbasque");
            return (Criteria) this;
        }

        public Criteria andReportbasqueNotEqualTo(String value) {
            addCriterion("REPORTBASQUE <>", value, "reportbasque");
            return (Criteria) this;
        }

        public Criteria andReportbasqueGreaterThan(String value) {
            addCriterion("REPORTBASQUE >", value, "reportbasque");
            return (Criteria) this;
        }

        public Criteria andReportbasqueGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTBASQUE >=", value, "reportbasque");
            return (Criteria) this;
        }

        public Criteria andReportbasqueLessThan(String value) {
            addCriterion("REPORTBASQUE <", value, "reportbasque");
            return (Criteria) this;
        }

        public Criteria andReportbasqueLessThanOrEqualTo(String value) {
            addCriterion("REPORTBASQUE <=", value, "reportbasque");
            return (Criteria) this;
        }

        public Criteria andReportbasqueLike(String value) {
            addCriterion("REPORTBASQUE like", value, "reportbasque");
            return (Criteria) this;
        }

        public Criteria andReportbasqueNotLike(String value) {
            addCriterion("REPORTBASQUE not like", value, "reportbasque");
            return (Criteria) this;
        }

        public Criteria andReportbasqueIn(List<String> values) {
            addCriterion("REPORTBASQUE in", values, "reportbasque");
            return (Criteria) this;
        }

        public Criteria andReportbasqueNotIn(List<String> values) {
            addCriterion("REPORTBASQUE not in", values, "reportbasque");
            return (Criteria) this;
        }

        public Criteria andReportbasqueBetween(String value1, String value2) {
            addCriterion("REPORTBASQUE between", value1, value2, "reportbasque");
            return (Criteria) this;
        }

        public Criteria andReportbasqueNotBetween(String value1, String value2) {
            addCriterion("REPORTBASQUE not between", value1, value2, "reportbasque");
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

        public Criteria andInvoptIsNull() {
            addCriterion("INVOPT is null");
            return (Criteria) this;
        }

        public Criteria andInvoptIsNotNull() {
            addCriterion("INVOPT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoptEqualTo(String value) {
            addCriterion("INVOPT =", value, "invopt");
            return (Criteria) this;
        }

        public Criteria andInvoptNotEqualTo(String value) {
            addCriterion("INVOPT <>", value, "invopt");
            return (Criteria) this;
        }

        public Criteria andInvoptGreaterThan(String value) {
            addCriterion("INVOPT >", value, "invopt");
            return (Criteria) this;
        }

        public Criteria andInvoptGreaterThanOrEqualTo(String value) {
            addCriterion("INVOPT >=", value, "invopt");
            return (Criteria) this;
        }

        public Criteria andInvoptLessThan(String value) {
            addCriterion("INVOPT <", value, "invopt");
            return (Criteria) this;
        }

        public Criteria andInvoptLessThanOrEqualTo(String value) {
            addCriterion("INVOPT <=", value, "invopt");
            return (Criteria) this;
        }

        public Criteria andInvoptLike(String value) {
            addCriterion("INVOPT like", value, "invopt");
            return (Criteria) this;
        }

        public Criteria andInvoptNotLike(String value) {
            addCriterion("INVOPT not like", value, "invopt");
            return (Criteria) this;
        }

        public Criteria andInvoptIn(List<String> values) {
            addCriterion("INVOPT in", values, "invopt");
            return (Criteria) this;
        }

        public Criteria andInvoptNotIn(List<String> values) {
            addCriterion("INVOPT not in", values, "invopt");
            return (Criteria) this;
        }

        public Criteria andInvoptBetween(String value1, String value2) {
            addCriterion("INVOPT between", value1, value2, "invopt");
            return (Criteria) this;
        }

        public Criteria andInvoptNotBetween(String value1, String value2) {
            addCriterion("INVOPT not between", value1, value2, "invopt");
            return (Criteria) this;
        }

        public Criteria andPttypeIsNull() {
            addCriterion("PTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPttypeIsNotNull() {
            addCriterion("PTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPttypeEqualTo(String value) {
            addCriterion("PTTYPE =", value, "pttype");
            return (Criteria) this;
        }

        public Criteria andPttypeNotEqualTo(String value) {
            addCriterion("PTTYPE <>", value, "pttype");
            return (Criteria) this;
        }

        public Criteria andPttypeGreaterThan(String value) {
            addCriterion("PTTYPE >", value, "pttype");
            return (Criteria) this;
        }

        public Criteria andPttypeGreaterThanOrEqualTo(String value) {
            addCriterion("PTTYPE >=", value, "pttype");
            return (Criteria) this;
        }

        public Criteria andPttypeLessThan(String value) {
            addCriterion("PTTYPE <", value, "pttype");
            return (Criteria) this;
        }

        public Criteria andPttypeLessThanOrEqualTo(String value) {
            addCriterion("PTTYPE <=", value, "pttype");
            return (Criteria) this;
        }

        public Criteria andPttypeLike(String value) {
            addCriterion("PTTYPE like", value, "pttype");
            return (Criteria) this;
        }

        public Criteria andPttypeNotLike(String value) {
            addCriterion("PTTYPE not like", value, "pttype");
            return (Criteria) this;
        }

        public Criteria andPttypeIn(List<String> values) {
            addCriterion("PTTYPE in", values, "pttype");
            return (Criteria) this;
        }

        public Criteria andPttypeNotIn(List<String> values) {
            addCriterion("PTTYPE not in", values, "pttype");
            return (Criteria) this;
        }

        public Criteria andPttypeBetween(String value1, String value2) {
            addCriterion("PTTYPE between", value1, value2, "pttype");
            return (Criteria) this;
        }

        public Criteria andPttypeNotBetween(String value1, String value2) {
            addCriterion("PTTYPE not between", value1, value2, "pttype");
            return (Criteria) this;
        }

        public Criteria andUbindtypeIsNull() {
            addCriterion("UBINDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUbindtypeIsNotNull() {
            addCriterion("UBINDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUbindtypeEqualTo(String value) {
            addCriterion("UBINDTYPE =", value, "ubindtype");
            return (Criteria) this;
        }

        public Criteria andUbindtypeNotEqualTo(String value) {
            addCriterion("UBINDTYPE <>", value, "ubindtype");
            return (Criteria) this;
        }

        public Criteria andUbindtypeGreaterThan(String value) {
            addCriterion("UBINDTYPE >", value, "ubindtype");
            return (Criteria) this;
        }

        public Criteria andUbindtypeGreaterThanOrEqualTo(String value) {
            addCriterion("UBINDTYPE >=", value, "ubindtype");
            return (Criteria) this;
        }

        public Criteria andUbindtypeLessThan(String value) {
            addCriterion("UBINDTYPE <", value, "ubindtype");
            return (Criteria) this;
        }

        public Criteria andUbindtypeLessThanOrEqualTo(String value) {
            addCriterion("UBINDTYPE <=", value, "ubindtype");
            return (Criteria) this;
        }

        public Criteria andUbindtypeLike(String value) {
            addCriterion("UBINDTYPE like", value, "ubindtype");
            return (Criteria) this;
        }

        public Criteria andUbindtypeNotLike(String value) {
            addCriterion("UBINDTYPE not like", value, "ubindtype");
            return (Criteria) this;
        }

        public Criteria andUbindtypeIn(List<String> values) {
            addCriterion("UBINDTYPE in", values, "ubindtype");
            return (Criteria) this;
        }

        public Criteria andUbindtypeNotIn(List<String> values) {
            addCriterion("UBINDTYPE not in", values, "ubindtype");
            return (Criteria) this;
        }

        public Criteria andUbindtypeBetween(String value1, String value2) {
            addCriterion("UBINDTYPE between", value1, value2, "ubindtype");
            return (Criteria) this;
        }

        public Criteria andUbindtypeNotBetween(String value1, String value2) {
            addCriterion("UBINDTYPE not between", value1, value2, "ubindtype");
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

        public Criteria andPtaddrIsNull() {
            addCriterion("PTADDR is null");
            return (Criteria) this;
        }

        public Criteria andPtaddrIsNotNull() {
            addCriterion("PTADDR is not null");
            return (Criteria) this;
        }

        public Criteria andPtaddrEqualTo(String value) {
            addCriterion("PTADDR =", value, "ptaddr");
            return (Criteria) this;
        }

        public Criteria andPtaddrNotEqualTo(String value) {
            addCriterion("PTADDR <>", value, "ptaddr");
            return (Criteria) this;
        }

        public Criteria andPtaddrGreaterThan(String value) {
            addCriterion("PTADDR >", value, "ptaddr");
            return (Criteria) this;
        }

        public Criteria andPtaddrGreaterThanOrEqualTo(String value) {
            addCriterion("PTADDR >=", value, "ptaddr");
            return (Criteria) this;
        }

        public Criteria andPtaddrLessThan(String value) {
            addCriterion("PTADDR <", value, "ptaddr");
            return (Criteria) this;
        }

        public Criteria andPtaddrLessThanOrEqualTo(String value) {
            addCriterion("PTADDR <=", value, "ptaddr");
            return (Criteria) this;
        }

        public Criteria andPtaddrLike(String value) {
            addCriterion("PTADDR like", value, "ptaddr");
            return (Criteria) this;
        }

        public Criteria andPtaddrNotLike(String value) {
            addCriterion("PTADDR not like", value, "ptaddr");
            return (Criteria) this;
        }

        public Criteria andPtaddrIn(List<String> values) {
            addCriterion("PTADDR in", values, "ptaddr");
            return (Criteria) this;
        }

        public Criteria andPtaddrNotIn(List<String> values) {
            addCriterion("PTADDR not in", values, "ptaddr");
            return (Criteria) this;
        }

        public Criteria andPtaddrBetween(String value1, String value2) {
            addCriterion("PTADDR between", value1, value2, "ptaddr");
            return (Criteria) this;
        }

        public Criteria andPtaddrNotBetween(String value1, String value2) {
            addCriterion("PTADDR not between", value1, value2, "ptaddr");
            return (Criteria) this;
        }

        public Criteria andPttelIsNull() {
            addCriterion("PTTEL is null");
            return (Criteria) this;
        }

        public Criteria andPttelIsNotNull() {
            addCriterion("PTTEL is not null");
            return (Criteria) this;
        }

        public Criteria andPttelEqualTo(String value) {
            addCriterion("PTTEL =", value, "pttel");
            return (Criteria) this;
        }

        public Criteria andPttelNotEqualTo(String value) {
            addCriterion("PTTEL <>", value, "pttel");
            return (Criteria) this;
        }

        public Criteria andPttelGreaterThan(String value) {
            addCriterion("PTTEL >", value, "pttel");
            return (Criteria) this;
        }

        public Criteria andPttelGreaterThanOrEqualTo(String value) {
            addCriterion("PTTEL >=", value, "pttel");
            return (Criteria) this;
        }

        public Criteria andPttelLessThan(String value) {
            addCriterion("PTTEL <", value, "pttel");
            return (Criteria) this;
        }

        public Criteria andPttelLessThanOrEqualTo(String value) {
            addCriterion("PTTEL <=", value, "pttel");
            return (Criteria) this;
        }

        public Criteria andPttelLike(String value) {
            addCriterion("PTTEL like", value, "pttel");
            return (Criteria) this;
        }

        public Criteria andPttelNotLike(String value) {
            addCriterion("PTTEL not like", value, "pttel");
            return (Criteria) this;
        }

        public Criteria andPttelIn(List<String> values) {
            addCriterion("PTTEL in", values, "pttel");
            return (Criteria) this;
        }

        public Criteria andPttelNotIn(List<String> values) {
            addCriterion("PTTEL not in", values, "pttel");
            return (Criteria) this;
        }

        public Criteria andPttelBetween(String value1, String value2) {
            addCriterion("PTTEL between", value1, value2, "pttel");
            return (Criteria) this;
        }

        public Criteria andPttelNotBetween(String value1, String value2) {
            addCriterion("PTTEL not between", value1, value2, "pttel");
            return (Criteria) this;
        }

        public Criteria andSalemodeIsNull() {
            addCriterion("SALEMODE is null");
            return (Criteria) this;
        }

        public Criteria andSalemodeIsNotNull() {
            addCriterion("SALEMODE is not null");
            return (Criteria) this;
        }

        public Criteria andSalemodeEqualTo(String value) {
            addCriterion("SALEMODE =", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeNotEqualTo(String value) {
            addCriterion("SALEMODE <>", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeGreaterThan(String value) {
            addCriterion("SALEMODE >", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeGreaterThanOrEqualTo(String value) {
            addCriterion("SALEMODE >=", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeLessThan(String value) {
            addCriterion("SALEMODE <", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeLessThanOrEqualTo(String value) {
            addCriterion("SALEMODE <=", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeLike(String value) {
            addCriterion("SALEMODE like", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeNotLike(String value) {
            addCriterion("SALEMODE not like", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeIn(List<String> values) {
            addCriterion("SALEMODE in", values, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeNotIn(List<String> values) {
            addCriterion("SALEMODE not in", values, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeBetween(String value1, String value2) {
            addCriterion("SALEMODE between", value1, value2, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeNotBetween(String value1, String value2) {
            addCriterion("SALEMODE not between", value1, value2, "salemode");
            return (Criteria) this;
        }

        public Criteria andManorgIsNull() {
            addCriterion("MANORG is null");
            return (Criteria) this;
        }

        public Criteria andManorgIsNotNull() {
            addCriterion("MANORG is not null");
            return (Criteria) this;
        }

        public Criteria andManorgEqualTo(String value) {
            addCriterion("MANORG =", value, "manorg");
            return (Criteria) this;
        }

        public Criteria andManorgNotEqualTo(String value) {
            addCriterion("MANORG <>", value, "manorg");
            return (Criteria) this;
        }

        public Criteria andManorgGreaterThan(String value) {
            addCriterion("MANORG >", value, "manorg");
            return (Criteria) this;
        }

        public Criteria andManorgGreaterThanOrEqualTo(String value) {
            addCriterion("MANORG >=", value, "manorg");
            return (Criteria) this;
        }

        public Criteria andManorgLessThan(String value) {
            addCriterion("MANORG <", value, "manorg");
            return (Criteria) this;
        }

        public Criteria andManorgLessThanOrEqualTo(String value) {
            addCriterion("MANORG <=", value, "manorg");
            return (Criteria) this;
        }

        public Criteria andManorgLike(String value) {
            addCriterion("MANORG like", value, "manorg");
            return (Criteria) this;
        }

        public Criteria andManorgNotLike(String value) {
            addCriterion("MANORG not like", value, "manorg");
            return (Criteria) this;
        }

        public Criteria andManorgIn(List<String> values) {
            addCriterion("MANORG in", values, "manorg");
            return (Criteria) this;
        }

        public Criteria andManorgNotIn(List<String> values) {
            addCriterion("MANORG not in", values, "manorg");
            return (Criteria) this;
        }

        public Criteria andManorgBetween(String value1, String value2) {
            addCriterion("MANORG between", value1, value2, "manorg");
            return (Criteria) this;
        }

        public Criteria andManorgNotBetween(String value1, String value2) {
            addCriterion("MANORG not between", value1, value2, "manorg");
            return (Criteria) this;
        }

        public Criteria andZtRegorgIsNull() {
            addCriterion("ZT_REGORG is null");
            return (Criteria) this;
        }

        public Criteria andZtRegorgIsNotNull() {
            addCriterion("ZT_REGORG is not null");
            return (Criteria) this;
        }

        public Criteria andZtRegorgEqualTo(String value) {
            addCriterion("ZT_REGORG =", value, "ztRegorg");
            return (Criteria) this;
        }

        public Criteria andZtRegorgNotEqualTo(String value) {
            addCriterion("ZT_REGORG <>", value, "ztRegorg");
            return (Criteria) this;
        }

        public Criteria andZtRegorgGreaterThan(String value) {
            addCriterion("ZT_REGORG >", value, "ztRegorg");
            return (Criteria) this;
        }

        public Criteria andZtRegorgGreaterThanOrEqualTo(String value) {
            addCriterion("ZT_REGORG >=", value, "ztRegorg");
            return (Criteria) this;
        }

        public Criteria andZtRegorgLessThan(String value) {
            addCriterion("ZT_REGORG <", value, "ztRegorg");
            return (Criteria) this;
        }

        public Criteria andZtRegorgLessThanOrEqualTo(String value) {
            addCriterion("ZT_REGORG <=", value, "ztRegorg");
            return (Criteria) this;
        }

        public Criteria andZtRegorgLike(String value) {
            addCriterion("ZT_REGORG like", value, "ztRegorg");
            return (Criteria) this;
        }

        public Criteria andZtRegorgNotLike(String value) {
            addCriterion("ZT_REGORG not like", value, "ztRegorg");
            return (Criteria) this;
        }

        public Criteria andZtRegorgIn(List<String> values) {
            addCriterion("ZT_REGORG in", values, "ztRegorg");
            return (Criteria) this;
        }

        public Criteria andZtRegorgNotIn(List<String> values) {
            addCriterion("ZT_REGORG not in", values, "ztRegorg");
            return (Criteria) this;
        }

        public Criteria andZtRegorgBetween(String value1, String value2) {
            addCriterion("ZT_REGORG between", value1, value2, "ztRegorg");
            return (Criteria) this;
        }

        public Criteria andZtRegorgNotBetween(String value1, String value2) {
            addCriterion("ZT_REGORG not between", value1, value2, "ztRegorg");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgIsNull() {
            addCriterion("ZT_LOCALORG is null");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgIsNotNull() {
            addCriterion("ZT_LOCALORG is not null");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgEqualTo(String value) {
            addCriterion("ZT_LOCALORG =", value, "ztLocalorg");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgNotEqualTo(String value) {
            addCriterion("ZT_LOCALORG <>", value, "ztLocalorg");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgGreaterThan(String value) {
            addCriterion("ZT_LOCALORG >", value, "ztLocalorg");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgGreaterThanOrEqualTo(String value) {
            addCriterion("ZT_LOCALORG >=", value, "ztLocalorg");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgLessThan(String value) {
            addCriterion("ZT_LOCALORG <", value, "ztLocalorg");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgLessThanOrEqualTo(String value) {
            addCriterion("ZT_LOCALORG <=", value, "ztLocalorg");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgLike(String value) {
            addCriterion("ZT_LOCALORG like", value, "ztLocalorg");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgNotLike(String value) {
            addCriterion("ZT_LOCALORG not like", value, "ztLocalorg");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgIn(List<String> values) {
            addCriterion("ZT_LOCALORG in", values, "ztLocalorg");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgNotIn(List<String> values) {
            addCriterion("ZT_LOCALORG not in", values, "ztLocalorg");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgBetween(String value1, String value2) {
            addCriterion("ZT_LOCALORG between", value1, value2, "ztLocalorg");
            return (Criteria) this;
        }

        public Criteria andZtLocalorgNotBetween(String value1, String value2) {
            addCriterion("ZT_LOCALORG not between", value1, value2, "ztLocalorg");
            return (Criteria) this;
        }

        public Criteria andObtypeIsNull() {
            addCriterion("OBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andObtypeIsNotNull() {
            addCriterion("OBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andObtypeEqualTo(String value) {
            addCriterion("OBTYPE =", value, "obtype");
            return (Criteria) this;
        }

        public Criteria andObtypeNotEqualTo(String value) {
            addCriterion("OBTYPE <>", value, "obtype");
            return (Criteria) this;
        }

        public Criteria andObtypeGreaterThan(String value) {
            addCriterion("OBTYPE >", value, "obtype");
            return (Criteria) this;
        }

        public Criteria andObtypeGreaterThanOrEqualTo(String value) {
            addCriterion("OBTYPE >=", value, "obtype");
            return (Criteria) this;
        }

        public Criteria andObtypeLessThan(String value) {
            addCriterion("OBTYPE <", value, "obtype");
            return (Criteria) this;
        }

        public Criteria andObtypeLessThanOrEqualTo(String value) {
            addCriterion("OBTYPE <=", value, "obtype");
            return (Criteria) this;
        }

        public Criteria andObtypeLike(String value) {
            addCriterion("OBTYPE like", value, "obtype");
            return (Criteria) this;
        }

        public Criteria andObtypeNotLike(String value) {
            addCriterion("OBTYPE not like", value, "obtype");
            return (Criteria) this;
        }

        public Criteria andObtypeIn(List<String> values) {
            addCriterion("OBTYPE in", values, "obtype");
            return (Criteria) this;
        }

        public Criteria andObtypeNotIn(List<String> values) {
            addCriterion("OBTYPE not in", values, "obtype");
            return (Criteria) this;
        }

        public Criteria andObtypeBetween(String value1, String value2) {
            addCriterion("OBTYPE between", value1, value2, "obtype");
            return (Criteria) this;
        }

        public Criteria andObtypeNotBetween(String value1, String value2) {
            addCriterion("OBTYPE not between", value1, value2, "obtype");
            return (Criteria) this;
        }

        public Criteria andMdsenameIsNull() {
            addCriterion("MDSENAME is null");
            return (Criteria) this;
        }

        public Criteria andMdsenameIsNotNull() {
            addCriterion("MDSENAME is not null");
            return (Criteria) this;
        }

        public Criteria andMdsenameEqualTo(String value) {
            addCriterion("MDSENAME =", value, "mdsename");
            return (Criteria) this;
        }

        public Criteria andMdsenameNotEqualTo(String value) {
            addCriterion("MDSENAME <>", value, "mdsename");
            return (Criteria) this;
        }

        public Criteria andMdsenameGreaterThan(String value) {
            addCriterion("MDSENAME >", value, "mdsename");
            return (Criteria) this;
        }

        public Criteria andMdsenameGreaterThanOrEqualTo(String value) {
            addCriterion("MDSENAME >=", value, "mdsename");
            return (Criteria) this;
        }

        public Criteria andMdsenameLessThan(String value) {
            addCriterion("MDSENAME <", value, "mdsename");
            return (Criteria) this;
        }

        public Criteria andMdsenameLessThanOrEqualTo(String value) {
            addCriterion("MDSENAME <=", value, "mdsename");
            return (Criteria) this;
        }

        public Criteria andMdsenameLike(String value) {
            addCriterion("MDSENAME like", value, "mdsename");
            return (Criteria) this;
        }

        public Criteria andMdsenameNotLike(String value) {
            addCriterion("MDSENAME not like", value, "mdsename");
            return (Criteria) this;
        }

        public Criteria andMdsenameIn(List<String> values) {
            addCriterion("MDSENAME in", values, "mdsename");
            return (Criteria) this;
        }

        public Criteria andMdsenameNotIn(List<String> values) {
            addCriterion("MDSENAME not in", values, "mdsename");
            return (Criteria) this;
        }

        public Criteria andMdsenameBetween(String value1, String value2) {
            addCriterion("MDSENAME between", value1, value2, "mdsename");
            return (Criteria) this;
        }

        public Criteria andMdsenameNotBetween(String value1, String value2) {
            addCriterion("MDSENAME not between", value1, value2, "mdsename");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNull() {
            addCriterion("BRANDNAME is null");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNotNull() {
            addCriterion("BRANDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBrandnameEqualTo(String value) {
            addCriterion("BRANDNAME =", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotEqualTo(String value) {
            addCriterion("BRANDNAME <>", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThan(String value) {
            addCriterion("BRANDNAME >", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("BRANDNAME >=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThan(String value) {
            addCriterion("BRANDNAME <", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThanOrEqualTo(String value) {
            addCriterion("BRANDNAME <=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLike(String value) {
            addCriterion("BRANDNAME like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotLike(String value) {
            addCriterion("BRANDNAME not like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameIn(List<String> values) {
            addCriterion("BRANDNAME in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotIn(List<String> values) {
            addCriterion("BRANDNAME not in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameBetween(String value1, String value2) {
            addCriterion("BRANDNAME between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotBetween(String value1, String value2) {
            addCriterion("BRANDNAME not between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andMeaunitIsNull() {
            addCriterion("MEAUNIT is null");
            return (Criteria) this;
        }

        public Criteria andMeaunitIsNotNull() {
            addCriterion("MEAUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andMeaunitEqualTo(String value) {
            addCriterion("MEAUNIT =", value, "meaunit");
            return (Criteria) this;
        }

        public Criteria andMeaunitNotEqualTo(String value) {
            addCriterion("MEAUNIT <>", value, "meaunit");
            return (Criteria) this;
        }

        public Criteria andMeaunitGreaterThan(String value) {
            addCriterion("MEAUNIT >", value, "meaunit");
            return (Criteria) this;
        }

        public Criteria andMeaunitGreaterThanOrEqualTo(String value) {
            addCriterion("MEAUNIT >=", value, "meaunit");
            return (Criteria) this;
        }

        public Criteria andMeaunitLessThan(String value) {
            addCriterion("MEAUNIT <", value, "meaunit");
            return (Criteria) this;
        }

        public Criteria andMeaunitLessThanOrEqualTo(String value) {
            addCriterion("MEAUNIT <=", value, "meaunit");
            return (Criteria) this;
        }

        public Criteria andMeaunitLike(String value) {
            addCriterion("MEAUNIT like", value, "meaunit");
            return (Criteria) this;
        }

        public Criteria andMeaunitNotLike(String value) {
            addCriterion("MEAUNIT not like", value, "meaunit");
            return (Criteria) this;
        }

        public Criteria andMeaunitIn(List<String> values) {
            addCriterion("MEAUNIT in", values, "meaunit");
            return (Criteria) this;
        }

        public Criteria andMeaunitNotIn(List<String> values) {
            addCriterion("MEAUNIT not in", values, "meaunit");
            return (Criteria) this;
        }

        public Criteria andMeaunitBetween(String value1, String value2) {
            addCriterion("MEAUNIT between", value1, value2, "meaunit");
            return (Criteria) this;
        }

        public Criteria andMeaunitNotBetween(String value1, String value2) {
            addCriterion("MEAUNIT not between", value1, value2, "meaunit");
            return (Criteria) this;
        }

        public Criteria andQuanIsNull() {
            addCriterion("QUAN is null");
            return (Criteria) this;
        }

        public Criteria andQuanIsNotNull() {
            addCriterion("QUAN is not null");
            return (Criteria) this;
        }

        public Criteria andQuanEqualTo(Integer value) {
            addCriterion("QUAN =", value, "quan");
            return (Criteria) this;
        }

        public Criteria andQuanNotEqualTo(Integer value) {
            addCriterion("QUAN <>", value, "quan");
            return (Criteria) this;
        }

        public Criteria andQuanGreaterThan(Integer value) {
            addCriterion("QUAN >", value, "quan");
            return (Criteria) this;
        }

        public Criteria andQuanGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUAN >=", value, "quan");
            return (Criteria) this;
        }

        public Criteria andQuanLessThan(Integer value) {
            addCriterion("QUAN <", value, "quan");
            return (Criteria) this;
        }

        public Criteria andQuanLessThanOrEqualTo(Integer value) {
            addCriterion("QUAN <=", value, "quan");
            return (Criteria) this;
        }

        public Criteria andQuanIn(List<Integer> values) {
            addCriterion("QUAN in", values, "quan");
            return (Criteria) this;
        }

        public Criteria andQuanNotIn(List<Integer> values) {
            addCriterion("QUAN not in", values, "quan");
            return (Criteria) this;
        }

        public Criteria andQuanBetween(Integer value1, Integer value2) {
            addCriterion("QUAN between", value1, value2, "quan");
            return (Criteria) this;
        }

        public Criteria andQuanNotBetween(Integer value1, Integer value2) {
            addCriterion("QUAN not between", value1, value2, "quan");
            return (Criteria) this;
        }

        public Criteria andMerimpsignIsNull() {
            addCriterion("MERIMPSIGN is null");
            return (Criteria) this;
        }

        public Criteria andMerimpsignIsNotNull() {
            addCriterion("MERIMPSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andMerimpsignEqualTo(String value) {
            addCriterion("MERIMPSIGN =", value, "merimpsign");
            return (Criteria) this;
        }

        public Criteria andMerimpsignNotEqualTo(String value) {
            addCriterion("MERIMPSIGN <>", value, "merimpsign");
            return (Criteria) this;
        }

        public Criteria andMerimpsignGreaterThan(String value) {
            addCriterion("MERIMPSIGN >", value, "merimpsign");
            return (Criteria) this;
        }

        public Criteria andMerimpsignGreaterThanOrEqualTo(String value) {
            addCriterion("MERIMPSIGN >=", value, "merimpsign");
            return (Criteria) this;
        }

        public Criteria andMerimpsignLessThan(String value) {
            addCriterion("MERIMPSIGN <", value, "merimpsign");
            return (Criteria) this;
        }

        public Criteria andMerimpsignLessThanOrEqualTo(String value) {
            addCriterion("MERIMPSIGN <=", value, "merimpsign");
            return (Criteria) this;
        }

        public Criteria andMerimpsignLike(String value) {
            addCriterion("MERIMPSIGN like", value, "merimpsign");
            return (Criteria) this;
        }

        public Criteria andMerimpsignNotLike(String value) {
            addCriterion("MERIMPSIGN not like", value, "merimpsign");
            return (Criteria) this;
        }

        public Criteria andMerimpsignIn(List<String> values) {
            addCriterion("MERIMPSIGN in", values, "merimpsign");
            return (Criteria) this;
        }

        public Criteria andMerimpsignNotIn(List<String> values) {
            addCriterion("MERIMPSIGN not in", values, "merimpsign");
            return (Criteria) this;
        }

        public Criteria andMerimpsignBetween(String value1, String value2) {
            addCriterion("MERIMPSIGN between", value1, value2, "merimpsign");
            return (Criteria) this;
        }

        public Criteria andMerimpsignNotBetween(String value1, String value2) {
            addCriterion("MERIMPSIGN not between", value1, value2, "merimpsign");
            return (Criteria) this;
        }

        public Criteria andTypespfIsNull() {
            addCriterion("TYPESPF is null");
            return (Criteria) this;
        }

        public Criteria andTypespfIsNotNull() {
            addCriterion("TYPESPF is not null");
            return (Criteria) this;
        }

        public Criteria andTypespfEqualTo(String value) {
            addCriterion("TYPESPF =", value, "typespf");
            return (Criteria) this;
        }

        public Criteria andTypespfNotEqualTo(String value) {
            addCriterion("TYPESPF <>", value, "typespf");
            return (Criteria) this;
        }

        public Criteria andTypespfGreaterThan(String value) {
            addCriterion("TYPESPF >", value, "typespf");
            return (Criteria) this;
        }

        public Criteria andTypespfGreaterThanOrEqualTo(String value) {
            addCriterion("TYPESPF >=", value, "typespf");
            return (Criteria) this;
        }

        public Criteria andTypespfLessThan(String value) {
            addCriterion("TYPESPF <", value, "typespf");
            return (Criteria) this;
        }

        public Criteria andTypespfLessThanOrEqualTo(String value) {
            addCriterion("TYPESPF <=", value, "typespf");
            return (Criteria) this;
        }

        public Criteria andTypespfLike(String value) {
            addCriterion("TYPESPF like", value, "typespf");
            return (Criteria) this;
        }

        public Criteria andTypespfNotLike(String value) {
            addCriterion("TYPESPF not like", value, "typespf");
            return (Criteria) this;
        }

        public Criteria andTypespfIn(List<String> values) {
            addCriterion("TYPESPF in", values, "typespf");
            return (Criteria) this;
        }

        public Criteria andTypespfNotIn(List<String> values) {
            addCriterion("TYPESPF not in", values, "typespf");
            return (Criteria) this;
        }

        public Criteria andTypespfBetween(String value1, String value2) {
            addCriterion("TYPESPF between", value1, value2, "typespf");
            return (Criteria) this;
        }

        public Criteria andTypespfNotBetween(String value1, String value2) {
            addCriterion("TYPESPF not between", value1, value2, "typespf");
            return (Criteria) this;
        }

        public Criteria andInvoamIsNull() {
            addCriterion("INVOAM is null");
            return (Criteria) this;
        }

        public Criteria andInvoamIsNotNull() {
            addCriterion("INVOAM is not null");
            return (Criteria) this;
        }

        public Criteria andInvoamEqualTo(BigDecimal value) {
            addCriterion("INVOAM =", value, "invoam");
            return (Criteria) this;
        }

        public Criteria andInvoamNotEqualTo(BigDecimal value) {
            addCriterion("INVOAM <>", value, "invoam");
            return (Criteria) this;
        }

        public Criteria andInvoamGreaterThan(BigDecimal value) {
            addCriterion("INVOAM >", value, "invoam");
            return (Criteria) this;
        }

        public Criteria andInvoamGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOAM >=", value, "invoam");
            return (Criteria) this;
        }

        public Criteria andInvoamLessThan(BigDecimal value) {
            addCriterion("INVOAM <", value, "invoam");
            return (Criteria) this;
        }

        public Criteria andInvoamLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOAM <=", value, "invoam");
            return (Criteria) this;
        }

        public Criteria andInvoamIn(List<BigDecimal> values) {
            addCriterion("INVOAM in", values, "invoam");
            return (Criteria) this;
        }

        public Criteria andInvoamNotIn(List<BigDecimal> values) {
            addCriterion("INVOAM not in", values, "invoam");
            return (Criteria) this;
        }

        public Criteria andInvoamBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOAM between", value1, value2, "invoam");
            return (Criteria) this;
        }

        public Criteria andInvoamNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOAM not between", value1, value2, "invoam");
            return (Criteria) this;
        }

        public Criteria andIstocaseIsNull() {
            addCriterion("ISTOCASE is null");
            return (Criteria) this;
        }

        public Criteria andIstocaseIsNotNull() {
            addCriterion("ISTOCASE is not null");
            return (Criteria) this;
        }

        public Criteria andIstocaseEqualTo(String value) {
            addCriterion("ISTOCASE =", value, "istocase");
            return (Criteria) this;
        }

        public Criteria andIstocaseNotEqualTo(String value) {
            addCriterion("ISTOCASE <>", value, "istocase");
            return (Criteria) this;
        }

        public Criteria andIstocaseGreaterThan(String value) {
            addCriterion("ISTOCASE >", value, "istocase");
            return (Criteria) this;
        }

        public Criteria andIstocaseGreaterThanOrEqualTo(String value) {
            addCriterion("ISTOCASE >=", value, "istocase");
            return (Criteria) this;
        }

        public Criteria andIstocaseLessThan(String value) {
            addCriterion("ISTOCASE <", value, "istocase");
            return (Criteria) this;
        }

        public Criteria andIstocaseLessThanOrEqualTo(String value) {
            addCriterion("ISTOCASE <=", value, "istocase");
            return (Criteria) this;
        }

        public Criteria andIstocaseLike(String value) {
            addCriterion("ISTOCASE like", value, "istocase");
            return (Criteria) this;
        }

        public Criteria andIstocaseNotLike(String value) {
            addCriterion("ISTOCASE not like", value, "istocase");
            return (Criteria) this;
        }

        public Criteria andIstocaseIn(List<String> values) {
            addCriterion("ISTOCASE in", values, "istocase");
            return (Criteria) this;
        }

        public Criteria andIstocaseNotIn(List<String> values) {
            addCriterion("ISTOCASE not in", values, "istocase");
            return (Criteria) this;
        }

        public Criteria andIstocaseBetween(String value1, String value2) {
            addCriterion("ISTOCASE between", value1, value2, "istocase");
            return (Criteria) this;
        }

        public Criteria andIstocaseNotBetween(String value1, String value2) {
            addCriterion("ISTOCASE not between", value1, value2, "istocase");
            return (Criteria) this;
        }

        public Criteria andSuggestionIsNull() {
            addCriterion("SUGGESTION is null");
            return (Criteria) this;
        }

        public Criteria andSuggestionIsNotNull() {
            addCriterion("SUGGESTION is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestionEqualTo(String value) {
            addCriterion("SUGGESTION =", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotEqualTo(String value) {
            addCriterion("SUGGESTION <>", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionGreaterThan(String value) {
            addCriterion("SUGGESTION >", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("SUGGESTION >=", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionLessThan(String value) {
            addCriterion("SUGGESTION <", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionLessThanOrEqualTo(String value) {
            addCriterion("SUGGESTION <=", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionLike(String value) {
            addCriterion("SUGGESTION like", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotLike(String value) {
            addCriterion("SUGGESTION not like", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionIn(List<String> values) {
            addCriterion("SUGGESTION in", values, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotIn(List<String> values) {
            addCriterion("SUGGESTION not in", values, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionBetween(String value1, String value2) {
            addCriterion("SUGGESTION between", value1, value2, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotBetween(String value1, String value2) {
            addCriterion("SUGGESTION not between", value1, value2, "suggestion");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyIsNull() {
            addCriterion("ADVISORYREPLY is null");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyIsNotNull() {
            addCriterion("ADVISORYREPLY is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyEqualTo(String value) {
            addCriterion("ADVISORYREPLY =", value, "advisoryreply");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyNotEqualTo(String value) {
            addCriterion("ADVISORYREPLY <>", value, "advisoryreply");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyGreaterThan(String value) {
            addCriterion("ADVISORYREPLY >", value, "advisoryreply");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyGreaterThanOrEqualTo(String value) {
            addCriterion("ADVISORYREPLY >=", value, "advisoryreply");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyLessThan(String value) {
            addCriterion("ADVISORYREPLY <", value, "advisoryreply");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyLessThanOrEqualTo(String value) {
            addCriterion("ADVISORYREPLY <=", value, "advisoryreply");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyLike(String value) {
            addCriterion("ADVISORYREPLY like", value, "advisoryreply");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyNotLike(String value) {
            addCriterion("ADVISORYREPLY not like", value, "advisoryreply");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyIn(List<String> values) {
            addCriterion("ADVISORYREPLY in", values, "advisoryreply");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyNotIn(List<String> values) {
            addCriterion("ADVISORYREPLY not in", values, "advisoryreply");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyBetween(String value1, String value2) {
            addCriterion("ADVISORYREPLY between", value1, value2, "advisoryreply");
            return (Criteria) this;
        }

        public Criteria andAdvisoryreplyNotBetween(String value1, String value2) {
            addCriterion("ADVISORYREPLY not between", value1, value2, "advisoryreply");
            return (Criteria) this;
        }

        public Criteria andHfztIsNull() {
            addCriterion("HFZT is null");
            return (Criteria) this;
        }

        public Criteria andHfztIsNotNull() {
            addCriterion("HFZT is not null");
            return (Criteria) this;
        }

        public Criteria andHfztEqualTo(String value) {
            addCriterion("HFZT =", value, "hfzt");
            return (Criteria) this;
        }

        public Criteria andHfztNotEqualTo(String value) {
            addCriterion("HFZT <>", value, "hfzt");
            return (Criteria) this;
        }

        public Criteria andHfztGreaterThan(String value) {
            addCriterion("HFZT >", value, "hfzt");
            return (Criteria) this;
        }

        public Criteria andHfztGreaterThanOrEqualTo(String value) {
            addCriterion("HFZT >=", value, "hfzt");
            return (Criteria) this;
        }

        public Criteria andHfztLessThan(String value) {
            addCriterion("HFZT <", value, "hfzt");
            return (Criteria) this;
        }

        public Criteria andHfztLessThanOrEqualTo(String value) {
            addCriterion("HFZT <=", value, "hfzt");
            return (Criteria) this;
        }

        public Criteria andHfztLike(String value) {
            addCriterion("HFZT like", value, "hfzt");
            return (Criteria) this;
        }

        public Criteria andHfztNotLike(String value) {
            addCriterion("HFZT not like", value, "hfzt");
            return (Criteria) this;
        }

        public Criteria andHfztIn(List<String> values) {
            addCriterion("HFZT in", values, "hfzt");
            return (Criteria) this;
        }

        public Criteria andHfztNotIn(List<String> values) {
            addCriterion("HFZT not in", values, "hfzt");
            return (Criteria) this;
        }

        public Criteria andHfztBetween(String value1, String value2) {
            addCriterion("HFZT between", value1, value2, "hfzt");
            return (Criteria) this;
        }

        public Criteria andHfztNotBetween(String value1, String value2) {
            addCriterion("HFZT not between", value1, value2, "hfzt");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("CREATER like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("CREATER not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("UPDATER is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("UPDATER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("UPDATER =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("UPDATER <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("UPDATER >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATER >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("UPDATER <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("UPDATER <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("UPDATER like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("UPDATER not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("UPDATER in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("UPDATER not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("UPDATER between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("UPDATER not between", value1, value2, "updater");
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

        public Criteria andVerIsNull() {
            addCriterion("VER is null");
            return (Criteria) this;
        }

        public Criteria andVerIsNotNull() {
            addCriterion("VER is not null");
            return (Criteria) this;
        }

        public Criteria andVerEqualTo(BigDecimal value) {
            addCriterion("VER =", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotEqualTo(BigDecimal value) {
            addCriterion("VER <>", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThan(BigDecimal value) {
            addCriterion("VER >", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VER >=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThan(BigDecimal value) {
            addCriterion("VER <", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VER <=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerIn(List<BigDecimal> values) {
            addCriterion("VER in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotIn(List<BigDecimal> values) {
            addCriterion("VER not in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VER between", value1, value2, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VER not between", value1, value2, "ver");
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

        public Criteria andBlqxIsNull() {
            addCriterion("BLQX is null");
            return (Criteria) this;
        }

        public Criteria andBlqxIsNotNull() {
            addCriterion("BLQX is not null");
            return (Criteria) this;
        }

        public Criteria andBlqxEqualTo(Date value) {
            addCriterion("BLQX =", value, "blqx");
            return (Criteria) this;
        }

        public Criteria andBlqxNotEqualTo(Date value) {
            addCriterion("BLQX <>", value, "blqx");
            return (Criteria) this;
        }

        public Criteria andBlqxGreaterThan(Date value) {
            addCriterion("BLQX >", value, "blqx");
            return (Criteria) this;
        }

        public Criteria andBlqxGreaterThanOrEqualTo(Date value) {
            addCriterion("BLQX >=", value, "blqx");
            return (Criteria) this;
        }

        public Criteria andBlqxLessThan(Date value) {
            addCriterion("BLQX <", value, "blqx");
            return (Criteria) this;
        }

        public Criteria andBlqxLessThanOrEqualTo(Date value) {
            addCriterion("BLQX <=", value, "blqx");
            return (Criteria) this;
        }

        public Criteria andBlqxIn(List<Date> values) {
            addCriterion("BLQX in", values, "blqx");
            return (Criteria) this;
        }

        public Criteria andBlqxNotIn(List<Date> values) {
            addCriterion("BLQX not in", values, "blqx");
            return (Criteria) this;
        }

        public Criteria andBlqxBetween(Date value1, Date value2) {
            addCriterion("BLQX between", value1, value2, "blqx");
            return (Criteria) this;
        }

        public Criteria andBlqxNotBetween(Date value1, Date value2) {
            addCriterion("BLQX not between", value1, value2, "blqx");
            return (Criteria) this;
        }

        public Criteria andTransstatusIsNull() {
            addCriterion("TRANSSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andTransstatusIsNotNull() {
            addCriterion("TRANSSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTransstatusEqualTo(String value) {
            addCriterion("TRANSSTATUS =", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotEqualTo(String value) {
            addCriterion("TRANSSTATUS <>", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThan(String value) {
            addCriterion("TRANSSTATUS >", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSSTATUS >=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThan(String value) {
            addCriterion("TRANSSTATUS <", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThanOrEqualTo(String value) {
            addCriterion("TRANSSTATUS <=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLike(String value) {
            addCriterion("TRANSSTATUS like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotLike(String value) {
            addCriterion("TRANSSTATUS not like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusIn(List<String> values) {
            addCriterion("TRANSSTATUS in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotIn(List<String> values) {
            addCriterion("TRANSSTATUS not in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusBetween(String value1, String value2) {
            addCriterion("TRANSSTATUS between", value1, value2, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotBetween(String value1, String value2) {
            addCriterion("TRANSSTATUS not between", value1, value2, "transstatus");
            return (Criteria) this;
        }

        public Criteria andCcfkrqIsNull() {
            addCriterion("CCFKRQ is null");
            return (Criteria) this;
        }

        public Criteria andCcfkrqIsNotNull() {
            addCriterion("CCFKRQ is not null");
            return (Criteria) this;
        }

        public Criteria andCcfkrqEqualTo(Date value) {
            addCriterion("CCFKRQ =", value, "ccfkrq");
            return (Criteria) this;
        }

        public Criteria andCcfkrqNotEqualTo(Date value) {
            addCriterion("CCFKRQ <>", value, "ccfkrq");
            return (Criteria) this;
        }

        public Criteria andCcfkrqGreaterThan(Date value) {
            addCriterion("CCFKRQ >", value, "ccfkrq");
            return (Criteria) this;
        }

        public Criteria andCcfkrqGreaterThanOrEqualTo(Date value) {
            addCriterion("CCFKRQ >=", value, "ccfkrq");
            return (Criteria) this;
        }

        public Criteria andCcfkrqLessThan(Date value) {
            addCriterion("CCFKRQ <", value, "ccfkrq");
            return (Criteria) this;
        }

        public Criteria andCcfkrqLessThanOrEqualTo(Date value) {
            addCriterion("CCFKRQ <=", value, "ccfkrq");
            return (Criteria) this;
        }

        public Criteria andCcfkrqIn(List<Date> values) {
            addCriterion("CCFKRQ in", values, "ccfkrq");
            return (Criteria) this;
        }

        public Criteria andCcfkrqNotIn(List<Date> values) {
            addCriterion("CCFKRQ not in", values, "ccfkrq");
            return (Criteria) this;
        }

        public Criteria andCcfkrqBetween(Date value1, Date value2) {
            addCriterion("CCFKRQ between", value1, value2, "ccfkrq");
            return (Criteria) this;
        }

        public Criteria andCcfkrqNotBetween(Date value1, Date value2) {
            addCriterion("CCFKRQ not between", value1, value2, "ccfkrq");
            return (Criteria) this;
        }

        public Criteria andAjstatusIsNull() {
            addCriterion("AJSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAjstatusIsNotNull() {
            addCriterion("AJSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAjstatusEqualTo(String value) {
            addCriterion("AJSTATUS =", value, "ajstatus");
            return (Criteria) this;
        }

        public Criteria andAjstatusNotEqualTo(String value) {
            addCriterion("AJSTATUS <>", value, "ajstatus");
            return (Criteria) this;
        }

        public Criteria andAjstatusGreaterThan(String value) {
            addCriterion("AJSTATUS >", value, "ajstatus");
            return (Criteria) this;
        }

        public Criteria andAjstatusGreaterThanOrEqualTo(String value) {
            addCriterion("AJSTATUS >=", value, "ajstatus");
            return (Criteria) this;
        }

        public Criteria andAjstatusLessThan(String value) {
            addCriterion("AJSTATUS <", value, "ajstatus");
            return (Criteria) this;
        }

        public Criteria andAjstatusLessThanOrEqualTo(String value) {
            addCriterion("AJSTATUS <=", value, "ajstatus");
            return (Criteria) this;
        }

        public Criteria andAjstatusLike(String value) {
            addCriterion("AJSTATUS like", value, "ajstatus");
            return (Criteria) this;
        }

        public Criteria andAjstatusNotLike(String value) {
            addCriterion("AJSTATUS not like", value, "ajstatus");
            return (Criteria) this;
        }

        public Criteria andAjstatusIn(List<String> values) {
            addCriterion("AJSTATUS in", values, "ajstatus");
            return (Criteria) this;
        }

        public Criteria andAjstatusNotIn(List<String> values) {
            addCriterion("AJSTATUS not in", values, "ajstatus");
            return (Criteria) this;
        }

        public Criteria andAjstatusBetween(String value1, String value2) {
            addCriterion("AJSTATUS between", value1, value2, "ajstatus");
            return (Criteria) this;
        }

        public Criteria andAjstatusNotBetween(String value1, String value2) {
            addCriterion("AJSTATUS not between", value1, value2, "ajstatus");
            return (Criteria) this;
        }

        public Criteria andInvalidCallIsNull() {
            addCriterion("INVALID_CALL is null");
            return (Criteria) this;
        }

        public Criteria andInvalidCallIsNotNull() {
            addCriterion("INVALID_CALL is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidCallEqualTo(String value) {
            addCriterion("INVALID_CALL =", value, "invalidCall");
            return (Criteria) this;
        }

        public Criteria andInvalidCallNotEqualTo(String value) {
            addCriterion("INVALID_CALL <>", value, "invalidCall");
            return (Criteria) this;
        }

        public Criteria andInvalidCallGreaterThan(String value) {
            addCriterion("INVALID_CALL >", value, "invalidCall");
            return (Criteria) this;
        }

        public Criteria andInvalidCallGreaterThanOrEqualTo(String value) {
            addCriterion("INVALID_CALL >=", value, "invalidCall");
            return (Criteria) this;
        }

        public Criteria andInvalidCallLessThan(String value) {
            addCriterion("INVALID_CALL <", value, "invalidCall");
            return (Criteria) this;
        }

        public Criteria andInvalidCallLessThanOrEqualTo(String value) {
            addCriterion("INVALID_CALL <=", value, "invalidCall");
            return (Criteria) this;
        }

        public Criteria andInvalidCallLike(String value) {
            addCriterion("INVALID_CALL like", value, "invalidCall");
            return (Criteria) this;
        }

        public Criteria andInvalidCallNotLike(String value) {
            addCriterion("INVALID_CALL not like", value, "invalidCall");
            return (Criteria) this;
        }

        public Criteria andInvalidCallIn(List<String> values) {
            addCriterion("INVALID_CALL in", values, "invalidCall");
            return (Criteria) this;
        }

        public Criteria andInvalidCallNotIn(List<String> values) {
            addCriterion("INVALID_CALL not in", values, "invalidCall");
            return (Criteria) this;
        }

        public Criteria andInvalidCallBetween(String value1, String value2) {
            addCriterion("INVALID_CALL between", value1, value2, "invalidCall");
            return (Criteria) this;
        }

        public Criteria andInvalidCallNotBetween(String value1, String value2) {
            addCriterion("INVALID_CALL not between", value1, value2, "invalidCall");
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

        public Criteria andOpeorgIsNull() {
            addCriterion("OPEORG is null");
            return (Criteria) this;
        }

        public Criteria andOpeorgIsNotNull() {
            addCriterion("OPEORG is not null");
            return (Criteria) this;
        }

        public Criteria andOpeorgEqualTo(String value) {
            addCriterion("OPEORG =", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgNotEqualTo(String value) {
            addCriterion("OPEORG <>", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgGreaterThan(String value) {
            addCriterion("OPEORG >", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgGreaterThanOrEqualTo(String value) {
            addCriterion("OPEORG >=", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgLessThan(String value) {
            addCriterion("OPEORG <", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgLessThanOrEqualTo(String value) {
            addCriterion("OPEORG <=", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgLike(String value) {
            addCriterion("OPEORG like", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgNotLike(String value) {
            addCriterion("OPEORG not like", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgIn(List<String> values) {
            addCriterion("OPEORG in", values, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgNotIn(List<String> values) {
            addCriterion("OPEORG not in", values, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgBetween(String value1, String value2) {
            addCriterion("OPEORG between", value1, value2, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgNotBetween(String value1, String value2) {
            addCriterion("OPEORG not between", value1, value2, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpedepIsNull() {
            addCriterion("OPEDEP is null");
            return (Criteria) this;
        }

        public Criteria andOpedepIsNotNull() {
            addCriterion("OPEDEP is not null");
            return (Criteria) this;
        }

        public Criteria andOpedepEqualTo(String value) {
            addCriterion("OPEDEP =", value, "opedep");
            return (Criteria) this;
        }

        public Criteria andOpedepNotEqualTo(String value) {
            addCriterion("OPEDEP <>", value, "opedep");
            return (Criteria) this;
        }

        public Criteria andOpedepGreaterThan(String value) {
            addCriterion("OPEDEP >", value, "opedep");
            return (Criteria) this;
        }

        public Criteria andOpedepGreaterThanOrEqualTo(String value) {
            addCriterion("OPEDEP >=", value, "opedep");
            return (Criteria) this;
        }

        public Criteria andOpedepLessThan(String value) {
            addCriterion("OPEDEP <", value, "opedep");
            return (Criteria) this;
        }

        public Criteria andOpedepLessThanOrEqualTo(String value) {
            addCriterion("OPEDEP <=", value, "opedep");
            return (Criteria) this;
        }

        public Criteria andOpedepLike(String value) {
            addCriterion("OPEDEP like", value, "opedep");
            return (Criteria) this;
        }

        public Criteria andOpedepNotLike(String value) {
            addCriterion("OPEDEP not like", value, "opedep");
            return (Criteria) this;
        }

        public Criteria andOpedepIn(List<String> values) {
            addCriterion("OPEDEP in", values, "opedep");
            return (Criteria) this;
        }

        public Criteria andOpedepNotIn(List<String> values) {
            addCriterion("OPEDEP not in", values, "opedep");
            return (Criteria) this;
        }

        public Criteria andOpedepBetween(String value1, String value2) {
            addCriterion("OPEDEP between", value1, value2, "opedep");
            return (Criteria) this;
        }

        public Criteria andOpedepNotBetween(String value1, String value2) {
            addCriterion("OPEDEP not between", value1, value2, "opedep");
            return (Criteria) this;
        }

        public Criteria andBjsjIsNull() {
            addCriterion("BJSJ is null");
            return (Criteria) this;
        }

        public Criteria andBjsjIsNotNull() {
            addCriterion("BJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andBjsjEqualTo(Date value) {
            addCriterion("BJSJ =", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotEqualTo(Date value) {
            addCriterion("BJSJ <>", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjGreaterThan(Date value) {
            addCriterion("BJSJ >", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("BJSJ >=", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjLessThan(Date value) {
            addCriterion("BJSJ <", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjLessThanOrEqualTo(Date value) {
            addCriterion("BJSJ <=", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjIn(List<Date> values) {
            addCriterion("BJSJ in", values, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotIn(List<Date> values) {
            addCriterion("BJSJ not in", values, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjBetween(Date value1, Date value2) {
            addCriterion("BJSJ between", value1, value2, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotBetween(Date value1, Date value2) {
            addCriterion("BJSJ not between", value1, value2, "bjsj");
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