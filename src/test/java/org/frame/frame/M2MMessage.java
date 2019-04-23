/** <a href="http://www.cpupk.com/decompiler">Eclipse Class Decompiler</a> plugin, Copyright (c) 2017 Chen Chao. **/
package org.frame.frame;

import java.io.Serializable;
import org.apache.commons.codec.binary.Base64;


public class M2MMessage implements Serializable {
    private static final long serialVersionUID = 4101808606169812440L;
    private long timestamp;
    private String sn;
    private String issuerSystem;
    private String issuerType;
    private String issuerId;
    private String targetSystem;
    private String targetType;
    private String targetId;
    private String category;
    private String name;
    private String args;

    public M2MMessage() {
        this.timestamp = System.currentTimeMillis();
    }

    public M2MMessage(String issuerId, String targetId, String category,
            String name) {
        this.timestamp = System.currentTimeMillis();
        this.issuerId = issuerId;
        this.targetId = targetId;
        this.category = category;
        this.name = name;
    }

    public M2MMessage(M2MMessage msg) {
        this.timestamp = msg.getTimestamp();
        this.sn = msg.getSn();
        this.issuerId = msg.getIssuerId();
        this.targetId = msg.getTargetId();
        this.category = msg.getCategory();
        this.name = msg.getName();
        this.args = msg.getArgs();
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSn() {
        return this.sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getIssuerSystem() {
        return this.issuerSystem;
    }

    public void setIssuerSystem(String issuerSystem) {
        this.issuerSystem = issuerSystem;
    }

    public String getIssuerId() {
        return this.issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public String getTargetSystem() {
        return this.targetSystem;
    }

    public void setTargetSystem(String targetSystem) {
        this.targetSystem = targetSystem;
    }

    public String getTargetId() {
        return this.targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArgs() {
        return this.args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public void swapIssuerAndTarget() {
        String target = this.issuerId;
        this.issuerId = this.targetId;
        this.targetId = target;
        target = this.issuerSystem;
        this.issuerSystem = this.targetSystem;
        this.targetSystem = target;
    }

    public String getIssuerType() {
        return this.issuerType;
    }

    public void setIssuerType(String issuerType) {
        this.issuerType = issuerType;
    }

    public String getTargetType() {
        return this.targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String toString() {
        String decodeArgs = null;
//        if (!StringUtils.isBlank(this.getArgs())) {
            decodeArgs = new String(Base64.decodeBase64(this.getArgs()));
//        }

        StringBuilder builder = new StringBuilder();
        builder.append(this.getClass().getSimpleName() + " [getTimestamp()=")
                .append(this.getTimestamp()).append(", getSn()=")
                .append(this.getSn()).append(", getIssuerSystem()=")
                .append(this.getIssuerSystem()).append(", getIssuerType()=")
                .append(this.getIssuerType()).append(", getIssuerId()=")
                .append(this.getIssuerId()).append(", getTargetSystem()=")
                .append(this.getTargetSystem()).append(", getTargetType()=")
                .append(this.getTargetType()).append(", getTargetId()=")
                .append(this.getTargetId()).append(", getCategory()=")
                .append(this.getCategory()).append(", getName()=")
                .append(this.getName()).append(", getArgs()=")
                .append(decodeArgs).append("]");
        return builder.toString();
    }

    public static void main(String[] args) {
        M2MMessage msg = new M2MMessage();
        System.out.println(msg.toString());
    }
}