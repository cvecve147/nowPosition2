package com.openlife.checkme.p097f;

import com.openlife.checkme.net.model.ActivityBody;
import com.openlife.checkme.net.model.ActivityResponse;
import com.openlife.checkme.net.model.AuthLoginBody;
import com.openlife.checkme.net.model.AuthLoginMigrateBody;
import com.openlife.checkme.net.model.BeaconListBody;
import com.openlife.checkme.net.model.BeaconListResponse;
import com.openlife.checkme.net.model.BeaconNotificationBody;
import com.openlife.checkme.net.model.BeaconNotificationResponse;
import com.openlife.checkme.net.model.ChainStoreListBody;
import com.openlife.checkme.net.model.ChainStoreListResponse;
import com.openlife.checkme.net.model.CheckUpdateBody;
import com.openlife.checkme.net.model.CheckUpdateResponse;
import com.openlife.checkme.net.model.CompanyMissionResponse;
import com.openlife.checkme.net.model.FbLoginBody;
import com.openlife.checkme.net.model.FbLoginMigrateBody;
import com.openlife.checkme.net.model.GiftAdBody;
import com.openlife.checkme.net.model.GiftAdResponse;
import com.openlife.checkme.net.model.GiftDetailBody;
import com.openlife.checkme.net.model.GiftDetailResponse;
import com.openlife.checkme.net.model.GiftListBody;
import com.openlife.checkme.net.model.GiftListResponse;
import com.openlife.checkme.net.model.HomeAdBody;
import com.openlife.checkme.net.model.HomeAdResponse;
import com.openlife.checkme.net.model.HomeInfoBody;
import com.openlife.checkme.net.model.HomeInfoResponse;
import com.openlife.checkme.net.model.LoginMigrateResponse;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.MissionAdBody;
import com.openlife.checkme.net.model.MissionAdResponse;
import com.openlife.checkme.net.model.MissionCommitBody;
import com.openlife.checkme.net.model.MissionCommitResponse;
import com.openlife.checkme.net.model.MissionDetailBody;
import com.openlife.checkme.net.model.MissionDetailResponse;
import com.openlife.checkme.net.model.MissionExecuteBody;
import com.openlife.checkme.net.model.MissionExecuteResponse;
import com.openlife.checkme.net.model.MissionListBody;
import com.openlife.checkme.net.model.MissionListResponse;
import com.openlife.checkme.net.model.MissionLocationBody;
import com.openlife.checkme.net.model.MissionLocationResponse;
import com.openlife.checkme.net.model.MobileUpdateBody;
import com.openlife.checkme.net.model.MobileUpdateResponse;
import com.openlife.checkme.net.model.PointBody;
import com.openlife.checkme.net.model.PointHistoryBody;
import com.openlife.checkme.net.model.PointHistoryResponse;
import com.openlife.checkme.net.model.PointResponse;
import com.openlife.checkme.net.model.RedeemGiftBody;
import com.openlife.checkme.net.model.RedeemGiftResponse;
import com.openlife.checkme.net.model.RedeemHistoryBody;
import com.openlife.checkme.net.model.RedeemHistoryDetailBody;
import com.openlife.checkme.net.model.RedeemHistoryDetailResponse;
import com.openlife.checkme.net.model.RedeemHistoryResponse;
import com.openlife.checkme.net.model.StoreSurroundingBody;
import com.openlife.checkme.net.model.StoreSurroundingResponse;
import com.openlife.checkme.net.model.StreetStoreListBody;
import com.openlife.checkme.net.model.StreetStoreListResponse;
import com.openlife.checkme.net.model.SystemConfigBody;
import com.openlife.checkme.net.model.SystemConfigResponse;
import com.openlife.checkme.net.model.UpdateRedemptionResponse;
import com.openlife.checkme.net.model.UserInfoBody;
import com.openlife.checkme.net.model.UserInfoResponse;
import com.openlife.checkme.net.model.UserInviteCodeBody;
import com.openlife.checkme.net.model.UserInviteCodeResponse;
import com.openlife.checkme.net.model.UserSignInBody;
import com.openlife.checkme.net.model.UserSignInResponse;
import com.openlife.checkme.net.model.VerifyOtpBody;
import com.openlife.checkme.net.model.VerifyOtpResponse;
import p208e.p221b.C6433l;
import p263h.p266b.C6597a;
import p263h.p266b.C6604h;
import p263h.p266b.C6608l;
import p263h.p266b.C6612p;

