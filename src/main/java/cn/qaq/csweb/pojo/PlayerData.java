package cn.qaq.csweb.pojo;

public class PlayerData extends PlayerDataKey {
    private Integer uid;

    private String steamId;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSteamId() {
        return steamId;
    }

    public void setSteamId(String steamId) {
        this.steamId = steamId == null ? null : steamId.trim();
    }
    private String playerId;

    private Integer vip;

    private Integer viptl;

    private Integer vipyear;

    private Integer killplayer;

    private Integer deadplayer;

    private Integer assistplayer;

    private Integer currentpoints;

    private Integer allpoints;

    private Integer chenghao;

    private String chenghaoname;

    private Integer number;

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId == null ? null : playerId.trim();
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Integer getViptl() {
        return viptl;
    }

    public void setViptl(Integer viptl) {
        this.viptl = viptl;
    }

    public Integer getVipyear() {
        return vipyear;
    }

    public void setVipyear(Integer vipyear) {
        this.vipyear = vipyear;
    }

    public Integer getKillplayer() {
        return killplayer;
    }

    public void setKillplayer(Integer killplayer) {
        this.killplayer = killplayer;
    }

    public Integer getDeadplayer() {
        return deadplayer;
    }

    public void setDeadplayer(Integer deadplayer) {
        this.deadplayer = deadplayer;
    }

    public Integer getAssistplayer() {
        return assistplayer;
    }

    public void setAssistplayer(Integer assistplayer) {
        this.assistplayer = assistplayer;
    }

    public Integer getCurrentpoints() {
        return currentpoints;
    }

    public void setCurrentpoints(Integer currentpoints) {
        this.currentpoints = currentpoints;
    }

    public Integer getAllpoints() {
        return allpoints;
    }

    public void setAllpoints(Integer allpoints) {
        this.allpoints = allpoints;
    }

    public Integer getChenghao() {
        return chenghao;
    }

    public void setChenghao(Integer chenghao) {
        this.chenghao = chenghao;
    }

    public String getChenghaoname() {
        return chenghaoname;
    }

    public void setChenghaoname(String chenghaoname) {
        this.chenghaoname = chenghaoname == null ? null : chenghaoname.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}