/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Person
 * Author:   cz
 * Date:     2019/3/1 16:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.directfinance.vo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author cz
 * @create 2019/3/1
 * @since 1.0.0
 */
public class Person {
   public String name;
    public  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
