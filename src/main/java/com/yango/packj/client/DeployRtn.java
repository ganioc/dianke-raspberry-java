package com.yango.packj.client;

public class DeployRtn {
    public Utils.ErrCode errCode;
    public   String contractAddress;

    public DeployRtn(Utils.ErrCode inCode, String address) {
        this.errCode = (inCode == null)? Utils.ErrCode.FAIL:inCode;
        this.contractAddress = (address == null)?"":address;
    }
    public  String toString(){
        return String.valueOf(this.errCode) + " "
                + this.contractAddress;
    }
}
