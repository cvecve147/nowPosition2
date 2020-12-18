package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class SystemConfigData {
    @C5598c("about_us")
    private String aboutUs;
    @C5598c("change_account_time")
    private int changeAccountTime;
    @C5598c("customer_service_email")
    private String customerServiceEmail;
    @C5598c("frequently_asked_questions")
    private String frequentlyAskedQuestions;
    @C5598c("migrate_time")
    private int migrateTime;
    @C5598c("privacy_policy")
    private String privacyPolicy;
    @C5598c("terms_of_service")
    private String termsOfService;

    public String getAboutUs() {
        String str = this.aboutUs;
        return str != null ? str : "";
    }

    public int getChangeAccountTime() {
        return this.changeAccountTime;
    }

    public String getCustomerServiceEmail() {
        String str = this.customerServiceEmail;
        return str != null ? str : "";
    }

    public String getFrequentlyAskedQuestions() {
        String str = this.frequentlyAskedQuestions;
        return str != null ? str : "";
    }

    public int getMigrateTime() {
        return this.migrateTime;
    }

    public String getPrivacyPolicy() {
        String str = this.privacyPolicy;
        return str != null ? str : "";
    }

    public String getTermsOfService() {
        String str = this.termsOfService;
        return str != null ? str : "";
    }

    public void setAboutUs(String str) {
        this.aboutUs = str;
    }

    public void setChangeAccountTime(int i) {
        this.changeAccountTime = i;
    }

    public void setCustomerServiceEmail(String str) {
        this.customerServiceEmail = str;
    }

    public void setFrequentlyAskedQuestions(String str) {
        this.frequentlyAskedQuestions = str;
    }

    public void setMigrateTime(int i) {
        this.migrateTime = i;
    }

    public void setPrivacyPolicy(String str) {
        this.privacyPolicy = str;
    }

    public void setTermsOfService(String str) {
        this.termsOfService = str;
    }
}
