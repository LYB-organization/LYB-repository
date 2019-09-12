package com.rainbow.model.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class RequestRecordInfo implements Serializable {

    private static final long serialVersionUID = 1566461022811L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String serialNo;

    /**
    * 
    * isNullAble:1
    */
    private String traceId;

    /**
    * 
    * isNullAble:1
    */
    private String requestPath;

    /**
    * 
    * isNullAble:1
    */
    private String requestMethod;

    /**
    * 
    * isNullAble:1
    */
    private Long spendTime;

    /**
    * 
    * isNullAble:1
    */
    private String status;

    /**
    * 
    * isNullAble:1
    */
    private String remark;

    /**
    * 
    * isNullAble:1
    */
    private String resultCode;

    /**
    * 
    * isNullAble:1
    */
    private String resultMsg;

    /**
    * 
    * isNullAble:1
    */
    private String businessType;

    /**
    * 
    * isNullAble:1
    */
    private String serverIp;

    /**
    * 
    * isNullAble:1
    */
    private String clientIp;

    /**
    * 
    * isNullAble:1
    */
    private String createdBy;

    /**
    * 
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime dateCreated;

    /**
    * 
    * isNullAble:1
    */
    private String updatedBy;

    /**
    * 
    * isNullAble:0,defaultVal:0000-00-00 00:00:00
    */
    private java.time.LocalDateTime dateUpdated;


    public void setSerialNo(String serialNo){this.serialNo = serialNo;}

    public String getSerialNo(){return this.serialNo;}

    public void setTraceId(String traceId){this.traceId = traceId;}

    public String getTraceId(){return this.traceId;}

    public void setRequestPath(String requestPath){this.requestPath = requestPath;}

    public String getRequestPath(){return this.requestPath;}

    public void setRequestMethod(String requestMethod){this.requestMethod = requestMethod;}

    public String getRequestMethod(){return this.requestMethod;}

    public void setSpendTime(Long spendTime){this.spendTime = spendTime;}

    public Long getSpendTime(){return this.spendTime;}

    public void setStatus(String status){this.status = status;}

    public String getStatus(){return this.status;}

    public void setRemark(String remark){this.remark = remark;}

    public String getRemark(){return this.remark;}

    public void setResultCode(String resultCode){this.resultCode = resultCode;}

    public String getResultCode(){return this.resultCode;}

    public void setResultMsg(String resultMsg){this.resultMsg = resultMsg;}

    public String getResultMsg(){return this.resultMsg;}

    public void setBusinessType(String businessType){this.businessType = businessType;}

    public String getBusinessType(){return this.businessType;}

    public void setServerIp(String serverIp){this.serverIp = serverIp;}

    public String getServerIp(){return this.serverIp;}

    public void setClientIp(String clientIp){this.clientIp = clientIp;}

    public String getClientIp(){return this.clientIp;}

    public void setCreatedBy(String createdBy){this.createdBy = createdBy;}

    public String getCreatedBy(){return this.createdBy;}

    public void setDateCreated(java.time.LocalDateTime dateCreated){this.dateCreated = dateCreated;}

    public java.time.LocalDateTime getDateCreated(){return this.dateCreated;}

    public void setUpdatedBy(String updatedBy){this.updatedBy = updatedBy;}

    public String getUpdatedBy(){return this.updatedBy;}

    public void setDateUpdated(java.time.LocalDateTime dateUpdated){this.dateUpdated = dateUpdated;}

    public java.time.LocalDateTime getDateUpdated(){return this.dateUpdated;}
    @Override
    public String toString() {
        return "RequestRecordInfo{" +
                "serialNo='" + serialNo + '\'' +
                "traceId='" + traceId + '\'' +
                "requestPath='" + requestPath + '\'' +
                "requestMethod='" + requestMethod + '\'' +
                "spendTime='" + spendTime + '\'' +
                "status='" + status + '\'' +
                "remark='" + remark + '\'' +
                "resultCode='" + resultCode + '\'' +
                "resultMsg='" + resultMsg + '\'' +
                "businessType='" + businessType + '\'' +
                "serverIp='" + serverIp + '\'' +
                "clientIp='" + clientIp + '\'' +
                "createdBy='" + createdBy + '\'' +
                "dateCreated='" + dateCreated + '\'' +
                "updatedBy='" + updatedBy + '\'' +
                "dateUpdated='" + dateUpdated + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private RequestRecordInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(RequestRecordInfo set){
            this.set = set;
            return this;
        }

        public RequestRecordInfo getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends RequestRecordInfo{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> serialNoList;

        public List<String> getSerialNoList(){return this.serialNoList;}


        private List<String> fuzzySerialNo;

        public List<String> getFuzzySerialNo(){return this.fuzzySerialNo;}

        private List<String> rightFuzzySerialNo;

        public List<String> getRightFuzzySerialNo(){return this.rightFuzzySerialNo;}
        private List<String> traceIdList;

        public List<String> getTraceIdList(){return this.traceIdList;}


        private List<String> fuzzyTraceId;

        public List<String> getFuzzyTraceId(){return this.fuzzyTraceId;}

        private List<String> rightFuzzyTraceId;

        public List<String> getRightFuzzyTraceId(){return this.rightFuzzyTraceId;}
        private List<String> requestPathList;

        public List<String> getRequestPathList(){return this.requestPathList;}


        private List<String> fuzzyRequestPath;

        public List<String> getFuzzyRequestPath(){return this.fuzzyRequestPath;}

        private List<String> rightFuzzyRequestPath;

        public List<String> getRightFuzzyRequestPath(){return this.rightFuzzyRequestPath;}
        private List<String> requestMethodList;

        public List<String> getRequestMethodList(){return this.requestMethodList;}


        private List<String> fuzzyRequestMethod;

        public List<String> getFuzzyRequestMethod(){return this.fuzzyRequestMethod;}

        private List<String> rightFuzzyRequestMethod;

        public List<String> getRightFuzzyRequestMethod(){return this.rightFuzzyRequestMethod;}
        private List<Long> spendTimeList;

        public List<Long> getSpendTimeList(){return this.spendTimeList;}

        private Long spendTimeSt;

        private Long spendTimeEd;

        public Long getSpendTimeSt(){return this.spendTimeSt;}

        public Long getSpendTimeEd(){return this.spendTimeEd;}

        private List<String> statusList;

        public List<String> getStatusList(){return this.statusList;}


        private List<String> fuzzyStatus;

        public List<String> getFuzzyStatus(){return this.fuzzyStatus;}

        private List<String> rightFuzzyStatus;

        public List<String> getRightFuzzyStatus(){return this.rightFuzzyStatus;}
        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
        private List<String> resultCodeList;

        public List<String> getResultCodeList(){return this.resultCodeList;}


        private List<String> fuzzyResultCode;

        public List<String> getFuzzyResultCode(){return this.fuzzyResultCode;}

        private List<String> rightFuzzyResultCode;

        public List<String> getRightFuzzyResultCode(){return this.rightFuzzyResultCode;}
        private List<String> resultMsgList;

        public List<String> getResultMsgList(){return this.resultMsgList;}


        private List<String> fuzzyResultMsg;

        public List<String> getFuzzyResultMsg(){return this.fuzzyResultMsg;}

        private List<String> rightFuzzyResultMsg;

        public List<String> getRightFuzzyResultMsg(){return this.rightFuzzyResultMsg;}
        private List<String> businessTypeList;

        public List<String> getBusinessTypeList(){return this.businessTypeList;}


        private List<String> fuzzyBusinessType;

        public List<String> getFuzzyBusinessType(){return this.fuzzyBusinessType;}

        private List<String> rightFuzzyBusinessType;

        public List<String> getRightFuzzyBusinessType(){return this.rightFuzzyBusinessType;}
        private List<String> serverIpList;

        public List<String> getServerIpList(){return this.serverIpList;}


        private List<String> fuzzyServerIp;

        public List<String> getFuzzyServerIp(){return this.fuzzyServerIp;}

        private List<String> rightFuzzyServerIp;

        public List<String> getRightFuzzyServerIp(){return this.rightFuzzyServerIp;}
        private List<String> clientIpList;

        public List<String> getClientIpList(){return this.clientIpList;}


        private List<String> fuzzyClientIp;

        public List<String> getFuzzyClientIp(){return this.fuzzyClientIp;}

        private List<String> rightFuzzyClientIp;

        public List<String> getRightFuzzyClientIp(){return this.rightFuzzyClientIp;}
        private List<String> createdByList;

        public List<String> getCreatedByList(){return this.createdByList;}


        private List<String> fuzzyCreatedBy;

        public List<String> getFuzzyCreatedBy(){return this.fuzzyCreatedBy;}

        private List<String> rightFuzzyCreatedBy;

        public List<String> getRightFuzzyCreatedBy(){return this.rightFuzzyCreatedBy;}
        private List<java.time.LocalDateTime> dateCreatedList;

        public List<java.time.LocalDateTime> getDateCreatedList(){return this.dateCreatedList;}

        private java.time.LocalDateTime dateCreatedSt;

        private java.time.LocalDateTime dateCreatedEd;

        public java.time.LocalDateTime getDateCreatedSt(){return this.dateCreatedSt;}

        public java.time.LocalDateTime getDateCreatedEd(){return this.dateCreatedEd;}

        private List<String> updatedByList;

        public List<String> getUpdatedByList(){return this.updatedByList;}


        private List<String> fuzzyUpdatedBy;

        public List<String> getFuzzyUpdatedBy(){return this.fuzzyUpdatedBy;}

        private List<String> rightFuzzyUpdatedBy;

        public List<String> getRightFuzzyUpdatedBy(){return this.rightFuzzyUpdatedBy;}
        private List<java.time.LocalDateTime> dateUpdatedList;

        public List<java.time.LocalDateTime> getDateUpdatedList(){return this.dateUpdatedList;}

        private java.time.LocalDateTime dateUpdatedSt;

        private java.time.LocalDateTime dateUpdatedEd;

        public java.time.LocalDateTime getDateUpdatedSt(){return this.dateUpdatedSt;}

        public java.time.LocalDateTime getDateUpdatedEd(){return this.dateUpdatedEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzySerialNo (List<String> fuzzySerialNo){
            this.fuzzySerialNo = fuzzySerialNo;
            return this;
        }

        public QueryBuilder fuzzySerialNo (String ... fuzzySerialNo){
            this.fuzzySerialNo = solveNullList(fuzzySerialNo);
            return this;
        }

        public QueryBuilder rightFuzzySerialNo (List<String> rightFuzzySerialNo){
            this.rightFuzzySerialNo = rightFuzzySerialNo;
            return this;
        }

        public QueryBuilder rightFuzzySerialNo (String ... rightFuzzySerialNo){
            this.rightFuzzySerialNo = solveNullList(rightFuzzySerialNo);
            return this;
        }

        public QueryBuilder serialNo(String serialNo){
            setSerialNo(serialNo);
            return this;
        }

        public QueryBuilder serialNoList(String ... serialNo){
            this.serialNoList = solveNullList(serialNo);
            return this;
        }

        public QueryBuilder serialNoList(List<String> serialNo){
            this.serialNoList = serialNo;
            return this;
        }

        public QueryBuilder fetchSerialNo(){
            setFetchFields("fetchFields","serialNo");
            return this;
        }

        public QueryBuilder excludeSerialNo(){
            setFetchFields("excludeFields","serialNo");
            return this;
        }

        public QueryBuilder fuzzyTraceId (List<String> fuzzyTraceId){
            this.fuzzyTraceId = fuzzyTraceId;
            return this;
        }

        public QueryBuilder fuzzyTraceId (String ... fuzzyTraceId){
            this.fuzzyTraceId = solveNullList(fuzzyTraceId);
            return this;
        }

        public QueryBuilder rightFuzzyTraceId (List<String> rightFuzzyTraceId){
            this.rightFuzzyTraceId = rightFuzzyTraceId;
            return this;
        }

        public QueryBuilder rightFuzzyTraceId (String ... rightFuzzyTraceId){
            this.rightFuzzyTraceId = solveNullList(rightFuzzyTraceId);
            return this;
        }

        public QueryBuilder traceId(String traceId){
            setTraceId(traceId);
            return this;
        }

        public QueryBuilder traceIdList(String ... traceId){
            this.traceIdList = solveNullList(traceId);
            return this;
        }

        public QueryBuilder traceIdList(List<String> traceId){
            this.traceIdList = traceId;
            return this;
        }

        public QueryBuilder fetchTraceId(){
            setFetchFields("fetchFields","traceId");
            return this;
        }

        public QueryBuilder excludeTraceId(){
            setFetchFields("excludeFields","traceId");
            return this;
        }

        public QueryBuilder fuzzyRequestPath (List<String> fuzzyRequestPath){
            this.fuzzyRequestPath = fuzzyRequestPath;
            return this;
        }

        public QueryBuilder fuzzyRequestPath (String ... fuzzyRequestPath){
            this.fuzzyRequestPath = solveNullList(fuzzyRequestPath);
            return this;
        }

        public QueryBuilder rightFuzzyRequestPath (List<String> rightFuzzyRequestPath){
            this.rightFuzzyRequestPath = rightFuzzyRequestPath;
            return this;
        }

        public QueryBuilder rightFuzzyRequestPath (String ... rightFuzzyRequestPath){
            this.rightFuzzyRequestPath = solveNullList(rightFuzzyRequestPath);
            return this;
        }

        public QueryBuilder requestPath(String requestPath){
            setRequestPath(requestPath);
            return this;
        }

        public QueryBuilder requestPathList(String ... requestPath){
            this.requestPathList = solveNullList(requestPath);
            return this;
        }

        public QueryBuilder requestPathList(List<String> requestPath){
            this.requestPathList = requestPath;
            return this;
        }

        public QueryBuilder fetchRequestPath(){
            setFetchFields("fetchFields","requestPath");
            return this;
        }

        public QueryBuilder excludeRequestPath(){
            setFetchFields("excludeFields","requestPath");
            return this;
        }

        public QueryBuilder fuzzyRequestMethod (List<String> fuzzyRequestMethod){
            this.fuzzyRequestMethod = fuzzyRequestMethod;
            return this;
        }

        public QueryBuilder fuzzyRequestMethod (String ... fuzzyRequestMethod){
            this.fuzzyRequestMethod = solveNullList(fuzzyRequestMethod);
            return this;
        }

        public QueryBuilder rightFuzzyRequestMethod (List<String> rightFuzzyRequestMethod){
            this.rightFuzzyRequestMethod = rightFuzzyRequestMethod;
            return this;
        }

        public QueryBuilder rightFuzzyRequestMethod (String ... rightFuzzyRequestMethod){
            this.rightFuzzyRequestMethod = solveNullList(rightFuzzyRequestMethod);
            return this;
        }

        public QueryBuilder requestMethod(String requestMethod){
            setRequestMethod(requestMethod);
            return this;
        }

        public QueryBuilder requestMethodList(String ... requestMethod){
            this.requestMethodList = solveNullList(requestMethod);
            return this;
        }

        public QueryBuilder requestMethodList(List<String> requestMethod){
            this.requestMethodList = requestMethod;
            return this;
        }

        public QueryBuilder fetchRequestMethod(){
            setFetchFields("fetchFields","requestMethod");
            return this;
        }

        public QueryBuilder excludeRequestMethod(){
            setFetchFields("excludeFields","requestMethod");
            return this;
        }

        public QueryBuilder spendTimeBetWeen(Long spendTimeSt,Long spendTimeEd){
            this.spendTimeSt = spendTimeSt;
            this.spendTimeEd = spendTimeEd;
            return this;
        }

        public QueryBuilder spendTimeGreaterEqThan(Long spendTimeSt){
            this.spendTimeSt = spendTimeSt;
            return this;
        }
        public QueryBuilder spendTimeLessEqThan(Long spendTimeEd){
            this.spendTimeEd = spendTimeEd;
            return this;
        }


        public QueryBuilder spendTime(Long spendTime){
            setSpendTime(spendTime);
            return this;
        }

        public QueryBuilder spendTimeList(Long ... spendTime){
            this.spendTimeList = solveNullList(spendTime);
            return this;
        }

        public QueryBuilder spendTimeList(List<Long> spendTime){
            this.spendTimeList = spendTime;
            return this;
        }

        public QueryBuilder fetchSpendTime(){
            setFetchFields("fetchFields","spendTime");
            return this;
        }

        public QueryBuilder excludeSpendTime(){
            setFetchFields("excludeFields","spendTime");
            return this;
        }

        public QueryBuilder fuzzyStatus (List<String> fuzzyStatus){
            this.fuzzyStatus = fuzzyStatus;
            return this;
        }

        public QueryBuilder fuzzyStatus (String ... fuzzyStatus){
            this.fuzzyStatus = solveNullList(fuzzyStatus);
            return this;
        }

        public QueryBuilder rightFuzzyStatus (List<String> rightFuzzyStatus){
            this.rightFuzzyStatus = rightFuzzyStatus;
            return this;
        }

        public QueryBuilder rightFuzzyStatus (String ... rightFuzzyStatus){
            this.rightFuzzyStatus = solveNullList(rightFuzzyStatus);
            return this;
        }

        public QueryBuilder status(String status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(String ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public QueryBuilder statusList(List<String> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
            return this;
        }

        public QueryBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public QueryBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public QueryBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public QueryBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public QueryBuilder remark(String remark){
            setRemark(remark);
            return this;
        }

        public QueryBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public QueryBuilder remarkList(List<String> remark){
            this.remarkList = remark;
            return this;
        }

        public QueryBuilder fetchRemark(){
            setFetchFields("fetchFields","remark");
            return this;
        }

        public QueryBuilder excludeRemark(){
            setFetchFields("excludeFields","remark");
            return this;
        }

        public QueryBuilder fuzzyResultCode (List<String> fuzzyResultCode){
            this.fuzzyResultCode = fuzzyResultCode;
            return this;
        }

        public QueryBuilder fuzzyResultCode (String ... fuzzyResultCode){
            this.fuzzyResultCode = solveNullList(fuzzyResultCode);
            return this;
        }

        public QueryBuilder rightFuzzyResultCode (List<String> rightFuzzyResultCode){
            this.rightFuzzyResultCode = rightFuzzyResultCode;
            return this;
        }

        public QueryBuilder rightFuzzyResultCode (String ... rightFuzzyResultCode){
            this.rightFuzzyResultCode = solveNullList(rightFuzzyResultCode);
            return this;
        }

        public QueryBuilder resultCode(String resultCode){
            setResultCode(resultCode);
            return this;
        }

        public QueryBuilder resultCodeList(String ... resultCode){
            this.resultCodeList = solveNullList(resultCode);
            return this;
        }

        public QueryBuilder resultCodeList(List<String> resultCode){
            this.resultCodeList = resultCode;
            return this;
        }

        public QueryBuilder fetchResultCode(){
            setFetchFields("fetchFields","resultCode");
            return this;
        }

        public QueryBuilder excludeResultCode(){
            setFetchFields("excludeFields","resultCode");
            return this;
        }

        public QueryBuilder fuzzyResultMsg (List<String> fuzzyResultMsg){
            this.fuzzyResultMsg = fuzzyResultMsg;
            return this;
        }

        public QueryBuilder fuzzyResultMsg (String ... fuzzyResultMsg){
            this.fuzzyResultMsg = solveNullList(fuzzyResultMsg);
            return this;
        }

        public QueryBuilder rightFuzzyResultMsg (List<String> rightFuzzyResultMsg){
            this.rightFuzzyResultMsg = rightFuzzyResultMsg;
            return this;
        }

        public QueryBuilder rightFuzzyResultMsg (String ... rightFuzzyResultMsg){
            this.rightFuzzyResultMsg = solveNullList(rightFuzzyResultMsg);
            return this;
        }

        public QueryBuilder resultMsg(String resultMsg){
            setResultMsg(resultMsg);
            return this;
        }

        public QueryBuilder resultMsgList(String ... resultMsg){
            this.resultMsgList = solveNullList(resultMsg);
            return this;
        }

        public QueryBuilder resultMsgList(List<String> resultMsg){
            this.resultMsgList = resultMsg;
            return this;
        }

        public QueryBuilder fetchResultMsg(){
            setFetchFields("fetchFields","resultMsg");
            return this;
        }

        public QueryBuilder excludeResultMsg(){
            setFetchFields("excludeFields","resultMsg");
            return this;
        }

        public QueryBuilder fuzzyBusinessType (List<String> fuzzyBusinessType){
            this.fuzzyBusinessType = fuzzyBusinessType;
            return this;
        }

        public QueryBuilder fuzzyBusinessType (String ... fuzzyBusinessType){
            this.fuzzyBusinessType = solveNullList(fuzzyBusinessType);
            return this;
        }

        public QueryBuilder rightFuzzyBusinessType (List<String> rightFuzzyBusinessType){
            this.rightFuzzyBusinessType = rightFuzzyBusinessType;
            return this;
        }

        public QueryBuilder rightFuzzyBusinessType (String ... rightFuzzyBusinessType){
            this.rightFuzzyBusinessType = solveNullList(rightFuzzyBusinessType);
            return this;
        }

        public QueryBuilder businessType(String businessType){
            setBusinessType(businessType);
            return this;
        }

        public QueryBuilder businessTypeList(String ... businessType){
            this.businessTypeList = solveNullList(businessType);
            return this;
        }

        public QueryBuilder businessTypeList(List<String> businessType){
            this.businessTypeList = businessType;
            return this;
        }

        public QueryBuilder fetchBusinessType(){
            setFetchFields("fetchFields","businessType");
            return this;
        }

        public QueryBuilder excludeBusinessType(){
            setFetchFields("excludeFields","businessType");
            return this;
        }

        public QueryBuilder fuzzyServerIp (List<String> fuzzyServerIp){
            this.fuzzyServerIp = fuzzyServerIp;
            return this;
        }

        public QueryBuilder fuzzyServerIp (String ... fuzzyServerIp){
            this.fuzzyServerIp = solveNullList(fuzzyServerIp);
            return this;
        }

        public QueryBuilder rightFuzzyServerIp (List<String> rightFuzzyServerIp){
            this.rightFuzzyServerIp = rightFuzzyServerIp;
            return this;
        }

        public QueryBuilder rightFuzzyServerIp (String ... rightFuzzyServerIp){
            this.rightFuzzyServerIp = solveNullList(rightFuzzyServerIp);
            return this;
        }

        public QueryBuilder serverIp(String serverIp){
            setServerIp(serverIp);
            return this;
        }

        public QueryBuilder serverIpList(String ... serverIp){
            this.serverIpList = solveNullList(serverIp);
            return this;
        }

        public QueryBuilder serverIpList(List<String> serverIp){
            this.serverIpList = serverIp;
            return this;
        }

        public QueryBuilder fetchServerIp(){
            setFetchFields("fetchFields","serverIp");
            return this;
        }

        public QueryBuilder excludeServerIp(){
            setFetchFields("excludeFields","serverIp");
            return this;
        }

        public QueryBuilder fuzzyClientIp (List<String> fuzzyClientIp){
            this.fuzzyClientIp = fuzzyClientIp;
            return this;
        }

        public QueryBuilder fuzzyClientIp (String ... fuzzyClientIp){
            this.fuzzyClientIp = solveNullList(fuzzyClientIp);
            return this;
        }

        public QueryBuilder rightFuzzyClientIp (List<String> rightFuzzyClientIp){
            this.rightFuzzyClientIp = rightFuzzyClientIp;
            return this;
        }

        public QueryBuilder rightFuzzyClientIp (String ... rightFuzzyClientIp){
            this.rightFuzzyClientIp = solveNullList(rightFuzzyClientIp);
            return this;
        }

        public QueryBuilder clientIp(String clientIp){
            setClientIp(clientIp);
            return this;
        }

        public QueryBuilder clientIpList(String ... clientIp){
            this.clientIpList = solveNullList(clientIp);
            return this;
        }

        public QueryBuilder clientIpList(List<String> clientIp){
            this.clientIpList = clientIp;
            return this;
        }

        public QueryBuilder fetchClientIp(){
            setFetchFields("fetchFields","clientIp");
            return this;
        }

        public QueryBuilder excludeClientIp(){
            setFetchFields("excludeFields","clientIp");
            return this;
        }

        public QueryBuilder fuzzyCreatedBy (List<String> fuzzyCreatedBy){
            this.fuzzyCreatedBy = fuzzyCreatedBy;
            return this;
        }

        public QueryBuilder fuzzyCreatedBy (String ... fuzzyCreatedBy){
            this.fuzzyCreatedBy = solveNullList(fuzzyCreatedBy);
            return this;
        }

        public QueryBuilder rightFuzzyCreatedBy (List<String> rightFuzzyCreatedBy){
            this.rightFuzzyCreatedBy = rightFuzzyCreatedBy;
            return this;
        }

        public QueryBuilder rightFuzzyCreatedBy (String ... rightFuzzyCreatedBy){
            this.rightFuzzyCreatedBy = solveNullList(rightFuzzyCreatedBy);
            return this;
        }

        public QueryBuilder createdBy(String createdBy){
            setCreatedBy(createdBy);
            return this;
        }

        public QueryBuilder createdByList(String ... createdBy){
            this.createdByList = solveNullList(createdBy);
            return this;
        }

        public QueryBuilder createdByList(List<String> createdBy){
            this.createdByList = createdBy;
            return this;
        }

        public QueryBuilder fetchCreatedBy(){
            setFetchFields("fetchFields","createdBy");
            return this;
        }

        public QueryBuilder excludeCreatedBy(){
            setFetchFields("excludeFields","createdBy");
            return this;
        }

        public QueryBuilder dateCreatedBetWeen(java.time.LocalDateTime dateCreatedSt,java.time.LocalDateTime dateCreatedEd){
            this.dateCreatedSt = dateCreatedSt;
            this.dateCreatedEd = dateCreatedEd;
            return this;
        }

        public QueryBuilder dateCreatedGreaterEqThan(java.time.LocalDateTime dateCreatedSt){
            this.dateCreatedSt = dateCreatedSt;
            return this;
        }
        public QueryBuilder dateCreatedLessEqThan(java.time.LocalDateTime dateCreatedEd){
            this.dateCreatedEd = dateCreatedEd;
            return this;
        }


        public QueryBuilder dateCreated(java.time.LocalDateTime dateCreated){
            setDateCreated(dateCreated);
            return this;
        }

        public QueryBuilder dateCreatedList(java.time.LocalDateTime ... dateCreated){
            this.dateCreatedList = solveNullList(dateCreated);
            return this;
        }

        public QueryBuilder dateCreatedList(List<java.time.LocalDateTime> dateCreated){
            this.dateCreatedList = dateCreated;
            return this;
        }

        public QueryBuilder fetchDateCreated(){
            setFetchFields("fetchFields","dateCreated");
            return this;
        }

        public QueryBuilder excludeDateCreated(){
            setFetchFields("excludeFields","dateCreated");
            return this;
        }

        public QueryBuilder fuzzyUpdatedBy (List<String> fuzzyUpdatedBy){
            this.fuzzyUpdatedBy = fuzzyUpdatedBy;
            return this;
        }

        public QueryBuilder fuzzyUpdatedBy (String ... fuzzyUpdatedBy){
            this.fuzzyUpdatedBy = solveNullList(fuzzyUpdatedBy);
            return this;
        }

        public QueryBuilder rightFuzzyUpdatedBy (List<String> rightFuzzyUpdatedBy){
            this.rightFuzzyUpdatedBy = rightFuzzyUpdatedBy;
            return this;
        }

        public QueryBuilder rightFuzzyUpdatedBy (String ... rightFuzzyUpdatedBy){
            this.rightFuzzyUpdatedBy = solveNullList(rightFuzzyUpdatedBy);
            return this;
        }

        public QueryBuilder updatedBy(String updatedBy){
            setUpdatedBy(updatedBy);
            return this;
        }

        public QueryBuilder updatedByList(String ... updatedBy){
            this.updatedByList = solveNullList(updatedBy);
            return this;
        }

        public QueryBuilder updatedByList(List<String> updatedBy){
            this.updatedByList = updatedBy;
            return this;
        }

        public QueryBuilder fetchUpdatedBy(){
            setFetchFields("fetchFields","updatedBy");
            return this;
        }

        public QueryBuilder excludeUpdatedBy(){
            setFetchFields("excludeFields","updatedBy");
            return this;
        }

        public QueryBuilder dateUpdatedBetWeen(java.time.LocalDateTime dateUpdatedSt,java.time.LocalDateTime dateUpdatedEd){
            this.dateUpdatedSt = dateUpdatedSt;
            this.dateUpdatedEd = dateUpdatedEd;
            return this;
        }

        public QueryBuilder dateUpdatedGreaterEqThan(java.time.LocalDateTime dateUpdatedSt){
            this.dateUpdatedSt = dateUpdatedSt;
            return this;
        }
        public QueryBuilder dateUpdatedLessEqThan(java.time.LocalDateTime dateUpdatedEd){
            this.dateUpdatedEd = dateUpdatedEd;
            return this;
        }


        public QueryBuilder dateUpdated(java.time.LocalDateTime dateUpdated){
            setDateUpdated(dateUpdated);
            return this;
        }

        public QueryBuilder dateUpdatedList(java.time.LocalDateTime ... dateUpdated){
            this.dateUpdatedList = solveNullList(dateUpdated);
            return this;
        }

        public QueryBuilder dateUpdatedList(List<java.time.LocalDateTime> dateUpdated){
            this.dateUpdatedList = dateUpdated;
            return this;
        }

        public QueryBuilder fetchDateUpdated(){
            setFetchFields("fetchFields","dateUpdated");
            return this;
        }

        public QueryBuilder excludeDateUpdated(){
            setFetchFields("excludeFields","dateUpdated");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public RequestRecordInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> serialNoList;

        public List<String> getSerialNoList(){return this.serialNoList;}


        private List<String> fuzzySerialNo;

        public List<String> getFuzzySerialNo(){return this.fuzzySerialNo;}

        private List<String> rightFuzzySerialNo;

        public List<String> getRightFuzzySerialNo(){return this.rightFuzzySerialNo;}
        private List<String> traceIdList;

        public List<String> getTraceIdList(){return this.traceIdList;}


        private List<String> fuzzyTraceId;

        public List<String> getFuzzyTraceId(){return this.fuzzyTraceId;}

        private List<String> rightFuzzyTraceId;

        public List<String> getRightFuzzyTraceId(){return this.rightFuzzyTraceId;}
        private List<String> requestPathList;

        public List<String> getRequestPathList(){return this.requestPathList;}


        private List<String> fuzzyRequestPath;

        public List<String> getFuzzyRequestPath(){return this.fuzzyRequestPath;}

        private List<String> rightFuzzyRequestPath;

        public List<String> getRightFuzzyRequestPath(){return this.rightFuzzyRequestPath;}
        private List<String> requestMethodList;

        public List<String> getRequestMethodList(){return this.requestMethodList;}


        private List<String> fuzzyRequestMethod;

        public List<String> getFuzzyRequestMethod(){return this.fuzzyRequestMethod;}

        private List<String> rightFuzzyRequestMethod;

        public List<String> getRightFuzzyRequestMethod(){return this.rightFuzzyRequestMethod;}
        private List<Long> spendTimeList;

        public List<Long> getSpendTimeList(){return this.spendTimeList;}

        private Long spendTimeSt;

        private Long spendTimeEd;

        public Long getSpendTimeSt(){return this.spendTimeSt;}

        public Long getSpendTimeEd(){return this.spendTimeEd;}

        private List<String> statusList;

        public List<String> getStatusList(){return this.statusList;}


        private List<String> fuzzyStatus;

        public List<String> getFuzzyStatus(){return this.fuzzyStatus;}

        private List<String> rightFuzzyStatus;

        public List<String> getRightFuzzyStatus(){return this.rightFuzzyStatus;}
        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
        private List<String> resultCodeList;

        public List<String> getResultCodeList(){return this.resultCodeList;}


        private List<String> fuzzyResultCode;

        public List<String> getFuzzyResultCode(){return this.fuzzyResultCode;}

        private List<String> rightFuzzyResultCode;

        public List<String> getRightFuzzyResultCode(){return this.rightFuzzyResultCode;}
        private List<String> resultMsgList;

        public List<String> getResultMsgList(){return this.resultMsgList;}


        private List<String> fuzzyResultMsg;

        public List<String> getFuzzyResultMsg(){return this.fuzzyResultMsg;}

        private List<String> rightFuzzyResultMsg;

        public List<String> getRightFuzzyResultMsg(){return this.rightFuzzyResultMsg;}
        private List<String> businessTypeList;

        public List<String> getBusinessTypeList(){return this.businessTypeList;}


        private List<String> fuzzyBusinessType;

        public List<String> getFuzzyBusinessType(){return this.fuzzyBusinessType;}

        private List<String> rightFuzzyBusinessType;

        public List<String> getRightFuzzyBusinessType(){return this.rightFuzzyBusinessType;}
        private List<String> serverIpList;

        public List<String> getServerIpList(){return this.serverIpList;}


        private List<String> fuzzyServerIp;

        public List<String> getFuzzyServerIp(){return this.fuzzyServerIp;}

        private List<String> rightFuzzyServerIp;

        public List<String> getRightFuzzyServerIp(){return this.rightFuzzyServerIp;}
        private List<String> clientIpList;

        public List<String> getClientIpList(){return this.clientIpList;}


        private List<String> fuzzyClientIp;

        public List<String> getFuzzyClientIp(){return this.fuzzyClientIp;}

        private List<String> rightFuzzyClientIp;

        public List<String> getRightFuzzyClientIp(){return this.rightFuzzyClientIp;}
        private List<String> createdByList;

        public List<String> getCreatedByList(){return this.createdByList;}


        private List<String> fuzzyCreatedBy;

        public List<String> getFuzzyCreatedBy(){return this.fuzzyCreatedBy;}

        private List<String> rightFuzzyCreatedBy;

        public List<String> getRightFuzzyCreatedBy(){return this.rightFuzzyCreatedBy;}
        private List<java.time.LocalDateTime> dateCreatedList;

        public List<java.time.LocalDateTime> getDateCreatedList(){return this.dateCreatedList;}

        private java.time.LocalDateTime dateCreatedSt;

        private java.time.LocalDateTime dateCreatedEd;

        public java.time.LocalDateTime getDateCreatedSt(){return this.dateCreatedSt;}

        public java.time.LocalDateTime getDateCreatedEd(){return this.dateCreatedEd;}

        private List<String> updatedByList;

        public List<String> getUpdatedByList(){return this.updatedByList;}


        private List<String> fuzzyUpdatedBy;

        public List<String> getFuzzyUpdatedBy(){return this.fuzzyUpdatedBy;}

        private List<String> rightFuzzyUpdatedBy;

        public List<String> getRightFuzzyUpdatedBy(){return this.rightFuzzyUpdatedBy;}
        private List<java.time.LocalDateTime> dateUpdatedList;

        public List<java.time.LocalDateTime> getDateUpdatedList(){return this.dateUpdatedList;}

        private java.time.LocalDateTime dateUpdatedSt;

        private java.time.LocalDateTime dateUpdatedEd;

        public java.time.LocalDateTime getDateUpdatedSt(){return this.dateUpdatedSt;}

        public java.time.LocalDateTime getDateUpdatedEd(){return this.dateUpdatedEd;}


        public ConditionBuilder fuzzySerialNo (List<String> fuzzySerialNo){
            this.fuzzySerialNo = fuzzySerialNo;
            return this;
        }

        public ConditionBuilder fuzzySerialNo (String ... fuzzySerialNo){
            this.fuzzySerialNo = solveNullList(fuzzySerialNo);
            return this;
        }

        public ConditionBuilder rightFuzzySerialNo (List<String> rightFuzzySerialNo){
            this.rightFuzzySerialNo = rightFuzzySerialNo;
            return this;
        }

        public ConditionBuilder rightFuzzySerialNo (String ... rightFuzzySerialNo){
            this.rightFuzzySerialNo = solveNullList(rightFuzzySerialNo);
            return this;
        }

        public ConditionBuilder serialNoList(String ... serialNo){
            this.serialNoList = solveNullList(serialNo);
            return this;
        }

        public ConditionBuilder serialNoList(List<String> serialNo){
            this.serialNoList = serialNo;
            return this;
        }

        public ConditionBuilder fuzzyTraceId (List<String> fuzzyTraceId){
            this.fuzzyTraceId = fuzzyTraceId;
            return this;
        }

        public ConditionBuilder fuzzyTraceId (String ... fuzzyTraceId){
            this.fuzzyTraceId = solveNullList(fuzzyTraceId);
            return this;
        }

        public ConditionBuilder rightFuzzyTraceId (List<String> rightFuzzyTraceId){
            this.rightFuzzyTraceId = rightFuzzyTraceId;
            return this;
        }

        public ConditionBuilder rightFuzzyTraceId (String ... rightFuzzyTraceId){
            this.rightFuzzyTraceId = solveNullList(rightFuzzyTraceId);
            return this;
        }

        public ConditionBuilder traceIdList(String ... traceId){
            this.traceIdList = solveNullList(traceId);
            return this;
        }

        public ConditionBuilder traceIdList(List<String> traceId){
            this.traceIdList = traceId;
            return this;
        }

        public ConditionBuilder fuzzyRequestPath (List<String> fuzzyRequestPath){
            this.fuzzyRequestPath = fuzzyRequestPath;
            return this;
        }

        public ConditionBuilder fuzzyRequestPath (String ... fuzzyRequestPath){
            this.fuzzyRequestPath = solveNullList(fuzzyRequestPath);
            return this;
        }

        public ConditionBuilder rightFuzzyRequestPath (List<String> rightFuzzyRequestPath){
            this.rightFuzzyRequestPath = rightFuzzyRequestPath;
            return this;
        }

        public ConditionBuilder rightFuzzyRequestPath (String ... rightFuzzyRequestPath){
            this.rightFuzzyRequestPath = solveNullList(rightFuzzyRequestPath);
            return this;
        }

        public ConditionBuilder requestPathList(String ... requestPath){
            this.requestPathList = solveNullList(requestPath);
            return this;
        }

        public ConditionBuilder requestPathList(List<String> requestPath){
            this.requestPathList = requestPath;
            return this;
        }

        public ConditionBuilder fuzzyRequestMethod (List<String> fuzzyRequestMethod){
            this.fuzzyRequestMethod = fuzzyRequestMethod;
            return this;
        }

        public ConditionBuilder fuzzyRequestMethod (String ... fuzzyRequestMethod){
            this.fuzzyRequestMethod = solveNullList(fuzzyRequestMethod);
            return this;
        }

        public ConditionBuilder rightFuzzyRequestMethod (List<String> rightFuzzyRequestMethod){
            this.rightFuzzyRequestMethod = rightFuzzyRequestMethod;
            return this;
        }

        public ConditionBuilder rightFuzzyRequestMethod (String ... rightFuzzyRequestMethod){
            this.rightFuzzyRequestMethod = solveNullList(rightFuzzyRequestMethod);
            return this;
        }

        public ConditionBuilder requestMethodList(String ... requestMethod){
            this.requestMethodList = solveNullList(requestMethod);
            return this;
        }

        public ConditionBuilder requestMethodList(List<String> requestMethod){
            this.requestMethodList = requestMethod;
            return this;
        }

        public ConditionBuilder spendTimeBetWeen(Long spendTimeSt,Long spendTimeEd){
            this.spendTimeSt = spendTimeSt;
            this.spendTimeEd = spendTimeEd;
            return this;
        }

        public ConditionBuilder spendTimeGreaterEqThan(Long spendTimeSt){
            this.spendTimeSt = spendTimeSt;
            return this;
        }
        public ConditionBuilder spendTimeLessEqThan(Long spendTimeEd){
            this.spendTimeEd = spendTimeEd;
            return this;
        }


        public ConditionBuilder spendTimeList(Long ... spendTime){
            this.spendTimeList = solveNullList(spendTime);
            return this;
        }

        public ConditionBuilder spendTimeList(List<Long> spendTime){
            this.spendTimeList = spendTime;
            return this;
        }

        public ConditionBuilder fuzzyStatus (List<String> fuzzyStatus){
            this.fuzzyStatus = fuzzyStatus;
            return this;
        }

        public ConditionBuilder fuzzyStatus (String ... fuzzyStatus){
            this.fuzzyStatus = solveNullList(fuzzyStatus);
            return this;
        }

        public ConditionBuilder rightFuzzyStatus (List<String> rightFuzzyStatus){
            this.rightFuzzyStatus = rightFuzzyStatus;
            return this;
        }

        public ConditionBuilder rightFuzzyStatus (String ... rightFuzzyStatus){
            this.rightFuzzyStatus = solveNullList(rightFuzzyStatus);
            return this;
        }

        public ConditionBuilder statusList(String ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public ConditionBuilder statusList(List<String> status){
            this.statusList = status;
            return this;
        }

        public ConditionBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public ConditionBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public ConditionBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public ConditionBuilder remarkList(List<String> remark){
            this.remarkList = remark;
            return this;
        }

        public ConditionBuilder fuzzyResultCode (List<String> fuzzyResultCode){
            this.fuzzyResultCode = fuzzyResultCode;
            return this;
        }

        public ConditionBuilder fuzzyResultCode (String ... fuzzyResultCode){
            this.fuzzyResultCode = solveNullList(fuzzyResultCode);
            return this;
        }

        public ConditionBuilder rightFuzzyResultCode (List<String> rightFuzzyResultCode){
            this.rightFuzzyResultCode = rightFuzzyResultCode;
            return this;
        }

        public ConditionBuilder rightFuzzyResultCode (String ... rightFuzzyResultCode){
            this.rightFuzzyResultCode = solveNullList(rightFuzzyResultCode);
            return this;
        }

        public ConditionBuilder resultCodeList(String ... resultCode){
            this.resultCodeList = solveNullList(resultCode);
            return this;
        }

        public ConditionBuilder resultCodeList(List<String> resultCode){
            this.resultCodeList = resultCode;
            return this;
        }

        public ConditionBuilder fuzzyResultMsg (List<String> fuzzyResultMsg){
            this.fuzzyResultMsg = fuzzyResultMsg;
            return this;
        }

        public ConditionBuilder fuzzyResultMsg (String ... fuzzyResultMsg){
            this.fuzzyResultMsg = solveNullList(fuzzyResultMsg);
            return this;
        }

        public ConditionBuilder rightFuzzyResultMsg (List<String> rightFuzzyResultMsg){
            this.rightFuzzyResultMsg = rightFuzzyResultMsg;
            return this;
        }

        public ConditionBuilder rightFuzzyResultMsg (String ... rightFuzzyResultMsg){
            this.rightFuzzyResultMsg = solveNullList(rightFuzzyResultMsg);
            return this;
        }

        public ConditionBuilder resultMsgList(String ... resultMsg){
            this.resultMsgList = solveNullList(resultMsg);
            return this;
        }

        public ConditionBuilder resultMsgList(List<String> resultMsg){
            this.resultMsgList = resultMsg;
            return this;
        }

        public ConditionBuilder fuzzyBusinessType (List<String> fuzzyBusinessType){
            this.fuzzyBusinessType = fuzzyBusinessType;
            return this;
        }

        public ConditionBuilder fuzzyBusinessType (String ... fuzzyBusinessType){
            this.fuzzyBusinessType = solveNullList(fuzzyBusinessType);
            return this;
        }

        public ConditionBuilder rightFuzzyBusinessType (List<String> rightFuzzyBusinessType){
            this.rightFuzzyBusinessType = rightFuzzyBusinessType;
            return this;
        }

        public ConditionBuilder rightFuzzyBusinessType (String ... rightFuzzyBusinessType){
            this.rightFuzzyBusinessType = solveNullList(rightFuzzyBusinessType);
            return this;
        }

        public ConditionBuilder businessTypeList(String ... businessType){
            this.businessTypeList = solveNullList(businessType);
            return this;
        }

        public ConditionBuilder businessTypeList(List<String> businessType){
            this.businessTypeList = businessType;
            return this;
        }

        public ConditionBuilder fuzzyServerIp (List<String> fuzzyServerIp){
            this.fuzzyServerIp = fuzzyServerIp;
            return this;
        }

        public ConditionBuilder fuzzyServerIp (String ... fuzzyServerIp){
            this.fuzzyServerIp = solveNullList(fuzzyServerIp);
            return this;
        }

        public ConditionBuilder rightFuzzyServerIp (List<String> rightFuzzyServerIp){
            this.rightFuzzyServerIp = rightFuzzyServerIp;
            return this;
        }

        public ConditionBuilder rightFuzzyServerIp (String ... rightFuzzyServerIp){
            this.rightFuzzyServerIp = solveNullList(rightFuzzyServerIp);
            return this;
        }

        public ConditionBuilder serverIpList(String ... serverIp){
            this.serverIpList = solveNullList(serverIp);
            return this;
        }

        public ConditionBuilder serverIpList(List<String> serverIp){
            this.serverIpList = serverIp;
            return this;
        }

        public ConditionBuilder fuzzyClientIp (List<String> fuzzyClientIp){
            this.fuzzyClientIp = fuzzyClientIp;
            return this;
        }

        public ConditionBuilder fuzzyClientIp (String ... fuzzyClientIp){
            this.fuzzyClientIp = solveNullList(fuzzyClientIp);
            return this;
        }

        public ConditionBuilder rightFuzzyClientIp (List<String> rightFuzzyClientIp){
            this.rightFuzzyClientIp = rightFuzzyClientIp;
            return this;
        }

        public ConditionBuilder rightFuzzyClientIp (String ... rightFuzzyClientIp){
            this.rightFuzzyClientIp = solveNullList(rightFuzzyClientIp);
            return this;
        }

        public ConditionBuilder clientIpList(String ... clientIp){
            this.clientIpList = solveNullList(clientIp);
            return this;
        }

        public ConditionBuilder clientIpList(List<String> clientIp){
            this.clientIpList = clientIp;
            return this;
        }

        public ConditionBuilder fuzzyCreatedBy (List<String> fuzzyCreatedBy){
            this.fuzzyCreatedBy = fuzzyCreatedBy;
            return this;
        }

        public ConditionBuilder fuzzyCreatedBy (String ... fuzzyCreatedBy){
            this.fuzzyCreatedBy = solveNullList(fuzzyCreatedBy);
            return this;
        }

        public ConditionBuilder rightFuzzyCreatedBy (List<String> rightFuzzyCreatedBy){
            this.rightFuzzyCreatedBy = rightFuzzyCreatedBy;
            return this;
        }

        public ConditionBuilder rightFuzzyCreatedBy (String ... rightFuzzyCreatedBy){
            this.rightFuzzyCreatedBy = solveNullList(rightFuzzyCreatedBy);
            return this;
        }

        public ConditionBuilder createdByList(String ... createdBy){
            this.createdByList = solveNullList(createdBy);
            return this;
        }

        public ConditionBuilder createdByList(List<String> createdBy){
            this.createdByList = createdBy;
            return this;
        }

        public ConditionBuilder dateCreatedBetWeen(java.time.LocalDateTime dateCreatedSt,java.time.LocalDateTime dateCreatedEd){
            this.dateCreatedSt = dateCreatedSt;
            this.dateCreatedEd = dateCreatedEd;
            return this;
        }

        public ConditionBuilder dateCreatedGreaterEqThan(java.time.LocalDateTime dateCreatedSt){
            this.dateCreatedSt = dateCreatedSt;
            return this;
        }
        public ConditionBuilder dateCreatedLessEqThan(java.time.LocalDateTime dateCreatedEd){
            this.dateCreatedEd = dateCreatedEd;
            return this;
        }


        public ConditionBuilder dateCreatedList(java.time.LocalDateTime ... dateCreated){
            this.dateCreatedList = solveNullList(dateCreated);
            return this;
        }

        public ConditionBuilder dateCreatedList(List<java.time.LocalDateTime> dateCreated){
            this.dateCreatedList = dateCreated;
            return this;
        }

        public ConditionBuilder fuzzyUpdatedBy (List<String> fuzzyUpdatedBy){
            this.fuzzyUpdatedBy = fuzzyUpdatedBy;
            return this;
        }

        public ConditionBuilder fuzzyUpdatedBy (String ... fuzzyUpdatedBy){
            this.fuzzyUpdatedBy = solveNullList(fuzzyUpdatedBy);
            return this;
        }

        public ConditionBuilder rightFuzzyUpdatedBy (List<String> rightFuzzyUpdatedBy){
            this.rightFuzzyUpdatedBy = rightFuzzyUpdatedBy;
            return this;
        }

        public ConditionBuilder rightFuzzyUpdatedBy (String ... rightFuzzyUpdatedBy){
            this.rightFuzzyUpdatedBy = solveNullList(rightFuzzyUpdatedBy);
            return this;
        }

        public ConditionBuilder updatedByList(String ... updatedBy){
            this.updatedByList = solveNullList(updatedBy);
            return this;
        }

        public ConditionBuilder updatedByList(List<String> updatedBy){
            this.updatedByList = updatedBy;
            return this;
        }

        public ConditionBuilder dateUpdatedBetWeen(java.time.LocalDateTime dateUpdatedSt,java.time.LocalDateTime dateUpdatedEd){
            this.dateUpdatedSt = dateUpdatedSt;
            this.dateUpdatedEd = dateUpdatedEd;
            return this;
        }

        public ConditionBuilder dateUpdatedGreaterEqThan(java.time.LocalDateTime dateUpdatedSt){
            this.dateUpdatedSt = dateUpdatedSt;
            return this;
        }
        public ConditionBuilder dateUpdatedLessEqThan(java.time.LocalDateTime dateUpdatedEd){
            this.dateUpdatedEd = dateUpdatedEd;
            return this;
        }


        public ConditionBuilder dateUpdatedList(java.time.LocalDateTime ... dateUpdated){
            this.dateUpdatedList = solveNullList(dateUpdated);
            return this;
        }

        public ConditionBuilder dateUpdatedList(List<java.time.LocalDateTime> dateUpdated){
            this.dateUpdatedList = dateUpdated;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private RequestRecordInfo obj;

        public Builder(){
            this.obj = new RequestRecordInfo();
        }

        public Builder serialNo(String serialNo){
            this.obj.setSerialNo(serialNo);
            return this;
        }
        public Builder traceId(String traceId){
            this.obj.setTraceId(traceId);
            return this;
        }
        public Builder requestPath(String requestPath){
            this.obj.setRequestPath(requestPath);
            return this;
        }
        public Builder requestMethod(String requestMethod){
            this.obj.setRequestMethod(requestMethod);
            return this;
        }
        public Builder spendTime(Long spendTime){
            this.obj.setSpendTime(spendTime);
            return this;
        }
        public Builder status(String status){
            this.obj.setStatus(status);
            return this;
        }
        public Builder remark(String remark){
            this.obj.setRemark(remark);
            return this;
        }
        public Builder resultCode(String resultCode){
            this.obj.setResultCode(resultCode);
            return this;
        }
        public Builder resultMsg(String resultMsg){
            this.obj.setResultMsg(resultMsg);
            return this;
        }
        public Builder businessType(String businessType){
            this.obj.setBusinessType(businessType);
            return this;
        }
        public Builder serverIp(String serverIp){
            this.obj.setServerIp(serverIp);
            return this;
        }
        public Builder clientIp(String clientIp){
            this.obj.setClientIp(clientIp);
            return this;
        }
        public Builder createdBy(String createdBy){
            this.obj.setCreatedBy(createdBy);
            return this;
        }
        public Builder dateCreated(java.time.LocalDateTime dateCreated){
            this.obj.setDateCreated(dateCreated);
            return this;
        }
        public Builder updatedBy(String updatedBy){
            this.obj.setUpdatedBy(updatedBy);
            return this;
        }
        public Builder dateUpdated(java.time.LocalDateTime dateUpdated){
            this.obj.setDateUpdated(dateUpdated);
            return this;
        }
        public RequestRecordInfo build(){return obj;}
    }

}
