package com.xuyy.exportword.controller;


import com.xuyy.exportword.bean.FileParams;
import com.xuyy.exportword.util.DataUtil;
import com.xuyy.exportword.util.ImageUtil;
import com.xuyy.exportword.util.WordUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
public class ExportDoc {


    /**
     * 静态简历朱老师V1.ftl   V1
     */
    @RequestMapping(value = {"/downloadDocOne"}, produces = "text/html;charset=UTF-8")
    public void downloadDocOne() {

        //设置文件夹输入输出参数
        FileParams fileParams = new FileParams();
        fileParams.setSourceFilePath("/doc");  //源文件夹名字
        fileParams.setSourceTemplateName("静态简历朱老师V1.ftl");  //源模板文件名字
        fileParams.setOutFilePath("out_word_file/"); //输出文件夹名字
        fileParams.setOutTemplateName("doc_" + new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()) + ".doc");   //生成文件名字


        //这一步，进行图片的处理，获取前台传过来的图片base64编码，在利用工具类解析图片保存到本地，然后利用工具类获取图片本地地址
        //String barBase64Info = request.getParameter("barBase64Info");

        //引入处理图片的工具类，包含将base64编码解析为图片并保存本地，获取图片本地路径
        ImageUtil imageUtil = new ImageUtil();
        //读取本地文件路径
        String LocalImgFile = "D:/静态简历朱老师V1.jpg";

        String image = imageUtil.getImageFromLocal(LocalImgFile);


        //建立map存储所要导出到word的各种数据和图像，不能使用自己项目封装的类型，例如PageData
        // 这一步，请求所需要导出到word的数据quotaList，把你们的数据处理放到这里就行了

        DataUtil dataUtil = new DataUtil();
        Map dataMap = dataUtil.getTextData1();
        dataMap.put("image", image);


        //引入导出word的工具类
        WordUtil wordUtil = new WordUtil();
        //创建word文件
        wordUtil.createWord(fileParams, dataMap);


    }


    /**
     * 动态图模板V2
     */
    @RequestMapping(value = {"/downloadDocTwo"}, produces = "text/html;charset=UTF-8")
    public void downloadDocTwo() {

        //设置文件夹输入输出参数
        FileParams fileParams = new FileParams();
        fileParams.setSourceFilePath("/doc");  //源文件夹名字
        fileParams.setSourceTemplateName("动态图模板V2.ftl");  //源模板文件名字
        fileParams.setOutFilePath("out_word_file/"); //输出文件夹名字
        fileParams.setOutTemplateName("doc_" + new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()) + ".doc");   //生成文件名字


        //这一步，进行图片的处理，获取前台传过来的图片base64编码，在利用工具类解析图片保存到本地，然后利用工具类获取图片本地地址
        //String barBase64Info = request.getParameter("barBase64Info");

        //引入处理图片的工具类，包含将base64编码解析为图片并保存本地，获取图片本地路径
        ImageUtil imageUtil = new ImageUtil();
        //读取本地文件路径
        String LocalImgFile = "D:/地铁图.png";

        String image = imageUtil.getImageFromLocal(LocalImgFile);


        //建立map存储所要导出到word的各种数据和图像，不能使用自己项目封装的类型，例如PageData
        // 这一步，请求所需要导出到word的数据quotaList，把你们的数据处理放到这里就行了

        DataUtil dataUtil = new DataUtil();
        Map dataMap = dataUtil.getTextData2();
        dataMap.put("image", image);


        //引入导出word的工具类
        WordUtil wordUtil = new WordUtil();
        //创建word文件
        wordUtil.createWord(fileParams, dataMap);

    }

    /**
     * 动态图模板V2
     */
    @RequestMapping(value = {"/downloadDocThree"}, produces = "text/html;charset=UTF-8")
    public void downloadDocThree() {

        //设置文件夹输入输出参数
        FileParams fileParams = new FileParams();
        fileParams.setSourceFilePath("/doc");  //源文件夹名字
        fileParams.setSourceTemplateName("自动大纲.ftl");  //源模板文件名字
        fileParams.setOutFilePath("out_word_file/"); //输出文件夹名字
        fileParams.setOutTemplateName("doc_" + new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()) + ".doc");   //生成文件名字




        //建立map存储所要导出到word的各种数据和图像，不能使用自己项目封装的类型，例如PageData
        // 这一步，请求所需要导出到word的数据quotaList，把你们的数据处理放到这里就行了

        DataUtil dataUtil = new DataUtil();
        Map dataMap = dataUtil.getTextData3();


        //引入导出word的工具类
        WordUtil wordUtil = new WordUtil();
        //创建word文件
        wordUtil.createWord(fileParams, dataMap);

    }
}