/* renamed from: com.openlife.checkme.f.a */
public interface C4951a {
    @C6608l("v3/user/serial_used/{id}")
    /* renamed from: a */
    C6433l<UpdateRedemptionResponse> mo13556a(@C6604h("signature") String str, @C6597a C4952b bVar, @C6612p("id") int i);

    @C6608l("v3/activity")
    /* renamed from: a */
    C6433l<ActivityResponse> mo13557a(@C6604h("signature") String str, @C6597a ActivityBody activityBody);

    @C6608l("/v3/user/auth_login")
    /* renamed from: a */
    C6433l<LoginResponse> mo13558a(@C6604h("signature") String str, @C6597a AuthLoginBody authLoginBody);

    @C6608l("/v3/user/auth_login/migrate")
    /* renamed from: a */
    C6433l<LoginMigrateResponse> mo13559a(@C6604h("signature") String str, @C6597a AuthLoginMigrateBody authLoginMigrateBody);

    @C6608l("v3/beacon/list")
    /* renamed from: a */
    C6433l<BeaconListResponse> mo13560a(@C6604h("signature") String str, @C6597a BeaconListBody beaconListBody);

    @C6608l("v3/beacon/notification")
    /* renamed from: a */
    C6433l<BeaconNotificationResponse> mo13561a(@C6604h("signature") String str, @C6597a BeaconNotificationBody beaconNotificationBody);

    @C6608l("v3/assignment/corp_list")
    /* renamed from: a */
    C6433l<ChainStoreListResponse> mo13562a(@C6604h("signature") String str, @C6597a ChainStoreListBody chainStoreListBody);

    @C6608l("v3/system/preload")
    /* renamed from: a */
    C6433l<CheckUpdateResponse> mo13563a(@C6604h("signature") String str, @C6597a CheckUpdateBody checkUpdateBody);

    @C6608l("v3/user/fb_login")
    /* renamed from: a */
    C6433l<LoginResponse> mo13564a(@C6604h("signature") String str, @C6597a FbLoginBody fbLoginBody);

    @C6608l("v3/user/fb_login/migrate")
    /* renamed from: a */
    C6433l<LoginMigrateResponse> mo13565a(@C6604h("signature") String str, @C6597a FbLoginMigrateBody fbLoginMigrateBody);

    @C6608l("v3/gift/promotion")
    /* renamed from: a */
    C6433l<GiftAdResponse> mo13566a(@C6604h("signature") String str, @C6597a GiftAdBody giftAdBody);

    @C6608l("v3/gift/{id}")
    /* renamed from: a */
    C6433l<GiftDetailResponse> mo13567a(@C6604h("signature") String str, @C6597a GiftDetailBody giftDetailBody, @C6612p("id") int i);

    @C6608l("v3/gift/list")
    /* renamed from: a */
    C6433l<GiftListResponse> mo13568a(@C6604h("signature") String str, @C6597a GiftListBody giftListBody);

    @C6608l("v3/home/promotion")
    /* renamed from: a */
    C6433l<HomeAdResponse> mo13569a(@C6604h("signature") String str, @C6597a HomeAdBody homeAdBody);

    @C6608l("v3/home")
    /* renamed from: a */
    C6433l<HomeInfoResponse> mo13570a(@C6604h("signature") String str, @C6597a HomeInfoBody homeInfoBody);

    @C6608l("v3/assignment/promotion")
    /* renamed from: a */
    C6433l<MissionAdResponse> mo13571a(@C6604h("signature") String str, @C6597a MissionAdBody missionAdBody);

    @C6608l("v3/assignment/commit")
    /* renamed from: a */
    C6433l<MissionCommitResponse> mo13572a(@C6604h("signature") String str, @C6597a MissionCommitBody missionCommitBody);

