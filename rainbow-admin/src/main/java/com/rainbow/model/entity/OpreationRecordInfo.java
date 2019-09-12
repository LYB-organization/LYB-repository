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
public class OpreationRecordInfo implements Serializable {

    private static final long serialVersionUID = 1567754673464L;


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
    private String clientIp;

    /**
    * 
    * isNullAble:1
    */
    private String oprClass;

    /**
    * 
    * isNullAble:1
    */
    private String oprMethod;

    /**
    * 
    * isNullAble:1
    */
    private String oprObject;

    /**
    * 
    * isNullAble:1
    */
    private String type;

    /**
    * 
    * isNullAble:1
    */
    private String result;

    /**
    * 
    * isNullAble:1
    */
    private String des;

    /**
    * 
    * isNullAble:1
    */
    private String bizType;

    /**
    * 
    * isNullAble:1
    */
    private String createBy;

    /**
    * 
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime dateCreate;

    /**
    * 
    * isNullAble:1
    */
    private String updateBy;

    /**
    * 
    * isNullAble:0,defaultVal:0000-00-00 00:00:00
    */
    private java.time.LocalDateTime dateUpdate;


    public void setSerialNo(String serialNo){this.serialNo = serialNo;}

    public String getSerialNo(){return this.serialNo;}

    public void setClientIp(String clientIp){this.clientIp = clientIp;}

    public String getClientIp(){return this.clientIp;}

    public void setOprClass(String oprClass){this.oprClass = oprClass;}

    public String getOprClass(){return this.oprClass;}

    public void setOprMethod(String oprMethod){this.oprMethod = oprMethod;}

    public String getOprMethod(){return this.oprMethod;}

    public void setOprObject(String oprObject){this.oprObject = oprObject;}

    public String getOprObject(){return this.oprObject;}

    public void setType(String type){this.type = type;}

    public String getType(){return this.type;}

    public void setResult(String result){this.result = result;}

    public String getResult(){return this.result;}

    public void setDes(String des){this.des = des;}

    public String getDes(){return this.des;}

    public void setBizType(String bizType){this.bizType = bizType;}

    public String getBizType(){return this.bizType;}

    public void setCreateBy(String createBy){this.createBy = createBy;}

    public String getCreateBy(){return this.createBy;}

    public void setDateCreate(java.time.LocalDateTime dateCreate){this.dateCreate = dateCreate;}

    public java.time.LocalDateTime getDateCreate(){return this.dateCreate;}

    public void setUpdateBy(String updateBy){this.updateBy = updateBy;}

    public String getUpdateBy(){return this.updateBy;}

    public void setDateUpdate(java.time.LocalDateTime dateUpdate){this.dateUpdate = dateUpdate;}

