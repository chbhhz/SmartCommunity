package com.smartcommunity.pojo;

import java.util.ArrayList;
import java.util.List;

public class DecorateExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public DecorateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIsNull() {
            addCriterion("roomnumber is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIsNotNull() {
            addCriterion("roomnumber is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumberEqualTo(String value) {
            addCriterion("roomnumber =", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotEqualTo(String value) {
            addCriterion("roomnumber <>", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberGreaterThan(String value) {
            addCriterion("roomnumber >", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberGreaterThanOrEqualTo(String value) {
            addCriterion("roomnumber >=", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLessThan(String value) {
            addCriterion("roomnumber <", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLessThanOrEqualTo(String value) {
            addCriterion("roomnumber <=", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLike(String value) {
            addCriterion("roomnumber like", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotLike(String value) {
            addCriterion("roomnumber not like", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIn(List<String> values) {
            addCriterion("roomnumber in", values, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotIn(List<String> values) {
            addCriterion("roomnumber not in", values, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberBetween(String value1, String value2) {
            addCriterion("roomnumber between", value1, value2, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotBetween(String value1, String value2) {
            addCriterion("roomnumber not between", value1, value2, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNull() {
            addCriterion("ownername is null");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNotNull() {
            addCriterion("ownername is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernameEqualTo(String value) {
            addCriterion("ownername =", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotEqualTo(String value) {
            addCriterion("ownername <>", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThan(String value) {
            addCriterion("ownername >", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThanOrEqualTo(String value) {
            addCriterion("ownername >=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThan(String value) {
            addCriterion("ownername <", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThanOrEqualTo(String value) {
            addCriterion("ownername <=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLike(String value) {
            addCriterion("ownername like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotLike(String value) {
            addCriterion("ownername not like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameIn(List<String> values) {
            addCriterion("ownername in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotIn(List<String> values) {
            addCriterion("ownername not in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameBetween(String value1, String value2) {
            addCriterion("ownername between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotBetween(String value1, String value2) {
            addCriterion("ownername not between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andIsjianzhuangIsNull() {
            addCriterion("isjianzhuang is null");
            return (Criteria) this;
        }

        public Criteria andIsjianzhuangIsNotNull() {
            addCriterion("isjianzhuang is not null");
            return (Criteria) this;
        }

        public Criteria andIsjianzhuangEqualTo(Boolean value) {
            addCriterion("isjianzhuang =", value, "isjianzhuang");
            return (Criteria) this;
        }

        public Criteria andIsjianzhuangNotEqualTo(Boolean value) {
            addCriterion("isjianzhuang <>", value, "isjianzhuang");
            return (Criteria) this;
        }

        public Criteria andIsjianzhuangGreaterThan(Boolean value) {
            addCriterion("isjianzhuang >", value, "isjianzhuang");
            return (Criteria) this;
        }

        public Criteria andIsjianzhuangGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isjianzhuang >=", value, "isjianzhuang");
            return (Criteria) this;
        }

        public Criteria andIsjianzhuangLessThan(Boolean value) {
            addCriterion("isjianzhuang <", value, "isjianzhuang");
            return (Criteria) this;
        }

        public Criteria andIsjianzhuangLessThanOrEqualTo(Boolean value) {
            addCriterion("isjianzhuang <=", value, "isjianzhuang");
            return (Criteria) this;
        }

        public Criteria andIsjianzhuangIn(List<Boolean> values) {
            addCriterion("isjianzhuang in", values, "isjianzhuang");
            return (Criteria) this;
        }

        public Criteria andIsjianzhuangNotIn(List<Boolean> values) {
            addCriterion("isjianzhuang not in", values, "isjianzhuang");
            return (Criteria) this;
        }

        public Criteria andIsjianzhuangBetween(Boolean value1, Boolean value2) {
            addCriterion("isjianzhuang between", value1, value2, "isjianzhuang");
            return (Criteria) this;
        }

        public Criteria andIsjianzhuangNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isjianzhuang not between", value1, value2, "isjianzhuang");
            return (Criteria) this;
        }

        public Criteria andHasdecprotocolIsNull() {
            addCriterion("hasdecprotocol is null");
            return (Criteria) this;
        }

        public Criteria andHasdecprotocolIsNotNull() {
            addCriterion("hasdecprotocol is not null");
            return (Criteria) this;
        }

        public Criteria andHasdecprotocolEqualTo(Boolean value) {
            addCriterion("hasdecprotocol =", value, "hasdecprotocol");
            return (Criteria) this;
        }

        public Criteria andHasdecprotocolNotEqualTo(Boolean value) {
            addCriterion("hasdecprotocol <>", value, "hasdecprotocol");
            return (Criteria) this;
        }

        public Criteria andHasdecprotocolGreaterThan(Boolean value) {
            addCriterion("hasdecprotocol >", value, "hasdecprotocol");
            return (Criteria) this;
        }

        public Criteria andHasdecprotocolGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasdecprotocol >=", value, "hasdecprotocol");
            return (Criteria) this;
        }

        public Criteria andHasdecprotocolLessThan(Boolean value) {
            addCriterion("hasdecprotocol <", value, "hasdecprotocol");
            return (Criteria) this;
        }

        public Criteria andHasdecprotocolLessThanOrEqualTo(Boolean value) {
            addCriterion("hasdecprotocol <=", value, "hasdecprotocol");
            return (Criteria) this;
        }

        public Criteria andHasdecprotocolIn(List<Boolean> values) {
            addCriterion("hasdecprotocol in", values, "hasdecprotocol");
            return (Criteria) this;
        }

        public Criteria andHasdecprotocolNotIn(List<Boolean> values) {
            addCriterion("hasdecprotocol not in", values, "hasdecprotocol");
            return (Criteria) this;
        }

        public Criteria andHasdecprotocolBetween(Boolean value1, Boolean value2) {
            addCriterion("hasdecprotocol between", value1, value2, "hasdecprotocol");
            return (Criteria) this;
        }

        public Criteria andHasdecprotocolNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasdecprotocol not between", value1, value2, "hasdecprotocol");
            return (Criteria) this;
        }

        public Criteria andHasdecformIsNull() {
            addCriterion("hasdecform is null");
            return (Criteria) this;
        }

        public Criteria andHasdecformIsNotNull() {
            addCriterion("hasdecform is not null");
            return (Criteria) this;
        }

        public Criteria andHasdecformEqualTo(Boolean value) {
            addCriterion("hasdecform =", value, "hasdecform");
            return (Criteria) this;
        }

        public Criteria andHasdecformNotEqualTo(Boolean value) {
            addCriterion("hasdecform <>", value, "hasdecform");
            return (Criteria) this;
        }

        public Criteria andHasdecformGreaterThan(Boolean value) {
            addCriterion("hasdecform >", value, "hasdecform");
            return (Criteria) this;
        }

        public Criteria andHasdecformGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasdecform >=", value, "hasdecform");
            return (Criteria) this;
        }

        public Criteria andHasdecformLessThan(Boolean value) {
            addCriterion("hasdecform <", value, "hasdecform");
            return (Criteria) this;
        }

        public Criteria andHasdecformLessThanOrEqualTo(Boolean value) {
            addCriterion("hasdecform <=", value, "hasdecform");
            return (Criteria) this;
        }

        public Criteria andHasdecformIn(List<Boolean> values) {
            addCriterion("hasdecform in", values, "hasdecform");
            return (Criteria) this;
        }

        public Criteria andHasdecformNotIn(List<Boolean> values) {
            addCriterion("hasdecform not in", values, "hasdecform");
            return (Criteria) this;
        }

        public Criteria andHasdecformBetween(Boolean value1, Boolean value2) {
            addCriterion("hasdecform between", value1, value2, "hasdecform");
            return (Criteria) this;
        }

        public Criteria andHasdecformNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasdecform not between", value1, value2, "hasdecform");
            return (Criteria) this;
        }

        public Criteria andHasdeclicenceIsNull() {
            addCriterion("hasdeclicence is null");
            return (Criteria) this;
        }

        public Criteria andHasdeclicenceIsNotNull() {
            addCriterion("hasdeclicence is not null");
            return (Criteria) this;
        }

        public Criteria andHasdeclicenceEqualTo(Boolean value) {
            addCriterion("hasdeclicence =", value, "hasdeclicence");
            return (Criteria) this;
        }

        public Criteria andHasdeclicenceNotEqualTo(Boolean value) {
            addCriterion("hasdeclicence <>", value, "hasdeclicence");
            return (Criteria) this;
        }

        public Criteria andHasdeclicenceGreaterThan(Boolean value) {
            addCriterion("hasdeclicence >", value, "hasdeclicence");
            return (Criteria) this;
        }

        public Criteria andHasdeclicenceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasdeclicence >=", value, "hasdeclicence");
            return (Criteria) this;
        }

        public Criteria andHasdeclicenceLessThan(Boolean value) {
            addCriterion("hasdeclicence <", value, "hasdeclicence");
            return (Criteria) this;
        }

        public Criteria andHasdeclicenceLessThanOrEqualTo(Boolean value) {
            addCriterion("hasdeclicence <=", value, "hasdeclicence");
            return (Criteria) this;
        }

        public Criteria andHasdeclicenceIn(List<Boolean> values) {
            addCriterion("hasdeclicence in", values, "hasdeclicence");
            return (Criteria) this;
        }

        public Criteria andHasdeclicenceNotIn(List<Boolean> values) {
            addCriterion("hasdeclicence not in", values, "hasdeclicence");
            return (Criteria) this;
        }

        public Criteria andHasdeclicenceBetween(Boolean value1, Boolean value2) {
            addCriterion("hasdeclicence between", value1, value2, "hasdeclicence");
            return (Criteria) this;
        }

        public Criteria andHasdeclicenceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasdeclicence not between", value1, value2, "hasdeclicence");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andIscompleteIsNull() {
            addCriterion("iscomplete is null");
            return (Criteria) this;
        }

        public Criteria andIscompleteIsNotNull() {
            addCriterion("iscomplete is not null");
            return (Criteria) this;
        }

        public Criteria andIscompleteEqualTo(Boolean value) {
            addCriterion("iscomplete =", value, "iscomplete");
            return (Criteria) this;
        }

        public Criteria andIscompleteNotEqualTo(Boolean value) {
            addCriterion("iscomplete <>", value, "iscomplete");
            return (Criteria) this;
        }

        public Criteria andIscompleteGreaterThan(Boolean value) {
            addCriterion("iscomplete >", value, "iscomplete");
            return (Criteria) this;
        }

        public Criteria andIscompleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("iscomplete >=", value, "iscomplete");
            return (Criteria) this;
        }

        public Criteria andIscompleteLessThan(Boolean value) {
            addCriterion("iscomplete <", value, "iscomplete");
            return (Criteria) this;
        }

        public Criteria andIscompleteLessThanOrEqualTo(Boolean value) {
            addCriterion("iscomplete <=", value, "iscomplete");
            return (Criteria) this;
        }

        public Criteria andIscompleteIn(List<Boolean> values) {
            addCriterion("iscomplete in", values, "iscomplete");
            return (Criteria) this;
        }

        public Criteria andIscompleteNotIn(List<Boolean> values) {
            addCriterion("iscomplete not in", values, "iscomplete");
            return (Criteria) this;
        }

        public Criteria andIscompleteBetween(Boolean value1, Boolean value2) {
            addCriterion("iscomplete between", value1, value2, "iscomplete");
            return (Criteria) this;
        }

        public Criteria andIscompleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("iscomplete not between", value1, value2, "iscomplete");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table decorate
     *
     * @mbggenerated do_not_delete_during_merge Tue Jan 20 13:50:49 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
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