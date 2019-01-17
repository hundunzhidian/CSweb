package cn.qaq.csweb.pojo;

import java.util.ArrayList;
import java.util.List;

public class PlayerDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayerDataExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andSteamIdIsNull() {
            addCriterion("steam_id is null");
            return (Criteria) this;
        }

        public Criteria andSteamIdIsNotNull() {
            addCriterion("steam_id is not null");
            return (Criteria) this;
        }

        public Criteria andSteamIdEqualTo(String value) {
            addCriterion("steam_id =", value, "steamId");
            return (Criteria) this;
        }

        public Criteria andSteamIdNotEqualTo(String value) {
            addCriterion("steam_id <>", value, "steamId");
            return (Criteria) this;
        }

        public Criteria andSteamIdGreaterThan(String value) {
            addCriterion("steam_id >", value, "steamId");
            return (Criteria) this;
        }

        public Criteria andSteamIdGreaterThanOrEqualTo(String value) {
            addCriterion("steam_id >=", value, "steamId");
            return (Criteria) this;
        }

        public Criteria andSteamIdLessThan(String value) {
            addCriterion("steam_id <", value, "steamId");
            return (Criteria) this;
        }

        public Criteria andSteamIdLessThanOrEqualTo(String value) {
            addCriterion("steam_id <=", value, "steamId");
            return (Criteria) this;
        }

        public Criteria andSteamIdLike(String value) {
            addCriterion("steam_id like", value, "steamId");
            return (Criteria) this;
        }

        public Criteria andSteamIdNotLike(String value) {
            addCriterion("steam_id not like", value, "steamId");
            return (Criteria) this;
        }

        public Criteria andSteamIdIn(List<String> values) {
            addCriterion("steam_id in", values, "steamId");
            return (Criteria) this;
        }

        public Criteria andSteamIdNotIn(List<String> values) {
            addCriterion("steam_id not in", values, "steamId");
            return (Criteria) this;
        }

        public Criteria andSteamIdBetween(String value1, String value2) {
            addCriterion("steam_id between", value1, value2, "steamId");
            return (Criteria) this;
        }

        public Criteria andSteamIdNotBetween(String value1, String value2) {
            addCriterion("steam_id not between", value1, value2, "steamId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNull() {
            addCriterion("player_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNotNull() {
            addCriterion("player_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdEqualTo(String value) {
            addCriterion("player_id =", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotEqualTo(String value) {
            addCriterion("player_id <>", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThan(String value) {
            addCriterion("player_id >", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThanOrEqualTo(String value) {
            addCriterion("player_id >=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThan(String value) {
            addCriterion("player_id <", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThanOrEqualTo(String value) {
            addCriterion("player_id <=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLike(String value) {
            addCriterion("player_id like", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotLike(String value) {
            addCriterion("player_id not like", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIn(List<String> values) {
            addCriterion("player_id in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotIn(List<String> values) {
            addCriterion("player_id not in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdBetween(String value1, String value2) {
            addCriterion("player_id between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotBetween(String value1, String value2) {
            addCriterion("player_id not between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andVipIsNull() {
            addCriterion("VIP is null");
            return (Criteria) this;
        }

        public Criteria andVipIsNotNull() {
            addCriterion("VIP is not null");
            return (Criteria) this;
        }

        public Criteria andVipEqualTo(Integer value) {
            addCriterion("VIP =", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotEqualTo(Integer value) {
            addCriterion("VIP <>", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThan(Integer value) {
            addCriterion("VIP >", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIP >=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThan(Integer value) {
            addCriterion("VIP <", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThanOrEqualTo(Integer value) {
            addCriterion("VIP <=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipIn(List<Integer> values) {
            addCriterion("VIP in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotIn(List<Integer> values) {
            addCriterion("VIP not in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipBetween(Integer value1, Integer value2) {
            addCriterion("VIP between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotBetween(Integer value1, Integer value2) {
            addCriterion("VIP not between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andViptlIsNull() {
            addCriterion("VIPTL is null");
            return (Criteria) this;
        }

        public Criteria andViptlIsNotNull() {
            addCriterion("VIPTL is not null");
            return (Criteria) this;
        }

        public Criteria andViptlEqualTo(Integer value) {
            addCriterion("VIPTL =", value, "viptl");
            return (Criteria) this;
        }

        public Criteria andViptlNotEqualTo(Integer value) {
            addCriterion("VIPTL <>", value, "viptl");
            return (Criteria) this;
        }

        public Criteria andViptlGreaterThan(Integer value) {
            addCriterion("VIPTL >", value, "viptl");
            return (Criteria) this;
        }

        public Criteria andViptlGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIPTL >=", value, "viptl");
            return (Criteria) this;
        }

        public Criteria andViptlLessThan(Integer value) {
            addCriterion("VIPTL <", value, "viptl");
            return (Criteria) this;
        }

        public Criteria andViptlLessThanOrEqualTo(Integer value) {
            addCriterion("VIPTL <=", value, "viptl");
            return (Criteria) this;
        }

        public Criteria andViptlIn(List<Integer> values) {
            addCriterion("VIPTL in", values, "viptl");
            return (Criteria) this;
        }

        public Criteria andViptlNotIn(List<Integer> values) {
            addCriterion("VIPTL not in", values, "viptl");
            return (Criteria) this;
        }

        public Criteria andViptlBetween(Integer value1, Integer value2) {
            addCriterion("VIPTL between", value1, value2, "viptl");
            return (Criteria) this;
        }

        public Criteria andViptlNotBetween(Integer value1, Integer value2) {
            addCriterion("VIPTL not between", value1, value2, "viptl");
            return (Criteria) this;
        }

        public Criteria andVipyearIsNull() {
            addCriterion("VIPYEAR is null");
            return (Criteria) this;
        }

        public Criteria andVipyearIsNotNull() {
            addCriterion("VIPYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andVipyearEqualTo(Integer value) {
            addCriterion("VIPYEAR =", value, "vipyear");
            return (Criteria) this;
        }

        public Criteria andVipyearNotEqualTo(Integer value) {
            addCriterion("VIPYEAR <>", value, "vipyear");
            return (Criteria) this;
        }

        public Criteria andVipyearGreaterThan(Integer value) {
            addCriterion("VIPYEAR >", value, "vipyear");
            return (Criteria) this;
        }

        public Criteria andVipyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIPYEAR >=", value, "vipyear");
            return (Criteria) this;
        }

        public Criteria andVipyearLessThan(Integer value) {
            addCriterion("VIPYEAR <", value, "vipyear");
            return (Criteria) this;
        }

        public Criteria andVipyearLessThanOrEqualTo(Integer value) {
            addCriterion("VIPYEAR <=", value, "vipyear");
            return (Criteria) this;
        }

        public Criteria andVipyearIn(List<Integer> values) {
            addCriterion("VIPYEAR in", values, "vipyear");
            return (Criteria) this;
        }

        public Criteria andVipyearNotIn(List<Integer> values) {
            addCriterion("VIPYEAR not in", values, "vipyear");
            return (Criteria) this;
        }

        public Criteria andVipyearBetween(Integer value1, Integer value2) {
            addCriterion("VIPYEAR between", value1, value2, "vipyear");
            return (Criteria) this;
        }

        public Criteria andVipyearNotBetween(Integer value1, Integer value2) {
            addCriterion("VIPYEAR not between", value1, value2, "vipyear");
            return (Criteria) this;
        }

        public Criteria andKillplayerIsNull() {
            addCriterion("killplayer is null");
            return (Criteria) this;
        }

        public Criteria andKillplayerIsNotNull() {
            addCriterion("killplayer is not null");
            return (Criteria) this;
        }

        public Criteria andKillplayerEqualTo(Integer value) {
            addCriterion("killplayer =", value, "killplayer");
            return (Criteria) this;
        }

        public Criteria andKillplayerNotEqualTo(Integer value) {
            addCriterion("killplayer <>", value, "killplayer");
            return (Criteria) this;
        }

        public Criteria andKillplayerGreaterThan(Integer value) {
            addCriterion("killplayer >", value, "killplayer");
            return (Criteria) this;
        }

        public Criteria andKillplayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("killplayer >=", value, "killplayer");
            return (Criteria) this;
        }

        public Criteria andKillplayerLessThan(Integer value) {
            addCriterion("killplayer <", value, "killplayer");
            return (Criteria) this;
        }

        public Criteria andKillplayerLessThanOrEqualTo(Integer value) {
            addCriterion("killplayer <=", value, "killplayer");
            return (Criteria) this;
        }

        public Criteria andKillplayerIn(List<Integer> values) {
            addCriterion("killplayer in", values, "killplayer");
            return (Criteria) this;
        }

        public Criteria andKillplayerNotIn(List<Integer> values) {
            addCriterion("killplayer not in", values, "killplayer");
            return (Criteria) this;
        }

        public Criteria andKillplayerBetween(Integer value1, Integer value2) {
            addCriterion("killplayer between", value1, value2, "killplayer");
            return (Criteria) this;
        }

        public Criteria andKillplayerNotBetween(Integer value1, Integer value2) {
            addCriterion("killplayer not between", value1, value2, "killplayer");
            return (Criteria) this;
        }

        public Criteria andDeadplayerIsNull() {
            addCriterion("deadplayer is null");
            return (Criteria) this;
        }

        public Criteria andDeadplayerIsNotNull() {
            addCriterion("deadplayer is not null");
            return (Criteria) this;
        }

        public Criteria andDeadplayerEqualTo(Integer value) {
            addCriterion("deadplayer =", value, "deadplayer");
            return (Criteria) this;
        }

        public Criteria andDeadplayerNotEqualTo(Integer value) {
            addCriterion("deadplayer <>", value, "deadplayer");
            return (Criteria) this;
        }

        public Criteria andDeadplayerGreaterThan(Integer value) {
            addCriterion("deadplayer >", value, "deadplayer");
            return (Criteria) this;
        }

        public Criteria andDeadplayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("deadplayer >=", value, "deadplayer");
            return (Criteria) this;
        }

        public Criteria andDeadplayerLessThan(Integer value) {
            addCriterion("deadplayer <", value, "deadplayer");
            return (Criteria) this;
        }

        public Criteria andDeadplayerLessThanOrEqualTo(Integer value) {
            addCriterion("deadplayer <=", value, "deadplayer");
            return (Criteria) this;
        }

        public Criteria andDeadplayerIn(List<Integer> values) {
            addCriterion("deadplayer in", values, "deadplayer");
            return (Criteria) this;
        }

        public Criteria andDeadplayerNotIn(List<Integer> values) {
            addCriterion("deadplayer not in", values, "deadplayer");
            return (Criteria) this;
        }

        public Criteria andDeadplayerBetween(Integer value1, Integer value2) {
            addCriterion("deadplayer between", value1, value2, "deadplayer");
            return (Criteria) this;
        }

        public Criteria andDeadplayerNotBetween(Integer value1, Integer value2) {
            addCriterion("deadplayer not between", value1, value2, "deadplayer");
            return (Criteria) this;
        }

        public Criteria andAssistplayerIsNull() {
            addCriterion("assistplayer is null");
            return (Criteria) this;
        }

        public Criteria andAssistplayerIsNotNull() {
            addCriterion("assistplayer is not null");
            return (Criteria) this;
        }

        public Criteria andAssistplayerEqualTo(Integer value) {
            addCriterion("assistplayer =", value, "assistplayer");
            return (Criteria) this;
        }

        public Criteria andAssistplayerNotEqualTo(Integer value) {
            addCriterion("assistplayer <>", value, "assistplayer");
            return (Criteria) this;
        }

        public Criteria andAssistplayerGreaterThan(Integer value) {
            addCriterion("assistplayer >", value, "assistplayer");
            return (Criteria) this;
        }

        public Criteria andAssistplayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("assistplayer >=", value, "assistplayer");
            return (Criteria) this;
        }

        public Criteria andAssistplayerLessThan(Integer value) {
            addCriterion("assistplayer <", value, "assistplayer");
            return (Criteria) this;
        }

        public Criteria andAssistplayerLessThanOrEqualTo(Integer value) {
            addCriterion("assistplayer <=", value, "assistplayer");
            return (Criteria) this;
        }

        public Criteria andAssistplayerIn(List<Integer> values) {
            addCriterion("assistplayer in", values, "assistplayer");
            return (Criteria) this;
        }

        public Criteria andAssistplayerNotIn(List<Integer> values) {
            addCriterion("assistplayer not in", values, "assistplayer");
            return (Criteria) this;
        }

        public Criteria andAssistplayerBetween(Integer value1, Integer value2) {
            addCriterion("assistplayer between", value1, value2, "assistplayer");
            return (Criteria) this;
        }

        public Criteria andAssistplayerNotBetween(Integer value1, Integer value2) {
            addCriterion("assistplayer not between", value1, value2, "assistplayer");
            return (Criteria) this;
        }

        public Criteria andCurrentpointsIsNull() {
            addCriterion("currentpoints is null");
            return (Criteria) this;
        }

        public Criteria andCurrentpointsIsNotNull() {
            addCriterion("currentpoints is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentpointsEqualTo(Integer value) {
            addCriterion("currentpoints =", value, "currentpoints");
            return (Criteria) this;
        }

        public Criteria andCurrentpointsNotEqualTo(Integer value) {
            addCriterion("currentpoints <>", value, "currentpoints");
            return (Criteria) this;
        }

        public Criteria andCurrentpointsGreaterThan(Integer value) {
            addCriterion("currentpoints >", value, "currentpoints");
            return (Criteria) this;
        }

        public Criteria andCurrentpointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("currentpoints >=", value, "currentpoints");
            return (Criteria) this;
        }

        public Criteria andCurrentpointsLessThan(Integer value) {
            addCriterion("currentpoints <", value, "currentpoints");
            return (Criteria) this;
        }

        public Criteria andCurrentpointsLessThanOrEqualTo(Integer value) {
            addCriterion("currentpoints <=", value, "currentpoints");
            return (Criteria) this;
        }

        public Criteria andCurrentpointsIn(List<Integer> values) {
            addCriterion("currentpoints in", values, "currentpoints");
            return (Criteria) this;
        }

        public Criteria andCurrentpointsNotIn(List<Integer> values) {
            addCriterion("currentpoints not in", values, "currentpoints");
            return (Criteria) this;
        }

        public Criteria andCurrentpointsBetween(Integer value1, Integer value2) {
            addCriterion("currentpoints between", value1, value2, "currentpoints");
            return (Criteria) this;
        }

        public Criteria andCurrentpointsNotBetween(Integer value1, Integer value2) {
            addCriterion("currentpoints not between", value1, value2, "currentpoints");
            return (Criteria) this;
        }

        public Criteria andAllpointsIsNull() {
            addCriterion("allpoints is null");
            return (Criteria) this;
        }

        public Criteria andAllpointsIsNotNull() {
            addCriterion("allpoints is not null");
            return (Criteria) this;
        }

        public Criteria andAllpointsEqualTo(Integer value) {
            addCriterion("allpoints =", value, "allpoints");
            return (Criteria) this;
        }

        public Criteria andAllpointsNotEqualTo(Integer value) {
            addCriterion("allpoints <>", value, "allpoints");
            return (Criteria) this;
        }

        public Criteria andAllpointsGreaterThan(Integer value) {
            addCriterion("allpoints >", value, "allpoints");
            return (Criteria) this;
        }

        public Criteria andAllpointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("allpoints >=", value, "allpoints");
            return (Criteria) this;
        }

        public Criteria andAllpointsLessThan(Integer value) {
            addCriterion("allpoints <", value, "allpoints");
            return (Criteria) this;
        }

        public Criteria andAllpointsLessThanOrEqualTo(Integer value) {
            addCriterion("allpoints <=", value, "allpoints");
            return (Criteria) this;
        }

        public Criteria andAllpointsIn(List<Integer> values) {
            addCriterion("allpoints in", values, "allpoints");
            return (Criteria) this;
        }

        public Criteria andAllpointsNotIn(List<Integer> values) {
            addCriterion("allpoints not in", values, "allpoints");
            return (Criteria) this;
        }

        public Criteria andAllpointsBetween(Integer value1, Integer value2) {
            addCriterion("allpoints between", value1, value2, "allpoints");
            return (Criteria) this;
        }

        public Criteria andAllpointsNotBetween(Integer value1, Integer value2) {
            addCriterion("allpoints not between", value1, value2, "allpoints");
            return (Criteria) this;
        }

        public Criteria andChenghaoIsNull() {
            addCriterion("chenghao is null");
            return (Criteria) this;
        }

        public Criteria andChenghaoIsNotNull() {
            addCriterion("chenghao is not null");
            return (Criteria) this;
        }

        public Criteria andChenghaoEqualTo(Integer value) {
            addCriterion("chenghao =", value, "chenghao");
            return (Criteria) this;
        }

        public Criteria andChenghaoNotEqualTo(Integer value) {
            addCriterion("chenghao <>", value, "chenghao");
            return (Criteria) this;
        }

        public Criteria andChenghaoGreaterThan(Integer value) {
            addCriterion("chenghao >", value, "chenghao");
            return (Criteria) this;
        }

        public Criteria andChenghaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("chenghao >=", value, "chenghao");
            return (Criteria) this;
        }

        public Criteria andChenghaoLessThan(Integer value) {
            addCriterion("chenghao <", value, "chenghao");
            return (Criteria) this;
        }

        public Criteria andChenghaoLessThanOrEqualTo(Integer value) {
            addCriterion("chenghao <=", value, "chenghao");
            return (Criteria) this;
        }

        public Criteria andChenghaoIn(List<Integer> values) {
            addCriterion("chenghao in", values, "chenghao");
            return (Criteria) this;
        }

        public Criteria andChenghaoNotIn(List<Integer> values) {
            addCriterion("chenghao not in", values, "chenghao");
            return (Criteria) this;
        }

        public Criteria andChenghaoBetween(Integer value1, Integer value2) {
            addCriterion("chenghao between", value1, value2, "chenghao");
            return (Criteria) this;
        }

        public Criteria andChenghaoNotBetween(Integer value1, Integer value2) {
            addCriterion("chenghao not between", value1, value2, "chenghao");
            return (Criteria) this;
        }

        public Criteria andChenghaonameIsNull() {
            addCriterion("chenghaoname is null");
            return (Criteria) this;
        }

        public Criteria andChenghaonameIsNotNull() {
            addCriterion("chenghaoname is not null");
            return (Criteria) this;
        }

        public Criteria andChenghaonameEqualTo(String value) {
            addCriterion("chenghaoname =", value, "chenghaoname");
            return (Criteria) this;
        }

        public Criteria andChenghaonameNotEqualTo(String value) {
            addCriterion("chenghaoname <>", value, "chenghaoname");
            return (Criteria) this;
        }

        public Criteria andChenghaonameGreaterThan(String value) {
            addCriterion("chenghaoname >", value, "chenghaoname");
            return (Criteria) this;
        }

        public Criteria andChenghaonameGreaterThanOrEqualTo(String value) {
            addCriterion("chenghaoname >=", value, "chenghaoname");
            return (Criteria) this;
        }

        public Criteria andChenghaonameLessThan(String value) {
            addCriterion("chenghaoname <", value, "chenghaoname");
            return (Criteria) this;
        }

        public Criteria andChenghaonameLessThanOrEqualTo(String value) {
            addCriterion("chenghaoname <=", value, "chenghaoname");
            return (Criteria) this;
        }

        public Criteria andChenghaonameLike(String value) {
            addCriterion("chenghaoname like", value, "chenghaoname");
            return (Criteria) this;
        }

        public Criteria andChenghaonameNotLike(String value) {
            addCriterion("chenghaoname not like", value, "chenghaoname");
            return (Criteria) this;
        }

        public Criteria andChenghaonameIn(List<String> values) {
            addCriterion("chenghaoname in", values, "chenghaoname");
            return (Criteria) this;
        }

        public Criteria andChenghaonameNotIn(List<String> values) {
            addCriterion("chenghaoname not in", values, "chenghaoname");
            return (Criteria) this;
        }

        public Criteria andChenghaonameBetween(String value1, String value2) {
            addCriterion("chenghaoname between", value1, value2, "chenghaoname");
            return (Criteria) this;
        }

        public Criteria andChenghaonameNotBetween(String value1, String value2) {
            addCriterion("chenghaoname not between", value1, value2, "chenghaoname");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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