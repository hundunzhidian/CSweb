package cn.qaq.csweb.mapper;

import cn.qaq.csweb.pojo.PlayerData;
import cn.qaq.csweb.pojo.PlayerDataExample;
import cn.qaq.csweb.pojo.PlayerDataKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlayerDataMapper {
    PlayerData selectBySteamID(String id);
    List<PlayerData> selectByName(@Param("name") String name ,@Param("order") String order ,@Param("desc") String desc,@Param("offset") Integer offset, @Param("limit") Integer limit);
    List<PlayerData> selectAll(@Param("order") String order ,@Param("desc") String desc,@Param("offset") Integer offset, @Param("limit") Integer limit);
    int countAll();
    Integer countByName(String name);
}