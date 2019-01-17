package cn.qaq.csweb.service;

import cn.qaq.csweb.mapper.PlayerDataMapper;
import cn.qaq.csweb.pojo.PlayerData;
import cn.qaq.csweb.utils.Json;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerDataMapper dao;

    @Transactional(readOnly = true)
    public Json getDataById(String steamId)
    {
        Json json=new Json();
        try {
            json.setJsonObject(JSONObject.fromObject(dao.selectBySteamID(steamId)));
            json.setSuccess(true);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            json.setMsg_title("失败");
            json.setMsg(e.getLocalizedMessage());
            json.setSuccess(false);
        }
        return json;
    }
    @Transactional(readOnly = true)
    public Json getDataByName(String name,String order,String desc,Integer currnt,Integer limit)
    {
        Json json=new Json();
        try {
            json.setJsonArray(
                    JSONArray.fromObject(dao.selectByName(name,order,desc,(currnt-1)*limit,limit)));
            json.setRows(dao.countByName(name));
            json.setSuccess(true);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            json.setMsg_title("失败");
            json.setMsg(e.getLocalizedMessage());
            json.setSuccess(false);
        }
        return json;
    }
    @Transactional(readOnly = true)
    public Json getAllData(String order,String desc,Integer currnt,Integer limit)
    {
        Json json=new Json();
        try {
            json.setRows(dao.countAll());
            json.setJsonArray(
                    JSONArray.fromObject(
                      dao.selectAll(order,desc,(currnt-1)*limit,limit)
                    ));
            json.setSuccess(true);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            json.setMsg_title("失败");
            json.setMsg(e.getLocalizedMessage());
            json.setSuccess(false);
        }
        return json;
    }
}
