package cn.qaq.csweb.controller;

import cn.qaq.csweb.service.PlayerService;
import cn.qaq.csweb.utils.Json;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService service;

    private static final Logger logger = Logger.getLogger(PlayerController.class);
    @RequestMapping(value = "/steamid/{steamid}", method = RequestMethod.GET)
    @ResponseBody
    public Json getDataByID(@PathVariable("steamid") String steamId)
    {
        return service.getDataById(steamId);
    }
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Json getDataByName(@PathVariable("name") String name,@RequestParam(value="order" ,required =false ) String order,@RequestParam(value="desc",required =false ) String desc ,@RequestParam(value="page" ,required =false ) Integer page,@RequestParam(value="limit" ,required =false ) Integer limit)
    {
        logger.debug(name);
        return service.getDataByName(name,order,desc,page,limit);
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public Json getAllData(@RequestParam(value="order" ,required =false ) String order,@RequestParam(value="desc" ,required =false ) String desc,@RequestParam(value="page" ,required =false ) Integer page,@RequestParam(value="limit" ,required =false ) Integer limit)
    {
        logger.debug(order+" "+desc+page+limit);
        return service.getAllData(order,desc,page,limit);
    }
}
