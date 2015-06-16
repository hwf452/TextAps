package com.leo.testapns;



import java.text.SimpleDateFormat;
import java.util.Date;

import javapns.back.PushNotificationManager;
import javapns.back.SSLConnectionHelper;
import javapns.data.Device;
import javapns.data.PayLoad;

public class TestAPNS {

    public static void main(String[] args) throws Exception {
    	
    	
    		Date date=new Date();
        	SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        	String str=sdf.format(date);    	
            PayLoad payLoad = new PayLoad();  
            
            //payLoad.addAlert("Hey, this is a test message from harry"+str);    //手机端的提示消息  
            payLoad.addAlert("您用经营宝购买的诺安货币基金已购买成功啦！");
            
            payLoad.addBadge(1);  //图标小红圈的数值  
            payLoad.addSound("default");  //提示声音  
            payLoad.addCustomDictionary("msgId", "a9146191 b02ba6e4 c9895db9 655175ea a5f73346 4700b582 e903dc88 f07bf19b 20150119002");    //自定义的json属性  
            payLoad.addCustomDictionary("test2", "test2");  
            PushNotificationManager pushManager = PushNotificationManager.getInstance();//照抄就可以了  
            
            //3gs a9146191 b02ba6e4 c9895db9 655175ea a5f73346 4700b582 e903dc88 f07bf19b
            //4s 87a1558c 7a563297 dc5f2f33 298d2011 f5314f91 4bf25e50 3212872b 22f7b7e4
            String deviceToken = "96413a89 c7e0f7ab 526f7ce0 81775fa6 61e903c5 f30a8976 a5860a00 c66dca2b";
            pushManager.addDevice("iPhone", deviceToken);  //iphone手机端的唯一标识  
            String host= "gateway.sandbox.push.apple.com";   //照抄就可以了  
            int port = 2195;//照抄就可以了  
            String certificatePath= "libs/aps_developer_identity.p12";     //这里是一个.p12格式的文件路径，需要去apple官网申请一个  
            String certificatePassword= "452131ww";  //这个.p12文件的密码  
            pushManager.initializeConnection(host,port, certificatePath,certificatePassword,  SSLConnectionHelper.KEYSTORE_TYPE_PKCS12);   //以下都照抄吧  
            Device client = pushManager.getDevice("iPhone");
            
            int age=pushManager.getRetryAttempts();
            
            pushManager.sendNotification(client, payLoad);  
            pushManager.stopConnection();  
            pushManager.removeDevice("iPhone");
            
            get();
            
		//493bd5ce 8ac5197d 1a6e332c 500f0ac3 a8f2813e 34e26fab a67ec14c 1824d5f9
    	
    	
    }
    
    private static void get(){
    	
    	try {
    		
    		Date date=new Date();
        	SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        	String str=sdf.format(date);    	
            PayLoad payLoad = new PayLoad();  
            
            //payLoad.addAlert("Hey, this is a test message from harry"+str);    //手机端的提示消息  
            payLoad.addAlert("您用经营宝购买的诺安货币基金已购买成功啦2！");
            
            payLoad.addBadge(1);  //图标小红圈的数值  
            payLoad.addSound("default");  //提示声音  
            payLoad.addCustomDictionary("msgId", "a9146191 b02ba6e4 c9895db9 655175ea a5f73346 4700b582 e903dc88 f07bf19b 20150119002");    //自定义的json属性  
            payLoad.addCustomDictionary("test2", "test2");  
            PushNotificationManager pushManager = PushNotificationManager.getInstance();//照抄就可以了  
            
            //3gs a9146191 b02ba6e4 c9895db9 655175ea a5f73346 4700b582 e903dc88 f07bf19b
            //4s 87a1558c 7a563297 dc5f2f33 298d2011 f5314f91 4bf25e50 3212872b 22f7b7e4
            String deviceToken = "493bd5ce 8ac5197d 1a6e332c 500f0ac3 a8f2813e 34e26fab a67ec14c 1824d5f9";
            //493bd5ce 8ac5197d 1a6e332c 500f0ac3 a8f2813e 34e26fab a67ec14c 1824d5f9
            
            pushManager.addDevice("iPhone", deviceToken);  //iphone手机端的唯一标识  
            String host= "gateway.sandbox.push.apple.com";   //照抄就可以了  
            int port = 2195;//照抄就可以了  
            String certificatePath= "libs/aps_developer_identity.p12";     //这里是一个.p12格式的文件路径，需要去apple官网申请一个  
            String certificatePassword= "452131ww";  //这个.p12文件的密码  
            pushManager.initializeConnection(host,port, certificatePath,certificatePassword,  SSLConnectionHelper.KEYSTORE_TYPE_PKCS12);   //以下都照抄吧  
            Device client = pushManager.getDevice("iPhone");
            
            int age=pushManager.getRetryAttempts();
            
            pushManager.sendNotification(client, payLoad);  
            pushManager.stopConnection();  
            pushManager.removeDevice("iPhone");
            
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	
    }

}
