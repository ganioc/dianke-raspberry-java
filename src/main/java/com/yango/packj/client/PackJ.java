package com.yango.packj.client;

import com.yango.packj.client.InsertRecord;
import com.yango.packj.client.PosClient;

public class PackJ {
    static String privateKey = "cdc7cc95755f19aa8168e2b0c3dd89d556be87b60608835549c0aee38d156640";
    static String contractAddress = "0x7c567f388fbe437e5707b3556ec911d0230b9d01";

    public static void main(String[] args) {
        System.out.println("Hello pack java.");
        System.out.println("args length: " + args.length);
        for(int i=0; i< args.length; i++){
            System.out.println(args[i]);
        }
        if(args.length<1){
            System.out.println("No arguments.");
            return;
        }
        System.out.println("cmd: " + args[0]);

        if(args[0].equals("in")){
            PackCmd.in();
        }else if(args[0].equals("out")){
            PackCmd.out();
        }else if(args[0].equals("pay")){
            PackCmd.pay();
        }else if(args[0].equals("checkIn")) {
            PackCmd.checkIn();
        }
        else {
            System.out.println("Unrecognized args :" + args[0]);
        }

//        PosClient posClient = new PosClient(1, privateKey);
//
//        int rtn = posClient.getIndex(contractAddress);
//
//        System.out.println("index is: " + rtn);
//
//        posClient.stop();
        System.out.println("-------------End------------");
    }
}
