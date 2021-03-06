package com.yeahmobi.yscheduler.common;

import java.util.TimeZone;
import java.util.regex.Pattern;

public class Constants {

    public static final String   LOG_FILE_ENCODE                 = "UTF-8";

    public static final String   ADMIN_NAME                      = "admin";

    public static final String   AGENT_CONTEXT                   = "yscheduler";

    public static final String   PARAM_JAVA_TASK_HANDLER_TYPE    = "jHandlerType";
    public static final String   JAVA_TASK_HANDLER_SLEEPUNTIL    = "sleepUntil";

    public static final Pattern  USER_NAME_PATTERN               = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_.]{2,29}$");
    public static final Pattern  USER_TELEPHONE_PATTERN          = Pattern.compile("^\\d{3,20}$");
    public static final String   USER_EMAIL_suffix               = "@ndpmedia.com";

    public static final String   FILESERVER_NAMESPACE_ATTEMPTLOG = "attempt-log";

    public static final String   DATE_FORMAT_PATTERN             = "yyyyMMdd HH:mm:ss";

    public static final TimeZone TIMEZONE                        = TimeZone.getTimeZone("GMT+0:00");

    public static final int      PAGE_SIZE                       = 10;

    public static final String   ROOT_NODE                       = "_root_node";

    public static final String   ROOT_NODE_PATTERN               = "_%s_root_node";

    public static final String   UPGRADE_TASK_NAME_PREFIX        = "_upgrade_agent_";

    public static final String   HEARTBEAT_TASK_NAME_PREFIX      = "_heartbeat_";

    public static final Long     MONITOR_USER_ID                 = 2L;

    public static final Long     ADMIN_USER_ID                   = 1L;

}
