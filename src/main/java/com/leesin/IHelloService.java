package com.leesin;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/3/30 7:57
 * @version: ${VERSION}
 * @modified By:
 */
public interface IHelloService  {
    String sayHello(String content);

    //保存用户
    String saveUser(User user);
}
