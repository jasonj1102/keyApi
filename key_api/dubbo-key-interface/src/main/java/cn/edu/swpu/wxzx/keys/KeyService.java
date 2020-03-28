package cn.edu.swpu.wxzx.keys;


import java.util.Map;

public interface KeyService {


    public String getPublicKeyAndN();    //获取公钥对

    public Map<String,String> getPrivateKeyAndN();   //获取私钥对

    public String encode(String data,String public_key);      //加密

    public String decode(String data,String private_key,String public_key);      //解密
}