    public java.time.LocalDateTime getDateUpdate(){return this.dateUpdate;}
    @Override
    public String toString() {
        return "OpreationRecordInfo{" +
                "serialNo='" + serialNo + '\'' +
                "clientIp='" + clientIp + '\'' +
                "oprClass='" + oprClass + '\'' +
                "oprMethod='" + oprMethod + '\'' +
                "oprObject='" + oprObject + '\'' +
                "type='" + type + '\'' +
                "result='" + result + '\'' +
                "des='" + des + '\'' +
                "bizType='" + bizType + '\'' +
                "createBy='" + createBy + '\'' +
                "dateCreate='" + dateCreate + '\'' +
                "updateBy='" + updateBy + '\'' +
                "dateUpdate='" + dateUpdate + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private OpreationRecordInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(OpreationRecordInfo set){
            this.set = set;
            return this;
        }

        public OpreationRecordInfo getSet(){
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

    public static class QueryBuilder extends OpreationRecordInfo{
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
        private List<String> clientIpList;

        public List<String> getClientIpList(){return this.clientIpList;}


        private List<String> fuzzyClientIp;

        public List<String> getFuzzyClientIp(){return this.fuzzyClientIp;}

        private List<String> rightFuzzyClientIp;

        public List<String> getRightFuzzyClientIp(){return this.rightFuzzyClientIp;}
        private List<String> oprClassList;

        public List<String> getOprClassList(){return this.oprClassList;}


        private List<String> fuzzyOprClass;

        public List<String> getFuzzyOprClass(){return this.fuzzyOprClass;}

        private List<String> rightFuzzyOprClass;

        public List<String> getRightFuzzyOprClass(){return this.rightFuzzyOprClass;}
        private List<String> oprMethodList;

        public List<String> getOprMethodList(){return this.oprMethodList;}


        private List<String> fuzzyOprMethod;

        public List<String> getFuzzyOprMethod(){return this.fuzzyOprMethod;}

        private List<String> rightFuzzyOprMethod;

        public List<String> getRightFuzzyOprMethod(){return this.rightFuzzyOprMethod;}
        private List<String> oprObjectList;

        public List<String> getOprObjectList(){return this.oprObjectList;}


        private List<String> fuzzyOprObject;

        public List<String> getFuzzyOprObject(){return this.fuzzyOprObject;}

        private List<String> rightFuzzyOprObject;

        public List<String> getRightFuzzyOprObject(){return this.rightFuzzyOprObject;}
        private List<String> typeList;

        public List<String> getTypeList(){return this.typeList;}


        private List<String> fuzzyType;

        public List<String> getFuzzyType(){return this.fuzzyType;}

        private List<String> rightFuzzyType;

        public List<String> getRightFuzzyType(){return this.rightFuzzyType;}
        private List<String> resultList;

        public List<String> getResultList(){return this.resultList;}


        private List<String> fuzzyResult;

        public List<String> getFuzzyResult(){return this.fuzzyResult;}

        private List<String> rightFuzzyResult;

        public List<String> getRightFuzzyResult(){return this.rightFuzzyResult;}
        private List<String> desList;

        public List<String> getDesList(){return this.desList;}


        private List<String> fuzzyDes;

        public List<String> getFuzzyDes(){return this.fuzzyDes;}

        private List<String> rightFuzzyDes;

        public List<String> getRightFuzzyDes(){return this.rightFuzzyDes;}
        private List<String> bizTypeList;

        public List<String> getBizTypeList(){return this.bizTypeList;}


        private List<String> fuzzyBizType;

        public List<String> getFuzzyBizType(){return this.fuzzyBizType;}

        private List<String> rightFuzzyBizType;

        public List<String> getRightFuzzyBizType(){return this.rightFuzzyBizType;}
        private List<String> createByList;

        public List<String> getCreateByList(){return this.createByList;}


        private List<String> fuzzyCreateBy;

        public List<String> getFuzzyCreateBy(){return this.fuzzyCreateBy;}

        private List<String> rightFuzzyCreateBy;

        public List<String> getRightFuzzyCreateBy(){return this.rightFuzzyCreateBy;}
        private List<java.time.LocalDateTime> dateCreateList;

        public List<java.time.LocalDateTime> getDateCreateList(){return this.dateCreateList;}

        private java.time.LocalDateTime dateCreateSt;

        private java.time.LocalDateTime dateCreateEd;

        public java.time.LocalDateTime getDateCreateSt(){return this.dateCreateSt;}

        public java.time.LocalDateTime getDateCreateEd(){return this.dateCreateEd;}

        private List<String> updateByList;

        public List<String> getUpdateByList(){return this.updateByList;}


        private List<String> fuzzyUpdateBy;

        public List<String> getFuzzyUpdateBy(){return this.fuzzyUpdateBy;}

        private List<String> rightFuzzyUpdateBy;

        public List<String> getRightFuzzyUpdateBy(){return this.rightFuzzyUpdateBy;}
        private List<java.time.LocalDateTime> dateUpdateList;

        public List<java.time.LocalDateTime> getDateUpdateList(){return this.dateUpdateList;}

        private java.time.LocalDateTime dateUpdateSt;

        private java.time.LocalDateTime dateUpdateEd;

        public java.time.LocalDateTime getDateUpdateSt(){return this.dateUpdateSt;}

        public java.time.LocalDateTime getDateUpdateEd(){return this.dateUpdateEd;}

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

        public QueryBuilder fuzzyOprClass (List<String> fuzzyOprClass){
            this.fuzzyOprClass = fuzzyOprClass;
            return this;
        }

        public QueryBuilder fuzzyOprClass (String ... fuzzyOprClass){
            this.fuzzyOprClass = solveNullList(fuzzyOprClass);
            return this;
        }

        public QueryBuilder rightFuzzyOprClass (List<String> rightFuzzyOprClass){
            this.rightFuzzyOprClass = rightFuzzyOprClass;
            return this;
        }

        public QueryBuilder rightFuzzyOprClass (String ... rightFuzzyOprClass){
            this.rightFuzzyOprClass = solveNullList(rightFuzzyOprClass);
            return this;
        }

        public QueryBuilder oprClass(String oprClass){
            setOprClass(oprClass);
            return this;
        }

        public QueryBuilder oprClassList(String ... oprClass){
            this.oprClassList = solveNullList(oprClass);
            return this;
        }

        public QueryBuilder oprClassList(List<String> oprClass){
            this.oprClassList = oprClass;
            return this;
        }

        public QueryBuilder fetchOprClass(){
            setFetchFields("fetchFields","oprClass");
            return this;
        }

        public QueryBuilder excludeOprClass(){
            setFetchFields("excludeFields","oprClass");
            return this;
        }

        public QueryBuilder fuzzyOprMethod (List<String> fuzzyOprMethod){
            this.fuzzyOprMethod = fuzzyOprMethod;
            return this;
        }

        public QueryBuilder fuzzyOprMethod (String ... fuzzyOprMethod){
            this.fuzzyOprMethod = solveNullList(fuzzyOprMethod);
            return this;
        }

        public QueryBuilder rightFuzzyOprMethod (List<String> rightFuzzyOprMethod){
            this.rightFuzzyOprMethod = rightFuzzyOprMethod;
            return this;
        }

        public QueryBuilder rightFuzzyOprMethod (String ... rightFuzzyOprMethod){
            this.rightFuzzyOprMethod = solveNullList(rightFuzzyOprMethod);
            return this;
        }

        public QueryBuilder oprMethod(String oprMethod){
            setOprMethod(oprMethod);
            return this;
        }

        public QueryBuilder oprMethodList(String ... oprMethod){
            this.oprMethodList = solveNullList(oprMethod);
            return this;
        }

        public QueryBuilder oprMethodList(List<String> oprMethod){
            this.oprMethodList = oprMethod;
            return this;
        }

        public QueryBuilder fetchOprMethod(){
            setFetchFields("fetchFields","oprMethod");
            return this;
        }

        public QueryBuilder excludeOprMethod(){
            setFetchFields("excludeFields","oprMethod");
            return this;
        }

        public QueryBuilder fuzzyOprObject (List<String> fuzzyOprObject){
            this.fuzzyOprObject = fuzzyOprObject;
            return this;
        }

        public QueryBuilder fuzzyOprObject (String ... fuzzyOprObject){
            this.fuzzyOprObject = solveNullList(fuzzyOprObject);
            return this;
        }

        public QueryBuilder rightFuzzyOprObject (List<String> rightFuzzyOprObject){
            this.rightFuzzyOprObject = rightFuzzyOprObject;
            return this;
        }

        public QueryBuilder rightFuzzyOprObject (String ... rightFuzzyOprObject){
            this.rightFuzzyOprObject = solveNullList(rightFuzzyOprObject);
            return this;
        }

        public QueryBuilder oprObject(String oprObject){
            setOprObject(oprObject);
            return this;
        }

        public QueryBuilder oprObjectList(String ... oprObject){
            this.oprObjectList = solveNullList(oprObject);
            return this;
        }

        public QueryBuilder oprObjectList(List<String> oprObject){
            this.oprObjectList = oprObject;
            return this;
        }

        public QueryBuilder fetchOprObject(){
            setFetchFields("fetchFields","oprObject");
            return this;
        }

        public QueryBuilder excludeOprObject(){
            setFetchFields("excludeFields","oprObject");
            return this;
        }

        public QueryBuilder fuzzyType (List<String> fuzzyType){
            this.fuzzyType = fuzzyType;
            return this;
        }

        public QueryBuilder fuzzyType (String ... fuzzyType){
            this.fuzzyType = solveNullList(fuzzyType);
            return this;
        }

        public QueryBuilder rightFuzzyType (List<String> rightFuzzyType){
            this.rightFuzzyType = rightFuzzyType;
            return this;
        }

        public QueryBuilder rightFuzzyType (String ... rightFuzzyType){
            this.rightFuzzyType = solveNullList(rightFuzzyType);
            return this;
        }

        public QueryBuilder type(String type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(String ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<String> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }

        public QueryBuilder fuzzyResult (List<String> fuzzyResult){
            this.fuzzyResult = fuzzyResult;
            return this;
        }

        public QueryBuilder fuzzyResult (String ... fuzzyResult){
            this.fuzzyResult = solveNullList(fuzzyResult);
            return this;
        }

        public QueryBuilder rightFuzzyResult (List<String> rightFuzzyResult){
            this.rightFuzzyResult = rightFuzzyResult;
            return this;
        }

        public QueryBuilder rightFuzzyResult (String ... rightFuzzyResult){
            this.rightFuzzyResult = solveNullList(rightFuzzyResult);
            return this;
        }

        public QueryBuilder result(String result){
            setResult(result);
            return this;
        }

        public QueryBuilder resultList(String ... result){
            this.resultList = solveNullList(result);
            return this;
        }

        public QueryBuilder resultList(List<String> result){
            this.resultList = result;
            return this;
        }

        public QueryBuilder fetchResult(){
            setFetchFields("fetchFields","result");
            return this;
        }

        public QueryBuilder excludeResult(){
            setFetchFields("excludeFields","result");
            return this;
        }

        public QueryBuilder fuzzyDes (List<String> fuzzyDes){
            this.fuzzyDes = fuzzyDes;
            return this;
        }

        public QueryBuilder fuzzyDes (String ... fuzzyDes){
            this.fuzzyDes = solveNullList(fuzzyDes);
            return this;
        }

        public QueryBuilder rightFuzzyDes (List<String> rightFuzzyDes){
            this.rightFuzzyDes = rightFuzzyDes;
            return this;
        }

        public QueryBuilder rightFuzzyDes (String ... rightFuzzyDes){
            this.rightFuzzyDes = solveNullList(rightFuzzyDes);
            return this;
        }

        public QueryBuilder des(String des){
            setDes(des);
            return this;
        }

        public QueryBuilder desList(String ... des){
            this.desList = solveNullList(des);
            return this;
        }

        public QueryBuilder desList(List<String> des){
            this.desList = des;
            return this;
        }

        public QueryBuilder fetchDes(){
            setFetchFields("fetchFields","des");
            return this;
        }

        public QueryBuilder excludeDes(){
            setFetchFields("excludeFields","des");
            return this;
        }

        public QueryBuilder fuzzyBizType (List<String> fuzzyBizType){
            this.fuzzyBizType = fuzzyBizType;
            return this;
        }

        public QueryBuilder fuzzyBizType (String ... fuzzyBizType){
            this.fuzzyBizType = solveNullList(fuzzyBizType);
            return this;
        }

        public QueryBuilder rightFuzzyBizType (List<String> rightFuzzyBizType){
            this.rightFuzzyBizType = rightFuzzyBizType;
            return this;
        }

        public QueryBuilder rightFuzzyBizType (String ... rightFuzzyBizType){
            this.rightFuzzyBizType = solveNullList(rightFuzzyBizType);
            return this;
        }

        public QueryBuilder bizType(String bizType){
            setBizType(bizType);
            return this;
        }

        public QueryBuilder bizTypeList(String ... bizType){
            this.bizTypeList = solveNullList(bizType);
            return this;
        }

        public QueryBuilder bizTypeList(List<String> bizType){
            this.bizTypeList = bizType;
            return this;
        }

        public QueryBuilder fetchBizType(){
            setFetchFields("fetchFields","bizType");
            return this;
        }

        public QueryBuilder excludeBizType(){
            setFetchFields("excludeFields","bizType");
            return this;
        }

        public QueryBuilder fuzzyCreateBy (List<String> fuzzyCreateBy){
            this.fuzzyCreateBy = fuzzyCreateBy;
            return this;
        }

        public QueryBuilder fuzzyCreateBy (String ... fuzzyCreateBy){
            this.fuzzyCreateBy = solveNullList(fuzzyCreateBy);
            return this;
        }

        public QueryBuilder rightFuzzyCreateBy (List<String> rightFuzzyCreateBy){
            this.rightFuzzyCreateBy = rightFuzzyCreateBy;
            return this;
        }

        public QueryBuilder rightFuzzyCreateBy (String ... rightFuzzyCreateBy){
            this.rightFuzzyCreateBy = solveNullList(rightFuzzyCreateBy);
            return this;
        }

        public QueryBuilder createBy(String createBy){
            setCreateBy(createBy);
            return this;
        }

        public QueryBuilder createByList(String ... createBy){
            this.createByList = solveNullList(createBy);
            return this;
        }

        public QueryBuilder createByList(List<String> createBy){
            this.createByList = createBy;
            return this;
        }

        public QueryBuilder fetchCreateBy(){
            setFetchFields("fetchFields","createBy");
            return this;
        }

        public QueryBuilder excludeCreateBy(){
            setFetchFields("excludeFields","createBy");
            return this;
        }

        public QueryBuilder dateCreateBetWeen(java.time.LocalDateTime dateCreateSt,java.time.LocalDateTime dateCreateEd){
            this.dateCreateSt = dateCreateSt;
            this.dateCreateEd = dateCreateEd;
            return this;
        }

        public QueryBuilder dateCreateGreaterEqThan(java.time.LocalDateTime dateCreateSt){
            this.dateCreateSt = dateCreateSt;
            return this;
        }
        public QueryBuilder dateCreateLessEqThan(java.time.LocalDateTime dateCreateEd){
            this.dateCreateEd = dateCreateEd;
            return this;
        }


        public QueryBuilder dateCreate(java.time.LocalDateTime dateCreate){
            setDateCreate(dateCreate);
            return this;
        }

        public QueryBuilder dateCreateList(java.time.LocalDateTime ... dateCreate){
            this.dateCreateList = solveNullList(dateCreate);
            return this;
        }

        public QueryBuilder dateCreateList(List<java.time.LocalDateTime> dateCreate){
            this.dateCreateList = dateCreate;
            return this;
        }

        public QueryBuilder fetchDateCreate(){
            setFetchFields("fetchFields","dateCreate");
            return this;
        }

        public QueryBuilder excludeDateCreate(){
            setFetchFields("excludeFields","dateCreate");
            return this;
        }

        public QueryBuilder fuzzyUpdateBy (List<String> fuzzyUpdateBy){
            this.fuzzyUpdateBy = fuzzyUpdateBy;
            return this;
        }

        public QueryBuilder fuzzyUpdateBy (String ... fuzzyUpdateBy){
            this.fuzzyUpdateBy = solveNullList(fuzzyUpdateBy);
            return this;
        }

        public QueryBuilder rightFuzzyUpdateBy (List<String> rightFuzzyUpdateBy){
            this.rightFuzzyUpdateBy = rightFuzzyUpdateBy;
            return this;
        }

        public QueryBuilder rightFuzzyUpdateBy (String ... rightFuzzyUpdateBy){
            this.rightFuzzyUpdateBy = solveNullList(rightFuzzyUpdateBy);
            return this;
        }

        public QueryBuilder updateBy(String updateBy){
            setUpdateBy(updateBy);
            return this;
        }

        public QueryBuilder updateByList(String ... updateBy){
            this.updateByList = solveNullList(updateBy);
            return this;
        }

        public QueryBuilder updateByList(List<String> updateBy){
            this.updateByList = updateBy;
            return this;
        }

        public QueryBuilder fetchUpdateBy(){
            setFetchFields("fetchFields","updateBy");
            return this;
        }

        public QueryBuilder excludeUpdateBy(){
            setFetchFields("excludeFields","updateBy");
            return this;
        }

        public QueryBuilder dateUpdateBetWeen(java.time.LocalDateTime dateUpdateSt,java.time.LocalDateTime dateUpdateEd){
            this.dateUpdateSt = dateUpdateSt;
            this.dateUpdateEd = dateUpdateEd;
            return this;
        }

        public QueryBuilder dateUpdateGreaterEqThan(java.time.LocalDateTime dateUpdateSt){
            this.dateUpdateSt = dateUpdateSt;
            return this;
        }
        public QueryBuilder dateUpdateLessEqThan(java.time.LocalDateTime dateUpdateEd){
            this.dateUpdateEd = dateUpdateEd;
            return this;
        }


        public QueryBuilder dateUpdate(java.time.LocalDateTime dateUpdate){
            setDateUpdate(dateUpdate);
            return this;
        }

        public QueryBuilder dateUpdateList(java.time.LocalDateTime ... dateUpdate){
            this.dateUpdateList = solveNullList(dateUpdate);
            return this;
        }

        public QueryBuilder dateUpdateList(List<java.time.LocalDateTime> dateUpdate){
            this.dateUpdateList = dateUpdate;
            return this;
        }

        public QueryBuilder fetchDateUpdate(){
            setFetchFields("fetchFields","dateUpdate");
            return this;
        }

        public QueryBuilder excludeDateUpdate(){
            setFetchFields("excludeFields","dateUpdate");
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

        public OpreationRecordInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> serialNoList;

        public List<String> getSerialNoList(){return this.serialNoList;}


        private List<String> fuzzySerialNo;

        public List<String> getFuzzySerialNo(){return this.fuzzySerialNo;}

        private List<String> rightFuzzySerialNo;

        public List<String> getRightFuzzySerialNo(){return this.rightFuzzySerialNo;}
        private List<String> clientIpList;

        public List<String> getClientIpList(){return this.clientIpList;}


        private List<String> fuzzyClientIp;

        public List<String> getFuzzyClientIp(){return this.fuzzyClientIp;}

        private List<String> rightFuzzyClientIp;

        public List<String> getRightFuzzyClientIp(){return this.rightFuzzyClientIp;}
        private List<String> oprClassList;

        public List<String> getOprClassList(){return this.oprClassList;}


        private List<String> fuzzyOprClass;

        public List<String> getFuzzyOprClass(){return this.fuzzyOprClass;}

        private List<String> rightFuzzyOprClass;

        public List<String> getRightFuzzyOprClass(){return this.rightFuzzyOprClass;}
        private List<String> oprMethodList;

        public List<String> getOprMethodList(){return this.oprMethodList;}


        private List<String> fuzzyOprMethod;

        public List<String> getFuzzyOprMethod(){return this.fuzzyOprMethod;}

        private List<String> rightFuzzyOprMethod;

        public List<String> getRightFuzzyOprMethod(){return this.rightFuzzyOprMethod;}
        private List<String> oprObjectList;

        public List<String> getOprObjectList(){return this.oprObjectList;}


        private List<String> fuzzyOprObject;

        public List<String> getFuzzyOprObject(){return this.fuzzyOprObject;}

        private List<String> rightFuzzyOprObject;

        public List<String> getRightFuzzyOprObject(){return this.rightFuzzyOprObject;}
        private List<String> typeList;

        public List<String> getTypeList(){return this.typeList;}


        private List<String> fuzzyType;

        public List<String> getFuzzyType(){return this.fuzzyType;}

        private List<String> rightFuzzyType;

        public List<String> getRightFuzzyType(){return this.rightFuzzyType;}
        private List<String> resultList;

        public List<String> getResultList(){return this.resultList;}


        private List<String> fuzzyResult;

        public List<String> getFuzzyResult(){return this.fuzzyResult;}

        private List<String> rightFuzzyResult;

        public List<String> getRightFuzzyResult(){return this.rightFuzzyResult;}
        private List<String> desList;

        public List<String> getDesList(){return this.desList;}


        private List<String> fuzzyDes;

        public List<String> getFuzzyDes(){return this.fuzzyDes;}

        private List<String> rightFuzzyDes;

        public List<String> getRightFuzzyDes(){return this.rightFuzzyDes;}
        private List<String> bizTypeList;

        public List<String> getBizTypeList(){return this.bizTypeList;}


        private List<String> fuzzyBizType;

        public List<String> getFuzzyBizType(){return this.fuzzyBizType;}

        private List<String> rightFuzzyBizType;

        public List<String> getRightFuzzyBizType(){return this.rightFuzzyBizType;}
        private List<String> createByList;

        public List<String> getCreateByList(){return this.createByList;}


        private List<String> fuzzyCreateBy;

        public List<String> getFuzzyCreateBy(){return this.fuzzyCreateBy;}

        private List<String> rightFuzzyCreateBy;

        public List<String> getRightFuzzyCreateBy(){return this.rightFuzzyCreateBy;}
        private List<java.time.LocalDateTime> dateCreateList;

        public List<java.time.LocalDateTime> getDateCreateList(){return this.dateCreateList;}

        private java.time.LocalDateTime dateCreateSt;

        private java.time.LocalDateTime dateCreateEd;

        public java.time.LocalDateTime getDateCreateSt(){return this.dateCreateSt;}

        public java.time.LocalDateTime getDateCreateEd(){return this.dateCreateEd;}

        private List<String> updateByList;

        public List<String> getUpdateByList(){return this.updateByList;}


        private List<String> fuzzyUpdateBy;

        public List<String> getFuzzyUpdateBy(){return this.fuzzyUpdateBy;}

        private List<String> rightFuzzyUpdateBy;

        public List<String> getRightFuzzyUpdateBy(){return this.rightFuzzyUpdateBy;}
        private List<java.time.LocalDateTime> dateUpdateList;

        public List<java.time.LocalDateTime> getDateUpdateList(){return this.dateUpdateList;}

        private java.time.LocalDateTime dateUpdateSt;

        private java.time.LocalDateTime dateUpdateEd;

        public java.time.LocalDateTime getDateUpdateSt(){return this.dateUpdateSt;}

        public java.time.LocalDateTime getDateUpdateEd(){return this.dateUpdateEd;}


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

        public ConditionBuilder fuzzyOprClass (List<String> fuzzyOprClass){
            this.fuzzyOprClass = fuzzyOprClass;
            return this;
        }

        public ConditionBuilder fuzzyOprClass (String ... fuzzyOprClass){
            this.fuzzyOprClass = solveNullList(fuzzyOprClass);
            return this;
        }

        public ConditionBuilder rightFuzzyOprClass (List<String> rightFuzzyOprClass){
            this.rightFuzzyOprClass = rightFuzzyOprClass;
            return this;
        }

        public ConditionBuilder rightFuzzyOprClass (String ... rightFuzzyOprClass){
            this.rightFuzzyOprClass = solveNullList(rightFuzzyOprClass);
            return this;
        }

        public ConditionBuilder oprClassList(String ... oprClass){
            this.oprClassList = solveNullList(oprClass);
            return this;
        }

        public ConditionBuilder oprClassList(List<String> oprClass){
            this.oprClassList = oprClass;
            return this;
        }

        public ConditionBuilder fuzzyOprMethod (List<String> fuzzyOprMethod){
            this.fuzzyOprMethod = fuzzyOprMethod;
            return this;
        }

        public ConditionBuilder fuzzyOprMethod (String ... fuzzyOprMethod){
            this.fuzzyOprMethod = solveNullList(fuzzyOprMethod);
            return this;
        }

        public ConditionBuilder rightFuzzyOprMethod (List<String> rightFuzzyOprMethod){
            this.rightFuzzyOprMethod = rightFuzzyOprMethod;
            return this;
        }

        public ConditionBuilder rightFuzzyOprMethod (String ... rightFuzzyOprMethod){
            this.rightFuzzyOprMethod = solveNullList(rightFuzzyOprMethod);
            return this;
        }

        public ConditionBuilder oprMethodList(String ... oprMethod){
            this.oprMethodList = solveNullList(oprMethod);
            return this;
        }

        public ConditionBuilder oprMethodList(List<String> oprMethod){
            this.oprMethodList = oprMethod;
            return this;
        }

        public ConditionBuilder fuzzyOprObject (List<String> fuzzyOprObject){
            this.fuzzyOprObject = fuzzyOprObject;
            return this;
        }

        public ConditionBuilder fuzzyOprObject (String ... fuzzyOprObject){
            this.fuzzyOprObject = solveNullList(fuzzyOprObject);
            return this;
        }

        public ConditionBuilder rightFuzzyOprObject (List<String> rightFuzzyOprObject){
            this.rightFuzzyOprObject = rightFuzzyOprObject;
            return this;
        }

        public ConditionBuilder rightFuzzyOprObject (String ... rightFuzzyOprObject){
            this.rightFuzzyOprObject = solveNullList(rightFuzzyOprObject);
            return this;
        }

        public ConditionBuilder oprObjectList(String ... oprObject){
            this.oprObjectList = solveNullList(oprObject);
            return this;
        }

        public ConditionBuilder oprObjectList(List<String> oprObject){
            this.oprObjectList = oprObject;
            return this;
        }

        public ConditionBuilder fuzzyType (List<String> fuzzyType){
            this.fuzzyType = fuzzyType;
            return this;
        }

        public ConditionBuilder fuzzyType (String ... fuzzyType){
            this.fuzzyType = solveNullList(fuzzyType);
            return this;
        }

        public ConditionBuilder rightFuzzyType (List<String> rightFuzzyType){
            this.rightFuzzyType = rightFuzzyType;
            return this;
        }

        public ConditionBuilder rightFuzzyType (String ... rightFuzzyType){
            this.rightFuzzyType = solveNullList(rightFuzzyType);
            return this;
        }

        public ConditionBuilder typeList(String ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<String> type){
            this.typeList = type;
            return this;
        }

        public ConditionBuilder fuzzyResult (List<String> fuzzyResult){
            this.fuzzyResult = fuzzyResult;
            return this;
        }

        public ConditionBuilder fuzzyResult (String ... fuzzyResult){
            this.fuzzyResult = solveNullList(fuzzyResult);
            return this;
        }

        public ConditionBuilder rightFuzzyResult (List<String> rightFuzzyResult){
            this.rightFuzzyResult = rightFuzzyResult;
            return this;
        }

        public ConditionBuilder rightFuzzyResult (String ... rightFuzzyResult){
            this.rightFuzzyResult = solveNullList(rightFuzzyResult);
            return this;
        }

        public ConditionBuilder resultList(String ... result){
            this.resultList = solveNullList(result);
            return this;
        }

        public ConditionBuilder resultList(List<String> result){
            this.resultList = result;
            return this;
        }

        public ConditionBuilder fuzzyDes (List<String> fuzzyDes){
            this.fuzzyDes = fuzzyDes;
            return this;
        }

        public ConditionBuilder fuzzyDes (String ... fuzzyDes){
            this.fuzzyDes = solveNullList(fuzzyDes);
            return this;
        }

        public ConditionBuilder rightFuzzyDes (List<String> rightFuzzyDes){
            this.rightFuzzyDes = rightFuzzyDes;
            return this;
        }

        public ConditionBuilder rightFuzzyDes (String ... rightFuzzyDes){
            this.rightFuzzyDes = solveNullList(rightFuzzyDes);
            return this;
        }

        public ConditionBuilder desList(String ... des){
            this.desList = solveNullList(des);
            return this;
        }

        public ConditionBuilder desList(List<String> des){
            this.desList = des;
            return this;
        }

        public ConditionBuilder fuzzyBizType (List<String> fuzzyBizType){
            this.fuzzyBizType = fuzzyBizType;
            return this;
        }

        public ConditionBuilder fuzzyBizType (String ... fuzzyBizType){
            this.fuzzyBizType = solveNullList(fuzzyBizType);
            return this;
        }

        public ConditionBuilder rightFuzzyBizType (List<String> rightFuzzyBizType){
            this.rightFuzzyBizType = rightFuzzyBizType;
            return this;
        }

        public ConditionBuilder rightFuzzyBizType (String ... rightFuzzyBizType){
            this.rightFuzzyBizType = solveNullList(rightFuzzyBizType);
            return this;
        }

        public ConditionBuilder bizTypeList(String ... bizType){
            this.bizTypeList = solveNullList(bizType);
            return this;
        }

        public ConditionBuilder bizTypeList(List<String> bizType){
            this.bizTypeList = bizType;
            return this;
        }

        public ConditionBuilder fuzzyCreateBy (List<String> fuzzyCreateBy){
            this.fuzzyCreateBy = fuzzyCreateBy;
            return this;
        }

        public ConditionBuilder fuzzyCreateBy (String ... fuzzyCreateBy){
            this.fuzzyCreateBy = solveNullList(fuzzyCreateBy);
            return this;
        }

        public ConditionBuilder rightFuzzyCreateBy (List<String> rightFuzzyCreateBy){
            this.rightFuzzyCreateBy = rightFuzzyCreateBy;
            return this;
        }

        public ConditionBuilder rightFuzzyCreateBy (String ... rightFuzzyCreateBy){
            this.rightFuzzyCreateBy = solveNullList(rightFuzzyCreateBy);
            return this;
        }

        public ConditionBuilder createByList(String ... createBy){
            this.createByList = solveNullList(createBy);
            return this;
        }

        public ConditionBuilder createByList(List<String> createBy){
            this.createByList = createBy;
            return this;
        }

        public ConditionBuilder dateCreateBetWeen(java.time.LocalDateTime dateCreateSt,java.time.LocalDateTime dateCreateEd){
            this.dateCreateSt = dateCreateSt;
            this.dateCreateEd = dateCreateEd;
            return this;
        }

        public ConditionBuilder dateCreateGreaterEqThan(java.time.LocalDateTime dateCreateSt){
            this.dateCreateSt = dateCreateSt;
            return this;
        }
        public ConditionBuilder dateCreateLessEqThan(java.time.LocalDateTime dateCreateEd){
            this.dateCreateEd = dateCreateEd;
            return this;
        }


        public ConditionBuilder dateCreateList(java.time.LocalDateTime ... dateCreate){
            this.dateCreateList = solveNullList(dateCreate);
            return this;
        }

        public ConditionBuilder dateCreateList(List<java.time.LocalDateTime> dateCreate){
            this.dateCreateList = dateCreate;
            return this;
        }

        public ConditionBuilder fuzzyUpdateBy (List<String> fuzzyUpdateBy){
            this.fuzzyUpdateBy = fuzzyUpdateBy;
            return this;
        }

        public ConditionBuilder fuzzyUpdateBy (String ... fuzzyUpdateBy){
            this.fuzzyUpdateBy = solveNullList(fuzzyUpdateBy);
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateBy (List<String> rightFuzzyUpdateBy){
            this.rightFuzzyUpdateBy = rightFuzzyUpdateBy;
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateBy (String ... rightFuzzyUpdateBy){
            this.rightFuzzyUpdateBy = solveNullList(rightFuzzyUpdateBy);
            return this;
        }

        public ConditionBuilder updateByList(String ... updateBy){
            this.updateByList = solveNullList(updateBy);
            return this;
        }

        public ConditionBuilder updateByList(List<String> updateBy){
            this.updateByList = updateBy;
            return this;
        }

        public ConditionBuilder dateUpdateBetWeen(java.time.LocalDateTime dateUpdateSt,java.time.LocalDateTime dateUpdateEd){
            this.dateUpdateSt = dateUpdateSt;
            this.dateUpdateEd = dateUpdateEd;
            return this;
        }

        public ConditionBuilder dateUpdateGreaterEqThan(java.time.LocalDateTime dateUpdateSt){
            this.dateUpdateSt = dateUpdateSt;
            return this;
        }
        public ConditionBuilder dateUpdateLessEqThan(java.time.LocalDateTime dateUpdateEd){
            this.dateUpdateEd = dateUpdateEd;
            return this;
        }


        public ConditionBuilder dateUpdateList(java.time.LocalDateTime ... dateUpdate){
            this.dateUpdateList = solveNullList(dateUpdate);
            return this;
        }

        public ConditionBuilder dateUpdateList(List<java.time.LocalDateTime> dateUpdate){
            this.dateUpdateList = dateUpdate;
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

        private OpreationRecordInfo obj;

        public Builder(){
            this.obj = new OpreationRecordInfo();
        }

        public Builder serialNo(String serialNo){
            this.obj.setSerialNo(serialNo);
            return this;
        }
        public Builder clientIp(String clientIp){
            this.obj.setClientIp(clientIp);
            return this;
        }
        public Builder oprClass(String oprClass){
            this.obj.setOprClass(oprClass);
            return this;
        }
        public Builder oprMethod(String oprMethod){
            this.obj.setOprMethod(oprMethod);
            return this;
        }
        public Builder oprObject(String oprObject){
            this.obj.setOprObject(oprObject);
            return this;
        }
        public Builder type(String type){
            this.obj.setType(type);
            return this;
        }
        public Builder result(String result){
            this.obj.setResult(result);
            return this;
        }
        public Builder des(String des){
            this.obj.setDes(des);
            return this;
        }
        public Builder bizType(String bizType){
            this.obj.setBizType(bizType);
            return this;
        }
        public Builder createBy(String createBy){
            this.obj.setCreateBy(createBy);
            return this;
        }
        public Builder dateCreate(java.time.LocalDateTime dateCreate){
            this.obj.setDateCreate(dateCreate);
            return this;
        }
        public Builder updateBy(String updateBy){
            this.obj.setUpdateBy(updateBy);
            return this;
        }
        public Builder dateUpdate(java.time.LocalDateTime dateUpdate){
            this.obj.setDateUpdate(dateUpdate);
            return this;
        }
        public OpreationRecordInfo build(){return obj;}
    }

}
