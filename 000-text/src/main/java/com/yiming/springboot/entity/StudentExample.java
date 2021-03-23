package com.yiming.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria and学号IsNull() {
            addCriterion("学号 is null");
            return (Criteria) this;
        }

        public Criteria and学号IsNotNull() {
            addCriterion("学号 is not null");
            return (Criteria) this;
        }

        public Criteria and学号EqualTo(String value) {
            addCriterion("学号 =", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号NotEqualTo(String value) {
            addCriterion("学号 <>", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号GreaterThan(String value) {
            addCriterion("学号 >", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号GreaterThanOrEqualTo(String value) {
            addCriterion("学号 >=", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号LessThan(String value) {
            addCriterion("学号 <", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号LessThanOrEqualTo(String value) {
            addCriterion("学号 <=", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号Like(String value) {
            addCriterion("学号 like", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号NotLike(String value) {
            addCriterion("学号 not like", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号In(List<String> values) {
            addCriterion("学号 in", values, "学号");
            return (Criteria) this;
        }

        public Criteria and学号NotIn(List<String> values) {
            addCriterion("学号 not in", values, "学号");
            return (Criteria) this;
        }

        public Criteria and学号Between(String value1, String value2) {
            addCriterion("学号 between", value1, value2, "学号");
            return (Criteria) this;
        }

        public Criteria and学号NotBetween(String value1, String value2) {
            addCriterion("学号 not between", value1, value2, "学号");
            return (Criteria) this;
        }

        public Criteria and姓名IsNull() {
            addCriterion("姓名 is null");
            return (Criteria) this;
        }

        public Criteria and姓名IsNotNull() {
            addCriterion("姓名 is not null");
            return (Criteria) this;
        }

        public Criteria and姓名EqualTo(String value) {
            addCriterion("姓名 =", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotEqualTo(String value) {
            addCriterion("姓名 <>", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名GreaterThan(String value) {
            addCriterion("姓名 >", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名GreaterThanOrEqualTo(String value) {
            addCriterion("姓名 >=", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名LessThan(String value) {
            addCriterion("姓名 <", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名LessThanOrEqualTo(String value) {
            addCriterion("姓名 <=", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名Like(String value) {
            addCriterion("姓名 like", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotLike(String value) {
            addCriterion("姓名 not like", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名In(List<String> values) {
            addCriterion("姓名 in", values, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotIn(List<String> values) {
            addCriterion("姓名 not in", values, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名Between(String value1, String value2) {
            addCriterion("姓名 between", value1, value2, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotBetween(String value1, String value2) {
            addCriterion("姓名 not between", value1, value2, "姓名");
            return (Criteria) this;
        }

        public Criteria and语文成绩IsNull() {
            addCriterion("语文成绩 is null");
            return (Criteria) this;
        }

        public Criteria and语文成绩IsNotNull() {
            addCriterion("语文成绩 is not null");
            return (Criteria) this;
        }

        public Criteria and语文成绩EqualTo(String value) {
            addCriterion("语文成绩 =", value, "语文成绩");
            return (Criteria) this;
        }

        public Criteria and语文成绩NotEqualTo(String value) {
            addCriterion("语文成绩 <>", value, "语文成绩");
            return (Criteria) this;
        }

        public Criteria and语文成绩GreaterThan(String value) {
            addCriterion("语文成绩 >", value, "语文成绩");
            return (Criteria) this;
        }

        public Criteria and语文成绩GreaterThanOrEqualTo(String value) {
            addCriterion("语文成绩 >=", value, "语文成绩");
            return (Criteria) this;
        }

        public Criteria and语文成绩LessThan(String value) {
            addCriterion("语文成绩 <", value, "语文成绩");
            return (Criteria) this;
        }

        public Criteria and语文成绩LessThanOrEqualTo(String value) {
            addCriterion("语文成绩 <=", value, "语文成绩");
            return (Criteria) this;
        }

        public Criteria and语文成绩Like(String value) {
            addCriterion("语文成绩 like", value, "语文成绩");
            return (Criteria) this;
        }

        public Criteria and语文成绩NotLike(String value) {
            addCriterion("语文成绩 not like", value, "语文成绩");
            return (Criteria) this;
        }

        public Criteria and语文成绩In(List<String> values) {
            addCriterion("语文成绩 in", values, "语文成绩");
            return (Criteria) this;
        }

        public Criteria and语文成绩NotIn(List<String> values) {
            addCriterion("语文成绩 not in", values, "语文成绩");
            return (Criteria) this;
        }

        public Criteria and语文成绩Between(String value1, String value2) {
            addCriterion("语文成绩 between", value1, value2, "语文成绩");
            return (Criteria) this;
        }

        public Criteria and语文成绩NotBetween(String value1, String value2) {
            addCriterion("语文成绩 not between", value1, value2, "语文成绩");
            return (Criteria) this;
        }

        public Criteria and数学成绩IsNull() {
            addCriterion("数学成绩 is null");
            return (Criteria) this;
        }

        public Criteria and数学成绩IsNotNull() {
            addCriterion("数学成绩 is not null");
            return (Criteria) this;
        }

        public Criteria and数学成绩EqualTo(String value) {
            addCriterion("数学成绩 =", value, "数学成绩");
            return (Criteria) this;
        }

        public Criteria and数学成绩NotEqualTo(String value) {
            addCriterion("数学成绩 <>", value, "数学成绩");
            return (Criteria) this;
        }

        public Criteria and数学成绩GreaterThan(String value) {
            addCriterion("数学成绩 >", value, "数学成绩");
            return (Criteria) this;
        }

        public Criteria and数学成绩GreaterThanOrEqualTo(String value) {
            addCriterion("数学成绩 >=", value, "数学成绩");
            return (Criteria) this;
        }

        public Criteria and数学成绩LessThan(String value) {
            addCriterion("数学成绩 <", value, "数学成绩");
            return (Criteria) this;
        }

        public Criteria and数学成绩LessThanOrEqualTo(String value) {
            addCriterion("数学成绩 <=", value, "数学成绩");
            return (Criteria) this;
        }

        public Criteria and数学成绩Like(String value) {
            addCriterion("数学成绩 like", value, "数学成绩");
            return (Criteria) this;
        }

        public Criteria and数学成绩NotLike(String value) {
            addCriterion("数学成绩 not like", value, "数学成绩");
            return (Criteria) this;
        }

        public Criteria and数学成绩In(List<String> values) {
            addCriterion("数学成绩 in", values, "数学成绩");
            return (Criteria) this;
        }

        public Criteria and数学成绩NotIn(List<String> values) {
            addCriterion("数学成绩 not in", values, "数学成绩");
            return (Criteria) this;
        }

        public Criteria and数学成绩Between(String value1, String value2) {
            addCriterion("数学成绩 between", value1, value2, "数学成绩");
            return (Criteria) this;
        }

        public Criteria and数学成绩NotBetween(String value1, String value2) {
            addCriterion("数学成绩 not between", value1, value2, "数学成绩");
            return (Criteria) this;
        }

        public Criteria and英语成绩IsNull() {
            addCriterion("英语成绩 is null");
            return (Criteria) this;
        }

        public Criteria and英语成绩IsNotNull() {
            addCriterion("英语成绩 is not null");
            return (Criteria) this;
        }

        public Criteria and英语成绩EqualTo(String value) {
            addCriterion("英语成绩 =", value, "英语成绩");
            return (Criteria) this;
        }

        public Criteria and英语成绩NotEqualTo(String value) {
            addCriterion("英语成绩 <>", value, "英语成绩");
            return (Criteria) this;
        }

        public Criteria and英语成绩GreaterThan(String value) {
            addCriterion("英语成绩 >", value, "英语成绩");
            return (Criteria) this;
        }

        public Criteria and英语成绩GreaterThanOrEqualTo(String value) {
            addCriterion("英语成绩 >=", value, "英语成绩");
            return (Criteria) this;
        }

        public Criteria and英语成绩LessThan(String value) {
            addCriterion("英语成绩 <", value, "英语成绩");
            return (Criteria) this;
        }

        public Criteria and英语成绩LessThanOrEqualTo(String value) {
            addCriterion("英语成绩 <=", value, "英语成绩");
            return (Criteria) this;
        }

        public Criteria and英语成绩Like(String value) {
            addCriterion("英语成绩 like", value, "英语成绩");
            return (Criteria) this;
        }

        public Criteria and英语成绩NotLike(String value) {
            addCriterion("英语成绩 not like", value, "英语成绩");
            return (Criteria) this;
        }

        public Criteria and英语成绩In(List<String> values) {
            addCriterion("英语成绩 in", values, "英语成绩");
            return (Criteria) this;
        }

        public Criteria and英语成绩NotIn(List<String> values) {
            addCriterion("英语成绩 not in", values, "英语成绩");
            return (Criteria) this;
        }

        public Criteria and英语成绩Between(String value1, String value2) {
            addCriterion("英语成绩 between", value1, value2, "英语成绩");
            return (Criteria) this;
        }

        public Criteria and英语成绩NotBetween(String value1, String value2) {
            addCriterion("英语成绩 not between", value1, value2, "英语成绩");
            return (Criteria) this;
        }

        public Criteria and物理成绩IsNull() {
            addCriterion("物理成绩 is null");
            return (Criteria) this;
        }

        public Criteria and物理成绩IsNotNull() {
            addCriterion("物理成绩 is not null");
            return (Criteria) this;
        }

        public Criteria and物理成绩EqualTo(String value) {
            addCriterion("物理成绩 =", value, "物理成绩");
            return (Criteria) this;
        }

        public Criteria and物理成绩NotEqualTo(String value) {
            addCriterion("物理成绩 <>", value, "物理成绩");
            return (Criteria) this;
        }

        public Criteria and物理成绩GreaterThan(String value) {
            addCriterion("物理成绩 >", value, "物理成绩");
            return (Criteria) this;
        }

        public Criteria and物理成绩GreaterThanOrEqualTo(String value) {
            addCriterion("物理成绩 >=", value, "物理成绩");
            return (Criteria) this;
        }

        public Criteria and物理成绩LessThan(String value) {
            addCriterion("物理成绩 <", value, "物理成绩");
            return (Criteria) this;
        }

        public Criteria and物理成绩LessThanOrEqualTo(String value) {
            addCriterion("物理成绩 <=", value, "物理成绩");
            return (Criteria) this;
        }

        public Criteria and物理成绩Like(String value) {
            addCriterion("物理成绩 like", value, "物理成绩");
            return (Criteria) this;
        }

        public Criteria and物理成绩NotLike(String value) {
            addCriterion("物理成绩 not like", value, "物理成绩");
            return (Criteria) this;
        }

        public Criteria and物理成绩In(List<String> values) {
            addCriterion("物理成绩 in", values, "物理成绩");
            return (Criteria) this;
        }

        public Criteria and物理成绩NotIn(List<String> values) {
            addCriterion("物理成绩 not in", values, "物理成绩");
            return (Criteria) this;
        }

        public Criteria and物理成绩Between(String value1, String value2) {
            addCriterion("物理成绩 between", value1, value2, "物理成绩");
            return (Criteria) this;
        }

        public Criteria and物理成绩NotBetween(String value1, String value2) {
            addCriterion("物理成绩 not between", value1, value2, "物理成绩");
            return (Criteria) this;
        }

        public Criteria and化学成绩IsNull() {
            addCriterion("化学成绩 is null");
            return (Criteria) this;
        }

        public Criteria and化学成绩IsNotNull() {
            addCriterion("化学成绩 is not null");
            return (Criteria) this;
        }

        public Criteria and化学成绩EqualTo(String value) {
            addCriterion("化学成绩 =", value, "化学成绩");
            return (Criteria) this;
        }

        public Criteria and化学成绩NotEqualTo(String value) {
            addCriterion("化学成绩 <>", value, "化学成绩");
            return (Criteria) this;
        }

        public Criteria and化学成绩GreaterThan(String value) {
            addCriterion("化学成绩 >", value, "化学成绩");
            return (Criteria) this;
        }

        public Criteria and化学成绩GreaterThanOrEqualTo(String value) {
            addCriterion("化学成绩 >=", value, "化学成绩");
            return (Criteria) this;
        }

        public Criteria and化学成绩LessThan(String value) {
            addCriterion("化学成绩 <", value, "化学成绩");
            return (Criteria) this;
        }

        public Criteria and化学成绩LessThanOrEqualTo(String value) {
            addCriterion("化学成绩 <=", value, "化学成绩");
            return (Criteria) this;
        }

        public Criteria and化学成绩Like(String value) {
            addCriterion("化学成绩 like", value, "化学成绩");
            return (Criteria) this;
        }

        public Criteria and化学成绩NotLike(String value) {
            addCriterion("化学成绩 not like", value, "化学成绩");
            return (Criteria) this;
        }

        public Criteria and化学成绩In(List<String> values) {
            addCriterion("化学成绩 in", values, "化学成绩");
            return (Criteria) this;
        }

        public Criteria and化学成绩NotIn(List<String> values) {
            addCriterion("化学成绩 not in", values, "化学成绩");
            return (Criteria) this;
        }

        public Criteria and化学成绩Between(String value1, String value2) {
            addCriterion("化学成绩 between", value1, value2, "化学成绩");
            return (Criteria) this;
        }

        public Criteria and化学成绩NotBetween(String value1, String value2) {
            addCriterion("化学成绩 not between", value1, value2, "化学成绩");
            return (Criteria) this;
        }

        public Criteria and生物成绩IsNull() {
            addCriterion("生物成绩 is null");
            return (Criteria) this;
        }

        public Criteria and生物成绩IsNotNull() {
            addCriterion("生物成绩 is not null");
            return (Criteria) this;
        }

        public Criteria and生物成绩EqualTo(String value) {
            addCriterion("生物成绩 =", value, "生物成绩");
            return (Criteria) this;
        }

        public Criteria and生物成绩NotEqualTo(String value) {
            addCriterion("生物成绩 <>", value, "生物成绩");
            return (Criteria) this;
        }

        public Criteria and生物成绩GreaterThan(String value) {
            addCriterion("生物成绩 >", value, "生物成绩");
            return (Criteria) this;
        }

        public Criteria and生物成绩GreaterThanOrEqualTo(String value) {
            addCriterion("生物成绩 >=", value, "生物成绩");
            return (Criteria) this;
        }

        public Criteria and生物成绩LessThan(String value) {
            addCriterion("生物成绩 <", value, "生物成绩");
            return (Criteria) this;
        }

        public Criteria and生物成绩LessThanOrEqualTo(String value) {
            addCriterion("生物成绩 <=", value, "生物成绩");
            return (Criteria) this;
        }

        public Criteria and生物成绩Like(String value) {
            addCriterion("生物成绩 like", value, "生物成绩");
            return (Criteria) this;
        }

        public Criteria and生物成绩NotLike(String value) {
            addCriterion("生物成绩 not like", value, "生物成绩");
            return (Criteria) this;
        }

        public Criteria and生物成绩In(List<String> values) {
            addCriterion("生物成绩 in", values, "生物成绩");
            return (Criteria) this;
        }

        public Criteria and生物成绩NotIn(List<String> values) {
            addCriterion("生物成绩 not in", values, "生物成绩");
            return (Criteria) this;
        }

        public Criteria and生物成绩Between(String value1, String value2) {
            addCriterion("生物成绩 between", value1, value2, "生物成绩");
            return (Criteria) this;
        }

        public Criteria and生物成绩NotBetween(String value1, String value2) {
            addCriterion("生物成绩 not between", value1, value2, "生物成绩");
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