    @C6608l("v3/assignment/detail/{id}")
    /* renamed from: a */
    C6433l<MissionDetailResponse> mo13573a(@C6604h("signature") String str, @C6597a MissionDetailBody missionDetailBody, @C6612p("id") int i);

    @C6608l("v3/assignment/executed")
    /* renamed from: a */
    C6433l<MissionExecuteResponse> mo13574a(@C6604h("signature") String str, @C6597a MissionExecuteBody missionExecuteBody);

    @C6608l("v3/assignment/corp/{id}")
    /* renamed from: a */
    C6433l<MissionListResponse> mo13575a(@C6604h("signature") String str, @C6597a MissionListBody missionListBody, @C6612p("id") int i);

    @C6608l("v3/assignment/map/{id}")
    /* renamed from: a */
    C6433l<MissionLocationResponse> mo13576a(@C6604h("signature") String str, @C6597a MissionLocationBody missionLocationBody, @C6612p("id") int i);

    @C6608l("v3/user/mobile/update")
    /* renamed from: a */
    C6433l<MobileUpdateResponse> mo13577a(@C6604h("signature") String str, @C6597a MobileUpdateBody mobileUpdateBody);

    @C6608l("v3/user/point")
    /* renamed from: a */
    C6433l<PointResponse> mo13578a(@C6604h("signature") String str, @C6597a PointBody pointBody);

    @C6608l("v3/user/transaction")
    /* renamed from: a */
    C6433l<PointHistoryResponse> mo13579a(@C6604h("signature") String str, @C6597a PointHistoryBody pointHistoryBody);

    @C6608l("v3/gift/redeem/{id}")
    /* renamed from: a */
    C6433l<RedeemGiftResponse> mo13580a(@C6604h("signature") String str, @C6597a RedeemGiftBody redeemGiftBody, @C6612p("id") int i);

    @C6608l("v3/user/redeem_record")
    /* renamed from: a */
    C6433l<RedeemHistoryResponse> mo13581a(@C6604h("signature") String str, @C6597a RedeemHistoryBody redeemHistoryBody);

    @C6608l("v3/user/redeem_detail/{id}")
    /* renamed from: a */
    C6433l<RedeemHistoryDetailResponse> mo13582a(@C6604h("signature") String str, @C6597a RedeemHistoryDetailBody redeemHistoryDetailBody, @C6612p("id") int i);

    @C6608l("v3/assignment/surrounding_site")
    /* renamed from: a */
    C6433l<StoreSurroundingResponse> mo13583a(@C6604h("signature") String str, @C6597a StoreSurroundingBody storeSurroundingBody);

    @C6608l("v3/assignment/street_list")
    /* renamed from: a */
    C6433l<StreetStoreListResponse> mo13584a(@C6604h("signature") String str, @C6597a StreetStoreListBody streetStoreListBody);

    @C6608l("v3/system/config")
    /* renamed from: a */
    C6433l<SystemConfigResponse> mo13585a(@C6604h("signature") String str, @C6597a SystemConfigBody systemConfigBody);

    @C6608l("v3/user/info")
    /* renamed from: a */
    C6433l<UserInfoResponse> mo13586a(@C6604h("signature") String str, @C6597a UserInfoBody userInfoBody);

    @C6608l("v3/user/invite_code")
    /* renamed from: a */
    C6433l<UserInviteCodeResponse> mo13587a(@C6604h("signature") String str, @C6597a UserInviteCodeBody userInviteCodeBody);

    @C6608l("v3/user/sign_in")
    /* renamed from: a */
    C6433l<UserSignInResponse> mo13588a(@C6604h("signature") String str, @C6597a UserSignInBody userSignInBody);

    @C6608l("v3/user/mobile/verify_otp")
    /* renamed from: a */
    C6433l<VerifyOtpResponse> mo13589a(@C6604h("signature") String str, @C6597a VerifyOtpBody verifyOtpBody);

    @C6608l("v3/assignment/corp_map/{id}")
    /* renamed from: b */
    C6433l<CompanyMissionResponse> mo13590b(@C6604h("signature") String str, @C6597a MissionLocationBody missionLocationBody, @C6612p("id") int i);
}
