package cn.edu.swpu.wxzx.provider.serviceImpl;

import cn.edu.swpu.wxzx.provider.model.RSA;
import io.swagger.annotations.Api;
import org.apache.dubbo.config.annotation.Service;
import cn.edu.swpu.wxzx.keys.KeyService;

import java.util.Map;

@Api(tags = "密钥服务")
@Service(version = "1.0.0")
public class KeyServiceImpl implements KeyService {

    /**
     * 初始化算法类对象
     */
    private RSA rsa=new RSA();

    /**
     * 得到公钥
     * @return public_key
     */
    public String getPublicKeyAndN() {
        return rsa.getPublicKeyAndN();
    }

    /**
     * 得到私钥
     * @return private_key
     */
    public Map<String,String> getPrivateKeyAndN() {
        return rsa.getPrivateKeyAndN();
    }

    /**
     * 加密算法
     * @param data
     * @param public_key
     * @return encode(密文)
     */
    public String encode(String data,String public_key) {
        return rsa.encrypt(data,public_key);
    }

    /**
     * 解密算法
     * @param data
     * @param private_key
     * @param public_key
     * @return decode(明文)
     */
    public String decode(String data,String private_key,String public_key) {
        return rsa.decrypt(data,private_key,public_key);
    }

}
