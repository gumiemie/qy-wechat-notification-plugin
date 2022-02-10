package org.jenkinsci.plugins.qywechat;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.EnvVars;
import hudson.Extension;
import hudson.model.Cause;
import hudson.model.EnvironmentContributor;
import hudson.model.Run;
import hudson.model.TaskListener;

@Extension
public class BuildUserVarsEnvironmentContributor extends EnvironmentContributor {

    @Override
    public void buildEnvironmentFor(
        @NonNull Run r, @NonNull EnvVars envs, @NonNull TaskListener listener) {
        Cause.UserIdCause cause = (Cause.UserIdCause) (r.getCause(Cause.UserIdCause.class));
        UserContext.set(cause);
    }
}
