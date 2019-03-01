/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: hello
 * Author:   cz
 * Date:     2019/3/1 15:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.directfinance.controller;

import cn.directfinance.vo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author cz
 * @create 2019/3/1
 * @since 1.0.0
 */
@RestController
public class hello {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public HashMap<String , String> hash() {
        HashMap<String,String> map =  new HashMap<String,String>();
        HashMap<String,String> map1 =  new HashMap<String,String>();
        Person per = new Person();
        map.put("sy","sy");
        return map;
    }
}
