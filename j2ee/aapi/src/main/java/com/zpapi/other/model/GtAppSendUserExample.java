package com.zpapi.other.model;

import java.util.ArrayList;
import java.util.List;

public class GtAppSendUserExample {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	protected String orderByClause;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	protected boolean distinct;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	public GtAppSendUserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
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

		public Criteria andModelIsNull() {
			addCriterion("model is null");
			return (Criteria) this;
		}

		public Criteria andModelIsNotNull() {
			addCriterion("model is not null");
			return (Criteria) this;
		}

		public Criteria andModelEqualTo(String value) {
			addCriterion("model =", value, "model");
			return (Criteria) this;
		}

		public Criteria andModelNotEqualTo(String value) {
			addCriterion("model <>", value, "model");
			return (Criteria) this;
		}

		public Criteria andModelGreaterThan(String value) {
			addCriterion("model >", value, "model");
			return (Criteria) this;
		}

		public Criteria andModelGreaterThanOrEqualTo(String value) {
			addCriterion("model >=", value, "model");
			return (Criteria) this;
		}

		public Criteria andModelLessThan(String value) {
			addCriterion("model <", value, "model");
			return (Criteria) this;
		}

		public Criteria andModelLessThanOrEqualTo(String value) {
			addCriterion("model <=", value, "model");
			return (Criteria) this;
		}

		public Criteria andModelLike(String value) {
			addCriterion("model like", value, "model");
			return (Criteria) this;
		}

		public Criteria andModelNotLike(String value) {
			addCriterion("model not like", value, "model");
			return (Criteria) this;
		}

		public Criteria andModelIn(List<String> values) {
			addCriterion("model in", values, "model");
			return (Criteria) this;
		}

		public Criteria andModelNotIn(List<String> values) {
			addCriterion("model not in", values, "model");
			return (Criteria) this;
		}

		public Criteria andModelBetween(String value1, String value2) {
			addCriterion("model between", value1, value2, "model");
			return (Criteria) this;
		}

		public Criteria andModelNotBetween(String value1, String value2) {
			addCriterion("model not between", value1, value2, "model");
			return (Criteria) this;
		}

		public Criteria andUIdIsNull() {
			addCriterion("u_id is null");
			return (Criteria) this;
		}

		public Criteria andUIdIsNotNull() {
			addCriterion("u_id is not null");
			return (Criteria) this;
		}

		public Criteria andUIdEqualTo(Integer value) {
			addCriterion("u_id =", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdNotEqualTo(Integer value) {
			addCriterion("u_id <>", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdGreaterThan(Integer value) {
			addCriterion("u_id >", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("u_id >=", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdLessThan(Integer value) {
			addCriterion("u_id <", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdLessThanOrEqualTo(Integer value) {
			addCriterion("u_id <=", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdIn(List<Integer> values) {
			addCriterion("u_id in", values, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdNotIn(List<Integer> values) {
			addCriterion("u_id not in", values, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdBetween(Integer value1, Integer value2) {
			addCriterion("u_id between", value1, value2, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdNotBetween(Integer value1, Integer value2) {
			addCriterion("u_id not between", value1, value2, "uId");
			return (Criteria) this;
		}

		public Criteria andApptypeIsNull() {
			addCriterion("apptype is null");
			return (Criteria) this;
		}

		public Criteria andApptypeIsNotNull() {
			addCriterion("apptype is not null");
			return (Criteria) this;
		}

		public Criteria andApptypeEqualTo(Boolean value) {
			addCriterion("apptype =", value, "apptype");
			return (Criteria) this;
		}

		public Criteria andApptypeNotEqualTo(Boolean value) {
			addCriterion("apptype <>", value, "apptype");
			return (Criteria) this;
		}

		public Criteria andApptypeGreaterThan(Boolean value) {
			addCriterion("apptype >", value, "apptype");
			return (Criteria) this;
		}

		public Criteria andApptypeGreaterThanOrEqualTo(Boolean value) {
			addCriterion("apptype >=", value, "apptype");
			return (Criteria) this;
		}

		public Criteria andApptypeLessThan(Boolean value) {
			addCriterion("apptype <", value, "apptype");
			return (Criteria) this;
		}

		public Criteria andApptypeLessThanOrEqualTo(Boolean value) {
			addCriterion("apptype <=", value, "apptype");
			return (Criteria) this;
		}

		public Criteria andApptypeIn(List<Boolean> values) {
			addCriterion("apptype in", values, "apptype");
			return (Criteria) this;
		}

		public Criteria andApptypeNotIn(List<Boolean> values) {
			addCriterion("apptype not in", values, "apptype");
			return (Criteria) this;
		}

		public Criteria andApptypeBetween(Boolean value1, Boolean value2) {
			addCriterion("apptype between", value1, value2, "apptype");
			return (Criteria) this;
		}

		public Criteria andApptypeNotBetween(Boolean value1, Boolean value2) {
			addCriterion("apptype not between", value1, value2, "apptype");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table gt_app_send_user
	 *
	 * @mbggenerated do_not_delete_during_merge Fri Apr 01 20:16:56 CST 2016
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
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