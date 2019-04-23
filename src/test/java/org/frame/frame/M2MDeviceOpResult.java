/** <a href="http://www.cpupk.com/decompiler">Eclipse Class Decompiler</a> plugin, Copyright (c) 2017 Chen Chao. **/
package org.frame.frame;


public class M2MDeviceOpResult extends M2MMessage {
    private static final long serialVersionUID = -2209051652909521136L;
    private String resCode;

    public M2MDeviceOpResult() {
    }

    public M2MDeviceOpResult(M2MMessage msg) {
        super(msg);
    }

    public M2MDeviceOpResult(M2MDeviceOpResult msg) {
        super(msg);
        this.resCode = msg.getResCode();
    }

    public M2MDeviceOpResult(String issuerId, String targetId, String category,
            String name) {
        super(issuerId, targetId, category, name);
    }

    public String getResCode() {
        return this.resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public void buildResCode(int code) {
        this.resCode = String.format("%04d",
                new Object[]{Integer.valueOf(code)});
    }
}