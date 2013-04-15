package com.dajie.core.zk;

public class Message {

    public static final int NODE_CREATED = 1;

    public static final int NODE_DELETED = 2;

    public static final int NODE_CHILDREN_CHANGED = 3;

    public static final int NODE_DATA_CHANGED = 4;

    /** one message at most can be updated threes times */
    public static final int MAX_UPDATED_COUNT = 3;

    /** refresh all data */
    public static final int NODE_REFRESH = 5;

    private String nodePath;

    private int type;

    private int updatedCount;

    public Message(String nodePath, int type) {
        this.nodePath = nodePath;
        this.type = type;
        updatedCount = 0;
    }

    public String getNodePath() {
        return nodePath;
    }

    public void setNodePath(String nodePath) {
        this.nodePath = nodePath;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void incUpdatedCount() {
        ++updatedCount;
    }

    public int getUpdatedCount() {
        return updatedCount;
    }
}