package com.hummerrisk.base.domain;

import java.io.Serializable;

public class ImageResultWithBLOBs extends ImageResult implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_result.return_log
     *
     * @mbg.generated Wed Sep 07 04:47:21 CST 2022
     */
    private String returnLog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_result.trivy_json
     *
     * @mbg.generated Wed Sep 07 04:47:21 CST 2022
     */
    private String trivyJson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table image_result
     *
     * @mbg.generated Wed Sep 07 04:47:21 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_result.return_log
     *
     * @return the value of image_result.return_log
     *
     * @mbg.generated Wed Sep 07 04:47:21 CST 2022
     */
    public String getReturnLog() {
        return returnLog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_result.return_log
     *
     * @param returnLog the value for image_result.return_log
     *
     * @mbg.generated Wed Sep 07 04:47:21 CST 2022
     */
    public void setReturnLog(String returnLog) {
        this.returnLog = returnLog == null ? null : returnLog.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_result.trivy_json
     *
     * @return the value of image_result.trivy_json
     *
     * @mbg.generated Wed Sep 07 04:47:21 CST 2022
     */
    public String getTrivyJson() {
        return trivyJson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_result.trivy_json
     *
     * @param trivyJson the value for image_result.trivy_json
     *
     * @mbg.generated Wed Sep 07 04:47:21 CST 2022
     */
    public void setTrivyJson(String trivyJson) {
        this.trivyJson = trivyJson == null ? null : trivyJson.trim();
    }
}