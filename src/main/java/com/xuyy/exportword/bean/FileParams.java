package com.xuyy.exportword.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建doc文件使的文件夹参数
 *
 * @author 14258
 */
public class FileParams {


    public static String FormatName = "doc_" + new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()) + ".doc";

    /**
     * 源文件夹名字
     */
    private String sourceFilePath;

    /**
     * 源模板文件名字
     */
    private String sourceTemplateName;

    /**
     * 输出文件夹名字
     */
    private String outFilePath;

    /**
     * 生成文件名字
     */
    private String outTemplateName;


    public FileParams() {
    }

    public FileParams(String sourceFilePath, String sourceTemplateName, String outFilePath, String outTemplateName) {
        this.sourceFilePath = sourceFilePath;
        this.sourceTemplateName = sourceTemplateName;
        this.outFilePath = outFilePath;
        this.outTemplateName = outTemplateName;
    }

    public String getSourceFilePath() {
        return sourceFilePath;
    }

    public void setSourceFilePath(String sourceFilePath) {
        this.sourceFilePath = sourceFilePath;
    }

    public String getSourceTemplateName() {
        return sourceTemplateName;
    }

    public void setSourceTemplateName(String sourceTemplateName) {
        this.sourceTemplateName = sourceTemplateName;
    }

    public String getOutFilePath() {
        return outFilePath;
    }

    public void setOutFilePath(String outFilePath) {
        this.outFilePath = outFilePath;
    }

    public String getOutTemplateName() {
        return outTemplateName;
    }

    public void setOutTemplateName(String outTemplateName) {
        this.outTemplateName = outTemplateName;
    }
}
