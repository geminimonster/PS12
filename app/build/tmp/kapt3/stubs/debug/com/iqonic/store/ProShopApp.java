package com.iqonic.store;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/iqonic/store/ProShopApp;", "Landroidx/multidex/MultiDexApplication;", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "Companion", "app_debug"})
public final class ProShopApp extends androidx.multidex.MultiDexApplication {
    @org.jetbrains.annotations.NotNull()
    public static com.iqonic.store.utils.LocaleManager localeManager;
    private static com.iqonic.store.ProShopApp appInstance;
    @org.jetbrains.annotations.Nullable()
    private static com.iqonic.store.utils.SharedPrefUtils sharedPrefUtils;
    @org.jetbrains.annotations.Nullable()
    private static android.app.Dialog noInternetDialog;
    @org.jetbrains.annotations.Nullable()
    private static com.iqonic.store.network.RestApiImpl restApiImpl;
    @org.jetbrains.annotations.NotNull()
    public static java.lang.String language;
    private static int appTheme = 0;
    @org.jetbrains.annotations.NotNull()
    public static com.iqonic.store.models.DashBoardResponse mAppData;
    private static boolean mModeFlag = false;
    public static final com.iqonic.store.ProShopApp.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    public ProShopApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u001eJ\u000e\u00108\u001a\u0002062\u0006\u00109\u001a\u00020\fJ\u0006\u0010:\u001a\u00020\u0004J\b\u0010;\u001a\u000206H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u00a8\u0006<"}, d2 = {"Lcom/iqonic/store/ProShopApp$Companion;", "", "()V", "appInstance", "Lcom/iqonic/store/ProShopApp;", "appTheme", "", "getAppTheme", "()I", "setAppTheme", "(I)V", "language", "", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "localeManager", "Lcom/iqonic/store/utils/LocaleManager;", "getLocaleManager", "()Lcom/iqonic/store/utils/LocaleManager;", "setLocaleManager", "(Lcom/iqonic/store/utils/LocaleManager;)V", "mAppData", "Lcom/iqonic/store/models/DashBoardResponse;", "getMAppData", "()Lcom/iqonic/store/models/DashBoardResponse;", "setMAppData", "(Lcom/iqonic/store/models/DashBoardResponse;)V", "mModeFlag", "", "getMModeFlag", "()Z", "setMModeFlag", "(Z)V", "noInternetDialog", "Landroid/app/Dialog;", "getNoInternetDialog", "()Landroid/app/Dialog;", "setNoInternetDialog", "(Landroid/app/Dialog;)V", "restApiImpl", "Lcom/iqonic/store/network/RestApiImpl;", "getRestApiImpl", "()Lcom/iqonic/store/network/RestApiImpl;", "setRestApiImpl", "(Lcom/iqonic/store/network/RestApiImpl;)V", "sharedPrefUtils", "Lcom/iqonic/store/utils/SharedPrefUtils;", "getSharedPrefUtils", "()Lcom/iqonic/store/utils/SharedPrefUtils;", "setSharedPrefUtils", "(Lcom/iqonic/store/utils/SharedPrefUtils;)V", "changeAppTheme", "", "isDark", "changeLanguage", "aLanguage", "getAppInstance", "mAppDataChanges", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.store.utils.LocaleManager getLocaleManager() {
            return null;
        }
        
        public final void setLocaleManager(@org.jetbrains.annotations.NotNull()
        com.iqonic.store.utils.LocaleManager p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.iqonic.store.utils.SharedPrefUtils getSharedPrefUtils() {
            return null;
        }
        
        public final void setSharedPrefUtils(@org.jetbrains.annotations.Nullable()
        com.iqonic.store.utils.SharedPrefUtils p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.app.Dialog getNoInternetDialog() {
            return null;
        }
        
        public final void setNoInternetDialog(@org.jetbrains.annotations.Nullable()
        android.app.Dialog p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.iqonic.store.network.RestApiImpl getRestApiImpl() {
            return null;
        }
        
        public final void setRestApiImpl(@org.jetbrains.annotations.Nullable()
        com.iqonic.store.network.RestApiImpl p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLanguage() {
            return null;
        }
        
        public final void setLanguage(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getAppTheme() {
            return 0;
        }
        
        public final void setAppTheme(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.store.ProShopApp getAppInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.store.models.DashBoardResponse getMAppData() {
            return null;
        }
        
        public final void setMAppData(@org.jetbrains.annotations.NotNull()
        com.iqonic.store.models.DashBoardResponse p0) {
        }
        
        public final boolean getMModeFlag() {
            return false;
        }
        
        public final void setMModeFlag(boolean p0) {
        }
        
        public final void changeAppTheme(boolean isDark) {
        }
        
        public final void changeLanguage(@org.jetbrains.annotations.NotNull()
        java.lang.String aLanguage) {
        }
        
        @android.annotation.SuppressLint(value = {"ResourceType"})
        public final void mAppDataChanges() {
        }
        
        private Companion() {
            super();
        }
    }
}