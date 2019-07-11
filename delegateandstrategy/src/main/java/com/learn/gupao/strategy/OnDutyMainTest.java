package com.learn.gupao.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class OnDutyMainTest {
    public static void main(String[] args) throws Exception {

        System.out.println("#############  请选择今天的天气  ########################");
        System.out.println("##               1 , sunny                             ##");
        System.out.println("##               2 , rainy                             ##");
        System.out.println("##               3 , windy                             ##");
        System.out.println("##               4 , calm                              ##");
        System.out.println("#############  输入天气序号即可  ########################");
        Map<Integer,Weather> weatherMap = new HashMap<>();
        weatherMap.put(1,Weather.SUNNY);
        weatherMap.put(2,Weather.RAINY);
        weatherMap.put(3,Weather.WINDY);
        weatherMap.put(4,Weather.CALM);
        boolean isContinue = true;
        String keyInStr = null;
        Weather todayWeather = null;
        IOnDuty onDuty = new OnDuty();
        while(isContinue){
             keyInStr = new Scanner(System.in).next();
             if( "exit".equals(keyInStr)){
                 isContinue = false;
                 System.out.println("**************  已退出 ***************");
                 break;
             }else if(isSelect(keyInStr)){
                 todayWeather = weatherMap.get(Integer.valueOf(keyInStr));
                 System.out.println("------- 今天的天气是【 "+todayWeather.getWeather()+" 】---------------");
                 onDuty.selectVehicle(todayWeather).goToWork();
             }else{
                 System.out.println("************   选项不存在   ***************");
             }
        }
    }

    public static boolean isSelect(String keyInStr){
        Pattern pattern = compile("[1-4]{1}");
       return pattern.matcher(keyInStr).matches();
    }
}
