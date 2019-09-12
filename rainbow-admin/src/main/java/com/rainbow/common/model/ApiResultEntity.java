package com.rainbow.common.model;

import com.rainbow.common.request.ResponseHolder;
import com.rainbow.enums.ResultCodeEnum;
import com.rainbow.util.MDCUtil;
import com.rainbow.util.SpringContextUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.ObjectUtils;

/**
 * 接口调用结果通用类
 * author  DENGJIE9527
 * date 2019/7/29
 */
@Data
@ApiModel
public class ApiResultEntity<T> {

    @ApiModelProperty(value = "调用链路ID")
    private String traceId;

    @ApiModelProperty(value = "响应码")
    private String code;

    @ApiModelProperty(value = "响应信息")
    private String msg;

    @ApiModelProperty(value = "响应数据")
    private T data;

    public static final class Builder{




        private String code;
        private String msg;
        private Object data;

        private Builder(){
        }

        public static Builder init(){
            return new Builder();
        }

        public Builder withCode(String code){
            this.code = code;
            return this;
        }

        public Builder successWithData(Object data){
            this.code = ResultCodeEnum.SUCCESS.getCode();
            this.msg = ResultCodeEnum.SUCCESS.getMsg();
            this.data = data;
            return this;
        }

        public Builder success(){
            this.code = ResultCodeEnum.SUCCESS.getCode();
            this.msg = ResultCodeEnum.SUCCESS.getMsg();
            return this;
        }

        public Builder error(ResultCodeEnum resultCode){
            this.code = ResultCodeEnum.SUCCESS.getCode();
            this.msg = ResultCodeEnum.SUCCESS.getMsg();
            return this;
        }

        public Builder withMsg(String msg){
            this.msg = msg;
            return this;
        }

        public Builder withData(Object data){
            this.data = data;
            return this;
        }


        private String initThreadNumber(){
            return MDCUtil.get();
        }

        public ApiResultEntity bulid(){
            ApiResultEntity apiResultEntity = new ApiResultEntity();

            apiResultEntity.code = this.code;
            apiResultEntity.msg = this.msg;
            apiResultEntity.data = this.data;

            apiResultEntity.traceId = initThreadNumber();
            ResponseHolder responseHolder = SpringContextUtil.getBeen(ResponseHolder.class);
            System.out.println(responseHolder);
            if (!ObjectUtils.isEmpty(responseHolder)){
                responseHolder.setApiResultEntity(apiResultEntity);
            }
            return apiResultEntity;
        }
    }
}
