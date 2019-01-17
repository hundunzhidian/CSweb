package cn.qaq.csweb.pojo;

public class PlayerDataKey {
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
}