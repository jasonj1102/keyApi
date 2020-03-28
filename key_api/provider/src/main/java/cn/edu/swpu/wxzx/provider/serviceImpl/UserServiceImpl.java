package cn.edu.swpu.wxzx.provider.serviceImpl;

import cn.edu.swpu.wxzx.provider.mapper.UserMapper;
import cn.edu.swpu.wxzx.provider.model.User;
import org.apache.dubbo.config.annotation.Service;
import cn.edu.swpu.wxzx.keys.KeyService;
import cn.edu.swpu.wxzx.keys.UserService;

import javax.annotation.Resource;
import java.math.BigInteger;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService{

    @Resource
    UserMapper userMapper;

    @Resource
    KeyService keyService;

    /**
     *  插入用户信息
     * @param username
     * @return public_key
     */
    public String insert(String username) {
            User user=new User();
            user.setUsername(username);
            user.setPrivate_key(keyService.getPrivateKeyAndN().get("d"));
            user.setPublic_key(keyService.getPublicKeyAndN());
            userMapper.insert(user);
            return user.getPublic_key();
    }

    /**
     *  用户解密
     * @param username
     * @param data
     * @param public_key
     * @return decode(明文)
     */
    public String decode(String username, String data,String public_key) {
        String private_key=userMapper.findPrivateKey(username,public_key);
        return keyService.decode(data,private_key,public_key);
    }

    /**
     * 取较大值
     * @param username
     * @param data1
     * @param data2
     * @param public_key
     * @return max(较大值)
     */
    public String getMax(String username,String data1, String data2,String  public_key) {
        String private_key=userMapper.findPrivateKey(username, public_key);
        BigInteger a=new BigInteger(keyService.decode(data1,private_key, public_key));
        BigInteger b=new BigInteger(keyService.decode(data2,private_key, public_key));
        return keyService.encode(a.max(b).toString(), public_key);
    }

    /**
     * 取较小值
     * @param username
     * @param data1
     * @param data2
     * @param public_key
     * @return min(较小值)
     */
    public String getMin(String username,String data1, String data2,String public_key) {
        String private_key=userMapper.findPrivateKey(username, public_key);
        BigInteger a=new BigInteger(keyService.decode(data1,private_key, public_key));
        BigInteger b=new BigInteger(keyService.decode(data2,private_key, public_key));
        return  keyService.encode(a.min(b).toString(), public_key);
    }

}
