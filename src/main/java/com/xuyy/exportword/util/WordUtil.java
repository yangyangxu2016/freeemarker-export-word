package com.xuyy.exportword.util;


import com.xuyy.exportword.bean.FileParams;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.Map;

/**
 * 生成word 工具类
 *
 * @author 14258
 */
public class WordUtil {
    private Configuration configuration = null;

    public WordUtil() {
        configuration = new Configuration();
        configuration.setDefaultEncoding("utf-8");

    }


    /**
     * @param templetName  模板名称
     * @param filePathName 生成文件的路径和名称
     * @param dataMap      数据
     */
    public void createWord(String templetName, String filePathName, Map<String, Object> dataMap) {

        //设置模板装置方法和路径，FreeMarker支持多种模板装载方法。可以重servlet，classpath,数据库装载。
        //加载模板文件，放在/doc下
        configuration.setClassForTemplateLoading(this.getClass(), "/doc"); // FTL文件所存在的位置
        Template template;
        Writer out = null;

        try {


            // 生成文件的路径和名称
            File outFile = new File(filePathName);
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"));

            //定义Template对象，注意模板类型名字与templetName要一致
            template = configuration.getTemplate(templetName);
            template.process(dataMap, out);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param fileParams 输入输出文件夹和文件名
     * @param dataMap    填充word占位符数据
     */
    public void createWord(FileParams fileParams, Map<String, Object> dataMap) {

        //设置模板装置方法和路径，FreeMarker支持多种模板装载方法。可以重servlet，classpath,数据库装载。
        //加载模板文件，放在/doc下
        configuration.setClassForTemplateLoading(this.getClass(), fileParams.getSourceFilePath()); // FTL文件所存在的位置，必须写明路径

        Template template;
        Writer out = null;


        try {

            // 生成文件的路径和名称
            File outFile = new File(fileParams.getOutFilePath() + File.separator + fileParams.getOutTemplateName());
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"));

            //定义Template对象，注意模板类型名字与templetName要一致
            template = configuration.getTemplate(fileParams.getSourceTemplateName());
            template.process(dataMap, out);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public String saveFile() {
        String nowpath = System.getProperty("user.dir");
        String path = nowpath.replace("bin", "webapps");
        path += "\\" + "TestWeb" + "\\" + "word";
        File tmp = new File(path);
        if (!tmp.exists()) {
            tmp.mkdirs();
        }
        return path;
    }
}
