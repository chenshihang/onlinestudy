package org.wingstudio.Common;

/**
 * Const
 * create by chenshihang on 2018/7/29
 */
public class Const {

    public static final String CURRENT_STU = "current_stu";
    public static final String CURRENT_GUEST = "current_guest";

    public enum StuStatus{
        Normal(0,"正常"),BannedComment(1,"禁言"),Forbidden(-1,"封号")
        ;

        StuStatus(int status, String mean) {
            this.status = status;
            this.mean = mean;
        }

        public int status;
        public String mean;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getMean() {
            return mean;
        }

        public void setMean(String mean) {
            this.mean = mean;
        }
    }
}
