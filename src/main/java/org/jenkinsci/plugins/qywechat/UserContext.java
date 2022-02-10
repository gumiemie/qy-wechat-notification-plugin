package org.jenkinsci.plugins.qywechat;

import hudson.model.Cause;

/**
 * @author guyang <guyang@ebnew.com>
 * @description
 * @date 2022-02-09
 */
public class UserContext {
    private static ThreadLocal<Cause.UserIdCause> local = new ThreadLocal<>();

    public static Cause.UserIdCause get() {
        return local.get();
    }

    public static void set(Cause.UserIdCause userIdCause) {
        local.set(userIdCause);
    }
}
