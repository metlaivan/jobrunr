package org.jobrunr.jobs.details.instructions;

import org.jobrunr.jobs.details.JobDetailsFinderContext;

public class AAStoreInstruction extends ZeroOperandInstruction {

    public AAStoreInstruction(JobDetailsFinderContext jobDetailsBuilder) {
        super(jobDetailsBuilder);
    }

    @Override
    public void load() {
        // not needed
    }

    @Override
    public Object invokeInstruction() {
        return null;
    }

    @Override
    public String toDiagnosticsString() {
        return "AASTORE";
    }
}
