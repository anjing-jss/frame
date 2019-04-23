package org.frame.service.impl;


import javax.annotation.Resource;  
  



import org.frame.dao.UserInfoMapper;
import org.frame.entity.UserInfo;
import org.frame.service.IUserService;
import org.springframework.stereotype.Service;  
  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserInfoMapper userDao;  
    @Override  
    public UserInfo getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  
