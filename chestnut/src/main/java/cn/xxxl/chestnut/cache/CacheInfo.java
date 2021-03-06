package cn.xxxl.chestnut.cache;

import com.alibaba.fastjson.JSON;

/**
 * @author Leon
 * @since 1.0.0
 */
public class CacheInfo {

    private String id;
    private long localExpire;
    private boolean isSafe;
    private CacheMode mode;

    public CacheInfo() {
    }

    public CacheInfo(String id, long localExpire, boolean isSafe, CacheMode mode) {
        this.id = id;
        this.localExpire = localExpire;
        this.isSafe = isSafe;
        this.mode = mode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    long getLocalExpire() {
        return localExpire;
    }

    void setLocalExpire(long localExpire) {
        this.localExpire = localExpire;
    }

    public boolean isSafe() {
        return isSafe;
    }

    public void setSafe(boolean safe) {
        isSafe = safe;
    }

    public CacheMode getMode() {
        return mode;
    }

    public void setMode(CacheMode mode) {

        this.mode = mode;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
