package com.rainbow.common.service.impl;

import com.rainbow.common.enums.SerialNoEnum;
import com.rainbow.common.service.SerialNoService;
import com.rainbow.util.DateUtil;
import com.rainbow.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 序列号生成实现类
 * author  dengjie9527
 * date 2019/9/17
 */
@Service
public class SerialNoServiceImpl implements SerialNoService {

    private static final String SERIAL_PREFIX = "SERIAL_NUMBER_PREFIX";

    private static final int DEFAULT_LENGTH = 6;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public String generateSerialNo(SerialNoEnum serialNoEnum) {

        //判断是否需要日期
        String date = "";
        if (serialNoEnum.isIncludeDate()){
            date = DateUtil.dateToString(new Date());
        }

        String key = new StringBuilder(SERIAL_PREFIX)
                .append(date)
                .append(serialNoEnum.getPrefix())
                .toString();

        //若key 不存在，则从0开始自增
        long serialNum = redisUtil.incr(key, 1);


        return new StringBuilder(serialNoEnum.getPrefix())
                .append(date)
                .append(getSequence(serialNum, serialNoEnum.getNumber())).toString();
    }

    //自动补位
    private String getSequence(long seq,int length){
        String str = String.valueOf(seq);

        int len = str.length();

        //默认6位
        if (length == 0){
            length = DEFAULT_LENGTH;
        }

        if (len >= length){
            return str;
        }

        int rest = length -len;

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < rest; i++) {
            sb.append("0");
        }
        sb.append(str);

        return sb.toString();
    }
}
