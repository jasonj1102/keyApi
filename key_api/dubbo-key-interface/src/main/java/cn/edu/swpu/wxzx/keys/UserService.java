package cn.edu.swpu.wxzx.keys;

import java.util.Map;

public interface UserService {

    String insert(String username);      //插入用户信息,返回p*q

    String decode(String username,String data,String public_key);    //用户在数据库中拿私钥，解密后返回明文

    String getMax(String username,String data1,String data2,String  public_key);   //返回较大值

    String getMin(String username,String data1,String data2,String  public_key);   //返回较小值

}
