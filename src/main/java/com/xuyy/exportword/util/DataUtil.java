package com.xuyy.exportword.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataUtil {


    /**
     * 静态简历朱老师V1.ftl   V1
     *
     * @return
     */
    public Map getTextData1() {
        Map map = new HashMap<String, Object>();

        map.put("NAME", "徐阳阳");
        map.put("SEX", "男");
        map.put("BIRTH", "1991-08");
        map.put("ZZMM", "党员");
        map.put("MZ", "汉");
        map.put("JG", "河南省");
        map.put("JKZK", "良好");
        map.put("SG", "178cm");
        map.put("HYZK", "未婚");
        map.put("XL", "本科");
        map.put("BYYX", "家里蹲大学");
        map.put("ZY", "造卫星工程");
        map.put("ZP", "照片//todo");
        map.put("QZYX", "软件方向工作薪资100w上下");
        map.put("JYSH1", "06-09-01~10-06-20");
        map.put("JYYZ1", "家里蹲大学 家里蹲大学");
        map.put("JYXW1", "学士学位");
        map.put("JYKC1", "软件工程、微积分、软件过程管理、数据库原理等等");

        map.put("JYSH2", "10-07-01~至今");
        map.put("JYYZ2", "家里蹲大学");
        map.put("JYXW2", "家里蹲大学学位");
        map.put("JYKC2", "吃鸡课程");

        map.put("ZYJN", "软件开发、软件管理");

        map.put("GZSH1", "10-07-01~11-12-09");
        map.put("GZDZ1", "华为大亨软件");
        map.put("GZGY1", "顶呱呱软件工程师");

        map.put("GZSH2", "11-12-15~14-4-05");
        map.put("GZDZ2", "北京万绮威");
        map.put("GZGY2", "牛逼哄哄软件工程师");

        map.put("JLQK", "二三等奖学金、富士通奖学金等");
        map.put("ZWPJ", "兴趣丰富、好奇心强、有研究精神。");

        map.put("DH", "0312-3132098");
        map.put("SJ", "15033768387");
        map.put("YJ", "hanmanyifengyi@163.com");
        map.put("DZ", "河南省孔子市");
        map.put("YB", "071000");

        return map;

    }


    /**
     * 动态图模板V2
     *
     * @return
     */
    public Map getTextData2() {
        Map dataMap = new HashMap<String, Object>();
        dataMap.put("lastMonth", "徐阳阳");

        List<Map> userList = new ArrayList();
        Map map1 = new HashMap<String, Object>();

        map1.put("item1", "1");
        map1.put("item2", "2");
        map1.put("item3", "3");
        map1.put("item4", "4");

        Map map2 = new HashMap<String, Object>();


        map2.put("item1", "5");
        map2.put("item2", "6");
        map2.put("item3", "7");
        map2.put("item4", "8");


        userList.add(map1);
        userList.add(map2);

        dataMap.put("userList", userList);


        return dataMap;

    }


    /**
     * 自动大纲模板V2
     *
     * @return
     */
    public Map getTextData3() {
        Map dataMap = new HashMap<String, Object>();
        dataMap.put("lastMonth", "徐阳阳");

        List<Map> userList = new ArrayList();
        Map map1 = new HashMap<String, Object>();

        map1.put("item1", "1");


        Map map2 = new HashMap<String, Object>();


        map2.put("item1", "5");

        Map map3 = new HashMap<String, Object>();


        map3.put("item1", "4");


        userList.add(map1);
        userList.add(map2);
        userList.add(map3);


        dataMap.put("userList", userList);


        return dataMap;

    }


}
