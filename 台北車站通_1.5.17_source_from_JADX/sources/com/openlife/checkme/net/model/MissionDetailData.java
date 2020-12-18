package com.openlife.checkme.net.model;

import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p152e.p153a.C5598c;

public class MissionDetailData {
    @C5598c("corp_id")
    private int corpId;
    @C5598c("desc")
    private String desc;
    @C5598c("end_date")
    private String endDate;
    @C5598c("id")

    /* renamed from: id */
    private int f14134id;
    @C5598c("image")
    private List<String> image;
    @C5598c("name")
    private String name;
    @C5598c("notice")
    private String notice;
    @C5598c("point")
    private int point;
    @C5598c("product_desc")
    private String productDesc;
    @C5598c("product_info")
    private List<String> productInfo;
    @C5598c("sensor")
    private List<String> sensor;
    @C5598c("start_date")
    private String startDate;
    @C5598c("status")
    private int status;
    @C5598c("type")
    private int type;

    public int getCorpId() {
        return this.corpId;
    }

    public String getDesc() {
        String str = this.desc;
        return str != null ? str : "";
    }

    public String getEndDate() {
        String str = this.endDate;
        return str != null ? str : "";
    }

    public int getId() {
        return this.f14134id;
    }

    public List<String> getImage() {
        List<String> list = this.image;
        return list != null ? list : new ArrayList();
    }

    public String getName() {
        String str = this.name;
        return str != null ? str : "";
    }

    public String getNotice() {
        String str = this.notice;
        return str != null ? str : "";
    }

    public int getPoint() {
        return this.point;
    }

    public String getPointStr() {
        return String.valueOf(this.point);
    }

    public String getProductDesc() {
        String str = this.productDesc;
        return str != null ? str : "";
    }

    public List<String> getProductInfo() {
        List<String> list = this.productInfo;
        return list != null ? list : new ArrayList();
    }

    public List<String> getSensor() {
        List<String> list = this.sensor;
        return list != null ? list : new ArrayList();
    }

    public String getStartDate() {
        return this.startDate;
    }

    public int getStatus() {
        return this.status;
    }

    public int getType() {
        return this.type;
    }

    public void setCorpId(int i) {
        this.corpId = i;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEndDate(String str) {
        this.endDate = str;
    }

    public void setId(int i) {
        this.f14134id = i;
    }

    public void setImage(List<String> list) {
        this.image = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNotice(String str) {
        this.notice = str;
    }

    public void setPoint(int i) {
        this.point = i;
    }

    public void setProductDesc(String str) {
        this.productDesc = str;
    }

    public void setProductInfo(List<String> list) {
        this.productInfo = list;
    }

    public void setStartDate(String str) {
        this.startDate = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setType(int i) {
        this.type = i;
    }
}
