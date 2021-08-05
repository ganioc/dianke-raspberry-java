package com.yango.packj.client;

import java.util.Date;
import java.util.Random;

public class PackCmd {
    static String privateKey =
            "cdc7cc95755f19aa8168e2b0c3dd89d556be87b60608835549c0aee38d156640";
    static String contractAddress = "0x7c567f388fbe437e5707b3556ec911d0230b9d01";
    public static void in(){
        System.out.println("Car in");
        PosClient posClient = new PosClient(1, privateKey);
        Random r = new Random();

        String rand1 = String.valueOf(r.nextInt(10000));
        String rand2 = String.valueOf(r.nextInt(10000));

        Utils.ErrCode rtn = posClient.InsertPosIn(
                contractAddress,
                "berth_" + rand1,
                new Date().getTime() ,
                0,
                1,
                "沪A00001" +rand2,
                0,
                0,
                1,
                "0xfdsfdffff"
        );
        System.out.println("---------------");
        System.out.println("berthId: " + "berth_" + rand1);
        System.out.println("PIn Return code is: " + rtn);
        posClient.stop();
    }
    public static void checkIn(){
        PosClient posClient = new PosClient(1, privateKey);

        int rtn = posClient.getIndex(contractAddress);

        System.out.println("index is: " + rtn);
        posClient.stop();
    }
    public static void out(){
        System.out.println("Car out");
        PosClient posClient = new PosClient(1, privateKey);
        Random r = new Random();

        String rand1 = String.valueOf(r.nextInt(10000));
        String rand2 = String.valueOf(r.nextInt(1000));

        Utils.ErrCode rtn = posClient.InsertPosOut(
                contractAddress,
                "berth_" + rand1,
                new Date().getTime() ,
                10,
                "0001",
                "0xfdsfdffff" + rand2
        );
        System.out.println("---------------");
        System.out.println("berthId: " + "berth_" + rand1);
        System.out.println("POut Return code is: " + rtn);
        posClient.stop();
    }
    public static void pay(){
        System.out.println("Car pay");
        PosClient posClient = new PosClient(1, privateKey);
        Random r = new Random();

        String rand1 = String.valueOf(r.nextInt(1000));
        String rand2 = String.valueOf(r.nextInt(10));

        Utils.ErrCode rtn = posClient.InsertPosPay(
                contractAddress,
                "2nd_berth_" + rand1,
                10000,
                1,
                2000,
                "aaaaaa" + rand2,
                0,
                10,
                1
        );
        System.out.println("---------------");
        System.out.println("berthId: " + "2nd_berth_" + rand1);
        System.out.println(" PPay Return code is: " + rtn);
        posClient.stop();
    }
}
